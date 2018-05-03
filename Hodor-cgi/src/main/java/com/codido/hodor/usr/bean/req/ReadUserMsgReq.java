package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 读取用户消息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class ReadUserMsgReq extends BaseReq {

    @ApiModelProperty("消息ID")
    private String msgId;
}
