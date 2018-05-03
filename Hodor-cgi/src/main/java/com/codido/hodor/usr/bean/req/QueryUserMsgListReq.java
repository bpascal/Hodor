package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户消息列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserMsgListReq extends BasePageReq {

    @ApiModelProperty("消息类型区分:U:彩民,B:商户")
    private String userType;
}
