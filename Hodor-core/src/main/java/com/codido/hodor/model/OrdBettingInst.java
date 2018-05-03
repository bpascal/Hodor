package com.codido.hodor.model;

import java.util.Date;

public class OrdBettingInst {
    private Long bettingInstId;

    private Long lottoInstId;

    private Long userId;

    private String chooseNumber;

    private String bettingType;

    private Date chooseTime;

    private Integer bettingCounts;

    private Integer bettingAmt;

    private Long matchId;

    private Integer numberTimes;

    private String bettingInstSts;

    private String bettingBonusSts;

    private Long bettingInstAmt;

    private String orderNo;

    public OrdBettingInst(Long bettingInstId, Long lottoInstId, Long userId, String chooseNumber, String bettingType, Date chooseTime, Integer bettingCounts, Integer bettingAmt, Long matchId, Integer numberTimes, String bettingInstSts, String bettingBonusSts, Long bettingInstAmt, String orderNo) {
        this.bettingInstId = bettingInstId;
        this.lottoInstId = lottoInstId;
        this.userId = userId;
        this.chooseNumber = chooseNumber;
        this.bettingType = bettingType;
        this.chooseTime = chooseTime;
        this.bettingCounts = bettingCounts;
        this.bettingAmt = bettingAmt;
        this.matchId = matchId;
        this.numberTimes = numberTimes;
        this.bettingInstSts = bettingInstSts;
        this.bettingBonusSts = bettingBonusSts;
        this.bettingInstAmt = bettingInstAmt;
        this.orderNo = orderNo;
    }

    public OrdBettingInst() {
        super();
    }

    public Long getBettingInstId() {
        return bettingInstId;
    }

    public void setBettingInstId(Long bettingInstId) {
        this.bettingInstId = bettingInstId;
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Date getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(Date chooseTime) {
        this.chooseTime = chooseTime;
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

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
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

    public String getBettingBonusSts() {
        return bettingBonusSts;
    }

    public void setBettingBonusSts(String bettingBonusSts) {
        this.bettingBonusSts = bettingBonusSts == null ? null : bettingBonusSts.trim();
    }

    public Long getBettingInstAmt() {
        return bettingInstAmt;
    }

    public void setBettingInstAmt(Long bettingInstAmt) {
        this.bettingInstAmt = bettingInstAmt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }
}