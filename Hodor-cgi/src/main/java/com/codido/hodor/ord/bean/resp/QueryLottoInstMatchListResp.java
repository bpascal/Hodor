package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.MatchInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 获取彩票实例的比赛列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstMatchListResp extends BaseResp {

    @ApiModelProperty("比赛列表")
    private List<MatchInstVo> matchInstVoList;
}
