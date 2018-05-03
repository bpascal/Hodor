package com.codido.hodor.fee.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询商户交易流水列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryShopAccountFlowListReq extends BasePageReq {
}
