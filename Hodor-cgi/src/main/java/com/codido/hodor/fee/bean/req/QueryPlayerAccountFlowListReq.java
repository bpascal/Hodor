package com.codido.hodor.fee.bean.req;


import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户账户流水列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPlayerAccountFlowListReq extends BasePageReq {


}
