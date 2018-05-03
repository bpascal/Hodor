package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.PubParamVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询公共参数请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPubParamResp extends BaseResp{

    @ApiModelProperty("公共参数对象")
    private PubParamVo pubParamVo;
}
