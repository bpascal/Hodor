package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 撤销订单请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class RejectOrderReq extends BaseReq {

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("撤销原因")
    private String rejectReason;
}
