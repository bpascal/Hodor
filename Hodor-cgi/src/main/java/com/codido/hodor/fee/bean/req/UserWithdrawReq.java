package com.codido.hodor.fee.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户提现申请请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class UserWithdrawReq extends BaseReq {

    @ApiModelProperty("提现申请金额")
    private String withdrawAmt;

    @ApiModelProperty("用户提现到的银行卡ID(queryUserBankCard接口返回)")
    private String userBankCardId;
}
