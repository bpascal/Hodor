package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlayOdds;
import com.codido.hodor.model.MatchPlayOddsExample;
import java.math.BigDecimal;
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

public interface MatchPlayOddsMapper {
    @SelectProvider(type=MatchPlayOddsSqlProvider.class, method="countByExample")
    long countByExample(MatchPlayOddsExample example);

    @DeleteProvider(type=MatchPlayOddsSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchPlayOddsExample example);

    @Delete({
        "delete from t_match_play_odds",
        "where ODDS_ID = #{oddsId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long oddsId);

    @Insert({
        "insert into t_match_play_odds (MATCH_PLAY_INST_ID, ODDS_NAME, ",
        "ODDS_CODE, ODDS_PARAM_NAME, ",
        "ODDS_PARAM_VALUE, ODDS_VALUE, ",
        "ODDS_STS, ODDS_TREND, ODDS_CREATE_TIME, ",
        "ODDS_INVALID_TIME)",
        "values (#{matchPlayInstId,jdbcType=BIGINT}, #{oddsName,jdbcType=VARCHAR}, ",
        "#{oddsCode,jdbcType=VARCHAR}, #{oddsParamName,jdbcType=VARCHAR}, ",
        "#{oddsParamValue,jdbcType=VARCHAR}, #{oddsValue,jdbcType=DECIMAL}, ",
        "#{oddsSts,jdbcType=CHAR}, #{oddsTrend,jdbcType=CHAR}, #{oddsCreateTime,jdbcType=TIMESTAMP}, ",
        "#{oddsInvalidTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="oddsId")
    int insert(MatchPlayOdds record);

    @InsertProvider(type=MatchPlayOddsSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="oddsId")
    int insertSelective(MatchPlayOdds record);

    @SelectProvider(type=MatchPlayOddsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ODDS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_PLAY_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ODDS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_PARAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_PARAM_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_VALUE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ODDS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ODDS_TREND", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ODDS_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ODDS_INVALID_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<MatchPlayOdds> selectByExample(MatchPlayOddsExample example);

    @Select({
        "select",
        "ODDS_ID, MATCH_PLAY_INST_ID, ODDS_NAME, ODDS_CODE, ODDS_PARAM_NAME, ODDS_PARAM_VALUE, ",
        "ODDS_VALUE, ODDS_STS, ODDS_TREND, ODDS_CREATE_TIME, ODDS_INVALID_TIME",
        "from t_match_play_odds",
        "where ODDS_ID = #{oddsId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="ODDS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_PLAY_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ODDS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_PARAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_PARAM_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ODDS_VALUE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ODDS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ODDS_TREND", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ODDS_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ODDS_INVALID_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    MatchPlayOdds selectByPrimaryKey(Long oddsId);

    @UpdateProvider(type=MatchPlayOddsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchPlayOdds record, @Param("example") MatchPlayOddsExample example);

    @UpdateProvider(type=MatchPlayOddsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchPlayOdds record, @Param("example") MatchPlayOddsExample example);

    @UpdateProvider(type=MatchPlayOddsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchPlayOdds record);

    @Update({
        "update t_match_play_odds",
        "set MATCH_PLAY_INST_ID = #{matchPlayInstId,jdbcType=BIGINT},",
          "ODDS_NAME = #{oddsName,jdbcType=VARCHAR},",
          "ODDS_CODE = #{oddsCode,jdbcType=VARCHAR},",
          "ODDS_PARAM_NAME = #{oddsParamName,jdbcType=VARCHAR},",
          "ODDS_PARAM_VALUE = #{oddsParamValue,jdbcType=VARCHAR},",
          "ODDS_VALUE = #{oddsValue,jdbcType=DECIMAL},",
          "ODDS_STS = #{oddsSts,jdbcType=CHAR},",
          "ODDS_TREND = #{oddsTrend,jdbcType=CHAR},",
          "ODDS_CREATE_TIME = #{oddsCreateTime,jdbcType=TIMESTAMP},",
          "ODDS_INVALID_TIME = #{oddsInvalidTime,jdbcType=TIMESTAMP}",
        "where ODDS_ID = #{oddsId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchPlayOdds record);
}