package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class OrdBettingSingleInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdBettingSingleInstExample() {
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

        public Criteria andSingleInstIdIsNull() {
            addCriterion("SINGLE_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdIsNotNull() {
            addCriterion("SINGLE_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdEqualTo(Long value) {
            addCriterion("SINGLE_INST_ID =", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdNotEqualTo(Long value) {
            addCriterion("SINGLE_INST_ID <>", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdGreaterThan(Long value) {
            addCriterion("SINGLE_INST_ID >", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SINGLE_INST_ID >=", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdLessThan(Long value) {
            addCriterion("SINGLE_INST_ID <", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdLessThanOrEqualTo(Long value) {
            addCriterion("SINGLE_INST_ID <=", value, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdIn(List<Long> values) {
            addCriterion("SINGLE_INST_ID in", values, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdNotIn(List<Long> values) {
            addCriterion("SINGLE_INST_ID not in", values, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdBetween(Long value1, Long value2) {
            addCriterion("SINGLE_INST_ID between", value1, value2, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstIdNotBetween(Long value1, Long value2) {
            addCriterion("SINGLE_INST_ID not between", value1, value2, "singleInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIsNull() {
            addCriterion("LOTTO_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIsNotNull() {
            addCriterion("LOTTO_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID =", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID <>", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdGreaterThan(Long value) {
            addCriterion("LOTTO_INST_ID >", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID >=", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdLessThan(Long value) {
            addCriterion("LOTTO_INST_ID <", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdLessThanOrEqualTo(Long value) {
            addCriterion("LOTTO_INST_ID <=", value, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdIn(List<Long> values) {
            addCriterion("LOTTO_INST_ID in", values, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotIn(List<Long> values) {
            addCriterion("LOTTO_INST_ID not in", values, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdBetween(Long value1, Long value2) {
            addCriterion("LOTTO_INST_ID between", value1, value2, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andLottoInstIdNotBetween(Long value1, Long value2) {
            addCriterion("LOTTO_INST_ID not between", value1, value2, "lottoInstId");
            return (Criteria) this;
        }

        public Criteria andPeriodNameIsNull() {
            addCriterion("PERIOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodNameIsNotNull() {
            addCriterion("PERIOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodNameEqualTo(String value) {
            addCriterion("PERIOD_NAME =", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameNotEqualTo(String value) {
            addCriterion("PERIOD_NAME <>", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameGreaterThan(String value) {
            addCriterion("PERIOD_NAME >", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_NAME >=", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameLessThan(String value) {
            addCriterion("PERIOD_NAME <", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_NAME <=", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameLike(String value) {
            addCriterion("PERIOD_NAME like", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameNotLike(String value) {
            addCriterion("PERIOD_NAME not like", value, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameIn(List<String> values) {
            addCriterion("PERIOD_NAME in", values, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameNotIn(List<String> values) {
            addCriterion("PERIOD_NAME not in", values, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameBetween(String value1, String value2) {
            addCriterion("PERIOD_NAME between", value1, value2, "periodName");
            return (Criteria) this;
        }

        public Criteria andPeriodNameNotBetween(String value1, String value2) {
            addCriterion("PERIOD_NAME not between", value1, value2, "periodName");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdIsNull() {
            addCriterion("BETTING_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdIsNotNull() {
            addCriterion("BETTING_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdEqualTo(Long value) {
            addCriterion("BETTING_INST_ID =", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdNotEqualTo(Long value) {
            addCriterion("BETTING_INST_ID <>", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdGreaterThan(Long value) {
            addCriterion("BETTING_INST_ID >", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BETTING_INST_ID >=", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdLessThan(Long value) {
            addCriterion("BETTING_INST_ID <", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdLessThanOrEqualTo(Long value) {
            addCriterion("BETTING_INST_ID <=", value, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdIn(List<Long> values) {
            addCriterion("BETTING_INST_ID in", values, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdNotIn(List<Long> values) {
            addCriterion("BETTING_INST_ID not in", values, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdBetween(Long value1, Long value2) {
            addCriterion("BETTING_INST_ID between", value1, value2, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andBettingInstIdNotBetween(Long value1, Long value2) {
            addCriterion("BETTING_INST_ID not between", value1, value2, "bettingInstId");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberIsNull() {
            addCriterion("SINGLE_INST_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberIsNotNull() {
            addCriterion("SINGLE_INST_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberEqualTo(String value) {
            addCriterion("SINGLE_INST_NUMBER =", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberNotEqualTo(String value) {
            addCriterion("SINGLE_INST_NUMBER <>", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberGreaterThan(String value) {
            addCriterion("SINGLE_INST_NUMBER >", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_NUMBER >=", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberLessThan(String value) {
            addCriterion("SINGLE_INST_NUMBER <", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberLessThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_NUMBER <=", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberLike(String value) {
            addCriterion("SINGLE_INST_NUMBER like", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberNotLike(String value) {
            addCriterion("SINGLE_INST_NUMBER not like", value, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberIn(List<String> values) {
            addCriterion("SINGLE_INST_NUMBER in", values, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberNotIn(List<String> values) {
            addCriterion("SINGLE_INST_NUMBER not in", values, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_NUMBER between", value1, value2, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstNumberNotBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_NUMBER not between", value1, value2, "singleInstNumber");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesIsNull() {
            addCriterion("SINGLE_INST_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesIsNotNull() {
            addCriterion("SINGLE_INST_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesEqualTo(Integer value) {
            addCriterion("SINGLE_INST_TIMES =", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesNotEqualTo(Integer value) {
            addCriterion("SINGLE_INST_TIMES <>", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesGreaterThan(Integer value) {
            addCriterion("SINGLE_INST_TIMES >", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("SINGLE_INST_TIMES >=", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesLessThan(Integer value) {
            addCriterion("SINGLE_INST_TIMES <", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesLessThanOrEqualTo(Integer value) {
            addCriterion("SINGLE_INST_TIMES <=", value, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesIn(List<Integer> values) {
            addCriterion("SINGLE_INST_TIMES in", values, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesNotIn(List<Integer> values) {
            addCriterion("SINGLE_INST_TIMES not in", values, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesBetween(Integer value1, Integer value2) {
            addCriterion("SINGLE_INST_TIMES between", value1, value2, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andSingleInstTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("SINGLE_INST_TIMES not between", value1, value2, "singleInstTimes");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIsNull() {
            addCriterion("LOTTO_BONUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIsNotNull() {
            addCriterion("LOTTO_BONUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID =", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID <>", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdGreaterThan(Long value) {
            addCriterion("LOTTO_BONUS_ID >", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID >=", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdLessThan(Long value) {
            addCriterion("LOTTO_BONUS_ID <", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdLessThanOrEqualTo(Long value) {
            addCriterion("LOTTO_BONUS_ID <=", value, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdIn(List<Long> values) {
            addCriterion("LOTTO_BONUS_ID in", values, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotIn(List<Long> values) {
            addCriterion("LOTTO_BONUS_ID not in", values, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdBetween(Long value1, Long value2) {
            addCriterion("LOTTO_BONUS_ID between", value1, value2, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusIdNotBetween(Long value1, Long value2) {
            addCriterion("LOTTO_BONUS_ID not between", value1, value2, "lottoBonusId");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIsNull() {
            addCriterion("LOTTO_BONUS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIsNotNull() {
            addCriterion("LOTTO_BONUS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL =", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <>", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelGreaterThan(String value) {
            addCriterion("LOTTO_BONUS_LEVEL >", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL >=", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLessThan(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BONUS_LEVEL <=", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelLike(String value) {
            addCriterion("LOTTO_BONUS_LEVEL like", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotLike(String value) {
            addCriterion("LOTTO_BONUS_LEVEL not like", value, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelIn(List<String> values) {
            addCriterion("LOTTO_BONUS_LEVEL in", values, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotIn(List<String> values) {
            addCriterion("LOTTO_BONUS_LEVEL not in", values, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_LEVEL between", value1, value2, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andLottoBonusLevelNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BONUS_LEVEL not between", value1, value2, "lottoBonusLevel");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsIsNull() {
            addCriterion("SINGLE_INST_STS is null");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsIsNotNull() {
            addCriterion("SINGLE_INST_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsEqualTo(String value) {
            addCriterion("SINGLE_INST_STS =", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsNotEqualTo(String value) {
            addCriterion("SINGLE_INST_STS <>", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsGreaterThan(String value) {
            addCriterion("SINGLE_INST_STS >", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsGreaterThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_STS >=", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsLessThan(String value) {
            addCriterion("SINGLE_INST_STS <", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsLessThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_STS <=", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsLike(String value) {
            addCriterion("SINGLE_INST_STS like", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsNotLike(String value) {
            addCriterion("SINGLE_INST_STS not like", value, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsIn(List<String> values) {
            addCriterion("SINGLE_INST_STS in", values, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsNotIn(List<String> values) {
            addCriterion("SINGLE_INST_STS not in", values, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_STS between", value1, value2, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstStsNotBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_STS not between", value1, value2, "singleInstSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsIsNull() {
            addCriterion("SINGLE_INST_BONUS_STS is null");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsIsNotNull() {
            addCriterion("SINGLE_INST_BONUS_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsEqualTo(String value) {
            addCriterion("SINGLE_INST_BONUS_STS =", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsNotEqualTo(String value) {
            addCriterion("SINGLE_INST_BONUS_STS <>", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsGreaterThan(String value) {
            addCriterion("SINGLE_INST_BONUS_STS >", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsGreaterThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_BONUS_STS >=", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsLessThan(String value) {
            addCriterion("SINGLE_INST_BONUS_STS <", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsLessThanOrEqualTo(String value) {
            addCriterion("SINGLE_INST_BONUS_STS <=", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsLike(String value) {
            addCriterion("SINGLE_INST_BONUS_STS like", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsNotLike(String value) {
            addCriterion("SINGLE_INST_BONUS_STS not like", value, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsIn(List<String> values) {
            addCriterion("SINGLE_INST_BONUS_STS in", values, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsNotIn(List<String> values) {
            addCriterion("SINGLE_INST_BONUS_STS not in", values, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_BONUS_STS between", value1, value2, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andSingleInstBonusStsNotBetween(String value1, String value2) {
            addCriterion("SINGLE_INST_BONUS_STS not between", value1, value2, "singleInstBonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusAmtIsNull() {
            addCriterion("BONUS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andBonusAmtIsNotNull() {
            addCriterion("BONUS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andBonusAmtEqualTo(Long value) {
            addCriterion("BONUS_AMT =", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtNotEqualTo(Long value) {
            addCriterion("BONUS_AMT <>", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtGreaterThan(Long value) {
            addCriterion("BONUS_AMT >", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("BONUS_AMT >=", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtLessThan(Long value) {
            addCriterion("BONUS_AMT <", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtLessThanOrEqualTo(Long value) {
            addCriterion("BONUS_AMT <=", value, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtIn(List<Long> values) {
            addCriterion("BONUS_AMT in", values, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtNotIn(List<Long> values) {
            addCriterion("BONUS_AMT not in", values, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtBetween(Long value1, Long value2) {
            addCriterion("BONUS_AMT between", value1, value2, "bonusAmt");
            return (Criteria) this;
        }

        public Criteria andBonusAmtNotBetween(Long value1, Long value2) {
            addCriterion("BONUS_AMT not between", value1, value2, "bonusAmt");
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