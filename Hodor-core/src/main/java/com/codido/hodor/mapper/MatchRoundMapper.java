package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchRound;
import com.codido.hodor.model.MatchRoundExample;
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

public interface MatchRoundMapper {
    @SelectProvider(type=MatchRoundSqlProvider.class, method="countByExample")
    long countByExample(MatchRoundExample example);

    @DeleteProvider(type=MatchRoundSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchRoundExample example);

    @Delete({
        "delete from t_match_round",
        "where ROUND_ID = #{roundId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long roundId);

    @Insert({
        "insert into t_match_round (ROUND_ID, SEASON_ID, ",
        "ROUND_NAME, ROUND_ICON_URL, ",
        "ROUND_DESC, ROUND_BEGIN_TIME, ",
        "ROUND_END_TIME, ROUND_STS)",
        "values (#{roundId,jdbcType=BIGINT}, #{seasonId,jdbcType=BIGINT}, ",
        "#{roundName,jdbcType=VARCHAR}, #{roundIconUrl,jdbcType=VARCHAR}, ",
        "#{roundDesc,jdbcType=VARCHAR}, #{roundBeginTime,jdbcType=TIMESTAMP}, ",
        "#{roundEndTime,jdbcType=TIMESTAMP}, #{roundSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="leagueId")
    int insert(MatchRound record);

    @InsertProvider(type=MatchRoundSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="leagueId")
    int insertSelective(MatchRound record);

    @SelectProvider(type=MatchRoundSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ROUND_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ROUND_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ROUND_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<MatchRound> selectByExample(MatchRoundExample example);

    @Select({
        "select",
        "ROUND_ID, LEAGUE_ID, SEASON_ID, ROUND_NAME, ROUND_ICON_URL, ROUND_DESC, ROUND_BEGIN_TIME, ",
        "ROUND_END_TIME, ROUND_STS",
        "from t_match_round",
        "where ROUND_ID = #{roundId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="ROUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ROUND_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ROUND_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ROUND_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ROUND_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    MatchRound selectByPrimaryKey(Long roundId);

    @UpdateProvider(type=MatchRoundSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchRound record, @Param("example") MatchRoundExample example);

    @UpdateProvider(type=MatchRoundSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchRound record, @Param("example") MatchRoundExample example);

    @UpdateProvider(type=MatchRoundSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchRound record);

    @Update({
        "update t_match_round",
        "set LEAGUE_ID = #{leagueId,jdbcType=BIGINT},",
          "SEASON_ID = #{seasonId,jdbcType=BIGINT},",
          "ROUND_NAME = #{roundName,jdbcType=VARCHAR},",
          "ROUND_ICON_URL = #{roundIconUrl,jdbcType=VARCHAR},",
          "ROUND_DESC = #{roundDesc,jdbcType=VARCHAR},",
          "ROUND_BEGIN_TIME = #{roundBeginTime,jdbcType=TIMESTAMP},",
          "ROUND_END_TIME = #{roundEndTime,jdbcType=TIMESTAMP},",
          "ROUND_STS = #{roundSts,jdbcType=CHAR}",
        "where ROUND_ID = #{roundId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchRound record);
}