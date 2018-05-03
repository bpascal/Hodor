package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class LottoAreaVo implements Serializable{

    @ApiModelProperty("彩种选号区ID")
    private String areaId;

    @ApiModelProperty("彩种选号区名称")
    private String areaName;

    @ApiModelProperty("彩种最多选择数量")
    private String areaMaxCount;

    @ApiModelProperty("彩种最少选择数量")
    private String areaMinCount;

    @ApiModelProperty("选号区颜色")
    private String areaColor;

    @ApiModelProperty("号码列表")
    private List<String> numberList;
}
