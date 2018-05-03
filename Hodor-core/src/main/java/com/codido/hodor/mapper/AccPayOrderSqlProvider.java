package com.codido.hodor.mapper;

import com.codido.hodor.model.AccPayOrder;
import com.codido.hodor.model.AccPayOrderExample.Criteria;
import com.codido.hodor.model.AccPayOrderExample.Criterion;
import com.codido.hodor.model.AccPayOrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccPayOrderSqlProvider {

    public String countByExample(AccPayOrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_acc_pay_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccPayOrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_acc_pay_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AccPayOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_acc_pay_order");
        
        if (record.getPayOrderNo() != null) {
            sql.VALUES("PAY_ORDER_NO", "#{payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderType() != null) {
            sql.VALUES("PAY_ORDER_TYPE", "#{payOrderType,jdbcType=CHAR}");
        }
        
        if (record.getPayAmt() != null) {
            sql.VALUES("PAY_AMT", "#{payAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getPayOrderSts() != null) {
            sql.VALUES("PAY_ORDER_STS", "#{payOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getPayOrderCreateTime() != null) {
            sql.VALUES("PAY_ORDER_CREATE_TIME", "#{payOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderPayTime() != null) {
            sql.VALUES("PAY_ORDER_PAY_TIME", "#{payOrderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AccPayOrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("PAY_ORDER_ID");
        } else {
            sql.SELECT("PAY_ORDER_ID");
        }
        sql.SELECT("PAY_ORDER_NO");
        sql.SELECT("PAY_ORDER_TYPE");
        sql.SELECT("PAY_AMT");
        sql.SELECT("PAY_ORDER_STS");
        sql.SELECT("PAY_ORDER_CREATE_TIME");
        sql.SELECT("PAY_ORDER_PAY_TIME");
        sql.SELECT("USER_ID");
        sql.SELECT("SHOP_ID");
        sql.FROM("t_acc_pay_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccPayOrder record = (AccPayOrder) parameter.get("record");
        AccPayOrderExample example = (AccPayOrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_acc_pay_order");
        
        if (record.getPayOrderId() != null) {
            sql.SET("PAY_ORDER_ID = #{record.payOrderId,jdbcType=BIGINT}");
        }
        
        if (record.getPayOrderNo() != null) {
            sql.SET("PAY_ORDER_NO = #{record.payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderType() != null) {
            sql.SET("PAY_ORDER_TYPE = #{record.payOrderType,jdbcType=CHAR}");
        }
        
        if (record.getPayAmt() != null) {
            sql.SET("PAY_AMT = #{record.payAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getPayOrderSts() != null) {
            sql.SET("PAY_ORDER_STS = #{record.payOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getPayOrderCreateTime() != null) {
            sql.SET("PAY_ORDER_CREATE_TIME = #{record.payOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderPayTime() != null) {
            sql.SET("PAY_ORDER_PAY_TIME = #{record.payOrderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_pay_order");
        
        sql.SET("PAY_ORDER_ID = #{record.payOrderId,jdbcType=BIGINT}");
        sql.SET("PAY_ORDER_NO = #{record.payOrderNo,jdbcType=VARCHAR}");
        sql.SET("PAY_ORDER_TYPE = #{record.payOrderType,jdbcType=CHAR}");
        sql.SET("PAY_AMT = #{record.payAmt,jdbcType=DECIMAL}");
        sql.SET("PAY_ORDER_STS = #{record.payOrderSts,jdbcType=CHAR}");
        sql.SET("PAY_ORDER_CREATE_TIME = #{record.payOrderCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("PAY_ORDER_PAY_TIME = #{record.payOrderPayTime,jdbcType=TIMESTAMP}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        
        AccPayOrderExample example = (AccPayOrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccPayOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_pay_order");
        
        if (record.getPayOrderNo() != null) {
            sql.SET("PAY_ORDER_NO = #{payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderType() != null) {
            sql.SET("PAY_ORDER_TYPE = #{payOrderType,jdbcType=CHAR}");
        }
        
        if (record.getPayAmt() != null) {
            sql.SET("PAY_AMT = #{payAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getPayOrderSts() != null) {
            sql.SET("PAY_ORDER_STS = #{payOrderSts,jdbcType=CHAR}");
        }
        
        if (record.getPayOrderCreateTime() != null) {
            sql.SET("PAY_ORDER_CREATE_TIME = #{payOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderPayTime() != null) {
            sql.SET("PAY_ORDER_PAY_TIME = #{payOrderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("PAY_ORDER_ID = #{payOrderId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccPayOrderExample example, boolean includeExamplePhrase) {
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