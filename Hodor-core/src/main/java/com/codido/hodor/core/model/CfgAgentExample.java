package com.codido.hodor.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CfgAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgAgentExample() {
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

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("AGENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("AGENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("AGENT_NAME =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("AGENT_NAME <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("AGENT_NAME >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_NAME >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("AGENT_NAME <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("AGENT_NAME <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("AGENT_NAME like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("AGENT_NAME not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("AGENT_NAME in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("AGENT_NAME not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("AGENT_NAME between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("AGENT_NAME not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeIsNull() {
            addCriterion("AGENT_TICKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeIsNotNull() {
            addCriterion("AGENT_TICKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeEqualTo(String value) {
            addCriterion("AGENT_TICKET_TYPE =", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeNotEqualTo(String value) {
            addCriterion("AGENT_TICKET_TYPE <>", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeGreaterThan(String value) {
            addCriterion("AGENT_TICKET_TYPE >", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_TICKET_TYPE >=", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeLessThan(String value) {
            addCriterion("AGENT_TICKET_TYPE <", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("AGENT_TICKET_TYPE <=", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeLike(String value) {
            addCriterion("AGENT_TICKET_TYPE like", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeNotLike(String value) {
            addCriterion("AGENT_TICKET_TYPE not like", value, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeIn(List<String> values) {
            addCriterion("AGENT_TICKET_TYPE in", values, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeNotIn(List<String> values) {
            addCriterion("AGENT_TICKET_TYPE not in", values, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeBetween(String value1, String value2) {
            addCriterion("AGENT_TICKET_TYPE between", value1, value2, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentTicketTypeNotBetween(String value1, String value2) {
            addCriterion("AGENT_TICKET_TYPE not between", value1, value2, "agentTicketType");
            return (Criteria) this;
        }

        public Criteria andAgentStsIsNull() {
            addCriterion("AGENT_STS is null");
            return (Criteria) this;
        }

        public Criteria andAgentStsIsNotNull() {
            addCriterion("AGENT_STS is not null");
            return (Criteria) this;
        }

        public Criteria andAgentStsEqualTo(String value) {
            addCriterion("AGENT_STS =", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsNotEqualTo(String value) {
            addCriterion("AGENT_STS <>", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsGreaterThan(String value) {
            addCriterion("AGENT_STS >", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_STS >=", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsLessThan(String value) {
            addCriterion("AGENT_STS <", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsLessThanOrEqualTo(String value) {
            addCriterion("AGENT_STS <=", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsLike(String value) {
            addCriterion("AGENT_STS like", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsNotLike(String value) {
            addCriterion("AGENT_STS not like", value, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsIn(List<String> values) {
            addCriterion("AGENT_STS in", values, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsNotIn(List<String> values) {
            addCriterion("AGENT_STS not in", values, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsBetween(String value1, String value2) {
            addCriterion("AGENT_STS between", value1, value2, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentStsNotBetween(String value1, String value2) {
            addCriterion("AGENT_STS not between", value1, value2, "agentSts");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeIsNull() {
            addCriterion("AGENT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeIsNotNull() {
            addCriterion("AGENT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeEqualTo(String value) {
            addCriterion("AGENT_CREATE_TIME =", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeNotEqualTo(String value) {
            addCriterion("AGENT_CREATE_TIME <>", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeGreaterThan(String value) {
            addCriterion("AGENT_CREATE_TIME >", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CREATE_TIME >=", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeLessThan(String value) {
            addCriterion("AGENT_CREATE_TIME <", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CREATE_TIME <=", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeLike(String value) {
            addCriterion("AGENT_CREATE_TIME like", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeNotLike(String value) {
            addCriterion("AGENT_CREATE_TIME not like", value, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeIn(List<String> values) {
            addCriterion("AGENT_CREATE_TIME in", values, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeNotIn(List<String> values) {
            addCriterion("AGENT_CREATE_TIME not in", values, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeBetween(String value1, String value2) {
            addCriterion("AGENT_CREATE_TIME between", value1, value2, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAgentCreateTimeNotBetween(String value1, String value2) {
            addCriterion("AGENT_CREATE_TIME not between", value1, value2, "agentCreateTime");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIsNull() {
            addCriterion("TOTAL_CHARGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIsNotNull() {
            addCriterion("TOTAL_CHARGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT =", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT <>", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT >", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT >=", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT <", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CHARGE_AMOUNT <=", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_CHARGE_AMOUNT in", values, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_CHARGE_AMOUNT not in", values, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_CHARGE_AMOUNT between", value1, value2, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_CHARGE_AMOUNT not between", value1, value2, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountIsNull() {
            addCriterion("TOTAL_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountIsNotNull() {
            addCriterion("TOTAL_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT =", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT <>", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT >", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT >=", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT <", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PAY_AMOUNT <=", value, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PAY_AMOUNT in", values, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PAY_AMOUNT not in", values, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PAY_AMOUNT between", value1, value2, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PAY_AMOUNT not between", value1, value2, "totalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIsNull() {
            addCriterion("CURRENT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIsNotNull() {
            addCriterion("CURRENT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceEqualTo(BigDecimal value) {
            addCriterion("CURRENT_BALANCE =", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotEqualTo(BigDecimal value) {
            addCriterion("CURRENT_BALANCE <>", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceGreaterThan(BigDecimal value) {
            addCriterion("CURRENT_BALANCE >", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_BALANCE >=", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceLessThan(BigDecimal value) {
            addCriterion("CURRENT_BALANCE <", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_BALANCE <=", value, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceIn(List<BigDecimal> values) {
            addCriterion("CURRENT_BALANCE in", values, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotIn(List<BigDecimal> values) {
            addCriterion("CURRENT_BALANCE not in", values, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_BALANCE between", value1, value2, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_BALANCE not between", value1, value2, "currentBalance");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressIsNull() {
            addCriterion("AGENT_IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressIsNotNull() {
            addCriterion("AGENT_IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressEqualTo(String value) {
            addCriterion("AGENT_IP_ADDRESS =", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressNotEqualTo(String value) {
            addCriterion("AGENT_IP_ADDRESS <>", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressGreaterThan(String value) {
            addCriterion("AGENT_IP_ADDRESS >", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_IP_ADDRESS >=", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressLessThan(String value) {
            addCriterion("AGENT_IP_ADDRESS <", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressLessThanOrEqualTo(String value) {
            addCriterion("AGENT_IP_ADDRESS <=", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressLike(String value) {
            addCriterion("AGENT_IP_ADDRESS like", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressNotLike(String value) {
            addCriterion("AGENT_IP_ADDRESS not like", value, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressIn(List<String> values) {
            addCriterion("AGENT_IP_ADDRESS in", values, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressNotIn(List<String> values) {
            addCriterion("AGENT_IP_ADDRESS not in", values, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressBetween(String value1, String value2) {
            addCriterion("AGENT_IP_ADDRESS between", value1, value2, "agentIpAddress");
            return (Criteria) this;
        }

        public Criteria andAgentIpAddressNotBetween(String value1, String value2) {
            addCriterion("AGENT_IP_ADDRESS not between", value1, value2, "agentIpAddress");
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