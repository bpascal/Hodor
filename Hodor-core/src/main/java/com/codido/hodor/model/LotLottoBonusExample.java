package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class LotLottoBonusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotLottoBonusExample() {
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

        public Criteria andLottoIdIsNull() {
            addCriterion("LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andLottoIdIsNotNull() {
            addCriterion("LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLottoIdEqualTo(Long value) {
            addCriterion("LOTTO_ID =", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdNotEqualTo(Long value) {
            addCriterion("LOTTO_ID <>", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdGreaterThan(Long value) {
            addCriterion("LOTTO_ID >", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTO_ID >=", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdLessThan(Long value) {
            addCriterion("LOTTO_ID <", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("LOTTO_ID <=", value, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdIn(List<Long> values) {
            addCriterion("LOTTO_ID in", values, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdNotIn(List<Long> values) {
            addCriterion("LOTTO_ID not in", values, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdBetween(Long value1, Long value2) {
            addCriterion("LOTTO_ID between", value1, value2, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("LOTTO_ID not between", value1, value2, "lottoId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameIsNull() {
            addCriterion("LOTTO_BONUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameIsNotNull() {
            addCriterion("LOTTO_BONUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameEqualTo(String value) {
            addCriterion("LOTTO_BONUS_NAME =", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_NAME <>", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_NAME >", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_NAME >=", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameLessThan(String value) {
            addCriterion("LOTTO_BONUS_NAME <", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_NAME <=", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameLike(String value) {
            addCriterion("LOTTO_BONUS_NAME like", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameNotLike(String value) {
            addCriterion("LOTTO_BONUS_NAME not like", value, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameIn(List<String> values) {
            addCriterion("LOTTO_BONUS_NAME in", values, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_NAME not in", values, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_NAME between", value1, value2, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusNameNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_NAME not between", value1, value2, "lottoBonusName");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIsNull() {
            addCriterion("LOTTO_BONUS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIsNotNull() {
            addCriterion("LOTTO_BONUS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL =", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <>", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_LEVEL >", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL >=", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLessThan(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <=", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLike(String value) {
            addCriterion("LOTTO_BONUS_LEVEL like", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotLike(String value) {
            addCriterion("LOTTO_BONUS_LEVEL not like", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIn(List<String> values) {
            addCriterion("LOTTO_BONUS_LEVEL in", values, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_LEVEL not in", values, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_LEVEL between", value1, value2, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_LEVEL not between", value1, value2, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescIsNull() {
            addCriterion("LOTTO_BONUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescIsNotNull() {
            addCriterion("LOTTO_BONUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescEqualTo(String value) {
            addCriterion("LOTTO_BONUS_DESC =", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_DESC <>", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_DESC >", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_DESC >=", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescLessThan(String value) {
            addCriterion("LOTTO_BONUS_DESC <", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_DESC <=", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescLike(String value) {
            addCriterion("LOTTO_BONUS_DESC like", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescNotLike(String value) {
            addCriterion("LOTTO_BONUS_DESC not like", value, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescIn(List<String> values) {
            addCriterion("LOTTO_BONUS_DESC in", values, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_DESC not in", values, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_DESC between", value1, value2, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusDescNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_DESC not between", value1, value2, "lottoBonusDesc");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoIsNull() {
            addCriterion("LOTTO_BONUS_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoIsNotNull() {
            addCriterion("LOTTO_BONUS_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoEqualTo(String value) {
            addCriterion("LOTTO_BONUS_MEMO =", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_MEMO <>", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_MEMO >", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_MEMO >=", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoLessThan(String value) {
            addCriterion("LOTTO_BONUS_MEMO <", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_MEMO <=", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoLike(String value) {
            addCriterion("LOTTO_BONUS_MEMO like", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoNotLike(String value) {
            addCriterion("LOTTO_BONUS_MEMO not like", value, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoIn(List<String> values) {
            addCriterion("LOTTO_BONUS_MEMO in", values, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_MEMO not in", values, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_MEMO between", value1, value2, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusMemoNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_MEMO not between", value1, value2, "lottoBonusMemo");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsIsNull() {
            addCriterion("LOTTO_BONUS_STS is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsIsNotNull() {
            addCriterion("LOTTO_BONUS_STS is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsEqualTo(String value) {
            addCriterion("LOTTO_BONUS_STS =", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_STS <>", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_STS >", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_STS >=", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsLessThan(String value) {
            addCriterion("LOTTO_BONUS_STS <", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_STS <=", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsLike(String value) {
            addCriterion("LOTTO_BONUS_STS like", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsNotLike(String value) {
            addCriterion("LOTTO_BONUS_STS not like", value, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsIn(List<String> values) {
            addCriterion("LOTTO_BONUS_STS in", values, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_STS not in", values, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_STS between", value1, value2, "lottoBonusSts");
            return (Criteria) this;
        }

        public Criteria andLottoBonusStsNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_STS not between", value1, value2, "lottoBonusSts");
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