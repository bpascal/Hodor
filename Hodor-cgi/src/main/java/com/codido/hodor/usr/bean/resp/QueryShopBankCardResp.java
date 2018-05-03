package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.BankCardVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询商户绑定的银行卡列表响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopBankCardResp extends BaseResp {


    @ApiModelProperty("商户绑定的银行卡对象列表")
    private List<BankCardVo> bankCardVoList;
}
