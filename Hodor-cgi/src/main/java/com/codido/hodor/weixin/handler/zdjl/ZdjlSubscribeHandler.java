package com.codido.hodor.weixin.handler.zdjl;

import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.usr.bean.dto.HandleUserShopRelaRetDto;
import com.codido.hodor.usr.bean.vo.ShopVo;
import com.codido.hodor.usr.bean.vo.UserVo;
import com.codido.hodor.usr.service.UserService;
import com.codido.hodor.weixin.builder.TextBuilder;
import com.codido.hodor.weixin.handler.common.AbstractHandler;
import com.codido.hodor.weixin.util.JsonUtils;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class ZdjlSubscribeHandler extends AbstractHandler {


    @Autowired
    private UserService userService;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService weixinService,
                                    WxSessionManager sessionManager) throws WxErrorException {
        WxMpXmlOutMessage responseResult = null;
        this.logger.info("有用户关注: " + JsonUtils.toJsonString(wxMessage));
        UserVo userVo = null;
        // 获取微信用户基本信息
        WxMpUser userWxInfo = weixinService.getUserService().userInfo(wxMessage.getFromUser(), "");
        if (userWxInfo != null) {
            //获取到用户信息
            this.logger.info("直接通过微信获取到用户信息: " + userWxInfo.toString());
            //添加关注用户
            userVo = userService.saveUserInfoByWeixinUserInfo(userWxInfo, CommonConstans.COMMON_CHANNEL_ZDJL_MP);
        } else {
            //未获取到用户信息，根据openId去新增或更新用户
            userVo = userService.saveUserInfoByOpenId(wxMessage.getFromUser(), CommonConstans.COMMON_CHANNEL_ZDJL_MP);
        }

        //彩通的特殊需求，关注后直接绑定店铺
        String shopInviteCode = "1002";//店铺邀请码写死
        HandleUserShopRelaRetDto handleUserShopRelaDto = userService.handleUserShopRela(userVo.getUserId(), shopInviteCode);
        if (handleUserShopRelaDto.isHandlerResult()) {
            //处理成功
            ShopVo shopVo = handleUserShopRelaDto.getShopVo();
            responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "关注「中大奖了」，如果您想购彩，请点击菜单栏“购彩选号”购买彩票兑换券，前往智能售彩终端机上扫码取票完成投注。", wxMessage, weixinService);
        } else {
            responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "关注「中大奖了」，如果您想购彩，请点击菜单栏“购彩选号”购买彩票兑换券，前往智能售彩终端机上扫码取票完成投注。", wxMessage, weixinService);
        }
        //默认给用户打player的tag
        userService.saveUserTags(Long.valueOf(userVo.getUserId()), CommonConstans.USER_TAG_ID_PLAYER, wxMessage.getFromUser(), CommonConstans.COMMON_CHANNEL_ZDJL_MP);

//        logger.debug("处理带参数的二维码:" + wxMessage.toString());
//        String eventKey = wxMessage.getEventKey();
//        if (!JBUtil.isStrEmpty(eventKey)) {
//            String[] keySplit = eventKey.split("_");
//            String shopInviteCode = keySplit[1];
//            HandleUserShopRelaRetDto handleUserShopRelaDto = userService.handleUserShopRela(userVo.getUserId(), shopInviteCode);
//            if (handleUserShopRelaDto.isHandlerResult()) {
//                //处理成功
//                ShopVo shopVo = handleUserShopRelaDto.getShopVo();
//                responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "关注「中大奖了」，你已经成功绑定彩店：" + shopVo.getShopName() + "，赶快去买买买吧，线下彩店是安全购彩的最大保障：实体网点，真实出票，合法合规，在你身边。", wxMessage, weixinService);
//            } else {
//                responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "关注「中大奖了」，我们是彩民安全购彩的好帮手，是智慧彩站的金牌管家。如果你想购彩，请扫码进店，如果你想彩店入驻，请联系我们。" + handleUserShopRelaDto.getHandlerMsg(), wxMessage, weixinService);
//            }
//            //默认给用户打player的tag
//            userService.saveUserTags(Long.valueOf(userVo.getUserId()), CommonConstans.USER_TAG_ID_PLAYER, wxMessage.getFromUser(),CommonConstans.COMMON_CHANNEL_ZDJL_MP);
//        } else {
//            responseResult = new TextBuilder().build("欢迎" + userVo.getUserName() + "关注「中大奖了」，我们是彩民安全购彩的好帮手，是智慧彩站的金牌管家。如果你想购彩，请扫码进店，如果你想彩店入驻，请联系我们。", wxMessage, weixinService);
//        }
        return responseResult;
    }

}
