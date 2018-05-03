package com.codido.hodor.mapper;

import com.codido.hodor.model.AccShopAcdt;
import com.codido.hodor.model.AccShopAcdtExample;
import java.math.BigDecimal;
import java.util.Date;
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

public interface AccShopAcdtMapper {
    @SelectProvider(type=AccShopAcdtSqlProvider.class, method="countByExample")
    long countByExample(AccShopAcdtExample example);

    @DeleteProvider(type=AccShopAcdtSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccShopAcdtExample example);

    @Delete({
        "delete from t_acc_shop_acdt",
        "where SHOP_ACDT_ID = #{shopAcdtId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shopAcdtId);

    @Insert({
        "insert into t_acc_shop_acdt (SHOP_ACCOUNT_ID, TX_AMOUNT, ",
        "TX_ORDER_NO, TX_NO, ",
        "TX_WAY, TX_TIME, ACDT_STS, ",
        "ACDT_DESC, ACDT_TYPE)",
        "values (#{shopAccountId,jdbcType=BIGINT}, #{txAmount,jdbcType=DECIMAL}, ",
        "#{txOrderNo,jdbcType=VARCHAR}, #{txNo,jdbcType=VARCHAR}, ",
        "#{txWay,jdbcType=CHAR}, #{txTime,jdbcType=TIMESTAMP}, #{acdtSts,jdbcType=CHAR}, ",
        "#{acdtDesc,jdbcType=VARCHAR}, #{acdtType,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="shopAcdtId")
    int insert(AccShopAcdt record);

    @InsertProvider(type=AccShopAcdtSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="shopAcdtId")
    int insertSelective(AccShopAcdt record);

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
        "SHOP_ACDT_ID, SHOP_ACCOUNT_ID, TX_AMOUNT, TX_ORDER_NO, TX_NO, TX_WAY, TX_TIME, ",
        "ACDT_STS, ACDT_DESC, ACDT_TYPE",
        "from t_acc_shop_acdt",
        "where SHOP_ACDT_ID = #{shopAcdtId,jdbcType=BIGINT}"
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
    AccShopAcdt selectByPrimaryKey(Long shopAcdtId);

    @UpdateProvider(type=AccShopAcdtSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccShopAcdt record, @Param("example") AccShopAcdtExample example);

    @UpdateProvider(type=AccShopAcdtSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccShopAcdt record, @Param("example") AccShopAcdtExample example);

    @UpdateProvider(type=AccShopAcdtSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccShopAcdt record);

    @Update({
        "update t_acc_shop_acdt",
        "set SHOP_ACCOUNT_ID = #{shopAccountId,jdbcType=BIGINT},",
          "TX_AMOUNT = #{txAmount,jdbcType=DECIMAL},",
          "TX_ORDER_NO = #{txOrderNo,jdbcType=VARCHAR},",
          "TX_NO = #{txNo,jdbcType=VARCHAR},",
          "TX_WAY = #{txWay,jdbcType=CHAR},",
          "TX_TIME = #{txTime,jdbcType=TIMESTAMP},",
          "ACDT_STS = #{acdtSts,jdbcType=CHAR},",
          "ACDT_DESC = #{acdtDesc,jdbcType=VARCHAR},",
          "ACDT_TYPE = #{acdtType,jdbcType=CHAR}",
        "where SHOP_ACDT_ID = #{shopAcdtId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccShopAcdt record);
}