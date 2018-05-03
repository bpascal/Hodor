package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShpShopInviteCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShpShopInviteCodeExample() {
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

        public Criteria andInviteCodeIdIsNull() {
            addCriterion("INVITE_CODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdIsNotNull() {
            addCriterion("INVITE_CODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdEqualTo(Long value) {
            addCriterion("INVITE_CODE_ID =", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdNotEqualTo(Long value) {
            addCriterion("INVITE_CODE_ID <>", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdGreaterThan(Long value) {
            addCriterion("INVITE_CODE_ID >", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INVITE_CODE_ID >=", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdLessThan(Long value) {
            addCriterion("INVITE_CODE_ID <", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdLessThanOrEqualTo(Long value) {
            addCriterion("INVITE_CODE_ID <=", value, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdIn(List<Long> values) {
            addCriterion("INVITE_CODE_ID in", values, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdNotIn(List<Long> values) {
            addCriterion("INVITE_CODE_ID not in", values, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdBetween(Long value1, Long value2) {
            addCriterion("INVITE_CODE_ID between", value1, value2, "inviteCodeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIdNotBetween(Long value1, Long value2) {
            addCriterion("INVITE_CODE_ID not between", value1, value2, "inviteCodeId");
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

        public Criteria andInviteCodeIsNull() {
            addCriterion("INVITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("INVITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("INVITE_CODE =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("INVITE_CODE <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("INVITE_CODE >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("INVITE_CODE <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("INVITE_CODE <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("INVITE_CODE like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("INVITE_CODE not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("INVITE_CODE in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("INVITE_CODE not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("INVITE_CODE between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("INVITE_CODE not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andCodeStsIsNull() {
            addCriterion("CODE_STS is null");
            return (Criteria) this;
        }

        public Criteria andCodeStsIsNotNull() {
            addCriterion("CODE_STS is not null");
            return (Criteria) this;
        }

        public Criteria andCodeStsEqualTo(String value) {
            addCriterion("CODE_STS =", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsNotEqualTo(String value) {
            addCriterion("CODE_STS <>", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsGreaterThan(String value) {
            addCriterion("CODE_STS >", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_STS >=", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsLessThan(String value) {
            addCriterion("CODE_STS <", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsLessThanOrEqualTo(String value) {
            addCriterion("CODE_STS <=", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsLike(String value) {
            addCriterion("CODE_STS like", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsNotLike(String value) {
            addCriterion("CODE_STS not like", value, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsIn(List<String> values) {
            addCriterion("CODE_STS in", values, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsNotIn(List<String> values) {
            addCriterion("CODE_STS not in", values, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsBetween(String value1, String value2) {
            addCriterion("CODE_STS between", value1, value2, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeStsNotBetween(String value1, String value2) {
            addCriterion("CODE_STS not between", value1, value2, "codeSts");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeIsNull() {
            addCriterion("CODE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeIsNotNull() {
            addCriterion("CODE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeEqualTo(Date value) {
            addCriterion("CODE_CREATE_TIME =", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeNotEqualTo(Date value) {
            addCriterion("CODE_CREATE_TIME <>", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeGreaterThan(Date value) {
            addCriterion("CODE_CREATE_TIME >", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CODE_CREATE_TIME >=", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeLessThan(Date value) {
            addCriterion("CODE_CREATE_TIME <", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CODE_CREATE_TIME <=", value, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeIn(List<Date> values) {
            addCriterion("CODE_CREATE_TIME in", values, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeNotIn(List<Date> values) {
            addCriterion("CODE_CREATE_TIME not in", values, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CODE_CREATE_TIME between", value1, value2, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CODE_CREATE_TIME not between", value1, value2, "codeCreateTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeIsNull() {
            addCriterion("CODE_EXP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeIsNotNull() {
            addCriterion("CODE_EXP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeEqualTo(Date value) {
            addCriterion("CODE_EXP_TIME =", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeNotEqualTo(Date value) {
            addCriterion("CODE_EXP_TIME <>", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeGreaterThan(Date value) {
            addCriterion("CODE_EXP_TIME >", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CODE_EXP_TIME >=", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeLessThan(Date value) {
            addCriterion("CODE_EXP_TIME <", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeLessThanOrEqualTo(Date value) {
            addCriterion("CODE_EXP_TIME <=", value, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeIn(List<Date> values) {
            addCriterion("CODE_EXP_TIME in", values, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeNotIn(List<Date> values) {
            addCriterion("CODE_EXP_TIME not in", values, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeBetween(Date value1, Date value2) {
            addCriterion("CODE_EXP_TIME between", value1, value2, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andCodeExpTimeNotBetween(Date value1, Date value2) {
            addCriterion("CODE_EXP_TIME not between", value1, value2, "codeExpTime");
            return (Criteria) this;
        }

        public Criteria andWxQrticketIsNull() {
            addCriterion("WX_QRTICKET is null");
            return (Criteria) this;
        }

        public Criteria andWxQrticketIsNotNull() {
            addCriterion("WX_QRTICKET is not null");
            return (Criteria) this;
        }

        public Criteria andWxQrticketEqualTo(String value) {
            addCriterion("WX_QRTICKET =", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketNotEqualTo(String value) {
            addCriterion("WX_QRTICKET <>", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketGreaterThan(String value) {
            addCriterion("WX_QRTICKET >", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketGreaterThanOrEqualTo(String value) {
            addCriterion("WX_QRTICKET >=", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketLessThan(String value) {
            addCriterion("WX_QRTICKET <", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketLessThanOrEqualTo(String value) {
            addCriterion("WX_QRTICKET <=", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketLike(String value) {
            addCriterion("WX_QRTICKET like", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketNotLike(String value) {
            addCriterion("WX_QRTICKET not like", value, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketIn(List<String> values) {
            addCriterion("WX_QRTICKET in", values, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketNotIn(List<String> values) {
            addCriterion("WX_QRTICKET not in", values, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketBetween(String value1, String value2) {
            addCriterion("WX_QRTICKET between", value1, value2, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrticketNotBetween(String value1, String value2) {
            addCriterion("WX_QRTICKET not between", value1, value2, "wxQrticket");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlIsNull() {
            addCriterion("WX_QRCODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlIsNotNull() {
            addCriterion("WX_QRCODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlEqualTo(String value) {
            addCriterion("WX_QRCODE_URL =", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlNotEqualTo(String value) {
            addCriterion("WX_QRCODE_URL <>", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlGreaterThan(String value) {
            addCriterion("WX_QRCODE_URL >", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("WX_QRCODE_URL >=", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlLessThan(String value) {
            addCriterion("WX_QRCODE_URL <", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("WX_QRCODE_URL <=", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlLike(String value) {
            addCriterion("WX_QRCODE_URL like", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlNotLike(String value) {
            addCriterion("WX_QRCODE_URL not like", value, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlIn(List<String> values) {
            addCriterion("WX_QRCODE_URL in", values, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlNotIn(List<String> values) {
            addCriterion("WX_QRCODE_URL not in", values, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlBetween(String value1, String value2) {
            addCriterion("WX_QRCODE_URL between", value1, value2, "wxQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("WX_QRCODE_URL not between", value1, value2, "wxQrcodeUrl");
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