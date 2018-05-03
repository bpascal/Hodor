package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商户首页销售数据查询响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopIndexOrderAmtResp extends BaseResp {

    @ApiModelProperty("今日订单数量")
    private String todayOrderCount;

    @ApiModelProperty("今日订单金额")
    private String todayOrderAmt;

    @ApiModelProperty("本周订单数量")
    private String thisWeekOrderCount;

    @ApiModelProperty("本周订单金额")
    private String thisWeekOrderAmt;

    @ApiModelProperty("本月订单数量")
    private String thisMonthOrderCount;

    @ApiModelProperty("本月订单金额")
    private String thisMonthOrderAmt;

    @ApiModelProperty("今日派奖数量")
    private String todayBonusCount;

    @ApiModelProperty("今日派奖金额")
    private String todayBonusAmt;

    @ApiModelProperty("本周派奖数量")
    private String thisWeekBonusCount;

    @ApiModelProperty("本周派奖金额")
    private String thisWeekBonusAmt;

    @ApiModelProperty("本月派奖数量")
    private String thisMonthBonusCount;

    @ApiModelProperty("本月派奖金额")
    private String thisMonthBonusAmt;
}
