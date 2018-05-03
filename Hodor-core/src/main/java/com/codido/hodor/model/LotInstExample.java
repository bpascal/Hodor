package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotInstExample() {
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

        public Criteria andPeriodBeginTimeIsNull() {
            addCriterion("PERIOD_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeIsNotNull() {
            addCriterion("PERIOD_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeEqualTo(Date value) {
            addCriterion("PERIOD_BEGIN_TIME =", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeNotEqualTo(Date value) {
            addCriterion("PERIOD_BEGIN_TIME <>", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeGreaterThan(Date value) {
            addCriterion("PERIOD_BEGIN_TIME >", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PERIOD_BEGIN_TIME >=", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeLessThan(Date value) {
            addCriterion("PERIOD_BEGIN_TIME <", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("PERIOD_BEGIN_TIME <=", value, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeIn(List<Date> values) {
            addCriterion("PERIOD_BEGIN_TIME in", values, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeNotIn(List<Date> values) {
            addCriterion("PERIOD_BEGIN_TIME not in", values, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeBetween(Date value1, Date value2) {
            addCriterion("PERIOD_BEGIN_TIME between", value1, value2, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("PERIOD_BEGIN_TIME not between", value1, value2, "periodBeginTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeIsNull() {
            addCriterion("PERIOD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeIsNotNull() {
            addCriterion("PERIOD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeEqualTo(Date value) {
            addCriterion("PERIOD_END_TIME =", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeNotEqualTo(Date value) {
            addCriterion("PERIOD_END_TIME <>", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeGreaterThan(Date value) {
            addCriterion("PERIOD_END_TIME >", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PERIOD_END_TIME >=", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeLessThan(Date value) {
            addCriterion("PERIOD_END_TIME <", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("PERIOD_END_TIME <=", value, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeIn(List<Date> values) {
            addCriterion("PERIOD_END_TIME in", values, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeNotIn(List<Date> values) {
            addCriterion("PERIOD_END_TIME not in", values, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeBetween(Date value1, Date value2) {
            addCriterion("PERIOD_END_TIME between", value1, value2, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("PERIOD_END_TIME not between", value1, value2, "periodEndTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeIsNull() {
            addCriterion("PERIOD_BONUS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeIsNotNull() {
            addCriterion("PERIOD_BONUS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeEqualTo(Date value) {
            addCriterion("PERIOD_BONUS_TIME =", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeNotEqualTo(Date value) {
            addCriterion("PERIOD_BONUS_TIME <>", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeGreaterThan(Date value) {
            addCriterion("PERIOD_BONUS_TIME >", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PERIOD_BONUS_TIME >=", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeLessThan(Date value) {
            addCriterion("PERIOD_BONUS_TIME <", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeLessThanOrEqualTo(Date value) {
            addCriterion("PERIOD_BONUS_TIME <=", value, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeIn(List<Date> values) {
            addCriterion("PERIOD_BONUS_TIME in", values, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeNotIn(List<Date> values) {
            addCriterion("PERIOD_BONUS_TIME not in", values, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeBetween(Date value1, Date value2) {
            addCriterion("PERIOD_BONUS_TIME between", value1, value2, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusTimeNotBetween(Date value1, Date value2) {
            addCriterion("PERIOD_BONUS_TIME not between", value1, value2, "periodBonusTime");
            return (Criteria) this;
        }

        public Criteria andPeriodStsIsNull() {
            addCriterion("PERIOD_STS is null");
            return (Criteria) this;
        }

        public Criteria andPeriodStsIsNotNull() {
            addCriterion("PERIOD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodStsEqualTo(String value) {
            addCriterion("PERIOD_STS =", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsNotEqualTo(String value) {
            addCriterion("PERIOD_STS <>", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsGreaterThan(String value) {
            addCriterion("PERIOD_STS >", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_STS >=", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsLessThan(String value) {
            addCriterion("PERIOD_STS <", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_STS <=", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsLike(String value) {
            addCriterion("PERIOD_STS like", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsNotLike(String value) {
            addCriterion("PERIOD_STS not like", value, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsIn(List<String> values) {
            addCriterion("PERIOD_STS in", values, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsNotIn(List<String> values) {
            addCriterion("PERIOD_STS not in", values, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsBetween(String value1, String value2) {
            addCriterion("PERIOD_STS between", value1, value2, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodStsNotBetween(String value1, String value2) {
            addCriterion("PERIOD_STS not between", value1, value2, "periodSts");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsIsNull() {
            addCriterion("PERIOD_TAGS is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsIsNotNull() {
            addCriterion("PERIOD_TAGS is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsEqualTo(String value) {
            addCriterion("PERIOD_TAGS =", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNotEqualTo(String value) {
            addCriterion("PERIOD_TAGS <>", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsGreaterThan(String value) {
            addCriterion("PERIOD_TAGS >", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TAGS >=", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsLessThan(String value) {
            addCriterion("PERIOD_TAGS <", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TAGS <=", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsLike(String value) {
            addCriterion("PERIOD_TAGS like", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNotLike(String value) {
            addCriterion("PERIOD_TAGS not like", value, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsIn(List<String> values) {
            addCriterion("PERIOD_TAGS in", values, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNotIn(List<String> values) {
            addCriterion("PERIOD_TAGS not in", values, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsBetween(String value1, String value2) {
            addCriterion("PERIOD_TAGS between", value1, value2, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TAGS not between", value1, value2, "periodTags");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameIsNull() {
            addCriterion("PERIOD_TAGS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameIsNotNull() {
            addCriterion("PERIOD_TAGS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameEqualTo(String value) {
            addCriterion("PERIOD_TAGS_NAME =", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameNotEqualTo(String value) {
            addCriterion("PERIOD_TAGS_NAME <>", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameGreaterThan(String value) {
            addCriterion("PERIOD_TAGS_NAME >", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TAGS_NAME >=", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameLessThan(String value) {
            addCriterion("PERIOD_TAGS_NAME <", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TAGS_NAME <=", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameLike(String value) {
            addCriterion("PERIOD_TAGS_NAME like", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameNotLike(String value) {
            addCriterion("PERIOD_TAGS_NAME not like", value, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameIn(List<String> values) {
            addCriterion("PERIOD_TAGS_NAME in", values, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameNotIn(List<String> values) {
            addCriterion("PERIOD_TAGS_NAME not in", values, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameBetween(String value1, String value2) {
            addCriterion("PERIOD_TAGS_NAME between", value1, value2, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodTagsNameNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TAGS_NAME not between", value1, value2, "periodTagsName");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberIsNull() {
            addCriterion("PERIOD_BONUS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberIsNotNull() {
            addCriterion("PERIOD_BONUS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberEqualTo(String value) {
            addCriterion("PERIOD_BONUS_NUMBER =", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberNotEqualTo(String value) {
            addCriterion("PERIOD_BONUS_NUMBER <>", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberGreaterThan(String value) {
            addCriterion("PERIOD_BONUS_NUMBER >", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_BONUS_NUMBER >=", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberLessThan(String value) {
            addCriterion("PERIOD_BONUS_NUMBER <", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_BONUS_NUMBER <=", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberLike(String value) {
            addCriterion("PERIOD_BONUS_NUMBER like", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberNotLike(String value) {
            addCriterion("PERIOD_BONUS_NUMBER not like", value, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberIn(List<String> values) {
            addCriterion("PERIOD_BONUS_NUMBER in", values, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberNotIn(List<String> values) {
            addCriterion("PERIOD_BONUS_NUMBER not in", values, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberBetween(String value1, String value2) {
            addCriterion("PERIOD_BONUS_NUMBER between", value1, value2, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodBonusNumberNotBetween(String value1, String value2) {
            addCriterion("PERIOD_BONUS_NUMBER not between", value1, value2, "periodBonusNumber");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellIsNull() {
            addCriterion("PERIOD_TOTAL_SELL is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellIsNotNull() {
            addCriterion("PERIOD_TOTAL_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_SELL =", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellNotEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_SELL <>", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellGreaterThan(String value) {
            addCriterion("PERIOD_TOTAL_SELL >", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_SELL >=", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellLessThan(String value) {
            addCriterion("PERIOD_TOTAL_SELL <", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_SELL <=", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellLike(String value) {
            addCriterion("PERIOD_TOTAL_SELL like", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellNotLike(String value) {
            addCriterion("PERIOD_TOTAL_SELL not like", value, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_SELL in", values, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellNotIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_SELL not in", values, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_SELL between", value1, value2, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalSellNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_SELL not between", value1, value2, "periodTotalSell");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusIsNull() {
            addCriterion("PERIOD_TOTAL_BONUS is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusIsNotNull() {
            addCriterion("PERIOD_TOTAL_BONUS is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS =", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusNotEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS <>", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusGreaterThan(String value) {
            addCriterion("PERIOD_TOTAL_BONUS >", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS >=", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusLessThan(String value) {
            addCriterion("PERIOD_TOTAL_BONUS <", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS <=", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusLike(String value) {
            addCriterion("PERIOD_TOTAL_BONUS like", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusNotLike(String value) {
            addCriterion("PERIOD_TOTAL_BONUS not like", value, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_BONUS in", values, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusNotIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_BONUS not in", values, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_BONUS between", value1, value2, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_BONUS not between", value1, value2, "periodTotalBonus");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescIsNull() {
            addCriterion("PERIOD_TOTAL_BONUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescIsNotNull() {
            addCriterion("PERIOD_TOTAL_BONUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC =", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescNotEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC <>", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescGreaterThan(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC >", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC >=", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescLessThan(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC <", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC <=", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescLike(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC like", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescNotLike(String value) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC not like", value, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC in", values, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescNotIn(List<String> values) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC not in", values, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC between", value1, value2, "periodTotalBonusDesc");
            return (Criteria) this;
        }

        public Criteria andPeriodTotalBonusDescNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TOTAL_BONUS_DESC not between", value1, value2, "periodTotalBonusDesc");
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