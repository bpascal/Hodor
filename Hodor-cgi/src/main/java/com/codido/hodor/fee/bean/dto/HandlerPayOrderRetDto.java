package com.codido.hodor.fee.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.fee.bean.vo.PayOrderConfigVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 处理订单支付参数返回参数DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HandlerPayOrderRetDto extends BaseRetDto {

    /**
     * 微信支付参数
     */
    private PayOrderConfigVo payOrderConfigVo;
}
