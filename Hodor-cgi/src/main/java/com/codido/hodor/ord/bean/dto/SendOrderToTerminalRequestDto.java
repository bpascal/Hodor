package com.codido.hodor.ord.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 传送订单信息到终端后台的通讯接口请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendOrderToTerminalRequestDto implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单对象
     */
    private SendOrderDetailDto orderDetail;
}
