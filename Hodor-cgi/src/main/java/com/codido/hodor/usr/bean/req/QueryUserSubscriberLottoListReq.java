package com.codido.hodor.usr.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户关注的彩种列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserSubscriberLottoListReq extends BaseReq {


}
