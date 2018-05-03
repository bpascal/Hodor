package com.codido.hodor.ord.bean.vo;

import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.model.AccShopAcdt;
import com.codido.hodor.model.AccUserAcdt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 费用流水对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class AccountFlowVo implements Serializable {

    @ApiModelProperty("流水ID")
    private String flowId;

    @ApiModelProperty("费用流水项目类型:P:投注(支出-彩票投注),W:提现(账户余额提现),B:用户中奖收入(收入-彩票奖金),S:商户派奖支出(支出-用户派奖),G:商户收用户投注款(收入-用户投注),A:商户佣金扣款(手续费),R:充值(撤单退款)")
    private String flowItemType;

    @ApiModelProperty("费用流水项目类型文字描述")
    private String flowItemTypeName;

    @ApiModelProperty("交易流水金额")
    private String flowAmt;

    @ApiModelProperty("交易流水时间")
    private String flowTime;

    @ApiModelProperty("交易方向:CR:贷出,DR:借入")
    private String flowWay;



    /**
     * 无参数构造方法
     */
    public AccountFlowVo() {

    }

    /**
     * 用户交易流水
     *
     * @param accUserAcdt
     */
    public AccountFlowVo(AccUserAcdt accUserAcdt) {
        this.flowId = accUserAcdt.getUserAcdtId().toString();
        this.flowWay = accUserAcdt.getTxWay();
        this.flowAmt = accUserAcdt.getTxAmount().toString();
        this.flowItemType = accUserAcdt.getAcdtType();
        this.flowItemTypeName = accUserAcdt.getAcdtDesc();
        this.flowTime = JBDateUtil.transDate2String(accUserAcdt.getTxTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
    }


    /**
     * 商户交易流水
     *
     * @param accShopAcdt
     */
    public AccountFlowVo(AccShopAcdt accShopAcdt) {
        this.flowId = accShopAcdt.getShopAcdtId().toString();
        this.flowWay = accShopAcdt.getTxWay();
        this.flowAmt = accShopAcdt.getTxAmount().toString();
        this.flowItemType = accShopAcdt.getAcdtType();
        this.flowItemTypeName = accShopAcdt.getAcdtDesc();
        this.flowTime = JBDateUtil.transDate2String(accShopAcdt.getTxTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
    }
}
