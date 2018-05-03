package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 提交订单响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitOrderResp extends BaseResp{

    @ApiModelProperty("订单对象")
    private OrderVo orderVo;
}
