package com.codido.hodor.api.common.bean.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 响应基类
 */
@Data
public class BaseResp implements Serializable {

    @ApiModelProperty("响应编码,0000表示成功,其他有各自的定义")
    private String respCode;

    @ApiModelProperty("响应错误提示")
    private String respMsg;
}
