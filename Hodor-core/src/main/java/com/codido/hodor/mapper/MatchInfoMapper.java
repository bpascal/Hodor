package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchInfo;
import com.codido.hodor.model.MatchInfoExample;
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

public interface MatchInfoMapper {
    @SelectProvider(type=MatchInfoSqlProvider.class, method="countByExample")
    long countByExample(MatchInfoExample example);

    @DeleteProvider(type=MatchInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchInfoExample example);

    @Delete({
        "delete from t_match_info",
        "where MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long matchInfoId);

    @Insert({
        "insert into t_match_info (MATCH_INFO_CODE, MATCH_INFO_NAME, ",
        "MATCH_INFO_ICON_URL, MATCH_INFO_DESC, ",
        "MATCH_ADDRESS, MATCH_WEATHER, ",
        "HOME_TEAM_ID, GUEST_TEAM_ID, ",
        "MATCH_BEGIN_TIME, MATCH_INFO_STS, ",
        "MATCH_INFO_RESULT, MATCH_INFO_SCORE, ",
        "MATCH_INFO_HALFTIME_SCORE, MATCH_LOTTO_ID, ",
        "ROUND_ID, SEASON_ID, ",
        "LEAGUE_ID, SPORTTERY_MATCH_INFO_ID)",
        "values (#{matchInfoCode,jdbcType=VARCHAR}, #{matchInfoName,jdbcType=VARCHAR}, ",
        "#{matchInfoIconUrl,jdbcType=VARCHAR}, #{matchInfoDesc,jdbcType=VARCHAR}, ",
        "#{matchAddress,jdbcType=VARCHAR}, #{matchWeather,jdbcType=VARCHAR}, ",
        "#{homeTeamId,jdbcType=BIGINT}, #{guestTeamId,jdbcType=BIGINT}, ",
        "#{matchBeginTime,jdbcType=TIMESTAMP}, #{matchInfoSts,jdbcType=CHAR}, ",
        "#{matchInfoResult,jdbcType=CHAR}, #{matchInfoScore,jdbcType=VARCHAR}, ",
        "#{matchInfoHalftimeScore,jdbcType=VARCHAR}, #{matchLottoId,jdbcType=BIGINT}, ",
        "#{roundId,jdbcType=BIGINT}, #{seasonId,jdbcType=BIGINT}, ",
        "#{leagueId,jdbcType=BIGINT}, #{sportteryMatchInfoId,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="matchInfoId")
    int insert(MatchInfo record);

    @InsertProvider(type=MatchInfoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="matchInfoId")
    int insertSelective(MatchInfo record);

    @SelectProvider(type=MatchInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_INFO_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_WEATHER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_INFO_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_INFO_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_INFO_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_HALFTIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SPORTTERY_MATCH_INFO_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MatchInfo> selectByExample(MatchInfoExample example);

    @Select({
        "select",
        "MATCH_INFO_ID, MATCH_INFO_CODE, MATCH_INFO_NAME, MATCH_INFO_ICON_URL, MATCH_INFO_DESC, ",
        "MATCH_ADDRESS, MATCH_WEATHER, HOME_TEAM_ID, GUEST_TEAM_ID, MATCH_BEGIN_TIME, ",
        "MATCH_INFO_STS, MATCH_INFO_RESULT, MATCH_INFO_SCORE, MATCH_INFO_HALFTIME_SCORE, ",
        "MATCH_LOTTO_ID, ROUND_ID, SEASON_ID, LEAGUE_ID, SPORTTERY_MATCH_INFO_ID",
        "from t_match_info",
        "where MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_INFO_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_WEATHER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HOME_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="GUEST_TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_INFO_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_INFO_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_INFO_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_HALFTIME_SCORE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SPORTTERY_MATCH_INFO_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    MatchInfo selectByPrimaryKey(Long matchInfoId);

    @UpdateProvider(type=MatchInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchInfo record, @Param("example") MatchInfoExample example);

    @UpdateProvider(type=MatchInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchInfo record, @Param("example") MatchInfoExample example);

    @UpdateProvider(type=MatchInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchInfo record);

    @Update({
        "update t_match_info",
        "set MATCH_INFO_CODE = #{matchInfoCode,jdbcType=VARCHAR},",
          "MATCH_INFO_NAME = #{matchInfoName,jdbcType=VARCHAR},",
          "MATCH_INFO_ICON_URL = #{matchInfoIconUrl,jdbcType=VARCHAR},",
          "MATCH_INFO_DESC = #{matchInfoDesc,jdbcType=VARCHAR},",
          "MATCH_ADDRESS = #{matchAddress,jdbcType=VARCHAR},",
          "MATCH_WEATHER = #{matchWeather,jdbcType=VARCHAR},",
          "HOME_TEAM_ID = #{homeTeamId,jdbcType=BIGINT},",
          "GUEST_TEAM_ID = #{guestTeamId,jdbcType=BIGINT},",
          "MATCH_BEGIN_TIME = #{matchBeginTime,jdbcType=TIMESTAMP},",
          "MATCH_INFO_STS = #{matchInfoSts,jdbcType=CHAR},",
          "MATCH_INFO_RESULT = #{matchInfoResult,jdbcType=CHAR},",
          "MATCH_INFO_SCORE = #{matchInfoScore,jdbcType=VARCHAR},",
          "MATCH_INFO_HALFTIME_SCORE = #{matchInfoHalftimeScore,jdbcType=VARCHAR},",
          "MATCH_LOTTO_ID = #{matchLottoId,jdbcType=BIGINT},",
          "ROUND_ID = #{roundId,jdbcType=BIGINT},",
          "SEASON_ID = #{seasonId,jdbcType=BIGINT},",
          "LEAGUE_ID = #{leagueId,jdbcType=BIGINT},",
          "SPORTTERY_MATCH_INFO_ID = #{sportteryMatchInfoId,jdbcType=VARCHAR}",
        "where MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchInfo record);
}