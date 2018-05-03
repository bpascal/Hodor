package com.codido.hodor.model;

import java.util.Date;

public class LotInst {
    private Long lottoInstId;

    private Long lottoId;

    private String periodName;

    private Date periodBeginTime;

    private Date periodEndTime;

    private Date periodBonusTime;

    private String periodSts;

    private String periodTags;

    private String periodTagsName;

    private String periodBonusNumber;

    private String periodTotalSell;

    private String periodTotalBonus;

    private String periodTotalBonusDesc;

    public LotInst(Long lottoInstId, Long lottoId, String periodName, Date periodBeginTime, Date periodEndTime, Date periodBonusTime, String periodSts, String periodTags, String periodTagsName, String periodBonusNumber, String periodTotalSell, String periodTotalBonus, String periodTotalBonusDesc) {
        this.lottoInstId = lottoInstId;
        this.lottoId = lottoId;
        this.periodName = periodName;
        this.periodBeginTime = periodBeginTime;
        this.periodEndTime = periodEndTime;
        this.periodBonusTime = periodBonusTime;
        this.periodSts = periodSts;
        this.periodTags = periodTags;
        this.periodTagsName = periodTagsName;
        this.periodBonusNumber = periodBonusNumber;
        this.periodTotalSell = periodTotalSell;
        this.periodTotalBonus = periodTotalBonus;
        this.periodTotalBonusDesc = periodTotalBonusDesc;
    }

    public LotInst() {
        super();
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName == null ? null : periodName.trim();
    }

    public Date getPeriodBeginTime() {
        return periodBeginTime;
    }

    public void setPeriodBeginTime(Date periodBeginTime) {
        this.periodBeginTime = periodBeginTime;
    }

    public Date getPeriodEndTime() {
        return periodEndTime;
    }

    public void setPeriodEndTime(Date periodEndTime) {
        this.periodEndTime = periodEndTime;
    }

    public Date getPeriodBonusTime() {
        return periodBonusTime;
    }

    public void setPeriodBonusTime(Date periodBonusTime) {
        this.periodBonusTime = periodBonusTime;
    }

    public String getPeriodSts() {
        return periodSts;
    }

    public void setPeriodSts(String periodSts) {
        this.periodSts = periodSts == null ? null : periodSts.trim();
    }

    public String getPeriodTags() {
        return periodTags;
    }

    public void setPeriodTags(String periodTags) {
        this.periodTags = periodTags == null ? null : periodTags.trim();
    }

    public String getPeriodTagsName() {
        return periodTagsName;
    }

    public void setPeriodTagsName(String periodTagsName) {
        this.periodTagsName = periodTagsName == null ? null : periodTagsName.trim();
    }

    public String getPeriodBonusNumber() {
        return periodBonusNumber;
    }

    public void setPeriodBonusNumber(String periodBonusNumber) {
        this.periodBonusNumber = periodBonusNumber == null ? null : periodBonusNumber.trim();
    }

    public String getPeriodTotalSell() {
        return periodTotalSell;
    }

    public void setPeriodTotalSell(String periodTotalSell) {
        this.periodTotalSell = periodTotalSell == null ? null : periodTotalSell.trim();
    }

    public String getPeriodTotalBonus() {
        return periodTotalBonus;
    }

    public void setPeriodTotalBonus(String periodTotalBonus) {
        this.periodTotalBonus = periodTotalBonus == null ? null : periodTotalBonus.trim();
    }

    public String getPeriodTotalBonusDesc() {
        return periodTotalBonusDesc;
    }

    public void setPeriodTotalBonusDesc(String periodTotalBonusDesc) {
        this.periodTotalBonusDesc = periodTotalBonusDesc == null ? null : periodTotalBonusDesc.trim();
    }
}