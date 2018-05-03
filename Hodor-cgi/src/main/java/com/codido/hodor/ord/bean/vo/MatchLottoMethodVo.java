package com.codido.hodor.ord.bean.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 比赛玩法对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class MatchLottoMethodVo implements Serializable {

    @ApiModelProperty("玩法实例ID")
    private String lottoMethodInstId;

    @ApiModelProperty("玩法ID，固定值:1:足彩胜平负,2:足彩让分胜平负,3:足彩比分,4:足彩总进球,5:足彩上下半场,6:篮球胜负,7:篮球让分胜负,8:篮球大小分,9:篮球分差")
    private String lottoMethodId;

    @ApiModelProperty("玩法名称")
    private String lottoMethodName;

    @ApiModelProperty("玩法参数值(例如足彩让球胜负里面的主队让球数)")
    private String lottoMethodParamValue;

    @ApiModelProperty("最小可售场次，通常为1或者2，为0即表示当前场次不可售卖")
    private String lottoMethodMinCount;

    @ApiModelProperty("最大可售场次，为0即表示当前场次不可售卖")
    private String lottoMethodMaxCount;

    @ApiModelProperty("是否正在售卖:A:当前可以售卖,N:当前不可售卖")
    private String lottoMethodSellingFlag;

    @ApiModelProperty("该场比赛的玩法的状态:A:有效,N:失效")
    private String lottoMethodSts;

    @ApiModelProperty("玩法实例创建时间")
    private String lottoMethodCreateTime;

    @ApiModelProperty("最终中奖的结果CODE")
    private String lottoMethodResultOddsCode;

    @ApiModelProperty("赔率选项列表")
    private List<MatchLottoMethodOddsVo> matchLottoMethodOddsVoList;
}
