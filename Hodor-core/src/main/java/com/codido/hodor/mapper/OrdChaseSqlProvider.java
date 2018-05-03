package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdChase;
import com.codido.hodor.model.OrdChaseExample.Criteria;
import com.codido.hodor.model.OrdChaseExample.Criterion;
import com.codido.hodor.model.OrdChaseExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdChaseSqlProvider {

    public String countByExample(OrdChaseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_chase");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdChaseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_chase");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdChase record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_chase");
        
        if (record.getChaseNo() != null) {
            sql.VALUES("CHASE_NO", "#{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.VALUES("LOTTO_ID", "#{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getChaseSts() != null) {
            sql.VALUES("CHASE_STS", "#{chaseSts,jdbcType=CHAR}");
        }
        
        if (record.getChaseTimes() != null) {
            sql.VALUES("CHASE_TIMES", "#{chaseTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCurrentTimes() != null) {
            sql.VALUES("CHASE_CURRENT_TIMES", "#{chaseCurrentTimes,jdbcType=INTEGER}");
        }
        
        if (record.getEndMethod() != null) {
            sql.VALUES("END_METHOD", "#{endMethod,jdbcType=CHAR}");
        }
        
        if (record.getPerTimeAmt() != null) {
            sql.VALUES("PER_TIME_AMT", "#{perTimeAmt,jdbcType=INTEGER}");
        }
        
        if (record.getPerTimeBettingCounts() != null) {
            sql.VALUES("PER_TIME_BETTING_COUNTS", "#{perTimeBettingCounts,jdbcType=VARCHAR}");
        }
        
        if (record.getChaseBettingTimes() != null) {
            sql.VALUES("CHASE_BETTING_TIMES", "#{chaseBettingTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCreateTime() != null) {
            sql.VALUES("CHASE_CREATE_TIME", "#{chaseCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChaseCancelTime() != null) {
            sql.VALUES("CHASE_CANCEL_TIME", "#{chaseCancelTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdChaseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CHASE_ID");
        } else {
            sql.SELECT("CHASE_ID");
        }
        sql.SELECT("CHASE_NO");
        sql.SELECT("USER_ID");
        sql.SELECT("LOTTO_ID");
        sql.SELECT("CHASE_STS");
        sql.SELECT("CHASE_TIMES");
        sql.SELECT("CHASE_CURRENT_TIMES");
        sql.SELECT("END_METHOD");
        sql.SELECT("PER_TIME_AMT");
        sql.SELECT("PER_TIME_BETTING_COUNTS");
        sql.SELECT("CHASE_BETTING_TIMES");
        sql.SELECT("CHASE_CREATE_TIME");
        sql.SELECT("CHASE_CANCEL_TIME");
        sql.FROM("t_ord_chase");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdChase record = (OrdChase) parameter.get("record");
        OrdChaseExample example = (OrdChaseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase");
        
        if (record.getChaseId() != null) {
            sql.SET("CHASE_ID = #{record.chaseId,jdbcType=BIGINT}");
        }
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getChaseSts() != null) {
            sql.SET("CHASE_STS = #{record.chaseSts,jdbcType=CHAR}");
        }
        
        if (record.getChaseTimes() != null) {
            sql.SET("CHASE_TIMES = #{record.chaseTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCurrentTimes() != null) {
            sql.SET("CHASE_CURRENT_TIMES = #{record.chaseCurrentTimes,jdbcType=INTEGER}");
        }
        
        if (record.getEndMethod() != null) {
            sql.SET("END_METHOD = #{record.endMethod,jdbcType=CHAR}");
        }
        
        if (record.getPerTimeAmt() != null) {
            sql.SET("PER_TIME_AMT = #{record.perTimeAmt,jdbcType=INTEGER}");
        }
        
        if (record.getPerTimeBettingCounts() != null) {
            sql.SET("PER_TIME_BETTING_COUNTS = #{record.perTimeBettingCounts,jdbcType=VARCHAR}");
        }
        
        if (record.getChaseBettingTimes() != null) {
            sql.SET("CHASE_BETTING_TIMES = #{record.chaseBettingTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCreateTime() != null) {
            sql.SET("CHASE_CREATE_TIME = #{record.chaseCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChaseCancelTime() != null) {
            sql.SET("CHASE_CANCEL_TIME = #{record.chaseCancelTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase");
        
        sql.SET("CHASE_ID = #{record.chaseId,jdbcType=BIGINT}");
        sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("CHASE_STS = #{record.chaseSts,jdbcType=CHAR}");
        sql.SET("CHASE_TIMES = #{record.chaseTimes,jdbcType=INTEGER}");
        sql.SET("CHASE_CURRENT_TIMES = #{record.chaseCurrentTimes,jdbcType=INTEGER}");
        sql.SET("END_METHOD = #{record.endMethod,jdbcType=CHAR}");
        sql.SET("PER_TIME_AMT = #{record.perTimeAmt,jdbcType=INTEGER}");
        sql.SET("PER_TIME_BETTING_COUNTS = #{record.perTimeBettingCounts,jdbcType=VARCHAR}");
        sql.SET("CHASE_BETTING_TIMES = #{record.chaseBettingTimes,jdbcType=INTEGER}");
        sql.SET("CHASE_CREATE_TIME = #{record.chaseCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("CHASE_CANCEL_TIME = #{record.chaseCancelTime,jdbcType=TIMESTAMP}");
        
        OrdChaseExample example = (OrdChaseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdChase record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_chase");
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getChaseSts() != null) {
            sql.SET("CHASE_STS = #{chaseSts,jdbcType=CHAR}");
        }
        
        if (record.getChaseTimes() != null) {
            sql.SET("CHASE_TIMES = #{chaseTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCurrentTimes() != null) {
            sql.SET("CHASE_CURRENT_TIMES = #{chaseCurrentTimes,jdbcType=INTEGER}");
        }
        
        if (record.getEndMethod() != null) {
            sql.SET("END_METHOD = #{endMethod,jdbcType=CHAR}");
        }
        
        if (record.getPerTimeAmt() != null) {
            sql.SET("PER_TIME_AMT = #{perTimeAmt,jdbcType=INTEGER}");
        }
        
        if (record.getPerTimeBettingCounts() != null) {
            sql.SET("PER_TIME_BETTING_COUNTS = #{perTimeBettingCounts,jdbcType=VARCHAR}");
        }
        
        if (record.getChaseBettingTimes() != null) {
            sql.SET("CHASE_BETTING_TIMES = #{chaseBettingTimes,jdbcType=INTEGER}");
        }
        
        if (record.getChaseCreateTime() != null) {
            sql.SET("CHASE_CREATE_TIME = #{chaseCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChaseCancelTime() != null) {
            sql.SET("CHASE_CANCEL_TIME = #{chaseCancelTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("CHASE_ID = #{chaseId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdChaseExample example, boolean includeExamplePhrase) {
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