package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.CfgChannel;
import com.codido.hodor.core.model.CfgChannelExample.Criteria;
import com.codido.hodor.core.model.CfgChannelExample.Criterion;
import com.codido.hodor.core.model.CfgChannelExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CfgChannelSqlProvider {

    public String countByExample(CfgChannelExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_cfg_channel");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CfgChannelExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_cfg_channel");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CfgChannel record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_cfg_channel");
        
        if (record.getChannelName() != null) {
            sql.VALUES("CHANNEL_NAME", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelSts() != null) {
            sql.VALUES("CHANNEL_STS", "#{channelSts,jdbcType=CHAR}");
        }
        
        if (record.getChannelType() != null) {
            sql.VALUES("CHANNEL_TYPE", "#{channelType,jdbcType=CHAR}");
        }
        
        if (record.getChannelCreateTime() != null) {
            sql.VALUES("CHANNEL_CREATE_TIME", "#{channelCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChannelRechargeAmount() != null) {
            sql.VALUES("CHANNEL_RECHARGE_AMOUNT", "#{channelRechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelPayAmount() != null) {
            sql.VALUES("CHANNEL_PAY_AMOUNT", "#{channelPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelCurrentBalance() != null) {
            sql.VALUES("CHANNEL_CURRENT_BALANCE", "#{channelCurrentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelInterfaceStyle() != null) {
            sql.VALUES("CHANNEL_INTERFACE_STYLE", "#{channelInterfaceStyle,jdbcType=CHAR}");
        }
        
        if (record.getOrderActionUrl() != null) {
            sql.VALUES("ORDER_ACTION_URL", "#{orderActionUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderQueryUrl() != null) {
            sql.VALUES("ORDER_QUERY_URL", "#{orderQueryUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CfgChannelExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CHANNEL_ID");
        } else {
            sql.SELECT("CHANNEL_ID");
        }
        sql.SELECT("CHANNEL_NAME");
        sql.SELECT("CHANNEL_STS");
        sql.SELECT("CHANNEL_TYPE");
        sql.SELECT("CHANNEL_CREATE_TIME");
        sql.SELECT("CHANNEL_RECHARGE_AMOUNT");
        sql.SELECT("CHANNEL_PAY_AMOUNT");
        sql.SELECT("CHANNEL_CURRENT_BALANCE");
        sql.SELECT("CHANNEL_INTERFACE_STYLE");
        sql.SELECT("ORDER_ACTION_URL");
        sql.SELECT("ORDER_QUERY_URL");
        sql.FROM("t_cfg_channel");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CfgChannel record = (CfgChannel) parameter.get("record");
        CfgChannelExample example = (CfgChannelExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_channel");
        
        if (record.getChannelId() != null) {
            sql.SET("CHANNEL_ID = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("CHANNEL_NAME = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelSts() != null) {
            sql.SET("CHANNEL_STS = #{record.channelSts,jdbcType=CHAR}");
        }
        
        if (record.getChannelType() != null) {
            sql.SET("CHANNEL_TYPE = #{record.channelType,jdbcType=CHAR}");
        }
        
        if (record.getChannelCreateTime() != null) {
            sql.SET("CHANNEL_CREATE_TIME = #{record.channelCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChannelRechargeAmount() != null) {
            sql.SET("CHANNEL_RECHARGE_AMOUNT = #{record.channelRechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelPayAmount() != null) {
            sql.SET("CHANNEL_PAY_AMOUNT = #{record.channelPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelCurrentBalance() != null) {
            sql.SET("CHANNEL_CURRENT_BALANCE = #{record.channelCurrentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelInterfaceStyle() != null) {
            sql.SET("CHANNEL_INTERFACE_STYLE = #{record.channelInterfaceStyle,jdbcType=CHAR}");
        }
        
        if (record.getOrderActionUrl() != null) {
            sql.SET("ORDER_ACTION_URL = #{record.orderActionUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderQueryUrl() != null) {
            sql.SET("ORDER_QUERY_URL = #{record.orderQueryUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_channel");
        
        sql.SET("CHANNEL_ID = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("CHANNEL_NAME = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("CHANNEL_STS = #{record.channelSts,jdbcType=CHAR}");
        sql.SET("CHANNEL_TYPE = #{record.channelType,jdbcType=CHAR}");
        sql.SET("CHANNEL_CREATE_TIME = #{record.channelCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("CHANNEL_RECHARGE_AMOUNT = #{record.channelRechargeAmount,jdbcType=DECIMAL}");
        sql.SET("CHANNEL_PAY_AMOUNT = #{record.channelPayAmount,jdbcType=DECIMAL}");
        sql.SET("CHANNEL_CURRENT_BALANCE = #{record.channelCurrentBalance,jdbcType=DECIMAL}");
        sql.SET("CHANNEL_INTERFACE_STYLE = #{record.channelInterfaceStyle,jdbcType=CHAR}");
        sql.SET("ORDER_ACTION_URL = #{record.orderActionUrl,jdbcType=VARCHAR}");
        sql.SET("ORDER_QUERY_URL = #{record.orderQueryUrl,jdbcType=VARCHAR}");
        
        CfgChannelExample example = (CfgChannelExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CfgChannel record) {
        SQL sql = new SQL();
        sql.UPDATE("t_cfg_channel");
        
        if (record.getChannelName() != null) {
            sql.SET("CHANNEL_NAME = #{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelSts() != null) {
            sql.SET("CHANNEL_STS = #{channelSts,jdbcType=CHAR}");
        }
        
        if (record.getChannelType() != null) {
            sql.SET("CHANNEL_TYPE = #{channelType,jdbcType=CHAR}");
        }
        
        if (record.getChannelCreateTime() != null) {
            sql.SET("CHANNEL_CREATE_TIME = #{channelCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChannelRechargeAmount() != null) {
            sql.SET("CHANNEL_RECHARGE_AMOUNT = #{channelRechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelPayAmount() != null) {
            sql.SET("CHANNEL_PAY_AMOUNT = #{channelPayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelCurrentBalance() != null) {
            sql.SET("CHANNEL_CURRENT_BALANCE = #{channelCurrentBalance,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelInterfaceStyle() != null) {
            sql.SET("CHANNEL_INTERFACE_STYLE = #{channelInterfaceStyle,jdbcType=CHAR}");
        }
        
        if (record.getOrderActionUrl() != null) {
            sql.SET("ORDER_ACTION_URL = #{orderActionUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderQueryUrl() != null) {
            sql.SET("ORDER_QUERY_URL = #{orderQueryUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("CHANNEL_ID = #{channelId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CfgChannelExample example, boolean includeExamplePhrase) {
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