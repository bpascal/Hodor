package com.codido.hodor.bo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 创建账户请求对象DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreateAccountParaDto extends BaseParaDto {

    /**
     * 用户归属:P:彩民,S:商户,B:店主用户
     */
    private String accountOwnerType;

    /**
     * 账户ID
     */
    private Long userId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 账户金额
     */
    private Double amount;
}
