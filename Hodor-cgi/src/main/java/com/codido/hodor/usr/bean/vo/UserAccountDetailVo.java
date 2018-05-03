package com.codido.hodor.usr.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户账户详情对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserAccountDetailVo implements Serializable {

    @ApiModelProperty("可用余额")
    private String usefulBalance;

    @ApiModelProperty("可提现余额")
    private String withdrawAbleBalance;
}
