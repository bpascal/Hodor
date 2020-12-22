package com.codido.hodor.core.model;

import java.math.BigDecimal;

public class CfgAgent {
    private Long agentId;

    private String agentName;

    private String agentTicketType;

    private String agentSts;

    private String agentCreateTime;

    private String payType;

    private BigDecimal totalChargeAmount;

    private BigDecimal totalPayAmount;

    private BigDecimal currentBalance;

    private String agentIpAddress;

    public CfgAgent(Long agentId, String agentName, String agentTicketType, String agentSts, String agentCreateTime, String payType, BigDecimal totalChargeAmount, BigDecimal totalPayAmount, BigDecimal currentBalance, String agentIpAddress) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.agentTicketType = agentTicketType;
        this.agentSts = agentSts;
        this.agentCreateTime = agentCreateTime;
        this.payType = payType;
        this.totalChargeAmount = totalChargeAmount;
        this.totalPayAmount = totalPayAmount;
        this.currentBalance = currentBalance;
        this.agentIpAddress = agentIpAddress;
    }

    public CfgAgent() {
        super();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentTicketType() {
        return agentTicketType;
    }

    public void setAgentTicketType(String agentTicketType) {
        this.agentTicketType = agentTicketType == null ? null : agentTicketType.trim();
    }

    public String getAgentSts() {
        return agentSts;
    }

    public void setAgentSts(String agentSts) {
        this.agentSts = agentSts == null ? null : agentSts.trim();
    }

    public String getAgentCreateTime() {
        return agentCreateTime;
    }

    public void setAgentCreateTime(String agentCreateTime) {
        this.agentCreateTime = agentCreateTime == null ? null : agentCreateTime.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public BigDecimal getTotalChargeAmount() {
        return totalChargeAmount;
    }

    public void setTotalChargeAmount(BigDecimal totalChargeAmount) {
        this.totalChargeAmount = totalChargeAmount;
    }

    public BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }

    public void setTotalPayAmount(BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAgentIpAddress() {
        return agentIpAddress;
    }

    public void setAgentIpAddress(String agentIpAddress) {
        this.agentIpAddress = agentIpAddress == null ? null : agentIpAddress.trim();
    }
}