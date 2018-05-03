package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccPayOrder {
    private Long payOrderId;

    private String payOrderNo;

    private String payOrderType;

    private BigDecimal payAmt;

    private String payOrderSts;

    private Date payOrderCreateTime;

    private Date payOrderPayTime;

    private Long userId;

    private Long shopId;

    public AccPayOrder(Long payOrderId, String payOrderNo, String payOrderType, BigDecimal payAmt, String payOrderSts, Date payOrderCreateTime, Date payOrderPayTime, Long userId, Long shopId) {
        this.payOrderId = payOrderId;
        this.payOrderNo = payOrderNo;
        this.payOrderType = payOrderType;
        this.payAmt = payAmt;
        this.payOrderSts = payOrderSts;
        this.payOrderCreateTime = payOrderCreateTime;
        this.payOrderPayTime = payOrderPayTime;
        this.userId = userId;
        this.shopId = shopId;
    }

    public AccPayOrder() {
        super();
    }

    public Long getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Long payOrderId) {
        this.payOrderId = payOrderId;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo == null ? null : payOrderNo.trim();
    }

    public String getPayOrderType() {
        return payOrderType;
    }

    public void setPayOrderType(String payOrderType) {
        this.payOrderType = payOrderType == null ? null : payOrderType.trim();
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getPayOrderSts() {
        return payOrderSts;
    }

    public void setPayOrderSts(String payOrderSts) {
        this.payOrderSts = payOrderSts == null ? null : payOrderSts.trim();
    }

    public Date getPayOrderCreateTime() {
        return payOrderCreateTime;
    }

    public void setPayOrderCreateTime(Date payOrderCreateTime) {
        this.payOrderCreateTime = payOrderCreateTime;
    }

    public Date getPayOrderPayTime() {
        return payOrderPayTime;
    }

    public void setPayOrderPayTime(Date payOrderPayTime) {
        this.payOrderPayTime = payOrderPayTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}