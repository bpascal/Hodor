package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LotLottoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotLottoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andLottoNameIsNull() {
            addCriterion("LOTTO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLottoNameIsNotNull() {
            addCriterion("LOTTO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLottoNameEqualTo(String value) {
            addCriterion("LOTTO_NAME =", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameNotEqualTo(String value) {
            addCriterion("LOTTO_NAME <>", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameGreaterThan(String value) {
            addCriterion("LOTTO_NAME >", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_NAME >=", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameLessThan(String value) {
            addCriterion("LOTTO_NAME <", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_NAME <=", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameLike(String value) {
            addCriterion("LOTTO_NAME like", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameNotLike(String value) {
            addCriterion("LOTTO_NAME not like", value, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameIn(List<String> values) {
            addCriterion("LOTTO_NAME in", values, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameNotIn(List<String> values) {
            addCriterion("LOTTO_NAME not in", values, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameBetween(String value1, String value2) {
            addCriterion("LOTTO_NAME between", value1, value2, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoNameNotBetween(String value1, String value2) {
            addCriterion("LOTTO_NAME not between", value1, value2, "lottoName");
            return (Criteria) this;
        }

        public Criteria andLottoDescIsNull() {
            addCriterion("LOTTO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLottoDescIsNotNull() {
            addCriterion("LOTTO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLottoDescEqualTo(String value) {
            addCriterion("LOTTO_DESC =", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescNotEqualTo(String value) {
            addCriterion("LOTTO_DESC <>", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescGreaterThan(String value) {
            addCriterion("LOTTO_DESC >", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_DESC >=", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescLessThan(String value) {
            addCriterion("LOTTO_DESC <", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_DESC <=", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescLike(String value) {
            addCriterion("LOTTO_DESC like", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescNotLike(String value) {
            addCriterion("LOTTO_DESC not like", value, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescIn(List<String> values) {
            addCriterion("LOTTO_DESC in", values, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescNotIn(List<String> values) {
            addCriterion("LOTTO_DESC not in", values, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescBetween(String value1, String value2) {
            addCriterion("LOTTO_DESC between", value1, value2, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoDescNotBetween(String value1, String value2) {
            addCriterion("LOTTO_DESC not between", value1, value2, "lottoDesc");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerIsNull() {
            addCriterion("LOTTO_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerIsNotNull() {
            addCriterion("LOTTO_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerEqualTo(String value) {
            addCriterion("LOTTO_OWNER =", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerNotEqualTo(String value) {
            addCriterion("LOTTO_OWNER <>", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerGreaterThan(String value) {
            addCriterion("LOTTO_OWNER >", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_OWNER >=", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerLessThan(String value) {
            addCriterion("LOTTO_OWNER <", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_OWNER <=", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerLike(String value) {
            addCriterion("LOTTO_OWNER like", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerNotLike(String value) {
            addCriterion("LOTTO_OWNER not like", value, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerIn(List<String> values) {
            addCriterion("LOTTO_OWNER in", values, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerNotIn(List<String> values) {
            addCriterion("LOTTO_OWNER not in", values, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerBetween(String value1, String value2) {
            addCriterion("LOTTO_OWNER between", value1, value2, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoOwnerNotBetween(String value1, String value2) {
            addCriterion("LOTTO_OWNER not between", value1, value2, "lottoOwner");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueIsNull() {
            addCriterion("LOTTO_SHOT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueIsNotNull() {
            addCriterion("LOTTO_SHOT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueEqualTo(String value) {
            addCriterion("LOTTO_SHOT_VALUE =", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueNotEqualTo(String value) {
            addCriterion("LOTTO_SHOT_VALUE <>", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueGreaterThan(String value) {
            addCriterion("LOTTO_SHOT_VALUE >", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_SHOT_VALUE >=", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueLessThan(String value) {
            addCriterion("LOTTO_SHOT_VALUE <", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_SHOT_VALUE <=", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueLike(String value) {
            addCriterion("LOTTO_SHOT_VALUE like", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueNotLike(String value) {
            addCriterion("LOTTO_SHOT_VALUE not like", value, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueIn(List<String> values) {
            addCriterion("LOTTO_SHOT_VALUE in", values, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueNotIn(List<String> values) {
            addCriterion("LOTTO_SHOT_VALUE not in", values, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueBetween(String value1, String value2) {
            addCriterion("LOTTO_SHOT_VALUE between", value1, value2, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoShotValueNotBetween(String value1, String value2) {
            addCriterion("LOTTO_SHOT_VALUE not between", value1, value2, "lottoShotValue");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlIsNull() {
            addCriterion("LOTTO_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlIsNotNull() {
            addCriterion("LOTTO_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlEqualTo(String value) {
            addCriterion("LOTTO_ICON_URL =", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlNotEqualTo(String value) {
            addCriterion("LOTTO_ICON_URL <>", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlGreaterThan(String value) {
            addCriterion("LOTTO_ICON_URL >", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_ICON_URL >=", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlLessThan(String value) {
            addCriterion("LOTTO_ICON_URL <", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_ICON_URL <=", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlLike(String value) {
            addCriterion("LOTTO_ICON_URL like", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlNotLike(String value) {
            addCriterion("LOTTO_ICON_URL not like", value, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlIn(List<String> values) {
            addCriterion("LOTTO_ICON_URL in", values, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlNotIn(List<String> values) {
            addCriterion("LOTTO_ICON_URL not in", values, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlBetween(String value1, String value2) {
            addCriterion("LOTTO_ICON_URL between", value1, value2, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoIconUrlNotBetween(String value1, String value2) {
            addCriterion("LOTTO_ICON_URL not between", value1, value2, "lottoIconUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlIsNull() {
            addCriterion("LOTTO_BACKGROUND_URL is null");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlIsNotNull() {
            addCriterion("LOTTO_BACKGROUND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlEqualTo(String value) {
            addCriterion("LOTTO_BACKGROUND_URL =", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlNotEqualTo(String value) {
            addCriterion("LOTTO_BACKGROUND_URL <>", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlGreaterThan(String value) {
            addCriterion("LOTTO_BACKGROUND_URL >", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_BACKGROUND_URL >=", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlLessThan(String value) {
            addCriterion("LOTTO_BACKGROUND_URL <", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_BACKGROUND_URL <=", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlLike(String value) {
            addCriterion("LOTTO_BACKGROUND_URL like", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlNotLike(String value) {
            addCriterion("LOTTO_BACKGROUND_URL not like", value, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlIn(List<String> values) {
            addCriterion("LOTTO_BACKGROUND_URL in", values, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlNotIn(List<String> values) {
            addCriterion("LOTTO_BACKGROUND_URL not in", values, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlBetween(String value1, String value2) {
            addCriterion("LOTTO_BACKGROUND_URL between", value1, value2, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoBackgroundUrlNotBetween(String value1, String value2) {
            addCriterion("LOTTO_BACKGROUND_URL not between", value1, value2, "lottoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andLottoStsIsNull() {
            addCriterion("LOTTO_STS is null");
            return (Criteria) this;
        }

        public Criteria andLottoStsIsNotNull() {
            addCriterion("LOTTO_STS is not null");
            return (Criteria) this;
        }

        public Criteria andLottoStsEqualTo(String value) {
            addCriterion("LOTTO_STS =", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsNotEqualTo(String value) {
            addCriterion("LOTTO_STS <>", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsGreaterThan(String value) {
            addCriterion("LOTTO_STS >", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_STS >=", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsLessThan(String value) {
            addCriterion("LOTTO_STS <", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_STS <=", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsLike(String value) {
            addCriterion("LOTTO_STS like", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsNotLike(String value) {
            addCriterion("LOTTO_STS not like", value, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsIn(List<String> values) {
            addCriterion("LOTTO_STS in", values, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsNotIn(List<String> values) {
            addCriterion("LOTTO_STS not in", values, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsBetween(String value1, String value2) {
            addCriterion("LOTTO_STS between", value1, value2, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoStsNotBetween(String value1, String value2) {
            addCriterion("LOTTO_STS not between", value1, value2, "lottoSts");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIsNull() {
            addCriterion("LOTTO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIsNotNull() {
            addCriterion("LOTTO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeEqualTo(String value) {
            addCriterion("LOTTO_TYPE =", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNotEqualTo(String value) {
            addCriterion("LOTTO_TYPE <>", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeGreaterThan(String value) {
            addCriterion("LOTTO_TYPE >", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_TYPE >=", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeLessThan(String value) {
            addCriterion("LOTTO_TYPE <", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_TYPE <=", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeLike(String value) {
            addCriterion("LOTTO_TYPE like", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNotLike(String value) {
            addCriterion("LOTTO_TYPE not like", value, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIn(List<String> values) {
            addCriterion("LOTTO_TYPE in", values, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNotIn(List<String> values) {
            addCriterion("LOTTO_TYPE not in", values, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeBetween(String value1, String value2) {
            addCriterion("LOTTO_TYPE between", value1, value2, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNotBetween(String value1, String value2) {
            addCriterion("LOTTO_TYPE not between", value1, value2, "lottoType");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayIsNull() {
            addCriterion("LOTTO_PUBLISH_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayIsNotNull() {
            addCriterion("LOTTO_PUBLISH_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayEqualTo(String value) {
            addCriterion("LOTTO_PUBLISH_DAY =", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayNotEqualTo(String value) {
            addCriterion("LOTTO_PUBLISH_DAY <>", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayGreaterThan(String value) {
            addCriterion("LOTTO_PUBLISH_DAY >", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTO_PUBLISH_DAY >=", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayLessThan(String value) {
            addCriterion("LOTTO_PUBLISH_DAY <", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayLessThanOrEqualTo(String value) {
            addCriterion("LOTTO_PUBLISH_DAY <=", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayLike(String value) {
            addCriterion("LOTTO_PUBLISH_DAY like", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayNotLike(String value) {
            addCriterion("LOTTO_PUBLISH_DAY not like", value, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayIn(List<String> values) {
            addCriterion("LOTTO_PUBLISH_DAY in", values, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayNotIn(List<String> values) {
            addCriterion("LOTTO_PUBLISH_DAY not in", values, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayBetween(String value1, String value2) {
            addCriterion("LOTTO_PUBLISH_DAY between", value1, value2, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishDayNotBetween(String value1, String value2) {
            addCriterion("LOTTO_PUBLISH_DAY not between", value1, value2, "lottoPublishDay");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeIsNull() {
            addCriterion("LOTTO_PUBLISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeIsNotNull() {
            addCriterion("LOTTO_PUBLISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeEqualTo(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME =", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME <>", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME >", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME >=", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeLessThan(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME <", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME <=", value, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeIn(List<Date> values) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME in", values, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME not in", values, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME between", value1, value2, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLottoPublishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("LOTTO_PUBLISH_TIME not between", value1, value2, "lottoPublishTime");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdIsNull() {
            addCriterion("LAST_LOTTO_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdIsNotNull() {
            addCriterion("LAST_LOTTO_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdEqualTo(Long value) {
            addCriterion("LAST_LOTTO_INST_ID =", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdNotEqualTo(Long value) {
            addCriterion("LAST_LOTTO_INST_ID <>", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdGreaterThan(Long value) {
            addCriterion("LAST_LOTTO_INST_ID >", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_LOTTO_INST_ID >=", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdLessThan(Long value) {
            addCriterion("LAST_LOTTO_INST_ID <", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdLessThanOrEqualTo(Long value) {
            addCriterion("LAST_LOTTO_INST_ID <=", value, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdIn(List<Long> values) {
            addCriterion("LAST_LOTTO_INST_ID in", values, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdNotIn(List<Long> values) {
            addCriterion("LAST_LOTTO_INST_ID not in", values, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdBetween(Long value1, Long value2) {
            addCriterion("LAST_LOTTO_INST_ID between", value1, value2, "lastLottoInstId");
            return (Criteria) this;
        }

        public Criteria andLastLottoInstIdNotBetween(Long value1, Long value2) {
            addCriterion("LAST_LOTTO_INST_ID not between", value1, value2, "lastLottoInstId");
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