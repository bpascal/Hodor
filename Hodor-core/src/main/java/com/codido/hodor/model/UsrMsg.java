package com.codido.hodor.model;

import java.util.Date;

public class UsrMsg {
    private Long msgId;

    private Long fromUserId;

    private Long toUserId;

    private String msgTitle;

    private String msgInfo;

    private Date msgTime;

    private Date msgReadTime;

    private String msgSts;

    private String msgType;

    private String msgJumpUrl;

    public UsrMsg(Long msgId, Long fromUserId, Long toUserId, String msgTitle, String msgInfo, Date msgTime, Date msgReadTime, String msgSts, String msgType, String msgJumpUrl) {
        this.msgId = msgId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.msgTitle = msgTitle;
        this.msgInfo = msgInfo;
        this.msgTime = msgTime;
        this.msgReadTime = msgReadTime;
        this.msgSts = msgSts;
        this.msgType = msgType;
        this.msgJumpUrl = msgJumpUrl;
    }

    public UsrMsg() {
        super();
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo == null ? null : msgInfo.trim();
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public Date getMsgReadTime() {
        return msgReadTime;
    }

    public void setMsgReadTime(Date msgReadTime) {
        this.msgReadTime = msgReadTime;
    }

    public String getMsgSts() {
        return msgSts;
    }

    public void setMsgSts(String msgSts) {
        this.msgSts = msgSts == null ? null : msgSts.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgJumpUrl() {
        return msgJumpUrl;
    }

    public void setMsgJumpUrl(String msgJumpUrl) {
        this.msgJumpUrl = msgJumpUrl == null ? null : msgJumpUrl.trim();
    }
}