package com.codido.hodor.weixin.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询微信jssdk需要的信息的请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryWechatJssdkInfoReq extends BaseReq {

    @ApiModelProperty("需要使用的url地址")
    private String url;
}
