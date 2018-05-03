package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 读取用户消息响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class ReadUserMsgResp extends BaseResp{
}
