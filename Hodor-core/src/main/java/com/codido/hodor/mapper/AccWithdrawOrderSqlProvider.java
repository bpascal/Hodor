package com.codido.hodor.mapper;

import com.codido.hodor.model.AccWithdrawOrder;
import com.codido.hodor.model.AccWithdrawOrderExample.Criteria;
import com.codido.hodor.model.AccWithdrawOrderExample.Criterion;
import com.codido.hodor.model.AccWithdrawOrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccWithdrawOrderSqlProvider {

    public String countByExample(AccWithdrawOrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_acc_withdraw_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccWithdrawOrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_acc_withdraw_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AccWithdrawOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_acc_withdraw_order");
        
        if (record.getWithdrawOrderNo() != null) {
            sql.VALUES("WITHDRAW_ORDER_NO", "#{withdrawOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getWithdrawType() != null) {
            sql.VALUES("WITHDRAW_TYPE", "#{withdrawType,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawOrderSts() != null) {
            sql.VALUES("WITHDRAW_ORDER_STS", "#{withdrawOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawAmt() != null) {
            sql.VALUES("WITHDRAW_AMT", "#{withdrawAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getUserBankCardNo() != null) {
            sql.VALUES("USER_BANK_CARD_NO", "#{userBankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserBankCardId() != null) {
            sql.VALUES("USER_BANK_CARD_ID", "#{userBankCardId,jdbcType=BIGINT}");
        }
        
        if (record.getApplyTime() != null) {
            sql.VALUES("APPLY_TIME", "#{applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayTime() != null) {
            sql.VALUES("PAY_TIME", "#{payTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AccWithdrawOrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("WITHDRAW_ORDER_ID");
        } else {
            sql.SELECT("WITHDRAW_ORDER_ID");
        }
        sql.SELECT("WITHDRAW_ORDER_NO");
        sql.SELECT("USER_ID");
        sql.SELECT("SHOP_ID");
        sql.SELECT("WITHDRAW_TYPE");
        sql.SELECT("WITHDRAW_ORDER_STS");
        sql.SELECT("WITHDRAW_AMT");
        sql.SELECT("USER_BANK_CARD_NO");
        sql.SELECT("USER_BANK_CARD_ID");
        sql.SELECT("APPLY_TIME");
        sql.SELECT("PAY_TIME");
        sql.FROM("t_acc_withdraw_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccWithdrawOrder record = (AccWithdrawOrder) parameter.get("record");
        AccWithdrawOrderExample example = (AccWithdrawOrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_acc_withdraw_order");
        
        if (record.getWithdrawOrderId() != null) {
            sql.SET("WITHDRAW_ORDER_ID = #{record.withdrawOrderId,jdbcType=BIGINT}");
        }
        
        if (record.getWithdrawOrderNo() != null) {
            sql.SET("WITHDRAW_ORDER_NO = #{record.withdrawOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getWithdrawType() != null) {
            sql.SET("WITHDRAW_TYPE = #{record.withdrawType,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawOrderSts() != null) {
            sql.SET("WITHDRAW_ORDER_STS = #{record.withdrawOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawAmt() != null) {
            sql.SET("WITHDRAW_AMT = #{record.withdrawAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getUserBankCardNo() != null) {
            sql.SET("USER_BANK_CARD_NO = #{record.userBankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserBankCardId() != null) {
            sql.SET("USER_BANK_CARD_ID = #{record.userBankCardId,jdbcType=BIGINT}");
        }
        
        if (record.getApplyTime() != null) {
            sql.SET("APPLY_TIME = #{record.applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayTime() != null) {
            sql.SET("PAY_TIME = #{record.payTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_withdraw_order");
        
        sql.SET("WITHDRAW_ORDER_ID = #{record.withdrawOrderId,jdbcType=BIGINT}");
        sql.SET("WITHDRAW_ORDER_NO = #{record.withdrawOrderNo,jdbcType=VARCHAR}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("WITHDRAW_TYPE = #{record.withdrawType,jdbcType=CHAR}");
        sql.SET("WITHDRAW_ORDER_STS = #{record.withdrawOrderSts,jdbcType=CHAR}");
        sql.SET("WITHDRAW_AMT = #{record.withdrawAmt,jdbcType=DECIMAL}");
        sql.SET("USER_BANK_CARD_NO = #{record.userBankCardNo,jdbcType=VARCHAR}");
        sql.SET("USER_BANK_CARD_ID = #{record.userBankCardId,jdbcType=BIGINT}");
        sql.SET("APPLY_TIME = #{record.applyTime,jdbcType=TIMESTAMP}");
        sql.SET("PAY_TIME = #{record.payTime,jdbcType=TIMESTAMP}");
        
        AccWithdrawOrderExample example = (AccWithdrawOrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccWithdrawOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_withdraw_order");
        
        if (record.getWithdrawOrderNo() != null) {
            sql.SET("WITHDRAW_ORDER_NO = #{withdrawOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getWithdrawType() != null) {
            sql.SET("WITHDRAW_TYPE = #{withdrawType,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawOrderSts() != null) {
            sql.SET("WITHDRAW_ORDER_STS = #{withdrawOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getWithdrawAmt() != null) {
            sql.SET("WITHDRAW_AMT = #{withdrawAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getUserBankCardNo() != null) {
            sql.SET("USER_BANK_CARD_NO = #{userBankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserBankCardId() != null) {
            sql.SET("USER_BANK_CARD_ID = #{userBankCardId,jdbcType=BIGINT}");
        }
        
        if (record.getApplyTime() != null) {
            sql.SET("APPLY_TIME = #{applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayTime() != null) {
            sql.SET("PAY_TIME = #{payTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("WITHDRAW_ORDER_ID = #{withdrawOrderId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccWithdrawOrderExample example, boolean includeExamplePhrase) {
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