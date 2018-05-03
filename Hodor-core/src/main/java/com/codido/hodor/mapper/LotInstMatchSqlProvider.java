package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstMatch;
import com.codido.hodor.model.LotInstMatchExample.Criteria;
import com.codido.hodor.model.LotInstMatchExample.Criterion;
import com.codido.hodor.model.LotInstMatchExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotInstMatchSqlProvider {

    public String countByExample(LotInstMatchExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_inst_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotInstMatchExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_inst_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotInstMatch record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_inst_match");
        
        if (record.getLottoInstId() != null) {
            sql.VALUES("LOTTO_INST_ID", "#{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.VALUES("MATCH_ID", "#{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchSort() != null) {
            sql.VALUES("MATCH_SORT", "#{matchSort,jdbcType=INTEGER}");
        }
        
        if (record.getLotInstMatchSts() != null) {
            sql.VALUES("LOT_INST_MATCH_STS", "#{lotInstMatchSts,jdbcType=CHAR}");
        }
        
        if (record.getLotInstMatchResult() != null) {
            sql.VALUES("LOT_INST_MATCH_RESULT", "#{lotInstMatchResult,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotInstMatchExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("LOT_INST_MATCH_ID");
        } else {
            sql.SELECT("LOT_INST_MATCH_ID");
        }
        sql.SELECT("LOTTO_INST_ID");
        sql.SELECT("MATCH_ID");
        sql.SELECT("MATCH_SORT");
        sql.SELECT("LOT_INST_MATCH_STS");
        sql.SELECT("LOT_INST_MATCH_RESULT");
        sql.FROM("t_lot_inst_match");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotInstMatch record = (LotInstMatch) parameter.get("record");
        LotInstMatchExample example = (LotInstMatchExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_match");
        
        if (record.getLotInstMatchId() != null) {
            sql.SET("LOT_INST_MATCH_ID = #{record.lotInstMatchId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchSort() != null) {
            sql.SET("MATCH_SORT = #{record.matchSort,jdbcType=INTEGER}");
        }
        
        if (record.getLotInstMatchSts() != null) {
            sql.SET("LOT_INST_MATCH_STS = #{record.lotInstMatchSts,jdbcType=CHAR}");
        }
        
        if (record.getLotInstMatchResult() != null) {
            sql.SET("LOT_INST_MATCH_RESULT = #{record.lotInstMatchResult,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_match");
        
        sql.SET("LOT_INST_MATCH_ID = #{record.lotInstMatchId,jdbcType=BIGINT}");
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        sql.SET("MATCH_SORT = #{record.matchSort,jdbcType=INTEGER}");
        sql.SET("LOT_INST_MATCH_STS = #{record.lotInstMatchSts,jdbcType=CHAR}");
        sql.SET("LOT_INST_MATCH_RESULT = #{record.lotInstMatchResult,jdbcType=CHAR}");
        
        LotInstMatchExample example = (LotInstMatchExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotInstMatch record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_inst_match");
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchSort() != null) {
            sql.SET("MATCH_SORT = #{matchSort,jdbcType=INTEGER}");
        }
        
        if (record.getLotInstMatchSts() != null) {
            sql.SET("LOT_INST_MATCH_STS = #{lotInstMatchSts,jdbcType=CHAR}");
        }
        
        if (record.getLotInstMatchResult() != null) {
            sql.SET("LOT_INST_MATCH_RESULT = #{lotInstMatchResult,jdbcType=CHAR}");
        }
        
        sql.WHERE("LOT_INST_MATCH_ID = #{lotInstMatchId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotInstMatchExample example, boolean includeExamplePhrase) {
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