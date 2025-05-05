package com.codido.hodor.api.usr.bean.req;

import com.codido.hodor.api.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("通义千问请求")
@EqualsAndHashCode(callSuper = false)
public class QwenQuestionReq extends BaseReq {

    @ApiModelProperty("请求问题")
    private String question;

    @ApiModelProperty("提示词")
    private String prompt;

    @ApiModelProperty("返回格式")
    private String resultFormat;
}
