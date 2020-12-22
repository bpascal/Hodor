package com.codido.hodor.job.weixin.bean.resp;

import com.codido.hodor.api.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户通过微信页面登录响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class DealUserWxLoginResp extends BaseResp {

    @ApiModelProperty("登录后后台生成的token")
    private String tokenId;

}
