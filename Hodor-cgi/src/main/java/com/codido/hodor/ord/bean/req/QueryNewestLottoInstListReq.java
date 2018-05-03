package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询最新的彩种实例列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryNewestLottoInstListReq extends BaseReq{
}
