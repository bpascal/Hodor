package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchTeamSeasonRela;
import com.codido.hodor.model.MatchTeamSeasonRelaExample.Criteria;
import com.codido.hodor.model.MatchTeamSeasonRelaExample.Criterion;
import com.codido.hodor.model.MatchTeamSeasonRelaExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchTeamSeasonRelaSqlProvider {

    public String countByExample(MatchTeamSeasonRelaExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_team_season_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchTeamSeasonRelaExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_team_season_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchTeamSeasonRela record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_team_season_rela");
        
        if (record.getTeamId() != null) {
            sql.VALUES("TEAM_ID", "#{teamId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.VALUES("SEASON_ID", "#{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.VALUES("LEAGUE_ID", "#{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getRelaSts() != null) {
            sql.VALUES("RELA_STS", "#{relaSts,jdbcType=CHAR}");
        }
        
        if (record.getTeamSort() != null) {
            sql.VALUES("TEAM_SORT", "#{teamSort,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScore() != null) {
            sql.VALUES("TEAM_SCORE", "#{teamScore,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScoreUpdateTime() != null) {
            sql.VALUES("TEAM_SCORE_UPDATE_TIME", "#{teamScoreUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchTeamSeasonRelaExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("T_S_RELA_ID");
        } else {
            sql.SELECT("T_S_RELA_ID");
        }
        sql.SELECT("TEAM_ID");
        sql.SELECT("SEASON_ID");
        sql.SELECT("LEAGUE_ID");
        sql.SELECT("RELA_STS");
        sql.SELECT("TEAM_SORT");
        sql.SELECT("TEAM_SCORE");
        sql.SELECT("TEAM_SCORE_UPDATE_TIME");
        sql.FROM("t_match_team_season_rela");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchTeamSeasonRela record = (MatchTeamSeasonRela) parameter.get("record");
        MatchTeamSeasonRelaExample example = (MatchTeamSeasonRelaExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_team_season_rela");
        
        if (record.gettSRelaId() != null) {
            sql.SET("T_S_RELA_ID = #{record.tSRelaId,jdbcType=BIGINT}");
        }
        
        if (record.getTeamId() != null) {
            sql.SET("TEAM_ID = #{record.teamId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getRelaSts() != null) {
            sql.SET("RELA_STS = #{record.relaSts,jdbcType=CHAR}");
        }
        
        if (record.getTeamSort() != null) {
            sql.SET("TEAM_SORT = #{record.teamSort,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScore() != null) {
            sql.SET("TEAM_SCORE = #{record.teamScore,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScoreUpdateTime() != null) {
            sql.SET("TEAM_SCORE_UPDATE_TIME = #{record.teamScoreUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_team_season_rela");
        
        sql.SET("T_S_RELA_ID = #{record.tSRelaId,jdbcType=BIGINT}");
        sql.SET("TEAM_ID = #{record.teamId,jdbcType=BIGINT}");
        sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        sql.SET("RELA_STS = #{record.relaSts,jdbcType=CHAR}");
        sql.SET("TEAM_SORT = #{record.teamSort,jdbcType=INTEGER}");
        sql.SET("TEAM_SCORE = #{record.teamScore,jdbcType=INTEGER}");
        sql.SET("TEAM_SCORE_UPDATE_TIME = #{record.teamScoreUpdateTime,jdbcType=TIMESTAMP}");
        
        MatchTeamSeasonRelaExample example = (MatchTeamSeasonRelaExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchTeamSeasonRela record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_team_season_rela");
        
        if (record.getTeamId() != null) {
            sql.SET("TEAM_ID = #{teamId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getRelaSts() != null) {
            sql.SET("RELA_STS = #{relaSts,jdbcType=CHAR}");
        }
        
        if (record.getTeamSort() != null) {
            sql.SET("TEAM_SORT = #{teamSort,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScore() != null) {
            sql.SET("TEAM_SCORE = #{teamScore,jdbcType=INTEGER}");
        }
        
        if (record.getTeamScoreUpdateTime() != null) {
            sql.SET("TEAM_SCORE_UPDATE_TIME = #{teamScoreUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("T_S_RELA_ID = #{tSRelaId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchTeamSeasonRelaExample example, boolean includeExamplePhrase) {
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