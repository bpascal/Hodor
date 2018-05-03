package com.codido.hodor.usr.bean.vo;

import com.codido.hodor.model.CmmBank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/**
 * 银行对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class BankVo implements Serializable {

    @ApiModelProperty("银行编号")
    private String bankId;

    @ApiModelProperty("银行名称")
    private String bankName;

    @ApiModelProperty("银行logo地址")
    private String bankLogoUrl;

    /**
     * 无参数构造方法
     */
    public BankVo(){

    }

    /**
     * 用db对象构造银行对象
     * @param cmmBank
     */
    public BankVo(CmmBank cmmBank){
        if(cmmBank!=null){
            this.bankId=cmmBank.getBankId().toString();
            this.bankName = cmmBank.getBankName();
            this.bankLogoUrl = cmmBank.getBankLogoUrl();
        }
    }
}
