package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrTags;
import com.codido.hodor.model.UsrTagsExample.Criteria;
import com.codido.hodor.model.UsrTagsExample.Criterion;
import com.codido.hodor.model.UsrTagsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrTagsSqlProvider {

    public String countByExample(UsrTagsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_tags");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrTagsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_tags");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrTags record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_tags");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTagId() != null) {
            sql.VALUES("TAG_ID", "#{tagId,jdbcType=BIGINT}");
        }
        
        if (record.getTagTime() != null) {
            sql.VALUES("TAG_TIME", "#{tagTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserTagSts() != null) {
            sql.VALUES("USER_TAG_STS", "#{userTagSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrTagsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_TAG_ID");
        } else {
            sql.SELECT("USER_TAG_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("TAG_ID");
        sql.SELECT("TAG_TIME");
        sql.SELECT("USER_TAG_STS");
        sql.FROM("t_usr_tags");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrTags record = (UsrTags) parameter.get("record");
        UsrTagsExample example = (UsrTagsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tags");
        
        if (record.getUserTagId() != null) {
            sql.SET("USER_TAG_ID = #{record.userTagId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getTagId() != null) {
            sql.SET("TAG_ID = #{record.tagId,jdbcType=BIGINT}");
        }
        
        if (record.getTagTime() != null) {
            sql.SET("TAG_TIME = #{record.tagTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserTagSts() != null) {
            sql.SET("USER_TAG_STS = #{record.userTagSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tags");
        
        sql.SET("USER_TAG_ID = #{record.userTagId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("TAG_ID = #{record.tagId,jdbcType=BIGINT}");
        sql.SET("TAG_TIME = #{record.tagTime,jdbcType=TIMESTAMP}");
        sql.SET("USER_TAG_STS = #{record.userTagSts,jdbcType=CHAR}");
        
        UsrTagsExample example = (UsrTagsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrTags record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tags");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTagId() != null) {
            sql.SET("TAG_ID = #{tagId,jdbcType=BIGINT}");
        }
        
        if (record.getTagTime() != null) {
            sql.SET("TAG_TIME = #{tagTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserTagSts() != null) {
            sql.SET("USER_TAG_STS = #{userTagSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("USER_TAG_ID = #{userTagId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrTagsExample example, boolean includeExamplePhrase) {
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