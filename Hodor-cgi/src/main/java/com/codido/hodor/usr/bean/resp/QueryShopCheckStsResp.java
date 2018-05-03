package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺审核状态查询响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopCheckStsResp extends BaseResp {

    @ApiModelProperty("店铺信息")
    private ShopVo shopVo;


}