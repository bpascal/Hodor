package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAcdt;
import com.codido.hodor.model.AccUserAcdtExample;
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

public interface AccUserAcdtMapper {
    @SelectProvider(type=AccUserAcdtSqlProvider.class, method="countByExample")
    long countByExample(AccUserAcdtExample example);

    @DeleteProvider(type=AccUserAcdtSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccUserAcdtExample example);

    @Delete({
        "delete from t_acc_user_acdt",
        "where USER_ACDT_ID = #{userAcdtId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userAcdtId);

    @Insert({
        "insert into t_acc_user_acdt (USER_ACCOUNT_ID, TX_AMOUNT, ",
        "TX_ORDER_NO, TX_NO, ",
        "TX_WAY, TX_TIME, ACDT_STS, ",
        "ACDT_DESC, ACDT_TYPE)",
        "values (#{userAccountId,jdbcType=BIGINT}, #{txAmount,jdbcType=DECIMAL}, ",
        "#{txOrderNo,jdbcType=VARCHAR}, #{txNo,jdbcType=VARCHAR}, ",
        "#{txWay,jdbcType=CHAR}, #{txTime,jdbcType=TIMESTAMP}, #{acdtSts,jdbcType=CHAR}, ",
        "#{acdtDesc,jdbcType=VARCHAR}, #{acdtType,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="userAcdtId")
    int insert(AccUserAcdt record);

    @InsertProvider(type=AccUserAcdtSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="userAcdtId")
    int insertSelective(AccUserAcdt record);

    @SelectProvider(type=AccUserAcdtSqlProvider.class, method="selectByExample")
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
    List<AccUserAcdt> selectByExample(AccUserAcdtExample example);

    @Select({
        "select",
        "USER_ACDT_ID, USER_ACCOUNT_ID, TX_AMOUNT, TX_ORDER_NO, TX_NO, TX_WAY, TX_TIME, ",
        "ACDT_STS, ACDT_DESC, ACDT_TYPE",
        "from t_acc_user_acdt",
        "where USER_ACDT_ID = #{userAcdtId,jdbcType=BIGINT}"
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
    AccUserAcdt selectByPrimaryKey(Long userAcdtId);

    @UpdateProvider(type=AccUserAcdtSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccUserAcdt record, @Param("example") AccUserAcdtExample example);

    @UpdateProvider(type=AccUserAcdtSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccUserAcdt record, @Param("example") AccUserAcdtExample example);

    @UpdateProvider(type=AccUserAcdtSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccUserAcdt record);

    @Update({
        "update t_acc_user_acdt",
        "set USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT},",
          "TX_AMOUNT = #{txAmount,jdbcType=DECIMAL},",
          "TX_ORDER_NO = #{txOrderNo,jdbcType=VARCHAR},",
          "TX_NO = #{txNo,jdbcType=VARCHAR},",
          "TX_WAY = #{txWay,jdbcType=CHAR},",
          "TX_TIME = #{txTime,jdbcType=TIMESTAMP},",
          "ACDT_STS = #{acdtSts,jdbcType=CHAR},",
          "ACDT_DESC = #{acdtDesc,jdbcType=VARCHAR},",
          "ACDT_TYPE = #{acdtType,jdbcType=CHAR}",
        "where USER_ACDT_ID = #{userAcdtId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccUserAcdt record);
}