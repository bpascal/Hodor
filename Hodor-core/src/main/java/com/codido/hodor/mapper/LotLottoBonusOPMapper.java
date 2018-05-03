package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLottoBonus;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface LotLottoBonusOPMapper {

    @Select({
        "select",
        "LOTTO_BONUS_ID, LOTTO_ID, LOTTO_BONUS_NAME, LOTTO_BONUS_LEVEL, LOTTO_BONUS_DESC, ",
        "LOTTO_BONUS_MEMO, LOTTO_BONUS_STS,TM_SMP",
        "from t_lot_lotto_bonus",
        "where LOTTO_ID = #{lottoId,jdbcType=BIGINT} and LOTTO_BONUS_LEVEL = #{lottoBonusLevel,jdbcType=VARCHAR}"
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
    LotLottoBonus selectByLottoId(@Param("lottoId") Long lottoId, @Param("lottoBonusLevel") String lottoBonusLevel);

}