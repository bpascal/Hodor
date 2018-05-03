package com.codido.hodor.mapper;

import com.codido.hodor.model.AccShopAccount;
import com.codido.hodor.model.AccShopAccountExample.Criteria;
import com.codido.hodor.model.AccShopAccountExample.Criterion;
import com.codido.hodor.model.AccShopAccountExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccShopAccountSqlProvider {

    public String countByExample(AccShopAccountExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_acc_shop_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccShopAccountExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_acc_shop_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AccShopAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_acc_shop_account");
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
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

    public String selectByExample(AccShopAccountExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SHOP_ACCOUNT_ID");
        } else {
            sql.SELECT("SHOP_ACCOUNT_ID");
        }
        sql.SELECT("SHOP_ID");
        sql.SELECT("ACCOUNT_TYPE_ID");
        sql.SELECT("AMOUNT");
        sql.SELECT("ACCOUNT_STS");
        sql.FROM("t_acc_shop_account");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccShopAccount record = (AccShopAccount) parameter.get("record");
        AccShopAccountExample example = (AccShopAccountExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_acc_shop_account");
        
        if (record.getShopAccountId() != null) {
            sql.SET("SHOP_ACCOUNT_ID = #{record.shopAccountId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
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
        sql.UPDATE("t_acc_shop_account");
        
        sql.SET("SHOP_ACCOUNT_ID = #{record.shopAccountId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("ACCOUNT_TYPE_ID = #{record.accountTypeId,jdbcType=BIGINT}");
        sql.SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("ACCOUNT_STS = #{record.accountSts,jdbcType=CHAR}");
        
        AccShopAccountExample example = (AccShopAccountExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccShopAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_shop_account");
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
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
        
        sql.WHERE("SHOP_ACCOUNT_ID = #{shopAccountId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccShopAccountExample example, boolean includeExamplePhrase) {
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