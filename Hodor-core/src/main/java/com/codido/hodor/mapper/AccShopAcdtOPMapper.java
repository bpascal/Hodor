package com.codido.hodor.mapper;

import com.codido.hodor.model.AccShopAcdt;
import com.codido.hodor.model.AccShopAcdtExample;
import com.codido.hodor.model.AccShopStatistics;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccShopAcdtOPMapper {


    @SelectProvider(type=AccShopAcdtSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ACDT_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACDT_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccShopAcdt> selectByExample(AccShopAcdtExample example);

    @Select({
        "select",
        "a.SHOP_ACDT_ID, a.SHOP_ACCOUNT_ID, a.TX_AMOUNT, a.TX_ORDER_NO,a.TX_NO, a.TX_WAY, a.TX_TIME, a.ACDT_STS, ",
        "a.ACDT_DESC, a.ACDT_TYPE",
        "from t_acc_shop_acdt a,t_acc_shop_account b",
        "where a.SHOP_ACCOUNT_ID=b.SHOP_ACCOUNT_ID AND b.SHOP_ID = #{shopId,jdbcType=BIGINT} AND b.ACCOUNT_TYPE_ID NOT IN (3) ORDER BY a.TX_TIME DESC",
        "LIMIT  #{pageNo,jdbcType=BIGINT},#{prePageCount,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ACDT_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACDT_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccShopAcdt> selectShopAcctFlowByShopId(@Param("shopId")Long shopId, @Param("pageNo") Long pageNo, @Param("prePageCount") Long prePageCount);


    @Select({
            "SELECT",
            "COUNT(ORDER_ID) AS 'ORDER_COUNT',SUM(ORDER_PRICE) AS 'ORDER_PRICE_SUM',COUNT(BONUS_AMT) AS 'AMT_COUNT',SUM(BONUS_AMT) AS 'AMT_SUM' ",
            "FROM t_ord_order ",
            "WHERE DEAL_SHOP_ID = #{shopId,jdbcType=BIGINT} AND ORDER_STS IN ('A','B','S') AND ORDER_CREATE_TIME >= #{creatDate,jdbcType=VARCHAR};"
            //"WHERE DEAL_SHOP_ID = #{shopId,jdbcType=BIGINT} AND ORDER_STS IN ('P','A','B','S') AND ORDER_CREATE_TIME >= #{creatDate,jdbcType=VARCHAR};"
    })
    @ConstructorArgs({
            @Arg(column="ORDER_COUNT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="ORDER_PRICE_SUM", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="AMT_COUNT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="AMT_SUM", javaType=Long.class, jdbcType=JdbcType.BIGINT),
    })
    AccShopStatistics selectOrderSumInfoByDate(@Param("shopId")Long shopId, @Param("creatDate") String creatDate);


}