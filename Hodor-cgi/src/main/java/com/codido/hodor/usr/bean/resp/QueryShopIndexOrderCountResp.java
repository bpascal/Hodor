package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商户首页订单数查询响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopIndexOrderCountResp extends BaseResp {

    @ApiModelProperty("待处理订单数量")
    private String orderCount;

    @ApiModelProperty("待处理派奖数量")
    private String bonusCount;
}
