package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class MatchPlayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchPlayExample() {
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

        public Criteria andMatchPlayIdIsNull() {
            addCriterion("MATCH_PLAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdIsNotNull() {
            addCriterion("MATCH_PLAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID =", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID <>", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdGreaterThan(Long value) {
            addCriterion("MATCH_PLAY_ID >", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID >=", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdLessThan(Long value) {
            addCriterion("MATCH_PLAY_ID <", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID <=", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdIn(List<Long> values) {
            addCriterion("MATCH_PLAY_ID in", values, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotIn(List<Long> values) {
            addCriterion("MATCH_PLAY_ID not in", values, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_ID between", value1, value2, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_ID not between", value1, value2, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNull() {
            addCriterion("PLAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNotNull() {
            addCriterion("PLAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlayNameEqualTo(String value) {
            addCriterion("PLAY_NAME =", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotEqualTo(String value) {
            addCriterion("PLAY_NAME <>", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThan(String value) {
            addCriterion("PLAY_NAME >", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_NAME >=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThan(String value) {
            addCriterion("PLAY_NAME <", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThanOrEqualTo(String value) {
            addCriterion("PLAY_NAME <=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLike(String value) {
            addCriterion("PLAY_NAME like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotLike(String value) {
            addCriterion("PLAY_NAME not like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameIn(List<String> values) {
            addCriterion("PLAY_NAME in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotIn(List<String> values) {
            addCriterion("PLAY_NAME not in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameBetween(String value1, String value2) {
            addCriterion("PLAY_NAME between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotBetween(String value1, String value2) {
            addCriterion("PLAY_NAME not between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdIsNull() {
            addCriterion("PLAY_LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdIsNotNull() {
            addCriterion("PLAY_LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdEqualTo(Long value) {
            addCriterion("PLAY_LOTTO_ID =", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdNotEqualTo(Long value) {
            addCriterion("PLAY_LOTTO_ID <>", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdGreaterThan(Long value) {
            addCriterion("PLAY_LOTTO_ID >", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAY_LOTTO_ID >=", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdLessThan(Long value) {
            addCriterion("PLAY_LOTTO_ID <", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("PLAY_LOTTO_ID <=", value, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdIn(List<Long> values) {
            addCriterion("PLAY_LOTTO_ID in", values, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdNotIn(List<Long> values) {
            addCriterion("PLAY_LOTTO_ID not in", values, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdBetween(Long value1, Long value2) {
            addCriterion("PLAY_LOTTO_ID between", value1, value2, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("PLAY_LOTTO_ID not between", value1, value2, "playLottoId");
            return (Criteria) this;
        }

        public Criteria andPlayCodeIsNull() {
            addCriterion("PLAY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlayCodeIsNotNull() {
            addCriterion("PLAY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCodeEqualTo(String value) {
            addCriterion("PLAY_CODE =", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeNotEqualTo(String value) {
            addCriterion("PLAY_CODE <>", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeGreaterThan(String value) {
            addCriterion("PLAY_CODE >", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_CODE >=", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeLessThan(String value) {
            addCriterion("PLAY_CODE <", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAY_CODE <=", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeLike(String value) {
            addCriterion("PLAY_CODE like", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeNotLike(String value) {
            addCriterion("PLAY_CODE not like", value, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeIn(List<String> values) {
            addCriterion("PLAY_CODE in", values, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeNotIn(List<String> values) {
            addCriterion("PLAY_CODE not in", values, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeBetween(String value1, String value2) {
            addCriterion("PLAY_CODE between", value1, value2, "playCode");
            return (Criteria) this;
        }

        public Criteria andPlayCodeNotBetween(String value1, String value2) {
            addCriterion("PLAY_CODE not between", value1, value2, "playCode");
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