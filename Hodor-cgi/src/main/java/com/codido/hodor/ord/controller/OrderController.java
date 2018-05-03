package com.codido.hodor.ord.controller;

import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.annotation.NeedShop;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.ord.bean.req.*;
import com.codido.hodor.ord.bean.resp.*;
import com.codido.hodor.ord.bean.vo.OrderVo;
import com.codido.hodor.ord.bean.vo.PubParamVo;
import com.codido.hodor.ord.bean.vo.SaveOrdOrderVo;
import com.codido.hodor.ord.service.OrderService;
import com.codido.hodor.usr.service.UsrMsgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 订单controller
 */
@RestController
@RequestMapping("/ord")
@Api(value = "订单", description = "订单处理相关请求")
public class OrderController {

    /**
     * 日志工具
     */
    private static Logger logger = LoggerFactory.getLogger(LottoController.class);

    /**
     * 订单service
     */
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ApiOperation(value = "提交订单", notes = "根据用户上传的订单对象生成一笔订单")
    @RequestMapping(value = "/submitOrder", method = RequestMethod.POST)
    @NeedShop
    @AreYouLogin
    public SubmitOrderResp submitOrder(@RequestBody @ApiParam(value = "用户提交的彩种信息对象", required = true) SubmitOrderReq req) {
        SaveOrdOrderVo saveOrdOrderVo = orderService.saveOrdOrder(req.getUsrUser().getUserId(), req.getSubmitOrderVo(), req.getChannelFlag());
        OrderVo orderVo = saveOrdOrderVo.getOrderVo();
        SubmitOrderResp resp = new SubmitOrderResp();
        if (saveOrdOrderVo.isHandlerResult()) {
            resp.setOrderVo(orderVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_SAVE_ERROR);
            resp.setRespMsg(saveOrdOrderVo.getHandlerMsg());
        }
        return resp;
    }

    @ApiOperation(value = "查询用户订单列表", notes = "根据用户TOKENID查询订单列表")
    @RequestMapping(value = "/queryUserOrderList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserOrderListResp queryUserOrderList(@RequestBody @ApiParam(value = "查询用户订单列表请求对象", required = true) QueryUserOrderListReq req) {
        QueryUserOrderListResp resp = new QueryUserOrderListResp();
        resp.setOrderVoList(orderService.getOrdOrderList(Long.parseLong(req.getPageNo()), Long.parseLong(req.getPrePageCount()), req.getUsrUser().getUserId()));
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    @ApiOperation(value = "查询用户中奖列表", notes = "根据用户TOKENID查询用户中奖订单列表")
    @RequestMapping(value = "/queryUserBonusOrderList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserBonusListResp queryUserBonusList(@RequestBody @ApiParam(value = "查询用户订单列表请求对象", required = true) QueryUserOrderListReq req) {
        QueryUserBonusListResp resp = new QueryUserBonusListResp();
        resp.setBonusOrderList(orderService.getUserWinOrdOrderList(Long.parseLong(req.getPageNo()), Long.parseLong(req.getPrePageCount()), req.getUsrUser().getUserId()));
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "查询商户订单列表", notes = "根据用户TOKENID查询用户对应的商户的订单列表")
    @RequestMapping(value = "/queryShopOrderList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopOrderListResp queryShopOrderList(@RequestBody @ApiParam(value = "查询用户订单列表请求对象", required = true) QueryShopOrderListReq req) {
        QueryShopOrderListResp resp = new QueryShopOrderListResp();
        resp.setOrderVoList(orderService.queryShopOrderList(Long.parseLong(req.getPageNo()), Long.parseLong(req.getPrePageCount()), req.getUsrUser().getUserId(), req.getOrderSts()));
        if ("P".equals(req.getOrderSts())) {
            resp.setTotalDealCount(orderService.queryShopOrderListCount(req.getUsrUser().getUserId(), req.getOrderSts()) + "");
        }
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    @ApiOperation(value = "查询商户派奖订单列表", notes = "根据用户TOKENID查询用户对应的商户的派奖订单列表")
    @RequestMapping(value = "/queryShopBonusList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryShopBonusListResp queryShopBonusList(@RequestBody @ApiParam(value = "查询用户订单列表请求对象", required = true) QueryShopBonusListReq req) {
        QueryShopBonusListResp resp = new QueryShopBonusListResp();
        resp.setOrderVoList(orderService.queryShopBonusList(req.getBonusSts(), Long.parseLong(req.getPageNo()), Long.parseLong(req.getPrePageCount()), req.getUsrUser().getUserId()));
        if ("B".equals(req.getBonusSts())) {
            resp.setTotalBonusCount(orderService.queryShopBonusListCount(req.getUsrUser().getUserId(), req.getBonusSts()) + "");
        }
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "查询订单详情", notes = "订单号查询订单详情")
    @RequestMapping(value = "/queryOrderDetail", method = RequestMethod.POST)
    @AreYouLogin
    public QueryOrderDetailResp queryOrderDetail(@RequestBody @ApiParam(value = "查询用户订单详情请求对象", required = true) QueryOrderDetailReq req) {
        QueryOrderDetailResp resp = new QueryOrderDetailResp();
        resp.setOrderVo(orderService.queryOrderDetail(req.getUsrUser().getUserId(), req.getOrderNo()));
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "撤销订单", notes = "店主根据订单号撤销订单")
    @RequestMapping(value = "/rejectOrder", method = RequestMethod.POST)
    @AreYouLogin
    public RejectOrderResp rejectOrder(@RequestBody @ApiParam(value = "撤销订单请求对象", required = true) RejectOrderReq req) {
        RejectOrderResp resp = new RejectOrderResp();
        BaseRetDto baseRetDto = orderService.rejectOrder(req.getOrderNo(), req.getUsrUser().getUserId());
        if (baseRetDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_REJECT_ERROR);
            resp.setRespMsg(baseRetDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "确认订单", notes = "店主根据订单号确认订单")
    @RequestMapping(value = "/ensureOrder", method = RequestMethod.POST)
    @AreYouLogin
    public EnsureOrderResp ensureOrder(@RequestBody @ApiParam(value = "确认订单请求对象", required = true) EnsureOrderReq req) {
        EnsureOrderResp resp = new EnsureOrderResp();
        BaseRetDto retDto = orderService.ensureOrder(req.getOrderNo(), req.getUsrUser().getUserId(), req.getImgServerId());
        if (retDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_ENSURE_ERROR);
            resp.setRespMsg(retDto.getHandlerMsg());
        }
        return resp;
    }

    @ApiOperation(value = "取消订单", notes = "彩民根据订单号取消订单")
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    @NeedShop
    @AreYouLogin
    public CancelOrderResp cancelOrder(@RequestBody @ApiParam(value = "取消订单请求对象", required = true) CancelOrderReq req) {
        CancelOrderResp resp = new CancelOrderResp();
        BaseRetDto baseRetDto = orderService.cancelOrder(req.getOrderNo(), req.getUsrUser().getUserId());
        if (baseRetDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_CANCEL_ERROR);
            resp.setRespMsg(baseRetDto.getHandlerMsg());
        }
        return resp;
    }

    @ApiOperation(value = "订单取票", notes = "由店主发起，对订单进行取票操作")
    @RequestMapping(value = "/takeOrderTicket", method = RequestMethod.POST)
    @AreYouLogin
    public TakeOrderTicketResp takeOrderTicket(@RequestBody @ApiParam(value = "订单取票请求对象", required = true) TakeOrderTicketReq req) {
        TakeOrderTicketResp resp = new TakeOrderTicketResp();
        BaseRetDto baseRetDto = orderService.takeOrderTicket(req.getOrderNo(), req.getUsrUser().getUserId());
        if (baseRetDto.isHandlerResult()) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_TAKETICKET_ERROR);
            resp.setRespMsg(baseRetDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "查询公共参数", notes = "查询公共参数")
    @RequestMapping(value = "/queryPubParam", method = RequestMethod.POST)
    public QueryPubParamResp queryPubParam(@RequestBody @ApiParam(value = "查询公共参数请求对象", required = true) @Valid QueryPubParamReq req) {
        QueryPubParamResp resp = new QueryPubParamResp();
        PubParamVo pubParamVo = orderService.queryPubParam(req.getParamKey(), req.getChannelFlag());
        resp.setPubParamVo(pubParamVo);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "通过终端接口发起订单取票", notes = "由终端后台发起，用户在终端机上进行了取票操作后，接口通知过来对订单进行取票操作")
    @RequestMapping(value = "/terminalTakeOrderTicket", method = RequestMethod.POST)
    public TerminalTakeOrderTicketResp terminalTakeOrderTicket(@RequestBody @ApiParam(value = "订单取票请求对象", required = true) TerminalTakeOrderTicketReq req) {
        //TODO Junjie.Lai 参数校验
        TerminalTakeOrderTicketResp resp = new TerminalTakeOrderTicketResp();
        if (req == null || req.getOrderDetail() == null || JBUtil.isStrEmpty(req.getLotteryPeriod()) || JBUtil.isStrEmpty(req.getOperType())) {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_PARAM_ERROR);
            resp.setRespMsg(LottoStoreH5Constans.RESP_CODE_PARAM_ERROR);
            return resp;
        } else {
            if ("1".equals(req.getOperType())) {
                //成功
                BaseRetDto baseRetDto = orderService.terminalTakeOrderTicket(req.getOrderNo(), req.getLotteryPeriod(), req.getOrderDetail().getLotteryId());
                if (baseRetDto.isHandlerResult()) {
                    resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                    resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
                } else {
                    resp.setRespCode(LottoStoreH5Constans.RESP_CODE_ORDER_TAKETICKET_ERROR);
                    resp.setRespMsg(baseRetDto.getHandlerMsg());
                }
            } else {
                resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
                resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
            }
        }
        return resp;
    }

}
