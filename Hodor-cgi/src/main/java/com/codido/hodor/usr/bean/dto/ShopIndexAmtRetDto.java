package com.codido.hodor.usr.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺首页销售情况查询响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopIndexAmtRetDto extends BaseRetDto{

    /**
     * 今日订单数量
     */
    private String todayOrderCount;

    /**
     * 今日订单金额
     */
    private String todayOrderAmt;

    /**
     * 本周订单数量
     */
    private String thisWeekOrderCount;

    /**
     * 本周订单金额
     */
    private String thisWeekOrderAmt;

    /**
     * 本月订单数量
     */
    private String thisMonthOrderCount;

    /**
     * 本月订单金额
     */
    private String thisMonthOrderAmt;

    /**
     * 今日派奖数量
     */
    private String todayBonusCount;

    /**
     * 今日派奖金额
     */
    private String todayBonusAmt;

    /**
     * 本周派奖数量
     */
    private String thisWeekBonusCount;

    /**
     * 本周派奖金额
     */
    private String thisWeekBonusAmt;

    /**
     * 本月派奖数量
     */
    private String thisMonthBonusCount;

    /**
     * 本月派奖金额
     */
    private String thisMonthBonusAmt;
}
