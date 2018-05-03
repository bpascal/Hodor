package com.codido.hodor.job.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 传送订单信息到终端后台的响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendOrderToTerminalRetDto extends BaseRetDto {

    /**
     * 图片地址
     */
    private String orderTicketUrl;

}
