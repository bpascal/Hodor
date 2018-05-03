package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BasePageResp;
import com.codido.hodor.usr.bean.vo.MsgVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 获取用户/店铺消息列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserMsgListResp extends BasePageResp {

    @ApiModelProperty("消息列表")
    private List<MsgVo> msgVoList;
}
