package com.codido.hodor.mapper;

import com.codido.hodor.model.AccPayOrder;
import com.codido.hodor.model.AccPayOrderExample;
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

public interface AccPayOrderMapper {
    @SelectProvider(type=AccPayOrderSqlProvider.class, method="countByExample")
    long countByExample(AccPayOrderExample example);

    @DeleteProvider(type=AccPayOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccPayOrderExample example);

    @Delete({
        "delete from t_acc_pay_order",
        "where PAY_ORDER_ID = #{payOrderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long payOrderId);

    @Insert({
        "insert into t_acc_pay_order (PAY_ORDER_NO, PAY_ORDER_TYPE, ",
        "PAY_AMT, PAY_ORDER_STS, ",
        "PAY_ORDER_CREATE_TIME, PAY_ORDER_PAY_TIME, ",
        "USER_ID, SHOP_ID)",
        "values (#{payOrderNo,jdbcType=VARCHAR}, #{payOrderType,jdbcType=CHAR}, ",
        "#{payAmt,jdbcType=DECIMAL}, #{payOrderSts,jdbcType=CHAR}, ",
        "#{payOrderCreateTime,jdbcType=TIMESTAMP}, #{payOrderPayTime,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=BIGINT}, #{shopId,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="payOrderId")
    int insert(AccPayOrder record);

    @InsertProvider(type=AccPayOrderSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="payOrderId")
    int insertSelective(AccPayOrder record);

    @SelectProvider(type=AccPayOrderSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="PAY_ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_ORDER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_AMT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PAY_ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_ORDER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_ORDER_PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<AccPayOrder> selectByExample(AccPayOrderExample example);

    @Select({
        "select",
        "PAY_ORDER_ID, PAY_ORDER_NO, PAY_ORDER_TYPE, PAY_AMT, PAY_ORDER_STS, PAY_ORDER_CREATE_TIME, ",
        "PAY_ORDER_PAY_TIME, USER_ID, SHOP_ID",
        "from t_acc_pay_order",
        "where PAY_ORDER_ID = #{payOrderId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="PAY_ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_ORDER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_AMT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PAY_ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_ORDER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_ORDER_PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    AccPayOrder selectByPrimaryKey(Long payOrderId);

    @UpdateProvider(type=AccPayOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccPayOrder record, @Param("example") AccPayOrderExample example);

    @UpdateProvider(type=AccPayOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccPayOrder record, @Param("example") AccPayOrderExample example);

    @UpdateProvider(type=AccPayOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccPayOrder record);

    @Update({
        "update t_acc_pay_order",
        "set PAY_ORDER_NO = #{payOrderNo,jdbcType=VARCHAR},",
          "PAY_ORDER_TYPE = #{payOrderType,jdbcType=CHAR},",
          "PAY_AMT = #{payAmt,jdbcType=DECIMAL},",
          "PAY_ORDER_STS = #{payOrderSts,jdbcType=CHAR},",
          "PAY_ORDER_CREATE_TIME = #{payOrderCreateTime,jdbcType=TIMESTAMP},",
          "PAY_ORDER_PAY_TIME = #{payOrderPayTime,jdbcType=TIMESTAMP},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "SHOP_ID = #{shopId,jdbcType=BIGINT}",
        "where PAY_ORDER_ID = #{payOrderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccPayOrder record);
}