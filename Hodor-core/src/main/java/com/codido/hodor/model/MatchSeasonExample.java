package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchSeasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchSeasonExample() {
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

        public Criteria andSeasonNameIsNull() {
            addCriterion("SEASON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNotNull() {
            addCriterion("SEASON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameEqualTo(String value) {
            addCriterion("SEASON_NAME =", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotEqualTo(String value) {
            addCriterion("SEASON_NAME <>", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThan(String value) {
            addCriterion("SEASON_NAME >", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("SEASON_NAME >=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThan(String value) {
            addCriterion("SEASON_NAME <", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThanOrEqualTo(String value) {
            addCriterion("SEASON_NAME <=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLike(String value) {
            addCriterion("SEASON_NAME like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotLike(String value) {
            addCriterion("SEASON_NAME not like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIn(List<String> values) {
            addCriterion("SEASON_NAME in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotIn(List<String> values) {
            addCriterion("SEASON_NAME not in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameBetween(String value1, String value2) {
            addCriterion("SEASON_NAME between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotBetween(String value1, String value2) {
            addCriterion("SEASON_NAME not between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlIsNull() {
            addCriterion("SEASON_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlIsNotNull() {
            addCriterion("SEASON_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlEqualTo(String value) {
            addCriterion("SEASON_ICON_URL =", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlNotEqualTo(String value) {
            addCriterion("SEASON_ICON_URL <>", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlGreaterThan(String value) {
            addCriterion("SEASON_ICON_URL >", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SEASON_ICON_URL >=", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlLessThan(String value) {
            addCriterion("SEASON_ICON_URL <", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlLessThanOrEqualTo(String value) {
            addCriterion("SEASON_ICON_URL <=", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlLike(String value) {
            addCriterion("SEASON_ICON_URL like", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlNotLike(String value) {
            addCriterion("SEASON_ICON_URL not like", value, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlIn(List<String> values) {
            addCriterion("SEASON_ICON_URL in", values, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlNotIn(List<String> values) {
            addCriterion("SEASON_ICON_URL not in", values, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlBetween(String value1, String value2) {
            addCriterion("SEASON_ICON_URL between", value1, value2, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andSeasonIconUrlNotBetween(String value1, String value2) {
            addCriterion("SEASON_ICON_URL not between", value1, value2, "seasonIconUrl");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdIsNull() {
            addCriterion("CURRENT_ROUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdIsNotNull() {
            addCriterion("CURRENT_ROUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdEqualTo(Long value) {
            addCriterion("CURRENT_ROUND_ID =", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdNotEqualTo(Long value) {
            addCriterion("CURRENT_ROUND_ID <>", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdGreaterThan(Long value) {
            addCriterion("CURRENT_ROUND_ID >", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_ROUND_ID >=", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdLessThan(Long value) {
            addCriterion("CURRENT_ROUND_ID <", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_ROUND_ID <=", value, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdIn(List<Long> values) {
            addCriterion("CURRENT_ROUND_ID in", values, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdNotIn(List<Long> values) {
            addCriterion("CURRENT_ROUND_ID not in", values, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdBetween(Long value1, Long value2) {
            addCriterion("CURRENT_ROUND_ID between", value1, value2, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIdNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_ROUND_ID not between", value1, value2, "currentRoundId");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeIsNull() {
            addCriterion("SEASON_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeIsNotNull() {
            addCriterion("SEASON_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeEqualTo(Date value) {
            addCriterion("SEASON_BEGIN_TIME =", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeNotEqualTo(Date value) {
            addCriterion("SEASON_BEGIN_TIME <>", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeGreaterThan(Date value) {
            addCriterion("SEASON_BEGIN_TIME >", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SEASON_BEGIN_TIME >=", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeLessThan(Date value) {
            addCriterion("SEASON_BEGIN_TIME <", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("SEASON_BEGIN_TIME <=", value, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeIn(List<Date> values) {
            addCriterion("SEASON_BEGIN_TIME in", values, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeNotIn(List<Date> values) {
            addCriterion("SEASON_BEGIN_TIME not in", values, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeBetween(Date value1, Date value2) {
            addCriterion("SEASON_BEGIN_TIME between", value1, value2, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("SEASON_BEGIN_TIME not between", value1, value2, "seasonBeginTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeIsNull() {
            addCriterion("SEASON_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeIsNotNull() {
            addCriterion("SEASON_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeEqualTo(Date value) {
            addCriterion("SEASON_END_TIME =", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeNotEqualTo(Date value) {
            addCriterion("SEASON_END_TIME <>", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeGreaterThan(Date value) {
            addCriterion("SEASON_END_TIME >", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SEASON_END_TIME >=", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeLessThan(Date value) {
            addCriterion("SEASON_END_TIME <", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("SEASON_END_TIME <=", value, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeIn(List<Date> values) {
            addCriterion("SEASON_END_TIME in", values, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeNotIn(List<Date> values) {
            addCriterion("SEASON_END_TIME not in", values, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeBetween(Date value1, Date value2) {
            addCriterion("SEASON_END_TIME between", value1, value2, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("SEASON_END_TIME not between", value1, value2, "seasonEndTime");
            return (Criteria) this;
        }

        public Criteria andSeasonStsIsNull() {
            addCriterion("SEASON_STS is null");
            return (Criteria) this;
        }

        public Criteria andSeasonStsIsNotNull() {
            addCriterion("SEASON_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonStsEqualTo(String value) {
            addCriterion("SEASON_STS =", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsNotEqualTo(String value) {
            addCriterion("SEASON_STS <>", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsGreaterThan(String value) {
            addCriterion("SEASON_STS >", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsGreaterThanOrEqualTo(String value) {
            addCriterion("SEASON_STS >=", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsLessThan(String value) {
            addCriterion("SEASON_STS <", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsLessThanOrEqualTo(String value) {
            addCriterion("SEASON_STS <=", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsLike(String value) {
            addCriterion("SEASON_STS like", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsNotLike(String value) {
            addCriterion("SEASON_STS not like", value, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsIn(List<String> values) {
            addCriterion("SEASON_STS in", values, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsNotIn(List<String> values) {
            addCriterion("SEASON_STS not in", values, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsBetween(String value1, String value2) {
            addCriterion("SEASON_STS between", value1, value2, "seasonSts");
            return (Criteria) this;
        }

        public Criteria andSeasonStsNotBetween(String value1, String value2) {
            addCriterion("SEASON_STS not between", value1, value2, "seasonSts");
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