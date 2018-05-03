package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpLottoRela;
import com.codido.hodor.model.ShpLottoRelaExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ShpLottoRelaOPMapper {
    @Select({
            "select",
            "SHOP_LOTTO_RELA_ID, SHOP_ID, LOTTO_ID, LOTTO_TRAD_STS, LOTTO_SORT, SHOP_LOTTO_ORDER_COUNT, ",
            "SHOP_LOTTO_ORDER_AMT",
            "from t_shp_lotto_rela",
            "where SHOP_ID = #{shopId,jdbcType=BIGINT} and LOTTO_ID = #{lottoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
            @Arg(column = "SHOP_LOTTO_RELA_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "SHOP_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "LOTTO_TRAD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "LOTTO_SORT", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "SHOP_LOTTO_ORDER_COUNT", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "SHOP_LOTTO_ORDER_AMT", javaType = Long.class, jdbcType = JdbcType.BIGINT)
    })
    ShpLottoRela getRelaByUserIdAndLottoId(@Param("shopId") Long shopId, @Param("lottoId") Long lottoId);
}