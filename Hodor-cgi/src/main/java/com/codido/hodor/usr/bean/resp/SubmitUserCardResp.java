package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 绑定用户提现银行卡信息响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class SubmitUserCardResp extends BaseResp {
}
