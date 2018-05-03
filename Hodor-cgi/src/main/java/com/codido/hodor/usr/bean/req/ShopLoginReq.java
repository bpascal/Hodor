package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺登录请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopLoginReq extends BaseReq {

    @ApiModelProperty("登录手机号")
    private String mblNo;

    @ApiModelProperty("登录密码(前端做MD5加密)")
    private String passwords;
}
