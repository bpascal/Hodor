package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 检查用户是否已经获取到机器爸爸的openid的请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class CheckUserOpenIdReq extends BaseReq {
}
