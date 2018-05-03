package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 比赛玩法选项对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class MatchLottoMethodOddsVo implements Serializable{

    @ApiModelProperty("赔率选项ID")
    private String oddsId;

    @ApiModelProperty("赔率选项名称")
    private String oddsName;

    @ApiModelProperty("赔率选项编码:SPF_W:胜平负_胜,SPF_L:胜平负_负,SPF_P:胜平负_平,RSPF_W:让球胜平负_胜,RSPF_P:让球胜平负_平,RSPF_L:让球胜平负_负,1:0:比分(其他比分类推),WO:胜其他,DO:平其他,LO:负其他,0:总进球数0(其他类推，最高7+),WW:胜胜,WD:胜平,WD:胜负(其他类推),SF_L:篮球胜负主负,SF_W:篮球胜负主胜,RSF_L:篮球让球胜负主胜,RSF_W:篮球让分胜负主胜,BIG_B:大小分大分,BIG_S:大小分小分,GAP_W_1_5:主胜1-5(客胜其他以此类推),GAP_L_1_5:主负1-5(主胜其他以此类推)")
    private String oddsCode;

    @ApiModelProperty("赔率参数名称，比如篮球彩的让分是让多少分等")
    private String oddsParamName;

    @ApiModelProperty("赔率参数值")
    private String oddsParamValue;

    @ApiModelProperty("赔率值")
    private String oddsValue;

    @ApiModelProperty("赔率状态:A:当前有效,N:失效,T:过期")
    private String oddsSts;

    @ApiModelProperty("赔率较上一次赔率的变化态势:U:上升,D:下降,A:无变化")
    private String oddsTrend;

    @ApiModelProperty("赔率选项创建时间")
    private String oddsCreateTime;
}

