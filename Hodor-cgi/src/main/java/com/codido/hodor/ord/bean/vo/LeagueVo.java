package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 联赛对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class LeagueVo implements Serializable {

    /**
     * 联盟ID
     */
    private String leagueId;

    /**
     * 联盟名称
     */
    private String leagueName;

    /**
     * 联盟图标URL
     */
    private String leagueIconUrl;

    public LeagueVo(String leagueId, String leagueName, String leagueIconUrl) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.leagueIconUrl = leagueIconUrl;
    }
}
