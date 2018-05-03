package com.codido.hodor.common.dto;

/**
 * 联赛资料枚举类
 */
public enum Team {

    达拉斯独行侠(null, "达拉斯独行侠", "独行侠");


    /**
     * 联赛ID
     */
    private Long teamId;

    /**
     * 联赛名称
     */
    private String teamName;

    /**
     * 联赛简称
     */
    private String teamShortName;


    /**
     * 构造方法
     *
     * @param teamId
     * @param teamName
     * @param teamShortName
     */
    private Team(Long teamId, String teamName, String teamShortName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamShortName = teamShortName;
    }


    /**
     * 获取短名称
     *
     * @param teamName
     * @return
     */
    public static String getTeamShortName(String teamName) {
        for (Team c : Team.values()) {
            if (c.teamName.equals(teamName)) {
                return c.teamShortName;
            }
        }
        return teamName;
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
        this.teamName = teamName;
    }

    public String getTeamShortName() {
        return teamShortName;
    }

    public void setTeamShortName(String teamShortName) {
        this.teamShortName = teamShortName;
    }
}
