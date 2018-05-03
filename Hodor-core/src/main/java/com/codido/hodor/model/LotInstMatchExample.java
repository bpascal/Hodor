package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class LotInstMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotInstMatchExample() {
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

        public Criteria andLotInstMatchIdIsNull() {
            addCriterion("LOT_INST_MATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdIsNotNull() {
            addCriterion("LOT_INST_MATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdEqualTo(Long value) {
            addCriterion("LOT_INST_MATCH_ID =", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdNotEqualTo(Long value) {
            addCriterion("LOT_INST_MATCH_ID <>", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdGreaterThan(Long value) {
            addCriterion("LOT_INST_MATCH_ID >", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOT_INST_MATCH_ID >=", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdLessThan(Long value) {
            addCriterion("LOT_INST_MATCH_ID <", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdLessThanOrEqualTo(Long value) {
            addCriterion("LOT_INST_MATCH_ID <=", value, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdIn(List<Long> values) {
            addCriterion("LOT_INST_MATCH_ID in", values, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdNotIn(List<Long> values) {
            addCriterion("LOT_INST_MATCH_ID not in", values, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdBetween(Long value1, Long value2) {
            addCriterion("LOT_INST_MATCH_ID between", value1, value2, "lotInstMatchId");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchIdNotBetween(Long value1, Long value2) {
            addCriterion("LOT_INST_MATCH_ID not between", value1, value2, "lotInstMatchId");
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

        public Criteria andMatchSortIsNull() {
            addCriterion("MATCH_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMatchSortIsNotNull() {
            addCriterion("MATCH_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMatchSortEqualTo(Integer value) {
            addCriterion("MATCH_SORT =", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortNotEqualTo(Integer value) {
            addCriterion("MATCH_SORT <>", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortGreaterThan(Integer value) {
            addCriterion("MATCH_SORT >", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATCH_SORT >=", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortLessThan(Integer value) {
            addCriterion("MATCH_SORT <", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortLessThanOrEqualTo(Integer value) {
            addCriterion("MATCH_SORT <=", value, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortIn(List<Integer> values) {
            addCriterion("MATCH_SORT in", values, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortNotIn(List<Integer> values) {
            addCriterion("MATCH_SORT not in", values, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_SORT between", value1, value2, "matchSort");
            return (Criteria) this;
        }

        public Criteria andMatchSortNotBetween(Integer value1, Integer value2) {
            addCriterion("MATCH_SORT not between", value1, value2, "matchSort");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsIsNull() {
            addCriterion("LOT_INST_MATCH_STS is null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsIsNotNull() {
            addCriterion("LOT_INST_MATCH_STS is not null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_STS =", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsNotEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_STS <>", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsGreaterThan(String value) {
            addCriterion("LOT_INST_MATCH_STS >", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_STS >=", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsLessThan(String value) {
            addCriterion("LOT_INST_MATCH_STS <", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsLessThanOrEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_STS <=", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsLike(String value) {
            addCriterion("LOT_INST_MATCH_STS like", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsNotLike(String value) {
            addCriterion("LOT_INST_MATCH_STS not like", value, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsIn(List<String> values) {
            addCriterion("LOT_INST_MATCH_STS in", values, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsNotIn(List<String> values) {
            addCriterion("LOT_INST_MATCH_STS not in", values, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsBetween(String value1, String value2) {
            addCriterion("LOT_INST_MATCH_STS between", value1, value2, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchStsNotBetween(String value1, String value2) {
            addCriterion("LOT_INST_MATCH_STS not between", value1, value2, "lotInstMatchSts");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultIsNull() {
            addCriterion("LOT_INST_MATCH_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultIsNotNull() {
            addCriterion("LOT_INST_MATCH_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_RESULT =", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultNotEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_RESULT <>", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultGreaterThan(String value) {
            addCriterion("LOT_INST_MATCH_RESULT >", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_RESULT >=", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultLessThan(String value) {
            addCriterion("LOT_INST_MATCH_RESULT <", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultLessThanOrEqualTo(String value) {
            addCriterion("LOT_INST_MATCH_RESULT <=", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultLike(String value) {
            addCriterion("LOT_INST_MATCH_RESULT like", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultNotLike(String value) {
            addCriterion("LOT_INST_MATCH_RESULT not like", value, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultIn(List<String> values) {
            addCriterion("LOT_INST_MATCH_RESULT in", values, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultNotIn(List<String> values) {
            addCriterion("LOT_INST_MATCH_RESULT not in", values, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultBetween(String value1, String value2) {
            addCriterion("LOT_INST_MATCH_RESULT between", value1, value2, "lotInstMatchResult");
            return (Criteria) this;
        }

        public Criteria andLotInstMatchResultNotBetween(String value1, String value2) {
            addCriterion("LOT_INST_MATCH_RESULT not between", value1, value2, "lotInstMatchResult");
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