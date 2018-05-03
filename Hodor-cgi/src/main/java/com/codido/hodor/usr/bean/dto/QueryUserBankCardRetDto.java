package com.codido.hodor.usr.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.usr.bean.vo.BankCardVo;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 查询用户的银行卡返回参数
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryUserBankCardRetDto extends BaseRetDto{

    /**
     * 用户的银行卡信息
     */
    private List<BankCardVo> bankCardVoList;
}
