package com.codido.hodor.ord.bean.vo;

import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.dto.League;
import com.codido.hodor.common.dto.Team;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.model.LotInstMatch;
import com.codido.hodor.model.LotInstMatchOP;
import com.codido.hodor.model.LotMatch;
import com.codido.hodor.model.LotMatchOP;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 比赛对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class MatchInstVo implements Serializable {

    /**
     * 无参数构造方法
     */
    public MatchInstVo() {
    }

    /**
     * 根据DB对象构造实例对象
     *
     * @param lotInstMatch
     */
    public MatchInstVo(LotInstMatchOP lotInstMatch) {
        this.matchSort = lotInstMatch.getMatchSort().toString();
        this.lotInstMatchId = lotInstMatch.getLotInstMatchId().toString();
        this.lotInstMatchSts = lotInstMatch.getLotInstMatchSts();
        this.lotInstMatchResult = lotInstMatch.getLotInstMatchResult();
        this.matchId = lotInstMatch.getMatchId().toString();
        LotMatch lotMatch = lotInstMatch.getLotMatch();
        if (lotMatch != null) {
            this.matchName = League.getShortName(lotMatch.getMatchName());
            this.matchLeagueCode = lotMatch.getMatchLeagueCode();
            this.matchLeagueName = lotMatch.getMatchLeagueName();
            this.matchTime = JBDateUtil.transDate2String(lotMatch.getMatchTime(), "", JBDateUtil.dateFormat_MMddHHmm);
            this.matchSts = lotMatch.getMatchSts();
            this.homeTeamName = Team.getTeamShortName(lotMatch.getHomeTeamName());
            this.homeTeamLogoUrl = lotMatch.getHomeTeamIconUrl();
            this.guestTeamName = Team.getTeamShortName(lotMatch.getGuestTeamName());
            this.guestTeamLogoUrl = lotMatch.getGuestTeamIconUrl();
            this.homeWinOdds = lotMatch.getHomeWinOdds();
            this.homeLostOdds = lotMatch.getHomeLostOdds();
            this.homeDrawOdds = lotMatch.getHomeDrawOdds();
            this.matchResult = lotMatch.getMatchResult();
            this.matchScore = lotMatch.getMatchScore();
            this.matchInfoId = lotMatch.getMatchInfoId() == null ? "" : lotMatch.getMatchInfoId().toString();
        }
    }


    /**
     * 根据彩票比赛对象构造实例对象
     *
     * @param lotMatch
     */
    public MatchInstVo(LotMatch lotMatch) {
        this.matchId = lotMatch.getMatchId().toString();
        this.matchName = lotMatch.getMatchName();
        this.matchLeagueCode = lotMatch.getMatchLeagueCode();
        this.matchLeagueName = lotMatch.getMatchLeagueName();
        this.matchTime = JBDateUtil.transDate2String(lotMatch.getMatchTime(), "", JBDateUtil.dateFormat_MMddHHmm);
        this.matchSts = lotMatch.getMatchSts();
        this.homeTeamName = lotMatch.getHomeTeamName();
        this.homeTeamLogoUrl = lotMatch.getHomeTeamIconUrl();
        this.guestTeamName = lotMatch.getGuestTeamName();
        this.guestTeamLogoUrl = lotMatch.getGuestTeamIconUrl();
        this.homeWinOdds = lotMatch.getHomeWinOdds();
        this.homeLostOdds = lotMatch.getHomeLostOdds();
        this.homeDrawOdds = lotMatch.getHomeDrawOdds();
        this.matchResult = lotMatch.getMatchResult();
        this.matchScore = lotMatch.getMatchScore();
        this.matchInfoId = lotMatch.getMatchInfoId() == null ? "" : lotMatch.getMatchInfoId().toString();
    }


    /**
     * 根据彩票比赛对象构造实例对象
     *
     * @param lotMatch
     */
    public MatchInstVo(LotMatchOP lotMatch) {
        this.matchId = lotMatch.getMatchId().toString();
        this.matchName = League.getShortName(lotMatch.getMatchName());
        this.matchLeagueCode = lotMatch.getMatchLeagueCode();
        this.matchLeagueName = lotMatch.getMatchLeagueName();
        //this.matchTime = JBDateUtil.transDate2String(lotMatch.getMatchTime(), "", JBDateUtil.dateFormat_MMddHHmm);
        this.matchTime = JBDateUtil.transDate2String(lotMatch.getMatchTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.matchSts = lotMatch.getMatchSts();
        this.homeTeamName = Team.getTeamShortName(lotMatch.getHomeTeamName());
        this.homeTeamLogoUrl = lotMatch.getHomeTeamIconUrl();
        this.guestTeamName = Team.getTeamShortName(lotMatch.getGuestTeamName());
        this.guestTeamLogoUrl = lotMatch.getGuestTeamIconUrl();
        this.homeWinOdds = lotMatch.getHomeWinOdds();
        this.homeLostOdds = lotMatch.getHomeLostOdds();
        this.homeDrawOdds = lotMatch.getHomeDrawOdds();
        if (CommonConstans.MATCH_TYPE_BASKETBALL.equals(lotMatch.getMatchType())) {
            //篮球，把比分对调
            String srcResult = lotMatch.getMatchResult();
            if (!JBUtil.isStrEmpty(srcResult)) {
                String[] basScore = srcResult.split(":");
                if (basScore != null && basScore.length > 1) {
                    this.matchResult = basScore[1] + ":" + basScore[0];
                }
            }
        } else if (CommonConstans.MATCH_TYPE_BASKETBALL.equals(lotMatch.getMatchType())) {
            //足球
            this.matchResult = lotMatch.getMatchResult();
        }
        this.matchScore = lotMatch.getMatchScore();
        if (lotMatch.getMatchInfo() != null) {
            this.matchInfoId = lotMatch.getMatchInfoId() == null ? "" : lotMatch.getMatchInfoId().toString();
            this.matchCode = lotMatch.getMatchInfo().getMatchInfoCode();
        }
    }

    @ApiModelProperty("比赛ID")
    private String matchId;

    @ApiModelProperty("比赛编码")
    private String matchCode;

    @ApiModelProperty("比赛名称")
    private String matchName;

    @ApiModelProperty("比赛场次在某一期彩票中的排序位置")
    private String matchSort;

    @ApiModelProperty("序列号ID")
    private String lotInstMatchId;

    @ApiModelProperty("比赛状态:A:有效,N:失效")
    private String lotInstMatchSts;

    @ApiModelProperty("比赛所属联赛编号")
    private String matchLeagueCode;

    @ApiModelProperty("比赛所属联赛名称")
    private String matchLeagueName;

    @ApiModelProperty("主队名称")
    private String homeTeamName;

    @ApiModelProperty("主队图标")
    private String homeTeamLogoUrl;

    @ApiModelProperty("客队名称")
    private String guestTeamName;

    @ApiModelProperty("客队图标")
    private String guestTeamLogoUrl;

    @ApiModelProperty("主队获胜赔率")
    private String homeWinOdds;

    @ApiModelProperty("主队失败赔率")
    private String homeLostOdds;

    @ApiModelProperty("平局赔率")
    private String homeDrawOdds;

    @ApiModelProperty("比赛时间")
    private String matchTime;

    @ApiModelProperty("比赛状态:A:未开始,P:进行中,E:已结束,C:已取消,N:失效记录,T:推迟,S:暂停")
    private String matchSts;

    @ApiModelProperty("比赛结果:W:主队胜,D:平局,L:主队负")
    private String matchResult;

    @ApiModelProperty("比分")
    private String matchScore;

    @ApiModelProperty("比赛对应彩种期数的结果:3:主队胜(包含让分),1:平局(包含让分),0:主队负(包含让分)")
    private String lotInstMatchResult;

    @ApiModelProperty("用户投注情况")
    private String chooseNumber;

    @ApiModelProperty("投注结果(R:选择正确,W:选择错误)")
    private String chooseResult;

    @ApiModelProperty("比赛信息ID")
    private String matchInfoId;

    @ApiModelProperty("比赛的玩法列表(仅竞彩类才有)")
    private List<MatchLottoMethodVo> matchLottoMethodVoList;
}
