package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrShopRela;
import com.codido.hodor.model.UsrShopRelaExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrShopRelaOPMapper {
    @Select({
        "select",
        "USR_SHOP_RELA_ID, USER_ID, SHOP_ID, SHOP_TYPE, USR_SHOP_RELA_STS, USR_SHOP_RELA_SORT",
        "from t_usr_shop_rela",
        "where USER_ID = #{userId,jdbcType=BIGINT} AND USR_SHOP_RELA_STS='A' AND SHOP_TYPE=#{shopType,jdbcType=CHAR}"
    })
    @ConstructorArgs({
        @Arg(column="USR_SHOP_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
    })
    UsrShopRela selectByUserId(@Param("userId") Long userId,@Param("shopType") String shopType);
}