package com.codido.hodor.model;

import java.util.Date;

public class UsrToken {
    private Long tokenId;

    private Long userId;

    private String tokenSts;

    private Date tokenCreateTime;

    private Date tokenEndTime;

    public UsrToken(Long tokenId, Long userId, String tokenSts, Date tokenCreateTime, Date tokenEndTime) {
        this.tokenId = tokenId;
        this.userId = userId;
        this.tokenSts = tokenSts;
        this.tokenCreateTime = tokenCreateTime;
        this.tokenEndTime = tokenEndTime;
    }

    public UsrToken() {
        super();
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTokenSts() {
        return tokenSts;
    }

    public void setTokenSts(String tokenSts) {
        this.tokenSts = tokenSts == null ? null : tokenSts.trim();
    }

    public Date getTokenCreateTime() {
        return tokenCreateTime;
    }

    public void setTokenCreateTime(Date tokenCreateTime) {
        this.tokenCreateTime = tokenCreateTime;
    }

    public Date getTokenEndTime() {
        return tokenEndTime;
    }

    public void setTokenEndTime(Date tokenEndTime) {
        this.tokenEndTime = tokenEndTime;
    }
}