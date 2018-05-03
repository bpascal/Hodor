package com.codido.hodor.mapper;

import com.codido.hodor.model.LotMatch;
import com.codido.hodor.model.LotMatchExample.Criteria;
import com.codido.hodor.model.LotMatchExample.Criterion;
import com.codido.hodor.model.LotMatchExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotMatchSqlProvider {

    public String countByExample(LotMatchExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotMatchExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_match");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotMatch record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_match");
        
        if (record.getMatchName() != null) {
            sql.VALUES("MATCH_NAME", "#{matchName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchCode() != null) {
            sql.VALUES("MATCH_CODE", "#{matchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOutMatchId() != null) {
            sql.VALUES("OUT_MATCH_ID", "#{outMatchId,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchType() != null) {
            sql.VALUES("MATCH_TYPE", "#{matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueCode() != null) {
            sql.VALUES("MATCH_LEAGUE_CODE", "#{matchLeagueCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueName() != null) {
            sql.VALUES("MATCH_LEAGUE_NAME", "#{matchLeagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueIconUrl() != null) {
            sql.VALUES("MATCH_LEAGUE_ICON_URL", "#{matchLeagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchTime() != null) {
            sql.VALUES("MATCH_TIME", "#{matchTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchSts() != null) {
            sql.VALUES("MATCH_STS", "#{matchSts,jdbcType=CHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.VALUES("HOME_TEAM_ID", "#{homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getHomeTeamName() != null) {
            sql.VALUES("HOME_TEAM_NAME", "#{homeTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamIconUrl() != null) {
            sql.VALUES("HOME_TEAM_ICON_URL", "#{homeTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.VALUES("GUEST_TEAM_ID", "#{guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamName() != null) {
            sql.VALUES("GUEST_TEAM_NAME", "#{guestTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamIconUrl() != null) {
            sql.VALUES("GUEST_TEAM_ICON_URL", "#{guestTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeWinOdds() != null) {
            sql.VALUES("HOME_WIN_ODDS", "#{homeWinOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeLostOdds() != null) {
            sql.VALUES("HOME_LOST_ODDS", "#{homeLostOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeDrawOdds() != null) {
            sql.VALUES("HOME_DRAW_ODDS", "#{homeDrawOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchResult() != null) {
            sql.VALUES("MATCH_RESULT", "#{matchResult,jdbcType=CHAR}");
        }
        
        if (record.getHalfTimeScore() != null) {
            sql.VALUES("HALF_TIME_SCORE", "#{halfTimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchScore() != null) {
            sql.VALUES("MATCH_SCORE", "#{matchScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoId() != null) {
            sql.VALUES("MATCH_INFO_ID", "#{matchInfoId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotMatchExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("MATCH_ID");
        } else {
            sql.SELECT("MATCH_ID");
        }
        sql.SELECT("MATCH_NAME");
        sql.SELECT("MATCH_CODE");
        sql.SELECT("OUT_MATCH_ID");
        sql.SELECT("MATCH_TYPE");
        sql.SELECT("MATCH_LEAGUE_CODE");
        sql.SELECT("MATCH_LEAGUE_NAME");
        sql.SELECT("MATCH_LEAGUE_ICON_URL");
        sql.SELECT("MATCH_TIME");
        sql.SELECT("MATCH_STS");
        sql.SELECT("HOME_TEAM_ID");
        sql.SELECT("HOME_TEAM_NAME");
        sql.SELECT("HOME_TEAM_ICON_URL");
        sql.SELECT("GUEST_TEAM_ID");
        sql.SELECT("GUEST_TEAM_NAME");
        sql.SELECT("GUEST_TEAM_ICON_URL");
        sql.SELECT("HOME_WIN_ODDS");
        sql.SELECT("HOME_LOST_ODDS");
        sql.SELECT("HOME_DRAW_ODDS");
        sql.SELECT("MATCH_RESULT");
        sql.SELECT("HALF_TIME_SCORE");
        sql.SELECT("MATCH_SCORE");
        sql.SELECT("MATCH_INFO_ID");
        sql.FROM("t_lot_match");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotMatch record = (LotMatch) parameter.get("record");
        LotMatchExample example = (LotMatchExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_match");
        
        if (record.getMatchId() != null) {
            sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchName() != null) {
            sql.SET("MATCH_NAME = #{record.matchName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchCode() != null) {
            sql.SET("MATCH_CODE = #{record.matchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOutMatchId() != null) {
            sql.SET("OUT_MATCH_ID = #{record.outMatchId,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchType() != null) {
            sql.SET("MATCH_TYPE = #{record.matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueCode() != null) {
            sql.SET("MATCH_LEAGUE_CODE = #{record.matchLeagueCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueName() != null) {
            sql.SET("MATCH_LEAGUE_NAME = #{record.matchLeagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueIconUrl() != null) {
            sql.SET("MATCH_LEAGUE_ICON_URL = #{record.matchLeagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchTime() != null) {
            sql.SET("MATCH_TIME = #{record.matchTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchSts() != null) {
            sql.SET("MATCH_STS = #{record.matchSts,jdbcType=CHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.SET("HOME_TEAM_ID = #{record.homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getHomeTeamName() != null) {
            sql.SET("HOME_TEAM_NAME = #{record.homeTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamIconUrl() != null) {
            sql.SET("HOME_TEAM_ICON_URL = #{record.homeTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.SET("GUEST_TEAM_ID = #{record.guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamName() != null) {
            sql.SET("GUEST_TEAM_NAME = #{record.guestTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamIconUrl() != null) {
            sql.SET("GUEST_TEAM_ICON_URL = #{record.guestTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeWinOdds() != null) {
            sql.SET("HOME_WIN_ODDS = #{record.homeWinOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeLostOdds() != null) {
            sql.SET("HOME_LOST_ODDS = #{record.homeLostOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeDrawOdds() != null) {
            sql.SET("HOME_DRAW_ODDS = #{record.homeDrawOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchResult() != null) {
            sql.SET("MATCH_RESULT = #{record.matchResult,jdbcType=CHAR}");
        }
        
        if (record.getHalfTimeScore() != null) {
            sql.SET("HALF_TIME_SCORE = #{record.halfTimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchScore() != null) {
            sql.SET("MATCH_SCORE = #{record.matchScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoId() != null) {
            sql.SET("MATCH_INFO_ID = #{record.matchInfoId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_match");
        
        sql.SET("MATCH_ID = #{record.matchId,jdbcType=BIGINT}");
        sql.SET("MATCH_NAME = #{record.matchName,jdbcType=VARCHAR}");
        sql.SET("MATCH_CODE = #{record.matchCode,jdbcType=VARCHAR}");
        sql.SET("OUT_MATCH_ID = #{record.outMatchId,jdbcType=VARCHAR}");
        sql.SET("MATCH_TYPE = #{record.matchType,jdbcType=VARCHAR}");
        sql.SET("MATCH_LEAGUE_CODE = #{record.matchLeagueCode,jdbcType=VARCHAR}");
        sql.SET("MATCH_LEAGUE_NAME = #{record.matchLeagueName,jdbcType=VARCHAR}");
        sql.SET("MATCH_LEAGUE_ICON_URL = #{record.matchLeagueIconUrl,jdbcType=VARCHAR}");
        sql.SET("MATCH_TIME = #{record.matchTime,jdbcType=TIMESTAMP}");
        sql.SET("MATCH_STS = #{record.matchSts,jdbcType=CHAR}");
        sql.SET("HOME_TEAM_ID = #{record.homeTeamId,jdbcType=BIGINT}");
        sql.SET("HOME_TEAM_NAME = #{record.homeTeamName,jdbcType=VARCHAR}");
        sql.SET("HOME_TEAM_ICON_URL = #{record.homeTeamIconUrl,jdbcType=VARCHAR}");
        sql.SET("GUEST_TEAM_ID = #{record.guestTeamId,jdbcType=BIGINT}");
        sql.SET("GUEST_TEAM_NAME = #{record.guestTeamName,jdbcType=VARCHAR}");
        sql.SET("GUEST_TEAM_ICON_URL = #{record.guestTeamIconUrl,jdbcType=VARCHAR}");
        sql.SET("HOME_WIN_ODDS = #{record.homeWinOdds,jdbcType=VARCHAR}");
        sql.SET("HOME_LOST_ODDS = #{record.homeLostOdds,jdbcType=VARCHAR}");
        sql.SET("HOME_DRAW_ODDS = #{record.homeDrawOdds,jdbcType=VARCHAR}");
        sql.SET("MATCH_RESULT = #{record.matchResult,jdbcType=CHAR}");
        sql.SET("HALF_TIME_SCORE = #{record.halfTimeScore,jdbcType=VARCHAR}");
        sql.SET("MATCH_SCORE = #{record.matchScore,jdbcType=VARCHAR}");
        sql.SET("MATCH_INFO_ID = #{record.matchInfoId,jdbcType=BIGINT}");
        
        LotMatchExample example = (LotMatchExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotMatch record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_match");
        
        if (record.getMatchName() != null) {
            sql.SET("MATCH_NAME = #{matchName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchCode() != null) {
            sql.SET("MATCH_CODE = #{matchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOutMatchId() != null) {
            sql.SET("OUT_MATCH_ID = #{outMatchId,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchType() != null) {
            sql.SET("MATCH_TYPE = #{matchType,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueCode() != null) {
            sql.SET("MATCH_LEAGUE_CODE = #{matchLeagueCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueName() != null) {
            sql.SET("MATCH_LEAGUE_NAME = #{matchLeagueName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLeagueIconUrl() != null) {
            sql.SET("MATCH_LEAGUE_ICON_URL = #{matchLeagueIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchTime() != null) {
            sql.SET("MATCH_TIME = #{matchTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchSts() != null) {
            sql.SET("MATCH_STS = #{matchSts,jdbcType=CHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.SET("HOME_TEAM_ID = #{homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getHomeTeamName() != null) {
            sql.SET("HOME_TEAM_NAME = #{homeTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamIconUrl() != null) {
            sql.SET("HOME_TEAM_ICON_URL = #{homeTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.SET("GUEST_TEAM_ID = #{guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamName() != null) {
            sql.SET("GUEST_TEAM_NAME = #{guestTeamName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuestTeamIconUrl() != null) {
            sql.SET("GUEST_TEAM_ICON_URL = #{guestTeamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeWinOdds() != null) {
            sql.SET("HOME_WIN_ODDS = #{homeWinOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeLostOdds() != null) {
            sql.SET("HOME_LOST_ODDS = #{homeLostOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeDrawOdds() != null) {
            sql.SET("HOME_DRAW_ODDS = #{homeDrawOdds,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchResult() != null) {
            sql.SET("MATCH_RESULT = #{matchResult,jdbcType=CHAR}");
        }
        
        if (record.getHalfTimeScore() != null) {
            sql.SET("HALF_TIME_SCORE = #{halfTimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchScore() != null) {
            sql.SET("MATCH_SCORE = #{matchScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoId() != null) {
            sql.SET("MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("MATCH_ID = #{matchId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotMatchExample example, boolean includeExamplePhrase) {
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