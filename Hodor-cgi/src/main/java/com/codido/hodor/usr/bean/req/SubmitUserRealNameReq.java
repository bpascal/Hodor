package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 提交用户实名信息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitUserRealNameReq extends BaseReq{

    @ApiModelProperty("短信验证码")
    private String smsCode;

    @ApiModelProperty("用户实名")
    private String userRealName;

    @ApiModelProperty("用户身份证号")
    private String userIdCard;

    @ApiModelProperty("用户手机号")
    private String userMblNo;

}
