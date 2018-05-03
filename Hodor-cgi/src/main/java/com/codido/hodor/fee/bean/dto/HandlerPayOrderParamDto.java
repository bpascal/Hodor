package com.codido.hodor.fee.bean.dto;

import com.codido.hodor.common.bean.dto.BaseParamDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 处理订单支付参数入参DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HandlerPayOrderParamDto extends BaseParamDto {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 支付用户ID
     */
    private Long userId;
}
