package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 保存用户在机器爸爸的openid请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class SaveUserOpenIdReq extends BaseReq {

    @ApiModelProperty("用户在机器爸爸的OPENID")
    private String openId;
}
