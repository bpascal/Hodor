package com.codido.hodor.api.ord.bean.resp;

import com.codido.hodor.api.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("下单订购响应对象")
@EqualsAndHashCode(callSuper = false)
public class ApplyOrderResp extends BaseResp {

    @ApiModelProperty("币种Id")
    private String currencyId;

    @ApiModelProperty("会员费用")
    private String currencyTypeValue;

    @ApiModelProperty("周期Id")
    private String cycleId;
}
