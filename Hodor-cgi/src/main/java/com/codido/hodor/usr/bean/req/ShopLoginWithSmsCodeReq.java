package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺通过短信验证码登录请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopLoginWithSmsCodeReq extends BaseReq {

    @ApiModelProperty("登录手机号")
    private String mblNo;

    @ApiModelProperty("短信验证码")
    private String smsCode;
}
