package com.codido.hodor.api.usr.bean.resp;

import com.codido.hodor.api.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("提问响应")
@EqualsAndHashCode(callSuper = false)
public class QwenQuestionResp extends BaseResp {

    @ApiModelProperty("提问响应")
    private String answerText;

}
