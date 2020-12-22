package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.CfgAgent;
import com.codido.hodor.core.model.CfgAgentExample;
import java.math.BigDecimal;
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

public interface CfgAgentMapper {
    @SelectProvider(type=CfgAgentSqlProvider.class, method="countByExample")
    long countByExample(CfgAgentExample example);

    @DeleteProvider(type=CfgAgentSqlProvider.class, method="deleteByExample")
    int deleteByExample(CfgAgentExample example);

    @Delete({
        "delete from t_cfg_agent",
        "where AGENT_ID = #{agentId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long agentId);

    @Insert({
        "insert into t_cfg_agent (AGENT_NAME, AGENT_TICKET_TYPE, ",
        "AGENT_STS, AGENT_CREATE_TIME, ",
        "PAY_TYPE, TOTAL_CHARGE_AMOUNT, ",
        "TOTAL_PAY_AMOUNT, CURRENT_BALANCE, ",
        "AGENT_IP_ADDRESS)",
        "values (#{agentName,jdbcType=VARCHAR}, #{agentTicketType,jdbcType=CHAR}, ",
        "#{agentSts,jdbcType=CHAR}, #{agentCreateTime,jdbcType=VARCHAR}, ",
        "#{payType,jdbcType=VARCHAR}, #{totalChargeAmount,jdbcType=DECIMAL}, ",
        "#{totalPayAmount,jdbcType=DECIMAL}, #{currentBalance,jdbcType=DECIMAL}, ",
        "#{agentIpAddress,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="agentId")
    int insert(CfgAgent record);

    @InsertProvider(type=CfgAgentSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="agentId")
    int insertSelective(CfgAgent record);

    @SelectProvider(type=CfgAgentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="AGENT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="AGENT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AGENT_TICKET_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AGENT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AGENT_CREATE_TIME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TOTAL_CHARGE_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TOTAL_PAY_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CURRENT_BALANCE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AGENT_IP_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<CfgAgent> selectByExample(CfgAgentExample example);

    @Select({
        "select",
        "AGENT_ID, AGENT_NAME, AGENT_TICKET_TYPE, AGENT_STS, AGENT_CREATE_TIME, PAY_TYPE, ",
        "TOTAL_CHARGE_AMOUNT, TOTAL_PAY_AMOUNT, CURRENT_BALANCE, AGENT_IP_ADDRESS",
        "from t_cfg_agent",
        "where AGENT_ID = #{agentId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="AGENT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="AGENT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AGENT_TICKET_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AGENT_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AGENT_CREATE_TIME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TOTAL_CHARGE_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TOTAL_PAY_AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CURRENT_BALANCE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AGENT_IP_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    CfgAgent selectByPrimaryKey(Long agentId);

    @UpdateProvider(type=CfgAgentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CfgAgent record, @Param("example") CfgAgentExample example);

    @UpdateProvider(type=CfgAgentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CfgAgent record, @Param("example") CfgAgentExample example);

    @UpdateProvider(type=CfgAgentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CfgAgent record);

    @Update({
        "update t_cfg_agent",
        "set AGENT_NAME = #{agentName,jdbcType=VARCHAR},",
          "AGENT_TICKET_TYPE = #{agentTicketType,jdbcType=CHAR},",
          "AGENT_STS = #{agentSts,jdbcType=CHAR},",
          "AGENT_CREATE_TIME = #{agentCreateTime,jdbcType=VARCHAR},",
          "PAY_TYPE = #{payType,jdbcType=VARCHAR},",
          "TOTAL_CHARGE_AMOUNT = #{totalChargeAmount,jdbcType=DECIMAL},",
          "TOTAL_PAY_AMOUNT = #{totalPayAmount,jdbcType=DECIMAL},",
          "CURRENT_BALANCE = #{currentBalance,jdbcType=DECIMAL},",
          "AGENT_IP_ADDRESS = #{agentIpAddress,jdbcType=VARCHAR}",
        "where AGENT_ID = #{agentId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CfgAgent record);
}