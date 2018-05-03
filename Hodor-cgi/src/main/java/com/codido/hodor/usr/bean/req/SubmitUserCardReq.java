package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 绑定用户提现银行卡信息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitUserCardReq extends BaseReq {

    @ApiModelProperty("短信验证码")
    private String smsCode;

    @ApiModelProperty("银行卡开户人姓名")
    private String userName;

    @ApiModelProperty("银行ID")
    private String bankId;

    @ApiModelProperty("银行卡号")
    private String cardNo;
}
