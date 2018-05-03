package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@ApiModel("用户提交订单选的号码对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseNumberVo implements Serializable{

    @ApiModelProperty("所选择的注数")
    private String chooseCount;

    @ApiModelProperty("金额")
    private String payAmount;

    @ApiModelProperty("竞彩专用:比赛场次ID")
    private String matchId;

    @ApiModelProperty("选择的号码str，如果是竞彩，则格式为:赔率选项CODE@赔率值，以空格分隔")
    private String chooseNumberStr;
}

