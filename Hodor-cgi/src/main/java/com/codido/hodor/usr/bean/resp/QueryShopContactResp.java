package com.codido.hodor.usr.bean.resp;


import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询商户联系方式
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopContactResp extends BaseResp{

    @ApiModelProperty("商户联系详情响应对象")
    private ShopVo shopVo;


}
