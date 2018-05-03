package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchPlayOddsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchPlayOddsExample() {
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

        public Criteria andOddsIdIsNull() {
            addCriterion("ODDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOddsIdIsNotNull() {
            addCriterion("ODDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOddsIdEqualTo(Long value) {
            addCriterion("ODDS_ID =", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdNotEqualTo(Long value) {
            addCriterion("ODDS_ID <>", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdGreaterThan(Long value) {
            addCriterion("ODDS_ID >", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ODDS_ID >=", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdLessThan(Long value) {
            addCriterion("ODDS_ID <", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdLessThanOrEqualTo(Long value) {
            addCriterion("ODDS_ID <=", value, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdIn(List<Long> values) {
            addCriterion("ODDS_ID in", values, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdNotIn(List<Long> values) {
            addCriterion("ODDS_ID not in", values, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdBetween(Long value1, Long value2) {
            addCriterion("ODDS_ID between", value1, value2, "oddsId");
            return (Criteria) this;
        }

        public Criteria andOddsIdNotBetween(Long value1, Long value2) {
            addCriterion("ODDS_ID not between", value1, value2, "oddsId");
            return (Criteria) this;
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

        public Criteria andOddsNameIsNull() {
            addCriterion("ODDS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOddsNameIsNotNull() {
            addCriterion("ODDS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOddsNameEqualTo(String value) {
            addCriterion("ODDS_NAME =", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotEqualTo(String value) {
            addCriterion("ODDS_NAME <>", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameGreaterThan(String value) {
            addCriterion("ODDS_NAME >", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_NAME >=", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLessThan(String value) {
            addCriterion("ODDS_NAME <", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLessThanOrEqualTo(String value) {
            addCriterion("ODDS_NAME <=", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLike(String value) {
            addCriterion("ODDS_NAME like", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotLike(String value) {
            addCriterion("ODDS_NAME not like", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameIn(List<String> values) {
            addCriterion("ODDS_NAME in", values, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotIn(List<String> values) {
            addCriterion("ODDS_NAME not in", values, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameBetween(String value1, String value2) {
            addCriterion("ODDS_NAME between", value1, value2, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotBetween(String value1, String value2) {
            addCriterion("ODDS_NAME not between", value1, value2, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsCodeIsNull() {
            addCriterion("ODDS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOddsCodeIsNotNull() {
            addCriterion("ODDS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOddsCodeEqualTo(String value) {
            addCriterion("ODDS_CODE =", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeNotEqualTo(String value) {
            addCriterion("ODDS_CODE <>", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeGreaterThan(String value) {
            addCriterion("ODDS_CODE >", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_CODE >=", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeLessThan(String value) {
            addCriterion("ODDS_CODE <", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeLessThanOrEqualTo(String value) {
            addCriterion("ODDS_CODE <=", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeLike(String value) {
            addCriterion("ODDS_CODE like", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeNotLike(String value) {
            addCriterion("ODDS_CODE not like", value, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeIn(List<String> values) {
            addCriterion("ODDS_CODE in", values, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeNotIn(List<String> values) {
            addCriterion("ODDS_CODE not in", values, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeBetween(String value1, String value2) {
            addCriterion("ODDS_CODE between", value1, value2, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsCodeNotBetween(String value1, String value2) {
            addCriterion("ODDS_CODE not between", value1, value2, "oddsCode");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameIsNull() {
            addCriterion("ODDS_PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameIsNotNull() {
            addCriterion("ODDS_PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameEqualTo(String value) {
            addCriterion("ODDS_PARAM_NAME =", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameNotEqualTo(String value) {
            addCriterion("ODDS_PARAM_NAME <>", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameGreaterThan(String value) {
            addCriterion("ODDS_PARAM_NAME >", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_PARAM_NAME >=", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameLessThan(String value) {
            addCriterion("ODDS_PARAM_NAME <", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameLessThanOrEqualTo(String value) {
            addCriterion("ODDS_PARAM_NAME <=", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameLike(String value) {
            addCriterion("ODDS_PARAM_NAME like", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameNotLike(String value) {
            addCriterion("ODDS_PARAM_NAME not like", value, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameIn(List<String> values) {
            addCriterion("ODDS_PARAM_NAME in", values, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameNotIn(List<String> values) {
            addCriterion("ODDS_PARAM_NAME not in", values, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameBetween(String value1, String value2) {
            addCriterion("ODDS_PARAM_NAME between", value1, value2, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamNameNotBetween(String value1, String value2) {
            addCriterion("ODDS_PARAM_NAME not between", value1, value2, "oddsParamName");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueIsNull() {
            addCriterion("ODDS_PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueIsNotNull() {
            addCriterion("ODDS_PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueEqualTo(String value) {
            addCriterion("ODDS_PARAM_VALUE =", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueNotEqualTo(String value) {
            addCriterion("ODDS_PARAM_VALUE <>", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueGreaterThan(String value) {
            addCriterion("ODDS_PARAM_VALUE >", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_PARAM_VALUE >=", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueLessThan(String value) {
            addCriterion("ODDS_PARAM_VALUE <", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueLessThanOrEqualTo(String value) {
            addCriterion("ODDS_PARAM_VALUE <=", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueLike(String value) {
            addCriterion("ODDS_PARAM_VALUE like", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueNotLike(String value) {
            addCriterion("ODDS_PARAM_VALUE not like", value, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueIn(List<String> values) {
            addCriterion("ODDS_PARAM_VALUE in", values, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueNotIn(List<String> values) {
            addCriterion("ODDS_PARAM_VALUE not in", values, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueBetween(String value1, String value2) {
            addCriterion("ODDS_PARAM_VALUE between", value1, value2, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsParamValueNotBetween(String value1, String value2) {
            addCriterion("ODDS_PARAM_VALUE not between", value1, value2, "oddsParamValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueIsNull() {
            addCriterion("ODDS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andOddsValueIsNotNull() {
            addCriterion("ODDS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOddsValueEqualTo(BigDecimal value) {
            addCriterion("ODDS_VALUE =", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueNotEqualTo(BigDecimal value) {
            addCriterion("ODDS_VALUE <>", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueGreaterThan(BigDecimal value) {
            addCriterion("ODDS_VALUE >", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ODDS_VALUE >=", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueLessThan(BigDecimal value) {
            addCriterion("ODDS_VALUE <", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ODDS_VALUE <=", value, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueIn(List<BigDecimal> values) {
            addCriterion("ODDS_VALUE in", values, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueNotIn(List<BigDecimal> values) {
            addCriterion("ODDS_VALUE not in", values, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ODDS_VALUE between", value1, value2, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ODDS_VALUE not between", value1, value2, "oddsValue");
            return (Criteria) this;
        }

        public Criteria andOddsStsIsNull() {
            addCriterion("ODDS_STS is null");
            return (Criteria) this;
        }

        public Criteria andOddsStsIsNotNull() {
            addCriterion("ODDS_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOddsStsEqualTo(String value) {
            addCriterion("ODDS_STS =", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsNotEqualTo(String value) {
            addCriterion("ODDS_STS <>", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsGreaterThan(String value) {
            addCriterion("ODDS_STS >", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_STS >=", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsLessThan(String value) {
            addCriterion("ODDS_STS <", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsLessThanOrEqualTo(String value) {
            addCriterion("ODDS_STS <=", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsLike(String value) {
            addCriterion("ODDS_STS like", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsNotLike(String value) {
            addCriterion("ODDS_STS not like", value, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsIn(List<String> values) {
            addCriterion("ODDS_STS in", values, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsNotIn(List<String> values) {
            addCriterion("ODDS_STS not in", values, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsBetween(String value1, String value2) {
            addCriterion("ODDS_STS between", value1, value2, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsStsNotBetween(String value1, String value2) {
            addCriterion("ODDS_STS not between", value1, value2, "oddsSts");
            return (Criteria) this;
        }

        public Criteria andOddsTrendIsNull() {
            addCriterion("ODDS_TREND is null");
            return (Criteria) this;
        }

        public Criteria andOddsTrendIsNotNull() {
            addCriterion("ODDS_TREND is not null");
            return (Criteria) this;
        }

        public Criteria andOddsTrendEqualTo(String value) {
            addCriterion("ODDS_TREND =", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendNotEqualTo(String value) {
            addCriterion("ODDS_TREND <>", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendGreaterThan(String value) {
            addCriterion("ODDS_TREND >", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendGreaterThanOrEqualTo(String value) {
            addCriterion("ODDS_TREND >=", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendLessThan(String value) {
            addCriterion("ODDS_TREND <", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendLessThanOrEqualTo(String value) {
            addCriterion("ODDS_TREND <=", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendLike(String value) {
            addCriterion("ODDS_TREND like", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendNotLike(String value) {
            addCriterion("ODDS_TREND not like", value, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendIn(List<String> values) {
            addCriterion("ODDS_TREND in", values, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendNotIn(List<String> values) {
            addCriterion("ODDS_TREND not in", values, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendBetween(String value1, String value2) {
            addCriterion("ODDS_TREND between", value1, value2, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsTrendNotBetween(String value1, String value2) {
            addCriterion("ODDS_TREND not between", value1, value2, "oddsTrend");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeIsNull() {
            addCriterion("ODDS_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeIsNotNull() {
            addCriterion("ODDS_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeEqualTo(Date value) {
            addCriterion("ODDS_CREATE_TIME =", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeNotEqualTo(Date value) {
            addCriterion("ODDS_CREATE_TIME <>", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeGreaterThan(Date value) {
            addCriterion("ODDS_CREATE_TIME >", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ODDS_CREATE_TIME >=", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeLessThan(Date value) {
            addCriterion("ODDS_CREATE_TIME <", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ODDS_CREATE_TIME <=", value, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeIn(List<Date> values) {
            addCriterion("ODDS_CREATE_TIME in", values, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeNotIn(List<Date> values) {
            addCriterion("ODDS_CREATE_TIME not in", values, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ODDS_CREATE_TIME between", value1, value2, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ODDS_CREATE_TIME not between", value1, value2, "oddsCreateTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeIsNull() {
            addCriterion("ODDS_INVALID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeIsNotNull() {
            addCriterion("ODDS_INVALID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeEqualTo(Date value) {
            addCriterion("ODDS_INVALID_TIME =", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeNotEqualTo(Date value) {
            addCriterion("ODDS_INVALID_TIME <>", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeGreaterThan(Date value) {
            addCriterion("ODDS_INVALID_TIME >", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ODDS_INVALID_TIME >=", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeLessThan(Date value) {
            addCriterion("ODDS_INVALID_TIME <", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeLessThanOrEqualTo(Date value) {
            addCriterion("ODDS_INVALID_TIME <=", value, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeIn(List<Date> values) {
            addCriterion("ODDS_INVALID_TIME in", values, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeNotIn(List<Date> values) {
            addCriterion("ODDS_INVALID_TIME not in", values, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeBetween(Date value1, Date value2) {
            addCriterion("ODDS_INVALID_TIME between", value1, value2, "oddsInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOddsInvalidTimeNotBetween(Date value1, Date value2) {
            addCriterion("ODDS_INVALID_TIME not between", value1, value2, "oddsInvalidTime");
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