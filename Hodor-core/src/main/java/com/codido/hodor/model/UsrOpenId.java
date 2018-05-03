package com.codido.hodor.model;

public class UsrOpenId {
    private Long relaId;

    private Long userId;

    private String wxOpenId;

    private String wxAppType;

    private String wxSessionKey;

    public UsrOpenId(Long relaId, Long userId, String wxOpenId, String wxAppType, String wxSessionKey) {
        this.relaId = relaId;
        this.userId = userId;
        this.wxOpenId = wxOpenId;
        this.wxAppType = wxAppType;
        this.wxSessionKey = wxSessionKey;
    }

    public UsrOpenId() {
        super();
    }

    public Long getRelaId() {
        return relaId;
    }

    public void setRelaId(Long relaId) {
        this.relaId = relaId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }

    public String getWxAppType() {
        return wxAppType;
    }

    public void setWxAppType(String wxAppType) {
        this.wxAppType = wxAppType == null ? null : wxAppType.trim();
    }

    public String getWxSessionKey() {
        return wxSessionKey;
    }

    public void setWxSessionKey(String wxSessionKey) {
        this.wxSessionKey = wxSessionKey == null ? null : wxSessionKey.trim();
    }
}