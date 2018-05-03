package com.codido.hodor.mapper;

import com.codido.hodor.model.LotMatch;
import com.codido.hodor.model.LotMatchExample;
import com.codido.hodor.model.LotMatchOP;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface LotMatchOPMapper {

    @SelectProvider(type=LotMatchSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OUT_MATCH_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="HOME_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_WIN_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_LOST_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_DRAW_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HALF_TIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LotMatch> selectByExample(LotMatchExample example);

    @Select({
        "select",
        "a.MATCH_ID, MATCH_NAME, MATCH_CODE, OUT_MATCH_ID, MATCH_TYPE, MATCH_LEAGUE_CODE, ",
        "MATCH_LEAGUE_NAME, MATCH_LEAGUE_ICON_URL, MATCH_TIME, MATCH_STS, HOME_TEAM_ID, ",
        "HOME_TEAM_NAME, HOME_TEAM_ICON_URL, GUEST_TEAM_ID, GUEST_TEAM_NAME, GUEST_TEAM_ICON_URL, ",
        "HOME_WIN_ODDS, HOME_LOST_ODDS, HOME_DRAW_ODDS, MATCH_RESULT, HALF_TIME_SCORE, ",
        "MATCH_SCORE, MATCH_INFO_ID",
        "from t_lot_match a,t_lot_inst_match b",
        "where a.MATCH_ID = b.MATCH_ID AND b.LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT} AND b.LOT_INST_MATCH_STS = 'A' AND a.MATCH_STS <>'N' ORDER BY b.MATCH_SORT ASC"
    })
    @ConstructorArgs({
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OUT_MATCH_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="HOME_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_WIN_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_LOST_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_DRAW_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HALF_TIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LotMatch> selectByLottoInstId(@Param("lottoInstId") Long lottoInstId);


    @Select({
        "select",
        "MATCH_ID, MATCH_NAME, MATCH_CODE, OUT_MATCH_ID, MATCH_TYPE, MATCH_LEAGUE_CODE, ",
        "MATCH_LEAGUE_NAME, MATCH_LEAGUE_ICON_URL, MATCH_TIME, MATCH_STS, a.HOME_TEAM_ID, ",
        "a.HOME_TEAM_NAME, a.HOME_TEAM_ICON_URL, a.GUEST_TEAM_ID, a.GUEST_TEAM_NAME, a.GUEST_TEAM_ICON_URL, ",
        "HOME_WIN_ODDS, HOME_LOST_ODDS, HOME_DRAW_ODDS, a.MATCH_RESULT, a.HALF_TIME_SCORE, ",
        "MATCH_SCORE, a.MATCH_INFO_ID",
        "from t_lot_match a,t_match_info b",
        "where MATCH_STS <>'N' AND MATCH_TYPE = #{matchType,jdbcType=VARCHAR} AND a.MATCH_INFO_ID = b.MATCH_INFO_ID AND date_format(MATCH_TIME,'%Y-%m-%d')=#{matchDate,jdbcType=VARCHAR} ORDER BY a.MATCH_TIME ASC LIMIT #{pageNo,jdbcType=BIGINT},#{prePageCount,jdbcType=BIGINT}"
    })
    @Results({
        @Result(property = "matchId", column = "MATCH_ID"),
        @Result(property = "matchName", column = "MATCH_NAME"),
        @Result(property = "matchCode", column = "MATCH_CODE"),
        @Result(property = "outMatchId", column = "OUT_MATCH_ID"),
        @Result(property = "matchType", column = "MATCH_TYPE"),
        @Result(property = "matchLeagueCode", column = "MATCH_LEAGUE_CODE"),
        @Result(property = "matchLeagueName", column = "MATCH_LEAGUE_NAME"),
        @Result(property = "matchLeagueIconUrl", column = "MATCH_LEAGUE_ICON_URL"),
        @Result(property = "matchTime", column = "MATCH_TIME"),
        @Result(property = "matchSts", column = "MATCH_STS"),
        @Result(property = "homeTeamId", column = "HOME_TEAM_ID"),
        @Result(property = "homeTeamName", column = "HOME_TEAM_NAME"),
        @Result(property = "homeTeamIconUrl", column = "HOME_TEAM_ICON_URL"),
        @Result(property = "guestTeamId", column = "GUEST_TEAM_ID"),
        @Result(property = "guestTeamName", column = "GUEST_TEAM_NAME"),
        @Result(property = "guestTeamIconUrl", column = "GUEST_TEAM_ICON_URL"),
        @Result(property = "homeWinOdds", column = "HOME_WIN_ODDS"),
        @Result(property = "homeLostOdds", column = "HOME_LOST_ODDS"),
        @Result(property = "homeDrawOdds", column = "HOME_DRAW_ODDS"),
        @Result(property = "matchResult", column = "MATCH_RESULT"),
        @Result(property = "halfTimeScore", column = "HALF_TIME_SCORE"),
        @Result(property = "matchScore", column = "MATCH_SCORE"),
        @Result(property = "matchInfo", column = "MATCH_INFO_ID",one = @One(select = "com.codido.hodor.mapper.MatchInfoMapper.selectByPrimaryKey")),
    })
    @ConstructorArgs({
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OUT_MATCH_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="HOME_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_WIN_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_LOST_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_DRAW_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HALF_TIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LotMatchOP> selectByMatchDateAndType(@Param("matchType") String  matchType,@Param("matchDate") String  matchDate, @Param("pageNo") Long pageNo, @Param("prePageCount") Long prePageCount);




    @Select({
        "select",
        "MATCH_ID, MATCH_NAME, MATCH_CODE, OUT_MATCH_ID, MATCH_TYPE, a.MATCH_LEAGUE_CODE, ",
        "a.MATCH_LEAGUE_NAME, MATCH_LEAGUE_ICON_URL, MATCH_TIME, MATCH_STS, a.HOME_TEAM_ID, ",
        "a.HOME_TEAM_NAME, a.HOME_TEAM_ICON_URL, a.GUEST_TEAM_ID, a.GUEST_TEAM_NAME, a.GUEST_TEAM_ICON_URL, ",
        "HOME_WIN_ODDS, HOME_LOST_ODDS, HOME_DRAW_ODDS, a.MATCH_RESULT, a.HALF_TIME_SCORE, ",
        "a.MATCH_SCORE, a.MATCH_INFO_ID",
        "from t_lot_match a,t_match_info b",
        "where b.MATCH_INFO_STS = 'A' AND NOW()<b.MATCH_BEGIN_TIME AND a.MATCH_INFO_ID IS NOT NULL AND a.MATCH_INFO_ID=b.MATCH_INFO_ID AND b.MATCH_LOTTO_ID = #{lottoId,jdbcType=BIGINT} ORDER BY b.MATCH_BEGIN_TIME ASC,b.MATCH_INFO_CODE ASC LIMIT #{pageNo,jdbcType=BIGINT},#{prePageCount,jdbcType=BIGINT}"
    })
    @Results({
        @Result(property = "matchId", column = "MATCH_ID"),
        @Result(property = "matchName", column = "MATCH_NAME"),
        @Result(property = "matchCode", column = "MATCH_CODE"),
        @Result(property = "outMatchId", column = "OUT_MATCH_ID"),
        @Result(property = "matchType", column = "MATCH_TYPE"),
        @Result(property = "matchLeagueCode", column = "MATCH_LEAGUE_CODE"),
        @Result(property = "matchLeagueName", column = "MATCH_LEAGUE_NAME"),
        @Result(property = "matchLeagueIconUrl", column = "MATCH_LEAGUE_ICON_URL"),
        @Result(property = "matchTime", column = "MATCH_TIME"),
        @Result(property = "matchSts", column = "MATCH_STS"),
        @Result(property = "homeTeamId", column = "HOME_TEAM_ID"),
        @Result(property = "homeTeamName", column = "HOME_TEAM_NAME"),
        @Result(property = "homeTeamIconUrl", column = "HOME_TEAM_ICON_URL"),
        @Result(property = "guestTeamId", column = "GUEST_TEAM_ID"),
        @Result(property = "guestTeamName", column = "GUEST_TEAM_NAME"),
        @Result(property = "guestTeamIconUrl", column = "GUEST_TEAM_ICON_URL"),
        @Result(property = "homeWinOdds", column = "HOME_WIN_ODDS"),
        @Result(property = "homeLostOdds", column = "HOME_LOST_ODDS"),
        @Result(property = "homeDrawOdds", column = "HOME_DRAW_ODDS"),
        @Result(property = "matchResult", column = "MATCH_RESULT"),
        @Result(property = "halfTimeScore", column = "HALF_TIME_SCORE"),
        @Result(property = "matchScore", column = "MATCH_SCORE"),
        @Result(property = "matchInfo", column = "MATCH_INFO_ID",one = @One(select = "com.codido.hodor.mapper.MatchInfoMapper.selectByPrimaryKey")),
    })
    @ConstructorArgs({
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OUT_MATCH_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="HOME_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="GUEST_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_WIN_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_LOST_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_DRAW_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="HALF_TIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LotMatchOP> selectMatchListByMatchType(@Param("lottoId") String lottoId, @Param("pageNo") Long pageNo, @Param("prePageCount") Long prePageCount);

    @Select({
            "select",
            "MATCH_ID, MATCH_NAME, MATCH_CODE, OUT_MATCH_ID, MATCH_TYPE, MATCH_LEAGUE_CODE, ",
            "MATCH_LEAGUE_NAME, MATCH_LEAGUE_ICON_URL, MATCH_TIME, MATCH_STS, HOME_TEAM_ID, ",
            "HOME_TEAM_NAME, HOME_TEAM_ICON_URL, GUEST_TEAM_ID, GUEST_TEAM_NAME, GUEST_TEAM_ICON_URL, ",
            "HOME_WIN_ODDS, HOME_LOST_ODDS, HOME_DRAW_ODDS, MATCH_RESULT, HALF_TIME_SCORE, ",
            "MATCH_SCORE, MATCH_INFO_ID",
            "from t_lot_match ",
            "where MATCH_STS IN ('A','E','O') AND MATCH_INFO_ID IS NOT NULL AND MATCH_ID = #{matchId,jdbcType=BIGINT} ORDER BY MATCH_TIME ASC LIMIT 1"
    })
    @Results({
            @Result(property = "matchId", column = "MATCH_ID"),
            @Result(property = "matchName", column = "MATCH_NAME"),
            @Result(property = "matchCode", column = "MATCH_CODE"),
            @Result(property = "outMatchId", column = "OUT_MATCH_ID"),
            @Result(property = "matchType", column = "MATCH_TYPE"),
            @Result(property = "matchLeagueCode", column = "MATCH_LEAGUE_CODE"),
            @Result(property = "matchLeagueName", column = "MATCH_LEAGUE_NAME"),
            @Result(property = "matchLeagueIconUrl", column = "MATCH_LEAGUE_ICON_URL"),
            @Result(property = "matchTime", column = "MATCH_TIME"),
            @Result(property = "matchSts", column = "MATCH_STS"),
            @Result(property = "homeTeamId", column = "HOME_TEAM_ID"),
            @Result(property = "homeTeamName", column = "HOME_TEAM_NAME"),
            @Result(property = "homeTeamIconUrl", column = "HOME_TEAM_ICON_URL"),
            @Result(property = "guestTeamId", column = "GUEST_TEAM_ID"),
            @Result(property = "guestTeamName", column = "GUEST_TEAM_NAME"),
            @Result(property = "guestTeamIconUrl", column = "GUEST_TEAM_ICON_URL"),
            @Result(property = "homeWinOdds", column = "HOME_WIN_ODDS"),
            @Result(property = "homeLostOdds", column = "HOME_LOST_ODDS"),
            @Result(property = "homeDrawOdds", column = "HOME_DRAW_ODDS"),
            @Result(property = "matchResult", column = "MATCH_RESULT"),
            @Result(property = "halfTimeScore", column = "HALF_TIME_SCORE"),
            @Result(property = "matchScore", column = "MATCH_SCORE"),
            @Result(property = "matchInfo", column = "MATCH_INFO_ID",one = @One(select = "com.codido.hodor.mapper.MatchInfoMapper.selectByPrimaryKey")),
    })
    @ConstructorArgs({
            @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
            @Arg(column="MATCH_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="OUT_MATCH_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_LEAGUE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
            @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="HOME_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="HOME_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="GUEST_TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="GUEST_TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="HOME_WIN_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="HOME_LOST_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="HOME_DRAW_ODDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
            @Arg(column="HALF_TIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    LotMatchOP selectMatchByMatchId(@Param("matchId") Long matchId);
}