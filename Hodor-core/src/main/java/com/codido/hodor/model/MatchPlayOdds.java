package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.Date;

public class MatchPlayOdds {
    private Long oddsId;

    private Long matchPlayInstId;

    private String oddsName;

    private String oddsCode;

    private String oddsParamName;

    private String oddsParamValue;

    private BigDecimal oddsValue;

    private String oddsSts;

    private String oddsTrend;

    private Date oddsCreateTime;

    private Date oddsInvalidTime;

    public MatchPlayOdds(Long oddsId, Long matchPlayInstId, String oddsName, String oddsCode, String oddsParamName, String oddsParamValue, BigDecimal oddsValue, String oddsSts, String oddsTrend, Date oddsCreateTime, Date oddsInvalidTime) {
        this.oddsId = oddsId;
        this.matchPlayInstId = matchPlayInstId;
        this.oddsName = oddsName;
        this.oddsCode = oddsCode;
        this.oddsParamName = oddsParamName;
        this.oddsParamValue = oddsParamValue;
        this.oddsValue = oddsValue;
        this.oddsSts = oddsSts;
        this.oddsTrend = oddsTrend;
        this.oddsCreateTime = oddsCreateTime;
        this.oddsInvalidTime = oddsInvalidTime;
    }

    public MatchPlayOdds() {
        super();
    }

    public Long getOddsId() {
        return oddsId;
    }

    public void setOddsId(Long oddsId) {
        this.oddsId = oddsId;
    }

    public Long getMatchPlayInstId() {
        return matchPlayInstId;
    }

    public void setMatchPlayInstId(Long matchPlayInstId) {
        this.matchPlayInstId = matchPlayInstId;
    }

    public String getOddsName() {
        return oddsName;
    }

    public void setOddsName(String oddsName) {
        this.oddsName = oddsName == null ? null : oddsName.trim();
    }

    public String getOddsCode() {
        return oddsCode;
    }

    public void setOddsCode(String oddsCode) {
        this.oddsCode = oddsCode == null ? null : oddsCode.trim();
    }

    public String getOddsParamName() {
        return oddsParamName;
    }

    public void setOddsParamName(String oddsParamName) {
        this.oddsParamName = oddsParamName == null ? null : oddsParamName.trim();
    }

    public String getOddsParamValue() {
        return oddsParamValue;
    }

    public void setOddsParamValue(String oddsParamValue) {
        this.oddsParamValue = oddsParamValue == null ? null : oddsParamValue.trim();
    }

    public BigDecimal getOddsValue() {
        return oddsValue;
    }

    public void setOddsValue(BigDecimal oddsValue) {
        this.oddsValue = oddsValue;
    }

    public String getOddsSts() {
        return oddsSts;
    }

    public void setOddsSts(String oddsSts) {
        this.oddsSts = oddsSts == null ? null : oddsSts.trim();
    }

    public String getOddsTrend() {
        return oddsTrend;
    }

    public void setOddsTrend(String oddsTrend) {
        this.oddsTrend = oddsTrend == null ? null : oddsTrend.trim();
    }

    public Date getOddsCreateTime() {
        return oddsCreateTime;
    }

    public void setOddsCreateTime(Date oddsCreateTime) {
        this.oddsCreateTime = oddsCreateTime;
    }

    public Date getOddsInvalidTime() {
        return oddsInvalidTime;
    }

    public void setOddsInvalidTime(Date oddsInvalidTime) {
        this.oddsInvalidTime = oddsInvalidTime;
    }
}