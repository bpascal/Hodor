package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.CfgChannel;
import com.codido.hodor.core.model.CfgChannelExample;
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

public interface CfgChannelMapper {
    @SelectProvider(type=CfgChannelSqlProvider.class, method="countByExample")
    long countByExample(CfgChannelExample example);

    @DeleteProvider(type=CfgChannelSqlProvider.class, method="deleteByExample")
    int deleteByExample(CfgChannelExample example);

    @Delete({
        "delete from t_cfg_channel",
        "where CHANNEL_ID = #{channelId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long channelId);

    @Insert({
        "insert into t_cfg_channel (CHANNEL_NAME, CHANNEL_STS, ",
        "CHANNEL_TYPE, CHANNEL_CREATE_TIME, ",
        "CHANNEL_RECHARGE_AMOUNT, CHANNEL_PAY_AMOUNT, ",
        "CHANNEL_CURRENT_BALANCE, CHANNEL_INTERFACE_STYLE, ",
        "ORDER_ACTION_URL, ORDER_QUERY_URL)",
        "values (#{channelName,jdbcType=VARCHAR}, #{channelSts,jdbcType=CHAR}, ",
        "#{channelType,jdbcType=CHAR}, #{channelCreateTime,jdbcType=TIMESTAMP}, ",
        "#{channelRechargeAmount,jdbcType=DECIMAL}, #{channelPayAmount,jdbcType=DECIMAL}, ",
        "#{channelCurrentBalance,jdbcType=DECIMAL}, #{channelInterfaceStyle,jdbcType=CHAR}, ",
        "#{orderActionUrl,jdbcType=VARCHAR}, #{orderQueryUrl,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="channelId")
    int insert(CfgChannel record);

    @InsertProvider(type=CfgChannelSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="channelId")
    int insertSelective(CfgChannel record);

    @SelectProvider(type=CfgChannelSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="CHANNEL_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHANNEL_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHANNEL_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHANNEL_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHANNEL_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CHANNEL_RECHARGE_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_PAY_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_CURRENT_BALANCE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_INTERFACE_STYLE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_ACTION_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_QUERY_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<CfgChannel> selectByExample(CfgChannelExample example);

    @Select({
        "select",
        "CHANNEL_ID, CHANNEL_NAME, CHANNEL_STS, CHANNEL_TYPE, CHANNEL_CREATE_TIME, CHANNEL_RECHARGE_AMOUNT, ",
        "CHANNEL_PAY_AMOUNT, CHANNEL_CURRENT_BALANCE, CHANNEL_INTERFACE_STYLE, ORDER_ACTION_URL, ",
        "ORDER_QUERY_URL",
        "from t_cfg_channel",
        "where CHANNEL_ID = #{channelId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="CHANNEL_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="CHANNEL_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CHANNEL_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHANNEL_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHANNEL_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CHANNEL_RECHARGE_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_PAY_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_CURRENT_BALANCE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CHANNEL_INTERFACE_STYLE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_ACTION_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_QUERY_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    CfgChannel selectByPrimaryKey(Long channelId);

    @UpdateProvider(type=CfgChannelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CfgChannel record, @Param("example") CfgChannelExample example);

    @UpdateProvider(type=CfgChannelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CfgChannel record, @Param("example") CfgChannelExample example);

    @UpdateProvider(type=CfgChannelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CfgChannel record);

    @Update({
        "update t_cfg_channel",
        "set CHANNEL_NAME = #{channelName,jdbcType=VARCHAR},",
          "CHANNEL_STS = #{channelSts,jdbcType=CHAR},",
          "CHANNEL_TYPE = #{channelType,jdbcType=CHAR},",
          "CHANNEL_CREATE_TIME = #{channelCreateTime,jdbcType=TIMESTAMP},",
          "CHANNEL_RECHARGE_AMOUNT = #{channelRechargeAmount,jdbcType=DECIMAL},",
          "CHANNEL_PAY_AMOUNT = #{channelPayAmount,jdbcType=DECIMAL},",
          "CHANNEL_CURRENT_BALANCE = #{channelCurrentBalance,jdbcType=DECIMAL},",
          "CHANNEL_INTERFACE_STYLE = #{channelInterfaceStyle,jdbcType=CHAR},",
          "ORDER_ACTION_URL = #{orderActionUrl,jdbcType=VARCHAR},",
          "ORDER_QUERY_URL = #{orderQueryUrl,jdbcType=VARCHAR}",
        "where CHANNEL_ID = #{channelId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CfgChannel record);
}