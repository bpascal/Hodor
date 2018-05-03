package com.codido.hodor.weixin.handler.lottostore;

import com.codido.hodor.weixin.handler.common.AbstractHandler;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.MenuButtonType;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class MenuHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService weixinService, WxSessionManager sessionManager) {
        String msg = null;
        if ("KEY_CUSTOMER_SERVICE".equals(wxMessage.getEventKey())) {
            msg = "有问题想咨询？您只需要点击屏幕最下方左侧的“小键盘图标”，在对话框中直接输入文字或表情就可以和客服聊天了~";
            return WxMpXmlOutMessage.TEXT().content(msg).fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
        }else if("KEY_RED_PKG".equals(wxMessage.getEventKey())){
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
            msg = String.format("type:%s, event:%s, key:%s", wxMessage.getMsgType(), wxMessage.getEvent(), wxMessage.getEventKey());
        }
        if (MenuButtonType.VIEW.equals(wxMessage.getEvent())) {
            return null;
        }
        logger.info("菜单消息:" + wxMessage.toString());
        return null;
    }

}
