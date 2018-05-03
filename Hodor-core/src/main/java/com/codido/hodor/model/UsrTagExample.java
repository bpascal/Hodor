package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class UsrTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrTagExample() {
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

        public Criteria andTagNameIsNull() {
            addCriterion("TAG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("TAG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("TAG_NAME =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("TAG_NAME <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("TAG_NAME >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_NAME >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("TAG_NAME <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("TAG_NAME <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("TAG_NAME like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("TAG_NAME not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("TAG_NAME in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("TAG_NAME not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("TAG_NAME between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("TAG_NAME not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagDescIsNull() {
            addCriterion("TAG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTagDescIsNotNull() {
            addCriterion("TAG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTagDescEqualTo(String value) {
            addCriterion("TAG_DESC =", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescNotEqualTo(String value) {
            addCriterion("TAG_DESC <>", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescGreaterThan(String value) {
            addCriterion("TAG_DESC >", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_DESC >=", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescLessThan(String value) {
            addCriterion("TAG_DESC <", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescLessThanOrEqualTo(String value) {
            addCriterion("TAG_DESC <=", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescLike(String value) {
            addCriterion("TAG_DESC like", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescNotLike(String value) {
            addCriterion("TAG_DESC not like", value, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescIn(List<String> values) {
            addCriterion("TAG_DESC in", values, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescNotIn(List<String> values) {
            addCriterion("TAG_DESC not in", values, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescBetween(String value1, String value2) {
            addCriterion("TAG_DESC between", value1, value2, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagDescNotBetween(String value1, String value2) {
            addCriterion("TAG_DESC not between", value1, value2, "tagDesc");
            return (Criteria) this;
        }

        public Criteria andTagStsIsNull() {
            addCriterion("TAG_STS is null");
            return (Criteria) this;
        }

        public Criteria andTagStsIsNotNull() {
            addCriterion("TAG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andTagStsEqualTo(String value) {
            addCriterion("TAG_STS =", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsNotEqualTo(String value) {
            addCriterion("TAG_STS <>", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsGreaterThan(String value) {
            addCriterion("TAG_STS >", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_STS >=", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsLessThan(String value) {
            addCriterion("TAG_STS <", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsLessThanOrEqualTo(String value) {
            addCriterion("TAG_STS <=", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsLike(String value) {
            addCriterion("TAG_STS like", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsNotLike(String value) {
            addCriterion("TAG_STS not like", value, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsIn(List<String> values) {
            addCriterion("TAG_STS in", values, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsNotIn(List<String> values) {
            addCriterion("TAG_STS not in", values, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsBetween(String value1, String value2) {
            addCriterion("TAG_STS between", value1, value2, "tagSts");
            return (Criteria) this;
        }

        public Criteria andTagStsNotBetween(String value1, String value2) {
            addCriterion("TAG_STS not between", value1, value2, "tagSts");
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