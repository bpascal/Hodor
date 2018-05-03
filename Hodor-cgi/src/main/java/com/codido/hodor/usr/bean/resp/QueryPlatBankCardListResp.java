package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.BankVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询平台支持的银行卡列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPlatBankCardListResp extends BaseResp {

    @ApiModelProperty("平台支持的银行列表")
    private List<BankVo> bankVoList;
}
