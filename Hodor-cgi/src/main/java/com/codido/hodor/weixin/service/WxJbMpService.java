package com.codido.hodor.weixin.service;

import com.codido.hodor.weixin.config.WxConfig;
import com.codido.hodor.weixin.config.WxJbMpConfig;
import com.codido.hodor.weixin.handler.common.AbstractHandler;
import com.codido.hodor.weixin.handler.lottostore.MenuHandler;
import com.codido.hodor.weixin.handler.lottostore.MsgHandler;
import com.codido.hodor.weixin.handler.lottostore.SubscribeHandler;
import com.codido.hodor.weixin.handler.lottostore.UnsubscribeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 机器爸爸的微信信息相关处理，这里仅需要获取微信参数做accesstoken兑换
 *
 * @author laijj
 */
@Service
public class WxJbMpService extends BaseWxService {

    @Autowired
    private WxJbMpConfig wxConfig;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }

    @Override
    public void refreshRouter() {

    }
}
