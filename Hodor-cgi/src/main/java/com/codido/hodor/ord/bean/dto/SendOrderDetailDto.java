package com.codido.hodor.ord.bean.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 传送给终端后台的订单对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SendOrderDetailDto implements Serializable {

    @ApiModelProperty("投注倍数")
    private String betTimes;

    @ApiModelProperty("彩种ID:1:双色球,3:福彩3D,7:七乐彩")
    private String lotteryId;

    @ApiModelProperty("彩种期数")
    private String lotteryPeriod;

    @ApiModelProperty("选号列表")
    private List<SendOrderChooseDto> chooseList;
}
