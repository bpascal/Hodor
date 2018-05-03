package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.ord.bean.vo.MatchInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询竞彩受注比赛列表响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QuerySportlotteryMatchListResp extends BasePageResp {

    @ApiModelProperty("比赛列表")
    private List<MatchInstVo> matchInfoList;
}
