package com.codido.hodor.model;

import java.util.Date;

public class OrdChase {
    private Long chaseId;

    private String chaseNo;

    private Long userId;

    private Long lottoId;

    private String chaseSts;

    private Integer chaseTimes;

    private Integer chaseCurrentTimes;

    private String endMethod;

    private Integer perTimeAmt;

    private String perTimeBettingCounts;

    private Integer chaseBettingTimes;

    private Date chaseCreateTime;

    private Date chaseCancelTime;

    public OrdChase(Long chaseId, String chaseNo, Long userId, Long lottoId, String chaseSts, Integer chaseTimes, Integer chaseCurrentTimes, String endMethod, Integer perTimeAmt, String perTimeBettingCounts, Integer chaseBettingTimes, Date chaseCreateTime, Date chaseCancelTime) {
        this.chaseId = chaseId;
        this.chaseNo = chaseNo;
        this.userId = userId;
        this.lottoId = lottoId;
        this.chaseSts = chaseSts;
        this.chaseTimes = chaseTimes;
        this.chaseCurrentTimes = chaseCurrentTimes;
        this.endMethod = endMethod;
        this.perTimeAmt = perTimeAmt;
        this.perTimeBettingCounts = perTimeBettingCounts;
        this.chaseBettingTimes = chaseBettingTimes;
        this.chaseCreateTime = chaseCreateTime;
        this.chaseCancelTime = chaseCancelTime;
    }

    public OrdChase() {
        super();
    }

    public Long getChaseId() {
        return chaseId;
    }

    public void setChaseId(Long chaseId) {
        this.chaseId = chaseId;
    }

    public String getChaseNo() {
        return chaseNo;
    }

    public void setChaseNo(String chaseNo) {
        this.chaseNo = chaseNo == null ? null : chaseNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getChaseSts() {
        return chaseSts;
    }

    public void setChaseSts(String chaseSts) {
        this.chaseSts = chaseSts == null ? null : chaseSts.trim();
    }

    public Integer getChaseTimes() {
        return chaseTimes;
    }

    public void setChaseTimes(Integer chaseTimes) {
        this.chaseTimes = chaseTimes;
    }

    public Integer getChaseCurrentTimes() {
        return chaseCurrentTimes;
    }

    public void setChaseCurrentTimes(Integer chaseCurrentTimes) {
        this.chaseCurrentTimes = chaseCurrentTimes;
    }

    public String getEndMethod() {
        return endMethod;
    }

    public void setEndMethod(String endMethod) {
        this.endMethod = endMethod == null ? null : endMethod.trim();
    }

    public Integer getPerTimeAmt() {
        return perTimeAmt;
    }

    public void setPerTimeAmt(Integer perTimeAmt) {
        this.perTimeAmt = perTimeAmt;
    }

    public String getPerTimeBettingCounts() {
        return perTimeBettingCounts;
    }

    public void setPerTimeBettingCounts(String perTimeBettingCounts) {
        this.perTimeBettingCounts = perTimeBettingCounts == null ? null : perTimeBettingCounts.trim();
    }

    public Integer getChaseBettingTimes() {
        return chaseBettingTimes;
    }

    public void setChaseBettingTimes(Integer chaseBettingTimes) {
        this.chaseBettingTimes = chaseBettingTimes;
    }

    public Date getChaseCreateTime() {
        return chaseCreateTime;
    }

    public void setChaseCreateTime(Date chaseCreateTime) {
        this.chaseCreateTime = chaseCreateTime;
    }

    public Date getChaseCancelTime() {
        return chaseCancelTime;
    }

    public void setChaseCancelTime(Date chaseCancelTime) {
        this.chaseCancelTime = chaseCancelTime;
    }
}