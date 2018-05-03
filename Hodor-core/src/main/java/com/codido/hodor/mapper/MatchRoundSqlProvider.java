package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchRound;
import com.codido.hodor.model.MatchRoundExample.Criteria;
import com.codido.hodor.model.MatchRoundExample.Criterion;
import com.codido.hodor.model.MatchRoundExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchRoundSqlProvider {

    public String countByExample(MatchRoundExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_round");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchRoundExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_round");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchRound record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_round");
        
        if (record.getRoundId() != null) {
            sql.VALUES("ROUND_ID", "#{roundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.VALUES("SEASON_ID", "#{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundName() != null) {
            sql.VALUES("ROUND_NAME", "#{roundName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundIconUrl() != null) {
            sql.VALUES("ROUND_ICON_URL", "#{roundIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundDesc() != null) {
            sql.VALUES("ROUND_DESC", "#{roundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundBeginTime() != null) {
            sql.VALUES("ROUND_BEGIN_TIME", "#{roundBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundEndTime() != null) {
            sql.VALUES("ROUND_END_TIME", "#{roundEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundSts() != null) {
            sql.VALUES("ROUND_STS", "#{roundSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchRoundExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ROUND_ID");
        } else {
            sql.SELECT("ROUND_ID");
        }
        sql.SELECT("LEAGUE_ID");
        sql.SELECT("SEASON_ID");
        sql.SELECT("ROUND_NAME");
        sql.SELECT("ROUND_ICON_URL");
        sql.SELECT("ROUND_DESC");
        sql.SELECT("ROUND_BEGIN_TIME");
        sql.SELECT("ROUND_END_TIME");
        sql.SELECT("ROUND_STS");
        sql.FROM("t_match_round");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchRound record = (MatchRound) parameter.get("record");
        MatchRoundExample example = (MatchRoundExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_round");
        
        if (record.getRoundId() != null) {
            sql.SET("ROUND_ID = #{record.roundId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundName() != null) {
            sql.SET("ROUND_NAME = #{record.roundName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundIconUrl() != null) {
            sql.SET("ROUND_ICON_URL = #{record.roundIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundDesc() != null) {
            sql.SET("ROUND_DESC = #{record.roundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundBeginTime() != null) {
            sql.SET("ROUND_BEGIN_TIME = #{record.roundBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundEndTime() != null) {
            sql.SET("ROUND_END_TIME = #{record.roundEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundSts() != null) {
            sql.SET("ROUND_STS = #{record.roundSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_round");
        
        sql.SET("ROUND_ID = #{record.roundId,jdbcType=BIGINT}");
        sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        sql.SET("ROUND_NAME = #{record.roundName,jdbcType=VARCHAR}");
        sql.SET("ROUND_ICON_URL = #{record.roundIconUrl,jdbcType=VARCHAR}");
        sql.SET("ROUND_DESC = #{record.roundDesc,jdbcType=VARCHAR}");
        sql.SET("ROUND_BEGIN_TIME = #{record.roundBeginTime,jdbcType=TIMESTAMP}");
        sql.SET("ROUND_END_TIME = #{record.roundEndTime,jdbcType=TIMESTAMP}");
        sql.SET("ROUND_STS = #{record.roundSts,jdbcType=CHAR}");
        
        MatchRoundExample example = (MatchRoundExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchRound record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_round");
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundName() != null) {
            sql.SET("ROUND_NAME = #{roundName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundIconUrl() != null) {
            sql.SET("ROUND_ICON_URL = #{roundIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundDesc() != null) {
            sql.SET("ROUND_DESC = #{roundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundBeginTime() != null) {
            sql.SET("ROUND_BEGIN_TIME = #{roundBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundEndTime() != null) {
            sql.SET("ROUND_END_TIME = #{roundEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoundSts() != null) {
            sql.SET("ROUND_STS = #{roundSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("ROUND_ID = #{roundId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchRoundExample example, boolean includeExamplePhrase) {
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