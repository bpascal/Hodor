package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class LottoBonusInstVo implements Serializable{

    @ApiModelProperty("期数实例ID")
    private String lottoInstId;

    @ApiModelProperty("期数奖项实例ID")
    private String bonusInstId;

    @ApiModelProperty("奖项名称")
    private String bonusName;

    @ApiModelProperty("中奖条件")
    private String bonusCondition;

    @ApiModelProperty("中奖注数")
    private String bonusCounts;

    @ApiModelProperty("每注奖金")
    private String bonusAmt;
}
