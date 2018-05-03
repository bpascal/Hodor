package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchSeason;
import com.codido.hodor.model.MatchSeasonExample.Criteria;
import com.codido.hodor.model.MatchSeasonExample.Criterion;
import com.codido.hodor.model.MatchSeasonExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchSeasonSqlProvider {

    public String countByExample(MatchSeasonExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_season");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchSeasonExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_season");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchSeason record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_season");
        
        if (record.getLeagueId() != null) {
            sql.VALUES("LEAGUE_ID", "#{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonName() != null) {
            sql.VALUES("SEASON_NAME", "#{seasonName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonIconUrl() != null) {
            sql.VALUES("SEASON_ICON_URL", "#{seasonIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRoundId() != null) {
            sql.VALUES("CURRENT_ROUND_ID", "#{currentRoundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonBeginTime() != null) {
            sql.VALUES("SEASON_BEGIN_TIME", "#{seasonBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonEndTime() != null) {
            sql.VALUES("SEASON_END_TIME", "#{seasonEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonSts() != null) {
            sql.VALUES("SEASON_STS", "#{seasonSts,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchSeasonExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SEASON_ID");
        } else {
            sql.SELECT("SEASON_ID");
        }
        sql.SELECT("LEAGUE_ID");
        sql.SELECT("SEASON_NAME");
        sql.SELECT("SEASON_ICON_URL");
        sql.SELECT("CURRENT_ROUND_ID");
        sql.SELECT("SEASON_BEGIN_TIME");
        sql.SELECT("SEASON_END_TIME");
        sql.SELECT("SEASON_STS");
        sql.FROM("t_match_season");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchSeason record = (MatchSeason) parameter.get("record");
        MatchSeasonExample example = (MatchSeasonExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_season");
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonName() != null) {
            sql.SET("SEASON_NAME = #{record.seasonName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonIconUrl() != null) {
            sql.SET("SEASON_ICON_URL = #{record.seasonIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRoundId() != null) {
            sql.SET("CURRENT_ROUND_ID = #{record.currentRoundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonBeginTime() != null) {
            sql.SET("SEASON_BEGIN_TIME = #{record.seasonBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonEndTime() != null) {
            sql.SET("SEASON_END_TIME = #{record.seasonEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonSts() != null) {
            sql.SET("SEASON_STS = #{record.seasonSts,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_season");
        
        sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        sql.SET("SEASON_NAME = #{record.seasonName,jdbcType=VARCHAR}");
        sql.SET("SEASON_ICON_URL = #{record.seasonIconUrl,jdbcType=VARCHAR}");
        sql.SET("CURRENT_ROUND_ID = #{record.currentRoundId,jdbcType=BIGINT}");
        sql.SET("SEASON_BEGIN_TIME = #{record.seasonBeginTime,jdbcType=TIMESTAMP}");
        sql.SET("SEASON_END_TIME = #{record.seasonEndTime,jdbcType=TIMESTAMP}");
        sql.SET("SEASON_STS = #{record.seasonSts,jdbcType=VARCHAR}");
        
        MatchSeasonExample example = (MatchSeasonExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchSeason record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_season");
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonName() != null) {
            sql.SET("SEASON_NAME = #{seasonName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonIconUrl() != null) {
            sql.SET("SEASON_ICON_URL = #{seasonIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRoundId() != null) {
            sql.SET("CURRENT_ROUND_ID = #{currentRoundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonBeginTime() != null) {
            sql.SET("SEASON_BEGIN_TIME = #{seasonBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonEndTime() != null) {
            sql.SET("SEASON_END_TIME = #{seasonEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeasonSts() != null) {
            sql.SET("SEASON_STS = #{seasonSts,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SEASON_ID = #{seasonId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchSeasonExample example, boolean includeExamplePhrase) {
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