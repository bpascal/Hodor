package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAcdt;
import com.codido.hodor.model.AccUserAcdtExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccUserAcdtOPMapper {


    @SelectProvider(type=AccUserAcdtSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USER_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccUserAcdt> selectByExample(AccUserAcdtExample example);

    @Select({
        "select",
        "a.USER_ACDT_ID, a.USER_ACCOUNT_ID, a.TX_AMOUNT, TX_ORDER_NO,TX_NO, TX_WAY, TX_TIME, ACDT_STS,",
        "ACDT_DESC,ACDT_TYPE",
        "from t_acc_user_acdt a,t_acc_user_account b",
        "where a.USER_ACCOUNT_ID=b.USER_ACCOUNT_ID AND b.USER_ID = #{userId,jdbcType=BIGINT} AND b.ACCOUNT_TYPE_ID NOT IN (3) ORDER BY a.TX_TIME DESC",
        "LIMIT  #{pageNo,jdbcType=BIGINT},#{prePageCount,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USER_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ACDT_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACDT_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccUserAcdt> selectUserAcctFlowByUserId(@Param("userId")Long userId, @Param("pageNo") Long pageNo, @Param("prePageCount") Long prePageCount);
}