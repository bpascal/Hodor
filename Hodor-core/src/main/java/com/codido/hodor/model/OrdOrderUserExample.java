package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class OrdOrderUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderUserExample() {
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

        public Criteria andOrderUserInstIdIsNull() {
            addCriterion("ORDER_USER_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdIsNotNull() {
            addCriterion("ORDER_USER_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdEqualTo(Long value) {
            addCriterion("ORDER_USER_INST_ID =", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdNotEqualTo(Long value) {
            addCriterion("ORDER_USER_INST_ID <>", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdGreaterThan(Long value) {
            addCriterion("ORDER_USER_INST_ID >", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_USER_INST_ID >=", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdLessThan(Long value) {
            addCriterion("ORDER_USER_INST_ID <", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_USER_INST_ID <=", value, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdIn(List<Long> values) {
            addCriterion("ORDER_USER_INST_ID in", values, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdNotIn(List<Long> values) {
            addCriterion("ORDER_USER_INST_ID not in", values, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_USER_INST_ID between", value1, value2, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderUserInstIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_USER_INST_ID not between", value1, value2, "orderUserInstId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
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

        public Criteria andOrderUserTypeIsNull() {
            addCriterion("ORDER_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeIsNotNull() {
            addCriterion("ORDER_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeEqualTo(String value) {
            addCriterion("ORDER_USER_TYPE =", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeNotEqualTo(String value) {
            addCriterion("ORDER_USER_TYPE <>", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeGreaterThan(String value) {
            addCriterion("ORDER_USER_TYPE >", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_USER_TYPE >=", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeLessThan(String value) {
            addCriterion("ORDER_USER_TYPE <", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_USER_TYPE <=", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeLike(String value) {
            addCriterion("ORDER_USER_TYPE like", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeNotLike(String value) {
            addCriterion("ORDER_USER_TYPE not like", value, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeIn(List<String> values) {
            addCriterion("ORDER_USER_TYPE in", values, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeNotIn(List<String> values) {
            addCriterion("ORDER_USER_TYPE not in", values, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeBetween(String value1, String value2) {
            addCriterion("ORDER_USER_TYPE between", value1, value2, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_USER_TYPE not between", value1, value2, "orderUserType");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsIsNull() {
            addCriterion("ORDER_USER_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsIsNotNull() {
            addCriterion("ORDER_USER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsEqualTo(String value) {
            addCriterion("ORDER_USER_STS =", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsNotEqualTo(String value) {
            addCriterion("ORDER_USER_STS <>", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsGreaterThan(String value) {
            addCriterion("ORDER_USER_STS >", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_USER_STS >=", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsLessThan(String value) {
            addCriterion("ORDER_USER_STS <", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_USER_STS <=", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsLike(String value) {
            addCriterion("ORDER_USER_STS like", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsNotLike(String value) {
            addCriterion("ORDER_USER_STS not like", value, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsIn(List<String> values) {
            addCriterion("ORDER_USER_STS in", values, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsNotIn(List<String> values) {
            addCriterion("ORDER_USER_STS not in", values, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsBetween(String value1, String value2) {
            addCriterion("ORDER_USER_STS between", value1, value2, "orderUserSts");
            return (Criteria) this;
        }

        public Criteria andOrderUserStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_USER_STS not between", value1, value2, "orderUserSts");
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