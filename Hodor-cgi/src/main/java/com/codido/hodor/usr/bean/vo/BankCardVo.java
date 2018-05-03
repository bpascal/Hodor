package com.codido.hodor.usr.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 银行卡对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class BankCardVo implements Serializable {

    @ApiModelProperty("用户绑定的银行卡记录编号")
    private String userBankCardId;

    @ApiModelProperty("商户绑定的银行卡记录编号")
    private String shopBankCardId;

    @ApiModelProperty("卡号")
    private String cardNo;

    @ApiModelProperty("绑定时间")
    private String bandTime;

    @ApiModelProperty("持卡人姓名")
    private String cardOwnerName;

    @ApiModelProperty("银行对象")
    private BankVo bankVo;


}
