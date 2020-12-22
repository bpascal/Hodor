package com.codido.hodor.api.weixin.bean.req;


import com.codido.hodor.api.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户通过微信页面登录请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class DealUserWxLoginReq extends BaseReq {

    @ApiModelProperty("调用微信返回的code")
    private String wxCode;

}
