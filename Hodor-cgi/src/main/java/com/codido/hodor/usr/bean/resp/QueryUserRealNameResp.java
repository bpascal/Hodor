package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.UserRealNameVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户实名信息响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserRealNameResp extends BaseResp {

    @ApiModelProperty("用户实名信息")
    private UserRealNameVo userRealNameVo;
}
