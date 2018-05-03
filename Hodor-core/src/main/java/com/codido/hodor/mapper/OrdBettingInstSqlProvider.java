package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdBettingInst;
import com.codido.hodor.model.OrdBettingInstExample.Criteria;
import com.codido.hodor.model.OrdBettingInstExample.Criterion;
import com.codido.hodor.model.OrdBettingInstExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdBettingInstSqlProvider {

    public String countByExample(OrdBettingInstExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_betting_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdBettingInstExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_betting_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdBettingInst record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_betting_inst");
        
        if (record.getLottoInstId() != null) {
            sql.VALUES("LOTTO_INST_ID", "#{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.VALUES("CHOOSE_NUMBER", "#{chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.VALUES("BETTING_TYPE", "#{bettingType,jdbcType=CHAR}");
        }
        
        if (record.getChooseTime() != null) {
            sql.VALUES("CHOOSE_TIME", "#{chooseTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.VALUES("BETTING_COUNTS", "#{bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.VALUES("BETTING_AMT", "#{bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getMatchId() != null) {
            sql.VALUES("MATCH_ID", "#{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.VALUES("NUMBER_TIMES", "#{numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.VALUES("BETTING_INST_STS", "#{bettingInstSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingBonusSts() != null) {
            sql.VALUES("BETTING_BONUS_STS", "#{bettingBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingInstAmt() != null) {
            sql.VALUES("BETTING_INST_AMT", "#{bettingInstAmt,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("ORDER_NO", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdBettingInstExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("BETTING_INST_ID");
        } else {
            sql.SELECT("BETTING_INST_ID");
        }
        sql.SELECT("LOTTO_INST_ID");
        sql.SELECT("USER_ID");
        sql.SELECT("CHOOSE_NUMBER");
        sql.SELECT("BETTING_TYPE");
        sql.SELECT("CHOOSE_TIME");
        sql.SELECT("BETTING_COUNTS");
        sql.SELECT("BETTING_AMT");
        sql.SELECT("MATCH_ID");
        sql.SELECT("NUMBER_TIMES");
        sql.SELECT("BETTING_INST_STS");
        sql.SELECT("BETTING_BONUS_STS");
        sql.SELECT("BETTING_INST_AMT");
        sql.SELECT("ORDER_NO");
        sql.FROM("t_ord_betting_inst");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdBettingInst record = (OrdBettingInst) parameter.get("record");
        OrdBettingInstExample example = (OrdBettingInstExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_inst");
        
        if (record.getBettingInstId() != null) {
            sql.SET("BETTING_INST_ID = #{record.bettingInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.SET("CHOOSE_NUMBER = #{record.chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.SET("BETTING_TYPE = #{record.bettingType,jdbcType=CHAR}");
        }
        
        if (record.getChooseTime() != null) {
            sql.SET("CHOOSE_TIME = #{record.chooseTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.SET("BETTING_COUNTS = #{record.bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.SET("BETTING_AMT = #{record.bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.SET("NUMBER_TIMES = #{record.numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.SET("BETTING_INST_STS = #{record.bettingInstSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingBonusSts() != null) {
            sql.SET("BETTING_BONUS_STS = #{record.bettingBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingInstAmt() != null) {
            sql.SET("BETTING_INST_AMT = #{record.bettingInstAmt,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_inst");
        
        sql.SET("BETTING_INST_ID = #{record.bettingInstId,jdbcType=BIGINT}");
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("CHOOSE_NUMBER = #{record.chooseNumber,jdbcType=VARCHAR}");
        sql.SET("BETTING_TYPE = #{record.bettingType,jdbcType=CHAR}");
        sql.SET("CHOOSE_TIME = #{record.chooseTime,jdbcType=TIMESTAMP}");
        sql.SET("BETTING_COUNTS = #{record.bettingCounts,jdbcType=INTEGER}");
        sql.SET("BETTING_AMT = #{record.bettingAmt,jdbcType=INTEGER}");
        sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        sql.SET("NUMBER_TIMES = #{record.numberTimes,jdbcType=INTEGER}");
        sql.SET("BETTING_INST_STS = #{record.bettingInstSts,jdbcType=CHAR}");
        sql.SET("BETTING_BONUS_STS = #{record.bettingBonusSts,jdbcType=CHAR}");
        sql.SET("BETTING_INST_AMT = #{record.bettingInstAmt,jdbcType=BIGINT}");
        sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        
        OrdBettingInstExample example = (OrdBettingInstExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdBettingInst record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_betting_inst");
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getChooseNumber() != null) {
            sql.SET("CHOOSE_NUMBER = #{chooseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBettingType() != null) {
            sql.SET("BETTING_TYPE = #{bettingType,jdbcType=CHAR}");
        }
        
        if (record.getChooseTime() != null) {
            sql.SET("CHOOSE_TIME = #{chooseTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBettingCounts() != null) {
            sql.SET("BETTING_COUNTS = #{bettingCounts,jdbcType=INTEGER}");
        }
        
        if (record.getBettingAmt() != null) {
            sql.SET("BETTING_AMT = #{bettingAmt,jdbcType=INTEGER}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getNumberTimes() != null) {
            sql.SET("NUMBER_TIMES = #{numberTimes,jdbcType=INTEGER}");
        }
        
        if (record.getBettingInstSts() != null) {
            sql.SET("BETTING_INST_STS = #{bettingInstSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingBonusSts() != null) {
            sql.SET("BETTING_BONUS_STS = #{bettingBonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBettingInstAmt() != null) {
            sql.SET("BETTING_INST_AMT = #{bettingInstAmt,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{orderNo,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("BETTING_INST_ID = #{bettingInstId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdBettingInstExample example, boolean includeExamplePhrase) {
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