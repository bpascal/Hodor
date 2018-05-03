package com.codido.hodor.usr.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.usr.bean.vo.ShopVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 处理用户店铺关系的dto
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HandleUserShopRelaRetDto extends BaseRetDto {

    /**
     * 店铺信息
     */
    private ShopVo shopVo;
}
