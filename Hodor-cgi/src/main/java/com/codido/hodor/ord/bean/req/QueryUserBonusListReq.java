package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户中奖情况列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserBonusListReq extends BasePageReq {
}
