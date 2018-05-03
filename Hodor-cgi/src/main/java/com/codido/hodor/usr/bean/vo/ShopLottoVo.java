package com.codido.hodor.usr.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 店铺支持的采种
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopLottoVo implements Serializable {

    @ApiModelProperty("彩种ID")
    private String lottoId;

    @ApiModelProperty("彩种名称")
    private String lottoName;

    @ApiModelProperty("彩种图标URL")
    private String lottoIconUrl;

    @ApiModelProperty("彩种类型:NUM:数字型,ZC_WIN:足彩胜负")
    private String lottoType;

    @ApiModelProperty("A支持，N不支持")
    private String  lottoSts;

}