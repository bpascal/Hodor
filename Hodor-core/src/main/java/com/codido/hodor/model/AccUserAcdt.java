package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccUserAcdt {
    private Long userAcdtId;

    private Long userAccountId;

    private BigDecimal txAmount;

    private String txOrderNo;

    private String txNo;

    private String txWay;

    private Date txTime;

    private String acdtSts;

    private String acdtDesc;

    private String acdtType;

    public AccUserAcdt(Long userAcdtId, Long userAccountId, BigDecimal txAmount, String txOrderNo, String txNo, String txWay, Date txTime, String acdtSts, String acdtDesc, String acdtType) {
        this.userAcdtId = userAcdtId;
        this.userAccountId = userAccountId;
        this.txAmount = txAmount;
        this.txOrderNo = txOrderNo;
        this.txNo = txNo;
        this.txWay = txWay;
        this.txTime = txTime;
        this.acdtSts = acdtSts;
        this.acdtDesc = acdtDesc;
        this.acdtType = acdtType;
    }

    public AccUserAcdt() {
        super();
    }

    public Long getUserAcdtId() {
        return userAcdtId;
    }

    public void setUserAcdtId(Long userAcdtId) {
        this.userAcdtId = userAcdtId;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public BigDecimal getTxAmount() {
        return txAmount;
    }

    public void setTxAmount(BigDecimal txAmount) {
        this.txAmount = txAmount;
    }

    public String getTxOrderNo() {
        return txOrderNo;
    }

    public void setTxOrderNo(String txOrderNo) {
        this.txOrderNo = txOrderNo == null ? null : txOrderNo.trim();
    }

    public String getTxNo() {
        return txNo;
    }

    public void setTxNo(String txNo) {
        this.txNo = txNo == null ? null : txNo.trim();
    }

    public String getTxWay() {
        return txWay;
    }

    public void setTxWay(String txWay) {
        this.txWay = txWay == null ? null : txWay.trim();
    }

    public Date getTxTime() {
        return txTime;
    }

    public void setTxTime(Date txTime) {
        this.txTime = txTime;
    }

    public String getAcdtSts() {
        return acdtSts;
    }

    public void setAcdtSts(String acdtSts) {
        this.acdtSts = acdtSts == null ? null : acdtSts.trim();
    }

    public String getAcdtDesc() {
        return acdtDesc;
    }

    public void setAcdtDesc(String acdtDesc) {
        this.acdtDesc = acdtDesc == null ? null : acdtDesc.trim();
    }

    public String getAcdtType() {
        return acdtType;
    }

    public void setAcdtType(String acdtType) {
        this.acdtType = acdtType == null ? null : acdtType.trim();
    }
}