package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户绑定的银行卡列表请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryUserBankCardReq extends BaseReq {
}
