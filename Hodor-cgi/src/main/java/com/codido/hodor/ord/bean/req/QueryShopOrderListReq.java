package com.codido.hodor.ord.bean.req;


import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询店铺的订单列表请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopOrderListReq extends BasePageReq {

    @ApiModelProperty("订单状态:I:发起,P:已支付,W:待取票,C:取消,A:已确认,B:已开奖,S:已兑奖")
    private String orderSts;

}
