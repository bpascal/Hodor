package com.codido.hodor.bo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 创建用户请求返回对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreateUserAccountReturnDto extends BaseReturnDto {

    /**
     * 账户ID
     */
    private Long accountId;
}
