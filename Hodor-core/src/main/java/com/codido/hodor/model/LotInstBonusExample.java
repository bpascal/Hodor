package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class LotInstBonusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotInstBonusExample() {
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

        public Criteria andBonusIdIsNull() {
            addCriterion("BONUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNotNull() {
            addCriterion("BONUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBonusIdEqualTo(Long value) {
            addCriterion("BONUS_ID =", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotEqualTo(Long value) {
            addCriterion("BONUS_ID <>", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThan(Long value) {
            addCriterion("BONUS_ID >", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BONUS_ID >=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThan(Long value) {
            addCriterion("BONUS_ID <", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThanOrEqualTo(Long value) {
            addCriterion("BONUS_ID <=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIn(List<Long> values) {
            addCriterion("BONUS_ID in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotIn(List<Long> values) {
            addCriterion("BONUS_ID not in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdBetween(Long value1, Long value2) {
            addCriterion("BONUS_ID between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotBetween(Long value1, Long value2) {
            addCriterion("BONUS_ID not between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIsNull() {
            addCriterion("LOTTO_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIsNotNull() {
            addCriterion("LOTTO_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID =", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID <>", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdGreaterThan(Long value) {
            addCriterion("LOTTO_INST_ID >", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID >=", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdLessThan(Long value) {
            addCriterion("LOTTO_INST_ID <", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdLessThanOrEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID <=", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIn(List<Long> values) {
            addCriterion("LOTTO_INST_ID in", values, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotIn(List<Long> values) {
            addCriterion("LOTTO_INST_ID not in", values, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdBetween(Long value1, Long value2) {
            addCriterion("LOTTO_INST_ID between", value1, value2, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotBetween(Long value1, Long value2) {
            addCriterion("LOTTO_INST_ID not between", value1, value2, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIsNull() {
            addCriterion("LOTTO_BONUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIsNotNull() {
            addCriterion("LOTTO_BONUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID =", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID <>", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdGreaterThan(Long value) {
            addCriterion("LOTTO_BONUS_ID >", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID >=", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdLessThan(Long value) {
            addCriterion("LOTTO_BONUS_ID <", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdLessThanOrEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID <=", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIn(List<Long> values) {
            addCriterion("LOTTO_BONUS_ID in", values, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotIn(List<Long> values) {
            addCriterion("LOTTO_BONUS_ID not in", values, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdBetween(Long value1, Long value2) {
            addCriterion("LOTTO_BONUS_ID between", value1, value2, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotBetween(Long value1, Long value2) {
            addCriterion("LOTTO_BONUS_ID not between", value1, value2, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andBonusNameIsNull() {
            addCriterion("BONUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBonusNameIsNotNull() {
            addCriterion("BONUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBonusNameEqualTo(String value) {
            addCriterion("BONUS_NAME =", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameNotEqualTo(String value) {
            addCriterion("BONUS_NAME <>", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameGreaterThan(String value) {
            addCriterion("BONUS_NAME >", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_NAME >=", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameLessThan(String value) {
            addCriterion("BONUS_NAME <", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameLessThanOrEqualTo(String value) {
            addCriterion("BONUS_NAME <=", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameLike(String value) {
            addCriterion("BONUS_NAME like", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameNotLike(String value) {
            addCriterion("BONUS_NAME not like", value, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameIn(List<String> values) {
            addCriterion("BONUS_NAME in", values, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameNotIn(List<String> values) {
            addCriterion("BONUS_NAME not in", values, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameBetween(String value1, String value2) {
            addCriterion("BONUS_NAME between", value1, value2, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusNameNotBetween(String value1, String value2) {
            addCriterion("BONUS_NAME not between", value1, value2, "bonusName");
            return (Criteria) this;
        }

        public Criteria andBonusLevelIsNull() {
            addCriterion("BONUS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBonusLevelIsNotNull() {
            addCriterion("BONUS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBonusLevelEqualTo(String value) {
            addCriterion("BONUS_LEVEL =", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelNotEqualTo(String value) {
            addCriterion("BONUS_LEVEL <>", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelGreaterThan(String value) {
            addCriterion("BONUS_LEVEL >", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_LEVEL >=", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelLessThan(String value) {
            addCriterion("BONUS_LEVEL <", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelLessThanOrEqualTo(String value) {
            addCriterion("BONUS_LEVEL <=", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelLike(String value) {
            addCriterion("BONUS_LEVEL like", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelNotLike(String value) {
            addCriterion("BONUS_LEVEL not like", value, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelIn(List<String> values) {
            addCriterion("BONUS_LEVEL in", values, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelNotIn(List<String> values) {
            addCriterion("BONUS_LEVEL not in", values, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelBetween(String value1, String value2) {
            addCriterion("BONUS_LEVEL between", value1, value2, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusLevelNotBetween(String value1, String value2) {
            addCriterion("BONUS_LEVEL not between", value1, value2, "bonusLevel");
            return (Criteria) this;
        }

        public Criteria andBonusCountIsNull() {
            addCriterion("BONUS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBonusCountIsNotNull() {
            addCriterion("BONUS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBonusCountEqualTo(String value) {
            addCriterion("BONUS_COUNT =", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountNotEqualTo(String value) {
            addCriterion("BONUS_COUNT <>", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountGreaterThan(String value) {
            addCriterion("BONUS_COUNT >", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_COUNT >=", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountLessThan(String value) {
            addCriterion("BONUS_COUNT <", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountLessThanOrEqualTo(String value) {
            addCriterion("BONUS_COUNT <=", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountLike(String value) {
            addCriterion("BONUS_COUNT like", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountNotLike(String value) {
            addCriterion("BONUS_COUNT not like", value, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountIn(List<String> values) {
            addCriterion("BONUS_COUNT in", values, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountNotIn(List<String> values) {
            addCriterion("BONUS_COUNT not in", values, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountBetween(String value1, String value2) {
            addCriterion("BONUS_COUNT between", value1, value2, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusCountNotBetween(String value1, String value2) {
            addCriterion("BONUS_COUNT not between", value1, value2, "bonusCount");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtIsNull() {
            addCriterion("BONUS_PRE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtIsNotNull() {
            addCriterion("BONUS_PRE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtEqualTo(String value) {
            addCriterion("BONUS_PRE_AMT =", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtNotEqualTo(String value) {
            addCriterion("BONUS_PRE_AMT <>", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtGreaterThan(String value) {
            addCriterion("BONUS_PRE_AMT >", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_PRE_AMT >=", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtLessThan(String value) {
            addCriterion("BONUS_PRE_AMT <", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtLessThanOrEqualTo(String value) {
            addCriterion("BONUS_PRE_AMT <=", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtLike(String value) {
            addCriterion("BONUS_PRE_AMT like", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtNotLike(String value) {
            addCriterion("BONUS_PRE_AMT not like", value, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtIn(List<String> values) {
            addCriterion("BONUS_PRE_AMT in", values, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtNotIn(List<String> values) {
            addCriterion("BONUS_PRE_AMT not in", values, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtBetween(String value1, String value2) {
            addCriterion("BONUS_PRE_AMT between", value1, value2, "bonusPreAmt");
            return (Criteria) this;
        }

        public Criteria andBonusPreAmtNotBetween(String value1, String value2) {
            addCriterion("BONUS_PRE_AMT not between", value1, value2, "bonusPreAmt");
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