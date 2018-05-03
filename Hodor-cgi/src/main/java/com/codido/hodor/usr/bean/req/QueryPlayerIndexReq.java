package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户首页信息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPlayerIndexReq extends BaseReq {

}
