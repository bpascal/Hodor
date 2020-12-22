package com.codido.hodor.api.common.aop;


import com.codido.hodor.api.common.util.JsonUtils;
import com.codido.hodor.api.common.util.LogUtil;
import com.codido.hodor.core.common.util.OrderNoGeneratorUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * AOP处理日志
 */
@Aspect
@Order(0)
@Component
public class RequestLogAspect {

    /**
     * 日志工具
     */
    private static final Logger logger = LoggerFactory.getLogger(RequestLogAspect.class);

    /**
     * 定义一个切入点.
     * 解释下：
     * ~ 第一个 * 代表任意修饰符及任意返回值.
     * ~ 第二个 * 任意包名
     * ~ 第三个 * 代表任意方法.
     * ~ 第四个 * 定义在web包或者子包
     * ~ 第五个 * 任意方法
     * ~ .. 匹配任意数量的参数.
     */
    @Pointcut("execution(public * com.codido.hodor.api.*.controller..*.*(..))")
    public void controllerLog() {
    }

    /**
     * 定义一个切入点
     *
     * @param joinPoint
     */
    @Before("controllerLog()") //指定拦截器规则；也可以直接把“execution(* com.codido.........)”写进这里
    public void doBefore(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        //整个请求最前面，把日志给记录一下

        LogUtil.setBizIdWithClear(OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.LOG_PRE_FLAG));

        //开始记录基本日志
        logger.info("请求开始");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("请求URL : " + request.getRequestURL().toString());
        logger.info("请求HTTP_METHOD : " + request.getMethod());
        logger.info("请求IP : " + request.getRemoteAddr());
        logger.info("请求的方法 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        StringBuffer argsStr = new StringBuffer();
        if(joinPoint.getArgs()!=null && joinPoint.getArgs().length>0){
            int argsSize = joinPoint.getArgs().length;
            for(int i=0;i<argsSize;i++){
                argsStr.append(joinPoint.getArgs()[i]==null?"":joinPoint.getArgs()[i].toString());
                if(i<argsSize-1){
                    argsStr.append(",");
                }
            }
        }
        logger.info("请求方法参数 : " + Arrays.toString(joinPoint.getArgs()));
        //获取所有参数方法一：
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String paraName = enu.nextElement();
            logger.info("请求参数:"+paraName + ": " + request.getParameter(paraName));
        }
    }

    @AfterReturning(pointcut = "controllerLog()", returning = "ret")
    public void doAfterReturning(Object ret) {
        // 处理完请求，返回内容

        logger.info("响应内容:" + ((ret==null)?"": JsonUtils.toJsonString(ret)));
        logger.info("响应完成\n\n");
    }
}
