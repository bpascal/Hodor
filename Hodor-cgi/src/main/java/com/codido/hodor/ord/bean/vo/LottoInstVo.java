package com.codido.hodor.ord.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 彩种实例对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class LottoInstVo implements Serializable{

    @ApiModelProperty("彩种ID")
    private String lottoId;

    @ApiModelProperty("彩种名称")
    private String lottoName;

    @ApiModelProperty("彩种描述")
    private String lottoDesc;

    @ApiModelProperty("彩种图标URL")
    private String lottoIconUrl;

    @ApiModelProperty("类型:FC_NUM:福彩数字型,TC_NUM:体彩数字型,TC_CT:体彩传统型:TC_JC:体彩竞彩")
    private String lottoType;

    @ApiModelProperty("彩种期数ID")
    private String lottoInstId;

    @ApiModelProperty("彩种期数名称")
    private String lottoInstName;

    @ApiModelProperty("中奖号码,同区数字之间以空格分隔,区与区之间以冒号分隔")
    private String lottoBonusNumber;

    @ApiModelProperty("彩种期数状态:A:在售,E:已开奖,N:失效")
    private String lottoInstSts;

    @ApiModelProperty("营销字段内容")
    private String lottoInstTags;

    @ApiModelProperty("营销字段名称")
    private String lottoInstTagsName;

    @ApiModelProperty("彩种期数开售时间")
    private String lottoInstBeginTime;

    @ApiModelProperty("彩种期数结束售卖时间")
    private String lottoInstEndTime;

    @ApiModelProperty("彩种期数开奖时间")
    private String lottoBonusTime;

    @ApiModelProperty("开奖时间是周几")
    private String lottoBonusTimeWeek;

    @ApiModelProperty("总销量")
    private String totalSellAmt;

    @ApiModelProperty("总奖池金额")
    private String totalBonusAmt;

    @ApiModelProperty("中奖情况列表")
    private List<LottoBonusInstVo> lottoBonusInstVoList;

    @ApiModelProperty("比赛列表")
    private List<MatchInstVo> lottoMatchInstVoList;
}
