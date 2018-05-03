package com.codido.hodor.mapper;

import com.codido.hodor.model.LotMatch;
import com.codido.hodor.model.LotMatchExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LotMatchMapper {
    @SelectProvider(type=LotMatchSqlProvider.class, method="countByExample")
    long countByExample(LotMatchExample example);

    @DeleteProvider(type=LotMatchSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotMatchExample example);

    @Delete({
        "delete from t_lot_match",
        "where MATCH_ID = #{matchId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long matchId);

    @Insert({
        "insert into t_lot_match (MATCH_NAME, MATCH_CODE, ",
        "OUT_MATCH_ID, MATCH_TYPE, ",
        "MATCH_LEAGUE_CODE, MATCH_LEAGUE_NAME, ",
        "MATCH_LEAGUE_ICON_URL, MATCH_TIME, ",
        "MATCH_STS, HOME_TEAM_ID, ",
        "HOME_TEAM_NAME, HOME_TEAM_ICON_URL, ",
        "GUEST_TEAM_ID, GUEST_TEAM_NAME, ",
        "GUEST_TEAM_ICON_URL, HOME_WIN_ODDS, ",
        "HOME_LOST_ODDS, HOME_DRAW_ODDS, ",
        "MATCH_RESULT, HALF_TIME_SCORE, ",
        "MATCH_SCORE, MATCH_INFO_ID)",
        "values (#{matchName,jdbcType=VARCHAR}, #{matchCode,jdbcType=VARCHAR}, ",
        "#{outMatchId,jdbcType=VARCHAR}, #{matchType,jdbcType=VARCHAR}, ",
        "#{matchLeagueCode,jdbcType=VARCHAR}, #{matchLeagueName,jdbcType=VARCHAR}, ",
        "#{matchLeagueIconUrl,jdbcType=VARCHAR}, #{matchTime,jdbcType=TIMESTAMP}, ",
        "#{matchSts,jdbcType=CHAR}, #{homeTeamId,jdbcType=BIGINT}, ",
        "#{homeTeamName,jdbcType=VARCHAR}, #{homeTeamIconUrl,jdbcType=VARCHAR}, ",
        "#{guestTeamId,jdbcType=BIGINT}, #{guestTeamName,jdbcType=VARCHAR}, ",
        "#{guestTeamIconUrl,jdbcType=VARCHAR}, #{homeWinOdds,jdbcType=VARCHAR}, ",
        "#{homeLostOdds,jdbcType=VARCHAR}, #{homeDrawOdds,jdbcType=VARCHAR}, ",
        "#{matchResult,jdbcType=CHAR}, #{halfTimeScore,jdbcType=VARCHAR}, ",
        "#{matchScore,jdbcType=VARCHAR}, #{matchInfoId,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="matchId")
    int insert(LotMatch record);

    @InsertProvider(type=LotMatchSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="matchId")
    int insertSelective(LotMatch record);

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
        "MATCH_ID, MATCH_NAME, MATCH_CODE, OUT_MATCH_ID, MATCH_TYPE, MATCH_LEAGUE_CODE, ",
        "MATCH_LEAGUE_NAME, MATCH_LEAGUE_ICON_URL, MATCH_TIME, MATCH_STS, HOME_TEAM_ID, ",
        "HOME_TEAM_NAME, HOME_TEAM_ICON_URL, GUEST_TEAM_ID, GUEST_TEAM_NAME, GUEST_TEAM_ICON_URL, ",
        "HOME_WIN_ODDS, HOME_LOST_ODDS, HOME_DRAW_ODDS, MATCH_RESULT, HALF_TIME_SCORE, ",
        "MATCH_SCORE, MATCH_INFO_ID",
        "from t_lot_match",
        "where MATCH_ID = #{matchId,jdbcType=BIGINT}"
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
    LotMatch selectByPrimaryKey(Long matchId);

    @UpdateProvider(type=LotMatchSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotMatch record, @Param("example") LotMatchExample example);

    @UpdateProvider(type=LotMatchSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotMatch record, @Param("example") LotMatchExample example);

    @UpdateProvider(type=LotMatchSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotMatch record);

    @Update({
        "update t_lot_match",
        "set MATCH_NAME = #{matchName,jdbcType=VARCHAR},",
          "MATCH_CODE = #{matchCode,jdbcType=VARCHAR},",
          "OUT_MATCH_ID = #{outMatchId,jdbcType=VARCHAR},",
          "MATCH_TYPE = #{matchType,jdbcType=VARCHAR},",
          "MATCH_LEAGUE_CODE = #{matchLeagueCode,jdbcType=VARCHAR},",
          "MATCH_LEAGUE_NAME = #{matchLeagueName,jdbcType=VARCHAR},",
          "MATCH_LEAGUE_ICON_URL = #{matchLeagueIconUrl,jdbcType=VARCHAR},",
          "MATCH_TIME = #{matchTime,jdbcType=TIMESTAMP},",
          "MATCH_STS = #{matchSts,jdbcType=CHAR},",
          "HOME_TEAM_ID = #{homeTeamId,jdbcType=BIGINT},",
          "HOME_TEAM_NAME = #{homeTeamName,jdbcType=VARCHAR},",
          "HOME_TEAM_ICON_URL = #{homeTeamIconUrl,jdbcType=VARCHAR},",
          "GUEST_TEAM_ID = #{guestTeamId,jdbcType=BIGINT},",
          "GUEST_TEAM_NAME = #{guestTeamName,jdbcType=VARCHAR},",
          "GUEST_TEAM_ICON_URL = #{guestTeamIconUrl,jdbcType=VARCHAR},",
          "HOME_WIN_ODDS = #{homeWinOdds,jdbcType=VARCHAR},",
          "HOME_LOST_ODDS = #{homeLostOdds,jdbcType=VARCHAR},",
          "HOME_DRAW_ODDS = #{homeDrawOdds,jdbcType=VARCHAR},",
          "MATCH_RESULT = #{matchResult,jdbcType=CHAR},",
          "HALF_TIME_SCORE = #{halfTimeScore,jdbcType=VARCHAR},",
          "MATCH_SCORE = #{matchScore,jdbcType=VARCHAR},",
          "MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}",
        "where MATCH_ID = #{matchId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotMatch record);
}