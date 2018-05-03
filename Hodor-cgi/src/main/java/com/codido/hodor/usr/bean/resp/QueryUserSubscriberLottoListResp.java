package com.codido.hodor.usr.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.usr.bean.vo.UserSubscriberLottoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 用户关注的彩种列表响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryUserSubscriberLottoListResp extends BaseResp{

    @ApiModelProperty("用户关注的彩种列表")
    private List<UserSubscriberLottoVo> userSubscriberLottoVoList;
}
