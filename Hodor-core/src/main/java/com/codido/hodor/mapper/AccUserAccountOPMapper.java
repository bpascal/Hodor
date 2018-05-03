package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAccount;
import com.codido.hodor.model.AccUserAccountExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.List;

public interface AccUserAccountOPMapper {

    @SelectProvider(type=AccUserAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccUserAccount> selectByExample(AccUserAccountExample example);

    @Select({
        "select",
        "USER_ACCOUNT_ID, USER_ID, ACCOUNT_TYPE_ID, AMOUNT, ACCOUNT_STS",
        "from t_acc_user_account",
        "where USER_ID = #{userId,jdbcType=BIGINT} AND ACCOUNT_TYPE_ID=#{userAccountTypeId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccUserAccount selectByUserIdAndAccType(@Param("userId") Long userId,@Param("userAccountTypeId") Long userAccountTypeId);
}