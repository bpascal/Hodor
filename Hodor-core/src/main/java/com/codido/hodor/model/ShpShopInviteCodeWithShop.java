package com.codido.hodor.model;

import java.util.Date;

public class ShpShopInviteCodeWithShop {
    private Long inviteCodeId;

    private Long shopId;

    private String inviteCode;

    private String codeSts;

    private Date codeCreateTime;

    private Date codeExpTime;

    private ShpShop shpShop;

    public ShpShopInviteCodeWithShop(Long inviteCodeId, Long shopId, String inviteCode, String codeSts, Date codeCreateTime, Date codeExpTime) {
        this.inviteCodeId = inviteCodeId;
        this.shopId = shopId;
        this.inviteCode = inviteCode;
        this.codeSts = codeSts;
        this.codeCreateTime = codeCreateTime;
        this.codeExpTime = codeExpTime;
    }

    public ShpShopInviteCodeWithShop() {
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

    public ShpShop getShpShop() {
        return shpShop;
    }

    public void setShpShop(ShpShop shpShop) {
        this.shpShop = shpShop;
    }
}