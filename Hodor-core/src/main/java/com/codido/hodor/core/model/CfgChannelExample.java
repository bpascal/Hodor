package com.codido.hodor.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CfgChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgChannelExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelStsIsNull() {
            addCriterion("CHANNEL_STS is null");
            return (Criteria) this;
        }

        public Criteria andChannelStsIsNotNull() {
            addCriterion("CHANNEL_STS is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStsEqualTo(String value) {
            addCriterion("CHANNEL_STS =", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsNotEqualTo(String value) {
            addCriterion("CHANNEL_STS <>", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsGreaterThan(String value) {
            addCriterion("CHANNEL_STS >", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_STS >=", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsLessThan(String value) {
            addCriterion("CHANNEL_STS <", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_STS <=", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsLike(String value) {
            addCriterion("CHANNEL_STS like", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsNotLike(String value) {
            addCriterion("CHANNEL_STS not like", value, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsIn(List<String> values) {
            addCriterion("CHANNEL_STS in", values, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsNotIn(List<String> values) {
            addCriterion("CHANNEL_STS not in", values, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsBetween(String value1, String value2) {
            addCriterion("CHANNEL_STS between", value1, value2, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelStsNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_STS not between", value1, value2, "channelSts");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("CHANNEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("CHANNEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("CHANNEL_TYPE =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("CHANNEL_TYPE >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("CHANNEL_TYPE <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("CHANNEL_TYPE like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("CHANNEL_TYPE not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("CHANNEL_TYPE in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("CHANNEL_TYPE not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeIsNull() {
            addCriterion("CHANNEL_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeIsNotNull() {
            addCriterion("CHANNEL_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeEqualTo(Date value) {
            addCriterion("CHANNEL_CREATE_TIME =", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeNotEqualTo(Date value) {
            addCriterion("CHANNEL_CREATE_TIME <>", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeGreaterThan(Date value) {
            addCriterion("CHANNEL_CREATE_TIME >", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANNEL_CREATE_TIME >=", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeLessThan(Date value) {
            addCriterion("CHANNEL_CREATE_TIME <", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHANNEL_CREATE_TIME <=", value, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeIn(List<Date> values) {
            addCriterion("CHANNEL_CREATE_TIME in", values, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeNotIn(List<Date> values) {
            addCriterion("CHANNEL_CREATE_TIME not in", values, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CHANNEL_CREATE_TIME between", value1, value2, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHANNEL_CREATE_TIME not between", value1, value2, "channelCreateTime");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountIsNull() {
            addCriterion("CHANNEL_RECHARGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountIsNotNull() {
            addCriterion("CHANNEL_RECHARGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT =", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT <>", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT >", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT >=", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountLessThan(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT <", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT <=", value, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT in", values, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT not in", values, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT between", value1, value2, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_RECHARGE_AMOUNT not between", value1, value2, "channelRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountIsNull() {
            addCriterion("CHANNEL_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountIsNotNull() {
            addCriterion("CHANNEL_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT =", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT <>", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT >", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT >=", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountLessThan(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT <", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_PAY_AMOUNT <=", value, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_PAY_AMOUNT in", values, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_PAY_AMOUNT not in", values, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_PAY_AMOUNT between", value1, value2, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_PAY_AMOUNT not between", value1, value2, "channelPayAmount");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceIsNull() {
            addCriterion("CHANNEL_CURRENT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceIsNotNull() {
            addCriterion("CHANNEL_CURRENT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE =", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE <>", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE >", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE >=", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceLessThan(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE <", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CURRENT_BALANCE <=", value, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_CURRENT_BALANCE in", values, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_CURRENT_BALANCE not in", values, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_CURRENT_BALANCE between", value1, value2, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelCurrentBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_CURRENT_BALANCE not between", value1, value2, "channelCurrentBalance");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleIsNull() {
            addCriterion("CHANNEL_INTERFACE_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleIsNotNull() {
            addCriterion("CHANNEL_INTERFACE_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleEqualTo(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE =", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleNotEqualTo(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE <>", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleGreaterThan(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE >", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE >=", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleLessThan(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE <", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE <=", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleLike(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE like", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleNotLike(String value) {
            addCriterion("CHANNEL_INTERFACE_STYLE not like", value, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleIn(List<String> values) {
            addCriterion("CHANNEL_INTERFACE_STYLE in", values, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleNotIn(List<String> values) {
            addCriterion("CHANNEL_INTERFACE_STYLE not in", values, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleBetween(String value1, String value2) {
            addCriterion("CHANNEL_INTERFACE_STYLE between", value1, value2, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andChannelInterfaceStyleNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_INTERFACE_STYLE not between", value1, value2, "channelInterfaceStyle");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlIsNull() {
            addCriterion("ORDER_ACTION_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlIsNotNull() {
            addCriterion("ORDER_ACTION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlEqualTo(String value) {
            addCriterion("ORDER_ACTION_URL =", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlNotEqualTo(String value) {
            addCriterion("ORDER_ACTION_URL <>", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlGreaterThan(String value) {
            addCriterion("ORDER_ACTION_URL >", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ACTION_URL >=", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlLessThan(String value) {
            addCriterion("ORDER_ACTION_URL <", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ACTION_URL <=", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlLike(String value) {
            addCriterion("ORDER_ACTION_URL like", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlNotLike(String value) {
            addCriterion("ORDER_ACTION_URL not like", value, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlIn(List<String> values) {
            addCriterion("ORDER_ACTION_URL in", values, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlNotIn(List<String> values) {
            addCriterion("ORDER_ACTION_URL not in", values, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlBetween(String value1, String value2) {
            addCriterion("ORDER_ACTION_URL between", value1, value2, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderActionUrlNotBetween(String value1, String value2) {
            addCriterion("ORDER_ACTION_URL not between", value1, value2, "orderActionUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlIsNull() {
            addCriterion("ORDER_QUERY_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlIsNotNull() {
            addCriterion("ORDER_QUERY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlEqualTo(String value) {
            addCriterion("ORDER_QUERY_URL =", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlNotEqualTo(String value) {
            addCriterion("ORDER_QUERY_URL <>", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlGreaterThan(String value) {
            addCriterion("ORDER_QUERY_URL >", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_QUERY_URL >=", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlLessThan(String value) {
            addCriterion("ORDER_QUERY_URL <", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDER_QUERY_URL <=", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlLike(String value) {
            addCriterion("ORDER_QUERY_URL like", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlNotLike(String value) {
            addCriterion("ORDER_QUERY_URL not like", value, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlIn(List<String> values) {
            addCriterion("ORDER_QUERY_URL in", values, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlNotIn(List<String> values) {
            addCriterion("ORDER_QUERY_URL not in", values, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlBetween(String value1, String value2) {
            addCriterion("ORDER_QUERY_URL between", value1, value2, "orderQueryUrl");
            return (Criteria) this;
        }

        public Criteria andOrderQueryUrlNotBetween(String value1, String value2) {
            addCriterion("ORDER_QUERY_URL not between", value1, value2, "orderQueryUrl");
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