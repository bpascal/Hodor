package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccUserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccUserAccountExample() {
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

        public Criteria andUserAccountIdIsNull() {
            addCriterion("USER_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdIsNotNull() {
            addCriterion("USER_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdEqualTo(Long value) {
            addCriterion("USER_ACCOUNT_ID =", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdNotEqualTo(Long value) {
            addCriterion("USER_ACCOUNT_ID <>", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdGreaterThan(Long value) {
            addCriterion("USER_ACCOUNT_ID >", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ACCOUNT_ID >=", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdLessThan(Long value) {
            addCriterion("USER_ACCOUNT_ID <", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ACCOUNT_ID <=", value, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdIn(List<Long> values) {
            addCriterion("USER_ACCOUNT_ID in", values, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdNotIn(List<Long> values) {
            addCriterion("USER_ACCOUNT_ID not in", values, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdBetween(Long value1, Long value2) {
            addCriterion("USER_ACCOUNT_ID between", value1, value2, "userAccountId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ACCOUNT_ID not between", value1, value2, "userAccountId");
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

        public Criteria andAccountTypeIdIsNull() {
            addCriterion("ACCOUNT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdIsNotNull() {
            addCriterion("ACCOUNT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdEqualTo(Long value) {
            addCriterion("ACCOUNT_TYPE_ID =", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_TYPE_ID <>", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_TYPE_ID >", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_TYPE_ID >=", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdLessThan(Long value) {
            addCriterion("ACCOUNT_TYPE_ID <", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_TYPE_ID <=", value, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdIn(List<Long> values) {
            addCriterion("ACCOUNT_TYPE_ID in", values, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_TYPE_ID not in", values, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_TYPE_ID between", value1, value2, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_TYPE_ID not between", value1, value2, "accountTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAccountStsIsNull() {
            addCriterion("ACCOUNT_STS is null");
            return (Criteria) this;
        }

        public Criteria andAccountStsIsNotNull() {
            addCriterion("ACCOUNT_STS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStsEqualTo(String value) {
            addCriterion("ACCOUNT_STS =", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsNotEqualTo(String value) {
            addCriterion("ACCOUNT_STS <>", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsGreaterThan(String value) {
            addCriterion("ACCOUNT_STS >", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_STS >=", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsLessThan(String value) {
            addCriterion("ACCOUNT_STS <", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_STS <=", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsLike(String value) {
            addCriterion("ACCOUNT_STS like", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsNotLike(String value) {
            addCriterion("ACCOUNT_STS not like", value, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsIn(List<String> values) {
            addCriterion("ACCOUNT_STS in", values, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsNotIn(List<String> values) {
            addCriterion("ACCOUNT_STS not in", values, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsBetween(String value1, String value2) {
            addCriterion("ACCOUNT_STS between", value1, value2, "accountSts");
            return (Criteria) this;
        }

        public Criteria andAccountStsNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_STS not between", value1, value2, "accountSts");
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