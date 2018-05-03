package com.codido.hodor.model;

import java.util.Date;

public class SmsCode {
    private Long smsCodeId;

    private String mblNo;

    private String smsType;

    private String smsCode;

    private String smsContent;

    private Date smsCodeCreateTime;

    private Date smsSendTime;

    private String smsCodeSts;

    private Integer errCount;

    private String logId;

    public SmsCode(Long smsCodeId, String mblNo, String smsType, String smsCode, String smsContent, Date smsCodeCreateTime, Date smsSendTime, String smsCodeSts, Integer errCount, String logId) {
        this.smsCodeId = smsCodeId;
        this.mblNo = mblNo;
        this.smsType = smsType;
        this.smsCode = smsCode;
        this.smsContent = smsContent;
        this.smsCodeCreateTime = smsCodeCreateTime;
        this.smsSendTime = smsSendTime;
        this.smsCodeSts = smsCodeSts;
        this.errCount = errCount;
        this.logId = logId;
    }

    public SmsCode() {
        super();
    }

    public Long getSmsCodeId() {
        return smsCodeId;
    }

    public void setSmsCodeId(Long smsCodeId) {
        this.smsCodeId = smsCodeId;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo == null ? null : mblNo.trim();
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType == null ? null : smsType.trim();
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode == null ? null : smsCode.trim();
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent == null ? null : smsContent.trim();
    }

    public Date getSmsCodeCreateTime() {
        return smsCodeCreateTime;
    }

    public void setSmsCodeCreateTime(Date smsCodeCreateTime) {
        this.smsCodeCreateTime = smsCodeCreateTime;
    }

    public Date getSmsSendTime() {
        return smsSendTime;
    }

    public void setSmsSendTime(Date smsSendTime) {
        this.smsSendTime = smsSendTime;
    }

    public String getSmsCodeSts() {
        return smsCodeSts;
    }

    public void setSmsCodeSts(String smsCodeSts) {
        this.smsCodeSts = smsCodeSts == null ? null : smsCodeSts.trim();
    }

    public Integer getErrCount() {
        return errCount;
    }

    public void setErrCount(Integer errCount) {
        this.errCount = errCount;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }
}