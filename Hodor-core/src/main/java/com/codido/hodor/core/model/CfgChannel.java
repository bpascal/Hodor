package com.codido.hodor.core.model;

import java.math.BigDecimal;
import java.util.Date;

public class CfgChannel {
    private Long channelId;

    private String channelName;

    private String channelSts;

    private String channelType;

    private Date channelCreateTime;

    private BigDecimal channelRechargeAmount;

    private BigDecimal channelPayAmount;

    private BigDecimal channelCurrentBalance;

    private String channelInterfaceStyle;

    private String orderActionUrl;

    private String orderQueryUrl;

    public CfgChannel(Long channelId, String channelName, String channelSts, String channelType, Date channelCreateTime, BigDecimal channelRechargeAmount, BigDecimal channelPayAmount, BigDecimal channelCurrentBalance, String channelInterfaceStyle, String orderActionUrl, String orderQueryUrl) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.channelSts = channelSts;
        this.channelType = channelType;
        this.channelCreateTime = channelCreateTime;
        this.channelRechargeAmount = channelRechargeAmount;
        this.channelPayAmount = channelPayAmount;
        this.channelCurrentBalance = channelCurrentBalance;
        this.channelInterfaceStyle = channelInterfaceStyle;
        this.orderActionUrl = orderActionUrl;
        this.orderQueryUrl = orderQueryUrl;
    }

    public CfgChannel() {
        super();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelSts() {
        return channelSts;
    }

    public void setChannelSts(String channelSts) {
        this.channelSts = channelSts == null ? null : channelSts.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public Date getChannelCreateTime() {
        return channelCreateTime;
    }

    public void setChannelCreateTime(Date channelCreateTime) {
        this.channelCreateTime = channelCreateTime;
    }

    public BigDecimal getChannelRechargeAmount() {
        return channelRechargeAmount;
    }

    public void setChannelRechargeAmount(BigDecimal channelRechargeAmount) {
        this.channelRechargeAmount = channelRechargeAmount;
    }

    public BigDecimal getChannelPayAmount() {
        return channelPayAmount;
    }

    public void setChannelPayAmount(BigDecimal channelPayAmount) {
        this.channelPayAmount = channelPayAmount;
    }

    public BigDecimal getChannelCurrentBalance() {
        return channelCurrentBalance;
    }

    public void setChannelCurrentBalance(BigDecimal channelCurrentBalance) {
        this.channelCurrentBalance = channelCurrentBalance;
    }

    public String getChannelInterfaceStyle() {
        return channelInterfaceStyle;
    }

    public void setChannelInterfaceStyle(String channelInterfaceStyle) {
        this.channelInterfaceStyle = channelInterfaceStyle == null ? null : channelInterfaceStyle.trim();
    }

    public String getOrderActionUrl() {
        return orderActionUrl;
    }

    public void setOrderActionUrl(String orderActionUrl) {
        this.orderActionUrl = orderActionUrl == null ? null : orderActionUrl.trim();
    }

    public String getOrderQueryUrl() {
        return orderQueryUrl;
    }

    public void setOrderQueryUrl(String orderQueryUrl) {
        this.orderQueryUrl = orderQueryUrl == null ? null : orderQueryUrl.trim();
    }
}