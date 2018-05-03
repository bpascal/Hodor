package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccWithdrawOrder {
    private Long withdrawOrderId;

    private String withdrawOrderNo;

    private Long userId;

    private Long shopId;

    private String withdrawType;

    private String withdrawOrderSts;

    private BigDecimal withdrawAmt;

    private String userBankCardNo;

    private Long userBankCardId;

    private Date applyTime;

    private Date payTime;

    public AccWithdrawOrder(Long withdrawOrderId, String withdrawOrderNo, Long userId, Long shopId, String withdrawType, String withdrawOrderSts, BigDecimal withdrawAmt, String userBankCardNo, Long userBankCardId, Date applyTime, Date payTime) {
        this.withdrawOrderId = withdrawOrderId;
        this.withdrawOrderNo = withdrawOrderNo;
        this.userId = userId;
        this.shopId = shopId;
        this.withdrawType = withdrawType;
        this.withdrawOrderSts = withdrawOrderSts;
        this.withdrawAmt = withdrawAmt;
        this.userBankCardNo = userBankCardNo;
        this.userBankCardId = userBankCardId;
        this.applyTime = applyTime;
        this.payTime = payTime;
    }

    public AccWithdrawOrder() {
        super();
    }

    public Long getWithdrawOrderId() {
        return withdrawOrderId;
    }

    public void setWithdrawOrderId(Long withdrawOrderId) {
        this.withdrawOrderId = withdrawOrderId;
    }

    public String getWithdrawOrderNo() {
        return withdrawOrderNo;
    }

    public void setWithdrawOrderNo(String withdrawOrderNo) {
        this.withdrawOrderNo = withdrawOrderNo == null ? null : withdrawOrderNo.trim();
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

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType == null ? null : withdrawType.trim();
    }

    public String getWithdrawOrderSts() {
        return withdrawOrderSts;
    }

    public void setWithdrawOrderSts(String withdrawOrderSts) {
        this.withdrawOrderSts = withdrawOrderSts == null ? null : withdrawOrderSts.trim();
    }

    public BigDecimal getWithdrawAmt() {
        return withdrawAmt;
    }

    public void setWithdrawAmt(BigDecimal withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
    }

    public String getUserBankCardNo() {
        return userBankCardNo;
    }

    public void setUserBankCardNo(String userBankCardNo) {
        this.userBankCardNo = userBankCardNo == null ? null : userBankCardNo.trim();
    }

    public Long getUserBankCardId() {
        return userBankCardId;
    }

    public void setUserBankCardId(Long userBankCardId) {
        this.userBankCardId = userBankCardId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}