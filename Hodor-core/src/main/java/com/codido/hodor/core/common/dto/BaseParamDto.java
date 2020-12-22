package com.codido.hodor.core.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 返回DTO基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseParamDto implements Serializable{

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 每页请求数量
     */
    private Integer prePageCount;
}
