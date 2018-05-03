package com.codido.hodor.weixin.handler.zdjl;

import com.codido.hodor.weixin.handler.common.AbstractHandler;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.MenuButtonType;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class ZdjlMenuHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService weixinService, WxSessionManager sessionManager) {
        String msg = null;
        if ("KEY_CUSTOMER_SERVICE".equals(wxMessage.getEventKey())) {
            msg ="有问题想咨询？您只需要点击屏幕最下方左侧的“小键盘图标”，在对话框中直接输入文字或表情就可以和客服聊天了~";
        }else{
            msg = String.format("type:%s, event:%s, key:%s", wxMessage.getMsgType(), wxMessage.getEvent(), wxMessage.getEventKey());
        }
        if (MenuButtonType.VIEW.equals(wxMessage.getEvent())) {
            return null;
        }

        logger.info("菜单消息:" + wxMessage.toString());
        return WxMpXmlOutMessage.TEXT().content(msg).fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
    }

}
