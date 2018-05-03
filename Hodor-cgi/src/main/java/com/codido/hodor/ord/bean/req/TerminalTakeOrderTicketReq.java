package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.ord.bean.dto.SendOrderDetailDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户从终端取票请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class TerminalTakeOrderTicketReq extends BaseReq {

    @ApiModelProperty("订单号:通过下单接口送达终端服务后台")
    private String orderNo;

    @ApiModelProperty("操作类型:1:完成取票,0:取票异常")
    private String operType;

    @ApiModelProperty("彩票期数文字")
    private String lotteryPeriod;

    @ApiModelProperty("订单详情对象")
    private SendOrderDetailDto orderDetail;
}
