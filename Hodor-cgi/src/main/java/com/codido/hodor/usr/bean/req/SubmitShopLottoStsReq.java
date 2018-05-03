package com.codido.hodor.usr.bean.req;


import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺彩种销售情况修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitShopLottoStsReq extends BaseReq {

    @ApiModelProperty("采种Id")
    private String lottoId;

    @ApiModelProperty("店铺开通状态，A开通，N关闭")
    private String lottoSts;


}
