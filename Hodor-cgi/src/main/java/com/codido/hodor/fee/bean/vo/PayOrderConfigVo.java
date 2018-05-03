package com.codido.hodor.fee.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * 订单支付参数对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class PayOrderConfigVo implements Serializable {

    @ApiModelProperty("支付签名时间戳")
    private String timestamp;

    @ApiModelProperty("支付签名随机串")
    private String nonceStr;

    @ApiModelProperty("统一支付接口返回的prepay_id参数值")
    private String packageName;

    @ApiModelProperty("签名方式")
    private String signType;

    @ApiModelProperty("支付签名")
    private String paySign;
}
