package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 彩票开奖详情查询请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstBonusDetailReq extends BaseReq{

    @ApiModelProperty("彩种期数实例ID")
    private String lottoInstId;
}
