package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdBettingSingleInst;
import com.codido.hodor.model.OrdBettingSingleInstExample;
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

public interface OrdBettingSingleInstMapper {
    @SelectProvider(type=OrdBettingSingleInstSqlProvider.class, method="countByExample")
    long countByExample(OrdBettingSingleInstExample example);

    @DeleteProvider(type=OrdBettingSingleInstSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdBettingSingleInstExample example);

    @Delete({
        "delete from t_ord_betting_single_inst",
        "where SINGLE_INST_ID = #{singleInstId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long singleInstId);

    @Insert({
        "insert into t_ord_betting_single_inst (LOTTO_INST_ID, PERIOD_NAME, ",
        "BETTING_INST_ID, SINGLE_INST_NUMBER, ",
        "SINGLE_INST_TIMES, LOTTO_BONUS_ID, ",
        "LOTTO_BONUS_LEVEL, SINGLE_INST_STS, ",
        "SINGLE_INST_BONUS_STS, BONUS_AMT)",
        "values (#{lottoInstId,jdbcType=BIGINT}, #{periodName,jdbcType=VARCHAR}, ",
        "#{bettingInstId,jdbcType=BIGINT}, #{singleInstNumber,jdbcType=VARCHAR}, ",
        "#{singleInstTimes,jdbcType=INTEGER}, #{lottoBonusId,jdbcType=BIGINT}, ",
        "#{lottoBonusLevel,jdbcType=VARCHAR}, #{singleInstSts,jdbcType=CHAR}, ",
        "#{singleInstBonusSts,jdbcType=CHAR}, #{bonusAmt,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="singleInstId")
    int insert(OrdBettingSingleInst record);

    @InsertProvider(type=OrdBettingSingleInstSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="singleInstId")
    int insertSelective(OrdBettingSingleInst record);

    @SelectProvider(type=OrdBettingSingleInstSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SINGLE_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PERIOD_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SINGLE_INST_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SINGLE_INST_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SINGLE_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SINGLE_INST_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OrdBettingSingleInst> selectByExample(OrdBettingSingleInstExample example);

    @Select({
        "select",
        "SINGLE_INST_ID, LOTTO_INST_ID, PERIOD_NAME, BETTING_INST_ID, SINGLE_INST_NUMBER, ",
        "SINGLE_INST_TIMES, LOTTO_BONUS_ID, LOTTO_BONUS_LEVEL, SINGLE_INST_STS, SINGLE_INST_BONUS_STS, ",
        "BONUS_AMT",
        "from t_ord_betting_single_inst",
        "where SINGLE_INST_ID = #{singleInstId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SINGLE_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PERIOD_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SINGLE_INST_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SINGLE_INST_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SINGLE_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SINGLE_INST_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    OrdBettingSingleInst selectByPrimaryKey(Long singleInstId);

    @UpdateProvider(type=OrdBettingSingleInstSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdBettingSingleInst record, @Param("example") OrdBettingSingleInstExample example);

    @UpdateProvider(type=OrdBettingSingleInstSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdBettingSingleInst record, @Param("example") OrdBettingSingleInstExample example);

    @UpdateProvider(type=OrdBettingSingleInstSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdBettingSingleInst record);

    @Update({
        "update t_ord_betting_single_inst",
        "set LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT},",
          "PERIOD_NAME = #{periodName,jdbcType=VARCHAR},",
          "BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT},",
          "SINGLE_INST_NUMBER = #{singleInstNumber,jdbcType=VARCHAR},",
          "SINGLE_INST_TIMES = #{singleInstTimes,jdbcType=INTEGER},",
          "LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT},",
          "LOTTO_BONUS_LEVEL = #{lottoBonusLevel,jdbcType=VARCHAR},",
          "SINGLE_INST_STS = #{singleInstSts,jdbcType=CHAR},",
          "SINGLE_INST_BONUS_STS = #{singleInstBonusSts,jdbcType=CHAR},",
          "BONUS_AMT = #{bonusAmt,jdbcType=BIGINT}",
        "where SINGLE_INST_ID = #{singleInstId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdBettingSingleInst record);
}