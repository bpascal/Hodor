package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.ord.bean.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询用户中奖情况列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserBonusListResp extends BasePageResp{

    @ApiModelProperty("用户中奖订单列表")
    private List<OrderVo> bonusOrderList;
}
