package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstBonus;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LotInstBonusOPMapper {

    @Select({
        "select",
        "BONUS_ID, LOTTO_INST_ID, LOTTO_BONUS_ID, BONUS_NAME, BONUS_LEVEL, BONUS_COUNT, ",
        "BONUS_PRE_AMT",
        "from t_lot_inst_bonus",
        "where LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}"
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
    List<LotInstBonus> selectByLottoInstId(Long lottoInstId);
}