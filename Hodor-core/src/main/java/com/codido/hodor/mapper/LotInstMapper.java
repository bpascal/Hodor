package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInst;
import com.codido.hodor.model.LotInstExample;
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

public interface LotInstMapper {
    @SelectProvider(type=LotInstSqlProvider.class, method="countByExample")
    long countByExample(LotInstExample example);

    @DeleteProvider(type=LotInstSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotInstExample example);

    @Delete({
        "delete from t_lot_inst",
        "where LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long lottoInstId);

    @Insert({
        "insert into t_lot_inst (LOTTO_ID, PERIOD_NAME, ",
        "PERIOD_BEGIN_TIME, PERIOD_END_TIME, ",
        "PERIOD_BONUS_TIME, PERIOD_STS, ",
        "PERIOD_TAGS, PERIOD_TAGS_NAME, ",
        "PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
        "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC)",
        "values (#{lottoId,jdbcType=BIGINT}, #{periodName,jdbcType=VARCHAR}, ",
        "#{periodBeginTime,jdbcType=TIMESTAMP}, #{periodEndTime,jdbcType=TIMESTAMP}, ",
        "#{periodBonusTime,jdbcType=TIMESTAMP}, #{periodSts,jdbcType=CHAR}, ",
        "#{periodTags,jdbcType=VARCHAR}, #{periodTagsName,jdbcType=VARCHAR}, ",
        "#{periodBonusNumber,jdbcType=VARCHAR}, #{periodTotalSell,jdbcType=VARCHAR}, ",
        "#{periodTotalBonus,jdbcType=VARCHAR}, #{periodTotalBonusDesc,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="lottoInstId")
    int insert(LotInst record);

    @InsertProvider(type=LotInstSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="lottoInstId")
    int insertSelective(LotInst record);

    @SelectProvider(type=LotInstSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PERIOD_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PERIOD_TAGS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TAGS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_BONUS_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_SELL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_BONUS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<LotInst> selectByExample(LotInstExample example);

    @Select({
        "select",
        "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
        "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
        "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC",
        "from t_lot_inst",
        "where LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PERIOD_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PERIOD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PERIOD_TAGS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TAGS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_BONUS_NUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_SELL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_BONUS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERIOD_TOTAL_BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    LotInst selectByPrimaryKey(Long lottoInstId);

    @UpdateProvider(type=LotInstSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotInst record, @Param("example") LotInstExample example);

    @UpdateProvider(type=LotInstSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotInst record, @Param("example") LotInstExample example);

    @UpdateProvider(type=LotInstSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotInst record);

    @Update({
        "update t_lot_inst",
        "set LOTTO_ID = #{lottoId,jdbcType=BIGINT},",
          "PERIOD_NAME = #{periodName,jdbcType=VARCHAR},",
          "PERIOD_BEGIN_TIME = #{periodBeginTime,jdbcType=TIMESTAMP},",
          "PERIOD_END_TIME = #{periodEndTime,jdbcType=TIMESTAMP},",
          "PERIOD_BONUS_TIME = #{periodBonusTime,jdbcType=TIMESTAMP},",
          "PERIOD_STS = #{periodSts,jdbcType=CHAR},",
          "PERIOD_TAGS = #{periodTags,jdbcType=VARCHAR},",
          "PERIOD_TAGS_NAME = #{periodTagsName,jdbcType=VARCHAR},",
          "PERIOD_BONUS_NUMBER = #{periodBonusNumber,jdbcType=VARCHAR},",
          "PERIOD_TOTAL_SELL = #{periodTotalSell,jdbcType=VARCHAR},",
          "PERIOD_TOTAL_BONUS = #{periodTotalBonus,jdbcType=VARCHAR},",
          "PERIOD_TOTAL_BONUS_DESC = #{periodTotalBonusDesc,jdbcType=VARCHAR}",
        "where LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotInst record);
}