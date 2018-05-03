package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 绑定用户和店铺关系请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class BindUserShopReq extends BaseReq{

    @ApiModelProperty("邀请码")
    private String intiveCode;
}
