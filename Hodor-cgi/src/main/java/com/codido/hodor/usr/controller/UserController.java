package com.codido.hodor.usr.controller;

import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.annotation.NeedShop;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.mapper.UsrOpenIdOPMapper;
import com.codido.hodor.model.UsrOpenId;
import com.codido.hodor.ord.service.LottoService;
import com.codido.hodor.usr.bean.dto.HandleUserShopRelaRetDto;
import com.codido.hodor.usr.bean.dto.QueryUserBankCardRetDto;
import com.codido.hodor.usr.bean.req.*;
import com.codido.hodor.usr.bean.resp.*;
import com.codido.hodor.usr.bean.vo.*;
import com.codido.hodor.usr.service.ShopService;
import com.codido.hodor.usr.service.UserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户controller
 */
@RestController
@RequestMapping("/usr")
@Api(value = "用户信息", description = "获取用户信息的相关请求")
public class UserController {

    /**
     * 日志工具
     */
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 用户service
     */
    @Autowired
    private UserService userService;

    /**
     * 店铺服务
     */
    @Autowired
    private ShopService shopService;

    /**
     * 彩种服务
     */
    @Autowired
    private LottoService lottoService;

    /**
     * 用户openID
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;


    @ApiOperation(value = "获取用户首页信息", notes = "上传用户TOKENID，获取用户首页信息")
    @RequestMapping(value = "/queryPlayerIndex", method = RequestMethod.POST)
    @NeedShop
    @AreYouLogin
    public QueryPlayerIndexResp queryPlayerIndex(@RequestBody @ApiParam(value = "获取首页请求对象", required = true) QueryPlayerIndexReq req) {
        QueryPlayerIndexResp resp = new QueryPlayerIndexResp();
        //查询店铺信息
        //ShopVo shopVo = shopService.getShopTopBandByUserId(req.getUsrUser().getUserId());
        ShopVo shopVo = shopService.getShopTopBandByUserId(req.getUsrUser().getUserId());
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        resp.setShopVo(shopVo);
        return resp;
    }


    @ApiOperation(value = "获取用户归属的彩店信息", notes = "上传用户TOKENID，获取用户店铺列表")
    @RequestMapping(value = "/queryPlayerShopList", method = RequestMethod.POST)
    @NeedShop
    @AreYouLogin
    public QueryPlayerShopListResp queryPlayerShopList(@RequestBody @ApiParam(value = "获取用户店铺列表请求对象", required = true) QueryPlayerShopListReq req) {
        long tokenId = Long.valueOf(req.getTokenId());
        //查询用户信息
        UserVo userVo = userService.getUserByToken(tokenId);
        QueryPlayerShopListResp resp = new QueryPlayerShopListResp();
        if (userVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_TOKEN_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_TOKEN_ERROR);
        } else {
            //查询店铺信息
            List<ShopVo> shopVoList = shopService.getShopBandByUserId(Long.valueOf(userVo.getUserId()));
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setShopVoList(shopVoList);
        }
        return resp;
    }


    @ApiOperation(value = "获取用户基本信息", notes = "上传用户TOKENID，获取用户基本信息")
    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserInfoResp queryUserInfo(@RequestBody @ApiParam(value = "获取用户信息请求对象", required = true) QueryUserInfoReq req) {
        //查询用户信息
        UserVo userVo = new UserVo(req.getUsrUser());//userService.getUserByToken(tokenId);
        QueryUserInfoResp resp = new QueryUserInfoResp();
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        resp.setUserVo(userVo);
        return resp;
    }

    @ApiOperation(value = "查询商户账户详情", notes = "根据传入的tokenId查询商户账户详情")
    @RequestMapping(value = "/queryUserAccountDetail", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserAccountDetailResp queryUserAccountDetail(@RequestBody @ApiParam(value = "查询商户账户详情请求对象", required = true) QueryUserAccountDetailReq req) {
        QueryUserAccountDetailResp resp = new QueryUserAccountDetailResp();
        //用户账户详情
        UserAccountDetailVo userAccountDetailVo = userService.queryUserAccountDetail(req.getUsrUser().getUserId());
        resp.setUserAccountDetailVo(userAccountDetailVo);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    @ApiOperation(value = "提交用户实名信息", notes = "提交用户真实姓名身份证号等实名信息")
    @RequestMapping(value = "/submitUserRealName", method = RequestMethod.POST)
    @AreYouLogin
    public SubmitUserRealNameResp submitUserRealName(@RequestBody @ApiParam(value = "提交用户实名信息请求对象", required = true) SubmitUserRealNameReq req) {
        //long tokenId = Long.valueOf(req.getTokenId());
        UserRealNameVo userRealNameVo = new UserRealNameVo();
        userRealNameVo.setUserRealName(req.getUserRealName());
        userRealNameVo.setUserIdCard(req.getUserIdCard());
        userRealNameVo.setUserMblNo(req.getUserMblNo());
        userRealNameVo.setSmsCode(req.getSmsCode());
        SubmitUserRealNameResp resp = new SubmitUserRealNameResp();
        BaseRetDto retDto = userService.saveUserReadNameInfo(req.getUsrUser(), userRealNameVo,req.getChannelFlag());
        resp.setRespMsg(retDto.getHandlerMsg());
        resp.setRespCode(retDto.isHandlerResult() ? LottoStoreH5Constans.RESP_CODE_SUCCESS : LottoStoreH5Constans.RESP_CODE_USERREAL_ERROR);
        return resp;
    }

    @ApiOperation(value = "提交用户提现银行卡信息", notes = "提交用户提现银行卡信息")
    @RequestMapping(value = "/submitUserCard", method = RequestMethod.POST)
    @AreYouLogin
    public SubmitUserCardResp submitUserCard(@RequestBody @ApiParam(value = "提交用户提现银行卡信息请求对象", required = true) SubmitUserCardReq req) {
        SubmitUserCardResp resp = new SubmitUserCardResp();
        BaseRetDto retDto = userService.submitUserCard(req);
        resp.setRespMsg(retDto.getHandlerMsg());
        resp.setRespCode(retDto.isHandlerResult() ? LottoStoreH5Constans.RESP_CODE_SUCCESS : LottoStoreH5Constans.RESP_CODE_USERREAL_ERROR);
        return resp;
    }

    @ApiOperation(value = "获取平台支持的银行信息", notes = "获取平台支持的银行信息")
    @RequestMapping(value = "/queryPlatBankCardList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryPlatBankCardListResp queryPlatBankCardList(@RequestBody @ApiParam(value = "获取平台支持的银行信息请求对象", required = true) QueryPlatBankCardListReq req) {
        QueryPlatBankCardListResp resp = new QueryPlatBankCardListResp();
        resp.setBankVoList(userService.queryPlatBankCardList());
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "查询用户实名信息", notes = "查询用户真实姓名身份证号等实名信息")
    @RequestMapping(value = "/queryUserRealName", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserRealNameResp queryUserRealName(@RequestBody @ApiParam(value = "查询用户实名信息请求对象", required = true) QueryUserRealNameReq req) {
        long tokenId = Long.valueOf(req.getTokenId());
        QueryUserRealNameResp resp = new QueryUserRealNameResp();
        //UserRealNameVo userRealNameVo = userService.getUserReadNameInfoByToken(tokenId);
        UserRealNameVo userRealNameVo = userService.getUserReadNameInfoByToken(req.getUsrUser());
        if (userRealNameVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNORTREAL_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOTREAL_ERROR);
        } else {
            if (JBUtil.isStrEmpty(userRealNameVo.getUserRealName())) {
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNORTREAL_ERROR);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOTREAL_ERROR);
            } else {
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
                resp.setUserRealNameVo(userRealNameVo);
            }
        }
        return resp;
    }


    @ApiOperation(value = "查询用户关注的情况", notes = "查询用户关注的彩种列表情况，要返回目前系统支持的所有彩种，并标记用户关注状态")
    @RequestMapping(value = "/queryUserSubscriberLottoList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserSubscriberLottoListResp queryUserSubscriberLottoList(@RequestBody @ApiParam(value = "查询用户关注彩种情况请求对象", required = true) QueryUserSubscriberLottoListReq req) {
        //long tokenId = Long.valueOf(req.getTokenId());
        QueryUserSubscriberLottoListResp resp = new QueryUserSubscriberLottoListResp();
        List<UserSubscriberLottoVo> userSubscriberLottoVoList = lottoService.getUserSubscriberLottoList(req.getUsrUser().getUserId());

        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        resp.setUserSubscriberLottoVoList(userSubscriberLottoVoList);


        return resp;
    }

    @ApiOperation(value = "用户关注彩种操作", notes = "关注/取消关注都在这个接口实现，通过lottoId和tokenId处理")
    @RequestMapping(value = "/subscriberLotto", method = RequestMethod.POST)
    @AreYouLogin
    public SubscriberLottoResp subscriberLotto(@RequestBody @ApiParam(value = "用户关注彩种操作请求对象", required = true) SubscriberLottoReq req) {
        SubscriberLottoResp resp = new SubscriberLottoResp();
        Long userId = req.getUsrUser().getUserId();
        if ("S".equals(req.getSubscriberType())) {
            lottoService.follow(userId, Long.valueOf(req.getLottoId()));
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            BaseRetDto baseRetDto = lottoService.unfollow(userId, Long.valueOf(req.getLottoId()));
            if (baseRetDto.isHandlerResult()) {
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            } else {
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USELOTTOL_ERROR);
                resp.setRespMsg(baseRetDto.getHandlerMsg());
            }
        }
        return resp;
    }

    @ApiOperation(value = "申请短信验证码", notes = "申请短信验证码请求")
    @RequestMapping(value = "/applySmsCode", method = RequestMethod.POST)
    public ApplySmsCodeResp applySmsCode(@RequestBody @ApiParam(value = "申请短信验证码请求对象", required = true) ApplySmsCodeReq req) {
        ApplySmsCodeResp resp = new ApplySmsCodeResp();
        BaseRetDto retDto = userService.applySmsCode(req.getMblNo(), req.getSmsType(), req.getChannelFlag());
        if (retDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_APPLY_SMSCODE_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }

    @ApiOperation(value = "检查用户是否已经关联了机器爸爸公众号", notes = "检查用户是否已经关联了机器爸爸公众号")
    @RequestMapping(value = "/checkUserOpenId", method = RequestMethod.POST)
    @AreYouLogin
    public CheckUserOpenIdResp checkUserOpenId(@RequestBody @ApiParam(value = "检查用户是否获取到机器爸爸的OPENID的请求对象", required = true) CheckUserOpenIdReq req) {
        CheckUserOpenIdResp resp = new CheckUserOpenIdResp();
        String jqbbOpenId = userService.checkUserOpenId(req.getUsrUser().getUserId(), CommonConstans.WX_APP_TYPE_JQBB);
        resp.setCheckResult(jqbbOpenId != null);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "保存用户在机器爸爸公众号的OPENID", notes = "保存用户在机器爸爸公众号的OPENID")
    @RequestMapping(value = "/saveUserOpenId", method = RequestMethod.POST)
    @AreYouLogin
    public SaveUserOpenIdResp saveUserOpenId(@RequestBody @ApiParam(value = "检查用户是否获取到机器爸爸的OPENID的请求对象", required = true) SaveUserOpenIdReq req) {
        SaveUserOpenIdResp resp = new SaveUserOpenIdResp();
        BaseRetDto retDto = userService.saveUserOpenId(req.getUsrUser().getUserId(), CommonConstans.WX_APP_TYPE_JQBB, req.getOpenId());
        if (retDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SAVEOPENID_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "查询用户绑定的银行卡信息", notes = "查询用户绑定的银行卡信息")
    @RequestMapping(value = "/queryUserBankCard", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserBankCardResp queryUserBankCard(@RequestBody @ApiParam(value = "查询用户绑定的银行卡信息请求对象", required = true) QueryUserBankCardReq req) {
        QueryUserBankCardResp resp = new QueryUserBankCardResp();
        QueryUserBankCardRetDto retDto = userService.queryUserBankCard(req.getUsrUser().getUserId());
        if (retDto.isHandlerResult()) {
            resp.setBankCardVoList(retDto.getBankCardVoList());//银行卡对象，主要参会参数
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_NOBANKCARD_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "绑定用户", notes = "把用户绑定到店铺")
    @RequestMapping(value = "/bindUserShop", method = RequestMethod.POST)
    @AreYouLogin
    public BindUserShopResp bindUserShop(@RequestBody @ApiParam(value = "把用户绑定到店铺请求对象", required = true) BindUserShopReq req) {
        BindUserShopResp resp = new BindUserShopResp();
        HandleUserShopRelaRetDto retDto = userService.handleUserShopRela(req.getUsrUser().getUserId().toString(), req.getIntiveCode());
        if (retDto.isHandlerResult()) {
            resp.setShopVo(retDto.getShopVo());//店铺对象
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_NOBANKCARD_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        //打微信tag
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(req.getUsrUser().getUserId(), LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(req.getUsrUser().getUserId(), req.getUsrUser().getUserSource());
        if (usrOpenId != null) {
            //默认给用户打player的tag
            userService.saveUserTags(req.getUsrUser().getUserId(), CommonConstans.USER_TAG_ID_PLAYER, usrOpenId.getWxOpenId(), req.getUsrUser().getUserSource());
        }
        return resp;
    }

}
