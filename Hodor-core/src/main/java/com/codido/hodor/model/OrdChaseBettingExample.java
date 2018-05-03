package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class OrdChaseBettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdChaseBettingExample() {
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

        public Criteria andChaseBettingIdIsNull() {
            addCriterion("CHASE_BETTING_ID is null");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdIsNotNull() {
            addCriterion("CHASE_BETTING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdEqualTo(Long value) {
            addCriterion("CHASE_BETTING_ID =", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdNotEqualTo(Long value) {
            addCriterion("CHASE_BETTING_ID <>", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdGreaterThan(Long value) {
            addCriterion("CHASE_BETTING_ID >", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHASE_BETTING_ID >=", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdLessThan(Long value) {
            addCriterion("CHASE_BETTING_ID <", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdLessThanOrEqualTo(Long value) {
            addCriterion("CHASE_BETTING_ID <=", value, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdIn(List<Long> values) {
            addCriterion("CHASE_BETTING_ID in", values, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdNotIn(List<Long> values) {
            addCriterion("CHASE_BETTING_ID not in", values, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdBetween(Long value1, Long value2) {
            addCriterion("CHASE_BETTING_ID between", value1, value2, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseBettingIdNotBetween(Long value1, Long value2) {
            addCriterion("CHASE_BETTING_ID not between", value1, value2, "chaseBettingId");
            return (Criteria) this;
        }

        public Criteria andChaseNoIsNull() {
            addCriterion("CHASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andChaseNoIsNotNull() {
            addCriterion("CHASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChaseNoEqualTo(String value) {
            addCriterion("CHASE_NO =", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotEqualTo(String value) {
            addCriterion("CHASE_NO <>", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoGreaterThan(String value) {
            addCriterion("CHASE_NO >", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHASE_NO >=", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLessThan(String value) {
            addCriterion("CHASE_NO <", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLessThanOrEqualTo(String value) {
            addCriterion("CHASE_NO <=", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLike(String value) {
            addCriterion("CHASE_NO like", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotLike(String value) {
            addCriterion("CHASE_NO not like", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoIn(List<String> values) {
            addCriterion("CHASE_NO in", values, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotIn(List<String> values) {
            addCriterion("CHASE_NO not in", values, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoBetween(String value1, String value2) {
            addCriterion("CHASE_NO between", value1, value2, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotBetween(String value1, String value2) {
            addCriterion("CHASE_NO not between", value1, value2, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChooseNumberIsNull() {
            addCriterion("CHOOSE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andChooseNumberIsNotNull() {
            addCriterion("CHOOSE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andChooseNumberEqualTo(String value) {
            addCriterion("CHOOSE_NUMBER =", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberNotEqualTo(String value) {
            addCriterion("CHOOSE_NUMBER <>", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberGreaterThan(String value) {
            addCriterion("CHOOSE_NUMBER >", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CHOOSE_NUMBER >=", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberLessThan(String value) {
            addCriterion("CHOOSE_NUMBER <", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberLessThanOrEqualTo(String value) {
            addCriterion("CHOOSE_NUMBER <=", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberLike(String value) {
            addCriterion("CHOOSE_NUMBER like", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberNotLike(String value) {
            addCriterion("CHOOSE_NUMBER not like", value, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberIn(List<String> values) {
            addCriterion("CHOOSE_NUMBER in", values, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberNotIn(List<String> values) {
            addCriterion("CHOOSE_NUMBER not in", values, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberBetween(String value1, String value2) {
            addCriterion("CHOOSE_NUMBER between", value1, value2, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andChooseNumberNotBetween(String value1, String value2) {
            addCriterion("CHOOSE_NUMBER not between", value1, value2, "chooseNumber");
            return (Criteria) this;
        }

        public Criteria andBettingTypeIsNull() {
            addCriterion("BETTING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBettingTypeIsNotNull() {
            addCriterion("BETTING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBettingTypeEqualTo(String value) {
            addCriterion("BETTING_TYPE =", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeNotEqualTo(String value) {
            addCriterion("BETTING_TYPE <>", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeGreaterThan(String value) {
            addCriterion("BETTING_TYPE >", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BETTING_TYPE >=", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeLessThan(String value) {
            addCriterion("BETTING_TYPE <", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeLessThanOrEqualTo(String value) {
            addCriterion("BETTING_TYPE <=", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeLike(String value) {
            addCriterion("BETTING_TYPE like", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeNotLike(String value) {
            addCriterion("BETTING_TYPE not like", value, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeIn(List<String> values) {
            addCriterion("BETTING_TYPE in", values, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeNotIn(List<String> values) {
            addCriterion("BETTING_TYPE not in", values, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeBetween(String value1, String value2) {
            addCriterion("BETTING_TYPE between", value1, value2, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingTypeNotBetween(String value1, String value2) {
            addCriterion("BETTING_TYPE not between", value1, value2, "bettingType");
            return (Criteria) this;
        }

        public Criteria andBettingCountsIsNull() {
            addCriterion("BETTING_COUNTS is null");
            return (Criteria) this;
        }

        public Criteria andBettingCountsIsNotNull() {
            addCriterion("BETTING_COUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andBettingCountsEqualTo(Integer value) {
            addCriterion("BETTING_COUNTS =", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsNotEqualTo(Integer value) {
            addCriterion("BETTING_COUNTS <>", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsGreaterThan(Integer value) {
            addCriterion("BETTING_COUNTS >", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("BETTING_COUNTS >=", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsLessThan(Integer value) {
            addCriterion("BETTING_COUNTS <", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsLessThanOrEqualTo(Integer value) {
            addCriterion("BETTING_COUNTS <=", value, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsIn(List<Integer> values) {
            addCriterion("BETTING_COUNTS in", values, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsNotIn(List<Integer> values) {
            addCriterion("BETTING_COUNTS not in", values, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsBetween(Integer value1, Integer value2) {
            addCriterion("BETTING_COUNTS between", value1, value2, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("BETTING_COUNTS not between", value1, value2, "bettingCounts");
            return (Criteria) this;
        }

        public Criteria andBettingAmtIsNull() {
            addCriterion("BETTING_AMT is null");
            return (Criteria) this;
        }

        public Criteria andBettingAmtIsNotNull() {
            addCriterion("BETTING_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andBettingAmtEqualTo(Integer value) {
            addCriterion("BETTING_AMT =", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtNotEqualTo(Integer value) {
            addCriterion("BETTING_AMT <>", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtGreaterThan(Integer value) {
            addCriterion("BETTING_AMT >", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("BETTING_AMT >=", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtLessThan(Integer value) {
            addCriterion("BETTING_AMT <", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtLessThanOrEqualTo(Integer value) {
            addCriterion("BETTING_AMT <=", value, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtIn(List<Integer> values) {
            addCriterion("BETTING_AMT in", values, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtNotIn(List<Integer> values) {
            addCriterion("BETTING_AMT not in", values, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtBetween(Integer value1, Integer value2) {
            addCriterion("BETTING_AMT between", value1, value2, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andBettingAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("BETTING_AMT not between", value1, value2, "bettingAmt");
            return (Criteria) this;
        }

        public Criteria andNumberTimesIsNull() {
            addCriterion("NUMBER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andNumberTimesIsNotNull() {
            addCriterion("NUMBER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andNumberTimesEqualTo(Integer value) {
            addCriterion("NUMBER_TIMES =", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesNotEqualTo(Integer value) {
            addCriterion("NUMBER_TIMES <>", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesGreaterThan(Integer value) {
            addCriterion("NUMBER_TIMES >", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMBER_TIMES >=", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesLessThan(Integer value) {
            addCriterion("NUMBER_TIMES <", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesLessThanOrEqualTo(Integer value) {
            addCriterion("NUMBER_TIMES <=", value, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesIn(List<Integer> values) {
            addCriterion("NUMBER_TIMES in", values, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesNotIn(List<Integer> values) {
            addCriterion("NUMBER_TIMES not in", values, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesBetween(Integer value1, Integer value2) {
            addCriterion("NUMBER_TIMES between", value1, value2, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andNumberTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMBER_TIMES not between", value1, value2, "numberTimes");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsIsNull() {
            addCriterion("BETTING_INST_STS is null");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsIsNotNull() {
            addCriterion("BETTING_INST_STS is not null");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsEqualTo(String value) {
            addCriterion("BETTING_INST_STS =", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsNotEqualTo(String value) {
            addCriterion("BETTING_INST_STS <>", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsGreaterThan(String value) {
            addCriterion("BETTING_INST_STS >", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsGreaterThanOrEqualTo(String value) {
            addCriterion("BETTING_INST_STS >=", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsLessThan(String value) {
            addCriterion("BETTING_INST_STS <", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsLessThanOrEqualTo(String value) {
            addCriterion("BETTING_INST_STS <=", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsLike(String value) {
            addCriterion("BETTING_INST_STS like", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsNotLike(String value) {
            addCriterion("BETTING_INST_STS not like", value, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsIn(List<String> values) {
            addCriterion("BETTING_INST_STS in", values, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsNotIn(List<String> values) {
            addCriterion("BETTING_INST_STS not in", values, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsBetween(String value1, String value2) {
            addCriterion("BETTING_INST_STS between", value1, value2, "bettingInstSts");
            return (Criteria) this;
        }

        public Criteria andBettingInstStsNotBetween(String value1, String value2) {
            addCriterion("BETTING_INST_STS not between", value1, value2, "bettingInstSts");
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