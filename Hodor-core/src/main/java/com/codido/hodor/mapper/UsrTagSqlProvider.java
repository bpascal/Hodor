package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrTag;
import com.codido.hodor.model.UsrTagExample.Criteria;
import com.codido.hodor.model.UsrTagExample.Criterion;
import com.codido.hodor.model.UsrTagExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrTagSqlProvider {

    public String countByExample(UsrTagExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_tag");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrTagExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_tag");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrTag record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_tag");
        
        if (record.getTagName() != null) {
            sql.VALUES("TAG_NAME", "#{tagName,jdbcType=VARCHAR}");
        }
        
        if (record.getTagDesc() != null) {
            sql.VALUES("TAG_DESC", "#{tagDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTagSts() != null) {
            sql.VALUES("TAG_STS", "#{tagSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrTagExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TAG_ID");
        } else {
            sql.SELECT("TAG_ID");
        }
        sql.SELECT("TAG_NAME");
        sql.SELECT("TAG_DESC");
        sql.SELECT("TAG_STS");
        sql.FROM("t_usr_tag");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrTag record = (UsrTag) parameter.get("record");
        UsrTagExample example = (UsrTagExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tag");
        
        if (record.getTagId() != null) {
            sql.SET("TAG_ID = #{record.tagId,jdbcType=BIGINT}");
        }
        
        if (record.getTagName() != null) {
            sql.SET("TAG_NAME = #{record.tagName,jdbcType=VARCHAR}");
        }
        
        if (record.getTagDesc() != null) {
            sql.SET("TAG_DESC = #{record.tagDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTagSts() != null) {
            sql.SET("TAG_STS = #{record.tagSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tag");
        
        sql.SET("TAG_ID = #{record.tagId,jdbcType=BIGINT}");
        sql.SET("TAG_NAME = #{record.tagName,jdbcType=VARCHAR}");
        sql.SET("TAG_DESC = #{record.tagDesc,jdbcType=VARCHAR}");
        sql.SET("TAG_STS = #{record.tagSts,jdbcType=CHAR}");
        
        UsrTagExample example = (UsrTagExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrTag record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_tag");
        
        if (record.getTagName() != null) {
            sql.SET("TAG_NAME = #{tagName,jdbcType=VARCHAR}");
        }
        
        if (record.getTagDesc() != null) {
            sql.SET("TAG_DESC = #{tagDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTagSts() != null) {
            sql.SET("TAG_STS = #{tagSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("TAG_ID = #{tagId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrTagExample example, boolean includeExamplePhrase) {
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