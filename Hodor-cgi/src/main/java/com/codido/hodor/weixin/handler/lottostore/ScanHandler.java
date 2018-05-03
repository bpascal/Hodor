package com.codido.hodor.weixin.handler.lottostore;

import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.usr.bean.dto.HandleUserShopRelaRetDto;
import com.codido.hodor.usr.bean.vo.ShopVo;
import com.codido.hodor.usr.bean.vo.UserVo;
import com.codido.hodor.usr.service.UserService;
import com.codido.hodor.weixin.builder.TextBuilder;
import com.codido.hodor.weixin.handler.common.AbstractHandler;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 扫描二维码的处理
 */
@Component
public class ScanHandler extends AbstractHandler {

    @Autowired
    private UserService userService;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {
        logger.debug("扫描事件获取:" + wxMessage.toString());
        WxMpXmlOutMessage responseResult = null;
        String openId = wxMessage.getFromUser();
        UserVo userVo = userService.queryUserInfoByOpenId(openId, CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP);//获取用户信息
        if (userVo != null) {
            String shopInviteCode = wxMessage.getEventKey();
            if (!JBUtil.isStrEmpty(shopInviteCode)) {
                HandleUserShopRelaRetDto handleUserShopRelaDto = userService.handleUserShopRela(userVo.getUserId(), shopInviteCode);
                if (handleUserShopRelaDto.isHandlerResult()) {
                    //处理成功
                    ShopVo shopVo = handleUserShopRelaDto.getShopVo();
                    responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "使用「彩士多」，你已经成功绑定彩店：" + shopVo.getShopName() + "，赶快去买买买吧，线下彩店是安全购彩的最大保障：实体网点，真实出票，合法合规，在你身边。", wxMessage, wxMpService);
                } else {
                    responseResult = new TextBuilder().build(handleUserShopRelaDto.getHandlerMsg(), wxMessage, wxMpService);
                }
                //默认给用户打player的tag
                userService.saveUserTags(Long.valueOf(userVo.getUserId()), CommonConstans.USER_TAG_ID_PLAYER, openId, CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP);
            } else {
                responseResult = new TextBuilder().build("看起来，你来到了一个新的星球", wxMessage, wxMpService);
            }
        } else {
            responseResult = null;
        }
        return responseResult;
    }
}
