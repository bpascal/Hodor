package com.codido.hodor.weixin.handler.lottostore;

import com.codido.hodor.weixin.builder.TextBuilder;
import com.codido.hodor.weixin.handler.common.AbstractHandler;
import com.codido.hodor.weixin.util.JsonUtils;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class MsgHandler extends AbstractHandler {


    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService weixinService, WxSessionManager sessionManager) {
        String receContent = JsonUtils.toJsonString(wxMessage);
        logger.info("彩士多收到信息内容:" + receContent);
        //        try {
        //有客服在线时，把消息转发给在线客服
//            if (weixinService.getKefuService().kfOnlineList().getKfOnlineList().size() > 0) {
//                return WxMpXmlOutMessage.TRANSFER_CUSTOMER_SERVICE().fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
//            }
//        } catch (WxErrorException e) {
//            e.printStackTrace();
//        }
        if ("红包".equals(wxMessage.getContent())) {
            logger.info("做红包处理");
            WxMpXmlOutNewsMessage.Item newsItem = new WxMpXmlOutNewsMessage.Item();
            newsItem.setPicUrl("http://oo183x84d.bkt.clouddn.com/18-2-8/98140127.jpg");
            newsItem.setDescription("新店免费开通，只需两步就可以拿走88元现金红包！");
            newsItem.setTitle("一起赚钱 | 彩士多新店奖励计划");
            newsItem.setUrl("http://mp.weixin.qq.com/s?__biz=MzUxNDUwNzU5Mw==&mid=100000001&idx=1&sn=0f5f8796bfe48b2588859df29bc4d430&chksm=794597274e321e31a512db4d25dbefe5474497235b403cb6a1baa71ae0fd33a8a75495334492#rd");

            WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().addArticle(newsItem)
                    .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
                    .build();
            return m;
        } else {
            logger.info("做一般处理");
            //做一般处理
            //return new TextBuilder().build("^_^", wxMessage, weixinService);
            return WxMpXmlOutMessage.TRANSFER_CUSTOMER_SERVICE().fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
        }
    }

}
