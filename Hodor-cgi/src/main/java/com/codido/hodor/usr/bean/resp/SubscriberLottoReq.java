package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户关注彩种请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubscriberLottoReq extends BaseReq{

    @ApiModelProperty("彩种ID")
    private String lottoId;

    @ApiModelProperty("关注动作:S:关注,C:取消关注")
    private String subscriberType;
}
