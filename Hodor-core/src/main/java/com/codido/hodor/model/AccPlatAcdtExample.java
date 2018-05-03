package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccPlatAcdtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccPlatAcdtExample() {
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

        public Criteria andPlatAcdtIdIsNull() {
            addCriterion("PLAT_ACDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdIsNotNull() {
            addCriterion("PLAT_ACDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdEqualTo(Long value) {
            addCriterion("PLAT_ACDT_ID =", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdNotEqualTo(Long value) {
            addCriterion("PLAT_ACDT_ID <>", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdGreaterThan(Long value) {
            addCriterion("PLAT_ACDT_ID >", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAT_ACDT_ID >=", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdLessThan(Long value) {
            addCriterion("PLAT_ACDT_ID <", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdLessThanOrEqualTo(Long value) {
            addCriterion("PLAT_ACDT_ID <=", value, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdIn(List<Long> values) {
            addCriterion("PLAT_ACDT_ID in", values, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdNotIn(List<Long> values) {
            addCriterion("PLAT_ACDT_ID not in", values, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdBetween(Long value1, Long value2) {
            addCriterion("PLAT_ACDT_ID between", value1, value2, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAcdtIdNotBetween(Long value1, Long value2) {
            addCriterion("PLAT_ACDT_ID not between", value1, value2, "platAcdtId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdIsNull() {
            addCriterion("PLAT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdIsNotNull() {
            addCriterion("PLAT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdEqualTo(Long value) {
            addCriterion("PLAT_ACCOUNT_ID =", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdNotEqualTo(Long value) {
            addCriterion("PLAT_ACCOUNT_ID <>", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdGreaterThan(Long value) {
            addCriterion("PLAT_ACCOUNT_ID >", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAT_ACCOUNT_ID >=", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdLessThan(Long value) {
            addCriterion("PLAT_ACCOUNT_ID <", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("PLAT_ACCOUNT_ID <=", value, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdIn(List<Long> values) {
            addCriterion("PLAT_ACCOUNT_ID in", values, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdNotIn(List<Long> values) {
            addCriterion("PLAT_ACCOUNT_ID not in", values, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdBetween(Long value1, Long value2) {
            addCriterion("PLAT_ACCOUNT_ID between", value1, value2, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("PLAT_ACCOUNT_ID not between", value1, value2, "platAccountId");
            return (Criteria) this;
        }

        public Criteria andTxAmountIsNull() {
            addCriterion("TX_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTxAmountIsNotNull() {
            addCriterion("TX_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTxAmountEqualTo(BigDecimal value) {
            addCriterion("TX_AMOUNT =", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountNotEqualTo(BigDecimal value) {
            addCriterion("TX_AMOUNT <>", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountGreaterThan(BigDecimal value) {
            addCriterion("TX_AMOUNT >", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_AMOUNT >=", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountLessThan(BigDecimal value) {
            addCriterion("TX_AMOUNT <", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_AMOUNT <=", value, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountIn(List<BigDecimal> values) {
            addCriterion("TX_AMOUNT in", values, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountNotIn(List<BigDecimal> values) {
            addCriterion("TX_AMOUNT not in", values, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_AMOUNT between", value1, value2, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_AMOUNT not between", value1, value2, "txAmount");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoIsNull() {
            addCriterion("TX_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoIsNotNull() {
            addCriterion("TX_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoEqualTo(String value) {
            addCriterion("TX_ORDER_NO =", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoNotEqualTo(String value) {
            addCriterion("TX_ORDER_NO <>", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoGreaterThan(String value) {
            addCriterion("TX_ORDER_NO >", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("TX_ORDER_NO >=", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoLessThan(String value) {
            addCriterion("TX_ORDER_NO <", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoLessThanOrEqualTo(String value) {
            addCriterion("TX_ORDER_NO <=", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoLike(String value) {
            addCriterion("TX_ORDER_NO like", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoNotLike(String value) {
            addCriterion("TX_ORDER_NO not like", value, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoIn(List<String> values) {
            addCriterion("TX_ORDER_NO in", values, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoNotIn(List<String> values) {
            addCriterion("TX_ORDER_NO not in", values, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoBetween(String value1, String value2) {
            addCriterion("TX_ORDER_NO between", value1, value2, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxOrderNoNotBetween(String value1, String value2) {
            addCriterion("TX_ORDER_NO not between", value1, value2, "txOrderNo");
            return (Criteria) this;
        }

        public Criteria andTxNoIsNull() {
            addCriterion("TX_NO is null");
            return (Criteria) this;
        }

        public Criteria andTxNoIsNotNull() {
            addCriterion("TX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTxNoEqualTo(String value) {
            addCriterion("TX_NO =", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotEqualTo(String value) {
            addCriterion("TX_NO <>", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoGreaterThan(String value) {
            addCriterion("TX_NO >", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TX_NO >=", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLessThan(String value) {
            addCriterion("TX_NO <", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLessThanOrEqualTo(String value) {
            addCriterion("TX_NO <=", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLike(String value) {
            addCriterion("TX_NO like", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotLike(String value) {
            addCriterion("TX_NO not like", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoIn(List<String> values) {
            addCriterion("TX_NO in", values, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotIn(List<String> values) {
            addCriterion("TX_NO not in", values, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoBetween(String value1, String value2) {
            addCriterion("TX_NO between", value1, value2, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotBetween(String value1, String value2) {
            addCriterion("TX_NO not between", value1, value2, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxWayIsNull() {
            addCriterion("TX_WAY is null");
            return (Criteria) this;
        }

        public Criteria andTxWayIsNotNull() {
            addCriterion("TX_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andTxWayEqualTo(String value) {
            addCriterion("TX_WAY =", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayNotEqualTo(String value) {
            addCriterion("TX_WAY <>", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayGreaterThan(String value) {
            addCriterion("TX_WAY >", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayGreaterThanOrEqualTo(String value) {
            addCriterion("TX_WAY >=", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayLessThan(String value) {
            addCriterion("TX_WAY <", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayLessThanOrEqualTo(String value) {
            addCriterion("TX_WAY <=", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayLike(String value) {
            addCriterion("TX_WAY like", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayNotLike(String value) {
            addCriterion("TX_WAY not like", value, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayIn(List<String> values) {
            addCriterion("TX_WAY in", values, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayNotIn(List<String> values) {
            addCriterion("TX_WAY not in", values, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayBetween(String value1, String value2) {
            addCriterion("TX_WAY between", value1, value2, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxWayNotBetween(String value1, String value2) {
            addCriterion("TX_WAY not between", value1, value2, "txWay");
            return (Criteria) this;
        }

        public Criteria andTxTimeIsNull() {
            addCriterion("TX_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTxTimeIsNotNull() {
            addCriterion("TX_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTxTimeEqualTo(Date value) {
            addCriterion("TX_TIME =", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeNotEqualTo(Date value) {
            addCriterion("TX_TIME <>", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeGreaterThan(Date value) {
            addCriterion("TX_TIME >", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TX_TIME >=", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeLessThan(Date value) {
            addCriterion("TX_TIME <", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeLessThanOrEqualTo(Date value) {
            addCriterion("TX_TIME <=", value, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeIn(List<Date> values) {
            addCriterion("TX_TIME in", values, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeNotIn(List<Date> values) {
            addCriterion("TX_TIME not in", values, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeBetween(Date value1, Date value2) {
            addCriterion("TX_TIME between", value1, value2, "txTime");
            return (Criteria) this;
        }

        public Criteria andTxTimeNotBetween(Date value1, Date value2) {
            addCriterion("TX_TIME not between", value1, value2, "txTime");
            return (Criteria) this;
        }

        public Criteria andAcdtStsIsNull() {
            addCriterion("ACDT_STS is null");
            return (Criteria) this;
        }

        public Criteria andAcdtStsIsNotNull() {
            addCriterion("ACDT_STS is not null");
            return (Criteria) this;
        }

        public Criteria andAcdtStsEqualTo(String value) {
            addCriterion("ACDT_STS =", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsNotEqualTo(String value) {
            addCriterion("ACDT_STS <>", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsGreaterThan(String value) {
            addCriterion("ACDT_STS >", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsGreaterThanOrEqualTo(String value) {
            addCriterion("ACDT_STS >=", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsLessThan(String value) {
            addCriterion("ACDT_STS <", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsLessThanOrEqualTo(String value) {
            addCriterion("ACDT_STS <=", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsLike(String value) {
            addCriterion("ACDT_STS like", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsNotLike(String value) {
            addCriterion("ACDT_STS not like", value, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsIn(List<String> values) {
            addCriterion("ACDT_STS in", values, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsNotIn(List<String> values) {
            addCriterion("ACDT_STS not in", values, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsBetween(String value1, String value2) {
            addCriterion("ACDT_STS between", value1, value2, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtStsNotBetween(String value1, String value2) {
            addCriterion("ACDT_STS not between", value1, value2, "acdtSts");
            return (Criteria) this;
        }

        public Criteria andAcdtDescIsNull() {
            addCriterion("ACDT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAcdtDescIsNotNull() {
            addCriterion("ACDT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAcdtDescEqualTo(String value) {
            addCriterion("ACDT_DESC =", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescNotEqualTo(String value) {
            addCriterion("ACDT_DESC <>", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescGreaterThan(String value) {
            addCriterion("ACDT_DESC >", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescGreaterThanOrEqualTo(String value) {
            addCriterion("ACDT_DESC >=", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescLessThan(String value) {
            addCriterion("ACDT_DESC <", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescLessThanOrEqualTo(String value) {
            addCriterion("ACDT_DESC <=", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescLike(String value) {
            addCriterion("ACDT_DESC like", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescNotLike(String value) {
            addCriterion("ACDT_DESC not like", value, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescIn(List<String> values) {
            addCriterion("ACDT_DESC in", values, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescNotIn(List<String> values) {
            addCriterion("ACDT_DESC not in", values, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescBetween(String value1, String value2) {
            addCriterion("ACDT_DESC between", value1, value2, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtDescNotBetween(String value1, String value2) {
            addCriterion("ACDT_DESC not between", value1, value2, "acdtDesc");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeIsNull() {
            addCriterion("ACDT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeIsNotNull() {
            addCriterion("ACDT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeEqualTo(String value) {
            addCriterion("ACDT_TYPE =", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeNotEqualTo(String value) {
            addCriterion("ACDT_TYPE <>", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeGreaterThan(String value) {
            addCriterion("ACDT_TYPE >", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACDT_TYPE >=", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeLessThan(String value) {
            addCriterion("ACDT_TYPE <", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeLessThanOrEqualTo(String value) {
            addCriterion("ACDT_TYPE <=", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeLike(String value) {
            addCriterion("ACDT_TYPE like", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeNotLike(String value) {
            addCriterion("ACDT_TYPE not like", value, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeIn(List<String> values) {
            addCriterion("ACDT_TYPE in", values, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeNotIn(List<String> values) {
            addCriterion("ACDT_TYPE not in", values, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeBetween(String value1, String value2) {
            addCriterion("ACDT_TYPE between", value1, value2, "acdtType");
            return (Criteria) this;
        }

        public Criteria andAcdtTypeNotBetween(String value1, String value2) {
            addCriterion("ACDT_TYPE not between", value1, value2, "acdtType");
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