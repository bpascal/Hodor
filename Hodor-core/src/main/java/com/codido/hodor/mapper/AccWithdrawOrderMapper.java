package com.codido.hodor.mapper;

import com.codido.hodor.model.AccWithdrawOrder;
import com.codido.hodor.model.AccWithdrawOrderExample;
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

public interface AccWithdrawOrderMapper {
    @SelectProvider(type=AccWithdrawOrderSqlProvider.class, method="countByExample")
    long countByExample(AccWithdrawOrderExample example);

    @DeleteProvider(type=AccWithdrawOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccWithdrawOrderExample example);

    @Delete({
        "delete from t_acc_withdraw_order",
        "where WITHDRAW_ORDER_ID = #{withdrawOrderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long withdrawOrderId);

    @Insert({
        "insert into t_acc_withdraw_order (WITHDRAW_ORDER_NO, USER_ID, ",
        "SHOP_ID, WITHDRAW_TYPE, ",
        "WITHDRAW_ORDER_STS, WITHDRAW_AMT, ",
        "USER_BANK_CARD_NO, USER_BANK_CARD_ID, ",
        "APPLY_TIME, PAY_TIME)",
        "values (#{withdrawOrderNo,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{shopId,jdbcType=BIGINT}, #{withdrawType,jdbcType=CHAR}, ",
        "#{withdrawOrderSts,jdbcType=CHAR}, #{withdrawAmt,jdbcType=DECIMAL}, ",
        "#{userBankCardNo,jdbcType=VARCHAR}, #{userBankCardId,jdbcType=BIGINT}, ",
        "#{applyTime,jdbcType=TIMESTAMP}, #{payTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="withdrawOrderId")
    int insert(AccWithdrawOrder record);

    @InsertProvider(type=AccWithdrawOrderSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="withdrawOrderId")
    int insertSelective(AccWithdrawOrder record);

    @SelectProvider(type=AccWithdrawOrderSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="WITHDRAW_ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="WITHDRAW_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="WITHDRAW_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WITHDRAW_ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WITHDRAW_AMT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="USER_BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_BANK_CARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="APPLY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<AccWithdrawOrder> selectByExample(AccWithdrawOrderExample example);

    @Select({
        "select",
        "WITHDRAW_ORDER_ID, WITHDRAW_ORDER_NO, USER_ID, SHOP_ID, WITHDRAW_TYPE, WITHDRAW_ORDER_STS, ",
        "WITHDRAW_AMT, USER_BANK_CARD_NO, USER_BANK_CARD_ID, APPLY_TIME, PAY_TIME",
        "from t_acc_withdraw_order",
        "where WITHDRAW_ORDER_ID = #{withdrawOrderId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="WITHDRAW_ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="WITHDRAW_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="WITHDRAW_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WITHDRAW_ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WITHDRAW_AMT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="USER_BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_BANK_CARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="APPLY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    AccWithdrawOrder selectByPrimaryKey(Long withdrawOrderId);

    @UpdateProvider(type=AccWithdrawOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccWithdrawOrder record, @Param("example") AccWithdrawOrderExample example);

    @UpdateProvider(type=AccWithdrawOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccWithdrawOrder record, @Param("example") AccWithdrawOrderExample example);

    @UpdateProvider(type=AccWithdrawOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccWithdrawOrder record);

    @Update({
        "update t_acc_withdraw_order",
        "set WITHDRAW_ORDER_NO = #{withdrawOrderNo,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "WITHDRAW_TYPE = #{withdrawType,jdbcType=CHAR},",
          "WITHDRAW_ORDER_STS = #{withdrawOrderSts,jdbcType=CHAR},",
          "WITHDRAW_AMT = #{withdrawAmt,jdbcType=DECIMAL},",
          "USER_BANK_CARD_NO = #{userBankCardNo,jdbcType=VARCHAR},",
          "USER_BANK_CARD_ID = #{userBankCardId,jdbcType=BIGINT},",
          "APPLY_TIME = #{applyTime,jdbcType=TIMESTAMP},",
          "PAY_TIME = #{payTime,jdbcType=TIMESTAMP}",
        "where WITHDRAW_ORDER_ID = #{withdrawOrderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccWithdrawOrder record);
}