package com.codido.hodor.model;

import java.util.Date;

public class MatchRound {
    private Long roundId;

    private Long leagueId;

    private Long seasonId;

    private String roundName;

    private String roundIconUrl;

    private String roundDesc;

    private Date roundBeginTime;

    private Date roundEndTime;

    private String roundSts;

    public MatchRound(Long roundId, Long leagueId, Long seasonId, String roundName, String roundIconUrl, String roundDesc, Date roundBeginTime, Date roundEndTime, String roundSts) {
        this.roundId = roundId;
        this.leagueId = leagueId;
        this.seasonId = seasonId;
        this.roundName = roundName;
        this.roundIconUrl = roundIconUrl;
        this.roundDesc = roundDesc;
        this.roundBeginTime = roundBeginTime;
        this.roundEndTime = roundEndTime;
        this.roundSts = roundSts;
    }

    public MatchRound() {
        super();
    }

    public Long getRoundId() {
        return roundId;
    }

    public void setRoundId(Long roundId) {
        this.roundId = roundId;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName == null ? null : roundName.trim();
    }

    public String getRoundIconUrl() {
        return roundIconUrl;
    }

    public void setRoundIconUrl(String roundIconUrl) {
        this.roundIconUrl = roundIconUrl == null ? null : roundIconUrl.trim();
    }

    public String getRoundDesc() {
        return roundDesc;
    }

    public void setRoundDesc(String roundDesc) {
        this.roundDesc = roundDesc == null ? null : roundDesc.trim();
    }

    public Date getRoundBeginTime() {
        return roundBeginTime;
    }

    public void setRoundBeginTime(Date roundBeginTime) {
        this.roundBeginTime = roundBeginTime;
    }

    public Date getRoundEndTime() {
        return roundEndTime;
    }

    public void setRoundEndTime(Date roundEndTime) {
        this.roundEndTime = roundEndTime;
    }

    public String getRoundSts() {
        return roundSts;
    }

    public void setRoundSts(String roundSts) {
        this.roundSts = roundSts == null ? null : roundSts.trim();
    }
}