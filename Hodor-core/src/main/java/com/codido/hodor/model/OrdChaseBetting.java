package com.codido.hodor.model;

public class OrdChaseBetting {
    private Long chaseBettingId;

    private String chaseNo;

    private String chooseNumber;

    private String bettingType;

    private Integer bettingCounts;

    private Integer bettingAmt;

    private Integer numberTimes;

    private String bettingInstSts;

    public OrdChaseBetting(Long chaseBettingId, String chaseNo, String chooseNumber, String bettingType, Integer bettingCounts, Integer bettingAmt, Integer numberTimes, String bettingInstSts) {
        this.chaseBettingId = chaseBettingId;
        this.chaseNo = chaseNo;
        this.chooseNumber = chooseNumber;
        this.bettingType = bettingType;
        this.bettingCounts = bettingCounts;
        this.bettingAmt = bettingAmt;
        this.numberTimes = numberTimes;
        this.bettingInstSts = bettingInstSts;
    }

    public OrdChaseBetting() {
        super();
    }

    public Long getChaseBettingId() {
        return chaseBettingId;
    }

    public void setChaseBettingId(Long chaseBettingId) {
        this.chaseBettingId = chaseBettingId;
    }

    public String getChaseNo() {
        return chaseNo;
    }

    public void setChaseNo(String chaseNo) {
        this.chaseNo = chaseNo == null ? null : chaseNo.trim();
    }

    public String getChooseNumber() {
        return chooseNumber;
    }

    public void setChooseNumber(String chooseNumber) {
        this.chooseNumber = chooseNumber == null ? null : chooseNumber.trim();
    }

    public String getBettingType() {
        return bettingType;
    }

    public void setBettingType(String bettingType) {
        this.bettingType = bettingType == null ? null : bettingType.trim();
    }

    public Integer getBettingCounts() {
        return bettingCounts;
    }

    public void setBettingCounts(Integer bettingCounts) {
        this.bettingCounts = bettingCounts;
    }

    public Integer getBettingAmt() {
        return bettingAmt;
    }

    public void setBettingAmt(Integer bettingAmt) {
        this.bettingAmt = bettingAmt;
    }

    public Integer getNumberTimes() {
        return numberTimes;
    }

    public void setNumberTimes(Integer numberTimes) {
        this.numberTimes = numberTimes;
    }

    public String getBettingInstSts() {
        return bettingInstSts;
    }

    public void setBettingInstSts(String bettingInstSts) {
        this.bettingInstSts = bettingInstSts == null ? null : bettingInstSts.trim();
    }
}