package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class ShpLottoRelaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShpLottoRelaExample() {
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

        public Criteria andShopLottoRelaIdIsNull() {
            addCriterion("SHOP_LOTTO_RELA_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdIsNotNull() {
            addCriterion("SHOP_LOTTO_RELA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID =", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdNotEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID <>", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdGreaterThan(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID >", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID >=", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdLessThan(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID <", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_RELA_ID <=", value, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdIn(List<Long> values) {
            addCriterion("SHOP_LOTTO_RELA_ID in", values, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdNotIn(List<Long> values) {
            addCriterion("SHOP_LOTTO_RELA_ID not in", values, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_LOTTO_RELA_ID between", value1, value2, "shopLottoRelaId");
            return (Criteria) this;
        }

        public Criteria andShopLottoRelaIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_LOTTO_RELA_ID not between", value1, value2, "shopLottoRelaId");
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

        public Criteria andLottoTradStsIsNull() {
            addCriterion("LOTTO_TRAD_STS is null");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsIsNotNull() {
            addCriterion("LOTTO_TRAD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsEqualTo(String value) {
            addCriterion("LOTTO_TRAD_STS =", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsNotEqualTo(String value) {
            addCriterion("LOTTO_TRAD_STS <>", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsGreaterThan(String value) {
            addCriterion("LOTTO_TRAD_STS >", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_TRAD_STS >=", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsLessThan(String value) {
            addCriterion("LOTTO_TRAD_STS <", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_TRAD_STS <=", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsLike(String value) {
            addCriterion("LOTTO_TRAD_STS like", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsNotLike(String value) {
            addCriterion("LOTTO_TRAD_STS not like", value, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsIn(List<String> values) {
            addCriterion("LOTTO_TRAD_STS in", values, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsNotIn(List<String> values) {
            addCriterion("LOTTO_TRAD_STS not in", values, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsBetween(String value1, String value2) {
            addCriterion("LOTTO_TRAD_STS between", value1, value2, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoTradStsNotBetween(String value1, String value2) {
            addCriterion("LOTTO_TRAD_STS not between", value1, value2, "lottoTradSts");
            return (Criteria) this;
        }

        public Criteria andLottoSortIsNull() {
            addCriterion("LOTTO_SORT is null");
            return (Criteria) this;
        }

        public Criteria andLottoSortIsNotNull() {
            addCriterion("LOTTO_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andLottoSortEqualTo(Integer value) {
            addCriterion("LOTTO_SORT =", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortNotEqualTo(Integer value) {
            addCriterion("LOTTO_SORT <>", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortGreaterThan(Integer value) {
            addCriterion("LOTTO_SORT >", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOTTO_SORT >=", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortLessThan(Integer value) {
            addCriterion("LOTTO_SORT <", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortLessThanOrEqualTo(Integer value) {
            addCriterion("LOTTO_SORT <=", value, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortIn(List<Integer> values) {
            addCriterion("LOTTO_SORT in", values, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortNotIn(List<Integer> values) {
            addCriterion("LOTTO_SORT not in", values, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortBetween(Integer value1, Integer value2) {
            addCriterion("LOTTO_SORT between", value1, value2, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andLottoSortNotBetween(Integer value1, Integer value2) {
            addCriterion("LOTTO_SORT not between", value1, value2, "lottoSort");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountIsNull() {
            addCriterion("SHOP_LOTTO_ORDER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountIsNotNull() {
            addCriterion("SHOP_LOTTO_ORDER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountEqualTo(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT =", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountNotEqualTo(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT <>", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountGreaterThan(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT >", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT >=", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountLessThan(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT <", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT <=", value, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountIn(List<Integer> values) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT in", values, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountNotIn(List<Integer> values) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT not in", values, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT between", value1, value2, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_LOTTO_ORDER_COUNT not between", value1, value2, "shopLottoOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtIsNull() {
            addCriterion("SHOP_LOTTO_ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtIsNotNull() {
            addCriterion("SHOP_LOTTO_ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT =", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtNotEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT <>", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtGreaterThan(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT >", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT >=", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtLessThan(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT <", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_LOTTO_ORDER_AMT <=", value, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtIn(List<Long> values) {
            addCriterion("SHOP_LOTTO_ORDER_AMT in", values, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtNotIn(List<Long> values) {
            addCriterion("SHOP_LOTTO_ORDER_AMT not in", values, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtBetween(Long value1, Long value2) {
            addCriterion("SHOP_LOTTO_ORDER_AMT between", value1, value2, "shopLottoOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopLottoOrderAmtNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_LOTTO_ORDER_AMT not between", value1, value2, "shopLottoOrderAmt");
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