package com.codido.hodor.job.weixin.service;

import com.codido.hodor.job.weixin.config.WxConfig;
import com.codido.hodor.job.weixin.handler.LogHandler;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * 微信消息处理
 *
 * @author laijj
 */
@Slf4j
@Service
public class WxMpService extends BaseWxService {

    @Autowired
    protected LogHandler logHandler;

    @Autowired
    private WxConfig wxConfig;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }


    @Bean
    public WxMpMessageRouter router(WxMpService wxMpService) {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);

        // 记录所有事件的日志 （异步执行）
        newRouter.rule().handler(this.logHandler).next();

        return newRouter;
    }
}
