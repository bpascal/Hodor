package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchRoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchRoundExample() {
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

        public Criteria andRoundIdIsNull() {
            addCriterion("ROUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoundIdIsNotNull() {
            addCriterion("ROUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoundIdEqualTo(Long value) {
            addCriterion("ROUND_ID =", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotEqualTo(Long value) {
            addCriterion("ROUND_ID <>", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThan(Long value) {
            addCriterion("ROUND_ID >", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROUND_ID >=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThan(Long value) {
            addCriterion("ROUND_ID <", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThanOrEqualTo(Long value) {
            addCriterion("ROUND_ID <=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdIn(List<Long> values) {
            addCriterion("ROUND_ID in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotIn(List<Long> values) {
            addCriterion("ROUND_ID not in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdBetween(Long value1, Long value2) {
            addCriterion("ROUND_ID between", value1, value2, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotBetween(Long value1, Long value2) {
            addCriterion("ROUND_ID not between", value1, value2, "roundId");
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

        public Criteria andRoundNameIsNull() {
            addCriterion("ROUND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoundNameIsNotNull() {
            addCriterion("ROUND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoundNameEqualTo(String value) {
            addCriterion("ROUND_NAME =", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotEqualTo(String value) {
            addCriterion("ROUND_NAME <>", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameGreaterThan(String value) {
            addCriterion("ROUND_NAME >", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND_NAME >=", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLessThan(String value) {
            addCriterion("ROUND_NAME <", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLessThanOrEqualTo(String value) {
            addCriterion("ROUND_NAME <=", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLike(String value) {
            addCriterion("ROUND_NAME like", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotLike(String value) {
            addCriterion("ROUND_NAME not like", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameIn(List<String> values) {
            addCriterion("ROUND_NAME in", values, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotIn(List<String> values) {
            addCriterion("ROUND_NAME not in", values, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameBetween(String value1, String value2) {
            addCriterion("ROUND_NAME between", value1, value2, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotBetween(String value1, String value2) {
            addCriterion("ROUND_NAME not between", value1, value2, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlIsNull() {
            addCriterion("ROUND_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlIsNotNull() {
            addCriterion("ROUND_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlEqualTo(String value) {
            addCriterion("ROUND_ICON_URL =", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlNotEqualTo(String value) {
            addCriterion("ROUND_ICON_URL <>", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlGreaterThan(String value) {
            addCriterion("ROUND_ICON_URL >", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND_ICON_URL >=", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlLessThan(String value) {
            addCriterion("ROUND_ICON_URL <", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlLessThanOrEqualTo(String value) {
            addCriterion("ROUND_ICON_URL <=", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlLike(String value) {
            addCriterion("ROUND_ICON_URL like", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlNotLike(String value) {
            addCriterion("ROUND_ICON_URL not like", value, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlIn(List<String> values) {
            addCriterion("ROUND_ICON_URL in", values, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlNotIn(List<String> values) {
            addCriterion("ROUND_ICON_URL not in", values, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlBetween(String value1, String value2) {
            addCriterion("ROUND_ICON_URL between", value1, value2, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundIconUrlNotBetween(String value1, String value2) {
            addCriterion("ROUND_ICON_URL not between", value1, value2, "roundIconUrl");
            return (Criteria) this;
        }

        public Criteria andRoundDescIsNull() {
            addCriterion("ROUND_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRoundDescIsNotNull() {
            addCriterion("ROUND_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRoundDescEqualTo(String value) {
            addCriterion("ROUND_DESC =", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescNotEqualTo(String value) {
            addCriterion("ROUND_DESC <>", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescGreaterThan(String value) {
            addCriterion("ROUND_DESC >", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND_DESC >=", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescLessThan(String value) {
            addCriterion("ROUND_DESC <", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescLessThanOrEqualTo(String value) {
            addCriterion("ROUND_DESC <=", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescLike(String value) {
            addCriterion("ROUND_DESC like", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescNotLike(String value) {
            addCriterion("ROUND_DESC not like", value, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescIn(List<String> values) {
            addCriterion("ROUND_DESC in", values, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescNotIn(List<String> values) {
            addCriterion("ROUND_DESC not in", values, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescBetween(String value1, String value2) {
            addCriterion("ROUND_DESC between", value1, value2, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundDescNotBetween(String value1, String value2) {
            addCriterion("ROUND_DESC not between", value1, value2, "roundDesc");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeIsNull() {
            addCriterion("ROUND_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeIsNotNull() {
            addCriterion("ROUND_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeEqualTo(Date value) {
            addCriterion("ROUND_BEGIN_TIME =", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeNotEqualTo(Date value) {
            addCriterion("ROUND_BEGIN_TIME <>", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeGreaterThan(Date value) {
            addCriterion("ROUND_BEGIN_TIME >", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ROUND_BEGIN_TIME >=", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeLessThan(Date value) {
            addCriterion("ROUND_BEGIN_TIME <", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("ROUND_BEGIN_TIME <=", value, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeIn(List<Date> values) {
            addCriterion("ROUND_BEGIN_TIME in", values, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeNotIn(List<Date> values) {
            addCriterion("ROUND_BEGIN_TIME not in", values, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeBetween(Date value1, Date value2) {
            addCriterion("ROUND_BEGIN_TIME between", value1, value2, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("ROUND_BEGIN_TIME not between", value1, value2, "roundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeIsNull() {
            addCriterion("ROUND_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeIsNotNull() {
            addCriterion("ROUND_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeEqualTo(Date value) {
            addCriterion("ROUND_END_TIME =", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeNotEqualTo(Date value) {
            addCriterion("ROUND_END_TIME <>", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeGreaterThan(Date value) {
            addCriterion("ROUND_END_TIME >", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ROUND_END_TIME >=", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeLessThan(Date value) {
            addCriterion("ROUND_END_TIME <", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ROUND_END_TIME <=", value, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeIn(List<Date> values) {
            addCriterion("ROUND_END_TIME in", values, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeNotIn(List<Date> values) {
            addCriterion("ROUND_END_TIME not in", values, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeBetween(Date value1, Date value2) {
            addCriterion("ROUND_END_TIME between", value1, value2, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ROUND_END_TIME not between", value1, value2, "roundEndTime");
            return (Criteria) this;
        }

        public Criteria andRoundStsIsNull() {
            addCriterion("ROUND_STS is null");
            return (Criteria) this;
        }

        public Criteria andRoundStsIsNotNull() {
            addCriterion("ROUND_STS is not null");
            return (Criteria) this;
        }

        public Criteria andRoundStsEqualTo(String value) {
            addCriterion("ROUND_STS =", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsNotEqualTo(String value) {
            addCriterion("ROUND_STS <>", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsGreaterThan(String value) {
            addCriterion("ROUND_STS >", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND_STS >=", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsLessThan(String value) {
            addCriterion("ROUND_STS <", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsLessThanOrEqualTo(String value) {
            addCriterion("ROUND_STS <=", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsLike(String value) {
            addCriterion("ROUND_STS like", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsNotLike(String value) {
            addCriterion("ROUND_STS not like", value, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsIn(List<String> values) {
            addCriterion("ROUND_STS in", values, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsNotIn(List<String> values) {
            addCriterion("ROUND_STS not in", values, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsBetween(String value1, String value2) {
            addCriterion("ROUND_STS between", value1, value2, "roundSts");
            return (Criteria) this;
        }

        public Criteria andRoundStsNotBetween(String value1, String value2) {
            addCriterion("ROUND_STS not between", value1, value2, "roundSts");
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