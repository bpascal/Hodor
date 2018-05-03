package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.ord.bean.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询订单详情请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryOrderDetailReq extends BaseReq {

    @ApiModelProperty("订单号")
    private String orderNo;
}
