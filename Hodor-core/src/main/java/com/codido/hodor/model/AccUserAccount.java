package com.codido.hodor.model;

import java.math.BigDecimal;

public class AccUserAccount {
    private Long userAccountId;

    private Long userId;

    private Long accountTypeId;

    private BigDecimal amount;

    private String accountSts;

    public AccUserAccount(Long userAccountId, Long userId, Long accountTypeId, BigDecimal amount, String accountSts) {
        this.userAccountId = userAccountId;
        this.userId = userId;
        this.accountTypeId = accountTypeId;
        this.amount = amount;
        this.accountSts = accountSts;
    }

    public AccUserAccount() {
        super();
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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