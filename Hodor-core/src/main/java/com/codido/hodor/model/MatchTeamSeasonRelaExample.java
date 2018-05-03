package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchTeamSeasonRelaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchTeamSeasonRelaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTSRelaIdIsNull() {
            addCriterion("T_S_RELA_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdIsNotNull() {
            addCriterion("T_S_RELA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdEqualTo(Long value) {
            addCriterion("T_S_RELA_ID =", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdNotEqualTo(Long value) {
            addCriterion("T_S_RELA_ID <>", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdGreaterThan(Long value) {
            addCriterion("T_S_RELA_ID >", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("T_S_RELA_ID >=", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdLessThan(Long value) {
            addCriterion("T_S_RELA_ID <", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdLessThanOrEqualTo(Long value) {
            addCriterion("T_S_RELA_ID <=", value, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdIn(List<Long> values) {
            addCriterion("T_S_RELA_ID in", values, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdNotIn(List<Long> values) {
            addCriterion("T_S_RELA_ID not in", values, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdBetween(Long value1, Long value2) {
            addCriterion("T_S_RELA_ID between", value1, value2, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTSRelaIdNotBetween(Long value1, Long value2) {
            addCriterion("T_S_RELA_ID not between", value1, value2, "tSRelaId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Long value) {
            addCriterion("TEAM_ID =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Long value) {
            addCriterion("TEAM_ID <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Long value) {
            addCriterion("TEAM_ID >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TEAM_ID >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Long value) {
            addCriterion("TEAM_ID <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Long value) {
            addCriterion("TEAM_ID <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Long> values) {
            addCriterion("TEAM_ID in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Long> values) {
            addCriterion("TEAM_ID not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Long value1, Long value2) {
            addCriterion("TEAM_ID between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Long value1, Long value2) {
            addCriterion("TEAM_ID not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNull() {
            addCriterion("SEASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNotNull() {
            addCriterion("SEASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdEqualTo(Long value) {
            addCriterion("SEASON_ID =", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotEqualTo(Long value) {
            addCriterion("SEASON_ID <>", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThan(Long value) {
            addCriterion("SEASON_ID >", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SEASON_ID >=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThan(Long value) {
            addCriterion("SEASON_ID <", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThanOrEqualTo(Long value) {
            addCriterion("SEASON_ID <=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIn(List<Long> values) {
            addCriterion("SEASON_ID in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotIn(List<Long> values) {
            addCriterion("SEASON_ID not in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdBetween(Long value1, Long value2) {
            addCriterion("SEASON_ID between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotBetween(Long value1, Long value2) {
            addCriterion("SEASON_ID not between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNull() {
            addCriterion("LEAGUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNotNull() {
            addCriterion("LEAGUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdEqualTo(Long value) {
            addCriterion("LEAGUE_ID =", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotEqualTo(Long value) {
            addCriterion("LEAGUE_ID <>", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThan(Long value) {
            addCriterion("LEAGUE_ID >", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LEAGUE_ID >=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThan(Long value) {
            addCriterion("LEAGUE_ID <", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThanOrEqualTo(Long value) {
            addCriterion("LEAGUE_ID <=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIn(List<Long> values) {
            addCriterion("LEAGUE_ID in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotIn(List<Long> values) {
            addCriterion("LEAGUE_ID not in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdBetween(Long value1, Long value2) {
            addCriterion("LEAGUE_ID between", value1, value2, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotBetween(Long value1, Long value2) {
            addCriterion("LEAGUE_ID not between", value1, value2, "leagueId");
            return (Criteria) this;
        }

        public Criteria andRelaStsIsNull() {
            addCriterion("RELA_STS is null");
            return (Criteria) this;
        }

        public Criteria andRelaStsIsNotNull() {
            addCriterion("RELA_STS is not null");
            return (Criteria) this;
        }

        public Criteria andRelaStsEqualTo(String value) {
            addCriterion("RELA_STS =", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsNotEqualTo(String value) {
            addCriterion("RELA_STS <>", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsGreaterThan(String value) {
            addCriterion("RELA_STS >", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsGreaterThanOrEqualTo(String value) {
            addCriterion("RELA_STS >=", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsLessThan(String value) {
            addCriterion("RELA_STS <", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsLessThanOrEqualTo(String value) {
            addCriterion("RELA_STS <=", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsLike(String value) {
            addCriterion("RELA_STS like", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsNotLike(String value) {
            addCriterion("RELA_STS not like", value, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsIn(List<String> values) {
            addCriterion("RELA_STS in", values, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsNotIn(List<String> values) {
            addCriterion("RELA_STS not in", values, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsBetween(String value1, String value2) {
            addCriterion("RELA_STS between", value1, value2, "relaSts");
            return (Criteria) this;
        }

        public Criteria andRelaStsNotBetween(String value1, String value2) {
            addCriterion("RELA_STS not between", value1, value2, "relaSts");
            return (Criteria) this;
        }

        public Criteria andTeamSortIsNull() {
            addCriterion("TEAM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andTeamSortIsNotNull() {
            addCriterion("TEAM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andTeamSortEqualTo(Integer value) {
            addCriterion("TEAM_SORT =", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortNotEqualTo(Integer value) {
            addCriterion("TEAM_SORT <>", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortGreaterThan(Integer value) {
            addCriterion("TEAM_SORT >", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_SORT >=", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortLessThan(Integer value) {
            addCriterion("TEAM_SORT <", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_SORT <=", value, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortIn(List<Integer> values) {
            addCriterion("TEAM_SORT in", values, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortNotIn(List<Integer> values) {
            addCriterion("TEAM_SORT not in", values, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_SORT between", value1, value2, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamSortNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_SORT not between", value1, value2, "teamSort");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIsNull() {
            addCriterion("TEAM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIsNotNull() {
            addCriterion("TEAM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreEqualTo(Integer value) {
            addCriterion("TEAM_SCORE =", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotEqualTo(Integer value) {
            addCriterion("TEAM_SCORE <>", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreGreaterThan(Integer value) {
            addCriterion("TEAM_SCORE >", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_SCORE >=", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreLessThan(Integer value) {
            addCriterion("TEAM_SCORE <", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_SCORE <=", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIn(List<Integer> values) {
            addCriterion("TEAM_SCORE in", values, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotIn(List<Integer> values) {
            addCriterion("TEAM_SCORE not in", values, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_SCORE between", value1, value2, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_SCORE not between", value1, value2, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeIsNull() {
            addCriterion("TEAM_SCORE_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeIsNotNull() {
            addCriterion("TEAM_SCORE_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeEqualTo(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME =", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeNotEqualTo(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME <>", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeGreaterThan(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME >", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME >=", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeLessThan(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME <", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("TEAM_SCORE_UPDATE_TIME <=", value, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeIn(List<Date> values) {
            addCriterion("TEAM_SCORE_UPDATE_TIME in", values, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeNotIn(List<Date> values) {
            addCriterion("TEAM_SCORE_UPDATE_TIME not in", values, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("TEAM_SCORE_UPDATE_TIME between", value1, value2, "teamScoreUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeamScoreUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("TEAM_SCORE_UPDATE_TIME not between", value1, value2, "teamScoreUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}