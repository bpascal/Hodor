package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺登录响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopLoginResp extends BaseResp{

    @ApiModelProperty("登录生成的tokenId")
    private String tokenId;
}
