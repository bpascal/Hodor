package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLottoBonus;
import com.codido.hodor.model.LotLottoBonusExample;
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

public interface LotLottoBonusMapper {
    @SelectProvider(type=LotLottoBonusSqlProvider.class, method="countByExample")
    long countByExample(LotLottoBonusExample example);

    @DeleteProvider(type=LotLottoBonusSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotLottoBonusExample example);

    @Delete({
        "delete from t_lot_lotto_bonus",
        "where LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long lottoBonusId);

    @Insert({
        "insert into t_lot_lotto_bonus (LOTTO_ID, LOTTO_BONUS_NAME, ",
        "LOTTO_BONUS_LEVEL, LOTTO_BONUS_DESC, ",
        "LOTTO_BONUS_MEMO, LOTTO_BONUS_STS)",
        "values (#{lottoId,jdbcType=BIGINT}, #{lottoBonusName,jdbcType=VARCHAR}, ",
        "#{lottoBonusLevel,jdbcType=VARCHAR}, #{lottoBonusDesc,jdbcType=VARCHAR}, ",
        "#{lottoBonusMemo,jdbcType=VARCHAR}, #{lottoBonusSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="lottoBonusId")
    int insert(LotLottoBonus record);

    @InsertProvider(type=LotLottoBonusSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="lottoBonusId")
    int insertSelective(LotLottoBonus record);

    @SelectProvider(type=LotLottoBonusSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_MEMO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<LotLottoBonus> selectByExample(LotLottoBonusExample example);

    @Select({
        "select",
        "LOTTO_BONUS_ID, LOTTO_ID, LOTTO_BONUS_NAME, LOTTO_BONUS_LEVEL, LOTTO_BONUS_DESC, ",
        "LOTTO_BONUS_MEMO, LOTTO_BONUS_STS",
        "from t_lot_lotto_bonus",
        "where LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="LOTTO_BONUS_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_BONUS_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_LEVEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_MEMO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    LotLottoBonus selectByPrimaryKey(Long lottoBonusId);

    @UpdateProvider(type=LotLottoBonusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotLottoBonus record, @Param("example") LotLottoBonusExample example);

    @UpdateProvider(type=LotLottoBonusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotLottoBonus record, @Param("example") LotLottoBonusExample example);

    @UpdateProvider(type=LotLottoBonusSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotLottoBonus record);

    @Update({
        "update t_lot_lotto_bonus",
        "set LOTTO_ID = #{lottoId,jdbcType=BIGINT},",
          "LOTTO_BONUS_NAME = #{lottoBonusName,jdbcType=VARCHAR},",
          "LOTTO_BONUS_LEVEL = #{lottoBonusLevel,jdbcType=VARCHAR},",
          "LOTTO_BONUS_DESC = #{lottoBonusDesc,jdbcType=VARCHAR},",
          "LOTTO_BONUS_MEMO = #{lottoBonusMemo,jdbcType=VARCHAR},",
          "LOTTO_BONUS_STS = #{lottoBonusSts,jdbcType=CHAR}",
        "where LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotLottoBonus record);
}