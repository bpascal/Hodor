package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BasePageReq;
import com.codido.hodor.common.bean.resp.BasePageResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取某期彩种开奖历史信息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstBonusHisListReq extends BasePageReq {

    @ApiModelProperty("彩种ID")
    private String lottoId;
}
