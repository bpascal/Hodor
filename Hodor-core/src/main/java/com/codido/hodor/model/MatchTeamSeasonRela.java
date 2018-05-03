package com.codido.hodor.model;

import java.util.Date;

public class MatchTeamSeasonRela {
    private Long tSRelaId;

    private Long teamId;

    private Long seasonId;

    private Long leagueId;

    private String relaSts;

    private Integer teamSort;

    private Integer teamScore;

    private Date teamScoreUpdateTime;

    public MatchTeamSeasonRela(Long tSRelaId, Long teamId, Long seasonId, Long leagueId, String relaSts, Integer teamSort, Integer teamScore, Date teamScoreUpdateTime) {
        this.tSRelaId = tSRelaId;
        this.teamId = teamId;
        this.seasonId = seasonId;
        this.leagueId = leagueId;
        this.relaSts = relaSts;
        this.teamSort = teamSort;
        this.teamScore = teamScore;
        this.teamScoreUpdateTime = teamScoreUpdateTime;
    }

    public MatchTeamSeasonRela() {
        super();
    }

    public Long gettSRelaId() {
        return tSRelaId;
    }

    public void settSRelaId(Long tSRelaId) {
        this.tSRelaId = tSRelaId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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

    public String getRelaSts() {
        return relaSts;
    }

    public void setRelaSts(String relaSts) {
        this.relaSts = relaSts == null ? null : relaSts.trim();
    }

    public Integer getTeamSort() {
        return teamSort;
    }

    public void setTeamSort(Integer teamSort) {
        this.teamSort = teamSort;
    }

    public Integer getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    public Date getTeamScoreUpdateTime() {
        return teamScoreUpdateTime;
    }

    public void setTeamScoreUpdateTime(Date teamScoreUpdateTime) {
        this.teamScoreUpdateTime = teamScoreUpdateTime;
    }
}