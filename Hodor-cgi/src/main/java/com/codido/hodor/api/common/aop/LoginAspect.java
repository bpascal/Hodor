package com.codido.hodor.api.common.aop;

import com.codido.hodor.api.common.bean.req.BaseReq;
import com.codido.hodor.api.common.exception.LoginException;
import com.codido.hodor.core.common.constans.CommonConstans;
import com.codido.hodor.core.common.util.JBDateUtil;
import com.codido.hodor.core.common.util.JBUtil;
import com.github.pagehelper.PageHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 登录处理Aspect
 * 根据请求类的tokenId查询用户对象，如果有用户对象，就添加到req里面，没有就返回未登录
 */
@Aspect
@Order(1)
@Component
public class LoginAspect {

    /**
     * 日志工具
     */
    private static final Logger logger = LoggerFactory.getLogger(LoginAspect.class);


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
    @Pointcut("@annotation(com.codido.hodor.api.common.annotation.AreYouLogin)")
    public void loginCheck() {

    }

    @Around("loginCheck()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //做登录校验
        logger.info("做登录校验");
        Object[] objects = pjp.getArgs();
        if (objects != null) {
            int objectsSize = objects.length;
            for (int i = 0; i < objectsSize; i++) {
                if (objects[i] instanceof BaseReq) {
                    BaseReq req = (BaseReq) objects[i];
                    if (!JBUtil.isStrEmpty(req.getTokenId())) {
                        //通过用户的TOKEN编码获取到用户的身份信息
//                        UsrUser usrUser = usrUserOPMapper.selectByTokenCode(req.getTokenId());
//                        if (usrUser != null) {
//                            logger.info("数据库获取了登录参数:" + usrUser.toString());
//                            //判断token是否已经过期
//                            req.setUsrUser(usrUser);
//                            //更新TOKEN有效时间
//                            UsrToken usrToken = new UsrToken();
//                            usrToken.setTokenCode(req.getTokenId());
//                            usrToken.setTokenSts(CommonConstans.COMMON_STS_VALID);
//                            usrToken.setTokenEndTime(JBDateUtil.addDate(30));//在现有基础上增加30天
//                            usrTokenOPMapper.updateByTokenCode(usrToken);
//                            return pjp.proceed();
//                        } else {
//                            logger.info("登录校验完成，未找到合适的token，不可登录\n\n");
//                            throw new LoginException();
//                        }
                    } else {
                        logger.info("登录校验完成，有入参问题，不可登录\n\n");
                        throw new LoginException();
                    }
                }
            }
        }
        return pjp.proceed();
    }
}
