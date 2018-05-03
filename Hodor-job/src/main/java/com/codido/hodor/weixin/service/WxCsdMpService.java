package com.codido.hodor.weixin.service;

import com.codido.hodor.weixin.config.WxConfig;
import com.codido.hodor.weixin.config.WxCsdMpConfig;
import com.codido.hodor.weixin.handler.*;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.constant.WxMpEventConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * 彩士多微信消息处理
 *
 * @author laijj
 */
@Service
public class WxCsdMpService extends BaseWxService {

    @Autowired
    protected LogHandler logHandler;

    @Autowired
    private WxCsdMpConfig wxConfig;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }


    @Bean
    public WxMpMessageRouter router(WxCsdMpService wxMpService) {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);

        // 记录所有事件的日志 （异步执行）
        newRouter.rule().handler(this.logHandler).next();

        return newRouter;
    }
}
