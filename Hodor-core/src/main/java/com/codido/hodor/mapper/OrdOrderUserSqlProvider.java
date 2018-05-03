package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdOrderUser;
import com.codido.hodor.model.OrdOrderUserExample.Criteria;
import com.codido.hodor.model.OrdOrderUserExample.Criterion;
import com.codido.hodor.model.OrdOrderUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdOrderUserSqlProvider {

    public String countByExample(OrdOrderUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_orderuser");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdOrderUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_orderuser");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdOrderUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_orderuser");
        
        if (record.getOrderNo() != null) {
            sql.VALUES("ORDER_NO", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderUserType() != null) {
            sql.VALUES("ORDER_USER_TYPE", "#{orderUserType,jdbcType=CHAR}");
        }
        
        if (record.getOrderUserSts() != null) {
            sql.VALUES("ORDER_USER_STS", "#{orderUserSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdOrderUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ORDER_USER_INST_ID");
        } else {
            sql.SELECT("ORDER_USER_INST_ID");
        }
        sql.SELECT("ORDER_NO");
        sql.SELECT("USER_ID");
        sql.SELECT("ORDER_USER_TYPE");
        sql.SELECT("ORDER_USER_STS");
        sql.FROM("t_ord_orderuser");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdOrderUser record = (OrdOrderUser) parameter.get("record");
        OrdOrderUserExample example = (OrdOrderUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_orderuser");
        
        if (record.getOrderUserInstId() != null) {
            sql.SET("ORDER_USER_INST_ID = #{record.orderUserInstId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderUserType() != null) {
            sql.SET("ORDER_USER_TYPE = #{record.orderUserType,jdbcType=CHAR}");
        }
        
        if (record.getOrderUserSts() != null) {
            sql.SET("ORDER_USER_STS = #{record.orderUserSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_orderuser");
        
        sql.SET("ORDER_USER_INST_ID = #{record.orderUserInstId,jdbcType=BIGINT}");
        sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("ORDER_USER_TYPE = #{record.orderUserType,jdbcType=CHAR}");
        sql.SET("ORDER_USER_STS = #{record.orderUserSts,jdbcType=CHAR}");
        
        OrdOrderUserExample example = (OrdOrderUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdOrderUser record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_orderuser");
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderUserType() != null) {
            sql.SET("ORDER_USER_TYPE = #{orderUserType,jdbcType=CHAR}");
        }
        
        if (record.getOrderUserSts() != null) {
            sql.SET("ORDER_USER_STS = #{orderUserSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("ORDER_USER_INST_ID = #{orderUserInstId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdOrderUserExample example, boolean includeExamplePhrase) {
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