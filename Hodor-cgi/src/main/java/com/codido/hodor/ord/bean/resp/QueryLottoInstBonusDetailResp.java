package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 彩票开奖详情查询响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstBonusDetailResp extends BaseResp{

    @ApiModelProperty("中奖实例信息")
    private LottoInstVo lottoInstVo;
}
