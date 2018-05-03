package com.codido.hodor.model;

import java.math.BigDecimal;

public class AccPlatAccount {
    private Long platAccountId;

    private Long accountTypeId;

    private BigDecimal amount;

    private String accountSts;

    public AccPlatAccount(Long platAccountId, Long accountTypeId, BigDecimal amount, String accountSts) {
        this.platAccountId = platAccountId;
        this.accountTypeId = accountTypeId;
        this.amount = amount;
        this.accountSts = accountSts;
    }

    public AccPlatAccount() {
        super();
    }

    public Long getPlatAccountId() {
        return platAccountId;
    }

    public void setPlatAccountId(Long platAccountId) {
        this.platAccountId = platAccountId;
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