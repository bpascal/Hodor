package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchLeague;
import com.codido.hodor.model.MatchLeagueExample.Criteria;
import com.codido.hodor.model.MatchLeagueExample.Criterion;
import com.codido.hodor.model.MatchLeagueExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchLeagueSqlProvider {

    public String countByExample(MatchLeagueExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_league");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchLeagueExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_league");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchLeague record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_league");
        
        if (record.getLeagueName() != null) {
            sql.VALUES("LEAGUE_NAME", "#{leagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueShotName() != null) {
            sql.VALUES("LEAGUE_SHOT_NAME", "#{leagueShotName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueDesc() != null) {
            sql.VALUES("LEAGUE_DESC", "#{leagueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueIconUrl() != null) {
            sql.VALUES("LEAGUE_ICON_URL", "#{leagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueType() != null) {
            sql.VALUES("LEAGUE_TYPE", "#{leagueType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSportType() != null) {
            sql.VALUES("LEAGUE_SPORT_TYPE", "#{leagueSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSts() != null) {
            sql.VALUES("LEAGUE_STS", "#{leagueSts,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchLeagueExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("LEAGUE_ID");
        } else {
            sql.SELECT("LEAGUE_ID");
        }
        sql.SELECT("LEAGUE_NAME");
        sql.SELECT("LEAGUE_SHOT_NAME");
        sql.SELECT("LEAGUE_DESC");
        sql.SELECT("LEAGUE_ICON_URL");
        sql.SELECT("LEAGUE_TYPE");
        sql.SELECT("LEAGUE_SPORT_TYPE");
        sql.SELECT("LEAGUE_STS");
        sql.FROM("t_match_league");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchLeague record = (MatchLeague) parameter.get("record");
        MatchLeagueExample example = (MatchLeagueExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_league");
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueName() != null) {
            sql.SET("LEAGUE_NAME = #{record.leagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueShotName() != null) {
            sql.SET("LEAGUE_SHOT_NAME = #{record.leagueShotName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueDesc() != null) {
            sql.SET("LEAGUE_DESC = #{record.leagueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueIconUrl() != null) {
            sql.SET("LEAGUE_ICON_URL = #{record.leagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueType() != null) {
            sql.SET("LEAGUE_TYPE = #{record.leagueType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSportType() != null) {
            sql.SET("LEAGUE_SPORT_TYPE = #{record.leagueSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSts() != null) {
            sql.SET("LEAGUE_STS = #{record.leagueSts,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_league");
        
        sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        sql.SET("LEAGUE_NAME = #{record.leagueName,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_SHOT_NAME = #{record.leagueShotName,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_DESC = #{record.leagueDesc,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_ICON_URL = #{record.leagueIconUrl,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_TYPE = #{record.leagueType,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_SPORT_TYPE = #{record.leagueSportType,jdbcType=VARCHAR}");
        sql.SET("LEAGUE_STS = #{record.leagueSts,jdbcType=CHAR}");
        
        MatchLeagueExample example = (MatchLeagueExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchLeague record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_league");
        
        if (record.getLeagueName() != null) {
            sql.SET("LEAGUE_NAME = #{leagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueShotName() != null) {
            sql.SET("LEAGUE_SHOT_NAME = #{leagueShotName,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueDesc() != null) {
            sql.SET("LEAGUE_DESC = #{leagueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueIconUrl() != null) {
            sql.SET("LEAGUE_ICON_URL = #{leagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueType() != null) {
            sql.SET("LEAGUE_TYPE = #{leagueType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSportType() != null) {
            sql.SET("LEAGUE_SPORT_TYPE = #{leagueSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeagueSts() != null) {
            sql.SET("LEAGUE_STS = #{leagueSts,jdbcType=CHAR}");
        }
        
        sql.WHERE("LEAGUE_ID = #{leagueId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchLeagueExample example, boolean includeExamplePhrase) {
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