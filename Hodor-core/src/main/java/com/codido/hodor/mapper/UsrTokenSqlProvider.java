package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrToken;
import com.codido.hodor.model.UsrTokenExample.Criteria;
import com.codido.hodor.model.UsrTokenExample.Criterion;
import com.codido.hodor.model.UsrTokenExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrTokenSqlProvider {

    public String countByExample(UsrTokenExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_token");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrTokenExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_token");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrToken record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_token");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTokenSts() != null) {
            sql.VALUES("TOKEN_STS", "#{tokenSts,jdbcType=CHAR}");
        }
        
        if (record.getTokenCreateTime() != null) {
            sql.VALUES("TOKEN_CREATE_TIME", "#{tokenCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTokenEndTime() != null) {
            sql.VALUES("TOKEN_END_TIME", "#{tokenEndTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrTokenExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TOKEN_ID");
        } else {
            sql.SELECT("TOKEN_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("TOKEN_STS");
        sql.SELECT("TOKEN_CREATE_TIME");
        sql.SELECT("TOKEN_END_TIME");
        sql.FROM("t_usr_token");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrToken record = (UsrToken) parameter.get("record");
        UsrTokenExample example = (UsrTokenExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_token");
        
        if (record.getTokenId() != null) {
            sql.SET("TOKEN_ID = #{record.tokenId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getTokenSts() != null) {
            sql.SET("TOKEN_STS = #{record.tokenSts,jdbcType=CHAR}");
        }
        
        if (record.getTokenCreateTime() != null) {
            sql.SET("TOKEN_CREATE_TIME = #{record.tokenCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTokenEndTime() != null) {
            sql.SET("TOKEN_END_TIME = #{record.tokenEndTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_token");
        
        sql.SET("TOKEN_ID = #{record.tokenId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("TOKEN_STS = #{record.tokenSts,jdbcType=CHAR}");
        sql.SET("TOKEN_CREATE_TIME = #{record.tokenCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("TOKEN_END_TIME = #{record.tokenEndTime,jdbcType=TIMESTAMP}");
        
        UsrTokenExample example = (UsrTokenExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrToken record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_token");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTokenSts() != null) {
            sql.SET("TOKEN_STS = #{tokenSts,jdbcType=CHAR}");
        }
        
        if (record.getTokenCreateTime() != null) {
            sql.SET("TOKEN_CREATE_TIME = #{tokenCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTokenEndTime() != null) {
            sql.SET("TOKEN_END_TIME = #{tokenEndTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("TOKEN_ID = #{tokenId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrTokenExample example, boolean includeExamplePhrase) {
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