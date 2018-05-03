package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdRefund;
import com.codido.hodor.model.OrdRefundExample;
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

public interface OrdRefundMapper {
    @SelectProvider(type=OrdRefundSqlProvider.class, method="countByExample")
    long countByExample(OrdRefundExample example);

    @DeleteProvider(type=OrdRefundSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdRefundExample example);

    @Delete({
        "delete from t_ord_refund",
        "where REFUND_ID = #{refundId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long refundId);

    @Insert({
        "insert into t_ord_refund (REFUND_NO, PAY_ORDER_NO, ",
        "REFUND_CREATE_TIME, REFUND_TIME, ",
        "REFUND_STS, PAY_REFUND_ID)",
        "values (#{refundNo,jdbcType=VARCHAR}, #{payOrderNo,jdbcType=VARCHAR}, ",
        "#{refundCreateTime,jdbcType=TIMESTAMP}, #{refundTime,jdbcType=TIMESTAMP}, ",
        "#{refundSts,jdbcType=CHAR}, #{payRefundId,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="refundId")
    int insert(OrdRefund record);

    @InsertProvider(type=OrdRefundSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="refundId")
    int insertSelective(OrdRefund record);

    @SelectProvider(type=OrdRefundSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="REFUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="REFUND_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REFUND_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="REFUND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="REFUND_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_REFUND_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OrdRefund> selectByExample(OrdRefundExample example);

    @Select({
        "select",
        "REFUND_ID, REFUND_NO, PAY_ORDER_NO, REFUND_CREATE_TIME, REFUND_TIME, REFUND_STS, ",
        "PAY_REFUND_ID",
        "from t_ord_refund",
        "where REFUND_ID = #{refundId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="REFUND_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="REFUND_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REFUND_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="REFUND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="REFUND_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_REFUND_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    OrdRefund selectByPrimaryKey(Long refundId);

    @UpdateProvider(type=OrdRefundSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdRefund record, @Param("example") OrdRefundExample example);

    @UpdateProvider(type=OrdRefundSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdRefund record, @Param("example") OrdRefundExample example);

    @UpdateProvider(type=OrdRefundSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdRefund record);

    @Update({
        "update t_ord_refund",
        "set REFUND_NO = #{refundNo,jdbcType=VARCHAR},",
          "PAY_ORDER_NO = #{payOrderNo,jdbcType=VARCHAR},",
          "REFUND_CREATE_TIME = #{refundCreateTime,jdbcType=TIMESTAMP},",
          "REFUND_TIME = #{refundTime,jdbcType=TIMESTAMP},",
          "REFUND_STS = #{refundSts,jdbcType=CHAR},",
          "PAY_REFUND_ID = #{payRefundId,jdbcType=VARCHAR}",
        "where REFUND_ID = #{refundId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdRefund record);
}