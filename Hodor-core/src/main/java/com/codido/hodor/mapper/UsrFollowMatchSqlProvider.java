package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrFollowMatch;
import com.codido.hodor.model.UsrFollowMatchExample.Criteria;
import com.codido.hodor.model.UsrFollowMatchExample.Criterion;
import com.codido.hodor.model.UsrFollowMatchExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrFollowMatchSqlProvider {

    public String countByExample(UsrFollowMatchExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_follow_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrFollowMatchExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_follow_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrFollowMatch record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_follow_match");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.VALUES("MATCH_ID", "#{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchType() != null) {
            sql.VALUES("MATCH_TYPE", "#{matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowDate() != null) {
            sql.VALUES("FOLLOW_DATE", "#{followDate,jdbcType=DATE}");
        }
        
        if (record.getFollowTime() != null) {
            sql.VALUES("FOLLOW_TIME", "#{followTime,jdbcType=TIME}");
        }
        
        if (record.getFollowSts() != null) {
            sql.VALUES("FOLLOW_STS", "#{followSts,jdbcType=CHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.VALUES("FORM_ID", "#{formId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.VALUES("ORDER_PUSHMSG_STS", "#{orderPushmsgSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrFollowMatchExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("FOLLOW_ID");
        } else {
            sql.SELECT("FOLLOW_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("MATCH_ID");
        sql.SELECT("MATCH_TYPE");
        sql.SELECT("FOLLOW_DATE");
        sql.SELECT("FOLLOW_TIME");
        sql.SELECT("FOLLOW_STS");
        sql.SELECT("FORM_ID");
        sql.SELECT("ORDER_PUSHMSG_STS");
        sql.FROM("t_usr_follow_match");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrFollowMatch record = (UsrFollowMatch) parameter.get("record");
        UsrFollowMatchExample example = (UsrFollowMatchExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_follow_match");
        
        if (record.getFollowId() != null) {
            sql.SET("FOLLOW_ID = #{record.followId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchType() != null) {
            sql.SET("MATCH_TYPE = #{record.matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowDate() != null) {
            sql.SET("FOLLOW_DATE = #{record.followDate,jdbcType=DATE}");
        }
        
        if (record.getFollowTime() != null) {
            sql.SET("FOLLOW_TIME = #{record.followTime,jdbcType=TIME}");
        }
        
        if (record.getFollowSts() != null) {
            sql.SET("FOLLOW_STS = #{record.followSts,jdbcType=CHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.SET("FORM_ID = #{record.formId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.SET("ORDER_PUSHMSG_STS = #{record.orderPushmsgSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_follow_match");
        
        sql.SET("FOLLOW_ID = #{record.followId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        sql.SET("MATCH_TYPE = #{record.matchType,jdbcType=VARCHAR}");
        sql.SET("FOLLOW_DATE = #{record.followDate,jdbcType=DATE}");
        sql.SET("FOLLOW_TIME = #{record.followTime,jdbcType=TIME}");
        sql.SET("FOLLOW_STS = #{record.followSts,jdbcType=CHAR}");
        sql.SET("FORM_ID = #{record.formId,jdbcType=VARCHAR}");
        sql.SET("ORDER_PUSHMSG_STS = #{record.orderPushmsgSts,jdbcType=CHAR}");
        
        UsrFollowMatchExample example = (UsrFollowMatchExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrFollowMatch record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_follow_match");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchType() != null) {
            sql.SET("MATCH_TYPE = #{matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowDate() != null) {
            sql.SET("FOLLOW_DATE = #{followDate,jdbcType=DATE}");
        }
        
        if (record.getFollowTime() != null) {
            sql.SET("FOLLOW_TIME = #{followTime,jdbcType=TIME}");
        }
        
        if (record.getFollowSts() != null) {
            sql.SET("FOLLOW_STS = #{followSts,jdbcType=CHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.SET("FORM_ID = #{formId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.SET("ORDER_PUSHMSG_STS = #{orderPushmsgSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("FOLLOW_ID = #{followId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrFollowMatchExample example, boolean includeExamplePhrase) {
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