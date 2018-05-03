package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdChaseBetting;
import com.codido.hodor.model.OrdChaseBettingExample.Criteria;
import com.codido.hodor.model.OrdChaseBettingExample.Criterion;
import com.codido.hodor.model.OrdChaseBettingExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdChaseBettingSqlProvider {

    public String countByExample(OrdChaseBettingExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_chase_betting");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdChaseBettingExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_chase_betting");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdChaseBetting record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_chase_betting");
        
        if (record.getChaseNo() != null) {
            sql.VALUES("CHASE_NO", "#{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.VALUES("CHOOSE_NUMBER", "#{chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.VALUES("BETTING_TYPE", "#{bettingType,jdbcType=CHAR}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.VALUES("BETTING_COUNTS", "#{bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.VALUES("BETTING_AMT", "#{bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.VALUES("NUMBER_TIMES", "#{numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.VALUES("BETTING_INST_STS", "#{bettingInstSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdChaseBettingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CHASE_BETTING_ID");
        } else {
            sql.SELECT("CHASE_BETTING_ID");
        }
        sql.SELECT("CHASE_NO");
        sql.SELECT("CHOOSE_NUMBER");
        sql.SELECT("BETTING_TYPE");
        sql.SELECT("BETTING_COUNTS");
        sql.SELECT("BETTING_AMT");
        sql.SELECT("NUMBER_TIMES");
        sql.SELECT("BETTING_INST_STS");
        sql.FROM("t_ord_chase_betting");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdChaseBetting record = (OrdChaseBetting) parameter.get("record");
        OrdChaseBettingExample example = (OrdChaseBettingExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase_betting");
        
        if (record.getChaseBettingId() != null) {
            sql.SET("CHASE_BETTING_ID = #{record.chaseBettingId,jdbcType=BIGINT}");
        }
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.SET("CHOOSE_NUMBER = #{record.chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.SET("BETTING_TYPE = #{record.bettingType,jdbcType=CHAR}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.SET("BETTING_COUNTS = #{record.bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.SET("BETTING_AMT = #{record.bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.SET("NUMBER_TIMES = #{record.numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.SET("BETTING_INST_STS = #{record.bettingInstSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase_betting");
        
        sql.SET("CHASE_BETTING_ID = #{record.chaseBettingId,jdbcType=BIGINT}");
        sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        sql.SET("CHOOSE_NUMBER = #{record.chooseNumber,jdbcType=VARCHAR}");
        sql.SET("BETTING_TYPE = #{record.bettingType,jdbcType=CHAR}");
        sql.SET("BETTING_COUNTS = #{record.bettingCounts,jdbcType=INTEGER}");
        sql.SET("BETTING_AMT = #{record.bettingAmt,jdbcType=INTEGER}");
        sql.SET("NUMBER_TIMES = #{record.numberTimes,jdbcType=INTEGER}");
        sql.SET("BETTING_INST_STS = #{record.bettingInstSts,jdbcType=CHAR}");
        
        OrdChaseBettingExample example = (OrdChaseBettingExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdChaseBetting record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase_betting");
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.SET("CHOOSE_NUMBER = #{chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.SET("BETTING_TYPE = #{bettingType,jdbcType=CHAR}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.SET("BETTING_COUNTS = #{bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.SET("BETTING_AMT = #{bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.SET("NUMBER_TIMES = #{numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.SET("BETTING_INST_STS = #{bettingInstSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("CHASE_BETTING_ID = #{chaseBettingId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdChaseBettingExample example, boolean includeExamplePhrase) {
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