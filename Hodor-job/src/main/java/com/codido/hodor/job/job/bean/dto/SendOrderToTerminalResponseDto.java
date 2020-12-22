package com.codido.hodor.job.job.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 传送订单信息到终端后台的通讯接口响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendOrderToTerminalResponseDto implements Serializable {


    /**
     * 响应编码
     */
    private Integer resultCode;

    /**
     * 错误码
     */
    private String errMsg;


    /**
     * 二维码url
     */
    private String content;
}
