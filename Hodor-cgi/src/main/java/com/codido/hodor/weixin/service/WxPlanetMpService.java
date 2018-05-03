package com.codido.hodor.weixin.service;

import com.codido.hodor.weixin.config.WxConfig;
import com.codido.hodor.weixin.config.WxPlanetMpConfig;
import com.codido.hodor.weixin.config.WxZdjlMpConfig;
import com.codido.hodor.weixin.handler.common.LogHandler;
import com.codido.hodor.weixin.handler.common.NullHandler;
import com.codido.hodor.weixin.handler.zdjl.*;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.constant.WxMpEventConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Planet微信消息处理
 *
 * @author laijj
 */
@Service
public class WxPlanetMpService extends BaseWxService {

    @Autowired
    protected LogHandler logHandler;
    @Autowired
    protected NullHandler nullHandler;
    @Autowired
    protected ZdjlKfSessionHandler kfSessionHandler;
    @Autowired
    protected ZdjlStoreCheckNotifyHandler storeCheckNotifyHandler;
    @Autowired
    private ZdjlLocationHandler locationHandler;
    @Autowired
    private ZdjlMenuHandler menuHandler;
    @Autowired
    private ZdjlMsgHandler msgHandler;
    @Autowired
    private ZdjlUnsubscribeHandler unsubscribeHandler;
    @Autowired
    private ZdjlSubscribeHandler subscribeHandler;
    @Autowired
    private ZdjlScanHandler scanHandler;

    @Autowired
    private WxPlanetMpConfig wxConfig;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }

    @Bean
    public WxMpMessageRouter router(WxPlanetMpService wxMpService) {
        WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);

        // 记录所有事件的日志 （异步执行）
        newRouter.rule().handler(this.logHandler).next();

        // 接收客服会话管理事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxMpEventConstants.CustomerService.KF_CREATE_SESSION)
                .handler(this.kfSessionHandler).end();
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxMpEventConstants.CustomerService.KF_CLOSE_SESSION)
                .handler(this.kfSessionHandler)
                .end();
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxMpEventConstants.CustomerService.KF_SWITCH_SESSION)
                .handler(this.kfSessionHandler).end();

        // 门店审核事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxMpEventConstants.POI_CHECK_NOTIFY)
                .handler(this.storeCheckNotifyHandler).end();

        // 自定义菜单事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.MenuButtonType.CLICK).handler(this.menuHandler).end();

        // 点击菜单连接事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.MenuButtonType.VIEW).handler(this.nullHandler).end();

        // 关注事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.EventType.SUBSCRIBE).handler(this.subscribeHandler)
                .end();

        // 取消关注事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.EventType.UNSUBSCRIBE)
                .handler(this.unsubscribeHandler).end();

        // 上报地理位置事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.EventType.LOCATION).handler(this.locationHandler)
                .end();

        // 接收地理位置消息
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.LOCATION)
                .handler(this.locationHandler).end();

        // 扫码事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxConsts.EventType.SCAN).handler(this.scanHandler).end();

        // 默认
        newRouter.rule().async(false).handler(this.msgHandler).end();

        return newRouter;
    }

    @Override
    public void refreshRouter() {
        this.router = router(this);
    }
}
