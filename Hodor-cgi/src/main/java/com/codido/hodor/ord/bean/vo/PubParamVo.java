package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询公共参数请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class PubParamVo implements Serializable{

    @ApiModelProperty("ID")
    private String paramId;

    @ApiModelProperty("名称")
    private String paramName;

    @ApiModelProperty("KEY")
    private String paramKey;

    @ApiModelProperty("内容")
    private String paramValue;
}
