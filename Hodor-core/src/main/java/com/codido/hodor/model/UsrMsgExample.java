package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrMsgExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("MSG_ID =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("MSG_ID <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("MSG_ID >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MSG_ID >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("MSG_ID <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("MSG_ID <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("MSG_ID in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("MSG_ID not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("MSG_ID between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("MSG_ID not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNull() {
            addCriterion("FROM_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("FROM_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(Long value) {
            addCriterion("FROM_USER_ID =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(Long value) {
            addCriterion("FROM_USER_ID <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(Long value) {
            addCriterion("FROM_USER_ID >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FROM_USER_ID >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(Long value) {
            addCriterion("FROM_USER_ID <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(Long value) {
            addCriterion("FROM_USER_ID <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<Long> values) {
            addCriterion("FROM_USER_ID in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<Long> values) {
            addCriterion("FROM_USER_ID not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(Long value1, Long value2) {
            addCriterion("FROM_USER_ID between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(Long value1, Long value2) {
            addCriterion("FROM_USER_ID not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("TO_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("TO_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(Long value) {
            addCriterion("TO_USER_ID =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(Long value) {
            addCriterion("TO_USER_ID <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(Long value) {
            addCriterion("TO_USER_ID >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TO_USER_ID >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(Long value) {
            addCriterion("TO_USER_ID <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(Long value) {
            addCriterion("TO_USER_ID <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<Long> values) {
            addCriterion("TO_USER_ID in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<Long> values) {
            addCriterion("TO_USER_ID not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(Long value1, Long value2) {
            addCriterion("TO_USER_ID between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(Long value1, Long value2) {
            addCriterion("TO_USER_ID not between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("MSG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("MSG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("MSG_TITLE =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("MSG_TITLE <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("MSG_TITLE >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_TITLE >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("MSG_TITLE <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("MSG_TITLE <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("MSG_TITLE like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("MSG_TITLE not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("MSG_TITLE in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("MSG_TITLE not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("MSG_TITLE between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("MSG_TITLE not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgInfoIsNull() {
            addCriterion("MSG_INFO is null");
            return (Criteria) this;
        }

        public Criteria andMsgInfoIsNotNull() {
            addCriterion("MSG_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andMsgInfoEqualTo(String value) {
            addCriterion("MSG_INFO =", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoNotEqualTo(String value) {
            addCriterion("MSG_INFO <>", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoGreaterThan(String value) {
            addCriterion("MSG_INFO >", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_INFO >=", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoLessThan(String value) {
            addCriterion("MSG_INFO <", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoLessThanOrEqualTo(String value) {
            addCriterion("MSG_INFO <=", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoLike(String value) {
            addCriterion("MSG_INFO like", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoNotLike(String value) {
            addCriterion("MSG_INFO not like", value, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoIn(List<String> values) {
            addCriterion("MSG_INFO in", values, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoNotIn(List<String> values) {
            addCriterion("MSG_INFO not in", values, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoBetween(String value1, String value2) {
            addCriterion("MSG_INFO between", value1, value2, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgInfoNotBetween(String value1, String value2) {
            addCriterion("MSG_INFO not between", value1, value2, "msgInfo");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNull() {
            addCriterion("MSG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNotNull() {
            addCriterion("MSG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeEqualTo(Date value) {
            addCriterion("MSG_TIME =", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotEqualTo(Date value) {
            addCriterion("MSG_TIME <>", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThan(Date value) {
            addCriterion("MSG_TIME >", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MSG_TIME >=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThan(Date value) {
            addCriterion("MSG_TIME <", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThanOrEqualTo(Date value) {
            addCriterion("MSG_TIME <=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIn(List<Date> values) {
            addCriterion("MSG_TIME in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotIn(List<Date> values) {
            addCriterion("MSG_TIME not in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeBetween(Date value1, Date value2) {
            addCriterion("MSG_TIME between", value1, value2, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotBetween(Date value1, Date value2) {
            addCriterion("MSG_TIME not between", value1, value2, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeIsNull() {
            addCriterion("MSG_READ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeIsNotNull() {
            addCriterion("MSG_READ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeEqualTo(Date value) {
            addCriterion("MSG_READ_TIME =", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeNotEqualTo(Date value) {
            addCriterion("MSG_READ_TIME <>", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeGreaterThan(Date value) {
            addCriterion("MSG_READ_TIME >", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MSG_READ_TIME >=", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeLessThan(Date value) {
            addCriterion("MSG_READ_TIME <", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeLessThanOrEqualTo(Date value) {
            addCriterion("MSG_READ_TIME <=", value, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeIn(List<Date> values) {
            addCriterion("MSG_READ_TIME in", values, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeNotIn(List<Date> values) {
            addCriterion("MSG_READ_TIME not in", values, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeBetween(Date value1, Date value2) {
            addCriterion("MSG_READ_TIME between", value1, value2, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgReadTimeNotBetween(Date value1, Date value2) {
            addCriterion("MSG_READ_TIME not between", value1, value2, "msgReadTime");
            return (Criteria) this;
        }

        public Criteria andMsgStsIsNull() {
            addCriterion("MSG_STS is null");
            return (Criteria) this;
        }

        public Criteria andMsgStsIsNotNull() {
            addCriterion("MSG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStsEqualTo(String value) {
            addCriterion("MSG_STS =", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsNotEqualTo(String value) {
            addCriterion("MSG_STS <>", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsGreaterThan(String value) {
            addCriterion("MSG_STS >", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_STS >=", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsLessThan(String value) {
            addCriterion("MSG_STS <", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsLessThanOrEqualTo(String value) {
            addCriterion("MSG_STS <=", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsLike(String value) {
            addCriterion("MSG_STS like", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsNotLike(String value) {
            addCriterion("MSG_STS not like", value, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsIn(List<String> values) {
            addCriterion("MSG_STS in", values, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsNotIn(List<String> values) {
            addCriterion("MSG_STS not in", values, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsBetween(String value1, String value2) {
            addCriterion("MSG_STS between", value1, value2, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgStsNotBetween(String value1, String value2) {
            addCriterion("MSG_STS not between", value1, value2, "msgSts");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("MSG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("MSG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("MSG_TYPE =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("MSG_TYPE <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("MSG_TYPE >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("MSG_TYPE <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("MSG_TYPE like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("MSG_TYPE not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("MSG_TYPE in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("MSG_TYPE not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("MSG_TYPE between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("MSG_TYPE not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlIsNull() {
            addCriterion("MSG_JUMP_URL is null");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlIsNotNull() {
            addCriterion("MSG_JUMP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlEqualTo(String value) {
            addCriterion("MSG_JUMP_URL =", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlNotEqualTo(String value) {
            addCriterion("MSG_JUMP_URL <>", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlGreaterThan(String value) {
            addCriterion("MSG_JUMP_URL >", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_JUMP_URL >=", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlLessThan(String value) {
            addCriterion("MSG_JUMP_URL <", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlLessThanOrEqualTo(String value) {
            addCriterion("MSG_JUMP_URL <=", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlLike(String value) {
            addCriterion("MSG_JUMP_URL like", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlNotLike(String value) {
            addCriterion("MSG_JUMP_URL not like", value, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlIn(List<String> values) {
            addCriterion("MSG_JUMP_URL in", values, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlNotIn(List<String> values) {
            addCriterion("MSG_JUMP_URL not in", values, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlBetween(String value1, String value2) {
            addCriterion("MSG_JUMP_URL between", value1, value2, "msgJumpUrl");
            return (Criteria) this;
        }

        public Criteria andMsgJumpUrlNotBetween(String value1, String value2) {
            addCriterion("MSG_JUMP_URL not between", value1, value2, "msgJumpUrl");
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