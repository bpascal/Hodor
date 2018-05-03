package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlayInst;
import com.codido.hodor.model.MatchPlayInstExample;
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

public interface MatchPlayInstMapper {
    @SelectProvider(type=MatchPlayInstSqlProvider.class, method="countByExample")
    long countByExample(MatchPlayInstExample example);

    @DeleteProvider(type=MatchPlayInstSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchPlayInstExample example);

    @Delete({
        "delete from t_match_play_inst",
        "where MATCH_PLAY_INST_ID = #{matchPlayInstId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long matchPlayInstId);

    @Insert({
        "insert into t_match_play_inst (MATCH_PLAY_ID, MATCH_PLAY_NAME, ",
        "MATCH_INFO_ID, MATCH_PLAY_PARAM, ",
        "MATCH_PLAY_MIN_COUNT, MATCH_PLAY_MAX_COUNT, ",
        "MATCH_PLAY_SELLING_FLAG, MATCH_PLAY_STS, ",
        "MATCH_PLAY_CREATE_TIME, MATCH_PLAY_INVALID_TIME, ",
        "MATCH_RESULT_ODDS_CODE)",
        "values (#{matchPlayId,jdbcType=BIGINT}, #{matchPlayName,jdbcType=VARCHAR}, ",
        "#{matchInfoId,jdbcType=BIGINT}, #{matchPlayParam,jdbcType=VARCHAR}, ",
        "#{matchPlayMinCount,jdbcType=INTEGER}, #{matchPlayMaxCount,jdbcType=INTEGER}, ",
        "#{matchPlaySellingFlag,jdbcType=CHAR}, #{matchPlaySts,jdbcType=CHAR}, ",
        "#{matchPlayCreateTime,jdbcType=TIMESTAMP}, #{matchPlayInvalidTime,jdbcType=TIMESTAMP}, ",
        "#{matchResultOddsCode,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="matchPlayInstId")
    int insert(MatchPlayInst record);

    @InsertProvider(type=MatchPlayInstSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="matchPlayInstId")
    int insertSelective(MatchPlayInst record);

    @SelectProvider(type=MatchPlayInstSqlProvider.class, method="selectByExample")
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
    List<MatchPlayInst> selectByExample(MatchPlayInstExample example);

    @Select({
        "select",
        "MATCH_PLAY_INST_ID, MATCH_PLAY_ID, MATCH_PLAY_NAME, MATCH_INFO_ID, MATCH_PLAY_PARAM, ",
        "MATCH_PLAY_MIN_COUNT, MATCH_PLAY_MAX_COUNT, MATCH_PLAY_SELLING_FLAG, MATCH_PLAY_STS, ",
        "MATCH_PLAY_CREATE_TIME, MATCH_PLAY_INVALID_TIME, MATCH_RESULT_ODDS_CODE",
        "from t_match_play_inst",
        "where MATCH_PLAY_INST_ID = #{matchPlayInstId,jdbcType=BIGINT}"
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
    MatchPlayInst selectByPrimaryKey(Long matchPlayInstId);

    @UpdateProvider(type=MatchPlayInstSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchPlayInst record, @Param("example") MatchPlayInstExample example);

    @UpdateProvider(type=MatchPlayInstSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchPlayInst record, @Param("example") MatchPlayInstExample example);

    @UpdateProvider(type=MatchPlayInstSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchPlayInst record);

    @Update({
        "update t_match_play_inst",
        "set MATCH_PLAY_ID = #{matchPlayId,jdbcType=BIGINT},",
          "MATCH_PLAY_NAME = #{matchPlayName,jdbcType=VARCHAR},",
          "MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT},",
          "MATCH_PLAY_PARAM = #{matchPlayParam,jdbcType=VARCHAR},",
          "MATCH_PLAY_MIN_COUNT = #{matchPlayMinCount,jdbcType=INTEGER},",
          "MATCH_PLAY_MAX_COUNT = #{matchPlayMaxCount,jdbcType=INTEGER},",
          "MATCH_PLAY_SELLING_FLAG = #{matchPlaySellingFlag,jdbcType=CHAR},",
          "MATCH_PLAY_STS = #{matchPlaySts,jdbcType=CHAR},",
          "MATCH_PLAY_CREATE_TIME = #{matchPlayCreateTime,jdbcType=TIMESTAMP},",
          "MATCH_PLAY_INVALID_TIME = #{matchPlayInvalidTime,jdbcType=TIMESTAMP},",
          "MATCH_RESULT_ODDS_CODE = #{matchResultOddsCode,jdbcType=VARCHAR}",
        "where MATCH_PLAY_INST_ID = #{matchPlayInstId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchPlayInst record);
}