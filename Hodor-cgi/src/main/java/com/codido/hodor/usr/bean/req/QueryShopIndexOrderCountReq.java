package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商户首页订单数查询请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopIndexOrderCountReq extends BaseReq {
}
