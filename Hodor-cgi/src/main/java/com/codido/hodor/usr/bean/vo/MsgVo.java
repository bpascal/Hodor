package com.codido.hodor.usr.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 消息对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class MsgVo implements Serializable{

    @ApiModelProperty("消息ID")
    private String msgId;

    @ApiModelProperty("消息标题")
    private String msgTitle;

    @ApiModelProperty("消息时间")
    private String msgTime;

    @ApiModelProperty("消息内容")
    private String msgInfo;

    @ApiModelProperty("消息类型:O:接单处理,A:确认订单处理,R:撤销订单处理,B:中奖通知,L:开奖通知")
    private String msgType;

    @ApiModelProperty("消息跳转URL")
    private String msgJumpUrl;

    @ApiModelProperty("消息状态:I:初始下发,A:已阅读,N:失效")
    private String msgSts;
}
