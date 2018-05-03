package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstBonus;
import com.codido.hodor.model.LotInstBonusExample;
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

public interface LotInstBonusMapper {
    @SelectProvider(type=LotInstBonusSqlProvider.class, method="countByExample")
    long countByExample(LotInstBonusExample example);

    @DeleteProvider(type=LotInstBonusSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotInstBonusExample example);

    @Delete({
        "delete from t_lot_inst_bonus",
        "where BONUS_ID = #{bonusId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bonusId);

    @Insert({
        "insert into t_lot_inst_bonus (LOTTO_INST_ID, LOTTO_BONUS_ID, ",
        "BONUS_NAME, BONUS_LEVEL, ",
        "BONUS_COUNT, BONUS_PRE_AMT)",
        "values (#{lottoInstId,jdbcType=BIGINT}, #{lottoBonusId,jdbcType=BIGINT}, ",
        "#{bonusName,jdbcType=VARCHAR}, #{bonusLevel,jdbcType=VARCHAR}, ",
        "#{bonusCount,jdbcType=VARCHAR}, #{bonusPreAmt,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="bonusId")
    int insert(LotInstBonus record);

    @InsertProvider(type=LotInstBonusSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="bonusId")
    int insertSelective(LotInstBonus record);

    @SelectProvider(type=LotInstBonusSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BONUS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_COUNT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_PRE_AMT", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<LotInstBonus> selectByExample(LotInstBonusExample example);

    @Select({
        "select",
        "BONUS_ID, LOTTO_INST_ID, LOTTO_BONUS_ID, BONUS_NAME, BONUS_LEVEL, BONUS_COUNT, ",
        "BONUS_PRE_AMT",
        "from t_lot_inst_bonus",
        "where BONUS_ID = #{bonusId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BONUS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_COUNT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_PRE_AMT", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    LotInstBonus selectByPrimaryKey(Long bonusId);

    @UpdateProvider(type=LotInstBonusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotInstBonus record, @Param("example") LotInstBonusExample example);

    @UpdateProvider(type=LotInstBonusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotInstBonus record, @Param("example") LotInstBonusExample example);

    @UpdateProvider(type=LotInstBonusSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotInstBonus record);

    @Update({
        "update t_lot_inst_bonus",
        "set LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT},",
          "LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT},",
          "BONUS_NAME = #{bonusName,jdbcType=VARCHAR},",
          "BONUS_LEVEL = #{bonusLevel,jdbcType=VARCHAR},",
          "BONUS_COUNT = #{bonusCount,jdbcType=VARCHAR},",
          "BONUS_PRE_AMT = #{bonusPreAmt,jdbcType=VARCHAR}",
        "where BONUS_ID = #{bonusId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotInstBonus record);
}