package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrTagsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrTagsExample() {
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

        public Criteria andUserTagIdIsNull() {
            addCriterion("USER_TAG_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserTagIdIsNotNull() {
            addCriterion("USER_TAG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserTagIdEqualTo(Long value) {
            addCriterion("USER_TAG_ID =", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotEqualTo(Long value) {
            addCriterion("USER_TAG_ID <>", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdGreaterThan(Long value) {
            addCriterion("USER_TAG_ID >", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_TAG_ID >=", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdLessThan(Long value) {
            addCriterion("USER_TAG_ID <", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_TAG_ID <=", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdIn(List<Long> values) {
            addCriterion("USER_TAG_ID in", values, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotIn(List<Long> values) {
            addCriterion("USER_TAG_ID not in", values, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdBetween(Long value1, Long value2) {
            addCriterion("USER_TAG_ID between", value1, value2, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_TAG_ID not between", value1, value2, "userTagId");
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

        public Criteria andTagIdIsNull() {
            addCriterion("TAG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("TAG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Long value) {
            addCriterion("TAG_ID =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Long value) {
            addCriterion("TAG_ID <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Long value) {
            addCriterion("TAG_ID >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TAG_ID >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Long value) {
            addCriterion("TAG_ID <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Long value) {
            addCriterion("TAG_ID <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Long> values) {
            addCriterion("TAG_ID in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Long> values) {
            addCriterion("TAG_ID not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Long value1, Long value2) {
            addCriterion("TAG_ID between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Long value1, Long value2) {
            addCriterion("TAG_ID not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagTimeIsNull() {
            addCriterion("TAG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTagTimeIsNotNull() {
            addCriterion("TAG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTagTimeEqualTo(Date value) {
            addCriterion("TAG_TIME =", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeNotEqualTo(Date value) {
            addCriterion("TAG_TIME <>", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeGreaterThan(Date value) {
            addCriterion("TAG_TIME >", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TAG_TIME >=", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeLessThan(Date value) {
            addCriterion("TAG_TIME <", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeLessThanOrEqualTo(Date value) {
            addCriterion("TAG_TIME <=", value, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeIn(List<Date> values) {
            addCriterion("TAG_TIME in", values, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeNotIn(List<Date> values) {
            addCriterion("TAG_TIME not in", values, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeBetween(Date value1, Date value2) {
            addCriterion("TAG_TIME between", value1, value2, "tagTime");
            return (Criteria) this;
        }

        public Criteria andTagTimeNotBetween(Date value1, Date value2) {
            addCriterion("TAG_TIME not between", value1, value2, "tagTime");
            return (Criteria) this;
        }

        public Criteria andUserTagStsIsNull() {
            addCriterion("USER_TAG_STS is null");
            return (Criteria) this;
        }

        public Criteria andUserTagStsIsNotNull() {
            addCriterion("USER_TAG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andUserTagStsEqualTo(String value) {
            addCriterion("USER_TAG_STS =", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsNotEqualTo(String value) {
            addCriterion("USER_TAG_STS <>", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsGreaterThan(String value) {
            addCriterion("USER_TAG_STS >", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TAG_STS >=", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsLessThan(String value) {
            addCriterion("USER_TAG_STS <", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsLessThanOrEqualTo(String value) {
            addCriterion("USER_TAG_STS <=", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsLike(String value) {
            addCriterion("USER_TAG_STS like", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsNotLike(String value) {
            addCriterion("USER_TAG_STS not like", value, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsIn(List<String> values) {
            addCriterion("USER_TAG_STS in", values, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsNotIn(List<String> values) {
            addCriterion("USER_TAG_STS not in", values, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsBetween(String value1, String value2) {
            addCriterion("USER_TAG_STS between", value1, value2, "userTagSts");
            return (Criteria) this;
        }

        public Criteria andUserTagStsNotBetween(String value1, String value2) {
            addCriterion("USER_TAG_STS not between", value1, value2, "userTagSts");
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