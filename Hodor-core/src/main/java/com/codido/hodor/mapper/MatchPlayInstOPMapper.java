package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlayInst;
import com.codido.hodor.model.MatchPlayInstExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface MatchPlayInstOPMapper {

    @Select({
        "select",
        "MATCH_PLAY_INST_ID, MATCH_PLAY_ID, MATCH_PLAY_NAME, MATCH_INFO_ID, MATCH_PLAY_PARAM, ",
        "MATCH_PLAY_MIN_COUNT, MATCH_PLAY_MAX_COUNT, MATCH_PLAY_SELLING_FLAG, MATCH_PLAY_STS, ",
        "MATCH_PLAY_CREATE_TIME, MATCH_PLAY_INVALID_TIME, MATCH_RESULT_ODDS_CODE",
        "from t_match_play_inst",
        "where MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT} AND MATCH_PLAY_STS = 'A'"
    })
    @ConstructorArgs({
        @Arg(column="MATCH_PLAY_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MATCH_PLAY_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_PLAY_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_PLAY_PARAM", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MATCH_PLAY_MIN_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="MATCH_PLAY_MAX_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="MATCH_PLAY_SELLING_FLAG", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_PLAY_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MATCH_PLAY_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_PLAY_INVALID_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MATCH_RESULT_ODDS_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MatchPlayInst> selectByMatchInfoId(@Param("matchInfoId") Long matchInfoId);
}