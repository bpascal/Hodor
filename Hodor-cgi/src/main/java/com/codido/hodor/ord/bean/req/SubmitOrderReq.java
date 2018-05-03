package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.ord.bean.vo.SubmitOrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 提交订单请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitOrderReq extends BaseReq {

    @ApiModelProperty("提交订单对象")
    private SubmitOrderVo submitOrderVo;

}
