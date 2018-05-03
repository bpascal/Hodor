package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 营业状态查询
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopOpenStsResp extends BaseResp {

    @ApiModelProperty("店铺信息")
    private ShopVo shopVo;


}