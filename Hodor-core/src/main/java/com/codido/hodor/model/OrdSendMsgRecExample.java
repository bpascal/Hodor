package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdSendMsgRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdSendMsgRecExample() {
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

        public Criteria andSendmsgRecIdIsNull() {
            addCriterion("SENDMSG_REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdIsNotNull() {
            addCriterion("SENDMSG_REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdEqualTo(Long value) {
            addCriterion("SENDMSG_REC_ID =", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdNotEqualTo(Long value) {
            addCriterion("SENDMSG_REC_ID <>", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdGreaterThan(Long value) {
            addCriterion("SENDMSG_REC_ID >", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SENDMSG_REC_ID >=", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdLessThan(Long value) {
            addCriterion("SENDMSG_REC_ID <", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdLessThanOrEqualTo(Long value) {
            addCriterion("SENDMSG_REC_ID <=", value, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdIn(List<Long> values) {
            addCriterion("SENDMSG_REC_ID in", values, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdNotIn(List<Long> values) {
            addCriterion("SENDMSG_REC_ID not in", values, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdBetween(Long value1, Long value2) {
            addCriterion("SENDMSG_REC_ID between", value1, value2, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andSendmsgRecIdNotBetween(Long value1, Long value2) {
            addCriterion("SENDMSG_REC_ID not between", value1, value2, "sendmsgRecId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("TEMPLATE_ID like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("TEMPLATE_ID not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
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

        public Criteria andSendReqUrlIsNull() {
            addCriterion("SEND_REQ_URL is null");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlIsNotNull() {
            addCriterion("SEND_REQ_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlEqualTo(String value) {
            addCriterion("SEND_REQ_URL =", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlNotEqualTo(String value) {
            addCriterion("SEND_REQ_URL <>", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlGreaterThan(String value) {
            addCriterion("SEND_REQ_URL >", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_REQ_URL >=", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlLessThan(String value) {
            addCriterion("SEND_REQ_URL <", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlLessThanOrEqualTo(String value) {
            addCriterion("SEND_REQ_URL <=", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlLike(String value) {
            addCriterion("SEND_REQ_URL like", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlNotLike(String value) {
            addCriterion("SEND_REQ_URL not like", value, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlIn(List<String> values) {
            addCriterion("SEND_REQ_URL in", values, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlNotIn(List<String> values) {
            addCriterion("SEND_REQ_URL not in", values, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlBetween(String value1, String value2) {
            addCriterion("SEND_REQ_URL between", value1, value2, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendReqUrlNotBetween(String value1, String value2) {
            addCriterion("SEND_REQ_URL not between", value1, value2, "sendReqUrl");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeIsNull() {
            addCriterion("SEND_MSG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeIsNotNull() {
            addCriterion("SEND_MSG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeEqualTo(Date value) {
            addCriterion("SEND_MSG_TIME =", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeNotEqualTo(Date value) {
            addCriterion("SEND_MSG_TIME <>", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeGreaterThan(Date value) {
            addCriterion("SEND_MSG_TIME >", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SEND_MSG_TIME >=", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeLessThan(Date value) {
            addCriterion("SEND_MSG_TIME <", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeLessThanOrEqualTo(Date value) {
            addCriterion("SEND_MSG_TIME <=", value, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeIn(List<Date> values) {
            addCriterion("SEND_MSG_TIME in", values, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeNotIn(List<Date> values) {
            addCriterion("SEND_MSG_TIME not in", values, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeBetween(Date value1, Date value2) {
            addCriterion("SEND_MSG_TIME between", value1, value2, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgTimeNotBetween(Date value1, Date value2) {
            addCriterion("SEND_MSG_TIME not between", value1, value2, "sendMsgTime");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsIsNull() {
            addCriterion("SEND_MSG_STS is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsIsNotNull() {
            addCriterion("SEND_MSG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsEqualTo(String value) {
            addCriterion("SEND_MSG_STS =", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsNotEqualTo(String value) {
            addCriterion("SEND_MSG_STS <>", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsGreaterThan(String value) {
            addCriterion("SEND_MSG_STS >", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_STS >=", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsLessThan(String value) {
            addCriterion("SEND_MSG_STS <", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsLessThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_STS <=", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsLike(String value) {
            addCriterion("SEND_MSG_STS like", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsNotLike(String value) {
            addCriterion("SEND_MSG_STS not like", value, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsIn(List<String> values) {
            addCriterion("SEND_MSG_STS in", values, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsNotIn(List<String> values) {
            addCriterion("SEND_MSG_STS not in", values, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsBetween(String value1, String value2) {
            addCriterion("SEND_MSG_STS between", value1, value2, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgStsNotBetween(String value1, String value2) {
            addCriterion("SEND_MSG_STS not between", value1, value2, "sendMsgSts");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaIsNull() {
            addCriterion("SEND_MSG_PARA is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaIsNotNull() {
            addCriterion("SEND_MSG_PARA is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaEqualTo(String value) {
            addCriterion("SEND_MSG_PARA =", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaNotEqualTo(String value) {
            addCriterion("SEND_MSG_PARA <>", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaGreaterThan(String value) {
            addCriterion("SEND_MSG_PARA >", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_PARA >=", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaLessThan(String value) {
            addCriterion("SEND_MSG_PARA <", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaLessThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_PARA <=", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaLike(String value) {
            addCriterion("SEND_MSG_PARA like", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaNotLike(String value) {
            addCriterion("SEND_MSG_PARA not like", value, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaIn(List<String> values) {
            addCriterion("SEND_MSG_PARA in", values, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaNotIn(List<String> values) {
            addCriterion("SEND_MSG_PARA not in", values, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaBetween(String value1, String value2) {
            addCriterion("SEND_MSG_PARA between", value1, value2, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgParaNotBetween(String value1, String value2) {
            addCriterion("SEND_MSG_PARA not between", value1, value2, "sendMsgPara");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetIsNull() {
            addCriterion("SEND_MSG_RET is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetIsNotNull() {
            addCriterion("SEND_MSG_RET is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetEqualTo(String value) {
            addCriterion("SEND_MSG_RET =", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetNotEqualTo(String value) {
            addCriterion("SEND_MSG_RET <>", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetGreaterThan(String value) {
            addCriterion("SEND_MSG_RET >", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_RET >=", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetLessThan(String value) {
            addCriterion("SEND_MSG_RET <", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetLessThanOrEqualTo(String value) {
            addCriterion("SEND_MSG_RET <=", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetLike(String value) {
            addCriterion("SEND_MSG_RET like", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetNotLike(String value) {
            addCriterion("SEND_MSG_RET not like", value, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetIn(List<String> values) {
            addCriterion("SEND_MSG_RET in", values, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetNotIn(List<String> values) {
            addCriterion("SEND_MSG_RET not in", values, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetBetween(String value1, String value2) {
            addCriterion("SEND_MSG_RET between", value1, value2, "sendMsgRet");
            return (Criteria) this;
        }

        public Criteria andSendMsgRetNotBetween(String value1, String value2) {
            addCriterion("SEND_MSG_RET not between", value1, value2, "sendMsgRet");
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