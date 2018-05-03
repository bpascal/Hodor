package com.codido.hodor.model;

public class PubWxInfo {
    private Long wxInfoId;

    private String wxAppId;

    private String wxAppSecret;

    private String wxAccessToken;

    private Integer accessTokenExpTime;

    public PubWxInfo(Long wxInfoId, String wxAppId, String wxAppSecret, String wxAccessToken, Integer accessTokenExpTime) {
        this.wxInfoId = wxInfoId;
        this.wxAppId = wxAppId;
        this.wxAppSecret = wxAppSecret;
        this.wxAccessToken = wxAccessToken;
        this.accessTokenExpTime = accessTokenExpTime;
    }

    public PubWxInfo() {
        super();
    }

    public Long getWxInfoId() {
        return wxInfoId;
    }

    public void setWxInfoId(Long wxInfoId) {
        this.wxInfoId = wxInfoId;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId == null ? null : wxAppId.trim();
    }

    public String getWxAppSecret() {
        return wxAppSecret;
    }

    public void setWxAppSecret(String wxAppSecret) {
        this.wxAppSecret = wxAppSecret == null ? null : wxAppSecret.trim();
    }

    public String getWxAccessToken() {
        return wxAccessToken;
    }

    public void setWxAccessToken(String wxAccessToken) {
        this.wxAccessToken = wxAccessToken == null ? null : wxAccessToken.trim();
    }

    public Integer getAccessTokenExpTime() {
        return accessTokenExpTime;
    }

    public void setAccessTokenExpTime(Integer accessTokenExpTime) {
        this.accessTokenExpTime = accessTokenExpTime;
    }
}