package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户彩种实例信息请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstReq extends BaseReq {

    @ApiModelProperty("彩种ID")
    private String lottoId;
}
