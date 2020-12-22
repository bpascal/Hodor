package com.codido.hodor.core.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 发送xsend短信的请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MessageXSendParaDto implements Serializable{

    /**
     * 发送的验证码字段
     */
    private String code;
}
