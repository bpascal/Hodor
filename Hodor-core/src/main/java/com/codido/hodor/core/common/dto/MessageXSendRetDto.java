package com.codido.hodor.core.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 发送xsend响应dto
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MessageXSendRetDto implements Serializable{

    /**
     * 状态:success表示成功
     */
    private String status;

    /**
     * 短信ID
     */
    private String send_id;

    /**
     * 所耗条数
     */
    private String fee;

    /**
     * 剩余条数
     */
    private String sms_credits;
}
