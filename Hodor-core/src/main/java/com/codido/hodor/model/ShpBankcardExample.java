package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShpBankcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShpBankcardExample() {
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

        public Criteria andShopBankcardIdIsNull() {
            addCriterion("SHOP_BANKCARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdIsNotNull() {
            addCriterion("SHOP_BANKCARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdEqualTo(Long value) {
            addCriterion("SHOP_BANKCARD_ID =", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdNotEqualTo(Long value) {
            addCriterion("SHOP_BANKCARD_ID <>", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdGreaterThan(Long value) {
            addCriterion("SHOP_BANKCARD_ID >", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_BANKCARD_ID >=", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdLessThan(Long value) {
            addCriterion("SHOP_BANKCARD_ID <", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_BANKCARD_ID <=", value, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdIn(List<Long> values) {
            addCriterion("SHOP_BANKCARD_ID in", values, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdNotIn(List<Long> values) {
            addCriterion("SHOP_BANKCARD_ID not in", values, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_BANKCARD_ID between", value1, value2, "shopBankcardId");
            return (Criteria) this;
        }

        public Criteria andShopBankcardIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_BANKCARD_ID not between", value1, value2, "shopBankcardId");
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

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Long value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Long value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Long value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Long value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Long value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Long> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Long> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Long value1, Long value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Long value1, Long value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsIsNull() {
            addCriterion("SHOP_BANKCARD_STS is null");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsIsNotNull() {
            addCriterion("SHOP_BANKCARD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsEqualTo(String value) {
            addCriterion("SHOP_BANKCARD_STS =", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsNotEqualTo(String value) {
            addCriterion("SHOP_BANKCARD_STS <>", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsGreaterThan(String value) {
            addCriterion("SHOP_BANKCARD_STS >", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_BANKCARD_STS >=", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsLessThan(String value) {
            addCriterion("SHOP_BANKCARD_STS <", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsLessThanOrEqualTo(String value) {
            addCriterion("SHOP_BANKCARD_STS <=", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsLike(String value) {
            addCriterion("SHOP_BANKCARD_STS like", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsNotLike(String value) {
            addCriterion("SHOP_BANKCARD_STS not like", value, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsIn(List<String> values) {
            addCriterion("SHOP_BANKCARD_STS in", values, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsNotIn(List<String> values) {
            addCriterion("SHOP_BANKCARD_STS not in", values, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsBetween(String value1, String value2) {
            addCriterion("SHOP_BANKCARD_STS between", value1, value2, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andShopBankcardStsNotBetween(String value1, String value2) {
            addCriterion("SHOP_BANKCARD_STS not between", value1, value2, "shopBankcardSts");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameIsNull() {
            addCriterion("BANK_CARD_OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameIsNotNull() {
            addCriterion("BANK_CARD_OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameEqualTo(String value) {
            addCriterion("BANK_CARD_OWNER_NAME =", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameNotEqualTo(String value) {
            addCriterion("BANK_CARD_OWNER_NAME <>", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameGreaterThan(String value) {
            addCriterion("BANK_CARD_OWNER_NAME >", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_OWNER_NAME >=", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameLessThan(String value) {
            addCriterion("BANK_CARD_OWNER_NAME <", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_OWNER_NAME <=", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameLike(String value) {
            addCriterion("BANK_CARD_OWNER_NAME like", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameNotLike(String value) {
            addCriterion("BANK_CARD_OWNER_NAME not like", value, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameIn(List<String> values) {
            addCriterion("BANK_CARD_OWNER_NAME in", values, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameNotIn(List<String> values) {
            addCriterion("BANK_CARD_OWNER_NAME not in", values, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameBetween(String value1, String value2) {
            addCriterion("BANK_CARD_OWNER_NAME between", value1, value2, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBankCardOwnerNameNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_OWNER_NAME not between", value1, value2, "bankCardOwnerName");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("BIND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("BIND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Date value) {
            addCriterion("BIND_TIME =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Date value) {
            addCriterion("BIND_TIME <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Date value) {
            addCriterion("BIND_TIME >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BIND_TIME >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Date value) {
            addCriterion("BIND_TIME <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Date value) {
            addCriterion("BIND_TIME <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Date> values) {
            addCriterion("BIND_TIME in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Date> values) {
            addCriterion("BIND_TIME not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Date value1, Date value2) {
            addCriterion("BIND_TIME between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Date value1, Date value2) {
            addCriterion("BIND_TIME not between", value1, value2, "bindTime");
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