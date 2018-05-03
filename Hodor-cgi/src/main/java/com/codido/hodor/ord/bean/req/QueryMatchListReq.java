package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询比赛信息列表请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryMatchListReq extends BasePageReq {

    @ApiModelProperty("比赛日期")
    private String matchDate;

    @ApiModelProperty("比赛类型:SOCCER:足球,BASKETBALL:篮球")
    private String matchType;

    //@ApiModelProperty("关注标识:1:查询用户关注的比赛,0:查询所有比赛")
    //private String subscribeType;
}
