package com.codido.hodor.core.bo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 入参dto对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseParaDto extends BaseDto {

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 每页请求数量
     */
    private Integer prePageCount;
}
