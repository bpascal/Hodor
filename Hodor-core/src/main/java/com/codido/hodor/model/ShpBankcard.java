package com.codido.hodor.model;

import java.util.Date;

public class ShpBankcard {
    private Long shopBankcardId;

    private Long shopId;

    private Long bankId;

    private String bankCardNo;

    private String shopBankcardSts;

    private String bankCardOwnerName;

    private Date bindTime;

    public ShpBankcard(Long shopBankcardId, Long shopId, Long bankId, String bankCardNo, String shopBankcardSts, String bankCardOwnerName, Date bindTime) {
        this.shopBankcardId = shopBankcardId;
        this.shopId = shopId;
        this.bankId = bankId;
        this.bankCardNo = bankCardNo;
        this.shopBankcardSts = shopBankcardSts;
        this.bankCardOwnerName = bankCardOwnerName;
        this.bindTime = bindTime;
    }

    public ShpBankcard() {
        super();
    }

    public Long getShopBankcardId() {
        return shopBankcardId;
    }

    public void setShopBankcardId(Long shopBankcardId) {
        this.shopBankcardId = shopBankcardId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getShopBankcardSts() {
        return shopBankcardSts;
    }

    public void setShopBankcardSts(String shopBankcardSts) {
        this.shopBankcardSts = shopBankcardSts == null ? null : shopBankcardSts.trim();
    }

    public String getBankCardOwnerName() {
        return bankCardOwnerName;
    }

    public void setBankCardOwnerName(String bankCardOwnerName) {
        this.bankCardOwnerName = bankCardOwnerName == null ? null : bankCardOwnerName.trim();
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }
}