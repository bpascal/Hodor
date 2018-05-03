package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 申请短信验证码请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ApplySmsCodeReq extends BaseReq {

    @ApiModelProperty("用户手机号")
    private String mblNo;

    @ApiModelProperty("短信验证码类型 LOGIN:登录,BAND:绑定手机号,BINDCARD:绑定银行卡")
    private String smsType;
}
