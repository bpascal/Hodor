package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlayOdds;
import com.codido.hodor.model.MatchPlayOddsExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface MatchPlayOddsOPMapper {


    @Select({
        "select",
        "ODDS_ID, MATCH_PLAY_INST_ID, ODDS_NAME, ODDS_CODE, ODDS_PARAM_NAME, ODDS_PARAM_VALUE, ",
        "ODDS_VALUE, ODDS_STS, ODDS_TREND, ODDS_CREATE_TIME, ODDS_INVALID_TIME",
        "from t_match_play_odds",
        "where MATCH_PLAY_INST_ID = #{matchPlayInstId,jdbcType=BIGINT} AND ODDS_STS NOT IN ('N','T')"
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
    List<MatchPlayOdds> selectByPlayInstId(@Param("matchPlayInstId") Long matchPlayInstId);
}