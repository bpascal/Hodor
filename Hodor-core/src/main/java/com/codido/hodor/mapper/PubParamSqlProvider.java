package com.codido.hodor.mapper;

import com.codido.hodor.model.PubParam;
import com.codido.hodor.model.PubParamExample.Criteria;
import com.codido.hodor.model.PubParamExample.Criterion;
import com.codido.hodor.model.PubParamExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PubParamSqlProvider {

    public String countByExample(PubParamExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_pub_param");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PubParamExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_pub_param");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PubParam record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_pub_param");
        
        if (record.getParamName() != null) {
            sql.VALUES("PARAM_NAME", "#{paramName,jdbcType=VARCHAR}");
        }
        
        if (record.getParamKey() != null) {
            sql.VALUES("PARAM_KEY", "#{paramKey,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.VALUES("PARAM_VALUE", "#{paramValue,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelFlag() != null) {
            sql.VALUES("CHANNEL_FLAG", "#{channelFlag,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PubParamExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("PARAM_ID");
        } else {
            sql.SELECT("PARAM_ID");
        }
        sql.SELECT("PARAM_NAME");
        sql.SELECT("PARAM_KEY");
        sql.SELECT("PARAM_VALUE");
        sql.SELECT("CHANNEL_FLAG");
        sql.FROM("t_pub_param");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PubParam record = (PubParam) parameter.get("record");
        PubParamExample example = (PubParamExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_pub_param");
        
        if (record.getParamId() != null) {
            sql.SET("PARAM_ID = #{record.paramId,jdbcType=INTEGER}");
        }
        
        if (record.getParamName() != null) {
            sql.SET("PARAM_NAME = #{record.paramName,jdbcType=VARCHAR}");
        }
        
        if (record.getParamKey() != null) {
            sql.SET("PARAM_KEY = #{record.paramKey,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.SET("PARAM_VALUE = #{record.paramValue,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelFlag() != null) {
            sql.SET("CHANNEL_FLAG = #{record.channelFlag,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_pub_param");
        
        sql.SET("PARAM_ID = #{record.paramId,jdbcType=INTEGER}");
        sql.SET("PARAM_NAME = #{record.paramName,jdbcType=VARCHAR}");
        sql.SET("PARAM_KEY = #{record.paramKey,jdbcType=VARCHAR}");
        sql.SET("PARAM_VALUE = #{record.paramValue,jdbcType=VARCHAR}");
        sql.SET("CHANNEL_FLAG = #{record.channelFlag,jdbcType=VARCHAR}");
        
        PubParamExample example = (PubParamExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PubParam record) {
        SQL sql = new SQL();
        sql.UPDATE("t_pub_param");
        
        if (record.getParamName() != null) {
            sql.SET("PARAM_NAME = #{paramName,jdbcType=VARCHAR}");
        }
        
        if (record.getParamKey() != null) {
            sql.SET("PARAM_KEY = #{paramKey,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.SET("PARAM_VALUE = #{paramValue,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelFlag() != null) {
            sql.SET("CHANNEL_FLAG = #{channelFlag,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("PARAM_ID = #{paramId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PubParamExample example, boolean includeExamplePhrase) {
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