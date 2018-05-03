package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchInfo;
import com.codido.hodor.model.MatchInfoExample.Criteria;
import com.codido.hodor.model.MatchInfoExample.Criterion;
import com.codido.hodor.model.MatchInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchInfoSqlProvider {

    public String countByExample(MatchInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_info");
        
        if (record.getMatchInfoCode() != null) {
            sql.VALUES("MATCH_INFO_CODE", "#{matchInfoCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoName() != null) {
            sql.VALUES("MATCH_INFO_NAME", "#{matchInfoName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoIconUrl() != null) {
            sql.VALUES("MATCH_INFO_ICON_URL", "#{matchInfoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoDesc() != null) {
            sql.VALUES("MATCH_INFO_DESC", "#{matchInfoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchAddress() != null) {
            sql.VALUES("MATCH_ADDRESS", "#{matchAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchWeather() != null) {
            sql.VALUES("MATCH_WEATHER", "#{matchWeather,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.VALUES("HOME_TEAM_ID", "#{homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.VALUES("GUEST_TEAM_ID", "#{guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchBeginTime() != null) {
            sql.VALUES("MATCH_BEGIN_TIME", "#{matchBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchInfoSts() != null) {
            sql.VALUES("MATCH_INFO_STS", "#{matchInfoSts,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoResult() != null) {
            sql.VALUES("MATCH_INFO_RESULT", "#{matchInfoResult,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoScore() != null) {
            sql.VALUES("MATCH_INFO_SCORE", "#{matchInfoScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoHalftimeScore() != null) {
            sql.VALUES("MATCH_INFO_HALFTIME_SCORE", "#{matchInfoHalftimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLottoId() != null) {
            sql.VALUES("MATCH_LOTTO_ID", "#{matchLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundId() != null) {
            sql.VALUES("ROUND_ID", "#{roundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.VALUES("SEASON_ID", "#{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.VALUES("LEAGUE_ID", "#{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSportteryMatchInfoId() != null) {
            sql.VALUES("SPORTTERY_MATCH_INFO_ID", "#{sportteryMatchInfoId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("MATCH_INFO_ID");
        } else {
            sql.SELECT("MATCH_INFO_ID");
        }
        sql.SELECT("MATCH_INFO_CODE");
        sql.SELECT("MATCH_INFO_NAME");
        sql.SELECT("MATCH_INFO_ICON_URL");
        sql.SELECT("MATCH_INFO_DESC");
        sql.SELECT("MATCH_ADDRESS");
        sql.SELECT("MATCH_WEATHER");
        sql.SELECT("HOME_TEAM_ID");
        sql.SELECT("GUEST_TEAM_ID");
        sql.SELECT("MATCH_BEGIN_TIME");
        sql.SELECT("MATCH_INFO_STS");
        sql.SELECT("MATCH_INFO_RESULT");
        sql.SELECT("MATCH_INFO_SCORE");
        sql.SELECT("MATCH_INFO_HALFTIME_SCORE");
        sql.SELECT("MATCH_LOTTO_ID");
        sql.SELECT("ROUND_ID");
        sql.SELECT("SEASON_ID");
        sql.SELECT("LEAGUE_ID");
        sql.SELECT("SPORTTERY_MATCH_INFO_ID");
        sql.FROM("t_match_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchInfo record = (MatchInfo) parameter.get("record");
        MatchInfoExample example = (MatchInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_info");
        
        if (record.getMatchInfoId() != null) {
            sql.SET("MATCH_INFO_ID = #{record.matchInfoId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchInfoCode() != null) {
            sql.SET("MATCH_INFO_CODE = #{record.matchInfoCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoName() != null) {
            sql.SET("MATCH_INFO_NAME = #{record.matchInfoName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoIconUrl() != null) {
            sql.SET("MATCH_INFO_ICON_URL = #{record.matchInfoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoDesc() != null) {
            sql.SET("MATCH_INFO_DESC = #{record.matchInfoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchAddress() != null) {
            sql.SET("MATCH_ADDRESS = #{record.matchAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchWeather() != null) {
            sql.SET("MATCH_WEATHER = #{record.matchWeather,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.SET("HOME_TEAM_ID = #{record.homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.SET("GUEST_TEAM_ID = #{record.guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchBeginTime() != null) {
            sql.SET("MATCH_BEGIN_TIME = #{record.matchBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchInfoSts() != null) {
            sql.SET("MATCH_INFO_STS = #{record.matchInfoSts,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoResult() != null) {
            sql.SET("MATCH_INFO_RESULT = #{record.matchInfoResult,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoScore() != null) {
            sql.SET("MATCH_INFO_SCORE = #{record.matchInfoScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoHalftimeScore() != null) {
            sql.SET("MATCH_INFO_HALFTIME_SCORE = #{record.matchInfoHalftimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLottoId() != null) {
            sql.SET("MATCH_LOTTO_ID = #{record.matchLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundId() != null) {
            sql.SET("ROUND_ID = #{record.roundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSportteryMatchInfoId() != null) {
            sql.SET("SPORTTERY_MATCH_INFO_ID = #{record.sportteryMatchInfoId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_info");
        
        sql.SET("MATCH_INFO_ID = #{record.matchInfoId,jdbcType=BIGINT}");
        sql.SET("MATCH_INFO_CODE = #{record.matchInfoCode,jdbcType=VARCHAR}");
        sql.SET("MATCH_INFO_NAME = #{record.matchInfoName,jdbcType=VARCHAR}");
        sql.SET("MATCH_INFO_ICON_URL = #{record.matchInfoIconUrl,jdbcType=VARCHAR}");
        sql.SET("MATCH_INFO_DESC = #{record.matchInfoDesc,jdbcType=VARCHAR}");
        sql.SET("MATCH_ADDRESS = #{record.matchAddress,jdbcType=VARCHAR}");
        sql.SET("MATCH_WEATHER = #{record.matchWeather,jdbcType=VARCHAR}");
        sql.SET("HOME_TEAM_ID = #{record.homeTeamId,jdbcType=BIGINT}");
        sql.SET("GUEST_TEAM_ID = #{record.guestTeamId,jdbcType=BIGINT}");
        sql.SET("MATCH_BEGIN_TIME = #{record.matchBeginTime,jdbcType=TIMESTAMP}");
        sql.SET("MATCH_INFO_STS = #{record.matchInfoSts,jdbcType=CHAR}");
        sql.SET("MATCH_INFO_RESULT = #{record.matchInfoResult,jdbcType=CHAR}");
        sql.SET("MATCH_INFO_SCORE = #{record.matchInfoScore,jdbcType=VARCHAR}");
        sql.SET("MATCH_INFO_HALFTIME_SCORE = #{record.matchInfoHalftimeScore,jdbcType=VARCHAR}");
        sql.SET("MATCH_LOTTO_ID = #{record.matchLottoId,jdbcType=BIGINT}");
        sql.SET("ROUND_ID = #{record.roundId,jdbcType=BIGINT}");
        sql.SET("SEASON_ID = #{record.seasonId,jdbcType=BIGINT}");
        sql.SET("LEAGUE_ID = #{record.leagueId,jdbcType=BIGINT}");
        sql.SET("SPORTTERY_MATCH_INFO_ID = #{record.sportteryMatchInfoId,jdbcType=VARCHAR}");
        
        MatchInfoExample example = (MatchInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_info");
        
        if (record.getMatchInfoCode() != null) {
            sql.SET("MATCH_INFO_CODE = #{matchInfoCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoName() != null) {
            sql.SET("MATCH_INFO_NAME = #{matchInfoName,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoIconUrl() != null) {
            sql.SET("MATCH_INFO_ICON_URL = #{matchInfoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoDesc() != null) {
            sql.SET("MATCH_INFO_DESC = #{matchInfoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchAddress() != null) {
            sql.SET("MATCH_ADDRESS = #{matchAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchWeather() != null) {
            sql.SET("MATCH_WEATHER = #{matchWeather,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeTeamId() != null) {
            sql.SET("HOME_TEAM_ID = #{homeTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getGuestTeamId() != null) {
            sql.SET("GUEST_TEAM_ID = #{guestTeamId,jdbcType=BIGINT}");
        }
        
        if (record.getMatchBeginTime() != null) {
            sql.SET("MATCH_BEGIN_TIME = #{matchBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMatchInfoSts() != null) {
            sql.SET("MATCH_INFO_STS = #{matchInfoSts,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoResult() != null) {
            sql.SET("MATCH_INFO_RESULT = #{matchInfoResult,jdbcType=CHAR}");
        }
        
        if (record.getMatchInfoScore() != null) {
            sql.SET("MATCH_INFO_SCORE = #{matchInfoScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchInfoHalftimeScore() != null) {
            sql.SET("MATCH_INFO_HALFTIME_SCORE = #{matchInfoHalftimeScore,jdbcType=VARCHAR}");
        }
        
        if (record.getMatchLottoId() != null) {
            sql.SET("MATCH_LOTTO_ID = #{matchLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getRoundId() != null) {
            sql.SET("ROUND_ID = #{roundId,jdbcType=BIGINT}");
        }
        
        if (record.getSeasonId() != null) {
            sql.SET("SEASON_ID = #{seasonId,jdbcType=BIGINT}");
        }
        
        if (record.getLeagueId() != null) {
            sql.SET("LEAGUE_ID = #{leagueId,jdbcType=BIGINT}");
        }
        
        if (record.getSportteryMatchInfoId() != null) {
            sql.SET("SPORTTERY_MATCH_INFO_ID = #{sportteryMatchInfoId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("MATCH_INFO_ID = #{matchInfoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchInfoExample example, boolean includeExamplePhrase) {
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