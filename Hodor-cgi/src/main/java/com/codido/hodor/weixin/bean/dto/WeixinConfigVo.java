package com.codido.hodor.weixin.bean.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@ApiModel("微信参数信息对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class WeixinConfigVo implements Serializable {

    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("时间戳")
    private String timestamp;

    @ApiModelProperty("生成签名的随机串")
    private String nonceStr;

    @ApiModelProperty("签名")
    private String signature;

    @ApiModelProperty("js的API列表")
    private List<String> jsApiList;
}
