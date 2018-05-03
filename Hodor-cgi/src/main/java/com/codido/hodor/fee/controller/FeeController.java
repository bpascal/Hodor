package com.codido.hodor.fee.controller;


import com.github.binarywang.wxpay.config.WxPayConfig;
import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.annotation.NeedShop;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.fee.bean.dto.HandlerPayOrderParamDto;
import com.codido.hodor.fee.bean.dto.HandlerPayOrderRetDto;
import com.codido.hodor.fee.bean.req.*;
import com.codido.hodor.fee.bean.resp.*;
import com.codido.hodor.fee.service.FeeService;
import com.codido.hodor.ord.bean.vo.AccountFlowVo;
import com.codido.hodor.usr.bean.vo.ShopVo;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/fee")
@Api(value = "费用相关", description = "费用相关相关功能请求")
public class FeeController {


    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(FeeController.class);

    @Autowired
    private WxPayConfig payConfig;

    /**
     * 费用service
     */
    @Autowired
    private FeeService feeService;

    /**
     * 用户service
     */
    @Autowired
    private UserService userService;

    /**
     * 商户service
     */
    @Autowired
    private ShopService shopService;

    @ApiOperation(value = "查询用户账户明细列表", notes = "根据传入的tokenId，查询用户的账户流水明细列表")
    @RequestMapping(value = "/queryPlayerAccountFlowList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryPlayerAccountFlowListResp queryPlayerAccountFlowList(@RequestBody @ApiParam(value = "查询用户账户流水请求对象", required = true) QueryPlayerAccountFlowListReq req) {
        QueryPlayerAccountFlowListResp resp = new QueryPlayerAccountFlowListResp();
        List<AccountFlowVo> accountFlowVoList = userService.queryUserAccountFlow(req.getUsrUser().getUserId(), Long.valueOf(req.getPageNo()), Long.valueOf(req.getPrePageCount()));
        resp.setAccountFlowVoList(accountFlowVoList);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "查询商户账户明细列表", notes = "根据传入的tokenId，查询商户的账户流水明细列表")
    @RequestMapping(value = "/queryShopAccountFlowList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopAccountFlowListResp queryShopAccountFlowList(@RequestBody @ApiParam(value = "查询商户账户流水请求对象", required = true) QueryShopAccountFlowListReq req) {
        QueryShopAccountFlowListResp resp = new QueryShopAccountFlowListResp();
        ShopVo shopVo = shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        if (shopVo != null) {
            List<AccountFlowVo> accountFlowVoList = shopService.queryShopAccountFlow(Long.valueOf(shopVo.getShopId()), Long.valueOf(req.getPageNo()), Long.valueOf(req.getPrePageCount()));
            resp.setAccountFlowVoList(accountFlowVoList);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_USERNOSHOP_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_USERNOSHOP_ERROR);
        }
        return resp;
    }

    @ApiOperation(value = "用户提现申请", notes = "根据传入的tokenId和金额进行取现申请")
    @RequestMapping(value = "/userWithdraw", method = RequestMethod.POST)
    @AreYouLogin
    public UserWithdrawResp userWithdraw(@RequestBody @ApiParam(value = "用户提现申请请求对象", required = true) UserWithdrawReq req) {
        UserWithdrawResp resp = new UserWithdrawResp();
        BaseRetDto baseRetDto = feeService.saveUserWithdrawOrder(req.getUsrUser().getUserId(), req.getWithdrawAmt(),req.getUserBankCardId());
        if (baseRetDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SAVE_WITHDRAWORDER_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SAVE_WITHDRAWORDER_ERROR);
        }
        return resp;
    }


    @ApiOperation(value = "商户提现申请", notes = "根据传入的tokenId和金额进行取现申请")
    @RequestMapping(value = "/shopWithdraw", method = RequestMethod.POST)
    @AreYouLogin
    public ShopWithdrawResp shopWithdraw(@RequestBody @ApiParam(value = "商户提现申请请求对象", required = true) ShopWithdrawReq req) {
        ShopWithdrawResp resp = new ShopWithdrawResp();
        ShopVo shopVo=shopService.getShopByShopOwnerId(req.getUsrUser().getUserId());
        BaseRetDto baseRetDto = feeService.saveShopWithdrawOrder(Long.valueOf(shopVo.getShopId()),req.getUsrUser().getUserId(), req.getWithdrawAmt(),req.getShopBankCardId());
        if (baseRetDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SAVE_WITHDRAWORDER_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SAVE_WITHDRAWORDER_ERROR);
        }
        return resp;
    }

    @ApiOperation(value = "获取订单公众号支付参数", notes = "根据传入的订单号获取微信公众号支付的支付参数，准备在前端发起微信支付申请")
    @RequestMapping(value = "/payOrder", method = RequestMethod.POST)
    @AreYouLogin
    @NeedShop
    public PayOrderResp payOrder(@RequestBody @ApiParam(value = "用户订单支付申请请求对象", required = true) PayOrderReq req) {
        PayOrderResp resp = new PayOrderResp();
        HandlerPayOrderParamDto paramDto = new HandlerPayOrderParamDto();
        paramDto.setOrderNo(req.getOrderNo());
        paramDto.setUserId(req.getUsrUser().getUserId());
        //调用service处理
        HandlerPayOrderRetDto retDto = feeService.handlerPayOrderRetDto(paramDto);
        if (retDto != null && retDto.isHandlerResult()) {
            //处理成功
            resp.setPayOrderConfigVo(retDto.getPayOrderConfigVo());
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_PAYORDER_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }

//    @ApiOperation(value = "获取订单H5支付参数", notes = "根据传入的订单号获取微信H5支付参数，准备在前端发起微信支付申请")
//    @RequestMapping(value = "/payOrderWap", method = RequestMethod.POST)
//    @AreYouLogin
//    @NeedShop
//    public PayOrderResp payOrderWap(@RequestBody @ApiParam(value = "用户订单支付申请请求对象", required = true) PayOrderReq req,HttpServletRequest request) {
//        PayOrderResp resp = new PayOrderResp();
//        HandlerPayOrderParamDto paramDto = new HandlerPayOrderParamDto();
//        paramDto.setOrderNo(req.getOrderNo());
//        paramDto.setUserId(req.getUsrUser().getUserId());
//        //调用service处理
//        HandlerPayOrderRetDto retDto = feeService.handlerWapPayOrderRetDto(paramDto,request);
//        if (retDto != null && retDto.isHandlerResult()) {
//            //处理成功
//            resp.setPayOrderConfigVo(retDto.getPayOrderConfigVo());
//            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
//            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
//        } else {
//            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_PAYORDER_ERROR);
//            resp.setRespMsg(retDto.getHandlerMsg());
//        }
//        return resp;
//    }



    @ApiOperation(value = "获取订单派奖支付参数", notes = "根据传入的订单号获取订单派奖的微信支付参数，准备在前端发起微信支付申请")
    @RequestMapping(value = "/payOrderBonus", method = RequestMethod.POST)
    @AreYouLogin
    public PayOrderResp payOrderBonus(@RequestBody @ApiParam(value = "用户订单支付申请请求对象", required = true) PayOrderReq req) {
        PayOrderResp resp = new PayOrderResp();
        HandlerPayOrderParamDto paramDto = new HandlerPayOrderParamDto();
        paramDto.setOrderNo(req.getOrderNo());
        paramDto.setUserId(req.getUsrUser().getUserId());
        //调用service处理
        HandlerPayOrderRetDto retDto = feeService.handlerPayOrderBonusRetDto(paramDto);
        if (retDto != null && retDto.isHandlerResult()) {
            //处理成功
            resp.setPayOrderConfigVo(retDto.getPayOrderConfigVo());
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_PAYORDER_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }

    /**
     * 微信支付回调
     *
     * @param request
     * @param response
     */
    @ApiOperation(value = "微信支付回调通知", notes = "微信支付结果通知回调")
    @RequestMapping(value = "getJSSDKCallbackData", method = RequestMethod.POST)
    public void getJSSDKCallbackData(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("进入request了方法:" + request.toString() + ",response:" + response.toString());
        feeService.getJSSDKCallbackData(request,response);
    }

    /**
     * 微信支付回调
     *
     * @param request
     * @param response
     */
    @ApiOperation(value = "微信支付临时回调通知", notes = "微信支付结果临时通知回调")
    @RequestMapping(value = "tempJSSDKCallbackData", method = RequestMethod.POST)
    public void tempJSSDKCallbackData(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("进入临时request了方法:" + request.toString() + ",response:" + response.toString());
        feeService.tempJSSDKCallbackData(request,response);
    }


    /**
     * 通过request获取IP
     *
     * @param request
     * @return
     */
    public String getRemoteHost(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
    }

}
