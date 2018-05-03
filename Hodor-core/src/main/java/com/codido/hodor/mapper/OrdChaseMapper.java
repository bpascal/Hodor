package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdChase;
import com.codido.hodor.model.OrdChaseExample;
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

public interface OrdChaseMapper {
    @SelectProvider(type=OrdChaseSqlProvider.class, method="countByExample")
    long countByExample(OrdChaseExample example);

    @DeleteProvider(type=OrdChaseSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdChaseExample example);

    @Delete({
        "delete from t_ord_chase",
        "where CHASE_ID = #{chaseId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long chaseId);

    @Insert({
        "insert into t_ord_chase (CHASE_NO, USER_ID, ",
        "LOTTO_ID, CHASE_STS, CHASE_TIMES, ",
        "CHASE_CURRENT_TIMES, END_METHOD, ",
        "PER_TIME_AMT, PER_TIME_BETTING_COUNTS, ",
        "CHASE_BETTING_TIMES, CHASE_CREATE_TIME, ",
        "CHASE_CANCEL_TIME)",
        "values (#{chaseNo,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{lottoId,jdbcType=BIGINT}, #{chaseSts,jdbcType=CHAR}, #{chaseTimes,jdbcType=INTEGER}, ",
        "#{chaseCurrentTimes,jdbcType=INTEGER}, #{endMethod,jdbcType=CHAR}, ",
        "#{perTimeAmt,jdbcType=INTEGER}, #{perTimeBettingCounts,jdbcType=VARCHAR}, ",
        "#{chaseBettingTimes,jdbcType=INTEGER}, #{chaseCreateTime,jdbcType=TIMESTAMP}, ",
        "#{chaseCancelTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="chaseId")
    int insert(OrdChase record);

    @InsertProvider(type=OrdChaseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="chaseId")
    int insertSelective(OrdChase record);

    @SelectProvider(type=OrdChaseSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="CHASE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="CHASE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHASE_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CHASE_CURRENT_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="END_METHOD", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PER_TIME_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="PER_TIME_BETTING_COUNTS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHASE_BETTING_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CHASE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CHASE_CANCEL_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrdChase> selectByExample(OrdChaseExample example);

    @Select({
        "select",
        "CHASE_ID, CHASE_NO, USER_ID, LOTTO_ID, CHASE_STS, CHASE_TIMES, CHASE_CURRENT_TIMES, ",
        "END_METHOD, PER_TIME_AMT, PER_TIME_BETTING_COUNTS, CHASE_BETTING_TIMES, CHASE_CREATE_TIME, ",
        "CHASE_CANCEL_TIME",
        "from t_ord_chase",
        "where CHASE_ID = #{chaseId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="CHASE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="CHASE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHASE_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CHASE_CURRENT_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="END_METHOD", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PER_TIME_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="PER_TIME_BETTING_COUNTS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHASE_BETTING_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CHASE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CHASE_CANCEL_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    OrdChase selectByPrimaryKey(Long chaseId);

    @UpdateProvider(type=OrdChaseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdChase record, @Param("example") OrdChaseExample example);

    @UpdateProvider(type=OrdChaseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdChase record, @Param("example") OrdChaseExample example);

    @UpdateProvider(type=OrdChaseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdChase record);

    @Update({
        "update t_ord_chase",
        "set CHASE_NO = #{chaseNo,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "LOTTO_ID = #{lottoId,jdbcType=BIGINT},",
          "CHASE_STS = #{chaseSts,jdbcType=CHAR},",
          "CHASE_TIMES = #{chaseTimes,jdbcType=INTEGER},",
          "CHASE_CURRENT_TIMES = #{chaseCurrentTimes,jdbcType=INTEGER},",
          "END_METHOD = #{endMethod,jdbcType=CHAR},",
          "PER_TIME_AMT = #{perTimeAmt,jdbcType=INTEGER},",
          "PER_TIME_BETTING_COUNTS = #{perTimeBettingCounts,jdbcType=VARCHAR},",
          "CHASE_BETTING_TIMES = #{chaseBettingTimes,jdbcType=INTEGER},",
          "CHASE_CREATE_TIME = #{chaseCreateTime,jdbcType=TIMESTAMP},",
          "CHASE_CANCEL_TIME = #{chaseCancelTime,jdbcType=TIMESTAMP}",
        "where CHASE_ID = #{chaseId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdChase record);
}