package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 取消订单响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class CancelOrderResp extends BaseResp {
}
