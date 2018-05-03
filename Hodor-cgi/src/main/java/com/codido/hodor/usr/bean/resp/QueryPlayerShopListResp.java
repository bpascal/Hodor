package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询用户的店铺列表响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryPlayerShopListResp extends BaseResp{

    @ApiModelProperty("店铺列表(通常最多只有两个店铺)")
    private List<ShopVo> shopVoList;
}
