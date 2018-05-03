package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccPayOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccPayOrderExample() {
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

        public Criteria andPayOrderIdIsNull() {
            addCriterion("PAY_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNotNull() {
            addCriterion("PAY_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdEqualTo(Long value) {
            addCriterion("PAY_ORDER_ID =", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotEqualTo(Long value) {
            addCriterion("PAY_ORDER_ID <>", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThan(Long value) {
            addCriterion("PAY_ORDER_ID >", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_ORDER_ID >=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThan(Long value) {
            addCriterion("PAY_ORDER_ID <", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("PAY_ORDER_ID <=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIn(List<Long> values) {
            addCriterion("PAY_ORDER_ID in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotIn(List<Long> values) {
            addCriterion("PAY_ORDER_ID not in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdBetween(Long value1, Long value2) {
            addCriterion("PAY_ORDER_ID between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("PAY_ORDER_ID not between", value1, value2, "payOrderId");
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

        public Criteria andPayOrderTypeIsNull() {
            addCriterion("PAY_ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeIsNotNull() {
            addCriterion("PAY_ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeEqualTo(String value) {
            addCriterion("PAY_ORDER_TYPE =", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeNotEqualTo(String value) {
            addCriterion("PAY_ORDER_TYPE <>", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeGreaterThan(String value) {
            addCriterion("PAY_ORDER_TYPE >", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_TYPE >=", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeLessThan(String value) {
            addCriterion("PAY_ORDER_TYPE <", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_TYPE <=", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeLike(String value) {
            addCriterion("PAY_ORDER_TYPE like", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeNotLike(String value) {
            addCriterion("PAY_ORDER_TYPE not like", value, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeIn(List<String> values) {
            addCriterion("PAY_ORDER_TYPE in", values, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeNotIn(List<String> values) {
            addCriterion("PAY_ORDER_TYPE not in", values, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_TYPE between", value1, value2, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayOrderTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_TYPE not between", value1, value2, "payOrderType");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNull() {
            addCriterion("PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNotNull() {
            addCriterion("PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmtEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT =", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <>", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThan(BigDecimal value) {
            addCriterion("PAY_AMT >", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT >=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThan(BigDecimal value) {
            addCriterion("PAY_AMT <", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT not in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT not between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsIsNull() {
            addCriterion("PAY_ORDER_STS is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsIsNotNull() {
            addCriterion("PAY_ORDER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsEqualTo(String value) {
            addCriterion("PAY_ORDER_STS =", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsNotEqualTo(String value) {
            addCriterion("PAY_ORDER_STS <>", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsGreaterThan(String value) {
            addCriterion("PAY_ORDER_STS >", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_STS >=", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsLessThan(String value) {
            addCriterion("PAY_ORDER_STS <", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_STS <=", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsLike(String value) {
            addCriterion("PAY_ORDER_STS like", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsNotLike(String value) {
            addCriterion("PAY_ORDER_STS not like", value, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsIn(List<String> values) {
            addCriterion("PAY_ORDER_STS in", values, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsNotIn(List<String> values) {
            addCriterion("PAY_ORDER_STS not in", values, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_STS between", value1, value2, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderStsNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_STS not between", value1, value2, "payOrderSts");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeIsNull() {
            addCriterion("PAY_ORDER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeIsNotNull() {
            addCriterion("PAY_ORDER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeEqualTo(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME =", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME <>", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeGreaterThan(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME >", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME >=", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeLessThan(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME <", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_ORDER_CREATE_TIME <=", value, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeIn(List<Date> values) {
            addCriterion("PAY_ORDER_CREATE_TIME in", values, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("PAY_ORDER_CREATE_TIME not in", values, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_ORDER_CREATE_TIME between", value1, value2, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_ORDER_CREATE_TIME not between", value1, value2, "payOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeIsNull() {
            addCriterion("PAY_ORDER_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeIsNotNull() {
            addCriterion("PAY_ORDER_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeEqualTo(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME =", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeNotEqualTo(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME <>", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeGreaterThan(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME >", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME >=", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeLessThan(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME <", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_ORDER_PAY_TIME <=", value, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeIn(List<Date> values) {
            addCriterion("PAY_ORDER_PAY_TIME in", values, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeNotIn(List<Date> values) {
            addCriterion("PAY_ORDER_PAY_TIME not in", values, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_ORDER_PAY_TIME between", value1, value2, "payOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_ORDER_PAY_TIME not between", value1, value2, "payOrderPayTime");
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

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
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