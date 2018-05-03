package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAccount;
import com.codido.hodor.model.AccUserAccountExample.Criteria;
import com.codido.hodor.model.AccUserAccountExample.Criterion;
import com.codido.hodor.model.AccUserAccountExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccUserAccountSqlProvider {

    public String countByExample(AccUserAccountExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_acc_user_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccUserAccountExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_acc_user_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AccUserAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_acc_user_account");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountTypeId() != null) {
            sql.VALUES("ACCOUNT_TYPE_ID", "#{accountTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("AMOUNT", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getAccountSts() != null) {
            sql.VALUES("ACCOUNT_STS", "#{accountSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AccUserAccountExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_ACCOUNT_ID");
        } else {
            sql.SELECT("USER_ACCOUNT_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("ACCOUNT_TYPE_ID");
        sql.SELECT("AMOUNT");
        sql.SELECT("ACCOUNT_STS");
        sql.FROM("t_acc_user_account");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccUserAccount record = (AccUserAccount) parameter.get("record");
        AccUserAccountExample example = (AccUserAccountExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_account");
        
        if (record.getUserAccountId() != null) {
            sql.SET("USER_ACCOUNT_ID = #{record.userAccountId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountTypeId() != null) {
            sql.SET("ACCOUNT_TYPE_ID = #{record.accountTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getAccountSts() != null) {
            sql.SET("ACCOUNT_STS = #{record.accountSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_account");
        
        sql.SET("USER_ACCOUNT_ID = #{record.userAccountId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("ACCOUNT_TYPE_ID = #{record.accountTypeId,jdbcType=BIGINT}");
        sql.SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("ACCOUNT_STS = #{record.accountSts,jdbcType=CHAR}");
        
        AccUserAccountExample example = (AccUserAccountExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccUserAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_account");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountTypeId() != null) {
            sql.SET("ACCOUNT_TYPE_ID = #{accountTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("AMOUNT = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getAccountSts() != null) {
            sql.SET("ACCOUNT_STS = #{accountSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccUserAccountExample example, boolean includeExamplePhrase) {
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