package com.codido.hodor.model;

import java.util.Date;

public class OrdOrder {
    private Long orderId;

    private String orderNo;

    private Long lottoInstId;

    private Long initUserId;

    private Long dealUserId;

    private Long dealShopId;

    private Integer betTimes;

    private Integer orderTotalBetsCount;

    private Integer orderPrice;

    private String orderSts;

    private String comGameStyle;

    private String ticketUploadSts;

    private String bonusSts;

    private Long bonusAmt;

    private String bonusDesc;

    private String bonusPayOrderNo;

    private Date orderCreateTime;

    private Date orderCancelTime;

    private Date orderSendTime;

    private Date orderAcceptTime;

    private String orderTicketPic;

    private String submitFormId;

    private String orderPushmsgSts;

    private Date ticketUploadTime;

    private String payOrderId;

    private String payChannel;

    private String paySts;

    private Date orderPayTime;

    private Date orderRejectTime;

    private String orderSource;

    private String chaseNo;

    private String copOrderNo;

    private Date reciveBonusTime;

    private Date reciveBonusStsTime;

    private Date applyBonusTime;

    private Date finishBonusTime;

    private String orderTicketReciveSts;

    private Date orderTicketReciveTime;

    private String orderChannel;

    public OrdOrder(Long orderId, String orderNo, Long lottoInstId, Long initUserId, Long dealUserId, Long dealShopId, Integer betTimes, Integer orderTotalBetsCount, Integer orderPrice, String orderSts, String comGameStyle, String ticketUploadSts, String bonusSts, Long bonusAmt, String bonusDesc, String bonusPayOrderNo, Date orderCreateTime, Date orderCancelTime, Date orderSendTime, Date orderAcceptTime, String orderTicketPic, String submitFormId, String orderPushmsgSts, Date ticketUploadTime, String payOrderId, String payChannel, String paySts, Date orderPayTime, Date orderRejectTime, String orderSource, String chaseNo, String copOrderNo, Date reciveBonusTime, Date reciveBonusStsTime, Date applyBonusTime, Date finishBonusTime, String orderTicketReciveSts, Date orderTicketReciveTime, String orderChannel) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.lottoInstId = lottoInstId;
        this.initUserId = initUserId;
        this.dealUserId = dealUserId;
        this.dealShopId = dealShopId;
        this.betTimes = betTimes;
        this.orderTotalBetsCount = orderTotalBetsCount;
        this.orderPrice = orderPrice;
        this.orderSts = orderSts;
        this.comGameStyle = comGameStyle;
        this.ticketUploadSts = ticketUploadSts;
        this.bonusSts = bonusSts;
        this.bonusAmt = bonusAmt;
        this.bonusDesc = bonusDesc;
        this.bonusPayOrderNo = bonusPayOrderNo;
        this.orderCreateTime = orderCreateTime;
        this.orderCancelTime = orderCancelTime;
        this.orderSendTime = orderSendTime;
        this.orderAcceptTime = orderAcceptTime;
        this.orderTicketPic = orderTicketPic;
        this.submitFormId = submitFormId;
        this.orderPushmsgSts = orderPushmsgSts;
        this.ticketUploadTime = ticketUploadTime;
        this.payOrderId = payOrderId;
        this.payChannel = payChannel;
        this.paySts = paySts;
        this.orderPayTime = orderPayTime;
        this.orderRejectTime = orderRejectTime;
        this.orderSource = orderSource;
        this.chaseNo = chaseNo;
        this.copOrderNo = copOrderNo;
        this.reciveBonusTime = reciveBonusTime;
        this.reciveBonusStsTime = reciveBonusStsTime;
        this.applyBonusTime = applyBonusTime;
        this.finishBonusTime = finishBonusTime;
        this.orderTicketReciveSts = orderTicketReciveSts;
        this.orderTicketReciveTime = orderTicketReciveTime;
        this.orderChannel = orderChannel;
    }

    public OrdOrder() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getInitUserId() {
        return initUserId;
    }

    public void setInitUserId(Long initUserId) {
        this.initUserId = initUserId;
    }

    public Long getDealUserId() {
        return dealUserId;
    }

    public void setDealUserId(Long dealUserId) {
        this.dealUserId = dealUserId;
    }

    public Long getDealShopId() {
        return dealShopId;
    }

    public void setDealShopId(Long dealShopId) {
        this.dealShopId = dealShopId;
    }

    public Integer getBetTimes() {
        return betTimes;
    }

    public void setBetTimes(Integer betTimes) {
        this.betTimes = betTimes;
    }

    public Integer getOrderTotalBetsCount() {
        return orderTotalBetsCount;
    }

    public void setOrderTotalBetsCount(Integer orderTotalBetsCount) {
        this.orderTotalBetsCount = orderTotalBetsCount;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderSts() {
        return orderSts;
    }

    public void setOrderSts(String orderSts) {
        this.orderSts = orderSts == null ? null : orderSts.trim();
    }

    public String getComGameStyle() {
        return comGameStyle;
    }

    public void setComGameStyle(String comGameStyle) {
        this.comGameStyle = comGameStyle == null ? null : comGameStyle.trim();
    }

    public String getTicketUploadSts() {
        return ticketUploadSts;
    }

    public void setTicketUploadSts(String ticketUploadSts) {
        this.ticketUploadSts = ticketUploadSts == null ? null : ticketUploadSts.trim();
    }

    public String getBonusSts() {
        return bonusSts;
    }

    public void setBonusSts(String bonusSts) {
        this.bonusSts = bonusSts == null ? null : bonusSts.trim();
    }

    public Long getBonusAmt() {
        return bonusAmt;
    }

    public void setBonusAmt(Long bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    public String getBonusDesc() {
        return bonusDesc;
    }

    public void setBonusDesc(String bonusDesc) {
        this.bonusDesc = bonusDesc == null ? null : bonusDesc.trim();
    }

    public String getBonusPayOrderNo() {
        return bonusPayOrderNo;
    }

    public void setBonusPayOrderNo(String bonusPayOrderNo) {
        this.bonusPayOrderNo = bonusPayOrderNo == null ? null : bonusPayOrderNo.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public Date getOrderSendTime() {
        return orderSendTime;
    }

    public void setOrderSendTime(Date orderSendTime) {
        this.orderSendTime = orderSendTime;
    }

    public Date getOrderAcceptTime() {
        return orderAcceptTime;
    }

    public void setOrderAcceptTime(Date orderAcceptTime) {
        this.orderAcceptTime = orderAcceptTime;
    }

    public String getOrderTicketPic() {
        return orderTicketPic;
    }

    public void setOrderTicketPic(String orderTicketPic) {
        this.orderTicketPic = orderTicketPic == null ? null : orderTicketPic.trim();
    }

    public String getSubmitFormId() {
        return submitFormId;
    }

    public void setSubmitFormId(String submitFormId) {
        this.submitFormId = submitFormId == null ? null : submitFormId.trim();
    }

    public String getOrderPushmsgSts() {
        return orderPushmsgSts;
    }

    public void setOrderPushmsgSts(String orderPushmsgSts) {
        this.orderPushmsgSts = orderPushmsgSts == null ? null : orderPushmsgSts.trim();
    }

    public Date getTicketUploadTime() {
        return ticketUploadTime;
    }

    public void setTicketUploadTime(Date ticketUploadTime) {
        this.ticketUploadTime = ticketUploadTime;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId == null ? null : payOrderId.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPaySts() {
        return paySts;
    }

    public void setPaySts(String paySts) {
        this.paySts = paySts == null ? null : paySts.trim();
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderRejectTime() {
        return orderRejectTime;
    }

    public void setOrderRejectTime(Date orderRejectTime) {
        this.orderRejectTime = orderRejectTime;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getChaseNo() {
        return chaseNo;
    }

    public void setChaseNo(String chaseNo) {
        this.chaseNo = chaseNo == null ? null : chaseNo.trim();
    }

    public String getCopOrderNo() {
        return copOrderNo;
    }

    public void setCopOrderNo(String copOrderNo) {
        this.copOrderNo = copOrderNo == null ? null : copOrderNo.trim();
    }

    public Date getReciveBonusTime() {
        return reciveBonusTime;
    }

    public void setReciveBonusTime(Date reciveBonusTime) {
        this.reciveBonusTime = reciveBonusTime;
    }

    public Date getReciveBonusStsTime() {
        return reciveBonusStsTime;
    }

    public void setReciveBonusStsTime(Date reciveBonusStsTime) {
        this.reciveBonusStsTime = reciveBonusStsTime;
    }

    public Date getApplyBonusTime() {
        return applyBonusTime;
    }

    public void setApplyBonusTime(Date applyBonusTime) {
        this.applyBonusTime = applyBonusTime;
    }

    public Date getFinishBonusTime() {
        return finishBonusTime;
    }

    public void setFinishBonusTime(Date finishBonusTime) {
        this.finishBonusTime = finishBonusTime;
    }

    public String getOrderTicketReciveSts() {
        return orderTicketReciveSts;
    }

    public void setOrderTicketReciveSts(String orderTicketReciveSts) {
        this.orderTicketReciveSts = orderTicketReciveSts == null ? null : orderTicketReciveSts.trim();
    }

    public Date getOrderTicketReciveTime() {
        return orderTicketReciveTime;
    }

    public void setOrderTicketReciveTime(Date orderTicketReciveTime) {
        this.orderTicketReciveTime = orderTicketReciveTime;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel == null ? null : orderChannel.trim();
    }
}