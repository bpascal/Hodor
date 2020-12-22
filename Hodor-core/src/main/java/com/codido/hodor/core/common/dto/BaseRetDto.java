package com.codido.hodor.core.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 返回DTO基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseRetDto implements Serializable {

    /**
     * 处理结果
     */
    private boolean handlerResult;

    /**
     * 处理结果消息
     */
    private String handlerMsg;

    /**
     * 处理错误码
     */
    private String handlerCode;
}
