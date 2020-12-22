package com.codido.hodor.api.common.bean.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 整体请求基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class BaseReq implements Serializable {

    @ApiModelProperty("用户TOKENID")
    private String tokenId;

    @ApiModelProperty("页面上传的渠道标识，从页面参数获取，可为空，空的情况下做小程序处理:APP_YOUSHU_ANDROID:android客户端，APP_YOUSHU_IOS:iOS客户端")
    private String channelFlag;

    @ApiModelProperty("APP版本号")
    private String versionNumber;

    @ApiModelProperty("APP渠道来源，即集成友盟后，客户端分发的版本")
    private String appChannelInfo;
}
