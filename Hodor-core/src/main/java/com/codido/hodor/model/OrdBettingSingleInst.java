package com.codido.hodor.model;

public class OrdBettingSingleInst {
    private Long singleInstId;

    private Long lottoInstId;

    private String periodName;

    private Long bettingInstId;

    private String singleInstNumber;

    private Integer singleInstTimes;

    private Long lottoBonusId;

    private String lottoBonusLevel;

    private String singleInstSts;

    private String singleInstBonusSts;

    private Long bonusAmt;

    public OrdBettingSingleInst(Long singleInstId, Long lottoInstId, String periodName, Long bettingInstId, String singleInstNumber, Integer singleInstTimes, Long lottoBonusId, String lottoBonusLevel, String singleInstSts, String singleInstBonusSts, Long bonusAmt) {
        this.singleInstId = singleInstId;
        this.lottoInstId = lottoInstId;
        this.periodName = periodName;
        this.bettingInstId = bettingInstId;
        this.singleInstNumber = singleInstNumber;
        this.singleInstTimes = singleInstTimes;
        this.lottoBonusId = lottoBonusId;
        this.lottoBonusLevel = lottoBonusLevel;
        this.singleInstSts = singleInstSts;
        this.singleInstBonusSts = singleInstBonusSts;
        this.bonusAmt = bonusAmt;
    }

    public OrdBettingSingleInst() {
        super();
    }

    public Long getSingleInstId() {
        return singleInstId;
    }

    public void setSingleInstId(Long singleInstId) {
        this.singleInstId = singleInstId;
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName == null ? null : periodName.trim();
    }

    public Long getBettingInstId() {
        return bettingInstId;
    }

    public void setBettingInstId(Long bettingInstId) {
        this.bettingInstId = bettingInstId;
    }

    public String getSingleInstNumber() {
        return singleInstNumber;
    }

    public void setSingleInstNumber(String singleInstNumber) {
        this.singleInstNumber = singleInstNumber == null ? null : singleInstNumber.trim();
    }

    public Integer getSingleInstTimes() {
        return singleInstTimes;
    }

    public void setSingleInstTimes(Integer singleInstTimes) {
        this.singleInstTimes = singleInstTimes;
    }

    public Long getLottoBonusId() {
        return lottoBonusId;
    }

    public void setLottoBonusId(Long lottoBonusId) {
        this.lottoBonusId = lottoBonusId;
    }

    public String getLottoBonusLevel() {
        return lottoBonusLevel;
    }

    public void setLottoBonusLevel(String lottoBonusLevel) {
        this.lottoBonusLevel = lottoBonusLevel == null ? null : lottoBonusLevel.trim();
    }

    public String getSingleInstSts() {
        return singleInstSts;
    }

    public void setSingleInstSts(String singleInstSts) {
        this.singleInstSts = singleInstSts == null ? null : singleInstSts.trim();
    }

    public String getSingleInstBonusSts() {
        return singleInstBonusSts;
    }

    public void setSingleInstBonusSts(String singleInstBonusSts) {
        this.singleInstBonusSts = singleInstBonusSts == null ? null : singleInstBonusSts.trim();
    }

    public Long getBonusAmt() {
        return bonusAmt;
    }

    public void setBonusAmt(Long bonusAmt) {
        this.bonusAmt = bonusAmt;
    }
}