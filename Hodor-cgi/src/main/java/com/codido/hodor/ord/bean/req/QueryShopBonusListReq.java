package com.codido.hodor.ord.bean.req;


import com.codido.hodor.common.bean.req.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询店铺的派奖订单列表请求对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryShopBonusListReq extends BasePageReq {

    @ApiModelProperty("派奖状态:B:已中奖未兑奖,S:已中奖已兑奖,N:未中奖,I:未开奖")
    private String bonusSts;
}
