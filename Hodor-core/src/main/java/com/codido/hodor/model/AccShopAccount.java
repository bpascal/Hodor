package com.codido.hodor.model;

import java.math.BigDecimal;

public class AccShopAccount {
    private Long shopAccountId;

    private Long shopId;

    private Long accountTypeId;

    private BigDecimal amount;

    private String accountSts;

    public AccShopAccount(Long shopAccountId, Long shopId, Long accountTypeId, BigDecimal amount, String accountSts) {
        this.shopAccountId = shopAccountId;
        this.shopId = shopId;
        this.accountTypeId = accountTypeId;
        this.amount = amount;
        this.accountSts = accountSts;
    }

    public AccShopAccount() {
        super();
    }

    public Long getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Long shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAccountSts() {
        return accountSts;
    }

    public void setAccountSts(String accountSts) {
        this.accountSts = accountSts == null ? null : accountSts.trim();
    }
}