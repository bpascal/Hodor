package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@ApiModel("提交订单对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class SubmitOrderVo implements Serializable {

    @ApiModelProperty("彩种ID")
    private String lottoId;

    @ApiModelProperty("彩种实例ID")
    private String lottoInstId;

    @ApiModelProperty("倍数")
    private String betTimes;

    @ApiModelProperty("商户id")
    private String shopId;

    @ApiModelProperty("竞彩专用:串数，逗号分隔")
    private String lottoMethod;

    @ApiModelProperty("订单来源:M:手工下单,G:合买,F:追号,A:自动出票预约订单，(中大奖了的订单统一传A，其他情况传M)")
    private String orderSource;

    @ApiModelProperty("选择的号码的列表")
    private List<ChooseNumberVo> chooseNumberVoList;
}
