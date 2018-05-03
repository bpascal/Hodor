package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 检查用户是否获取到机器爸爸的openId的响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class CheckUserOpenIdResp extends BaseResp {

    @ApiModelProperty("是否获取到机器爸爸的openId的标识，true:已获取,false:未获取")
    private Boolean checkResult;
}
