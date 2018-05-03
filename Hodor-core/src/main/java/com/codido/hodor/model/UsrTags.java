package com.codido.hodor.model;

import java.util.Date;

public class UsrTags {
    private Long userTagId;

    private Long userId;

    private Long tagId;

    private Date tagTime;

    private String userTagSts;

    public UsrTags(Long userTagId, Long userId, Long tagId, Date tagTime, String userTagSts) {
        this.userTagId = userTagId;
        this.userId = userId;
        this.tagId = tagId;
        this.tagTime = tagTime;
        this.userTagSts = userTagSts;
    }

    public UsrTags() {
        super();
    }

    public Long getUserTagId() {
        return userTagId;
    }

    public void setUserTagId(Long userTagId) {
        this.userTagId = userTagId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Date getTagTime() {
        return tagTime;
    }

    public void setTagTime(Date tagTime) {
        this.tagTime = tagTime;
    }

    public String getUserTagSts() {
        return userTagSts;
    }

    public void setUserTagSts(String userTagSts) {
        this.userTagSts = userTagSts == null ? null : userTagSts.trim();
    }
}