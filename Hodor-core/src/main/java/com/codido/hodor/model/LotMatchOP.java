package com.codido.hodor.model;

import java.util.Date;

public class LotMatchOP {
    private Long matchId;

    private String matchName;

    private String matchCode;

    private String outMatchId;

    private String matchType;

    private String matchLeagueCode;

    private String matchLeagueName;

    private String matchLeagueIconUrl;

    private Date matchTime;

    private String matchSts;

    private Long homeTeamId;

    private String homeTeamName;

    private String homeTeamIconUrl;

    private Long guestTeamId;

    private String guestTeamName;

    private String guestTeamIconUrl;

    private String homeWinOdds;

    private String homeLostOdds;

    private String homeDrawOdds;

    private String matchResult;

    private String halfTimeScore;

    private String matchScore;

    private Long matchInfoId;

    private MatchInfo matchInfo;

    public LotMatchOP(Long matchId, String matchName, String matchCode, String outMatchId, String matchType, String matchLeagueCode, String matchLeagueName, String matchLeagueIconUrl, Date matchTime, String matchSts, Long homeTeamId, String homeTeamName, String homeTeamIconUrl, Long guestTeamId, String guestTeamName, String guestTeamIconUrl, String homeWinOdds, String homeLostOdds, String homeDrawOdds, String matchResult, String halfTimeScore, String matchScore, Long matchInfoId) {
        this.matchId = matchId;
        this.matchName = matchName;
        this.matchCode = matchCode;
        this.outMatchId = outMatchId;
        this.matchType = matchType;
        this.matchLeagueCode = matchLeagueCode;
        this.matchLeagueName = matchLeagueName;
        this.matchLeagueIconUrl = matchLeagueIconUrl;
        this.matchTime = matchTime;
        this.matchSts = matchSts;
        this.homeTeamId = homeTeamId;
        this.homeTeamName = homeTeamName;
        this.homeTeamIconUrl = homeTeamIconUrl;
        this.guestTeamId = guestTeamId;
        this.guestTeamName = guestTeamName;
        this.guestTeamIconUrl = guestTeamIconUrl;
        this.homeWinOdds = homeWinOdds;
        this.homeLostOdds = homeLostOdds;
        this.homeDrawOdds = homeDrawOdds;
        this.matchResult = matchResult;
        this.halfTimeScore = halfTimeScore;
        this.matchScore = matchScore;
        this.matchInfoId = matchInfoId;
    }

    public LotMatchOP() {
        super();
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode == null ? null : matchCode.trim();
    }

    public String getOutMatchId() {
        return outMatchId;
    }

    public void setOutMatchId(String outMatchId) {
        this.outMatchId = outMatchId == null ? null : outMatchId.trim();
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType == null ? null : matchType.trim();
    }

    public String getMatchLeagueCode() {
        return matchLeagueCode;
    }

    public void setMatchLeagueCode(String matchLeagueCode) {
        this.matchLeagueCode = matchLeagueCode == null ? null : matchLeagueCode.trim();
    }

    public String getMatchLeagueName() {
        return matchLeagueName;
    }

    public void setMatchLeagueName(String matchLeagueName) {
        this.matchLeagueName = matchLeagueName == null ? null : matchLeagueName.trim();
    }

    public String getMatchLeagueIconUrl() {
        return matchLeagueIconUrl;
    }

    public void setMatchLeagueIconUrl(String matchLeagueIconUrl) {
        this.matchLeagueIconUrl = matchLeagueIconUrl == null ? null : matchLeagueIconUrl.trim();
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchSts() {
        return matchSts;
    }

    public void setMatchSts(String matchSts) {
        this.matchSts = matchSts == null ? null : matchSts.trim();
    }

    public Long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName == null ? null : homeTeamName.trim();
    }

    public String getHomeTeamIconUrl() {
        return homeTeamIconUrl;
    }

    public void setHomeTeamIconUrl(String homeTeamIconUrl) {
        this.homeTeamIconUrl = homeTeamIconUrl == null ? null : homeTeamIconUrl.trim();
    }

    public Long getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Long guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    public String getGuestTeamName() {
        return guestTeamName;
    }

    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName == null ? null : guestTeamName.trim();
    }

    public String getGuestTeamIconUrl() {
        return guestTeamIconUrl;
    }

    public void setGuestTeamIconUrl(String guestTeamIconUrl) {
        this.guestTeamIconUrl = guestTeamIconUrl == null ? null : guestTeamIconUrl.trim();
    }

    public String getHomeWinOdds() {
        return homeWinOdds;
    }

    public void setHomeWinOdds(String homeWinOdds) {
        this.homeWinOdds = homeWinOdds == null ? null : homeWinOdds.trim();
    }

    public String getHomeLostOdds() {
        return homeLostOdds;
    }

    public void setHomeLostOdds(String homeLostOdds) {
        this.homeLostOdds = homeLostOdds == null ? null : homeLostOdds.trim();
    }

    public String getHomeDrawOdds() {
        return homeDrawOdds;
    }

    public void setHomeDrawOdds(String homeDrawOdds) {
        this.homeDrawOdds = homeDrawOdds == null ? null : homeDrawOdds.trim();
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult == null ? null : matchResult.trim();
    }

    public String getHalfTimeScore() {
        return halfTimeScore;
    }

    public void setHalfTimeScore(String halfTimeScore) {
        this.halfTimeScore = halfTimeScore == null ? null : halfTimeScore.trim();
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore == null ? null : matchScore.trim();
    }

    public Long getMatchInfoId() {
        return matchInfoId;
    }

    public void setMatchInfoId(Long matchInfoId) {
        this.matchInfoId = matchInfoId;
    }

    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }
}