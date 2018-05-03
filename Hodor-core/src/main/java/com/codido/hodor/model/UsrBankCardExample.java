package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrBankCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrBankCardExample() {
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

        public Criteria andUsrBankcardIdIsNull() {
            addCriterion("USR_BANKCARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdIsNotNull() {
            addCriterion("USR_BANKCARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdEqualTo(Long value) {
            addCriterion("USR_BANKCARD_ID =", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdNotEqualTo(Long value) {
            addCriterion("USR_BANKCARD_ID <>", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdGreaterThan(Long value) {
            addCriterion("USR_BANKCARD_ID >", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_BANKCARD_ID >=", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdLessThan(Long value) {
            addCriterion("USR_BANKCARD_ID <", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_BANKCARD_ID <=", value, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdIn(List<Long> values) {
            addCriterion("USR_BANKCARD_ID in", values, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdNotIn(List<Long> values) {
            addCriterion("USR_BANKCARD_ID not in", values, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdBetween(Long value1, Long value2) {
            addCriterion("USR_BANKCARD_ID between", value1, value2, "usrBankcardId");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_BANKCARD_ID not between", value1, value2, "usrBankcardId");
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

        public Criteria andUsrBankcardStsIsNull() {
            addCriterion("USR_BANKCARD_STS is null");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsIsNotNull() {
            addCriterion("USR_BANKCARD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsEqualTo(String value) {
            addCriterion("USR_BANKCARD_STS =", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsNotEqualTo(String value) {
            addCriterion("USR_BANKCARD_STS <>", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsGreaterThan(String value) {
            addCriterion("USR_BANKCARD_STS >", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsGreaterThanOrEqualTo(String value) {
            addCriterion("USR_BANKCARD_STS >=", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsLessThan(String value) {
            addCriterion("USR_BANKCARD_STS <", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsLessThanOrEqualTo(String value) {
            addCriterion("USR_BANKCARD_STS <=", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsLike(String value) {
            addCriterion("USR_BANKCARD_STS like", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsNotLike(String value) {
            addCriterion("USR_BANKCARD_STS not like", value, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsIn(List<String> values) {
            addCriterion("USR_BANKCARD_STS in", values, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsNotIn(List<String> values) {
            addCriterion("USR_BANKCARD_STS not in", values, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsBetween(String value1, String value2) {
            addCriterion("USR_BANKCARD_STS between", value1, value2, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andUsrBankcardStsNotBetween(String value1, String value2) {
            addCriterion("USR_BANKCARD_STS not between", value1, value2, "usrBankcardSts");
            return (Criteria) this;
        }

        public Criteria andBandTimeIsNull() {
            addCriterion("BAND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBandTimeIsNotNull() {
            addCriterion("BAND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBandTimeEqualTo(Date value) {
            addCriterion("BAND_TIME =", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeNotEqualTo(Date value) {
            addCriterion("BAND_TIME <>", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeGreaterThan(Date value) {
            addCriterion("BAND_TIME >", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BAND_TIME >=", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeLessThan(Date value) {
            addCriterion("BAND_TIME <", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeLessThanOrEqualTo(Date value) {
            addCriterion("BAND_TIME <=", value, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeIn(List<Date> values) {
            addCriterion("BAND_TIME in", values, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeNotIn(List<Date> values) {
            addCriterion("BAND_TIME not in", values, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeBetween(Date value1, Date value2) {
            addCriterion("BAND_TIME between", value1, value2, "bandTime");
            return (Criteria) this;
        }

        public Criteria andBandTimeNotBetween(Date value1, Date value2) {
            addCriterion("BAND_TIME not between", value1, value2, "bandTime");
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