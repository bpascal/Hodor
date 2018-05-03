package com.codido.hodor.mapper;

import com.codido.hodor.model.AccPlatAcdt;
import com.codido.hodor.model.AccPlatAcdtExample;
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

public interface AccPlatAcdtMapper {
    @SelectProvider(type=AccPlatAcdtSqlProvider.class, method="countByExample")
    long countByExample(AccPlatAcdtExample example);

    @DeleteProvider(type=AccPlatAcdtSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccPlatAcdtExample example);

    @Delete({
        "delete from t_acc_plat_acdt",
        "where PLAT_ACDT_ID = #{platAcdtId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long platAcdtId);

    @Insert({
        "insert into t_acc_plat_acdt (PLAT_ACCOUNT_ID, TX_AMOUNT, ",
        "TX_ORDER_NO, TX_NO, ",
        "TX_WAY, TX_TIME, ACDT_STS, ",
        "ACDT_DESC, ACDT_TYPE)",
        "values (#{platAccountId,jdbcType=BIGINT}, #{txAmount,jdbcType=DECIMAL}, ",
        "#{txOrderNo,jdbcType=VARCHAR}, #{txNo,jdbcType=VARCHAR}, ",
        "#{txWay,jdbcType=CHAR}, #{txTime,jdbcType=TIMESTAMP}, #{acdtSts,jdbcType=CHAR}, ",
        "#{acdtDesc,jdbcType=VARCHAR}, #{acdtType,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="platAcdtId")
    int insert(AccPlatAcdt record);

    @InsertProvider(type=AccPlatAcdtSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="platAcdtId")
    int insertSelective(AccPlatAcdt record);

    @SelectProvider(type=AccPlatAcdtSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="PLAT_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PLAT_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ACDT_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACDT_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccPlatAcdt> selectByExample(AccPlatAcdtExample example);

    @Select({
        "select",
        "PLAT_ACDT_ID, PLAT_ACCOUNT_ID, TX_AMOUNT, TX_ORDER_NO, TX_NO, TX_WAY, TX_TIME, ",
        "ACDT_STS, ACDT_DESC, ACDT_TYPE",
        "from t_acc_plat_acdt",
        "where PLAT_ACDT_ID = #{platAcdtId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="PLAT_ACDT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PLAT_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TX_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TX_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TX_WAY", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TX_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ACDT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ACDT_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACDT_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccPlatAcdt selectByPrimaryKey(Long platAcdtId);

    @UpdateProvider(type=AccPlatAcdtSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccPlatAcdt record, @Param("example") AccPlatAcdtExample example);

    @UpdateProvider(type=AccPlatAcdtSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccPlatAcdt record, @Param("example") AccPlatAcdtExample example);

    @UpdateProvider(type=AccPlatAcdtSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccPlatAcdt record);

    @Update({
        "update t_acc_plat_acdt",
        "set PLAT_ACCOUNT_ID = #{platAccountId,jdbcType=BIGINT},",
          "TX_AMOUNT = #{txAmount,jdbcType=DECIMAL},",
          "TX_ORDER_NO = #{txOrderNo,jdbcType=VARCHAR},",
          "TX_NO = #{txNo,jdbcType=VARCHAR},",
          "TX_WAY = #{txWay,jdbcType=CHAR},",
          "TX_TIME = #{txTime,jdbcType=TIMESTAMP},",
          "ACDT_STS = #{acdtSts,jdbcType=CHAR},",
          "ACDT_DESC = #{acdtDesc,jdbcType=VARCHAR},",
          "ACDT_TYPE = #{acdtType,jdbcType=CHAR}",
        "where PLAT_ACDT_ID = #{platAcdtId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccPlatAcdt record);
}