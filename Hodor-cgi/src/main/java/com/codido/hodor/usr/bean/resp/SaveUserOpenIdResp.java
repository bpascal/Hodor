package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.req.BaseReq;
import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 保存用户在机器爸爸的openid响应对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class SaveUserOpenIdResp extends BaseResp {

}
