package com.codido.hodor.fee.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单支付请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class PayOrderReq extends BaseReq{

    @ApiModelProperty("订单号")
    private String orderNo;
}
