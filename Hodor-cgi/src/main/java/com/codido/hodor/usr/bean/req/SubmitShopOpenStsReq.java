package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 营业状态修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitShopOpenStsReq extends BaseReq {
    @ApiModelProperty("店铺开通状态，P:营业中,C:歇业中")
    private String shopSts;


}
