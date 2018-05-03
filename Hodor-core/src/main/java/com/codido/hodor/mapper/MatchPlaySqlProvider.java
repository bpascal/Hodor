package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlay;
import com.codido.hodor.model.MatchPlayExample.Criteria;
import com.codido.hodor.model.MatchPlayExample.Criterion;
import com.codido.hodor.model.MatchPlayExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchPlaySqlProvider {

    public String countByExample(MatchPlayExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_play");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchPlayExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_play");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchPlay record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_play");
        
        if (record.getPlayName() != null) {
            sql.VALUES("PLAY_NAME", "#{playName,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayLottoId() != null) {
            sql.VALUES("PLAY_LOTTO_ID", "#{playLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayCode() != null) {
            sql.VALUES("PLAY_CODE", "#{playCode,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchPlayExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("MATCH_PLAY_ID");
        } else {
            sql.SELECT("MATCH_PLAY_ID");
        }
        sql.SELECT("PLAY_NAME");
        sql.SELECT("PLAY_LOTTO_ID");
        sql.SELECT("PLAY_CODE");
        sql.FROM("t_match_play");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchPlay record = (MatchPlay) parameter.get("record");
        MatchPlayExample example = (MatchPlayExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_play");
        
        if (record.getMatchPlayId() != null) {
            sql.SET("MATCH_PLAY_ID = #{record.matchPlayId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayName() != null) {
            sql.SET("PLAY_NAME = #{record.playName,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayLottoId() != null) {
            sql.SET("PLAY_LOTTO_ID = #{record.playLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayCode() != null) {
            sql.SET("PLAY_CODE = #{record.playCode,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_play");
        
        sql.SET("MATCH_PLAY_ID = #{record.matchPlayId,jdbcType=BIGINT}");
        sql.SET("PLAY_NAME = #{record.playName,jdbcType=VARCHAR}");
        sql.SET("PLAY_LOTTO_ID = #{record.playLottoId,jdbcType=BIGINT}");
        sql.SET("PLAY_CODE = #{record.playCode,jdbcType=VARCHAR}");
        
        MatchPlayExample example = (MatchPlayExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchPlay record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_play");
        
        if (record.getPlayName() != null) {
            sql.SET("PLAY_NAME = #{playName,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayLottoId() != null) {
            sql.SET("PLAY_LOTTO_ID = #{playLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayCode() != null) {
            sql.SET("PLAY_CODE = #{playCode,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("MATCH_PLAY_ID = #{matchPlayId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchPlayExample example, boolean includeExamplePhrase) {
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