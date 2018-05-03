package com.codido.hodor.usr.controller;

import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.usr.bean.dto.QueryShopBankCardRetDto;
import com.codido.hodor.usr.bean.dto.ShopIndexAmtRetDto;
import com.codido.hodor.usr.bean.dto.ShopIndexCountRetDto;
import com.codido.hodor.usr.bean.dto.ShopLoginRetDto;
import com.codido.hodor.usr.bean.req.*;
import com.codido.hodor.usr.bean.resp.*;
import com.codido.hodor.usr.bean.vo.*;
import com.codido.hodor.usr.service.ShopService;
import com.codido.hodor.usr.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商户controller
 */
@RestController
@RequestMapping("/shp")
@Api(value = "商户信息", description = "商户信息相关请求")
public class ShopController {

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
     * 店铺service
     */
    @Autowired
    private ShopService shopService;

    @ApiOperation(value = "查询商户账户详情", notes = "根据传入的tokenId查询商户账户详情")
    @RequestMapping(value = "/queryShopAccountDetail", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopAccountDetailResp queryShopAccountDetail(@RequestBody @ApiParam(value = "查询商户账户详情请求对象", required = true) QueryShopAccountDetailReq req) {
        QueryShopAccountDetailResp resp = new QueryShopAccountDetailResp();
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            //商户账户详情
            ShopAccountDetailVo shopAccountDetailVo = shopService.queryShopAccountDetail(Long.valueOf(shopVo.getShopId()));
            resp.setShopAccountDetailVo(shopAccountDetailVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        }
        return resp;
    }

    @ApiOperation(value = "查询商户首页订单和派奖数量", notes = "根据传入的tokenId查询商户首页订单和派奖数量")
    @RequestMapping(value = "/queryShopIndexOrderCount", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopIndexOrderCountResp queryShopIndexOrderCount(@RequestBody @ApiParam(value = "商户首页订单数查询请求对象", required = true) QueryShopIndexOrderCountReq req) {
        QueryShopIndexOrderCountResp resp = new QueryShopIndexOrderCountResp();
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            //订单数量和派奖数量
            ShopIndexCountRetDto shopIndexCountRetDto = shopService.queryShopIndexCount(Long.valueOf(shopVo.getShopId()));
            if (shopIndexCountRetDto.isHandlerResult()) {
                resp.setBonusCount(shopIndexCountRetDto.getBonusCount());
                resp.setOrderCount(shopIndexCountRetDto.getOrderCount());
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            } else {
                resp.setBonusCount("0");
                resp.setOrderCount("0");
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            }

        }
        return resp;
    }


    @ApiOperation(value = "查询商户首页订单和派奖经营数据", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/queryShopIndexOrderAmt", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopIndexOrderAmtResp queryShopIndexOrderAmt(@RequestBody @ApiParam(value = "商户首页经营数据查询请求对象", required = true) QueryShopIndexOrderAmtReq req) {
        QueryShopIndexOrderAmtResp resp = new QueryShopIndexOrderAmtResp();
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            //订单数量和派奖数量
            ShopIndexAmtRetDto shopIndexAmtRetDto = shopService.queryShopIndexAmt(Long.valueOf(shopVo.getShopId()));
            if (shopIndexAmtRetDto.isHandlerResult()) {
                resp.setTodayOrderCount(shopIndexAmtRetDto.getTodayOrderCount());
                resp.setTodayOrderAmt(shopIndexAmtRetDto.getTodayOrderAmt());
                resp.setTodayBonusCount(shopIndexAmtRetDto.getTodayBonusCount());
                resp.setTodayBonusAmt(shopIndexAmtRetDto.getTodayBonusAmt());
                resp.setThisWeekOrderCount(shopIndexAmtRetDto.getThisWeekOrderCount());
                resp.setThisWeekOrderAmt(shopIndexAmtRetDto.getThisWeekOrderAmt());
                resp.setThisWeekBonusCount(shopIndexAmtRetDto.getThisWeekBonusCount());
                resp.setThisWeekBonusAmt(shopIndexAmtRetDto.getThisWeekBonusAmt());
                resp.setThisMonthOrderCount(shopIndexAmtRetDto.getThisMonthOrderCount());
                resp.setThisMonthOrderAmt(shopIndexAmtRetDto.getThisMonthOrderAmt());
                resp.setThisMonthBonusCount(shopIndexAmtRetDto.getThisMonthBonusCount());
                resp.setThisMonthBonusAmt(shopIndexAmtRetDto.getThisMonthBonusAmt());
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            } else {
                resp.setTodayOrderCount("0");
                resp.setTodayOrderAmt("0");
                resp.setTodayBonusCount("0");
                resp.setTodayBonusAmt("0");
                resp.setThisWeekOrderCount("0");
                resp.setThisWeekOrderAmt("0");
                resp.setThisWeekBonusCount("0");
                resp.setThisWeekBonusAmt("0");
                resp.setThisMonthOrderCount("0");
                resp.setThisWeekOrderAmt("0");
                resp.setThisMonthBonusCount("0");
                resp.setThisMonthBonusAmt("0");
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            }

        }
        return resp;
    }

    @ApiOperation(value = "店铺联系方式查询", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/queryShopContact", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopContactResp queryShopContact(@RequestBody @ApiParam(value = "店铺联系方式查询请求对象", required = true) QueryShopContactReq req) {
        QueryShopContactResp resp = new QueryShopContactResp();
        //先查询用户信息
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            resp.setShopVo(shopVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        }
        return resp;
    }

    @ApiOperation(value = "店铺可售彩种列表查询", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/queryLottoInstList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryLottoInstListResp queryLottoInstList(@RequestBody @ApiParam(value = "店铺可售彩种列表请求对象", required = true) QueryLottoInstListReq req) {
        QueryLottoInstListResp resp = new QueryLottoInstListResp();
        List<ShopLottoVo> shopLottoVoList = shopService.getLottoInstListByUserId(req.getUsrUser().getUserId());
        resp.setShopLottoVoList(shopLottoVoList);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    @ApiOperation(value = "店铺彩种销售情况修改", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/submitShopLottoSts", method = RequestMethod.POST)
    @AreYouLogin
    public SubmitShopLottoStsResp submitShopLottoSts(@RequestBody @ApiParam(value = "店铺彩种销售情况修改请求对象", required = true) SubmitShopLottoStsReq req) {
        SubmitShopLottoStsResp resp = new SubmitShopLottoStsResp();
        ShopLottoVo shopLottoVo = new ShopLottoVo();
        shopLottoVo.setLottoSts(req.getLottoSts());
        shopLottoVo.setLottoId(req.getLottoId());
        BaseRetDto retDto = shopService.saveShopLottoSts(req.getUsrUser().getUserId(), shopLottoVo);
        resp.setRespMsg(retDto.getHandlerMsg());
        resp.setRespCode(retDto.isHandlerResult() ? LottoStoreH5Constans.RESP_CODE_SUCCESS : LottoStoreH5Constans.RESP_CODE_UPDATE_SHOP_LOTTO_ERROR);
        return resp;
    }


    @ApiOperation(value = "营业状态查询", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/queryShopOpenSts", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopOpenStsResp queryShopOpenSts(@RequestBody @ApiParam(value = "营业状态查询求对象", required = true) QueryShopOpenStsReq req) {
        QueryShopOpenStsResp resp = new QueryShopOpenStsResp();
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        resp.setShopVo(shopVo);
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        }
        return resp;
    }

    @ApiOperation(value = "营业状态修改", notes = "根据传入的tokenId查询商户首页订单和派奖经营数据")
    @RequestMapping(value = "/submitShopOpenSts", method = RequestMethod.POST)
    @AreYouLogin
    public SubmitShopOpenStsResp submitShopOpenSts(@RequestBody @ApiParam(value = "营业状态修改请求对象", required = true) SubmitShopOpenStsReq req) {
        SubmitShopOpenStsResp resp = new SubmitShopOpenStsResp();
        ShopVo shopVo = new ShopVo();
        shopVo.setShopTradSts(req.getShopSts());

        BaseRetDto retDto = shopService.saveShopSts(req.getUsrUser().getUserId(), shopVo);
        resp.setRespMsg(retDto.getHandlerMsg());
        resp.setRespCode(retDto.isHandlerResult() ? LottoStoreH5Constans.RESP_CODE_SUCCESS : LottoStoreH5Constans.RESP_CODE_UPDATE_SHOP_LOTTO_ERROR);
        return resp;
    }

    @ApiOperation(value = "店铺审核状态查询", notes = "根据传入的tokenId查询商户的审核情况")
    @RequestMapping(value = "/queryShopCheckSts", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopCheckStsResp queryShopCheckSts(@RequestBody @ApiParam(value = "商户审核情况请求对象", required = true) QueryShopCheckStsReq req) {
        QueryShopCheckStsResp resp = new QueryShopCheckStsResp();
        //审核情况
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        resp.setShopVo(shopVo);
        if (shopVo == null) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        } else {
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        }
        return resp;
    }


    @ApiOperation(value = "查询商户绑定的银行卡信息", notes = "查询商户绑定的银行卡信息")
    @RequestMapping(value = "/queryShopBankCard", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopBankCardResp queryShopBankCard(@RequestBody @ApiParam(value = "查询商户绑定的银行卡信息请求对象", required = true) QueryShopBankCardReq req) {
        QueryShopBankCardResp resp = new QueryShopBankCardResp();
        QueryShopBankCardRetDto retDto = shopService.queryShopBankCard(req.getUsrUser().getUserId());
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


    @ApiOperation(value = "店铺登录", notes = "店铺登录请求")
    @RequestMapping(value = "/shopLogin", method = RequestMethod.POST)
    public ShopLoginResp shopLogin(@RequestBody @ApiParam(value = "店铺登录请求对象", required = true) ShopLoginReq req) {
        ShopLoginResp resp = new ShopLoginResp();
        //审核情况
        ShopLoginRetDto shopLoginRetDto = shopService.shopLoginProcess(req.getMblNo(), req.getPasswords());
        if (shopLoginRetDto.isHandlerResult()) {
            resp.setTokenId(shopLoginRetDto.getTokenId());
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SHOPLOGIN_ERROR);
            resp.setRespMsg(shopLoginRetDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "店铺通过短信验证码登录", notes = "店铺通过短信验证码登录")
    @RequestMapping(value = "/shopSmsLogin", method = RequestMethod.POST)
    public ShopLoginResp shopSmsLogin(@RequestBody @ApiParam(value = "店铺登录请求对象", required = true) ShopLoginWithSmsCodeReq req) {
        ShopLoginResp resp = new ShopLoginResp();
        //审核情况
        ShopLoginRetDto shopLoginRetDto = shopService.shopLoginWithSmsCodeProcess(req.getMblNo(), req.getSmsCode());
        if (shopLoginRetDto.isHandlerResult()) {
            resp.setTokenId(shopLoginRetDto.getTokenId());
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SHOPLOGIN_ERROR);
            resp.setRespMsg(shopLoginRetDto.getHandlerMsg());
        }
        return resp;
    }


}
