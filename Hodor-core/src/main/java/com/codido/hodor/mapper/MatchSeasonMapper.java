package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchSeason;
import com.codido.hodor.model.MatchSeasonExample;
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

public interface MatchSeasonMapper {
    @SelectProvider(type=MatchSeasonSqlProvider.class, method="countByExample")
    long countByExample(MatchSeasonExample example);

    @DeleteProvider(type=MatchSeasonSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchSeasonExample example);

    @Delete({
        "delete from t_match_season",
        "where SEASON_ID = #{seasonId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long seasonId);

    @Insert({
        "insert into t_match_season (LEAGUE_ID, SEASON_NAME, ",
        "SEASON_ICON_URL, CURRENT_ROUND_ID, ",
        "SEASON_BEGIN_TIME, SEASON_END_TIME, ",
        "SEASON_STS)",
        "values (#{leagueId,jdbcType=BIGINT}, #{seasonName,jdbcType=VARCHAR}, ",
        "#{seasonIconUrl,jdbcType=VARCHAR}, #{currentRoundId,jdbcType=BIGINT}, ",
        "#{seasonBeginTime,jdbcType=TIMESTAMP}, #{seasonEndTime,jdbcType=TIMESTAMP}, ",
        "#{seasonSts,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="seasonId")
    int insert(MatchSeason record);

    @InsertProvider(type=MatchSeasonSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="seasonId")
    int insertSelective(MatchSeason record);

    @SelectProvider(type=MatchSeasonSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEASON_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CURRENT_ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEASON_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEASON_STS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MatchSeason> selectByExample(MatchSeasonExample example);

    @Select({
        "select",
        "SEASON_ID, LEAGUE_ID, SEASON_NAME, SEASON_ICON_URL, CURRENT_ROUND_ID, SEASON_BEGIN_TIME, ",
        "SEASON_END_TIME, SEASON_STS",
        "from t_match_season",
        "where SEASON_ID = #{seasonId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEASON_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CURRENT_ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEASON_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEASON_STS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    MatchSeason selectByPrimaryKey(Long seasonId);

    @UpdateProvider(type=MatchSeasonSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchSeason record, @Param("example") MatchSeasonExample example);

    @UpdateProvider(type=MatchSeasonSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchSeason record, @Param("example") MatchSeasonExample example);

    @UpdateProvider(type=MatchSeasonSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchSeason record);

    @Update({
        "update t_match_season",
        "set LEAGUE_ID = #{leagueId,jdbcType=BIGINT},",
          "SEASON_NAME = #{seasonName,jdbcType=VARCHAR},",
          "SEASON_ICON_URL = #{seasonIconUrl,jdbcType=VARCHAR},",
          "CURRENT_ROUND_ID = #{currentRoundId,jdbcType=BIGINT},",
          "SEASON_BEGIN_TIME = #{seasonBeginTime,jdbcType=TIMESTAMP},",
          "SEASON_END_TIME = #{seasonEndTime,jdbcType=TIMESTAMP},",
          "SEASON_STS = #{seasonSts,jdbcType=VARCHAR}",
        "where SEASON_ID = #{seasonId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchSeason record);
}