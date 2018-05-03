package com.codido.hodor.ord.bean.req;

import com.codido.hodor.common.bean.req.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 查询公共参数请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryPubParamReq extends BaseReq {

    @ApiModelProperty("公共key:PUB_PLAYER_ORDER:用户订单操作指引,PUB_SHOP_ORDER:商户订单操作指引,PUB_USER_AGREEMENT:用户协议,PUB_USER_QUESTION:用户建议")
    @NotEmpty(message = "请输入key参数")
    private String paramKey;
}
