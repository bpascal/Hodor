package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.ShopAccountDetailVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询商户账户详情响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopAccountDetailResp extends BaseResp{

    @ApiModelProperty("商户账户详情响应对象")
    private ShopAccountDetailVo shopAccountDetailVo;
}
