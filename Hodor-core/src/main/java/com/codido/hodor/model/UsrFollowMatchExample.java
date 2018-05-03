package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsrFollowMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrFollowMatchExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andFollowIdIsNull() {
            addCriterion("FOLLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowIdIsNotNull() {
            addCriterion("FOLLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowIdEqualTo(Long value) {
            addCriterion("FOLLOW_ID =", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotEqualTo(Long value) {
            addCriterion("FOLLOW_ID <>", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThan(Long value) {
            addCriterion("FOLLOW_ID >", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FOLLOW_ID >=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThan(Long value) {
            addCriterion("FOLLOW_ID <", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThanOrEqualTo(Long value) {
            addCriterion("FOLLOW_ID <=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdIn(List<Long> values) {
            addCriterion("FOLLOW_ID in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotIn(List<Long> values) {
            addCriterion("FOLLOW_ID not in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdBetween(Long value1, Long value2) {
            addCriterion("FOLLOW_ID between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotBetween(Long value1, Long value2) {
            addCriterion("FOLLOW_ID not between", value1, value2, "followId");
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

        public Criteria andMatchIdIsNull() {
            addCriterion("MATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNotNull() {
            addCriterion("MATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchIdEqualTo(Long value) {
            addCriterion("MATCH_ID =", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotEqualTo(Long value) {
            addCriterion("MATCH_ID <>", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThan(Long value) {
            addCriterion("MATCH_ID >", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_ID >=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThan(Long value) {
            addCriterion("MATCH_ID <", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_ID <=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdIn(List<Long> values) {
            addCriterion("MATCH_ID in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotIn(List<Long> values) {
            addCriterion("MATCH_ID not in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_ID between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_ID not between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("MATCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("MATCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(String value) {
            addCriterion("MATCH_TYPE =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(String value) {
            addCriterion("MATCH_TYPE <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(String value) {
            addCriterion("MATCH_TYPE >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(String value) {
            addCriterion("MATCH_TYPE <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLike(String value) {
            addCriterion("MATCH_TYPE like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotLike(String value) {
            addCriterion("MATCH_TYPE not like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<String> values) {
            addCriterion("MATCH_TYPE in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<String> values) {
            addCriterion("MATCH_TYPE not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE not between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNull() {
            addCriterion("FOLLOW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNotNull() {
            addCriterion("FOLLOW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFollowDateEqualTo(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE =", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE <>", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE >", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE >=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThan(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE <", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FOLLOW_DATE <=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateIn(List<Date> values) {
            addCriterionForJDBCDate("FOLLOW_DATE in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FOLLOW_DATE not in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FOLLOW_DATE between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FOLLOW_DATE not between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIsNull() {
            addCriterion("FOLLOW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIsNotNull() {
            addCriterion("FOLLOW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeEqualTo(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME =", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME <>", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME >", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME >=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThan(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME <", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("FOLLOW_TIME <=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIn(List<Date> values) {
            addCriterionForJDBCTime("FOLLOW_TIME in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("FOLLOW_TIME not in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("FOLLOW_TIME between", value1, value2, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("FOLLOW_TIME not between", value1, value2, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowStsIsNull() {
            addCriterion("FOLLOW_STS is null");
            return (Criteria) this;
        }

        public Criteria andFollowStsIsNotNull() {
            addCriterion("FOLLOW_STS is not null");
            return (Criteria) this;
        }

        public Criteria andFollowStsEqualTo(String value) {
            addCriterion("FOLLOW_STS =", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsNotEqualTo(String value) {
            addCriterion("FOLLOW_STS <>", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsGreaterThan(String value) {
            addCriterion("FOLLOW_STS >", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_STS >=", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsLessThan(String value) {
            addCriterion("FOLLOW_STS <", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_STS <=", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsLike(String value) {
            addCriterion("FOLLOW_STS like", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsNotLike(String value) {
            addCriterion("FOLLOW_STS not like", value, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsIn(List<String> values) {
            addCriterion("FOLLOW_STS in", values, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsNotIn(List<String> values) {
            addCriterion("FOLLOW_STS not in", values, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsBetween(String value1, String value2) {
            addCriterion("FOLLOW_STS between", value1, value2, "followSts");
            return (Criteria) this;
        }

        public Criteria andFollowStsNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_STS not between", value1, value2, "followSts");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(String value) {
            addCriterion("FORM_ID =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(String value) {
            addCriterion("FORM_ID <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(String value) {
            addCriterion("FORM_ID >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_ID >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(String value) {
            addCriterion("FORM_ID <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(String value) {
            addCriterion("FORM_ID <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLike(String value) {
            addCriterion("FORM_ID like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotLike(String value) {
            addCriterion("FORM_ID not like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<String> values) {
            addCriterion("FORM_ID in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<String> values) {
            addCriterion("FORM_ID not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(String value1, String value2) {
            addCriterion("FORM_ID between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(String value1, String value2) {
            addCriterion("FORM_ID not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIsNull() {
            addCriterion("ORDER_PUSHMSG_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIsNotNull() {
            addCriterion("ORDER_PUSHMSG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS =", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS <>", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsGreaterThan(String value) {
            addCriterion("ORDER_PUSHMSG_STS >", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS >=", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLessThan(String value) {
            addCriterion("ORDER_PUSHMSG_STS <", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS <=", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLike(String value) {
            addCriterion("ORDER_PUSHMSG_STS like", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotLike(String value) {
            addCriterion("ORDER_PUSHMSG_STS not like", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIn(List<String> values) {
            addCriterion("ORDER_PUSHMSG_STS in", values, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotIn(List<String> values) {
            addCriterion("ORDER_PUSHMSG_STS not in", values, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsBetween(String value1, String value2) {
            addCriterion("ORDER_PUSHMSG_STS between", value1, value2, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_PUSHMSG_STS not between", value1, value2, "orderPushmsgSts");
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