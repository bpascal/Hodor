package com.codido.hodor.model;

import java.util.Date;

public class MatchSeason {
    private Long seasonId;

    private Long leagueId;

    private String seasonName;

    private String seasonIconUrl;

    private Long currentRoundId;

    private Date seasonBeginTime;

    private Date seasonEndTime;

    private String seasonSts;

    public MatchSeason(Long seasonId, Long leagueId, String seasonName, String seasonIconUrl, Long currentRoundId, Date seasonBeginTime, Date seasonEndTime, String seasonSts) {
        this.seasonId = seasonId;
        this.leagueId = leagueId;
        this.seasonName = seasonName;
        this.seasonIconUrl = seasonIconUrl;
        this.currentRoundId = currentRoundId;
        this.seasonBeginTime = seasonBeginTime;
        this.seasonEndTime = seasonEndTime;
        this.seasonSts = seasonSts;
    }

    public MatchSeason() {
        super();
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName == null ? null : seasonName.trim();
    }

    public String getSeasonIconUrl() {
        return seasonIconUrl;
    }

    public void setSeasonIconUrl(String seasonIconUrl) {
        this.seasonIconUrl = seasonIconUrl == null ? null : seasonIconUrl.trim();
    }

    public Long getCurrentRoundId() {
        return currentRoundId;
    }

    public void setCurrentRoundId(Long currentRoundId) {
        this.currentRoundId = currentRoundId;
    }

    public Date getSeasonBeginTime() {
        return seasonBeginTime;
    }

    public void setSeasonBeginTime(Date seasonBeginTime) {
        this.seasonBeginTime = seasonBeginTime;
    }

    public Date getSeasonEndTime() {
        return seasonEndTime;
    }

    public void setSeasonEndTime(Date seasonEndTime) {
        this.seasonEndTime = seasonEndTime;
    }

    public String getSeasonSts() {
        return seasonSts;
    }

    public void setSeasonSts(String seasonSts) {
        this.seasonSts = seasonSts == null ? null : seasonSts.trim();
    }
}