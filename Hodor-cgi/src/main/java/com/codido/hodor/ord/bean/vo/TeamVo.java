package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 球队对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class TeamVo implements Serializable {
    /**
     * 队伍ID
     */
    private String teamId;

    /**
     * 队伍名称
     */
    private String teamName;

    /**
     * 队伍图标URL
     */
    private String teamIconUrl;

    public TeamVo(String teamId, String teamName, String teamIconUrl) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamIconUrl = teamIconUrl;
    }
}
