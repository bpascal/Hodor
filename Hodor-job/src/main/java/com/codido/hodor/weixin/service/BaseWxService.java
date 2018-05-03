package com.codido.hodor.weixin.service;

import com.codido.hodor.weixin.config.WxConfig;
import com.codido.hodor.weixin.handler.*;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.kefu.result.WxMpKfOnlineList;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.constant.WxMpEventConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static me.chanjar.weixin.common.api.WxConsts.*;

/**
 * @author Binary Wang
 */
public abstract class BaseWxService extends WxMpServiceImpl {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected LogHandler logHandler;


    private WxMpMessageRouter router;

    protected abstract WxConfig getServerConfig();

    @PostConstruct
    public void init() {
        final WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
        config.setAppId(this.getServerConfig().getAppid());// 设置微信公众号的appid
        config.setSecret(this.getServerConfig().getAppsecret());// 设置微信公众号的app corpSecret
        config.setToken(this.getServerConfig().getToken());// 设置微信公众号的token
        config.setAesKey(this.getServerConfig().getAesKey());// 设置消息加解密密钥
        super.setWxMpConfigStorage(config);

        this.refreshRouter();
    }


    /**
     * 路由信息
     */
    private void refreshRouter() {

        final WxMpMessageRouter newRouter = new WxMpMessageRouter(this);

        // 记录所有事件的日志
        newRouter.rule().handler(this.logHandler).next();

        // 接收客服会话管理事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(WxMpEventConstants.CustomerService.KF_CLOSE_SESSION).handler(null).end();
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(WxMpEventConstants.CustomerService.KF_CREATE_SESSION).handler(null).end();
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(WxMpEventConstants.CustomerService.KF_SWITCH_SESSION).handler(null).end();

        // 门店审核事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(WxMpEventConstants.POI_CHECK_NOTIFY).handler(null).end();

        // 自定义菜单事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(MenuButtonType.CLICK).handler(null).end();

        // 点击菜单连接事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(MenuButtonType.VIEW).handler(null).end();

        // 关注事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(EventType.SUBSCRIBE).handler(null).end();

        // 取消关注事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(EventType.UNSUBSCRIBE).handler(null).end();

        // 上报地理位置事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(EventType.LOCATION).handler(null).end();

        // 接收地理位置消息
        newRouter.rule().async(false).msgType(XmlMsgType.LOCATION).handler(null).end();

        // 扫码事件
        newRouter.rule().async(false).msgType(XmlMsgType.EVENT).event(EventType.SCAN).handler(null).end();

        // 默认
        newRouter.rule().async(false).handler(null).end();

        this.router = newRouter;
    }

    /**
     * 路由处理消息
     *
     * @param message
     * @return
     */
    public WxMpXmlOutMessage route(WxMpXmlMessage message) {
        try {
            return this.router.route(message);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }

        return null;
    }

    public boolean hasKefuOnline() {
        try {
            WxMpKfOnlineList kfOnlineList = this.getKefuService().kfOnlineList();
            return kfOnlineList != null && kfOnlineList.getKfOnlineList().size() > 0;
        } catch (Exception e) {
            this.logger.error("获取客服在线状态异常: " + e.getMessage(), e);
        }

        return false;
    }

}
