package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdRefundExample() {
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

        public Criteria andRefundIdIsNull() {
            addCriterion("REFUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("REFUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Long value) {
            addCriterion("REFUND_ID =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Long value) {
            addCriterion("REFUND_ID <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Long value) {
            addCriterion("REFUND_ID >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUND_ID >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Long value) {
            addCriterion("REFUND_ID <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Long value) {
            addCriterion("REFUND_ID <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Long> values) {
            addCriterion("REFUND_ID in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Long> values) {
            addCriterion("REFUND_ID not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Long value1, Long value2) {
            addCriterion("REFUND_ID between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Long value1, Long value2) {
            addCriterion("REFUND_ID not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNull() {
            addCriterion("REFUND_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNotNull() {
            addCriterion("REFUND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNoEqualTo(String value) {
            addCriterion("REFUND_NO =", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotEqualTo(String value) {
            addCriterion("REFUND_NO <>", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThan(String value) {
            addCriterion("REFUND_NO >", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_NO >=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThan(String value) {
            addCriterion("REFUND_NO <", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThanOrEqualTo(String value) {
            addCriterion("REFUND_NO <=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLike(String value) {
            addCriterion("REFUND_NO like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotLike(String value) {
            addCriterion("REFUND_NO not like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIn(List<String> values) {
            addCriterion("REFUND_NO in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotIn(List<String> values) {
            addCriterion("REFUND_NO not in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoBetween(String value1, String value2) {
            addCriterion("REFUND_NO between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotBetween(String value1, String value2) {
            addCriterion("REFUND_NO not between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoIsNull() {
            addCriterion("PAY_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoIsNotNull() {
            addCriterion("PAY_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoEqualTo(String value) {
            addCriterion("PAY_ORDER_NO =", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoNotEqualTo(String value) {
            addCriterion("PAY_ORDER_NO <>", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoGreaterThan(String value) {
            addCriterion("PAY_ORDER_NO >", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_NO >=", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoLessThan(String value) {
            addCriterion("PAY_ORDER_NO <", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_NO <=", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoLike(String value) {
            addCriterion("PAY_ORDER_NO like", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoNotLike(String value) {
            addCriterion("PAY_ORDER_NO not like", value, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoIn(List<String> values) {
            addCriterion("PAY_ORDER_NO in", values, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoNotIn(List<String> values) {
            addCriterion("PAY_ORDER_NO not in", values, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_NO between", value1, value2, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOrderNoNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_NO not between", value1, value2, "payOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeIsNull() {
            addCriterion("REFUND_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeIsNotNull() {
            addCriterion("REFUND_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeEqualTo(Date value) {
            addCriterion("REFUND_CREATE_TIME =", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeNotEqualTo(Date value) {
            addCriterion("REFUND_CREATE_TIME <>", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeGreaterThan(Date value) {
            addCriterion("REFUND_CREATE_TIME >", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_CREATE_TIME >=", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeLessThan(Date value) {
            addCriterion("REFUND_CREATE_TIME <", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_CREATE_TIME <=", value, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeIn(List<Date> values) {
            addCriterion("REFUND_CREATE_TIME in", values, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeNotIn(List<Date> values) {
            addCriterion("REFUND_CREATE_TIME not in", values, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_CREATE_TIME between", value1, value2, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_CREATE_TIME not between", value1, value2, "refundCreateTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("REFUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("REFUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("REFUND_TIME =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("REFUND_TIME <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("REFUND_TIME >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_TIME >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("REFUND_TIME <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_TIME <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("REFUND_TIME in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("REFUND_TIME not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_TIME between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_TIME not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNull() {
            addCriterion("REFUND_STS is null");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNotNull() {
            addCriterion("REFUND_STS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStsEqualTo(String value) {
            addCriterion("REFUND_STS =", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotEqualTo(String value) {
            addCriterion("REFUND_STS <>", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThan(String value) {
            addCriterion("REFUND_STS >", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_STS >=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThan(String value) {
            addCriterion("REFUND_STS <", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThanOrEqualTo(String value) {
            addCriterion("REFUND_STS <=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLike(String value) {
            addCriterion("REFUND_STS like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotLike(String value) {
            addCriterion("REFUND_STS not like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsIn(List<String> values) {
            addCriterion("REFUND_STS in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotIn(List<String> values) {
            addCriterion("REFUND_STS not in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsBetween(String value1, String value2) {
            addCriterion("REFUND_STS between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotBetween(String value1, String value2) {
            addCriterion("REFUND_STS not between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdIsNull() {
            addCriterion("PAY_REFUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdIsNotNull() {
            addCriterion("PAY_REFUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdEqualTo(String value) {
            addCriterion("PAY_REFUND_ID =", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdNotEqualTo(String value) {
            addCriterion("PAY_REFUND_ID <>", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdGreaterThan(String value) {
            addCriterion("PAY_REFUND_ID >", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_ID >=", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdLessThan(String value) {
            addCriterion("PAY_REFUND_ID <", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_ID <=", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdLike(String value) {
            addCriterion("PAY_REFUND_ID like", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdNotLike(String value) {
            addCriterion("PAY_REFUND_ID not like", value, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdIn(List<String> values) {
            addCriterion("PAY_REFUND_ID in", values, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdNotIn(List<String> values) {
            addCriterion("PAY_REFUND_ID not in", values, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_ID between", value1, value2, "payRefundId");
            return (Criteria) this;
        }

        public Criteria andPayRefundIdNotBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_ID not between", value1, value2, "payRefundId");
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