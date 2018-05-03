package com.codido.hodor.fee.service;


import com.github.binarywang.wxpay.bean.order.WxPayMpOrderResult;
import com.github.binarywang.wxpay.bean.request.WxEntPayRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxEntPayResult;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.util.SignUtils;
import com.google.gson.Gson;
import com.codido.hodor.bo.AccountBo;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.config.EvnConfig;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.common.util.OrderNoGeneratorUtil;
import com.codido.hodor.common.util.Sha1Util;
import com.codido.hodor.common.util.XMLUtil;
import com.codido.hodor.fee.bean.dto.HandlerPayOrderParamDto;
import com.codido.hodor.fee.bean.dto.HandlerPayOrderRetDto;
import com.codido.hodor.fee.bean.vo.PayOrderConfigVo;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.bean.dto.SendOrderToTerminalRetDto;
import com.codido.hodor.ord.service.OrderService;
import com.codido.hodor.ord.service.SendMessageService;
import com.codido.hodor.ord.service.TerminalTransportService;
import com.codido.hodor.weixin.config.WxPayConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 费用相关service
 */
@Service
public class FeeService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(FeeService.class);

    @Autowired
    private WxPayConfig payConfig;

    @Autowired
    private WxPayService wxPayService;

    @Autowired
    private WxPayConfiguration wxPayConfiguration;

    /**
     * 用户提现订单mapper
     */
    @Autowired
    private AccWithdrawOrderMapper accWithdrawOrderMapper;

    /**
     * 订单mapper
     */
    @Autowired
    private OrdOrderOPMapper ordOrderOPMapper;

    /**
     * 用户openId的mapper
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;

    /**
     * 用户银行卡mapper
     */
    @Autowired
    private UsrBankCardMapper usrBankCardMapper;

    /**
     * 商户银行卡mapper
     */
    @Autowired
    private ShpBankcardMapper shpBankcardMapper;

    /**
     * 订单service
     */
    @Autowired
    private OrderService orderService;

    /**
     * 账户处理bo
     */
    @Autowired
    private AccountBo accountBo;

    /**
     * 环境参数
     */
    @Autowired
    private EvnConfig evnConfig;

    /**
     * 发送消息service
     */
    @Autowired
    private SendMessageService sendMessageService;

    @Autowired
    private TerminalTransportService transportService;

    /**
     * 彩种实例的mapper
     */
    @Autowired
    private LotInstMapper lotInstMapper;


    /**
     * 店铺信息查询mapper
     */
    @Autowired
    private ShpShopMapper shpShopMapper;


    /**
     * 处理订单支付参数
     *
     * @param paramDto
     * @return
     */
    @Transactional
    public HandlerPayOrderRetDto handlerPayOrderRetDto(HandlerPayOrderParamDto paramDto) {
        HandlerPayOrderRetDto retDto = new HandlerPayOrderRetDto();
        String orderNo = paramDto.getOrderNo();
        Long userId = paramDto.getUserId();
        UsrOpenId jqbbOpenId = usrOpenIdOPMapper.selectByUserId(userId, CommonConstans.WX_APP_TYPE_JQBB);
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        if (ordOrder != null) {
            //订单支付的校验在这里做
            ShpShop shpShop = shpShopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
            //店铺营业情况校验
            if (!"P".equals(shpShop.getShopTradSts())) {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("未在营业时间");
            } else {
                LotInst lotInst = lotInstMapper.selectByPrimaryKey(ordOrder.getLottoInstId());
                Date lottoEndDate = lotInst.getPeriodEndTime();
                Date currentDate = new Date();
                if (currentDate.getTime() > (lottoEndDate.getTime() + 60 * 60000)) {
                    //彩票停售前30分钟平台不卖
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("本期彩票已暂停销售，为确保商户正常出票请在停售前1小时购买");
                } else {
                    //正常支付参数获取
                    Integer totalFee = ordOrder.getOrderPrice();
                    if ("ptc".equals(evnConfig.getEvn())) {
                        totalFee = ordOrder.getOrderPrice() * 100;
                    }
                    WxPayUnifiedOrderRequest prepayInfo = WxPayUnifiedOrderRequest.newBuilder()
                            .openid(jqbbOpenId.getWxOpenId())
                            .outTradeNo(orderNo).totalFee(totalFee).body("交易订单")
                            .tradeType(CommonConstans.WX_PAY_TRADE_TYPE_JSSDK)
                            .spbillCreateIp(evnConfig.getServerIp())//服务器IP地址
                            .notifyURL(evnConfig.getNotifyContext() + CommonConstans.FEE_NOTIFYPAY_URL)//回调通知地址
                            .build();
                    try {
                        WxPayMpOrderResult result = wxPayService.createOrder(prepayInfo);
                        logger.debug("微信支付返回对象:" + result.toString());
                        PayOrderConfigVo payOrderConfigVo = new PayOrderConfigVo();
                        payOrderConfigVo.setNonceStr(result.getNonceStr());
                        payOrderConfigVo.setPackageName(result.getPackageValue());
                        payOrderConfigVo.setPaySign(result.getPaySign());
                        payOrderConfigVo.setSignType(result.getSignType());
                        payOrderConfigVo.setTimestamp(result.getTimeStamp());

                        retDto.setPayOrderConfigVo(payOrderConfigVo);
                        retDto.setHandlerResult(true);
                        retDto.setHandlerMsg("处理成功");
                    } catch (WxPayException e) {
                        retDto.setHandlerResult(false);
                        retDto.setHandlerMsg("处理失败");
                        logger.error("调用微信支付异常:错误码:" + e.getReturnCode() + ",错误描述:" + e.getReturnMsg());
                        logger.error("调用微信支付异常:结果码:" + e.getResultCode() + ",结果码描述:" + e.getResultCode());
                        logger.error("调用微信支付异常:异常描述:" + e.getMessage() + ",失败码:" + e.getErrCode() + ",失败码描述:" + e.getErrCodeDes());
                    }
                }
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("订单号错误");
        }
        return retDto;
    }


    /**
     * 处理订单派奖支付参数
     *
     * @param paramDto
     * @return
     */
    @Transactional
    public HandlerPayOrderRetDto handlerPayOrderBonusRetDto(HandlerPayOrderParamDto paramDto) {
        HandlerPayOrderRetDto retDto = new HandlerPayOrderRetDto();
        String orderNo = paramDto.getOrderNo();
        Long userId = paramDto.getUserId();
        UsrOpenId jqbbOpenId = usrOpenIdOPMapper.selectByUserId(userId, CommonConstans.WX_APP_TYPE_JQBB);
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        if (ordOrder != null) {
            String bonusPayOrderNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.BONUS_PRE_FLAG);
            ordOrder.setBonusPayOrderNo(bonusPayOrderNo);
            ordOrder.setApplyBonusTime(new Date());
            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
            //申请微信支付参数
            Integer totalFee = ordOrder.getBonusAmt().intValue();
            if ("ptc".equals(evnConfig.getEvn())) {
                totalFee = ordOrder.getBonusAmt().intValue() * 100;
            }
            WxPayUnifiedOrderRequest prepayInfo = WxPayUnifiedOrderRequest.newBuilder()
                    .openid(jqbbOpenId.getWxOpenId())
                    .outTradeNo(bonusPayOrderNo).totalFee(totalFee).body("交易订单")
                    .tradeType(CommonConstans.WX_PAY_TRADE_TYPE_JSSDK)
                    .spbillCreateIp(evnConfig.getServerIp())//服务器IP
                    .notifyURL(evnConfig.getNotifyContext() + CommonConstans.FEE_NOTIFYPAY_URL)//通知回调地址
                    .build();
            try {
                logger.debug("微信支付入参对象:" + prepayInfo.toString());
                WxPayMpOrderResult result = wxPayService.createOrder(prepayInfo);
                logger.debug("微信支付返回对象:" + result.toString());
                PayOrderConfigVo payOrderConfigVo = new PayOrderConfigVo();
                payOrderConfigVo.setNonceStr(result.getNonceStr());
                payOrderConfigVo.setPackageName(result.getPackageValue());
                payOrderConfigVo.setPaySign(result.getPaySign());
                payOrderConfigVo.setSignType(result.getSignType());
                payOrderConfigVo.setTimestamp(result.getTimeStamp());

                retDto.setPayOrderConfigVo(payOrderConfigVo);
                retDto.setHandlerResult(true);
                retDto.setHandlerMsg("处理成功");
            } catch (WxPayException e) {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("处理失败");
                logger.error("调用微信支付异常:错误码:" + e.getReturnCode() + ",错误描述:" + e.getReturnMsg());
                logger.error("调用微信支付异常:结果码:" + e.getResultCode() + ",结果码描述:" + e.getResultCode());
                logger.error("调用微信支付异常:异常描述:" + e.getMessage() + ",失败码:" + e.getErrCode() + ",失败码描述:" + e.getErrCodeDes());
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("订单号错误");
        }
        return retDto;
    }

    /**
     * 微信通知支付结果的回调地址，notify_url
     *
     * @param request
     * @param response
     */
    @Transactional
    public void getJSSDKCallbackData(HttpServletRequest request, HttpServletResponse response) {
        try {
            synchronized (this) {
                Map<String, String> kvm = XMLUtil.parseRequestXmlToMap(request);
                if (SignUtils.checkSign(kvm, null, this.payConfig.getMchKey())) {
                    if (kvm.get("result_code").equals("SUCCESS")) {
                        String orderNo = kvm.get("out_trade_no");
                        String wxOrderId = kvm.get("transaction_id");
                        logger.info("wxOrderId: " + wxOrderId + ",orderNo:" + orderNo);
                        if (!JBUtil.isStrEmpty(orderNo)) {
                            logger.info("orderNo is not null");
                            OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
                            logger.info("find ordOrder:" + ordOrder);
                            if (ordOrder != null) {
                                //支付订单处理
                                if (CommonConstans.ORDER_STS_I.equals(ordOrder.getOrderSts())) {
                                    //未支付状态才处理，否则不处理，直接返回成功
                                    ordOrder.setPaySts(CommonConstans.ORDER_PAY_STS_PAIED);//已支付
                                    ordOrder.setOrderPayTime(new Date());
                                    ordOrder.setPayOrderId(wxOrderId);
                                    ordOrder.setOrderSts(CommonConstans.ORDER_STS_P);//已支付
                                    ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                                    //订单支付完成账务流水处理
                                    accountBo.orderPayAccountFlow(ordOrder);
                                    //发推送，通知商户用户已下单
                                    sendMessageService.sendOrderPayMsg(ordOrder);
                                    //针对中大奖了的订单做特殊处理，通知终端后台订单信息
                                    if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel()) && CommonConstans.ORDER_SOURCE_AUTOTAKE.equals(ordOrder.getOrderSource())) {
                                        logger.info("中大奖了!!准备做数据传送");
                                        SendOrderToTerminalRetDto retDto = transportService.sendOrderToTerminal(ordOrder);
                                        if (retDto.isHandlerResult()) {
                                            //如果处理成功则做确认订单的处理
                                            ensureOrderAfterOrderTransTerminal(ordOrder, retDto.getOrderTicketUrl());
                                        }
                                    }
                                    //TODO Junjie.Lai 修改系统级的商户和用户的订单支付等数据
                                    logger.info("ordOrder pay deal finish");
                                }
                            } else {
                                //兑奖订单处理
                                OrdOrderOP ordOrderBonus = ordOrderOPMapper.selectByBonusOrderNo(orderNo);
                                if (ordOrderBonus != null) {
                                    //派奖订单处理
                                    if (CommonConstans.ORDER_STS_B.equals(ordOrderBonus.getOrderSts()) && CommonConstans.ORDER_BONUS_STS_B.equals(ordOrderBonus.getBonusSts())) {
                                        //开奖订单才处理
                                        ordOrderBonus.setOrderSts(CommonConstans.ORDER_STS_S);//已兑奖
                                        ordOrderBonus.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//已兑奖
                                        ordOrderBonus.setFinishBonusTime(new Date());
                                        ordOrderOPMapper.updateByPrimaryKey(ordOrderBonus);
                                        //派奖支付完成账务流水处理
                                        accountBo.orderBonusPayAccountFlow(ordOrderBonus);
                                        //TODO Junjie.Lai 修改系统级的商户和用户的订单支付等数据
                                        logger.info("ordOrder bonuspay deal finish");
                                    }
                                }
                            }
                        }
                        response.getWriter().write("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[ok]]></return_msg></xml>");
                    } else {
                        this.logger.error("out_trade_no: " + kvm.get("out_trade_no") + " result_code is FAIL");
                        response.getWriter().write("<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[result_code is FAIL]]></return_msg></xml>");
                    }
                } else {
                    response.getWriter().write("<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[check signature FAIL]]></return_msg></xml>");
                    this.logger.error("out_trade_no: " + kvm.get("out_trade_no") + " check signature FAIL");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通知了终端订单信息后，做订单确认的操作
     *
     * @param ordOrder
     * @param imgUrl
     */
    private void ensureOrderAfterOrderTransTerminal(OrdOrderOP ordOrder, String imgUrl) {
        Date currentDate = new Date();
        ordOrder.setOrderTicketPic(imgUrl);//图片
        ordOrder.setTicketUploadSts(CommonConstans.COMMON_STS_VALID);//已上传
        ordOrder.setTicketUploadTime(currentDate);
        ordOrder.setOrderSts(CommonConstans.ORDER_STS_W);//预约订单待开奖
        ordOrderOPMapper.updateByPrimaryKey(ordOrder);

        //预约订单发消息处理
        sendMessageService.sendPaysuccessSaveOrderMsg(ordOrder);
    }


    /**
     * 微信通知支付结果的回调地址，notify_url
     *
     * @param request
     * @param response
     */
    @Transactional
    public void tempJSSDKCallbackData(HttpServletRequest request, HttpServletResponse response) {
        try {
            synchronized (this) {
                Map<String, String> kvm = XMLUtil.parseRequestXmlToMap(request);
                if (kvm.get("result_code").equals("SUCCESS")) {
                    String orderNo = kvm.get("out_trade_no");
                    String wxOrderId = kvm.get("transaction_id");
                    logger.info("wxOrderId: " + wxOrderId + ",orderNo:" + orderNo);
                    if (!JBUtil.isStrEmpty(orderNo)) {
                        logger.info("orderNo is not null");
                        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
                        logger.info("find ordOrder:" + ordOrder);
                        if (ordOrder != null) {
                            //充值订单处理
                            if (CommonConstans.ORDER_STS_I.equals(ordOrder.getOrderSts())) {
                                //已支付状态才处理，否则不处理，直接返回成功
                                ordOrder.setPaySts(CommonConstans.ORDER_PAY_STS_PAIED);//已支付
                                ordOrder.setOrderPayTime(new Date());
                                ordOrder.setPayOrderId(wxOrderId);
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_P);//已支付
                                ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                                //订单支付完成账务流水处理
                                accountBo.orderPayAccountFlow(ordOrder);
                                //发推送，通知商户用户已下单
                                sendMessageService.sendOrderPayMsg(ordOrder);
                                //TODO Junjie.Lai 修改系统级的商户和用户的订单支付等数据
                                logger.info("ordOrder pay deal finish");
                            }
                        } else {
                            //兑奖订单处理
                            OrdOrderOP ordOrderBonus = ordOrderOPMapper.selectByBonusOrderNo(orderNo);
                            if (ordOrderBonus != null) {
                                //派奖订单处理
                                if (CommonConstans.ORDER_STS_B.equals(ordOrderBonus.getOrderSts()) && CommonConstans.ORDER_BONUS_STS_B.equals(ordOrderBonus.getBonusSts())) {
                                    //开奖订单才处理
                                    ordOrderBonus.setOrderSts(CommonConstans.ORDER_STS_S);//已兑奖
                                    ordOrderBonus.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//已兑奖
                                    ordOrderBonus.setFinishBonusTime(new Date());
                                    ordOrderOPMapper.updateByPrimaryKey(ordOrderBonus);
                                    //派奖支付完成账务流水处理
                                    accountBo.orderBonusPayAccountFlow(ordOrderBonus);
                                    //TODO Junjie.Lai 修改系统级的商户和用户的订单支付等数据
                                    logger.info("ordOrder bonuspay deal finish");
                                }
                            }
                        }
                    }
                    response.getWriter().write("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[ok]]></return_msg></xml>");
                } else {
                    this.logger.error("out_trade_no: " + kvm.get("out_trade_no") + " result_code is FAIL");
                    response.getWriter().write("<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[result_code is FAIL]]></return_msg></xml>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 商户提现到用户零钱包
     *
     * @param response
     * @param request
     */
    public void payToIndividual(HttpServletResponse response, HttpServletRequest request) {
        WxEntPayRequest wxEntPayRequest = new WxEntPayRequest();
        wxEntPayRequest.setAppid(payConfig.getAppId());
        wxEntPayRequest.setMchId(payConfig.getMchId());
        wxEntPayRequest.setNonceStr(Sha1Util.getNonceStr());
        wxEntPayRequest.setPartnerTradeNo(request.getParameter("partner_trade_no"));
        wxEntPayRequest.setOpenid(request.getParameter("openid"));
        wxEntPayRequest.setCheckName("NO_CHECK");
        wxEntPayRequest.setAmount(Integer.valueOf(request.getParameter("amount")));
        wxEntPayRequest.setDescription(request.getParameter("desc"));
        wxEntPayRequest.setSpbillCreateIp(request.getParameter("spbill_create_ip"));

        try {
            WxEntPayResult wxEntPayResult = wxPayService.entPay(wxEntPayRequest);
            if ("SUCCESS".equals(wxEntPayResult.getResultCode().toUpperCase()) && "SUCCESS".equals(wxEntPayResult.getReturnCode().toUpperCase())) {
                this.logger.info("企业对个人付款成功！\n付款信息：\n" + wxEntPayResult.toString());
            } else {
                this.logger.error("err_code: " + wxEntPayResult.getErrCode() + "  err_code_des: " + wxEntPayResult.getErrCodeDes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 保存用户提现申请
     *
     * @return
     */
    @Transactional
    public BaseRetDto saveUserWithdrawOrder(Long userId, String withDrawAmt, String userBankCardId) {
        BaseRetDto retDto = new BaseRetDto();
        if (userBankCardId != null) {
            UsrBankCard usrBankCard = usrBankCardMapper.selectByPrimaryKey(Long.valueOf(userBankCardId));
            if (usrBankCard != null) {
                AccWithdrawOrder withdrawOrder = new AccWithdrawOrder();
                withdrawOrder.setWithdrawOrderNo(OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.WITHDRAWORDER_PRE_FLAG));
                withdrawOrder.setUserId(userId);
                withdrawOrder.setUserBankCardId(Long.valueOf(userBankCardId));
                withdrawOrder.setUserBankCardNo(usrBankCard.getBankCardNo());
                withdrawOrder.setApplyTime(new Date());
                withdrawOrder.setWithdrawType(CommonConstans.WITHDRAW_ORDER_TYPE_PLAYER);
                withdrawOrder.setWithdrawOrderSts(CommonConstans.WITHDRAW_ORDER_STS_INIT);
                withdrawOrder.setWithdrawAmt(new BigDecimal(withDrawAmt));
                int insertCount = accWithdrawOrderMapper.insert(withdrawOrder);
                if (insertCount > 0) {
                    retDto.setHandlerResult(true);
                    //账户操作
                    accountBo.userWithdrawAccountFlow(withdrawOrder);
                } else {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("插入数据失败");
                }
            } else {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("未找到银行卡信息");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("请选择用户银行卡信息");
        }
        return retDto;
    }

    /**
     * 保存商户提现申请
     *
     * @param userId
     * @param withdrawAmt
     * @param shopBankCardId
     * @return
     */
    public BaseRetDto saveShopWithdrawOrder(Long shopId, Long userId, String withdrawAmt, String shopBankCardId) {
        BaseRetDto retDto = new BaseRetDto();
        if (shopBankCardId != null) {
            ShpBankcard usrBankCard = shpBankcardMapper.selectByPrimaryKey(Long.valueOf(shopBankCardId));
            if (usrBankCard != null) {
                AccWithdrawOrder withdrawOrder = new AccWithdrawOrder();
                withdrawOrder.setWithdrawOrderNo(OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.WITHDRAWORDER_PRE_FLAG));
                withdrawOrder.setShopId(shopId);
                //withdrawOrder.setUserId(userId);
                withdrawOrder.setUserBankCardId(Long.valueOf(shopBankCardId));
                withdrawOrder.setUserBankCardNo(usrBankCard.getBankCardNo());
                withdrawOrder.setApplyTime(new Date());
                withdrawOrder.setWithdrawType(CommonConstans.WITHDRAW_ORDER_TYPE_SHOP);
                withdrawOrder.setWithdrawOrderSts(CommonConstans.WITHDRAW_ORDER_STS_INIT);
                withdrawOrder.setWithdrawAmt(new BigDecimal(withdrawAmt));
                int insertCount = accWithdrawOrderMapper.insert(withdrawOrder);
                if (insertCount > 0) {
                    retDto.setHandlerResult(true);
                    //账户操作
                    accountBo.shopWithdrawAccountFlow(withdrawOrder);
                } else {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("插入数据失败");
                }
            } else {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("未找到银行卡信息");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("请选择用户银行卡信息");
        }
        return retDto;
    }


}
