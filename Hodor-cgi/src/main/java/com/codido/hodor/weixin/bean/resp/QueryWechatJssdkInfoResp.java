package com.codido.hodor.weixin.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.weixin.bean.dto.WeixinConfigVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询微信jssdk需要的信息的响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryWechatJssdkInfoResp extends BaseResp {

    @ApiModelProperty("微信参数信息对象")
    private WeixinConfigVo weixinConfigVo;
}
