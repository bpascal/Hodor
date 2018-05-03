package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询最新的彩种实例列表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryNewestLottoInstListResp extends BaseResp {

    @ApiModelProperty("最新的彩种实例列表")
    private List<LottoInstVo> lottoInstVoList;
}
