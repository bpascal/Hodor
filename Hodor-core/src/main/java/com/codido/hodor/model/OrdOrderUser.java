package com.codido.hodor.model;

public class OrdOrderUser {
    private Long orderUserInstId;

    private String orderNo;

    private Long userId;

    private String orderUserType;

    private String orderUserSts;

    public OrdOrderUser(Long orderUserInstId, String orderNo, Long userId, String orderUserType, String orderUserSts) {
        this.orderUserInstId = orderUserInstId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.orderUserType = orderUserType;
        this.orderUserSts = orderUserSts;
    }

    public OrdOrderUser() {
        super();
    }

    public Long getOrderUserInstId() {
        return orderUserInstId;
    }

    public void setOrderUserInstId(Long orderUserInstId) {
        this.orderUserInstId = orderUserInstId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderUserType() {
        return orderUserType;
    }

    public void setOrderUserType(String orderUserType) {
        this.orderUserType = orderUserType == null ? null : orderUserType.trim();
    }

    public String getOrderUserSts() {
        return orderUserSts;
    }

    public void setOrderUserSts(String orderUserSts) {
        this.orderUserSts = orderUserSts == null ? null : orderUserSts.trim();
    }
}