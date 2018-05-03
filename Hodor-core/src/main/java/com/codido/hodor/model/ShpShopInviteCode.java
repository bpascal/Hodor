package com.codido.hodor.model;

import java.util.Date;

public class ShpShopInviteCode {
    private Long inviteCodeId;

    private Long shopId;

    private String inviteCode;

    private String codeSts;

    private Date codeCreateTime;

    private Date codeExpTime;

    private String wxQrticket;

    private String wxQrcodeUrl;

    public ShpShopInviteCode(Long inviteCodeId, Long shopId, String inviteCode, String codeSts, Date codeCreateTime, Date codeExpTime, String wxQrticket, String wxQrcodeUrl) {
        this.inviteCodeId = inviteCodeId;
        this.shopId = shopId;
        this.inviteCode = inviteCode;
        this.codeSts = codeSts;
        this.codeCreateTime = codeCreateTime;
        this.codeExpTime = codeExpTime;
        this.wxQrticket = wxQrticket;
        this.wxQrcodeUrl = wxQrcodeUrl;
    }

    public ShpShopInviteCode() {
        super();
    }

    public Long getInviteCodeId() {
        return inviteCodeId;
    }

    public void setInviteCodeId(Long inviteCodeId) {
        this.inviteCodeId = inviteCodeId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getCodeSts() {
        return codeSts;
    }

    public void setCodeSts(String codeSts) {
        this.codeSts = codeSts == null ? null : codeSts.trim();
    }

    public Date getCodeCreateTime() {
        return codeCreateTime;
    }

    public void setCodeCreateTime(Date codeCreateTime) {
        this.codeCreateTime = codeCreateTime;
    }

    public Date getCodeExpTime() {
        return codeExpTime;
    }

    public void setCodeExpTime(Date codeExpTime) {
        this.codeExpTime = codeExpTime;
    }

    public String getWxQrticket() {
        return wxQrticket;
    }

    public void setWxQrticket(String wxQrticket) {
        this.wxQrticket = wxQrticket == null ? null : wxQrticket.trim();
    }

    public String getWxQrcodeUrl() {
        return wxQrcodeUrl;
    }

    public void setWxQrcodeUrl(String wxQrcodeUrl) {
        this.wxQrcodeUrl = wxQrcodeUrl == null ? null : wxQrcodeUrl.trim();
    }
}