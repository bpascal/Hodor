package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdChaseBetting;
import com.codido.hodor.model.OrdChaseBettingExample;
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

public interface OrdChaseBettingMapper {
    @SelectProvider(type=OrdChaseBettingSqlProvider.class, method="countByExample")
    long countByExample(OrdChaseBettingExample example);

    @DeleteProvider(type=OrdChaseBettingSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdChaseBettingExample example);

    @Delete({
        "delete from t_ord_chase_betting",
        "where CHASE_BETTING_ID = #{chaseBettingId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long chaseBettingId);

    @Insert({
        "insert into t_ord_chase_betting (CHASE_NO, CHOOSE_NUMBER, ",
        "BETTING_TYPE, BETTING_COUNTS, ",
        "BETTING_AMT, NUMBER_TIMES, ",
        "BETTING_INST_STS)",
        "values (#{chaseNo,jdbcType=VARCHAR}, #{chooseNumber,jdbcType=VARCHAR}, ",
        "#{bettingType,jdbcType=CHAR}, #{bettingCounts,jdbcType=INTEGER}, ",
        "#{bettingAmt,jdbcType=INTEGER}, #{numberTimes,jdbcType=INTEGER}, ",
        "#{bettingInstSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="chaseBettingId")
    int insert(OrdChaseBetting record);

    @InsertProvider(type=OrdChaseBettingSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="chaseBettingId")
    int insertSelective(OrdChaseBetting record);

    @SelectProvider(type=OrdChaseBettingSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="CHASE_BETTING_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHOOSE_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_COUNTS", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="NUMBER_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<OrdChaseBetting> selectByExample(OrdChaseBettingExample example);

    @Select({
        "select",
        "CHASE_BETTING_ID, CHASE_NO, CHOOSE_NUMBER, BETTING_TYPE, BETTING_COUNTS, BETTING_AMT, ",
        "NUMBER_TIMES, BETTING_INST_STS",
        "from t_ord_chase_betting",
        "where CHASE_BETTING_ID = #{chaseBettingId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="CHASE_BETTING_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHOOSE_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_COUNTS", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="NUMBER_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    OrdChaseBetting selectByPrimaryKey(Long chaseBettingId);

    @UpdateProvider(type=OrdChaseBettingSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdChaseBetting record, @Param("example") OrdChaseBettingExample example);

    @UpdateProvider(type=OrdChaseBettingSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdChaseBetting record, @Param("example") OrdChaseBettingExample example);

    @UpdateProvider(type=OrdChaseBettingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdChaseBetting record);

    @Update({
        "update t_ord_chase_betting",
        "set CHASE_NO = #{chaseNo,jdbcType=VARCHAR},",
          "CHOOSE_NUMBER = #{chooseNumber,jdbcType=VARCHAR},",
          "BETTING_TYPE = #{bettingType,jdbcType=CHAR},",
          "BETTING_COUNTS = #{bettingCounts,jdbcType=INTEGER},",
          "BETTING_AMT = #{bettingAmt,jdbcType=INTEGER},",
          "NUMBER_TIMES = #{numberTimes,jdbcType=INTEGER},",
          "BETTING_INST_STS = #{bettingInstSts,jdbcType=CHAR}",
        "where CHASE_BETTING_ID = #{chaseBettingId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdChaseBetting record);
}