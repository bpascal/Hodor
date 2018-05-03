package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class UsrShopRelaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrShopRelaExample() {
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

        public Criteria andUsrShopRelaIdIsNull() {
            addCriterion("USR_SHOP_RELA_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdIsNotNull() {
            addCriterion("USR_SHOP_RELA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdEqualTo(Long value) {
            addCriterion("USR_SHOP_RELA_ID =", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdNotEqualTo(Long value) {
            addCriterion("USR_SHOP_RELA_ID <>", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdGreaterThan(Long value) {
            addCriterion("USR_SHOP_RELA_ID >", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_SHOP_RELA_ID >=", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdLessThan(Long value) {
            addCriterion("USR_SHOP_RELA_ID <", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_SHOP_RELA_ID <=", value, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdIn(List<Long> values) {
            addCriterion("USR_SHOP_RELA_ID in", values, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdNotIn(List<Long> values) {
            addCriterion("USR_SHOP_RELA_ID not in", values, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdBetween(Long value1, Long value2) {
            addCriterion("USR_SHOP_RELA_ID between", value1, value2, "usrShopRelaId");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_SHOP_RELA_ID not between", value1, value2, "usrShopRelaId");
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

        public Criteria andShopTypeIsNull() {
            addCriterion("SHOP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("SHOP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("SHOP_TYPE =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("SHOP_TYPE <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("SHOP_TYPE >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("SHOP_TYPE <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("SHOP_TYPE like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("SHOP_TYPE not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("SHOP_TYPE in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("SHOP_TYPE not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsIsNull() {
            addCriterion("USR_SHOP_RELA_STS is null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsIsNotNull() {
            addCriterion("USR_SHOP_RELA_STS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsEqualTo(String value) {
            addCriterion("USR_SHOP_RELA_STS =", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsNotEqualTo(String value) {
            addCriterion("USR_SHOP_RELA_STS <>", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsGreaterThan(String value) {
            addCriterion("USR_SHOP_RELA_STS >", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsGreaterThanOrEqualTo(String value) {
            addCriterion("USR_SHOP_RELA_STS >=", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsLessThan(String value) {
            addCriterion("USR_SHOP_RELA_STS <", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsLessThanOrEqualTo(String value) {
            addCriterion("USR_SHOP_RELA_STS <=", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsLike(String value) {
            addCriterion("USR_SHOP_RELA_STS like", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsNotLike(String value) {
            addCriterion("USR_SHOP_RELA_STS not like", value, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsIn(List<String> values) {
            addCriterion("USR_SHOP_RELA_STS in", values, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsNotIn(List<String> values) {
            addCriterion("USR_SHOP_RELA_STS not in", values, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsBetween(String value1, String value2) {
            addCriterion("USR_SHOP_RELA_STS between", value1, value2, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaStsNotBetween(String value1, String value2) {
            addCriterion("USR_SHOP_RELA_STS not between", value1, value2, "usrShopRelaSts");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortIsNull() {
            addCriterion("USR_SHOP_RELA_SORT is null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortIsNotNull() {
            addCriterion("USR_SHOP_RELA_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortEqualTo(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT =", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortNotEqualTo(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT <>", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortGreaterThan(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT >", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT >=", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortLessThan(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT <", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortLessThanOrEqualTo(Integer value) {
            addCriterion("USR_SHOP_RELA_SORT <=", value, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortIn(List<Integer> values) {
            addCriterion("USR_SHOP_RELA_SORT in", values, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortNotIn(List<Integer> values) {
            addCriterion("USR_SHOP_RELA_SORT not in", values, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortBetween(Integer value1, Integer value2) {
            addCriterion("USR_SHOP_RELA_SORT between", value1, value2, "usrShopRelaSort");
            return (Criteria) this;
        }

        public Criteria andUsrShopRelaSortNotBetween(Integer value1, Integer value2) {
            addCriterion("USR_SHOP_RELA_SORT not between", value1, value2, "usrShopRelaSort");
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