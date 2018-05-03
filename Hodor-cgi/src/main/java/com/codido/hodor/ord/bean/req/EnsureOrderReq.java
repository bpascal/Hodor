package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 确认订单请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class EnsureOrderReq extends BaseReq {

    @ApiModelProperty("订单号")
    private String orderNo;

    //@ApiModelProperty("订单图片地址")
    //private String imageUrl;

    @ApiModelProperty("订单图片在微信上传后返回的ID")
    private String imgServerId;
}
