package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.UserVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户信息响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserInfoResp extends BaseResp {

    @ApiModelProperty("用户对象")
    private UserVo userVo;
}
