package com.codido.hodor.common.aop;

import com.codido.hodor.common.annotation.NeedShop;
import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.common.exception.LoginException;
import com.codido.hodor.common.exception.NoShopException;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.mapper.ShpShopOPMapper;
import com.codido.hodor.mapper.UsrUserOPMapper;
import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.UsrUser;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户与商户绑定Aspect
 * 如果用户已绑定商户，则通过，否则提示错误直接返回
 */
@Aspect
@Order(5)
@Component
public class UserShopRelaAspect {

    /**
     * 日志工具
     */
    private static final Logger logger = LoggerFactory.getLogger(UserShopRelaAspect.class);

    /**
     * 用户mapper
     */
    @Autowired
    private ShpShopOPMapper shpShopOPMapper;

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
    @Pointcut("@annotation(com.codido.hodor.common.annotation.NeedShop)")
    public void bundleCheck() {

    }

    @Around("bundleCheck()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //做登录校验
        logger.info("做是否绑定店铺的校验");
        Object[] objects = pjp.getArgs();
        if (objects != null) {
            int objectsSize = objects.length;
            for (int i = 0; i < objectsSize; i++) {
                if (objects[i] instanceof BaseReq) {
                    BaseReq req = (BaseReq) objects[i];
                    UsrUser usrUser = req.getUsrUser();
                    if (usrUser != null) {
                        //TODO 商户版处理，商户版用户默认绑定自己的店铺
                        //查询店铺信息
                        List<ShpShop> shopList = shpShopOPMapper.selectBandByUserId(usrUser.getUserId());
                        if(!JBUtil.isListEmpty(shopList)){
                            req.setShpShopList(shopList);
                            return pjp.proceed();
                        }else{
                            logger.info("用户未绑定店铺");
                            throw new NoShopException();
                        }
                    } else {
                        logger.info("登录校验完成，有入参问题，不可登录");
                        throw new LoginException();
                    }
                }
            }
        }
        return pjp.proceed();
    }
}
