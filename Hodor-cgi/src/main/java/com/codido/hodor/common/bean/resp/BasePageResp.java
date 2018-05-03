package com.codido.hodor.common.bean.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页响应基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class BasePageResp extends BaseResp {

    @ApiModelProperty("当前页码")
    private String currentPageNo;
}
