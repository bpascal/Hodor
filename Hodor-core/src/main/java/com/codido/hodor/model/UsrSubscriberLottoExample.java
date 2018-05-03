package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrSubscriberLottoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrSubscriberLottoExample() {
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

        public Criteria andUsrSubscribLottoIdIsNull() {
            addCriterion("USR_SUBSCRIB_LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdIsNotNull() {
            addCriterion("USR_SUBSCRIB_LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdEqualTo(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID =", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdNotEqualTo(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID <>", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdGreaterThan(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID >", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID >=", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdLessThan(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID <", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID <=", value, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdIn(List<Long> values) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID in", values, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdNotIn(List<Long> values) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID not in", values, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdBetween(Long value1, Long value2) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID between", value1, value2, "usrSubscribLottoId");
            return (Criteria) this;
        }

        public Criteria andUsrSubscribLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_SUBSCRIB_LOTTO_ID not between", value1, value2, "usrSubscribLottoId");
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

        public Criteria andSubscribStsIsNull() {
            addCriterion("SUBSCRIB_STS is null");
            return (Criteria) this;
        }

        public Criteria andSubscribStsIsNotNull() {
            addCriterion("SUBSCRIB_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribStsEqualTo(String value) {
            addCriterion("SUBSCRIB_STS =", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsNotEqualTo(String value) {
            addCriterion("SUBSCRIB_STS <>", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsGreaterThan(String value) {
            addCriterion("SUBSCRIB_STS >", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIB_STS >=", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsLessThan(String value) {
            addCriterion("SUBSCRIB_STS <", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIB_STS <=", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsLike(String value) {
            addCriterion("SUBSCRIB_STS like", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsNotLike(String value) {
            addCriterion("SUBSCRIB_STS not like", value, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsIn(List<String> values) {
            addCriterion("SUBSCRIB_STS in", values, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsNotIn(List<String> values) {
            addCriterion("SUBSCRIB_STS not in", values, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsBetween(String value1, String value2) {
            addCriterion("SUBSCRIB_STS between", value1, value2, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribStsNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIB_STS not between", value1, value2, "subscribSts");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeIsNull() {
            addCriterion("SUBSCRIB_TME is null");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeIsNotNull() {
            addCriterion("SUBSCRIB_TME is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeEqualTo(Date value) {
            addCriterion("SUBSCRIB_TME =", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeNotEqualTo(Date value) {
            addCriterion("SUBSCRIB_TME <>", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeGreaterThan(Date value) {
            addCriterion("SUBSCRIB_TME >", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBSCRIB_TME >=", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeLessThan(Date value) {
            addCriterion("SUBSCRIB_TME <", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeLessThanOrEqualTo(Date value) {
            addCriterion("SUBSCRIB_TME <=", value, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeIn(List<Date> values) {
            addCriterion("SUBSCRIB_TME in", values, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeNotIn(List<Date> values) {
            addCriterion("SUBSCRIB_TME not in", values, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeBetween(Date value1, Date value2) {
            addCriterion("SUBSCRIB_TME between", value1, value2, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andSubscribTmeNotBetween(Date value1, Date value2) {
            addCriterion("SUBSCRIB_TME not between", value1, value2, "subscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeIsNull() {
            addCriterion("UNSUBSCRIB_TME is null");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeIsNotNull() {
            addCriterion("UNSUBSCRIB_TME is not null");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeEqualTo(Date value) {
            addCriterion("UNSUBSCRIB_TME =", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeNotEqualTo(Date value) {
            addCriterion("UNSUBSCRIB_TME <>", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeGreaterThan(Date value) {
            addCriterion("UNSUBSCRIB_TME >", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeGreaterThanOrEqualTo(Date value) {
            addCriterion("UNSUBSCRIB_TME >=", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeLessThan(Date value) {
            addCriterion("UNSUBSCRIB_TME <", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeLessThanOrEqualTo(Date value) {
            addCriterion("UNSUBSCRIB_TME <=", value, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeIn(List<Date> values) {
            addCriterion("UNSUBSCRIB_TME in", values, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeNotIn(List<Date> values) {
            addCriterion("UNSUBSCRIB_TME not in", values, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeBetween(Date value1, Date value2) {
            addCriterion("UNSUBSCRIB_TME between", value1, value2, "unsubscribTme");
            return (Criteria) this;
        }

        public Criteria andUnsubscribTmeNotBetween(Date value1, Date value2) {
            addCriterion("UNSUBSCRIB_TME not between", value1, value2, "unsubscribTme");
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