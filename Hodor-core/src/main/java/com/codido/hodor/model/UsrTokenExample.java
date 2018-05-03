package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrTokenExample() {
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

        public Criteria andTokenIdIsNull() {
            addCriterion("TOKEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("TOKEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(Long value) {
            addCriterion("TOKEN_ID =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(Long value) {
            addCriterion("TOKEN_ID <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(Long value) {
            addCriterion("TOKEN_ID >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOKEN_ID >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(Long value) {
            addCriterion("TOKEN_ID <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(Long value) {
            addCriterion("TOKEN_ID <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<Long> values) {
            addCriterion("TOKEN_ID in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<Long> values) {
            addCriterion("TOKEN_ID not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(Long value1, Long value2) {
            addCriterion("TOKEN_ID between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(Long value1, Long value2) {
            addCriterion("TOKEN_ID not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTokenStsIsNull() {
            addCriterion("TOKEN_STS is null");
            return (Criteria) this;
        }

        public Criteria andTokenStsIsNotNull() {
            addCriterion("TOKEN_STS is not null");
            return (Criteria) this;
        }

        public Criteria andTokenStsEqualTo(String value) {
            addCriterion("TOKEN_STS =", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsNotEqualTo(String value) {
            addCriterion("TOKEN_STS <>", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsGreaterThan(String value) {
            addCriterion("TOKEN_STS >", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN_STS >=", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsLessThan(String value) {
            addCriterion("TOKEN_STS <", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsLessThanOrEqualTo(String value) {
            addCriterion("TOKEN_STS <=", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsLike(String value) {
            addCriterion("TOKEN_STS like", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsNotLike(String value) {
            addCriterion("TOKEN_STS not like", value, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsIn(List<String> values) {
            addCriterion("TOKEN_STS in", values, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsNotIn(List<String> values) {
            addCriterion("TOKEN_STS not in", values, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsBetween(String value1, String value2) {
            addCriterion("TOKEN_STS between", value1, value2, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenStsNotBetween(String value1, String value2) {
            addCriterion("TOKEN_STS not between", value1, value2, "tokenSts");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeIsNull() {
            addCriterion("TOKEN_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeIsNotNull() {
            addCriterion("TOKEN_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeEqualTo(Date value) {
            addCriterion("TOKEN_CREATE_TIME =", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeNotEqualTo(Date value) {
            addCriterion("TOKEN_CREATE_TIME <>", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeGreaterThan(Date value) {
            addCriterion("TOKEN_CREATE_TIME >", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TOKEN_CREATE_TIME >=", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeLessThan(Date value) {
            addCriterion("TOKEN_CREATE_TIME <", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("TOKEN_CREATE_TIME <=", value, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeIn(List<Date> values) {
            addCriterion("TOKEN_CREATE_TIME in", values, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeNotIn(List<Date> values) {
            addCriterion("TOKEN_CREATE_TIME not in", values, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeBetween(Date value1, Date value2) {
            addCriterion("TOKEN_CREATE_TIME between", value1, value2, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("TOKEN_CREATE_TIME not between", value1, value2, "tokenCreateTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeIsNull() {
            addCriterion("TOKEN_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeIsNotNull() {
            addCriterion("TOKEN_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeEqualTo(Date value) {
            addCriterion("TOKEN_END_TIME =", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeNotEqualTo(Date value) {
            addCriterion("TOKEN_END_TIME <>", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeGreaterThan(Date value) {
            addCriterion("TOKEN_END_TIME >", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TOKEN_END_TIME >=", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeLessThan(Date value) {
            addCriterion("TOKEN_END_TIME <", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("TOKEN_END_TIME <=", value, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeIn(List<Date> values) {
            addCriterion("TOKEN_END_TIME in", values, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeNotIn(List<Date> values) {
            addCriterion("TOKEN_END_TIME not in", values, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeBetween(Date value1, Date value2) {
            addCriterion("TOKEN_END_TIME between", value1, value2, "tokenEndTime");
            return (Criteria) this;
        }

        public Criteria andTokenEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("TOKEN_END_TIME not between", value1, value2, "tokenEndTime");
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