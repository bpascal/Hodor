package com.codido.hodor.usr.bean.vo;

import com.codido.hodor.ord.bean.vo.LottoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户关注的彩种情况对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserSubscriberLottoVo implements Serializable{

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("关注状态:true:已关注,false:未关注")
    private Boolean subscriberSts;

    @ApiModelProperty("彩种对象")
    private LottoVo lottoVo;
}
