package com.codido.hodor.model;

import java.util.Date;

public class UsrBankCard {
    private Long usrBankcardId;

    private Long userId;

    private Long bankId;

    private String bankCardNo;

    private String usrBankcardSts;

    private Date bandTime;

    public UsrBankCard(Long usrBankcardId, Long userId, Long bankId, String bankCardNo, String usrBankcardSts, Date bandTime) {
        this.usrBankcardId = usrBankcardId;
        this.userId = userId;
        this.bankId = bankId;
        this.bankCardNo = bankCardNo;
        this.usrBankcardSts = usrBankcardSts;
        this.bandTime = bandTime;
    }

    public UsrBankCard() {
        super();
    }

    public Long getUsrBankcardId() {
        return usrBankcardId;
    }

    public void setUsrBankcardId(Long usrBankcardId) {
        this.usrBankcardId = usrBankcardId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getUsrBankcardSts() {
        return usrBankcardSts;
    }

    public void setUsrBankcardSts(String usrBankcardSts) {
        this.usrBankcardSts = usrBankcardSts == null ? null : usrBankcardSts.trim();
    }

    public Date getBandTime() {
        return bandTime;
    }

    public void setBandTime(Date bandTime) {
        this.bandTime = bandTime;
    }
}