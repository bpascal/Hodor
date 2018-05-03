package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccWithdrawOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccWithdrawOrderExample() {
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

        public Criteria andWithdrawOrderIdIsNull() {
            addCriterion("WITHDRAW_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdIsNotNull() {
            addCriterion("WITHDRAW_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdEqualTo(Long value) {
            addCriterion("WITHDRAW_ORDER_ID =", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdNotEqualTo(Long value) {
            addCriterion("WITHDRAW_ORDER_ID <>", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdGreaterThan(Long value) {
            addCriterion("WITHDRAW_ORDER_ID >", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WITHDRAW_ORDER_ID >=", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdLessThan(Long value) {
            addCriterion("WITHDRAW_ORDER_ID <", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("WITHDRAW_ORDER_ID <=", value, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdIn(List<Long> values) {
            addCriterion("WITHDRAW_ORDER_ID in", values, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdNotIn(List<Long> values) {
            addCriterion("WITHDRAW_ORDER_ID not in", values, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdBetween(Long value1, Long value2) {
            addCriterion("WITHDRAW_ORDER_ID between", value1, value2, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("WITHDRAW_ORDER_ID not between", value1, value2, "withdrawOrderId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIsNull() {
            addCriterion("WITHDRAW_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIsNotNull() {
            addCriterion("WITHDRAW_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_NO =", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_NO <>", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoGreaterThan(String value) {
            addCriterion("WITHDRAW_ORDER_NO >", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_NO >=", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLessThan(String value) {
            addCriterion("WITHDRAW_ORDER_NO <", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_NO <=", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLike(String value) {
            addCriterion("WITHDRAW_ORDER_NO like", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotLike(String value) {
            addCriterion("WITHDRAW_ORDER_NO not like", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIn(List<String> values) {
            addCriterion("WITHDRAW_ORDER_NO in", values, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotIn(List<String> values) {
            addCriterion("WITHDRAW_ORDER_NO not in", values, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoBetween(String value1, String value2) {
            addCriterion("WITHDRAW_ORDER_NO between", value1, value2, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotBetween(String value1, String value2) {
            addCriterion("WITHDRAW_ORDER_NO not between", value1, value2, "withdrawOrderNo");
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

        public Criteria andWithdrawTypeIsNull() {
            addCriterion("WITHDRAW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIsNotNull() {
            addCriterion("WITHDRAW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE =", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE <>", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThan(String value) {
            addCriterion("WITHDRAW_TYPE >", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE >=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThan(String value) {
            addCriterion("WITHDRAW_TYPE <", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE <=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLike(String value) {
            addCriterion("WITHDRAW_TYPE like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotLike(String value) {
            addCriterion("WITHDRAW_TYPE not like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIn(List<String> values) {
            addCriterion("WITHDRAW_TYPE in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotIn(List<String> values) {
            addCriterion("WITHDRAW_TYPE not in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeBetween(String value1, String value2) {
            addCriterion("WITHDRAW_TYPE between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotBetween(String value1, String value2) {
            addCriterion("WITHDRAW_TYPE not between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsIsNull() {
            addCriterion("WITHDRAW_ORDER_STS is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsIsNotNull() {
            addCriterion("WITHDRAW_ORDER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_STS =", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsNotEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_STS <>", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsGreaterThan(String value) {
            addCriterion("WITHDRAW_ORDER_STS >", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_STS >=", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsLessThan(String value) {
            addCriterion("WITHDRAW_ORDER_STS <", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_ORDER_STS <=", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsLike(String value) {
            addCriterion("WITHDRAW_ORDER_STS like", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsNotLike(String value) {
            addCriterion("WITHDRAW_ORDER_STS not like", value, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsIn(List<String> values) {
            addCriterion("WITHDRAW_ORDER_STS in", values, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsNotIn(List<String> values) {
            addCriterion("WITHDRAW_ORDER_STS not in", values, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsBetween(String value1, String value2) {
            addCriterion("WITHDRAW_ORDER_STS between", value1, value2, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderStsNotBetween(String value1, String value2) {
            addCriterion("WITHDRAW_ORDER_STS not between", value1, value2, "withdrawOrderSts");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtIsNull() {
            addCriterion("WITHDRAW_AMT is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtIsNotNull() {
            addCriterion("WITHDRAW_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_AMT =", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtNotEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_AMT <>", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtGreaterThan(BigDecimal value) {
            addCriterion("WITHDRAW_AMT >", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_AMT >=", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtLessThan(BigDecimal value) {
            addCriterion("WITHDRAW_AMT <", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_AMT <=", value, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtIn(List<BigDecimal> values) {
            addCriterion("WITHDRAW_AMT in", values, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtNotIn(List<BigDecimal> values) {
            addCriterion("WITHDRAW_AMT not in", values, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAW_AMT between", value1, value2, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAW_AMT not between", value1, value2, "withdrawAmt");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoIsNull() {
            addCriterion("USER_BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoIsNotNull() {
            addCriterion("USER_BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoEqualTo(String value) {
            addCriterion("USER_BANK_CARD_NO =", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoNotEqualTo(String value) {
            addCriterion("USER_BANK_CARD_NO <>", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoGreaterThan(String value) {
            addCriterion("USER_BANK_CARD_NO >", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_BANK_CARD_NO >=", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoLessThan(String value) {
            addCriterion("USER_BANK_CARD_NO <", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("USER_BANK_CARD_NO <=", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoLike(String value) {
            addCriterion("USER_BANK_CARD_NO like", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoNotLike(String value) {
            addCriterion("USER_BANK_CARD_NO not like", value, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoIn(List<String> values) {
            addCriterion("USER_BANK_CARD_NO in", values, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoNotIn(List<String> values) {
            addCriterion("USER_BANK_CARD_NO not in", values, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoBetween(String value1, String value2) {
            addCriterion("USER_BANK_CARD_NO between", value1, value2, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardNoNotBetween(String value1, String value2) {
            addCriterion("USER_BANK_CARD_NO not between", value1, value2, "userBankCardNo");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdIsNull() {
            addCriterion("USER_BANK_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdIsNotNull() {
            addCriterion("USER_BANK_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdEqualTo(Long value) {
            addCriterion("USER_BANK_CARD_ID =", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdNotEqualTo(Long value) {
            addCriterion("USER_BANK_CARD_ID <>", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdGreaterThan(Long value) {
            addCriterion("USER_BANK_CARD_ID >", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_BANK_CARD_ID >=", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdLessThan(Long value) {
            addCriterion("USER_BANK_CARD_ID <", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_BANK_CARD_ID <=", value, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdIn(List<Long> values) {
            addCriterion("USER_BANK_CARD_ID in", values, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdNotIn(List<Long> values) {
            addCriterion("USER_BANK_CARD_ID not in", values, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdBetween(Long value1, Long value2) {
            addCriterion("USER_BANK_CARD_ID between", value1, value2, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andUserBankCardIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_BANK_CARD_ID not between", value1, value2, "userBankCardId");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_TIME not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME not between", value1, value2, "payTime");
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