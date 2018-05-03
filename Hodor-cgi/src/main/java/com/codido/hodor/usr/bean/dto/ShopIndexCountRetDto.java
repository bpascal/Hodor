package com.codido.hodor.usr.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺首页订单数量查询响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopIndexCountRetDto extends BaseRetDto {


    /**
     * 待处理订单数量
     */
    private String orderCount;

    /**
     * 待处理派奖数量
     */
    private String bonusCount;
}
