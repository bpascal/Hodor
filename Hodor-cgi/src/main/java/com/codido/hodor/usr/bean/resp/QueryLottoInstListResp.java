package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopLottoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 店铺可售彩种列表查询
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryLottoInstListResp extends BasePageResp {

    @ApiModelProperty("可售彩种实例列表")
    private List<ShopLottoVo> shopLottoVoList;


}