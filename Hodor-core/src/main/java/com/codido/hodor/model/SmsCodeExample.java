package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCodeExample() {
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

        public Criteria andSmsCodeIdIsNull() {
            addCriterion("SMS_CODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdIsNotNull() {
            addCriterion("SMS_CODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdEqualTo(Long value) {
            addCriterion("SMS_CODE_ID =", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdNotEqualTo(Long value) {
            addCriterion("SMS_CODE_ID <>", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdGreaterThan(Long value) {
            addCriterion("SMS_CODE_ID >", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SMS_CODE_ID >=", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdLessThan(Long value) {
            addCriterion("SMS_CODE_ID <", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdLessThanOrEqualTo(Long value) {
            addCriterion("SMS_CODE_ID <=", value, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdIn(List<Long> values) {
            addCriterion("SMS_CODE_ID in", values, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdNotIn(List<Long> values) {
            addCriterion("SMS_CODE_ID not in", values, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdBetween(Long value1, Long value2) {
            addCriterion("SMS_CODE_ID between", value1, value2, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIdNotBetween(Long value1, Long value2) {
            addCriterion("SMS_CODE_ID not between", value1, value2, "smsCodeId");
            return (Criteria) this;
        }

        public Criteria andMblNoIsNull() {
            addCriterion("MBL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMblNoIsNotNull() {
            addCriterion("MBL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMblNoEqualTo(String value) {
            addCriterion("MBL_NO =", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoNotEqualTo(String value) {
            addCriterion("MBL_NO <>", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoGreaterThan(String value) {
            addCriterion("MBL_NO >", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoGreaterThanOrEqualTo(String value) {
            addCriterion("MBL_NO >=", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoLessThan(String value) {
            addCriterion("MBL_NO <", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoLessThanOrEqualTo(String value) {
            addCriterion("MBL_NO <=", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoLike(String value) {
            addCriterion("MBL_NO like", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoNotLike(String value) {
            addCriterion("MBL_NO not like", value, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoIn(List<String> values) {
            addCriterion("MBL_NO in", values, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoNotIn(List<String> values) {
            addCriterion("MBL_NO not in", values, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoBetween(String value1, String value2) {
            addCriterion("MBL_NO between", value1, value2, "mblNo");
            return (Criteria) this;
        }

        public Criteria andMblNoNotBetween(String value1, String value2) {
            addCriterion("MBL_NO not between", value1, value2, "mblNo");
            return (Criteria) this;
        }

        public Criteria andSmsTypeIsNull() {
            addCriterion("SMS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSmsTypeIsNotNull() {
            addCriterion("SMS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTypeEqualTo(String value) {
            addCriterion("SMS_TYPE =", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotEqualTo(String value) {
            addCriterion("SMS_TYPE <>", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeGreaterThan(String value) {
            addCriterion("SMS_TYPE >", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_TYPE >=", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeLessThan(String value) {
            addCriterion("SMS_TYPE <", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeLessThanOrEqualTo(String value) {
            addCriterion("SMS_TYPE <=", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeLike(String value) {
            addCriterion("SMS_TYPE like", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotLike(String value) {
            addCriterion("SMS_TYPE not like", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeIn(List<String> values) {
            addCriterion("SMS_TYPE in", values, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotIn(List<String> values) {
            addCriterion("SMS_TYPE not in", values, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeBetween(String value1, String value2) {
            addCriterion("SMS_TYPE between", value1, value2, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotBetween(String value1, String value2) {
            addCriterion("SMS_TYPE not between", value1, value2, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIsNull() {
            addCriterion("SMS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIsNotNull() {
            addCriterion("SMS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeEqualTo(String value) {
            addCriterion("SMS_CODE =", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotEqualTo(String value) {
            addCriterion("SMS_CODE <>", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeGreaterThan(String value) {
            addCriterion("SMS_CODE >", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CODE >=", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLessThan(String value) {
            addCriterion("SMS_CODE <", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLessThanOrEqualTo(String value) {
            addCriterion("SMS_CODE <=", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLike(String value) {
            addCriterion("SMS_CODE like", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotLike(String value) {
            addCriterion("SMS_CODE not like", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIn(List<String> values) {
            addCriterion("SMS_CODE in", values, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotIn(List<String> values) {
            addCriterion("SMS_CODE not in", values, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeBetween(String value1, String value2) {
            addCriterion("SMS_CODE between", value1, value2, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotBetween(String value1, String value2) {
            addCriterion("SMS_CODE not between", value1, value2, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNull() {
            addCriterion("SMS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNotNull() {
            addCriterion("SMS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSmsContentEqualTo(String value) {
            addCriterion("SMS_CONTENT =", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotEqualTo(String value) {
            addCriterion("SMS_CONTENT <>", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThan(String value) {
            addCriterion("SMS_CONTENT >", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CONTENT >=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThan(String value) {
            addCriterion("SMS_CONTENT <", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThanOrEqualTo(String value) {
            addCriterion("SMS_CONTENT <=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLike(String value) {
            addCriterion("SMS_CONTENT like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotLike(String value) {
            addCriterion("SMS_CONTENT not like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentIn(List<String> values) {
            addCriterion("SMS_CONTENT in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotIn(List<String> values) {
            addCriterion("SMS_CONTENT not in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentBetween(String value1, String value2) {
            addCriterion("SMS_CONTENT between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotBetween(String value1, String value2) {
            addCriterion("SMS_CONTENT not between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeIsNull() {
            addCriterion("SMS_CODE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeIsNotNull() {
            addCriterion("SMS_CODE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeEqualTo(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME =", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeNotEqualTo(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME <>", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeGreaterThan(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME >", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME >=", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeLessThan(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME <", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("SMS_CODE_CREATE_TIME <=", value, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeIn(List<Date> values) {
            addCriterion("SMS_CODE_CREATE_TIME in", values, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeNotIn(List<Date> values) {
            addCriterion("SMS_CODE_CREATE_TIME not in", values, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("SMS_CODE_CREATE_TIME between", value1, value2, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("SMS_CODE_CREATE_TIME not between", value1, value2, "smsCodeCreateTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeIsNull() {
            addCriterion("SMS_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeIsNotNull() {
            addCriterion("SMS_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeEqualTo(Date value) {
            addCriterion("SMS_SEND_TIME =", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeNotEqualTo(Date value) {
            addCriterion("SMS_SEND_TIME <>", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeGreaterThan(Date value) {
            addCriterion("SMS_SEND_TIME >", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SMS_SEND_TIME >=", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeLessThan(Date value) {
            addCriterion("SMS_SEND_TIME <", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("SMS_SEND_TIME <=", value, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeIn(List<Date> values) {
            addCriterion("SMS_SEND_TIME in", values, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeNotIn(List<Date> values) {
            addCriterion("SMS_SEND_TIME not in", values, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeBetween(Date value1, Date value2) {
            addCriterion("SMS_SEND_TIME between", value1, value2, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("SMS_SEND_TIME not between", value1, value2, "smsSendTime");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsIsNull() {
            addCriterion("SMS_CODE_STS is null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsIsNotNull() {
            addCriterion("SMS_CODE_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsEqualTo(String value) {
            addCriterion("SMS_CODE_STS =", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsNotEqualTo(String value) {
            addCriterion("SMS_CODE_STS <>", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsGreaterThan(String value) {
            addCriterion("SMS_CODE_STS >", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CODE_STS >=", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsLessThan(String value) {
            addCriterion("SMS_CODE_STS <", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsLessThanOrEqualTo(String value) {
            addCriterion("SMS_CODE_STS <=", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsLike(String value) {
            addCriterion("SMS_CODE_STS like", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsNotLike(String value) {
            addCriterion("SMS_CODE_STS not like", value, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsIn(List<String> values) {
            addCriterion("SMS_CODE_STS in", values, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsNotIn(List<String> values) {
            addCriterion("SMS_CODE_STS not in", values, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsBetween(String value1, String value2) {
            addCriterion("SMS_CODE_STS between", value1, value2, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andSmsCodeStsNotBetween(String value1, String value2) {
            addCriterion("SMS_CODE_STS not between", value1, value2, "smsCodeSts");
            return (Criteria) this;
        }

        public Criteria andErrCountIsNull() {
            addCriterion("ERR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andErrCountIsNotNull() {
            addCriterion("ERR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andErrCountEqualTo(Integer value) {
            addCriterion("ERR_COUNT =", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotEqualTo(Integer value) {
            addCriterion("ERR_COUNT <>", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountGreaterThan(Integer value) {
            addCriterion("ERR_COUNT >", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERR_COUNT >=", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountLessThan(Integer value) {
            addCriterion("ERR_COUNT <", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountLessThanOrEqualTo(Integer value) {
            addCriterion("ERR_COUNT <=", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountIn(List<Integer> values) {
            addCriterion("ERR_COUNT in", values, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotIn(List<Integer> values) {
            addCriterion("ERR_COUNT not in", values, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountBetween(Integer value1, Integer value2) {
            addCriterion("ERR_COUNT between", value1, value2, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ERR_COUNT not between", value1, value2, "errCount");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
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