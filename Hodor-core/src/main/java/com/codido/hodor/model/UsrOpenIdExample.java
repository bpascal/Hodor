package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class UsrOpenIdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrOpenIdExample() {
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

        public Criteria andRelaIdIsNull() {
            addCriterion("RELA_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelaIdIsNotNull() {
            addCriterion("RELA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelaIdEqualTo(Long value) {
            addCriterion("RELA_ID =", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotEqualTo(Long value) {
            addCriterion("RELA_ID <>", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThan(Long value) {
            addCriterion("RELA_ID >", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RELA_ID >=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThan(Long value) {
            addCriterion("RELA_ID <", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThanOrEqualTo(Long value) {
            addCriterion("RELA_ID <=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdIn(List<Long> values) {
            addCriterion("RELA_ID in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotIn(List<Long> values) {
            addCriterion("RELA_ID not in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdBetween(Long value1, Long value2) {
            addCriterion("RELA_ID between", value1, value2, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotBetween(Long value1, Long value2) {
            addCriterion("RELA_ID not between", value1, value2, "relaId");
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

        public Criteria andWxOpenIdIsNull() {
            addCriterion("WX_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("WX_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("WX_OPEN_ID =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("WX_OPEN_ID <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("WX_OPEN_ID >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("WX_OPEN_ID <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("WX_OPEN_ID like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("WX_OPEN_ID not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("WX_OPEN_ID in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("WX_OPEN_ID not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID not between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeIsNull() {
            addCriterion("WX_APP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeIsNotNull() {
            addCriterion("WX_APP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeEqualTo(String value) {
            addCriterion("WX_APP_TYPE =", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeNotEqualTo(String value) {
            addCriterion("WX_APP_TYPE <>", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeGreaterThan(String value) {
            addCriterion("WX_APP_TYPE >", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WX_APP_TYPE >=", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeLessThan(String value) {
            addCriterion("WX_APP_TYPE <", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeLessThanOrEqualTo(String value) {
            addCriterion("WX_APP_TYPE <=", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeLike(String value) {
            addCriterion("WX_APP_TYPE like", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeNotLike(String value) {
            addCriterion("WX_APP_TYPE not like", value, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeIn(List<String> values) {
            addCriterion("WX_APP_TYPE in", values, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeNotIn(List<String> values) {
            addCriterion("WX_APP_TYPE not in", values, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeBetween(String value1, String value2) {
            addCriterion("WX_APP_TYPE between", value1, value2, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxAppTypeNotBetween(String value1, String value2) {
            addCriterion("WX_APP_TYPE not between", value1, value2, "wxAppType");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIsNull() {
            addCriterion("WX_SESSION_KEY is null");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIsNotNull() {
            addCriterion("WX_SESSION_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyEqualTo(String value) {
            addCriterion("WX_SESSION_KEY =", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotEqualTo(String value) {
            addCriterion("WX_SESSION_KEY <>", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyGreaterThan(String value) {
            addCriterion("WX_SESSION_KEY >", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("WX_SESSION_KEY >=", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLessThan(String value) {
            addCriterion("WX_SESSION_KEY <", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("WX_SESSION_KEY <=", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyLike(String value) {
            addCriterion("WX_SESSION_KEY like", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotLike(String value) {
            addCriterion("WX_SESSION_KEY not like", value, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyIn(List<String> values) {
            addCriterion("WX_SESSION_KEY in", values, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotIn(List<String> values) {
            addCriterion("WX_SESSION_KEY not in", values, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyBetween(String value1, String value2) {
            addCriterion("WX_SESSION_KEY between", value1, value2, "wxSessionKey");
            return (Criteria) this;
        }

        public Criteria andWxSessionKeyNotBetween(String value1, String value2) {
            addCriterion("WX_SESSION_KEY not between", value1, value2, "wxSessionKey");
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