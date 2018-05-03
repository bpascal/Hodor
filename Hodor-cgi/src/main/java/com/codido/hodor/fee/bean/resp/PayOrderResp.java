package com.codido.hodor.fee.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.fee.bean.vo.PayOrderConfigVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单支付响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class PayOrderResp extends BaseResp{

    @ApiModelProperty("订单支付响应对象")
    private PayOrderConfigVo payOrderConfigVo;
}
