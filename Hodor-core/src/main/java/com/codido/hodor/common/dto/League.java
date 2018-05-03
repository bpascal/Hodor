package com.codido.hodor.common.dto;

/**
 * 联赛资料枚举类
 */
public enum League {

    NBA(null, "美国职业篮球联盟", "NBA"),
    EROBASKET(null, "欧洲篮球联赛", "欧洲篮球联赛"),
    ENGSUP(null, "英格兰超级联赛", "英超"),
    SCLSUP(null, "苏格兰超级联赛", "苏超"),
    ASIACHAMPCUP(null, "亚洲冠军联赛", "亚冠");


    /**
     * 联赛ID
     */
    private Long leagueId;

    /**
     * 联赛名称
     */
    private String leagueName;

    /**
     * 联赛简称
     */
    private String leagueShortName;


    /**
     * 构造方法
     *
     * @param leagueId
     * @param leagueName
     * @param leagueShortName
     */
    private League(Long leagueId, String leagueName, String leagueShortName) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.leagueShortName = leagueShortName;
    }


    /**
     * 获取短名称
     *
     * @param leagueName
     * @return
     */
    public static String getShortName(String leagueName) {
        for (League c : League.values()) {
            if (c.leagueName.equals(leagueName)) {
                return c.leagueShortName;
            }
        }
        return leagueName;
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
        this.leagueName = leagueName;
    }

    public String getLeagueShortName() {
        return leagueShortName;
    }

    public void setLeagueShortName(String leagueShortName) {
        this.leagueShortName = leagueShortName;
    }
}
