package com.codido.hodor.model;

public class CmmBank {
    private Long bankId;

    private String bankName;

    private String bankLogoUrl;

    private String bankCode;

    public CmmBank(Long bankId, String bankName, String bankLogoUrl, String bankCode) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankLogoUrl = bankLogoUrl;
        this.bankCode = bankCode;
    }

    public CmmBank() {
        super();
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankLogoUrl() {
        return bankLogoUrl;
    }

    public void setBankLogoUrl(String bankLogoUrl) {
        this.bankLogoUrl = bankLogoUrl == null ? null : bankLogoUrl.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }
}