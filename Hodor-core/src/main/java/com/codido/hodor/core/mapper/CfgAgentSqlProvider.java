package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.CfgAgent;
import com.codido.hodor.core.model.CfgAgentExample.Criteria;
import com.codido.hodor.core.model.CfgAgentExample.Criterion;
import com.codido.hodor.core.model.CfgAgentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CfgAgentSqlProvider {

    public String countByExample(CfgAgentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_cfg_agent");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CfgAgentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_cfg_agent");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CfgAgent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_cfg_agent");
        
        if (record.getAgentName() != null) {
            sql.VALUES("AGENT_NAME", "#{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentTicketType() != null) {
            sql.VALUES("AGENT_TICKET_TYPE", "#{agentTicketType,jdbcType=CHAR}");
        }
        
        if (record.getAgentSts() != null) {
            sql.VALUES("AGENT_STS", "#{agentSts,jdbcType=CHAR}");
        }
        
        if (record.getAgentCreateTime() != null) {
            sql.VALUES("AGENT_CREATE_TIME", "#{agentCreateTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.VALUES("PAY_TYPE", "#{payType,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalChargeAmount() != null) {
            sql.VALUES("TOTAL_CHARGE_AMOUNT", "#{totalChargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalPayAmount() != null) {
            sql.VALUES("TOTAL_PAY_AMOUNT", "#{totalPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCurrentBalance() != null) {
            sql.VALUES("CURRENT_BALANCE", "#{currentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getAgentIpAddress() != null) {
            sql.VALUES("AGENT_IP_ADDRESS", "#{agentIpAddress,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CfgAgentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("AGENT_ID");
        } else {
            sql.SELECT("AGENT_ID");
        }
        sql.SELECT("AGENT_NAME");
        sql.SELECT("AGENT_TICKET_TYPE");
        sql.SELECT("AGENT_STS");
        sql.SELECT("AGENT_CREATE_TIME");
        sql.SELECT("PAY_TYPE");
        sql.SELECT("TOTAL_CHARGE_AMOUNT");
        sql.SELECT("TOTAL_PAY_AMOUNT");
        sql.SELECT("CURRENT_BALANCE");
        sql.SELECT("AGENT_IP_ADDRESS");
        sql.FROM("t_cfg_agent");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CfgAgent record = (CfgAgent) parameter.get("record");
        CfgAgentExample example = (CfgAgentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_agent");
        
        if (record.getAgentId() != null) {
            sql.SET("AGENT_ID = #{record.agentId,jdbcType=BIGINT}");
        }
        
        if (record.getAgentName() != null) {
            sql.SET("AGENT_NAME = #{record.agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentTicketType() != null) {
            sql.SET("AGENT_TICKET_TYPE = #{record.agentTicketType,jdbcType=CHAR}");
        }
        
        if (record.getAgentSts() != null) {
            sql.SET("AGENT_STS = #{record.agentSts,jdbcType=CHAR}");
        }
        
        if (record.getAgentCreateTime() != null) {
            sql.SET("AGENT_CREATE_TIME = #{record.agentCreateTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("PAY_TYPE = #{record.payType,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalChargeAmount() != null) {
            sql.SET("TOTAL_CHARGE_AMOUNT = #{record.totalChargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalPayAmount() != null) {
            sql.SET("TOTAL_PAY_AMOUNT = #{record.totalPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCurrentBalance() != null) {
            sql.SET("CURRENT_BALANCE = #{record.currentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getAgentIpAddress() != null) {
            sql.SET("AGENT_IP_ADDRESS = #{record.agentIpAddress,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_agent");
        
        sql.SET("AGENT_ID = #{record.agentId,jdbcType=BIGINT}");
        sql.SET("AGENT_NAME = #{record.agentName,jdbcType=VARCHAR}");
        sql.SET("AGENT_TICKET_TYPE = #{record.agentTicketType,jdbcType=CHAR}");
        sql.SET("AGENT_STS = #{record.agentSts,jdbcType=CHAR}");
        sql.SET("AGENT_CREATE_TIME = #{record.agentCreateTime,jdbcType=VARCHAR}");
        sql.SET("PAY_TYPE = #{record.payType,jdbcType=VARCHAR}");
        sql.SET("TOTAL_CHARGE_AMOUNT = #{record.totalChargeAmount,jdbcType=DECIMAL}");
        sql.SET("TOTAL_PAY_AMOUNT = #{record.totalPayAmount,jdbcType=DECIMAL}");
        sql.SET("CURRENT_BALANCE = #{record.currentBalance,jdbcType=DECIMAL}");
        sql.SET("AGENT_IP_ADDRESS = #{record.agentIpAddress,jdbcType=VARCHAR}");
        
        CfgAgentExample example = (CfgAgentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CfgAgent record) {
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_agent");
        
        if (record.getAgentName() != null) {
            sql.SET("AGENT_NAME = #{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentTicketType() != null) {
            sql.SET("AGENT_TICKET_TYPE = #{agentTicketType,jdbcType=CHAR}");
        }
        
        if (record.getAgentSts() != null) {
            sql.SET("AGENT_STS = #{agentSts,jdbcType=CHAR}");
        }
        
        if (record.getAgentCreateTime() != null) {
            sql.SET("AGENT_CREATE_TIME = #{agentCreateTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("PAY_TYPE = #{payType,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalChargeAmount() != null) {
            sql.SET("TOTAL_CHARGE_AMOUNT = #{totalChargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalPayAmount() != null) {
            sql.SET("TOTAL_PAY_AMOUNT = #{totalPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCurrentBalance() != null) {
            sql.SET("CURRENT_BALANCE = #{currentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getAgentIpAddress() != null) {
            sql.SET("AGENT_IP_ADDRESS = #{agentIpAddress,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("AGENT_ID = #{agentId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CfgAgentExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}