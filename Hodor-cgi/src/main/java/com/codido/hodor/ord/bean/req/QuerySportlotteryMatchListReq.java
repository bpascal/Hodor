package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询竞彩受注比赛列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QuerySportlotteryMatchListReq extends BasePageReq {

    @ApiModelProperty("彩种ID:10:竞彩足球,11:竞彩篮球")
    private String lottoId;
}
