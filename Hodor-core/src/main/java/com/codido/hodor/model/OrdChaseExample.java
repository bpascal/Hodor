package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdChaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdChaseExample() {
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

        public Criteria andChaseIdIsNull() {
            addCriterion("CHASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChaseIdIsNotNull() {
            addCriterion("CHASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChaseIdEqualTo(Long value) {
            addCriterion("CHASE_ID =", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdNotEqualTo(Long value) {
            addCriterion("CHASE_ID <>", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdGreaterThan(Long value) {
            addCriterion("CHASE_ID >", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHASE_ID >=", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdLessThan(Long value) {
            addCriterion("CHASE_ID <", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdLessThanOrEqualTo(Long value) {
            addCriterion("CHASE_ID <=", value, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdIn(List<Long> values) {
            addCriterion("CHASE_ID in", values, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdNotIn(List<Long> values) {
            addCriterion("CHASE_ID not in", values, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdBetween(Long value1, Long value2) {
            addCriterion("CHASE_ID between", value1, value2, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseIdNotBetween(Long value1, Long value2) {
            addCriterion("CHASE_ID not between", value1, value2, "chaseId");
            return (Criteria) this;
        }

        public Criteria andChaseNoIsNull() {
            addCriterion("CHASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andChaseNoIsNotNull() {
            addCriterion("CHASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChaseNoEqualTo(String value) {
            addCriterion("CHASE_NO =", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotEqualTo(String value) {
            addCriterion("CHASE_NO <>", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoGreaterThan(String value) {
            addCriterion("CHASE_NO >", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHASE_NO >=", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLessThan(String value) {
            addCriterion("CHASE_NO <", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLessThanOrEqualTo(String value) {
            addCriterion("CHASE_NO <=", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoLike(String value) {
            addCriterion("CHASE_NO like", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotLike(String value) {
            addCriterion("CHASE_NO not like", value, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoIn(List<String> values) {
            addCriterion("CHASE_NO in", values, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotIn(List<String> values) {
            addCriterion("CHASE_NO not in", values, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoBetween(String value1, String value2) {
            addCriterion("CHASE_NO between", value1, value2, "chaseNo");
            return (Criteria) this;
        }

        public Criteria andChaseNoNotBetween(String value1, String value2) {
            addCriterion("CHASE_NO not between", value1, value2, "chaseNo");
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

        public Criteria andChaseStsIsNull() {
            addCriterion("CHASE_STS is null");
            return (Criteria) this;
        }

        public Criteria andChaseStsIsNotNull() {
            addCriterion("CHASE_STS is not null");
            return (Criteria) this;
        }

        public Criteria andChaseStsEqualTo(String value) {
            addCriterion("CHASE_STS =", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsNotEqualTo(String value) {
            addCriterion("CHASE_STS <>", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsGreaterThan(String value) {
            addCriterion("CHASE_STS >", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsGreaterThanOrEqualTo(String value) {
            addCriterion("CHASE_STS >=", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsLessThan(String value) {
            addCriterion("CHASE_STS <", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsLessThanOrEqualTo(String value) {
            addCriterion("CHASE_STS <=", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsLike(String value) {
            addCriterion("CHASE_STS like", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsNotLike(String value) {
            addCriterion("CHASE_STS not like", value, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsIn(List<String> values) {
            addCriterion("CHASE_STS in", values, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsNotIn(List<String> values) {
            addCriterion("CHASE_STS not in", values, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsBetween(String value1, String value2) {
            addCriterion("CHASE_STS between", value1, value2, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseStsNotBetween(String value1, String value2) {
            addCriterion("CHASE_STS not between", value1, value2, "chaseSts");
            return (Criteria) this;
        }

        public Criteria andChaseTimesIsNull() {
            addCriterion("CHASE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andChaseTimesIsNotNull() {
            addCriterion("CHASE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andChaseTimesEqualTo(Integer value) {
            addCriterion("CHASE_TIMES =", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesNotEqualTo(Integer value) {
            addCriterion("CHASE_TIMES <>", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesGreaterThan(Integer value) {
            addCriterion("CHASE_TIMES >", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHASE_TIMES >=", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesLessThan(Integer value) {
            addCriterion("CHASE_TIMES <", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesLessThanOrEqualTo(Integer value) {
            addCriterion("CHASE_TIMES <=", value, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesIn(List<Integer> values) {
            addCriterion("CHASE_TIMES in", values, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesNotIn(List<Integer> values) {
            addCriterion("CHASE_TIMES not in", values, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_TIMES between", value1, value2, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_TIMES not between", value1, value2, "chaseTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesIsNull() {
            addCriterion("CHASE_CURRENT_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesIsNotNull() {
            addCriterion("CHASE_CURRENT_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesEqualTo(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES =", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesNotEqualTo(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES <>", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesGreaterThan(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES >", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES >=", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesLessThan(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES <", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesLessThanOrEqualTo(Integer value) {
            addCriterion("CHASE_CURRENT_TIMES <=", value, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesIn(List<Integer> values) {
            addCriterion("CHASE_CURRENT_TIMES in", values, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesNotIn(List<Integer> values) {
            addCriterion("CHASE_CURRENT_TIMES not in", values, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_CURRENT_TIMES between", value1, value2, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCurrentTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_CURRENT_TIMES not between", value1, value2, "chaseCurrentTimes");
            return (Criteria) this;
        }

        public Criteria andEndMethodIsNull() {
            addCriterion("END_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andEndMethodIsNotNull() {
            addCriterion("END_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andEndMethodEqualTo(String value) {
            addCriterion("END_METHOD =", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodNotEqualTo(String value) {
            addCriterion("END_METHOD <>", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodGreaterThan(String value) {
            addCriterion("END_METHOD >", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodGreaterThanOrEqualTo(String value) {
            addCriterion("END_METHOD >=", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodLessThan(String value) {
            addCriterion("END_METHOD <", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodLessThanOrEqualTo(String value) {
            addCriterion("END_METHOD <=", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodLike(String value) {
            addCriterion("END_METHOD like", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodNotLike(String value) {
            addCriterion("END_METHOD not like", value, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodIn(List<String> values) {
            addCriterion("END_METHOD in", values, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodNotIn(List<String> values) {
            addCriterion("END_METHOD not in", values, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodBetween(String value1, String value2) {
            addCriterion("END_METHOD between", value1, value2, "endMethod");
            return (Criteria) this;
        }

        public Criteria andEndMethodNotBetween(String value1, String value2) {
            addCriterion("END_METHOD not between", value1, value2, "endMethod");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtIsNull() {
            addCriterion("PER_TIME_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtIsNotNull() {
            addCriterion("PER_TIME_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtEqualTo(Integer value) {
            addCriterion("PER_TIME_AMT =", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtNotEqualTo(Integer value) {
            addCriterion("PER_TIME_AMT <>", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtGreaterThan(Integer value) {
            addCriterion("PER_TIME_AMT >", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("PER_TIME_AMT >=", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtLessThan(Integer value) {
            addCriterion("PER_TIME_AMT <", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtLessThanOrEqualTo(Integer value) {
            addCriterion("PER_TIME_AMT <=", value, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtIn(List<Integer> values) {
            addCriterion("PER_TIME_AMT in", values, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtNotIn(List<Integer> values) {
            addCriterion("PER_TIME_AMT not in", values, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtBetween(Integer value1, Integer value2) {
            addCriterion("PER_TIME_AMT between", value1, value2, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("PER_TIME_AMT not between", value1, value2, "perTimeAmt");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsIsNull() {
            addCriterion("PER_TIME_BETTING_COUNTS is null");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsIsNotNull() {
            addCriterion("PER_TIME_BETTING_COUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsEqualTo(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS =", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsNotEqualTo(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS <>", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsGreaterThan(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS >", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsGreaterThanOrEqualTo(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS >=", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsLessThan(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS <", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsLessThanOrEqualTo(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS <=", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsLike(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS like", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsNotLike(String value) {
            addCriterion("PER_TIME_BETTING_COUNTS not like", value, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsIn(List<String> values) {
            addCriterion("PER_TIME_BETTING_COUNTS in", values, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsNotIn(List<String> values) {
            addCriterion("PER_TIME_BETTING_COUNTS not in", values, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsBetween(String value1, String value2) {
            addCriterion("PER_TIME_BETTING_COUNTS between", value1, value2, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andPerTimeBettingCountsNotBetween(String value1, String value2) {
            addCriterion("PER_TIME_BETTING_COUNTS not between", value1, value2, "perTimeBettingCounts");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesIsNull() {
            addCriterion("CHASE_BETTING_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesIsNotNull() {
            addCriterion("CHASE_BETTING_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesEqualTo(Integer value) {
            addCriterion("CHASE_BETTING_TIMES =", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesNotEqualTo(Integer value) {
            addCriterion("CHASE_BETTING_TIMES <>", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesGreaterThan(Integer value) {
            addCriterion("CHASE_BETTING_TIMES >", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHASE_BETTING_TIMES >=", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesLessThan(Integer value) {
            addCriterion("CHASE_BETTING_TIMES <", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesLessThanOrEqualTo(Integer value) {
            addCriterion("CHASE_BETTING_TIMES <=", value, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesIn(List<Integer> values) {
            addCriterion("CHASE_BETTING_TIMES in", values, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesNotIn(List<Integer> values) {
            addCriterion("CHASE_BETTING_TIMES not in", values, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_BETTING_TIMES between", value1, value2, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseBettingTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CHASE_BETTING_TIMES not between", value1, value2, "chaseBettingTimes");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeIsNull() {
            addCriterion("CHASE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeIsNotNull() {
            addCriterion("CHASE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeEqualTo(Date value) {
            addCriterion("CHASE_CREATE_TIME =", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeNotEqualTo(Date value) {
            addCriterion("CHASE_CREATE_TIME <>", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeGreaterThan(Date value) {
            addCriterion("CHASE_CREATE_TIME >", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHASE_CREATE_TIME >=", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeLessThan(Date value) {
            addCriterion("CHASE_CREATE_TIME <", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHASE_CREATE_TIME <=", value, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeIn(List<Date> values) {
            addCriterion("CHASE_CREATE_TIME in", values, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeNotIn(List<Date> values) {
            addCriterion("CHASE_CREATE_TIME not in", values, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CHASE_CREATE_TIME between", value1, value2, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHASE_CREATE_TIME not between", value1, value2, "chaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeIsNull() {
            addCriterion("CHASE_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeIsNotNull() {
            addCriterion("CHASE_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeEqualTo(Date value) {
            addCriterion("CHASE_CANCEL_TIME =", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeNotEqualTo(Date value) {
            addCriterion("CHASE_CANCEL_TIME <>", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeGreaterThan(Date value) {
            addCriterion("CHASE_CANCEL_TIME >", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHASE_CANCEL_TIME >=", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeLessThan(Date value) {
            addCriterion("CHASE_CANCEL_TIME <", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHASE_CANCEL_TIME <=", value, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeIn(List<Date> values) {
            addCriterion("CHASE_CANCEL_TIME in", values, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeNotIn(List<Date> values) {
            addCriterion("CHASE_CANCEL_TIME not in", values, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CHASE_CANCEL_TIME between", value1, value2, "chaseCancelTime");
            return (Criteria) this;
        }

        public Criteria andChaseCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHASE_CANCEL_TIME not between", value1, value2, "chaseCancelTime");
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