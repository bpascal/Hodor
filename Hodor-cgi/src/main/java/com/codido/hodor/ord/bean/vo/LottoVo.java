package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 彩种对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class LottoVo implements Serializable{

    @ApiModelProperty("彩种ID")
    private String lottoId;

    @ApiModelProperty("彩种名称")
    private String lottoName;

    @ApiModelProperty("彩种图标URL")
    private String lottoIconUrl;

    @ApiModelProperty("彩种类型:NUM:数字型,ZC_WIN:足彩胜负")
    private String lottoType;

    @ApiModelProperty("彩种区域")
    private List<LottoAreaVo> lottoAreaVoList;



}
