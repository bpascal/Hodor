package com.codido.hodor.model;

import java.util.Date;

public class OrdRefund {
    private Long refundId;

    private String refundNo;

    private String payOrderNo;

    private Date refundCreateTime;

    private Date refundTime;

    private String refundSts;

    private String payRefundId;

    public OrdRefund(Long refundId, String refundNo, String payOrderNo, Date refundCreateTime, Date refundTime, String refundSts, String payRefundId) {
        this.refundId = refundId;
        this.refundNo = refundNo;
        this.payOrderNo = payOrderNo;
        this.refundCreateTime = refundCreateTime;
        this.refundTime = refundTime;
        this.refundSts = refundSts;
        this.payRefundId = payRefundId;
    }

    public OrdRefund() {
        super();
    }

    public Long getRefundId() {
        return refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo == null ? null : payOrderNo.trim();
    }

    public Date getRefundCreateTime() {
        return refundCreateTime;
    }

    public void setRefundCreateTime(Date refundCreateTime) {
        this.refundCreateTime = refundCreateTime;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getRefundSts() {
        return refundSts;
    }

    public void setRefundSts(String refundSts) {
        this.refundSts = refundSts == null ? null : refundSts.trim();
    }

    public String getPayRefundId() {
        return payRefundId;
    }

    public void setPayRefundId(String payRefundId) {
        this.payRefundId = payRefundId == null ? null : payRefundId.trim();
    }
}