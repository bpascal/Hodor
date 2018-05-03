package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstBonus;
import com.codido.hodor.model.LotInstBonusExample.Criteria;
import com.codido.hodor.model.LotInstBonusExample.Criterion;
import com.codido.hodor.model.LotInstBonusExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotInstBonusSqlProvider {

    public String countByExample(LotInstBonusExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_inst_bonus");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotInstBonusExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_inst_bonus");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotInstBonus record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_inst_bonus");
        
        if (record.getLottoInstId() != null) {
            sql.VALUES("LOTTO_INST_ID", "#{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.VALUES("LOTTO_BONUS_ID", "#{lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getBonusName() != null) {
            sql.VALUES("BONUS_NAME", "#{bonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusLevel() != null) {
            sql.VALUES("BONUS_LEVEL", "#{bonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusCount() != null) {
            sql.VALUES("BONUS_COUNT", "#{bonusCount,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPreAmt() != null) {
            sql.VALUES("BONUS_PRE_AMT", "#{bonusPreAmt,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotInstBonusExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("BONUS_ID");
        } else {
            sql.SELECT("BONUS_ID");
        }
        sql.SELECT("LOTTO_INST_ID");
        sql.SELECT("LOTTO_BONUS_ID");
        sql.SELECT("BONUS_NAME");
        sql.SELECT("BONUS_LEVEL");
        sql.SELECT("BONUS_COUNT");
        sql.SELECT("BONUS_PRE_AMT");
        sql.FROM("t_lot_inst_bonus");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotInstBonus record = (LotInstBonus) parameter.get("record");
        LotInstBonusExample example = (LotInstBonusExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_bonus");
        
        if (record.getBonusId() != null) {
            sql.SET("BONUS_ID = #{record.bonusId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getBonusName() != null) {
            sql.SET("BONUS_NAME = #{record.bonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusLevel() != null) {
            sql.SET("BONUS_LEVEL = #{record.bonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusCount() != null) {
            sql.SET("BONUS_COUNT = #{record.bonusCount,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPreAmt() != null) {
            sql.SET("BONUS_PRE_AMT = #{record.bonusPreAmt,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_bonus");
        
        sql.SET("BONUS_ID = #{record.bonusId,jdbcType=BIGINT}");
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        sql.SET("BONUS_NAME = #{record.bonusName,jdbcType=VARCHAR}");
        sql.SET("BONUS_LEVEL = #{record.bonusLevel,jdbcType=VARCHAR}");
        sql.SET("BONUS_COUNT = #{record.bonusCount,jdbcType=VARCHAR}");
        sql.SET("BONUS_PRE_AMT = #{record.bonusPreAmt,jdbcType=VARCHAR}");
        
        LotInstBonusExample example = (LotInstBonusExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotInstBonus record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_bonus");
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusId() != null) {
            sql.SET("LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getBonusName() != null) {
            sql.SET("BONUS_NAME = #{bonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusLevel() != null) {
            sql.SET("BONUS_LEVEL = #{bonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusCount() != null) {
            sql.SET("BONUS_COUNT = #{bonusCount,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPreAmt() != null) {
            sql.SET("BONUS_PRE_AMT = #{bonusPreAmt,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("BONUS_ID = #{bonusId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotInstBonusExample example, boolean includeExamplePhrase) {
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