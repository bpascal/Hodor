package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询订单详情响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryOrderDetailResp extends BaseResp {

    @ApiModelProperty("订单详情对象")
    private OrderVo orderVo;
}
