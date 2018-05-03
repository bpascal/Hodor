package com.codido.hodor.fee.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.AccountFlowVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询用户账户流水列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPlayerAccountFlowListResp extends BasePageResp {

    @ApiModelProperty("用户账户流水列表")
    private List<AccountFlowVo> accountFlowVoList;
}
