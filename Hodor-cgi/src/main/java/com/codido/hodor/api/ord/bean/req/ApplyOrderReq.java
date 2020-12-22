package com.codido.hodor.api.ord.bean.req;

import com.codido.hodor.api.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("下单订购请求对象")
@EqualsAndHashCode(callSuper=false)
public class ApplyOrderReq extends BaseReq {

    @ApiModelProperty("币种Id")
    private String currencyId;

    @ApiModelProperty("会员费用")
    private String currencyTypeValue;

    @ApiModelProperty("周期Id")
    private String cycleId;
}
