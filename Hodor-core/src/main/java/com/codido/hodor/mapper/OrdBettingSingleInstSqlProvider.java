package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdBettingSingleInst;
import com.codido.hodor.model.OrdBettingSingleInstExample.Criteria;
import com.codido.hodor.model.OrdBettingSingleInstExample.Criterion;
import com.codido.hodor.model.OrdBettingSingleInstExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdBettingSingleInstSqlProvider {

    public String countByExample(OrdBettingSingleInstExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_betting_single_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdBettingSingleInstExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_betting_single_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdBettingSingleInst record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_betting_single_inst");
        
        if (record.getLottoInstId() != null) {
            sql.VALUES("LOTTO_INST_ID", "#{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.VALUES("PERIOD_NAME", "#{periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingInstId() != null) {
            sql.VALUES("BETTING_INST_ID", "#{bettingInstId,jdbcType=BIGINT}");
        }
        
        if (record.getSingleInstNumber() != null) {
            sql.VALUES("SINGLE_INST_NUMBER", "#{singleInstNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstTimes() != null) {
            sql.VALUES("SINGLE_INST_TIMES", "#{singleInstTimes,jdbcType=INTEGER}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.VALUES("LOTTO_BONUS_ID", "#{lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.VALUES("LOTTO_BONUS_LEVEL", "#{lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstSts() != null) {
            sql.VALUES("SINGLE_INST_STS", "#{singleInstSts,jdbcType=CHAR}");
        }
        
        if (record.getSingleInstBonusSts() != null) {
            sql.VALUES("SINGLE_INST_BONUS_STS", "#{singleInstBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.VALUES("BONUS_AMT", "#{bonusAmt,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdBettingSingleInstExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SINGLE_INST_ID");
        } else {
            sql.SELECT("SINGLE_INST_ID");
        }
        sql.SELECT("LOTTO_INST_ID");
        sql.SELECT("PERIOD_NAME");
        sql.SELECT("BETTING_INST_ID");
        sql.SELECT("SINGLE_INST_NUMBER");
        sql.SELECT("SINGLE_INST_TIMES");
        sql.SELECT("LOTTO_BONUS_ID");
        sql.SELECT("LOTTO_BONUS_LEVEL");
        sql.SELECT("SINGLE_INST_STS");
        sql.SELECT("SINGLE_INST_BONUS_STS");
        sql.SELECT("BONUS_AMT");
        sql.FROM("t_ord_betting_single_inst");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdBettingSingleInst record = (OrdBettingSingleInst) parameter.get("record");
        OrdBettingSingleInstExample example = (OrdBettingSingleInstExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_single_inst");
        
        if (record.getSingleInstId() != null) {
            sql.SET("SINGLE_INST_ID = #{record.singleInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.SET("PERIOD_NAME = #{record.periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingInstId() != null) {
            sql.SET("BETTING_INST_ID = #{record.bettingInstId,jdbcType=BIGINT}");
        }
        
        if (record.getSingleInstNumber() != null) {
            sql.SET("SINGLE_INST_NUMBER = #{record.singleInstNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstTimes() != null) {
            sql.SET("SINGLE_INST_TIMES = #{record.singleInstTimes,jdbcType=INTEGER}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.SET("LOTTO_BONUS_LEVEL = #{record.lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstSts() != null) {
            sql.SET("SINGLE_INST_STS = #{record.singleInstSts,jdbcType=CHAR}");
        }
        
        if (record.getSingleInstBonusSts() != null) {
            sql.SET("SINGLE_INST_BONUS_STS = #{record.singleInstBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.SET("BONUS_AMT = #{record.bonusAmt,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_single_inst");
        
        sql.SET("SINGLE_INST_ID = #{record.singleInstId,jdbcType=BIGINT}");
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("PERIOD_NAME = #{record.periodName,jdbcType=VARCHAR}");
        sql.SET("BETTING_INST_ID = #{record.bettingInstId,jdbcType=BIGINT}");
        sql.SET("SINGLE_INST_NUMBER = #{record.singleInstNumber,jdbcType=VARCHAR}");
        sql.SET("SINGLE_INST_TIMES = #{record.singleInstTimes,jdbcType=INTEGER}");
        sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        sql.SET("LOTTO_BONUS_LEVEL = #{record.lottoBonusLevel,jdbcType=VARCHAR}");
        sql.SET("SINGLE_INST_STS = #{record.singleInstSts,jdbcType=CHAR}");
        sql.SET("SINGLE_INST_BONUS_STS = #{record.singleInstBonusSts,jdbcType=CHAR}");
        sql.SET("BONUS_AMT = #{record.bonusAmt,jdbcType=BIGINT}");
        
        OrdBettingSingleInstExample example = (OrdBettingSingleInstExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdBettingSingleInst record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_single_inst");
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.SET("PERIOD_NAME = #{periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingInstId() != null) {
            sql.SET("BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT}");
        }
        
        if (record.getSingleInstNumber() != null) {
            sql.SET("SINGLE_INST_NUMBER = #{singleInstNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstTimes() != null) {
            sql.SET("SINGLE_INST_TIMES = #{singleInstTimes,jdbcType=INTEGER}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.SET("LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.SET("LOTTO_BONUS_LEVEL = #{lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleInstSts() != null) {
            sql.SET("SINGLE_INST_STS = #{singleInstSts,jdbcType=CHAR}");
        }
        
        if (record.getSingleInstBonusSts() != null) {
            sql.SET("SINGLE_INST_BONUS_STS = #{singleInstBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.SET("BONUS_AMT = #{bonusAmt,jdbcType=BIGINT}");
        }
        
        sql.WHERE("SINGLE_INST_ID = #{singleInstId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdBettingSingleInstExample example, boolean includeExamplePhrase) {
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