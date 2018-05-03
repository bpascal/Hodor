package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.ord.bean.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询商户订单列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryShopOrderListResp extends BasePageResp{

    @ApiModelProperty("商户订单列表")
    private List<OrderVo> orderVoList;

    @ApiModelProperty("未处理总计数")
    private String totalDealCount;
}
