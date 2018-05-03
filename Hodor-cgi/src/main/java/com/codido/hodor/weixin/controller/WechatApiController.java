package com.codido.hodor.weixin.controller;

import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.usr.bean.vo.UserVo;
import com.codido.hodor.usr.service.UserService;
import com.codido.hodor.weixin.bean.dto.WeixinConfigVo;
import com.codido.hodor.weixin.bean.req.DealUserWxLoginReq;
import com.codido.hodor.weixin.bean.req.QueryWechatJssdkInfoReq;
import com.codido.hodor.weixin.bean.resp.DealUserWxLoginResp;
import com.codido.hodor.weixin.bean.resp.QueryWechatJssdkInfoResp;
import com.codido.hodor.weixin.service.WxCsdMpService;
import com.codido.hodor.weixin.service.WxJbMpService;
import com.codido.hodor.weixin.service.WxZdjlMpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 前端获取微信需要的参数的接口
 */
@RestController
@RequestMapping("/wechat")
@Api(value = "微信参数信息", description = "前端获取微信需要的参数的接口")
public class WechatApiController {

    /**
     * 日志工具
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 彩士多 微信公众号service
     */
    @Autowired
    private WxCsdMpService wxService;

    /**
     * 中大奖了 微信公众号service
     */
    @Autowired
    private WxZdjlMpService wxZdjlMpService;

    /**
     * 机器爸爸微信service
     */
    @Autowired
    private WxJbMpService wxJbMpService;

    /**
     * 用户service
     */
    @Autowired
    private UserService userService;


    @ApiOperation(value = "获取微信jssdk参数", notes = "获取微信jssdk参数")
    @RequestMapping(value = "/queryWechatJssdkInfo", method = RequestMethod.POST)
    public QueryWechatJssdkInfoResp queryWechatJssdkInfo(@RequestBody @ApiParam(value = "获取微信jssdk参数请求对象", required = true) QueryWechatJssdkInfoReq req) {
        QueryWechatJssdkInfoResp resp = new QueryWechatJssdkInfoResp();
        WxJsapiSignature wxJsapiSignature = null;
        String channelFlag = req.getChannelFlag();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多公众号
                wxJsapiSignature = wxService.createJsapiSignature(req.getUrl());
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了公众号
                wxJsapiSignature = wxZdjlMpService.createJsapiSignature(req.getUrl());
            }
        } catch (WxErrorException e) {
            e.printStackTrace();
            logger.error("获取微信js参数失败");
        }
        if (wxJsapiSignature != null) {
            WeixinConfigVo weixinConfigVo = new WeixinConfigVo();
            weixinConfigVo.setAppId(wxJsapiSignature.getAppId());
            weixinConfigVo.setNonceStr(wxJsapiSignature.getNonceStr());
            weixinConfigVo.setTimestamp(wxJsapiSignature.getTimestamp() + "");
            weixinConfigVo.setSignature(wxJsapiSignature.getSignature());
            resp.setWeixinConfigVo(weixinConfigVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_WXJSTICKET_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_WXJSTICKET_ERROR);
        }
        return resp;
    }


    @ApiOperation(value = "获取微信支付jssdk参数", notes = "获取微信支付jssdk参数")
    @RequestMapping(value = "/queryWechatPayJssdkInfo", method = RequestMethod.POST)
    @AreYouLogin
    public QueryWechatJssdkInfoResp queryWechatPayJssdkInfo(@RequestBody @ApiParam(value = "获取微信jssdk参数请求对象", required = true) QueryWechatJssdkInfoReq req) {
        QueryWechatJssdkInfoResp resp = new QueryWechatJssdkInfoResp();
        WxJsapiSignature wxJsapiSignature = null;
        try {
            wxJsapiSignature = wxJbMpService.createJsapiSignature(req.getUrl());
        } catch (WxErrorException e) {
            e.printStackTrace();
            logger.error("获取微信js参数失败");
        }
        if (wxJsapiSignature != null) {
            WeixinConfigVo weixinConfigVo = new WeixinConfigVo();
            weixinConfigVo.setAppId(wxJsapiSignature.getAppId());
            weixinConfigVo.setNonceStr(wxJsapiSignature.getNonceStr());
            weixinConfigVo.setTimestamp(wxJsapiSignature.getTimestamp() + "");
            weixinConfigVo.setSignature(wxJsapiSignature.getSignature());

            resp.setWeixinConfigVo(weixinConfigVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_WXJSTICKET_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_WXJSTICKET_ERROR);
        }
        return resp;
    }

    @ApiOperation(value = "用户微信登录请求", notes = "用户微信登录请求，通过前端调用微信授权页面得到的code，在后端进行处理，拿到用户信息，并且进行登录处理，返回tokenId给前端")
    @RequestMapping(value = "/dealUserWxLogin", method = RequestMethod.POST)
    public DealUserWxLoginResp dealUserWxLogin(@RequestBody @ApiParam(value = "用户微信登录请求对象", required = false) DealUserWxLoginReq req) {
        DealUserWxLoginResp resp = new DealUserWxLoginResp();
        UserVo userVo = null;//返回的用户信息
        String tokenId = null;//返回的tokenId
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = null;
        String channelFlag = req.getChannelFlag();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多公众号
                String appId = wxService.getWxMpConfigStorage().getAppId();
                logger.info("准备申请accessToken，当前的appId参数为:" + appId);
                wxMpOAuth2AccessToken = wxService.oauth2getAccessToken(req.getWxCode());
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了公众号
                String appId = wxZdjlMpService.getWxMpConfigStorage().getAppId();
                logger.info("准备申请accessToken，当前的appId参数为:" + appId);
                wxMpOAuth2AccessToken = wxZdjlMpService.oauth2getAccessToken(req.getWxCode());
            }
        } catch (WxErrorException e) {
            e.printStackTrace();
            logger.error("获取accessToken失败");
        }
        if (wxMpOAuth2AccessToken != null) {
            logger.debug("获取accessToken成功:" + wxMpOAuth2AccessToken.toString());
            //取到了accessToken，这时候有处理，判断openId是否已经在
            String openId = wxMpOAuth2AccessToken.getOpenId();
            userVo = userService.queryUserInfoByOpenId(openId, channelFlag);
            if (userVo == null) {
                //如果通过openId找不到用户信息，则重新调用微信获取用户信息并记录
                WxMpUser wxMpUser = null;
                try {
                    if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                        //彩士多公众号
                        wxMpUser = wxService.oauth2getUserInfo(wxMpOAuth2AccessToken, "zh_CN");
                    } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                        //中大奖了公众号
                        wxMpUser = wxZdjlMpService.oauth2getUserInfo(wxMpOAuth2AccessToken, "zh_CN");
                    }
                } catch (WxErrorException e) {
                    e.printStackTrace();
                    logger.error("oauth2getUserInfo获取用户信息失败");
                }
                if (wxMpUser != null) {
                    //再次调用微信接口获取到了用户信息
                    userVo = userService.saveUserInfoByWeixinUserInfo(wxMpUser, channelFlag);
                    tokenId = userService.handlerUserTokenRefresh(userVo);
                } else {
                    //没取到用户信息，提示失败
                    resp.setRespCode(LottoStoreH5Constans.RESP_CODE_WXLOGIN_ERROR);
                    resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_WXLOGIN_ERROR);
                }
            } else {
                //已经在，则说明是老用户，获取用户信息出来并更新token
                tokenId = userService.handlerUserTokenRefresh(userVo);
            }
        }
        //处理返回信息
        if (userVo != null && !JBUtil.isStrEmpty(tokenId)) {
            resp.setTokenId(tokenId);
            resp.setUserVo(userVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_WXLOGIN_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_WXLOGIN_ERROR);
        }
        return resp;
    }

}
