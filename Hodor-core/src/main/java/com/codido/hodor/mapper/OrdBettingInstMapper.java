package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdBettingInst;
import com.codido.hodor.model.OrdBettingInstExample;
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

public interface OrdBettingInstMapper {
    @SelectProvider(type=OrdBettingInstSqlProvider.class, method="countByExample")
    long countByExample(OrdBettingInstExample example);

    @DeleteProvider(type=OrdBettingInstSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdBettingInstExample example);

    @Delete({
        "delete from t_ord_betting_inst",
        "where BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bettingInstId);

    @Insert({
        "insert into t_ord_betting_inst (LOTTO_INST_ID, USER_ID, ",
        "CHOOSE_NUMBER, BETTING_TYPE, ",
        "CHOOSE_TIME, BETTING_COUNTS, ",
        "BETTING_AMT, MATCH_ID, ",
        "NUMBER_TIMES, BETTING_INST_STS, ",
        "BETTING_BONUS_STS, BETTING_INST_AMT, ",
        "ORDER_NO)",
        "values (#{lottoInstId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{chooseNumber,jdbcType=VARCHAR}, #{bettingType,jdbcType=CHAR}, ",
        "#{chooseTime,jdbcType=TIMESTAMP}, #{bettingCounts,jdbcType=INTEGER}, ",
        "#{bettingAmt,jdbcType=INTEGER}, #{matchId,jdbcType=BIGINT}, ",
        "#{numberTimes,jdbcType=INTEGER}, #{bettingInstSts,jdbcType=CHAR}, ",
        "#{bettingBonusSts,jdbcType=CHAR}, #{bettingInstAmt,jdbcType=BIGINT}, ",
        "#{orderNo,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="bettingInstId")
    int insert(OrdBettingInst record);

    @InsertProvider(type=OrdBettingInstSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="bettingInstId")
    int insertSelective(OrdBettingInst record);

    @SelectProvider(type=OrdBettingInstSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="BETTING_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="CHOOSE_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHOOSE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="BETTING_COUNTS", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="NUMBER_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_INST_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OrdBettingInst> selectByExample(OrdBettingInstExample example);

    @Select({
        "select",
        "BETTING_INST_ID, LOTTO_INST_ID, USER_ID, CHOOSE_NUMBER, BETTING_TYPE, CHOOSE_TIME, ",
        "BETTING_COUNTS, BETTING_AMT, MATCH_ID, NUMBER_TIMES, BETTING_INST_STS, BETTING_BONUS_STS, ",
        "BETTING_INST_AMT, ORDER_NO",
        "from t_ord_betting_inst",
        "where BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="BETTING_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="CHOOSE_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BETTING_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHOOSE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="BETTING_COUNTS", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_AMT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="NUMBER_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="BETTING_INST_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BETTING_INST_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    OrdBettingInst selectByPrimaryKey(Long bettingInstId);

    @UpdateProvider(type=OrdBettingInstSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdBettingInst record, @Param("example") OrdBettingInstExample example);

    @UpdateProvider(type=OrdBettingInstSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdBettingInst record, @Param("example") OrdBettingInstExample example);

    @UpdateProvider(type=OrdBettingInstSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdBettingInst record);

    @Update({
        "update t_ord_betting_inst",
        "set LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "CHOOSE_NUMBER = #{chooseNumber,jdbcType=VARCHAR},",
          "BETTING_TYPE = #{bettingType,jdbcType=CHAR},",
          "CHOOSE_TIME = #{chooseTime,jdbcType=TIMESTAMP},",
          "BETTING_COUNTS = #{bettingCounts,jdbcType=INTEGER},",
          "BETTING_AMT = #{bettingAmt,jdbcType=INTEGER},",
          "MATCH_ID = #{matchId,jdbcType=BIGINT},",
          "NUMBER_TIMES = #{numberTimes,jdbcType=INTEGER},",
          "BETTING_INST_STS = #{bettingInstSts,jdbcType=CHAR},",
          "BETTING_BONUS_STS = #{bettingBonusSts,jdbcType=CHAR},",
          "BETTING_INST_AMT = #{bettingInstAmt,jdbcType=BIGINT},",
          "ORDER_NO = #{orderNo,jdbcType=VARCHAR}",
        "where BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdBettingInst record);
}