package com.codido.hodor.bo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单中奖判断返回DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderBonusReturnDto extends BaseReturnDto {

    /**
     * 奖金
     */
    private Long bonusAmt;

    /**
     * 中奖状态:B:中奖,N:未中奖
     */
    private String bonusSts;
}
