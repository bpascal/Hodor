package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 店铺联系方式修改请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitShopContactReq extends BaseReq {

    @ApiModelProperty("店铺联系手机号")
    private String shopMblNo;

    @ApiModelProperty("店铺微信号")
    private String shopWxId;

    @ApiModelProperty("店铺支付宝账号")
    private String shopAlipayId;

}
