package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInst;
import com.codido.hodor.model.LotInstExample.Criteria;
import com.codido.hodor.model.LotInstExample.Criterion;
import com.codido.hodor.model.LotInstExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotInstSqlProvider {

    public String countByExample(LotInstExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotInstExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_inst");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotInst record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_inst");
        
        if (record.getLottoId() != null) {
            sql.VALUES("LOTTO_ID", "#{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.VALUES("PERIOD_NAME", "#{periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBeginTime() != null) {
            sql.VALUES("PERIOD_BEGIN_TIME", "#{periodBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodEndTime() != null) {
            sql.VALUES("PERIOD_END_TIME", "#{periodEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodBonusTime() != null) {
            sql.VALUES("PERIOD_BONUS_TIME", "#{periodBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodSts() != null) {
            sql.VALUES("PERIOD_STS", "#{periodSts,jdbcType=CHAR}");
        }
        
        if (record.getPeriodTags() != null) {
            sql.VALUES("PERIOD_TAGS", "#{periodTags,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTagsName() != null) {
            sql.VALUES("PERIOD_TAGS_NAME", "#{periodTagsName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBonusNumber() != null) {
            sql.VALUES("PERIOD_BONUS_NUMBER", "#{periodBonusNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalSell() != null) {
            sql.VALUES("PERIOD_TOTAL_SELL", "#{periodTotalSell,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonus() != null) {
            sql.VALUES("PERIOD_TOTAL_BONUS", "#{periodTotalBonus,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonusDesc() != null) {
            sql.VALUES("PERIOD_TOTAL_BONUS_DESC", "#{periodTotalBonusDesc,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotInstExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("LOTTO_INST_ID");
        } else {
            sql.SELECT("LOTTO_INST_ID");
        }
        sql.SELECT("LOTTO_ID");
        sql.SELECT("PERIOD_NAME");
        sql.SELECT("PERIOD_BEGIN_TIME");
        sql.SELECT("PERIOD_END_TIME");
        sql.SELECT("PERIOD_BONUS_TIME");
        sql.SELECT("PERIOD_STS");
        sql.SELECT("PERIOD_TAGS");
        sql.SELECT("PERIOD_TAGS_NAME");
        sql.SELECT("PERIOD_BONUS_NUMBER");
        sql.SELECT("PERIOD_TOTAL_SELL");
        sql.SELECT("PERIOD_TOTAL_BONUS");
        sql.SELECT("PERIOD_TOTAL_BONUS_DESC");
        sql.FROM("t_lot_inst");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotInst record = (LotInst) parameter.get("record");
        LotInstExample example = (LotInstExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst");
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.SET("PERIOD_NAME = #{record.periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBeginTime() != null) {
            sql.SET("PERIOD_BEGIN_TIME = #{record.periodBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodEndTime() != null) {
            sql.SET("PERIOD_END_TIME = #{record.periodEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodBonusTime() != null) {
            sql.SET("PERIOD_BONUS_TIME = #{record.periodBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodSts() != null) {
            sql.SET("PERIOD_STS = #{record.periodSts,jdbcType=CHAR}");
        }
        
        if (record.getPeriodTags() != null) {
            sql.SET("PERIOD_TAGS = #{record.periodTags,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTagsName() != null) {
            sql.SET("PERIOD_TAGS_NAME = #{record.periodTagsName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBonusNumber() != null) {
            sql.SET("PERIOD_BONUS_NUMBER = #{record.periodBonusNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalSell() != null) {
            sql.SET("PERIOD_TOTAL_SELL = #{record.periodTotalSell,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonus() != null) {
            sql.SET("PERIOD_TOTAL_BONUS = #{record.periodTotalBonus,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonusDesc() != null) {
            sql.SET("PERIOD_TOTAL_BONUS_DESC = #{record.periodTotalBonusDesc,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst");
        
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("PERIOD_NAME = #{record.periodName,jdbcType=VARCHAR}");
        sql.SET("PERIOD_BEGIN_TIME = #{record.periodBeginTime,jdbcType=TIMESTAMP}");
        sql.SET("PERIOD_END_TIME = #{record.periodEndTime,jdbcType=TIMESTAMP}");
        sql.SET("PERIOD_BONUS_TIME = #{record.periodBonusTime,jdbcType=TIMESTAMP}");
        sql.SET("PERIOD_STS = #{record.periodSts,jdbcType=CHAR}");
        sql.SET("PERIOD_TAGS = #{record.periodTags,jdbcType=VARCHAR}");
        sql.SET("PERIOD_TAGS_NAME = #{record.periodTagsName,jdbcType=VARCHAR}");
        sql.SET("PERIOD_BONUS_NUMBER = #{record.periodBonusNumber,jdbcType=VARCHAR}");
        sql.SET("PERIOD_TOTAL_SELL = #{record.periodTotalSell,jdbcType=VARCHAR}");
        sql.SET("PERIOD_TOTAL_BONUS = #{record.periodTotalBonus,jdbcType=VARCHAR}");
        sql.SET("PERIOD_TOTAL_BONUS_DESC = #{record.periodTotalBonusDesc,jdbcType=VARCHAR}");
        
        LotInstExample example = (LotInstExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotInst record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst");
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPeriodName() != null) {
            sql.SET("PERIOD_NAME = #{periodName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBeginTime() != null) {
            sql.SET("PERIOD_BEGIN_TIME = #{periodBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodEndTime() != null) {
            sql.SET("PERIOD_END_TIME = #{periodEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodBonusTime() != null) {
            sql.SET("PERIOD_BONUS_TIME = #{periodBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodSts() != null) {
            sql.SET("PERIOD_STS = #{periodSts,jdbcType=CHAR}");
        }
        
        if (record.getPeriodTags() != null) {
            sql.SET("PERIOD_TAGS = #{periodTags,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTagsName() != null) {
            sql.SET("PERIOD_TAGS_NAME = #{periodTagsName,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodBonusNumber() != null) {
            sql.SET("PERIOD_BONUS_NUMBER = #{periodBonusNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalSell() != null) {
            sql.SET("PERIOD_TOTAL_SELL = #{periodTotalSell,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonus() != null) {
            sql.SET("PERIOD_TOTAL_BONUS = #{periodTotalBonus,jdbcType=VARCHAR}");
        }
        
        if (record.getPeriodTotalBonusDesc() != null) {
            sql.SET("PERIOD_TOTAL_BONUS_DESC = #{periodTotalBonusDesc,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotInstExample example, boolean includeExamplePhrase) {
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