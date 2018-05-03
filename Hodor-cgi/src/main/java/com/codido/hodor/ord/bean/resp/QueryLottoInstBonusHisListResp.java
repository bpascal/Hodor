package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 获取某期彩种开奖历史信息响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstBonusHisListResp extends BasePageResp{

    @ApiModelProperty("彩种期数信息列表")
    private List<LottoInstVo> lottoInstVoList;
}
