package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdRefund;
import com.codido.hodor.model.OrdRefundExample.Criteria;
import com.codido.hodor.model.OrdRefundExample.Criterion;
import com.codido.hodor.model.OrdRefundExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdRefundSqlProvider {

    public String countByExample(OrdRefundExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_refund");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdRefundExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_refund");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdRefund record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_refund");
        
        if (record.getRefundNo() != null) {
            sql.VALUES("REFUND_NO", "#{refundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderNo() != null) {
            sql.VALUES("PAY_ORDER_NO", "#{payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundCreateTime() != null) {
            sql.VALUES("REFUND_CREATE_TIME", "#{refundCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundTime() != null) {
            sql.VALUES("REFUND_TIME", "#{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundSts() != null) {
            sql.VALUES("REFUND_STS", "#{refundSts,jdbcType=CHAR}");
        }
        
        if (record.getPayRefundId() != null) {
            sql.VALUES("PAY_REFUND_ID", "#{payRefundId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdRefundExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("REFUND_ID");
        } else {
            sql.SELECT("REFUND_ID");
        }
        sql.SELECT("REFUND_NO");
        sql.SELECT("PAY_ORDER_NO");
        sql.SELECT("REFUND_CREATE_TIME");
        sql.SELECT("REFUND_TIME");
        sql.SELECT("REFUND_STS");
        sql.SELECT("PAY_REFUND_ID");
        sql.FROM("t_ord_refund");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdRefund record = (OrdRefund) parameter.get("record");
        OrdRefundExample example = (OrdRefundExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_refund");
        
        if (record.getRefundId() != null) {
            sql.SET("REFUND_ID = #{record.refundId,jdbcType=BIGINT}");
        }
        
        if (record.getRefundNo() != null) {
            sql.SET("REFUND_NO = #{record.refundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderNo() != null) {
            sql.SET("PAY_ORDER_NO = #{record.payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundCreateTime() != null) {
            sql.SET("REFUND_CREATE_TIME = #{record.refundCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundTime() != null) {
            sql.SET("REFUND_TIME = #{record.refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundSts() != null) {
            sql.SET("REFUND_STS = #{record.refundSts,jdbcType=CHAR}");
        }
        
        if (record.getPayRefundId() != null) {
            sql.SET("PAY_REFUND_ID = #{record.payRefundId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_refund");
        
        sql.SET("REFUND_ID = #{record.refundId,jdbcType=BIGINT}");
        sql.SET("REFUND_NO = #{record.refundNo,jdbcType=VARCHAR}");
        sql.SET("PAY_ORDER_NO = #{record.payOrderNo,jdbcType=VARCHAR}");
        sql.SET("REFUND_CREATE_TIME = #{record.refundCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("REFUND_TIME = #{record.refundTime,jdbcType=TIMESTAMP}");
        sql.SET("REFUND_STS = #{record.refundSts,jdbcType=CHAR}");
        sql.SET("PAY_REFUND_ID = #{record.payRefundId,jdbcType=VARCHAR}");
        
        OrdRefundExample example = (OrdRefundExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdRefund record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_refund");
        
        if (record.getRefundNo() != null) {
            sql.SET("REFUND_NO = #{refundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderNo() != null) {
            sql.SET("PAY_ORDER_NO = #{payOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundCreateTime() != null) {
            sql.SET("REFUND_CREATE_TIME = #{refundCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundTime() != null) {
            sql.SET("REFUND_TIME = #{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundSts() != null) {
            sql.SET("REFUND_STS = #{refundSts,jdbcType=CHAR}");
        }
        
        if (record.getPayRefundId() != null) {
            sql.SET("PAY_REFUND_ID = #{payRefundId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("REFUND_ID = #{refundId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdRefundExample example, boolean includeExamplePhrase) {
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