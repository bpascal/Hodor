package com.codido.hodor.model;

public class MatchLeague {
    private Long leagueId;

    private String leagueName;

    private String leagueShotName;

    private String leagueDesc;

    private String leagueIconUrl;

    private String leagueType;

    private String leagueSportType;

    private String leagueSts;

    public MatchLeague(Long leagueId, String leagueName, String leagueShotName, String leagueDesc, String leagueIconUrl, String leagueType, String leagueSportType, String leagueSts) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.leagueShotName = leagueShotName;
        this.leagueDesc = leagueDesc;
        this.leagueIconUrl = leagueIconUrl;
        this.leagueType = leagueType;
        this.leagueSportType = leagueSportType;
        this.leagueSts = leagueSts;
    }

    public MatchLeague() {
        super();
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName == null ? null : leagueName.trim();
    }

    public String getLeagueShotName() {
        return leagueShotName;
    }

    public void setLeagueShotName(String leagueShotName) {
        this.leagueShotName = leagueShotName == null ? null : leagueShotName.trim();
    }

    public String getLeagueDesc() {
        return leagueDesc;
    }

    public void setLeagueDesc(String leagueDesc) {
        this.leagueDesc = leagueDesc == null ? null : leagueDesc.trim();
    }

    public String getLeagueIconUrl() {
        return leagueIconUrl;
    }

    public void setLeagueIconUrl(String leagueIconUrl) {
        this.leagueIconUrl = leagueIconUrl == null ? null : leagueIconUrl.trim();
    }

    public String getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(String leagueType) {
        this.leagueType = leagueType == null ? null : leagueType.trim();
    }

    public String getLeagueSportType() {
        return leagueSportType;
    }

    public void setLeagueSportType(String leagueSportType) {
        this.leagueSportType = leagueSportType == null ? null : leagueSportType.trim();
    }

    public String getLeagueSts() {
        return leagueSts;
    }

    public void setLeagueSts(String leagueSts) {
        this.leagueSts = leagueSts == null ? null : leagueSts.trim();
    }
}