package com.codido.hodor.model;

import java.util.Date;

public class UsrFollowMatch {
    private Long followId;

    private Long userId;

    private Long matchId;

    private String matchType;

    private Date followDate;

    private Date followTime;

    private String followSts;

    private String formId;

    private String orderPushmsgSts;

    public UsrFollowMatch(Long followId, Long userId, Long matchId, String matchType, Date followDate, Date followTime, String followSts, String formId, String orderPushmsgSts) {
        this.followId = followId;
        this.userId = userId;
        this.matchId = matchId;
        this.matchType = matchType;
        this.followDate = followDate;
        this.followTime = followTime;
        this.followSts = followSts;
        this.formId = formId;
        this.orderPushmsgSts = orderPushmsgSts;
    }

    public UsrFollowMatch() {
        super();
    }

    public Long getFollowId() {
        return followId;
    }

    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType == null ? null : matchType.trim();
    }

    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public String getFollowSts() {
        return followSts;
    }

    public void setFollowSts(String followSts) {
        this.followSts = followSts == null ? null : followSts.trim();
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    public String getOrderPushmsgSts() {
        return orderPushmsgSts;
    }

    public void setOrderPushmsgSts(String orderPushmsgSts) {
        this.orderPushmsgSts = orderPushmsgSts == null ? null : orderPushmsgSts.trim();
    }
}