package com.codido.hodor.usr.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺登录服务层返回对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopLoginRetDto extends BaseRetDto{

    /**
     * tokenId
     */
    private String tokenId;
}
