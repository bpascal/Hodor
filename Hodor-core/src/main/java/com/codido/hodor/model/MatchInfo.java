package com.codido.hodor.model;

import java.util.Date;

public class MatchInfo {
    private Long matchInfoId;

    private String matchInfoCode;

    private String matchInfoName;

    private String matchInfoIconUrl;

    private String matchInfoDesc;

    private String matchAddress;

    private String matchWeather;

    private Long homeTeamId;

    private Long guestTeamId;

    private Date matchBeginTime;

    private String matchInfoSts;

    private String matchInfoResult;

    private String matchInfoScore;

    private String matchInfoHalftimeScore;

    private Long matchLottoId;

    private Long roundId;

    private Long seasonId;

    private Long leagueId;

    private String sportteryMatchInfoId;

    public MatchInfo(Long matchInfoId, String matchInfoCode, String matchInfoName, String matchInfoIconUrl, String matchInfoDesc, String matchAddress, String matchWeather, Long homeTeamId, Long guestTeamId, Date matchBeginTime, String matchInfoSts, String matchInfoResult, String matchInfoScore, String matchInfoHalftimeScore, Long matchLottoId, Long roundId, Long seasonId, Long leagueId, String sportteryMatchInfoId) {
        this.matchInfoId = matchInfoId;
        this.matchInfoCode = matchInfoCode;
        this.matchInfoName = matchInfoName;
        this.matchInfoIconUrl = matchInfoIconUrl;
        this.matchInfoDesc = matchInfoDesc;
        this.matchAddress = matchAddress;
        this.matchWeather = matchWeather;
        this.homeTeamId = homeTeamId;
        this.guestTeamId = guestTeamId;
        this.matchBeginTime = matchBeginTime;
        this.matchInfoSts = matchInfoSts;
        this.matchInfoResult = matchInfoResult;
        this.matchInfoScore = matchInfoScore;
        this.matchInfoHalftimeScore = matchInfoHalftimeScore;
        this.matchLottoId = matchLottoId;
        this.roundId = roundId;
        this.seasonId = seasonId;
        this.leagueId = leagueId;
        this.sportteryMatchInfoId = sportteryMatchInfoId;
    }

    public MatchInfo() {
        super();
    }

    public Long getMatchInfoId() {
        return matchInfoId;
    }

    public void setMatchInfoId(Long matchInfoId) {
        this.matchInfoId = matchInfoId;
    }

    public String getMatchInfoCode() {
        return matchInfoCode;
    }

    public void setMatchInfoCode(String matchInfoCode) {
        this.matchInfoCode = matchInfoCode == null ? null : matchInfoCode.trim();
    }

    public String getMatchInfoName() {
        return matchInfoName;
    }

    public void setMatchInfoName(String matchInfoName) {
        this.matchInfoName = matchInfoName == null ? null : matchInfoName.trim();
    }

    public String getMatchInfoIconUrl() {
        return matchInfoIconUrl;
    }

    public void setMatchInfoIconUrl(String matchInfoIconUrl) {
        this.matchInfoIconUrl = matchInfoIconUrl == null ? null : matchInfoIconUrl.trim();
    }

    public String getMatchInfoDesc() {
        return matchInfoDesc;
    }

    public void setMatchInfoDesc(String matchInfoDesc) {
        this.matchInfoDesc = matchInfoDesc == null ? null : matchInfoDesc.trim();
    }

    public String getMatchAddress() {
        return matchAddress;
    }

    public void setMatchAddress(String matchAddress) {
        this.matchAddress = matchAddress == null ? null : matchAddress.trim();
    }

    public String getMatchWeather() {
        return matchWeather;
    }

    public void setMatchWeather(String matchWeather) {
        this.matchWeather = matchWeather == null ? null : matchWeather.trim();
    }

    public Long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Long getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Long guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    public Date getMatchBeginTime() {
        return matchBeginTime;
    }

    public void setMatchBeginTime(Date matchBeginTime) {
        this.matchBeginTime = matchBeginTime;
    }

    public String getMatchInfoSts() {
        return matchInfoSts;
    }

    public void setMatchInfoSts(String matchInfoSts) {
        this.matchInfoSts = matchInfoSts == null ? null : matchInfoSts.trim();
    }

    public String getMatchInfoResult() {
        return matchInfoResult;
    }

    public void setMatchInfoResult(String matchInfoResult) {
        this.matchInfoResult = matchInfoResult == null ? null : matchInfoResult.trim();
    }

    public String getMatchInfoScore() {
        return matchInfoScore;
    }

    public void setMatchInfoScore(String matchInfoScore) {
        this.matchInfoScore = matchInfoScore == null ? null : matchInfoScore.trim();
    }

    public String getMatchInfoHalftimeScore() {
        return matchInfoHalftimeScore;
    }

    public void setMatchInfoHalftimeScore(String matchInfoHalftimeScore) {
        this.matchInfoHalftimeScore = matchInfoHalftimeScore == null ? null : matchInfoHalftimeScore.trim();
    }

    public Long getMatchLottoId() {
        return matchLottoId;
    }

    public void setMatchLottoId(Long matchLottoId) {
        this.matchLottoId = matchLottoId;
    }

    public Long getRoundId() {
        return roundId;
    }

    public void setRoundId(Long roundId) {
        this.roundId = roundId;
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

    public String getSportteryMatchInfoId() {
        return sportteryMatchInfoId;
    }

    public void setSportteryMatchInfoId(String sportteryMatchInfoId) {
        this.sportteryMatchInfoId = sportteryMatchInfoId == null ? null : sportteryMatchInfoId.trim();
    }
}