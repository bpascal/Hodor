package com.codido.hodor.ord.bean.vo;


import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.model.LotMatch;
import com.codido.hodor.model.LotMatchOP;
import com.codido.hodor.model.MatchInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 比赛对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class MatchVo implements Serializable {

    @ApiModelProperty("比赛ID")
    private String matchId;

    @ApiModelProperty("比赛名字")
    private String matchName;

    @ApiModelProperty("比赛类型:SOCCER:足球,BASKETBALL:篮球")
    private String matchType;

    @ApiModelProperty("比赛开始时间")
    private String matchBeginTime;

    @ApiModelProperty("比赛结束时间")
    private String matchEndTime;

    @ApiModelProperty("比赛状态:A:未开始,P:进行中,E:已结束,C:已取消,N:失效记录,T:推迟,S:暂停")
    private String matchSts;

    /**
     * 比赛所属联盟信息
     */
    private LeagueVo matchLeague;

    /**
     * 主队
     */
    private TeamVo homeTeamVo;

    /**
     * 客队
     */
    private TeamVo guestTeamVo;

    @ApiModelProperty("主队最终得分")
    private String homeTeamScore;

    @ApiModelProperty("客队最终得分")
    private String guestTeamScore;

    @ApiModelProperty("比赛得分(主队在前)")
    private String matchScore;

    @ApiModelProperty("上半场比分(不同比赛得分的展现形式不一样，所以在这里进行一次组合，例如足球比赛得分是主队在前客队在后，蓝球比赛是客队在前主队在后)")
    private String firstHalfTimeScore;

    @ApiModelProperty("全场比分(不同比赛得分的展现形式不一样，所以在这里进行一次组合，例如足球比赛得分是主队在前客队在后，蓝球比赛是客队在前主队在后)")
    private String allTimeScore;

    @ApiModelProperty("全场进球数")
    private String allTimeGoalCount;

    @ApiModelProperty("上半场胜负情况:W:主队胜,D:平局,L:主队负")
    private String firstHalfTimeResult;

    @ApiModelProperty("全场胜负情况:W:主队胜,D:平局,L:主队负")
    private String allTimeResult;

    @ApiModelProperty("让球数")
    private String concedePoint;

    @ApiModelProperty("让球胜负情况(W:主队胜 D:平局 L:主队负)")
    private String concedeAllTimeResult;

    @ApiModelProperty("分差")
    private String goalGap;

    @ApiModelProperty("当前用户关注状态(S:已关注,U:未关注)，该字段仅保留")
    private String subscribeSts;

    /**
     * 带DB参数构造方法
     * @param lotMatch
     */
    public MatchVo(LotMatch lotMatch) {
        this.matchId = lotMatch.getMatchId() + "";
        this.matchName = lotMatch.getMatchName();
        this.matchType = lotMatch.getMatchType();
        this.matchBeginTime = JBDateUtil.convertDateToString(lotMatch.getMatchTime(), JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.matchSts = lotMatch.getMatchSts();
        this.matchLeague = new LeagueVo(lotMatch.getMatchLeagueCode(), lotMatch.getMatchLeagueName(), lotMatch.getMatchLeagueIconUrl());
        this.homeTeamVo = new TeamVo(lotMatch.getHomeTeamId() + "", lotMatch.getHomeTeamName(), lotMatch.getHomeTeamIconUrl());
        this.guestTeamVo = new TeamVo(lotMatch.getGuestTeamId() + "", lotMatch.getGuestTeamName(), lotMatch.getGuestTeamIconUrl());

        String matchScore = lotMatch.getMatchScore();
        if (null != matchScore && !"".equals(matchScore)) {
            //足球比赛，主队在前
            this.homeTeamScore = matchScore.split(":")[0];
            this.guestTeamScore = matchScore.split(":")[1];
            this.allTimeScore = homeTeamScore + ":" + guestTeamScore;
            this.allTimeGoalCount = Integer.valueOf(homeTeamScore) + Integer.valueOf(guestTeamScore) + "";
            this.matchScore = matchScore;
            this.goalGap = Math.abs(Integer.valueOf(homeTeamScore) - Integer.valueOf(guestTeamScore)) + "";

        }
        //上半场胜负情况
        String halfTimeScore = lotMatch.getHalfTimeScore();
        if (!JBUtil.isStrEmpty(halfTimeScore)) {
            this.firstHalfTimeScore = halfTimeScore;
            String firstHalfHomeScore = null;
            String firstHalfGuestScore = null;
            firstHalfHomeScore = this.firstHalfTimeScore.split(":")[0];
            firstHalfGuestScore = this.firstHalfTimeScore.split(":")[1];
            int halfTimeGap = Integer.valueOf(firstHalfHomeScore) - Integer.valueOf(firstHalfGuestScore);
            if (halfTimeGap == 0) {
                //平
                this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_DRAW;
            } else if (halfTimeGap > 0) {
                //主队胜
                this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_WIN;
            } else if (halfTimeGap < 0) {
                //主队负
                this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_LOSE;
            } else {
                this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_DRAW;
            }

        }
        this.allTimeResult = lotMatch.getMatchResult();

    }



    /**
     * 带扩充的DB参数构造方法
     * @param lotMatch
     */
    public MatchVo(LotMatchOP lotMatch) {
        this.matchId = lotMatch.getMatchId() + "";
        this.matchName = lotMatch.getMatchName();
        this.matchType = lotMatch.getMatchType();
        this.matchBeginTime = JBDateUtil.convertDateToString(lotMatch.getMatchTime(), JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.matchSts = lotMatch.getMatchSts();
        this.matchLeague = new LeagueVo(lotMatch.getMatchLeagueCode(), lotMatch.getMatchLeagueName(), lotMatch.getMatchLeagueIconUrl());
        this.homeTeamVo = new TeamVo(lotMatch.getHomeTeamId() + "", lotMatch.getHomeTeamName(), lotMatch.getHomeTeamIconUrl());
        this.guestTeamVo = new TeamVo(lotMatch.getGuestTeamId() + "", lotMatch.getGuestTeamName(), lotMatch.getGuestTeamIconUrl());

        if(lotMatch.getMatchInfo() !=null) {
            MatchInfo matchInfo = lotMatch.getMatchInfo();
            String matchScore = matchInfo.getMatchInfoScore();
            if (null != matchScore && !"".equals(matchScore)) {
                //主队在前
                this.homeTeamScore = matchScore.split(":")[0];
                this.guestTeamScore = matchScore.split(":")[1];
                this.allTimeScore = homeTeamScore + ":" + guestTeamScore;
                this.allTimeGoalCount = Integer.valueOf(homeTeamScore) + Integer.valueOf(guestTeamScore) + "";
                this.matchScore = matchScore;
                this.goalGap = Math.abs(Integer.valueOf(homeTeamScore) - Integer.valueOf(guestTeamScore)) + "";
            }
            //上半场胜负情况
            if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoHalftimeScore())) {
                this.firstHalfTimeScore = matchInfo.getMatchInfoHalftimeScore();
                String firstHalfHomeScore = null;
                String firstHalfGuestScore = null;
                firstHalfHomeScore = this.firstHalfTimeScore.split(":")[0];
                firstHalfGuestScore = this.firstHalfTimeScore.split(":")[1];
                int halfTimeGap = Integer.valueOf(firstHalfHomeScore) - Integer.valueOf(firstHalfGuestScore);
                if (halfTimeGap == 0) {
                    //平
                    this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_DRAW;
                } else if (halfTimeGap > 0) {
                    //主队胜
                    this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_WIN;
                } else if (halfTimeGap < 0) {
                    //主队负
                    this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_LOSE;
                } else {
                    this.firstHalfTimeResult = CommonConstans.GAME_RESULT_HOME_DRAW;
                }
            }
            this.allTimeResult = matchInfo.getMatchInfoResult();
        }
    }
}
