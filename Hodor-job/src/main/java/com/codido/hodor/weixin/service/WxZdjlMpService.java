package com.codido.hodor.weixin.service;

import com.codido.hodor.weixin.config.WxConfig;
import com.codido.hodor.weixin.config.WxCsdMpConfig;
import com.codido.hodor.weixin.config.WxZdjlMpConfig;
import com.codido.hodor.weixin.handler.LogHandler;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * 彩士多微信消息处理
 *
 * @author laijj
 */
@Service
public class WxZdjlMpService extends BaseWxService {

    @Autowired
    protected LogHandler logHandler;

    @Autowired
    private WxZdjlMpConfig wxConfig;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }


    @Bean
    public WxMpMessageRouter router(WxZdjlMpService wxMpService) {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);

        // 记录所有事件的日志 （异步执行）
        newRouter.rule().handler(this.logHandler).next();

        return newRouter;
    }
}
