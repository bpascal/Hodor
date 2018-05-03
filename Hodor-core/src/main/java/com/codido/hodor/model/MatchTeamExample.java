package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class MatchTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchTeamExample() {
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

        public Criteria andTeamNameIsNull() {
            addCriterion("TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("TEAM_NAME =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("TEAM_NAME <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("TEAM_NAME >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("TEAM_NAME <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("TEAM_NAME like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("TEAM_NAME not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("TEAM_NAME in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("TEAM_NAME not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("TEAM_NAME between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameIsNull() {
            addCriterion("TEAM_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameIsNotNull() {
            addCriterion("TEAM_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameEqualTo(String value) {
            addCriterion("TEAM_SHORT_NAME =", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameNotEqualTo(String value) {
            addCriterion("TEAM_SHORT_NAME <>", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameGreaterThan(String value) {
            addCriterion("TEAM_SHORT_NAME >", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_SHORT_NAME >=", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameLessThan(String value) {
            addCriterion("TEAM_SHORT_NAME <", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameLessThanOrEqualTo(String value) {
            addCriterion("TEAM_SHORT_NAME <=", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameLike(String value) {
            addCriterion("TEAM_SHORT_NAME like", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameNotLike(String value) {
            addCriterion("TEAM_SHORT_NAME not like", value, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameIn(List<String> values) {
            addCriterion("TEAM_SHORT_NAME in", values, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameNotIn(List<String> values) {
            addCriterion("TEAM_SHORT_NAME not in", values, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameBetween(String value1, String value2) {
            addCriterion("TEAM_SHORT_NAME between", value1, value2, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamShortNameNotBetween(String value1, String value2) {
            addCriterion("TEAM_SHORT_NAME not between", value1, value2, "teamShortName");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlIsNull() {
            addCriterion("TEAM_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlIsNotNull() {
            addCriterion("TEAM_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlEqualTo(String value) {
            addCriterion("TEAM_ICON_URL =", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlNotEqualTo(String value) {
            addCriterion("TEAM_ICON_URL <>", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlGreaterThan(String value) {
            addCriterion("TEAM_ICON_URL >", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_ICON_URL >=", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlLessThan(String value) {
            addCriterion("TEAM_ICON_URL <", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlLessThanOrEqualTo(String value) {
            addCriterion("TEAM_ICON_URL <=", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlLike(String value) {
            addCriterion("TEAM_ICON_URL like", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlNotLike(String value) {
            addCriterion("TEAM_ICON_URL not like", value, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlIn(List<String> values) {
            addCriterion("TEAM_ICON_URL in", values, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlNotIn(List<String> values) {
            addCriterion("TEAM_ICON_URL not in", values, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlBetween(String value1, String value2) {
            addCriterion("TEAM_ICON_URL between", value1, value2, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamIconUrlNotBetween(String value1, String value2) {
            addCriterion("TEAM_ICON_URL not between", value1, value2, "teamIconUrl");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNull() {
            addCriterion("TEAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNotNull() {
            addCriterion("TEAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDescEqualTo(String value) {
            addCriterion("TEAM_DESC =", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotEqualTo(String value) {
            addCriterion("TEAM_DESC <>", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThan(String value) {
            addCriterion("TEAM_DESC >", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_DESC >=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThan(String value) {
            addCriterion("TEAM_DESC <", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThanOrEqualTo(String value) {
            addCriterion("TEAM_DESC <=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLike(String value) {
            addCriterion("TEAM_DESC like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotLike(String value) {
            addCriterion("TEAM_DESC not like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescIn(List<String> values) {
            addCriterion("TEAM_DESC in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotIn(List<String> values) {
            addCriterion("TEAM_DESC not in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescBetween(String value1, String value2) {
            addCriterion("TEAM_DESC between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotBetween(String value1, String value2) {
            addCriterion("TEAM_DESC not between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamAddressIsNull() {
            addCriterion("TEAM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTeamAddressIsNotNull() {
            addCriterion("TEAM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTeamAddressEqualTo(String value) {
            addCriterion("TEAM_ADDRESS =", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressNotEqualTo(String value) {
            addCriterion("TEAM_ADDRESS <>", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressGreaterThan(String value) {
            addCriterion("TEAM_ADDRESS >", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_ADDRESS >=", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressLessThan(String value) {
            addCriterion("TEAM_ADDRESS <", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressLessThanOrEqualTo(String value) {
            addCriterion("TEAM_ADDRESS <=", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressLike(String value) {
            addCriterion("TEAM_ADDRESS like", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressNotLike(String value) {
            addCriterion("TEAM_ADDRESS not like", value, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressIn(List<String> values) {
            addCriterion("TEAM_ADDRESS in", values, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressNotIn(List<String> values) {
            addCriterion("TEAM_ADDRESS not in", values, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressBetween(String value1, String value2) {
            addCriterion("TEAM_ADDRESS between", value1, value2, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamAddressNotBetween(String value1, String value2) {
            addCriterion("TEAM_ADDRESS not between", value1, value2, "teamAddress");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeIsNull() {
            addCriterion("TEAM_SPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeIsNotNull() {
            addCriterion("TEAM_SPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeEqualTo(String value) {
            addCriterion("TEAM_SPORT_TYPE =", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeNotEqualTo(String value) {
            addCriterion("TEAM_SPORT_TYPE <>", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeGreaterThan(String value) {
            addCriterion("TEAM_SPORT_TYPE >", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_SPORT_TYPE >=", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeLessThan(String value) {
            addCriterion("TEAM_SPORT_TYPE <", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeLessThanOrEqualTo(String value) {
            addCriterion("TEAM_SPORT_TYPE <=", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeLike(String value) {
            addCriterion("TEAM_SPORT_TYPE like", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeNotLike(String value) {
            addCriterion("TEAM_SPORT_TYPE not like", value, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeIn(List<String> values) {
            addCriterion("TEAM_SPORT_TYPE in", values, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeNotIn(List<String> values) {
            addCriterion("TEAM_SPORT_TYPE not in", values, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeBetween(String value1, String value2) {
            addCriterion("TEAM_SPORT_TYPE between", value1, value2, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamSportTypeNotBetween(String value1, String value2) {
            addCriterion("TEAM_SPORT_TYPE not between", value1, value2, "teamSportType");
            return (Criteria) this;
        }

        public Criteria andTeamStsIsNull() {
            addCriterion("TEAM_STS is null");
            return (Criteria) this;
        }

        public Criteria andTeamStsIsNotNull() {
            addCriterion("TEAM_STS is not null");
            return (Criteria) this;
        }

        public Criteria andTeamStsEqualTo(String value) {
            addCriterion("TEAM_STS =", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsNotEqualTo(String value) {
            addCriterion("TEAM_STS <>", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsGreaterThan(String value) {
            addCriterion("TEAM_STS >", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_STS >=", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsLessThan(String value) {
            addCriterion("TEAM_STS <", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsLessThanOrEqualTo(String value) {
            addCriterion("TEAM_STS <=", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsLike(String value) {
            addCriterion("TEAM_STS like", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsNotLike(String value) {
            addCriterion("TEAM_STS not like", value, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsIn(List<String> values) {
            addCriterion("TEAM_STS in", values, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsNotIn(List<String> values) {
            addCriterion("TEAM_STS not in", values, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsBetween(String value1, String value2) {
            addCriterion("TEAM_STS between", value1, value2, "teamSts");
            return (Criteria) this;
        }

        public Criteria andTeamStsNotBetween(String value1, String value2) {
            addCriterion("TEAM_STS not between", value1, value2, "teamSts");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdIsNull() {
            addCriterion("SPORTTERY_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdIsNotNull() {
            addCriterion("SPORTTERY_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdEqualTo(String value) {
            addCriterion("SPORTTERY_TEAM_ID =", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdNotEqualTo(String value) {
            addCriterion("SPORTTERY_TEAM_ID <>", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdGreaterThan(String value) {
            addCriterion("SPORTTERY_TEAM_ID >", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("SPORTTERY_TEAM_ID >=", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdLessThan(String value) {
            addCriterion("SPORTTERY_TEAM_ID <", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdLessThanOrEqualTo(String value) {
            addCriterion("SPORTTERY_TEAM_ID <=", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdLike(String value) {
            addCriterion("SPORTTERY_TEAM_ID like", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdNotLike(String value) {
            addCriterion("SPORTTERY_TEAM_ID not like", value, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdIn(List<String> values) {
            addCriterion("SPORTTERY_TEAM_ID in", values, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdNotIn(List<String> values) {
            addCriterion("SPORTTERY_TEAM_ID not in", values, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdBetween(String value1, String value2) {
            addCriterion("SPORTTERY_TEAM_ID between", value1, value2, "sportteryTeamId");
            return (Criteria) this;
        }

        public Criteria andSportteryTeamIdNotBetween(String value1, String value2) {
            addCriterion("SPORTTERY_TEAM_ID not between", value1, value2, "sportteryTeamId");
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