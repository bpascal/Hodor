package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 申请短信验证码响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ApplySmsCodeResp extends BaseResp {

    @ApiModelProperty("流水号")
    private String smsCodeId;

}
