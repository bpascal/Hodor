package com.codido.hodor.model;

import java.util.Date;

public class MatchPlayInst {
    private Long matchPlayInstId;

    private Long matchPlayId;

    private String matchPlayName;

    private Long matchInfoId;

    private String matchPlayParam;

    private Integer matchPlayMinCount;

    private Integer matchPlayMaxCount;

    private String matchPlaySellingFlag;

    private String matchPlaySts;

    private Date matchPlayCreateTime;

    private Date matchPlayInvalidTime;

    private String matchResultOddsCode;

    public MatchPlayInst(Long matchPlayInstId, Long matchPlayId, String matchPlayName, Long matchInfoId, String matchPlayParam, Integer matchPlayMinCount, Integer matchPlayMaxCount, String matchPlaySellingFlag, String matchPlaySts, Date matchPlayCreateTime, Date matchPlayInvalidTime, String matchResultOddsCode) {
        this.matchPlayInstId = matchPlayInstId;
        this.matchPlayId = matchPlayId;
        this.matchPlayName = matchPlayName;
        this.matchInfoId = matchInfoId;
        this.matchPlayParam = matchPlayParam;
        this.matchPlayMinCount = matchPlayMinCount;
        this.matchPlayMaxCount = matchPlayMaxCount;
        this.matchPlaySellingFlag = matchPlaySellingFlag;
        this.matchPlaySts = matchPlaySts;
        this.matchPlayCreateTime = matchPlayCreateTime;
        this.matchPlayInvalidTime = matchPlayInvalidTime;
        this.matchResultOddsCode = matchResultOddsCode;
    }

    public MatchPlayInst() {
        super();
    }

    public Long getMatchPlayInstId() {
        return matchPlayInstId;
    }

    public void setMatchPlayInstId(Long matchPlayInstId) {
        this.matchPlayInstId = matchPlayInstId;
    }

    public Long getMatchPlayId() {
        return matchPlayId;
    }

    public void setMatchPlayId(Long matchPlayId) {
        this.matchPlayId = matchPlayId;
    }

    public String getMatchPlayName() {
        return matchPlayName;
    }

    public void setMatchPlayName(String matchPlayName) {
        this.matchPlayName = matchPlayName == null ? null : matchPlayName.trim();
    }

    public Long getMatchInfoId() {
        return matchInfoId;
    }

    public void setMatchInfoId(Long matchInfoId) {
        this.matchInfoId = matchInfoId;
    }

    public String getMatchPlayParam() {
        return matchPlayParam;
    }

    public void setMatchPlayParam(String matchPlayParam) {
        this.matchPlayParam = matchPlayParam == null ? null : matchPlayParam.trim();
    }

    public Integer getMatchPlayMinCount() {
        return matchPlayMinCount;
    }

    public void setMatchPlayMinCount(Integer matchPlayMinCount) {
        this.matchPlayMinCount = matchPlayMinCount;
    }

    public Integer getMatchPlayMaxCount() {
        return matchPlayMaxCount;
    }

    public void setMatchPlayMaxCount(Integer matchPlayMaxCount) {
        this.matchPlayMaxCount = matchPlayMaxCount;
    }

    public String getMatchPlaySellingFlag() {
        return matchPlaySellingFlag;
    }

    public void setMatchPlaySellingFlag(String matchPlaySellingFlag) {
        this.matchPlaySellingFlag = matchPlaySellingFlag == null ? null : matchPlaySellingFlag.trim();
    }

    public String getMatchPlaySts() {
        return matchPlaySts;
    }

    public void setMatchPlaySts(String matchPlaySts) {
        this.matchPlaySts = matchPlaySts == null ? null : matchPlaySts.trim();
    }

    public Date getMatchPlayCreateTime() {
        return matchPlayCreateTime;
    }

    public void setMatchPlayCreateTime(Date matchPlayCreateTime) {
        this.matchPlayCreateTime = matchPlayCreateTime;
    }

    public Date getMatchPlayInvalidTime() {
        return matchPlayInvalidTime;
    }

    public void setMatchPlayInvalidTime(Date matchPlayInvalidTime) {
        this.matchPlayInvalidTime = matchPlayInvalidTime;
    }

    public String getMatchResultOddsCode() {
        return matchResultOddsCode;
    }

    public void setMatchResultOddsCode(String matchResultOddsCode) {
        this.matchResultOddsCode = matchResultOddsCode == null ? null : matchResultOddsCode.trim();
    }
}