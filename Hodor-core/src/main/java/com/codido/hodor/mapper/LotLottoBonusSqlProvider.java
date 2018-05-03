package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLottoBonus;
import com.codido.hodor.model.LotLottoBonusExample.Criteria;
import com.codido.hodor.model.LotLottoBonusExample.Criterion;
import com.codido.hodor.model.LotLottoBonusExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotLottoBonusSqlProvider {

    public String countByExample(LotLottoBonusExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_lotto_bonus");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotLottoBonusExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_lotto_bonus");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotLottoBonus record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_lotto_bonus");
        
        if (record.getLottoId() != null) {
            sql.VALUES("LOTTO_ID", "#{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusName() != null) {
            sql.VALUES("LOTTO_BONUS_NAME", "#{lottoBonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.VALUES("LOTTO_BONUS_LEVEL", "#{lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusDesc() != null) {
            sql.VALUES("LOTTO_BONUS_DESC", "#{lottoBonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusMemo() != null) {
            sql.VALUES("LOTTO_BONUS_MEMO", "#{lottoBonusMemo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusSts() != null) {
            sql.VALUES("LOTTO_BONUS_STS", "#{lottoBonusSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotLottoBonusExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("LOTTO_BONUS_ID");
        } else {
            sql.SELECT("LOTTO_BONUS_ID");
        }
        sql.SELECT("LOTTO_ID");
        sql.SELECT("LOTTO_BONUS_NAME");
        sql.SELECT("LOTTO_BONUS_LEVEL");
        sql.SELECT("LOTTO_BONUS_DESC");
        sql.SELECT("LOTTO_BONUS_MEMO");
        sql.SELECT("LOTTO_BONUS_STS");
        sql.FROM("t_lot_lotto_bonus");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotLottoBonus record = (LotLottoBonus) parameter.get("record");
        LotLottoBonusExample example = (LotLottoBonusExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto_bonus");
        
        if (record.getLottoBonusId() != null) {
            sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusName() != null) {
            sql.SET("LOTTO_BONUS_NAME = #{record.lottoBonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.SET("LOTTO_BONUS_LEVEL = #{record.lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusDesc() != null) {
            sql.SET("LOTTO_BONUS_DESC = #{record.lottoBonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusMemo() != null) {
            sql.SET("LOTTO_BONUS_MEMO = #{record.lottoBonusMemo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusSts() != null) {
            sql.SET("LOTTO_BONUS_STS = #{record.lottoBonusSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto_bonus");
        
        sql.SET("LOTTO_BONUS_ID = #{record.lottoBonusId,jdbcType=BIGINT}");
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("LOTTO_BONUS_NAME = #{record.lottoBonusName,jdbcType=VARCHAR}");
        sql.SET("LOTTO_BONUS_LEVEL = #{record.lottoBonusLevel,jdbcType=VARCHAR}");
        sql.SET("LOTTO_BONUS_DESC = #{record.lottoBonusDesc,jdbcType=VARCHAR}");
        sql.SET("LOTTO_BONUS_MEMO = #{record.lottoBonusMemo,jdbcType=VARCHAR}");
        sql.SET("LOTTO_BONUS_STS = #{record.lottoBonusSts,jdbcType=CHAR}");
        
        LotLottoBonusExample example = (LotLottoBonusExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotLottoBonus record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto_bonus");
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoBonusName() != null) {
            sql.SET("LOTTO_BONUS_NAME = #{lottoBonusName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusLevel() != null) {
            sql.SET("LOTTO_BONUS_LEVEL = #{lottoBonusLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusDesc() != null) {
            sql.SET("LOTTO_BONUS_DESC = #{lottoBonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusMemo() != null) {
            sql.SET("LOTTO_BONUS_MEMO = #{lottoBonusMemo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBonusSts() != null) {
            sql.SET("LOTTO_BONUS_STS = #{lottoBonusSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("LOTTO_BONUS_ID = #{lottoBonusId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotLottoBonusExample example, boolean includeExamplePhrase) {
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