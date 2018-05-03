package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchPlayInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchPlayInstExample() {
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

        public Criteria andMatchPlayInstIdIsNull() {
            addCriterion("MATCH_PLAY_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdIsNotNull() {
            addCriterion("MATCH_PLAY_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdEqualTo(Long value) {
            addCriterion("MATCH_PLAY_INST_ID =", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdNotEqualTo(Long value) {
            addCriterion("MATCH_PLAY_INST_ID <>", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdGreaterThan(Long value) {
            addCriterion("MATCH_PLAY_INST_ID >", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_INST_ID >=", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdLessThan(Long value) {
            addCriterion("MATCH_PLAY_INST_ID <", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_INST_ID <=", value, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdIn(List<Long> values) {
            addCriterion("MATCH_PLAY_INST_ID in", values, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdNotIn(List<Long> values) {
            addCriterion("MATCH_PLAY_INST_ID not in", values, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_INST_ID between", value1, value2, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInstIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_INST_ID not between", value1, value2, "matchPlayInstId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdIsNull() {
            addCriterion("MATCH_PLAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdIsNotNull() {
            addCriterion("MATCH_PLAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID =", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID <>", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdGreaterThan(Long value) {
            addCriterion("MATCH_PLAY_ID >", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID >=", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdLessThan(Long value) {
            addCriterion("MATCH_PLAY_ID <", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_PLAY_ID <=", value, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdIn(List<Long> values) {
            addCriterion("MATCH_PLAY_ID in", values, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotIn(List<Long> values) {
            addCriterion("MATCH_PLAY_ID not in", values, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_ID between", value1, value2, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_PLAY_ID not between", value1, value2, "matchPlayId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameIsNull() {
            addCriterion("MATCH_PLAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameIsNotNull() {
            addCriterion("MATCH_PLAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameEqualTo(String value) {
            addCriterion("MATCH_PLAY_NAME =", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameNotEqualTo(String value) {
            addCriterion("MATCH_PLAY_NAME <>", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameGreaterThan(String value) {
            addCriterion("MATCH_PLAY_NAME >", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_NAME >=", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameLessThan(String value) {
            addCriterion("MATCH_PLAY_NAME <", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameLessThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_NAME <=", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameLike(String value) {
            addCriterion("MATCH_PLAY_NAME like", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameNotLike(String value) {
            addCriterion("MATCH_PLAY_NAME not like", value, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameIn(List<String> values) {
            addCriterion("MATCH_PLAY_NAME in", values, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameNotIn(List<String> values) {
            addCriterion("MATCH_PLAY_NAME not in", values, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_NAME between", value1, value2, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchPlayNameNotBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_NAME not between", value1, value2, "matchPlayName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdIsNull() {
            addCriterion("MATCH_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdIsNotNull() {
            addCriterion("MATCH_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdEqualTo(Long value) {
            addCriterion("MATCH_INFO_ID =", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdNotEqualTo(Long value) {
            addCriterion("MATCH_INFO_ID <>", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdGreaterThan(Long value) {
            addCriterion("MATCH_INFO_ID >", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_INFO_ID >=", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdLessThan(Long value) {
            addCriterion("MATCH_INFO_ID <", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_INFO_ID <=", value, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdIn(List<Long> values) {
            addCriterion("MATCH_INFO_ID in", values, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdNotIn(List<Long> values) {
            addCriterion("MATCH_INFO_ID not in", values, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_INFO_ID between", value1, value2, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_INFO_ID not between", value1, value2, "matchInfoId");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamIsNull() {
            addCriterion("MATCH_PLAY_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamIsNotNull() {
            addCriterion("MATCH_PLAY_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamEqualTo(String value) {
            addCriterion("MATCH_PLAY_PARAM =", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamNotEqualTo(String value) {
            addCriterion("MATCH_PLAY_PARAM <>", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamGreaterThan(String value) {
            addCriterion("MATCH_PLAY_PARAM >", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_PARAM >=", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamLessThan(String value) {
            addCriterion("MATCH_PLAY_PARAM <", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamLessThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_PARAM <=", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamLike(String value) {
            addCriterion("MATCH_PLAY_PARAM like", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamNotLike(String value) {
            addCriterion("MATCH_PLAY_PARAM not like", value, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamIn(List<String> values) {
            addCriterion("MATCH_PLAY_PARAM in", values, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamNotIn(List<String> values) {
            addCriterion("MATCH_PLAY_PARAM not in", values, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_PARAM between", value1, value2, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayParamNotBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_PARAM not between", value1, value2, "matchPlayParam");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountIsNull() {
            addCriterion("MATCH_PLAY_MIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountIsNotNull() {
            addCriterion("MATCH_PLAY_MIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT =", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountNotEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT <>", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountGreaterThan(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT >", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT >=", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountLessThan(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT <", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountLessThanOrEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MIN_COUNT <=", value, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountIn(List<Integer> values) {
            addCriterion("MATCH_PLAY_MIN_COUNT in", values, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountNotIn(List<Integer> values) {
            addCriterion("MATCH_PLAY_MIN_COUNT not in", values, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_PLAY_MIN_COUNT between", value1, value2, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMinCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_PLAY_MIN_COUNT not between", value1, value2, "matchPlayMinCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountIsNull() {
            addCriterion("MATCH_PLAY_MAX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountIsNotNull() {
            addCriterion("MATCH_PLAY_MAX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT =", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountNotEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT <>", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountGreaterThan(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT >", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT >=", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountLessThan(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT <", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("MATCH_PLAY_MAX_COUNT <=", value, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountIn(List<Integer> values) {
            addCriterion("MATCH_PLAY_MAX_COUNT in", values, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountNotIn(List<Integer> values) {
            addCriterion("MATCH_PLAY_MAX_COUNT not in", values, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_PLAY_MAX_COUNT between", value1, value2, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlayMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_PLAY_MAX_COUNT not between", value1, value2, "matchPlayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagIsNull() {
            addCriterion("MATCH_PLAY_SELLING_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagIsNotNull() {
            addCriterion("MATCH_PLAY_SELLING_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagEqualTo(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG =", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagNotEqualTo(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG <>", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagGreaterThan(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG >", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG >=", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagLessThan(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG <", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagLessThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG <=", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagLike(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG like", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagNotLike(String value) {
            addCriterion("MATCH_PLAY_SELLING_FLAG not like", value, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagIn(List<String> values) {
            addCriterion("MATCH_PLAY_SELLING_FLAG in", values, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagNotIn(List<String> values) {
            addCriterion("MATCH_PLAY_SELLING_FLAG not in", values, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_SELLING_FLAG between", value1, value2, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlaySellingFlagNotBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_SELLING_FLAG not between", value1, value2, "matchPlaySellingFlag");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsIsNull() {
            addCriterion("MATCH_PLAY_STS is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsIsNotNull() {
            addCriterion("MATCH_PLAY_STS is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsEqualTo(String value) {
            addCriterion("MATCH_PLAY_STS =", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsNotEqualTo(String value) {
            addCriterion("MATCH_PLAY_STS <>", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsGreaterThan(String value) {
            addCriterion("MATCH_PLAY_STS >", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_STS >=", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsLessThan(String value) {
            addCriterion("MATCH_PLAY_STS <", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsLessThanOrEqualTo(String value) {
            addCriterion("MATCH_PLAY_STS <=", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsLike(String value) {
            addCriterion("MATCH_PLAY_STS like", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsNotLike(String value) {
            addCriterion("MATCH_PLAY_STS not like", value, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsIn(List<String> values) {
            addCriterion("MATCH_PLAY_STS in", values, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsNotIn(List<String> values) {
            addCriterion("MATCH_PLAY_STS not in", values, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_STS between", value1, value2, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayStsNotBetween(String value1, String value2) {
            addCriterion("MATCH_PLAY_STS not between", value1, value2, "matchPlaySts");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeIsNull() {
            addCriterion("MATCH_PLAY_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeIsNotNull() {
            addCriterion("MATCH_PLAY_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeEqualTo(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME =", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeNotEqualTo(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME <>", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeGreaterThan(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME >", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME >=", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeLessThan(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME <", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("MATCH_PLAY_CREATE_TIME <=", value, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeIn(List<Date> values) {
            addCriterion("MATCH_PLAY_CREATE_TIME in", values, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeNotIn(List<Date> values) {
            addCriterion("MATCH_PLAY_CREATE_TIME not in", values, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeBetween(Date value1, Date value2) {
            addCriterion("MATCH_PLAY_CREATE_TIME between", value1, value2, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("MATCH_PLAY_CREATE_TIME not between", value1, value2, "matchPlayCreateTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeIsNull() {
            addCriterion("MATCH_PLAY_INVALID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeIsNotNull() {
            addCriterion("MATCH_PLAY_INVALID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeEqualTo(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME =", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeNotEqualTo(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME <>", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeGreaterThan(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME >", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME >=", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeLessThan(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME <", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeLessThanOrEqualTo(Date value) {
            addCriterion("MATCH_PLAY_INVALID_TIME <=", value, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeIn(List<Date> values) {
            addCriterion("MATCH_PLAY_INVALID_TIME in", values, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeNotIn(List<Date> values) {
            addCriterion("MATCH_PLAY_INVALID_TIME not in", values, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeBetween(Date value1, Date value2) {
            addCriterion("MATCH_PLAY_INVALID_TIME between", value1, value2, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchPlayInvalidTimeNotBetween(Date value1, Date value2) {
            addCriterion("MATCH_PLAY_INVALID_TIME not between", value1, value2, "matchPlayInvalidTime");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeIsNull() {
            addCriterion("MATCH_RESULT_ODDS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeIsNotNull() {
            addCriterion("MATCH_RESULT_ODDS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeEqualTo(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE =", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeNotEqualTo(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE <>", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeGreaterThan(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE >", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE >=", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeLessThan(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE <", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE <=", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeLike(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE like", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeNotLike(String value) {
            addCriterion("MATCH_RESULT_ODDS_CODE not like", value, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeIn(List<String> values) {
            addCriterion("MATCH_RESULT_ODDS_CODE in", values, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeNotIn(List<String> values) {
            addCriterion("MATCH_RESULT_ODDS_CODE not in", values, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeBetween(String value1, String value2) {
            addCriterion("MATCH_RESULT_ODDS_CODE between", value1, value2, "matchResultOddsCode");
            return (Criteria) this;
        }

        public Criteria andMatchResultOddsCodeNotBetween(String value1, String value2) {
            addCriterion("MATCH_RESULT_ODDS_CODE not between", value1, value2, "matchResultOddsCode");
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