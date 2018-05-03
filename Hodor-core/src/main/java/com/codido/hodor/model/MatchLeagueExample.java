package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class MatchLeagueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchLeagueExample() {
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

        public Criteria andLeagueNameIsNull() {
            addCriterion("LEAGUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLeagueNameIsNotNull() {
            addCriterion("LEAGUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueNameEqualTo(String value) {
            addCriterion("LEAGUE_NAME =", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameNotEqualTo(String value) {
            addCriterion("LEAGUE_NAME <>", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameGreaterThan(String value) {
            addCriterion("LEAGUE_NAME >", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_NAME >=", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameLessThan(String value) {
            addCriterion("LEAGUE_NAME <", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_NAME <=", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameLike(String value) {
            addCriterion("LEAGUE_NAME like", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameNotLike(String value) {
            addCriterion("LEAGUE_NAME not like", value, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameIn(List<String> values) {
            addCriterion("LEAGUE_NAME in", values, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameNotIn(List<String> values) {
            addCriterion("LEAGUE_NAME not in", values, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameBetween(String value1, String value2) {
            addCriterion("LEAGUE_NAME between", value1, value2, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueNameNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_NAME not between", value1, value2, "leagueName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameIsNull() {
            addCriterion("LEAGUE_SHOT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameIsNotNull() {
            addCriterion("LEAGUE_SHOT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameEqualTo(String value) {
            addCriterion("LEAGUE_SHOT_NAME =", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameNotEqualTo(String value) {
            addCriterion("LEAGUE_SHOT_NAME <>", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameGreaterThan(String value) {
            addCriterion("LEAGUE_SHOT_NAME >", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_SHOT_NAME >=", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameLessThan(String value) {
            addCriterion("LEAGUE_SHOT_NAME <", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_SHOT_NAME <=", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameLike(String value) {
            addCriterion("LEAGUE_SHOT_NAME like", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameNotLike(String value) {
            addCriterion("LEAGUE_SHOT_NAME not like", value, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameIn(List<String> values) {
            addCriterion("LEAGUE_SHOT_NAME in", values, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameNotIn(List<String> values) {
            addCriterion("LEAGUE_SHOT_NAME not in", values, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameBetween(String value1, String value2) {
            addCriterion("LEAGUE_SHOT_NAME between", value1, value2, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueShotNameNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_SHOT_NAME not between", value1, value2, "leagueShotName");
            return (Criteria) this;
        }

        public Criteria andLeagueDescIsNull() {
            addCriterion("LEAGUE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLeagueDescIsNotNull() {
            addCriterion("LEAGUE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueDescEqualTo(String value) {
            addCriterion("LEAGUE_DESC =", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescNotEqualTo(String value) {
            addCriterion("LEAGUE_DESC <>", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescGreaterThan(String value) {
            addCriterion("LEAGUE_DESC >", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_DESC >=", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescLessThan(String value) {
            addCriterion("LEAGUE_DESC <", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_DESC <=", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescLike(String value) {
            addCriterion("LEAGUE_DESC like", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescNotLike(String value) {
            addCriterion("LEAGUE_DESC not like", value, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescIn(List<String> values) {
            addCriterion("LEAGUE_DESC in", values, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescNotIn(List<String> values) {
            addCriterion("LEAGUE_DESC not in", values, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescBetween(String value1, String value2) {
            addCriterion("LEAGUE_DESC between", value1, value2, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueDescNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_DESC not between", value1, value2, "leagueDesc");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlIsNull() {
            addCriterion("LEAGUE_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlIsNotNull() {
            addCriterion("LEAGUE_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlEqualTo(String value) {
            addCriterion("LEAGUE_ICON_URL =", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlNotEqualTo(String value) {
            addCriterion("LEAGUE_ICON_URL <>", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlGreaterThan(String value) {
            addCriterion("LEAGUE_ICON_URL >", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_ICON_URL >=", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlLessThan(String value) {
            addCriterion("LEAGUE_ICON_URL <", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_ICON_URL <=", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlLike(String value) {
            addCriterion("LEAGUE_ICON_URL like", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlNotLike(String value) {
            addCriterion("LEAGUE_ICON_URL not like", value, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlIn(List<String> values) {
            addCriterion("LEAGUE_ICON_URL in", values, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlNotIn(List<String> values) {
            addCriterion("LEAGUE_ICON_URL not in", values, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlBetween(String value1, String value2) {
            addCriterion("LEAGUE_ICON_URL between", value1, value2, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueIconUrlNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_ICON_URL not between", value1, value2, "leagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeIsNull() {
            addCriterion("LEAGUE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeIsNotNull() {
            addCriterion("LEAGUE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeEqualTo(String value) {
            addCriterion("LEAGUE_TYPE =", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeNotEqualTo(String value) {
            addCriterion("LEAGUE_TYPE <>", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeGreaterThan(String value) {
            addCriterion("LEAGUE_TYPE >", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_TYPE >=", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeLessThan(String value) {
            addCriterion("LEAGUE_TYPE <", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_TYPE <=", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeLike(String value) {
            addCriterion("LEAGUE_TYPE like", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeNotLike(String value) {
            addCriterion("LEAGUE_TYPE not like", value, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeIn(List<String> values) {
            addCriterion("LEAGUE_TYPE in", values, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeNotIn(List<String> values) {
            addCriterion("LEAGUE_TYPE not in", values, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeBetween(String value1, String value2) {
            addCriterion("LEAGUE_TYPE between", value1, value2, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueTypeNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_TYPE not between", value1, value2, "leagueType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeIsNull() {
            addCriterion("LEAGUE_SPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeIsNotNull() {
            addCriterion("LEAGUE_SPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeEqualTo(String value) {
            addCriterion("LEAGUE_SPORT_TYPE =", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeNotEqualTo(String value) {
            addCriterion("LEAGUE_SPORT_TYPE <>", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeGreaterThan(String value) {
            addCriterion("LEAGUE_SPORT_TYPE >", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_SPORT_TYPE >=", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeLessThan(String value) {
            addCriterion("LEAGUE_SPORT_TYPE <", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_SPORT_TYPE <=", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeLike(String value) {
            addCriterion("LEAGUE_SPORT_TYPE like", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeNotLike(String value) {
            addCriterion("LEAGUE_SPORT_TYPE not like", value, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeIn(List<String> values) {
            addCriterion("LEAGUE_SPORT_TYPE in", values, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeNotIn(List<String> values) {
            addCriterion("LEAGUE_SPORT_TYPE not in", values, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeBetween(String value1, String value2) {
            addCriterion("LEAGUE_SPORT_TYPE between", value1, value2, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueSportTypeNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_SPORT_TYPE not between", value1, value2, "leagueSportType");
            return (Criteria) this;
        }

        public Criteria andLeagueStsIsNull() {
            addCriterion("LEAGUE_STS is null");
            return (Criteria) this;
        }

        public Criteria andLeagueStsIsNotNull() {
            addCriterion("LEAGUE_STS is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueStsEqualTo(String value) {
            addCriterion("LEAGUE_STS =", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsNotEqualTo(String value) {
            addCriterion("LEAGUE_STS <>", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsGreaterThan(String value) {
            addCriterion("LEAGUE_STS >", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsGreaterThanOrEqualTo(String value) {
            addCriterion("LEAGUE_STS >=", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsLessThan(String value) {
            addCriterion("LEAGUE_STS <", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsLessThanOrEqualTo(String value) {
            addCriterion("LEAGUE_STS <=", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsLike(String value) {
            addCriterion("LEAGUE_STS like", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsNotLike(String value) {
            addCriterion("LEAGUE_STS not like", value, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsIn(List<String> values) {
            addCriterion("LEAGUE_STS in", values, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsNotIn(List<String> values) {
            addCriterion("LEAGUE_STS not in", values, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsBetween(String value1, String value2) {
            addCriterion("LEAGUE_STS between", value1, value2, "leagueSts");
            return (Criteria) this;
        }

        public Criteria andLeagueStsNotBetween(String value1, String value2) {
            addCriterion("LEAGUE_STS not between", value1, value2, "leagueSts");
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