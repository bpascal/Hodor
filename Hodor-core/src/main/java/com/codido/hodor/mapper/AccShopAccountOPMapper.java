package com.codido.hodor.mapper;

import com.codido.hodor.model.AccShopAccount;
import com.codido.hodor.model.AccShopAccountExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.List;

public interface AccShopAccountOPMapper {

    @SelectProvider(type=AccShopAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccShopAccount> selectByExample(AccShopAccountExample example);

    @Select({
        "select",
        "SHOP_ACCOUNT_ID, SHOP_ID, ACCOUNT_TYPE_ID, AMOUNT, ACCOUNT_STS",
        "from t_acc_shop_account",
        "where SHOP_ID = #{shopId,jdbcType=BIGINT} AND ACCOUNT_TYPE_ID=#{userAccountTypeId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccShopAccount selectByShopIdAndAccountTypeId(@Param("shopId") Long shopId,@Param("userAccountTypeId")Long userAccountTypeId);
}