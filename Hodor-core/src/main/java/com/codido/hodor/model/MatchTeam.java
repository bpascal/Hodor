package com.codido.hodor.model;

public class MatchTeam {
    private Long teamId;

    private String teamName;

    private String teamShortName;

    private String teamIconUrl;

    private String teamDesc;

    private String teamAddress;

    private String teamSportType;

    private String teamSts;

    private String sportteryTeamId;

    public MatchTeam(Long teamId, String teamName, String teamShortName, String teamIconUrl, String teamDesc, String teamAddress, String teamSportType, String teamSts, String sportteryTeamId) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamShortName = teamShortName;
        this.teamIconUrl = teamIconUrl;
        this.teamDesc = teamDesc;
        this.teamAddress = teamAddress;
        this.teamSportType = teamSportType;
        this.teamSts = teamSts;
        this.sportteryTeamId = sportteryTeamId;
    }

    public MatchTeam() {
        super();
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamShortName() {
        return teamShortName;
    }

    public void setTeamShortName(String teamShortName) {
        this.teamShortName = teamShortName == null ? null : teamShortName.trim();
    }

    public String getTeamIconUrl() {
        return teamIconUrl;
    }

    public void setTeamIconUrl(String teamIconUrl) {
        this.teamIconUrl = teamIconUrl == null ? null : teamIconUrl.trim();
    }

    public String getTeamDesc() {
        return teamDesc;
    }

    public void setTeamDesc(String teamDesc) {
        this.teamDesc = teamDesc == null ? null : teamDesc.trim();
    }

    public String getTeamAddress() {
        return teamAddress;
    }

    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress == null ? null : teamAddress.trim();
    }

    public String getTeamSportType() {
        return teamSportType;
    }

    public void setTeamSportType(String teamSportType) {
        this.teamSportType = teamSportType == null ? null : teamSportType.trim();
    }

    public String getTeamSts() {
        return teamSts;
    }

    public void setTeamSts(String teamSts) {
        this.teamSts = teamSts == null ? null : teamSts.trim();
    }

    public String getSportteryTeamId() {
        return sportteryTeamId;
    }

    public void setSportteryTeamId(String sportteryTeamId) {
        this.sportteryTeamId = sportteryTeamId == null ? null : sportteryTeamId.trim();
    }
}