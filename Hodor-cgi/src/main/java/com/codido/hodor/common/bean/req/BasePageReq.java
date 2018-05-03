package com.codido.hodor.common.bean.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页请求基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class BasePageReq extends BaseReq {

    @ApiModelProperty("页码")
    private String pageNo;

    @ApiModelProperty("每页请求数量")
    private String prePageCount;
}
