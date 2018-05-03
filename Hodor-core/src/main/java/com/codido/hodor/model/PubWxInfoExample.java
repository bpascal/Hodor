package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class PubWxInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PubWxInfoExample() {
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

        public Criteria andWxInfoIdIsNull() {
            addCriterion("WX_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdIsNotNull() {
            addCriterion("WX_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdEqualTo(Long value) {
            addCriterion("WX_INFO_ID =", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdNotEqualTo(Long value) {
            addCriterion("WX_INFO_ID <>", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdGreaterThan(Long value) {
            addCriterion("WX_INFO_ID >", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WX_INFO_ID >=", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdLessThan(Long value) {
            addCriterion("WX_INFO_ID <", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("WX_INFO_ID <=", value, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdIn(List<Long> values) {
            addCriterion("WX_INFO_ID in", values, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdNotIn(List<Long> values) {
            addCriterion("WX_INFO_ID not in", values, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdBetween(Long value1, Long value2) {
            addCriterion("WX_INFO_ID between", value1, value2, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("WX_INFO_ID not between", value1, value2, "wxInfoId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdIsNull() {
            addCriterion("WX_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxAppIdIsNotNull() {
            addCriterion("WX_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxAppIdEqualTo(String value) {
            addCriterion("WX_APP_ID =", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdNotEqualTo(String value) {
            addCriterion("WX_APP_ID <>", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdGreaterThan(String value) {
            addCriterion("WX_APP_ID >", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("WX_APP_ID >=", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdLessThan(String value) {
            addCriterion("WX_APP_ID <", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdLessThanOrEqualTo(String value) {
            addCriterion("WX_APP_ID <=", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdLike(String value) {
            addCriterion("WX_APP_ID like", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdNotLike(String value) {
            addCriterion("WX_APP_ID not like", value, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdIn(List<String> values) {
            addCriterion("WX_APP_ID in", values, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdNotIn(List<String> values) {
            addCriterion("WX_APP_ID not in", values, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdBetween(String value1, String value2) {
            addCriterion("WX_APP_ID between", value1, value2, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppIdNotBetween(String value1, String value2) {
            addCriterion("WX_APP_ID not between", value1, value2, "wxAppId");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretIsNull() {
            addCriterion("WX_APP_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretIsNotNull() {
            addCriterion("WX_APP_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretEqualTo(String value) {
            addCriterion("WX_APP_SECRET =", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretNotEqualTo(String value) {
            addCriterion("WX_APP_SECRET <>", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretGreaterThan(String value) {
            addCriterion("WX_APP_SECRET >", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("WX_APP_SECRET >=", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretLessThan(String value) {
            addCriterion("WX_APP_SECRET <", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretLessThanOrEqualTo(String value) {
            addCriterion("WX_APP_SECRET <=", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretLike(String value) {
            addCriterion("WX_APP_SECRET like", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretNotLike(String value) {
            addCriterion("WX_APP_SECRET not like", value, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretIn(List<String> values) {
            addCriterion("WX_APP_SECRET in", values, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretNotIn(List<String> values) {
            addCriterion("WX_APP_SECRET not in", values, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretBetween(String value1, String value2) {
            addCriterion("WX_APP_SECRET between", value1, value2, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAppSecretNotBetween(String value1, String value2) {
            addCriterion("WX_APP_SECRET not between", value1, value2, "wxAppSecret");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIsNull() {
            addCriterion("WX_ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIsNotNull() {
            addCriterion("WX_ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN =", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN <>", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenGreaterThan(String value) {
            addCriterion("WX_ACCESS_TOKEN >", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN >=", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLessThan(String value) {
            addCriterion("WX_ACCESS_TOKEN <", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN <=", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLike(String value) {
            addCriterion("WX_ACCESS_TOKEN like", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotLike(String value) {
            addCriterion("WX_ACCESS_TOKEN not like", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIn(List<String> values) {
            addCriterion("WX_ACCESS_TOKEN in", values, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotIn(List<String> values) {
            addCriterion("WX_ACCESS_TOKEN not in", values, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenBetween(String value1, String value2) {
            addCriterion("WX_ACCESS_TOKEN between", value1, value2, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotBetween(String value1, String value2) {
            addCriterion("WX_ACCESS_TOKEN not between", value1, value2, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeIsNull() {
            addCriterion("ACCESS_TOKEN_EXP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeIsNotNull() {
            addCriterion("ACCESS_TOKEN_EXP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeEqualTo(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME =", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeNotEqualTo(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME <>", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeGreaterThan(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME >", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME >=", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeLessThan(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME <", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_TOKEN_EXP_TIME <=", value, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeIn(List<Integer> values) {
            addCriterion("ACCESS_TOKEN_EXP_TIME in", values, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeNotIn(List<Integer> values) {
            addCriterion("ACCESS_TOKEN_EXP_TIME not in", values, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_TOKEN_EXP_TIME between", value1, value2, "accessTokenExpTime");
            return (Criteria) this;
        }

        public Criteria andAccessTokenExpTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_TOKEN_EXP_TIME not between", value1, value2, "accessTokenExpTime");
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