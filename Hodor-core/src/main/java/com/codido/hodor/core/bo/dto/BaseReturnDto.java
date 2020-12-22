package com.codido.hodor.core.bo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 返回参数DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseReturnDto extends BaseDto {

    /**
     * 处理结果
     */
    private Boolean retResult;

    /**
     * 处理错误数据
     */
    private String retMessage;

    /**
     * 处理错误码
     */
    private String retCode;
}
