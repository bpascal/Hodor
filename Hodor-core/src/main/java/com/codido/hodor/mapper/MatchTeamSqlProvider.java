package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchTeam;
import com.codido.hodor.model.MatchTeamExample.Criteria;
import com.codido.hodor.model.MatchTeamExample.Criterion;
import com.codido.hodor.model.MatchTeamExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MatchTeamSqlProvider {

    public String countByExample(MatchTeamExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_match_team");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MatchTeamExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_match_team");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MatchTeam record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_match_team");
        
        if (record.getTeamName() != null) {
            sql.VALUES("TEAM_NAME", "#{teamName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamShortName() != null) {
            sql.VALUES("TEAM_SHORT_NAME", "#{teamShortName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamIconUrl() != null) {
            sql.VALUES("TEAM_ICON_URL", "#{teamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamDesc() != null) {
            sql.VALUES("TEAM_DESC", "#{teamDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamAddress() != null) {
            sql.VALUES("TEAM_ADDRESS", "#{teamAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSportType() != null) {
            sql.VALUES("TEAM_SPORT_TYPE", "#{teamSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSts() != null) {
            sql.VALUES("TEAM_STS", "#{teamSts,jdbcType=CHAR}");
        }
        
        if (record.getSportteryTeamId() != null) {
            sql.VALUES("SPORTTERY_TEAM_ID", "#{sportteryTeamId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MatchTeamExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TEAM_ID");
        } else {
            sql.SELECT("TEAM_ID");
        }
        sql.SELECT("TEAM_NAME");
        sql.SELECT("TEAM_SHORT_NAME");
        sql.SELECT("TEAM_ICON_URL");
        sql.SELECT("TEAM_DESC");
        sql.SELECT("TEAM_ADDRESS");
        sql.SELECT("TEAM_SPORT_TYPE");
        sql.SELECT("TEAM_STS");
        sql.SELECT("SPORTTERY_TEAM_ID");
        sql.FROM("t_match_team");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MatchTeam record = (MatchTeam) parameter.get("record");
        MatchTeamExample example = (MatchTeamExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_match_team");
        
        if (record.getTeamId() != null) {
            sql.SET("TEAM_ID = #{record.teamId,jdbcType=BIGINT}");
        }
        
        if (record.getTeamName() != null) {
            sql.SET("TEAM_NAME = #{record.teamName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamShortName() != null) {
            sql.SET("TEAM_SHORT_NAME = #{record.teamShortName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamIconUrl() != null) {
            sql.SET("TEAM_ICON_URL = #{record.teamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamDesc() != null) {
            sql.SET("TEAM_DESC = #{record.teamDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamAddress() != null) {
            sql.SET("TEAM_ADDRESS = #{record.teamAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSportType() != null) {
            sql.SET("TEAM_SPORT_TYPE = #{record.teamSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSts() != null) {
            sql.SET("TEAM_STS = #{record.teamSts,jdbcType=CHAR}");
        }
        
        if (record.getSportteryTeamId() != null) {
            sql.SET("SPORTTERY_TEAM_ID = #{record.sportteryTeamId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_team");
        
        sql.SET("TEAM_ID = #{record.teamId,jdbcType=BIGINT}");
        sql.SET("TEAM_NAME = #{record.teamName,jdbcType=VARCHAR}");
        sql.SET("TEAM_SHORT_NAME = #{record.teamShortName,jdbcType=VARCHAR}");
        sql.SET("TEAM_ICON_URL = #{record.teamIconUrl,jdbcType=VARCHAR}");
        sql.SET("TEAM_DESC = #{record.teamDesc,jdbcType=VARCHAR}");
        sql.SET("TEAM_ADDRESS = #{record.teamAddress,jdbcType=VARCHAR}");
        sql.SET("TEAM_SPORT_TYPE = #{record.teamSportType,jdbcType=VARCHAR}");
        sql.SET("TEAM_STS = #{record.teamSts,jdbcType=CHAR}");
        sql.SET("SPORTTERY_TEAM_ID = #{record.sportteryTeamId,jdbcType=VARCHAR}");
        
        MatchTeamExample example = (MatchTeamExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatchTeam record) {
        SQL sql = new SQL();
        sql.UPDATE("t_match_team");
        
        if (record.getTeamName() != null) {
            sql.SET("TEAM_NAME = #{teamName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamShortName() != null) {
            sql.SET("TEAM_SHORT_NAME = #{teamShortName,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamIconUrl() != null) {
            sql.SET("TEAM_ICON_URL = #{teamIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamDesc() != null) {
            sql.SET("TEAM_DESC = #{teamDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamAddress() != null) {
            sql.SET("TEAM_ADDRESS = #{teamAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSportType() != null) {
            sql.SET("TEAM_SPORT_TYPE = #{teamSportType,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamSts() != null) {
            sql.SET("TEAM_STS = #{teamSts,jdbcType=CHAR}");
        }
        
        if (record.getSportteryTeamId() != null) {
            sql.SET("SPORTTERY_TEAM_ID = #{sportteryTeamId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("TEAM_ID = #{teamId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MatchTeamExample example, boolean includeExamplePhrase) {
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