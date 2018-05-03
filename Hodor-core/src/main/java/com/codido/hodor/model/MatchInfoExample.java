package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchInfoExample() {
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

        public Criteria andMatchInfoCodeIsNull() {
            addCriterion("MATCH_INFO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeIsNotNull() {
            addCriterion("MATCH_INFO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeEqualTo(String value) {
            addCriterion("MATCH_INFO_CODE =", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeNotEqualTo(String value) {
            addCriterion("MATCH_INFO_CODE <>", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeGreaterThan(String value) {
            addCriterion("MATCH_INFO_CODE >", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_CODE >=", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeLessThan(String value) {
            addCriterion("MATCH_INFO_CODE <", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_CODE <=", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeLike(String value) {
            addCriterion("MATCH_INFO_CODE like", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeNotLike(String value) {
            addCriterion("MATCH_INFO_CODE not like", value, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeIn(List<String> values) {
            addCriterion("MATCH_INFO_CODE in", values, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeNotIn(List<String> values) {
            addCriterion("MATCH_INFO_CODE not in", values, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_CODE between", value1, value2, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoCodeNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_CODE not between", value1, value2, "matchInfoCode");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameIsNull() {
            addCriterion("MATCH_INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameIsNotNull() {
            addCriterion("MATCH_INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameEqualTo(String value) {
            addCriterion("MATCH_INFO_NAME =", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameNotEqualTo(String value) {
            addCriterion("MATCH_INFO_NAME <>", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameGreaterThan(String value) {
            addCriterion("MATCH_INFO_NAME >", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_NAME >=", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameLessThan(String value) {
            addCriterion("MATCH_INFO_NAME <", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_NAME <=", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameLike(String value) {
            addCriterion("MATCH_INFO_NAME like", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameNotLike(String value) {
            addCriterion("MATCH_INFO_NAME not like", value, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameIn(List<String> values) {
            addCriterion("MATCH_INFO_NAME in", values, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameNotIn(List<String> values) {
            addCriterion("MATCH_INFO_NAME not in", values, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_NAME between", value1, value2, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoNameNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_NAME not between", value1, value2, "matchInfoName");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlIsNull() {
            addCriterion("MATCH_INFO_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlIsNotNull() {
            addCriterion("MATCH_INFO_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlEqualTo(String value) {
            addCriterion("MATCH_INFO_ICON_URL =", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlNotEqualTo(String value) {
            addCriterion("MATCH_INFO_ICON_URL <>", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlGreaterThan(String value) {
            addCriterion("MATCH_INFO_ICON_URL >", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_ICON_URL >=", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlLessThan(String value) {
            addCriterion("MATCH_INFO_ICON_URL <", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_ICON_URL <=", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlLike(String value) {
            addCriterion("MATCH_INFO_ICON_URL like", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlNotLike(String value) {
            addCriterion("MATCH_INFO_ICON_URL not like", value, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlIn(List<String> values) {
            addCriterion("MATCH_INFO_ICON_URL in", values, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlNotIn(List<String> values) {
            addCriterion("MATCH_INFO_ICON_URL not in", values, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_ICON_URL between", value1, value2, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoIconUrlNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_ICON_URL not between", value1, value2, "matchInfoIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescIsNull() {
            addCriterion("MATCH_INFO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescIsNotNull() {
            addCriterion("MATCH_INFO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescEqualTo(String value) {
            addCriterion("MATCH_INFO_DESC =", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescNotEqualTo(String value) {
            addCriterion("MATCH_INFO_DESC <>", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescGreaterThan(String value) {
            addCriterion("MATCH_INFO_DESC >", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_DESC >=", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescLessThan(String value) {
            addCriterion("MATCH_INFO_DESC <", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_DESC <=", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescLike(String value) {
            addCriterion("MATCH_INFO_DESC like", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescNotLike(String value) {
            addCriterion("MATCH_INFO_DESC not like", value, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescIn(List<String> values) {
            addCriterion("MATCH_INFO_DESC in", values, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescNotIn(List<String> values) {
            addCriterion("MATCH_INFO_DESC not in", values, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_DESC between", value1, value2, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchInfoDescNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_DESC not between", value1, value2, "matchInfoDesc");
            return (Criteria) this;
        }

        public Criteria andMatchAddressIsNull() {
            addCriterion("MATCH_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMatchAddressIsNotNull() {
            addCriterion("MATCH_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMatchAddressEqualTo(String value) {
            addCriterion("MATCH_ADDRESS =", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressNotEqualTo(String value) {
            addCriterion("MATCH_ADDRESS <>", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressGreaterThan(String value) {
            addCriterion("MATCH_ADDRESS >", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_ADDRESS >=", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressLessThan(String value) {
            addCriterion("MATCH_ADDRESS <", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressLessThanOrEqualTo(String value) {
            addCriterion("MATCH_ADDRESS <=", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressLike(String value) {
            addCriterion("MATCH_ADDRESS like", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressNotLike(String value) {
            addCriterion("MATCH_ADDRESS not like", value, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressIn(List<String> values) {
            addCriterion("MATCH_ADDRESS in", values, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressNotIn(List<String> values) {
            addCriterion("MATCH_ADDRESS not in", values, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressBetween(String value1, String value2) {
            addCriterion("MATCH_ADDRESS between", value1, value2, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchAddressNotBetween(String value1, String value2) {
            addCriterion("MATCH_ADDRESS not between", value1, value2, "matchAddress");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherIsNull() {
            addCriterion("MATCH_WEATHER is null");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherIsNotNull() {
            addCriterion("MATCH_WEATHER is not null");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherEqualTo(String value) {
            addCriterion("MATCH_WEATHER =", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherNotEqualTo(String value) {
            addCriterion("MATCH_WEATHER <>", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherGreaterThan(String value) {
            addCriterion("MATCH_WEATHER >", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_WEATHER >=", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherLessThan(String value) {
            addCriterion("MATCH_WEATHER <", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherLessThanOrEqualTo(String value) {
            addCriterion("MATCH_WEATHER <=", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherLike(String value) {
            addCriterion("MATCH_WEATHER like", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherNotLike(String value) {
            addCriterion("MATCH_WEATHER not like", value, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherIn(List<String> values) {
            addCriterion("MATCH_WEATHER in", values, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherNotIn(List<String> values) {
            addCriterion("MATCH_WEATHER not in", values, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherBetween(String value1, String value2) {
            addCriterion("MATCH_WEATHER between", value1, value2, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andMatchWeatherNotBetween(String value1, String value2) {
            addCriterion("MATCH_WEATHER not between", value1, value2, "matchWeather");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNull() {
            addCriterion("HOME_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNotNull() {
            addCriterion("HOME_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdEqualTo(Long value) {
            addCriterion("HOME_TEAM_ID =", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotEqualTo(Long value) {
            addCriterion("HOME_TEAM_ID <>", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThan(Long value) {
            addCriterion("HOME_TEAM_ID >", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HOME_TEAM_ID >=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThan(Long value) {
            addCriterion("HOME_TEAM_ID <", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThanOrEqualTo(Long value) {
            addCriterion("HOME_TEAM_ID <=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIn(List<Long> values) {
            addCriterion("HOME_TEAM_ID in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotIn(List<Long> values) {
            addCriterion("HOME_TEAM_ID not in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdBetween(Long value1, Long value2) {
            addCriterion("HOME_TEAM_ID between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotBetween(Long value1, Long value2) {
            addCriterion("HOME_TEAM_ID not between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdIsNull() {
            addCriterion("GUEST_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdIsNotNull() {
            addCriterion("GUEST_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdEqualTo(Long value) {
            addCriterion("GUEST_TEAM_ID =", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdNotEqualTo(Long value) {
            addCriterion("GUEST_TEAM_ID <>", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdGreaterThan(Long value) {
            addCriterion("GUEST_TEAM_ID >", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GUEST_TEAM_ID >=", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdLessThan(Long value) {
            addCriterion("GUEST_TEAM_ID <", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdLessThanOrEqualTo(Long value) {
            addCriterion("GUEST_TEAM_ID <=", value, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdIn(List<Long> values) {
            addCriterion("GUEST_TEAM_ID in", values, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdNotIn(List<Long> values) {
            addCriterion("GUEST_TEAM_ID not in", values, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdBetween(Long value1, Long value2) {
            addCriterion("GUEST_TEAM_ID between", value1, value2, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIdNotBetween(Long value1, Long value2) {
            addCriterion("GUEST_TEAM_ID not between", value1, value2, "guestTeamId");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeIsNull() {
            addCriterion("MATCH_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeIsNotNull() {
            addCriterion("MATCH_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeEqualTo(Date value) {
            addCriterion("MATCH_BEGIN_TIME =", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeNotEqualTo(Date value) {
            addCriterion("MATCH_BEGIN_TIME <>", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeGreaterThan(Date value) {
            addCriterion("MATCH_BEGIN_TIME >", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MATCH_BEGIN_TIME >=", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeLessThan(Date value) {
            addCriterion("MATCH_BEGIN_TIME <", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("MATCH_BEGIN_TIME <=", value, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeIn(List<Date> values) {
            addCriterion("MATCH_BEGIN_TIME in", values, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeNotIn(List<Date> values) {
            addCriterion("MATCH_BEGIN_TIME not in", values, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeBetween(Date value1, Date value2) {
            addCriterion("MATCH_BEGIN_TIME between", value1, value2, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("MATCH_BEGIN_TIME not between", value1, value2, "matchBeginTime");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsIsNull() {
            addCriterion("MATCH_INFO_STS is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsIsNotNull() {
            addCriterion("MATCH_INFO_STS is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsEqualTo(String value) {
            addCriterion("MATCH_INFO_STS =", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsNotEqualTo(String value) {
            addCriterion("MATCH_INFO_STS <>", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsGreaterThan(String value) {
            addCriterion("MATCH_INFO_STS >", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_STS >=", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsLessThan(String value) {
            addCriterion("MATCH_INFO_STS <", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_STS <=", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsLike(String value) {
            addCriterion("MATCH_INFO_STS like", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsNotLike(String value) {
            addCriterion("MATCH_INFO_STS not like", value, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsIn(List<String> values) {
            addCriterion("MATCH_INFO_STS in", values, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsNotIn(List<String> values) {
            addCriterion("MATCH_INFO_STS not in", values, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_STS between", value1, value2, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoStsNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_STS not between", value1, value2, "matchInfoSts");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultIsNull() {
            addCriterion("MATCH_INFO_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultIsNotNull() {
            addCriterion("MATCH_INFO_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultEqualTo(String value) {
            addCriterion("MATCH_INFO_RESULT =", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultNotEqualTo(String value) {
            addCriterion("MATCH_INFO_RESULT <>", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultGreaterThan(String value) {
            addCriterion("MATCH_INFO_RESULT >", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_RESULT >=", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultLessThan(String value) {
            addCriterion("MATCH_INFO_RESULT <", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_RESULT <=", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultLike(String value) {
            addCriterion("MATCH_INFO_RESULT like", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultNotLike(String value) {
            addCriterion("MATCH_INFO_RESULT not like", value, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultIn(List<String> values) {
            addCriterion("MATCH_INFO_RESULT in", values, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultNotIn(List<String> values) {
            addCriterion("MATCH_INFO_RESULT not in", values, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_RESULT between", value1, value2, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoResultNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_RESULT not between", value1, value2, "matchInfoResult");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreIsNull() {
            addCriterion("MATCH_INFO_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreIsNotNull() {
            addCriterion("MATCH_INFO_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreEqualTo(String value) {
            addCriterion("MATCH_INFO_SCORE =", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreNotEqualTo(String value) {
            addCriterion("MATCH_INFO_SCORE <>", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreGreaterThan(String value) {
            addCriterion("MATCH_INFO_SCORE >", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_SCORE >=", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreLessThan(String value) {
            addCriterion("MATCH_INFO_SCORE <", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_SCORE <=", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreLike(String value) {
            addCriterion("MATCH_INFO_SCORE like", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreNotLike(String value) {
            addCriterion("MATCH_INFO_SCORE not like", value, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreIn(List<String> values) {
            addCriterion("MATCH_INFO_SCORE in", values, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreNotIn(List<String> values) {
            addCriterion("MATCH_INFO_SCORE not in", values, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_SCORE between", value1, value2, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoScoreNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_SCORE not between", value1, value2, "matchInfoScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreIsNull() {
            addCriterion("MATCH_INFO_HALFTIME_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreIsNotNull() {
            addCriterion("MATCH_INFO_HALFTIME_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreEqualTo(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE =", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreNotEqualTo(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE <>", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreGreaterThan(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE >", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE >=", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreLessThan(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE <", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreLessThanOrEqualTo(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE <=", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreLike(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE like", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreNotLike(String value) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE not like", value, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreIn(List<String> values) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE in", values, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreNotIn(List<String> values) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE not in", values, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE between", value1, value2, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchInfoHalftimeScoreNotBetween(String value1, String value2) {
            addCriterion("MATCH_INFO_HALFTIME_SCORE not between", value1, value2, "matchInfoHalftimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdIsNull() {
            addCriterion("MATCH_LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdIsNotNull() {
            addCriterion("MATCH_LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdEqualTo(Long value) {
            addCriterion("MATCH_LOTTO_ID =", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdNotEqualTo(Long value) {
            addCriterion("MATCH_LOTTO_ID <>", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdGreaterThan(Long value) {
            addCriterion("MATCH_LOTTO_ID >", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MATCH_LOTTO_ID >=", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdLessThan(Long value) {
            addCriterion("MATCH_LOTTO_ID <", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("MATCH_LOTTO_ID <=", value, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdIn(List<Long> values) {
            addCriterion("MATCH_LOTTO_ID in", values, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdNotIn(List<Long> values) {
            addCriterion("MATCH_LOTTO_ID not in", values, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdBetween(Long value1, Long value2) {
            addCriterion("MATCH_LOTTO_ID between", value1, value2, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andMatchLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("MATCH_LOTTO_ID not between", value1, value2, "matchLottoId");
            return (Criteria) this;
        }

        public Criteria andRoundIdIsNull() {
            addCriterion("ROUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoundIdIsNotNull() {
            addCriterion("ROUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoundIdEqualTo(Long value) {
            addCriterion("ROUND_ID =", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotEqualTo(Long value) {
            addCriterion("ROUND_ID <>", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThan(Long value) {
            addCriterion("ROUND_ID >", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROUND_ID >=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThan(Long value) {
            addCriterion("ROUND_ID <", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThanOrEqualTo(Long value) {
            addCriterion("ROUND_ID <=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdIn(List<Long> values) {
            addCriterion("ROUND_ID in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotIn(List<Long> values) {
            addCriterion("ROUND_ID not in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdBetween(Long value1, Long value2) {
            addCriterion("ROUND_ID between", value1, value2, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotBetween(Long value1, Long value2) {
            addCriterion("ROUND_ID not between", value1, value2, "roundId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNull() {
            addCriterion("SEASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNotNull() {
            addCriterion("SEASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdEqualTo(Long value) {
            addCriterion("SEASON_ID =", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotEqualTo(Long value) {
            addCriterion("SEASON_ID <>", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThan(Long value) {
            addCriterion("SEASON_ID >", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SEASON_ID >=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThan(Long value) {
            addCriterion("SEASON_ID <", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThanOrEqualTo(Long value) {
            addCriterion("SEASON_ID <=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIn(List<Long> values) {
            addCriterion("SEASON_ID in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotIn(List<Long> values) {
            addCriterion("SEASON_ID not in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdBetween(Long value1, Long value2) {
            addCriterion("SEASON_ID between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotBetween(Long value1, Long value2) {
            addCriterion("SEASON_ID not between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNull() {
            addCriterion("LEAGUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNotNull() {
            addCriterion("LEAGUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdEqualTo(Long value) {
            addCriterion("LEAGUE_ID =", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotEqualTo(Long value) {
            addCriterion("LEAGUE_ID <>", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThan(Long value) {
            addCriterion("LEAGUE_ID >", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LEAGUE_ID >=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThan(Long value) {
            addCriterion("LEAGUE_ID <", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThanOrEqualTo(Long value) {
            addCriterion("LEAGUE_ID <=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIn(List<Long> values) {
            addCriterion("LEAGUE_ID in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotIn(List<Long> values) {
            addCriterion("LEAGUE_ID not in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdBetween(Long value1, Long value2) {
            addCriterion("LEAGUE_ID between", value1, value2, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotBetween(Long value1, Long value2) {
            addCriterion("LEAGUE_ID not between", value1, value2, "leagueId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdIsNull() {
            addCriterion("SPORTTERY_MATCH_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdIsNotNull() {
            addCriterion("SPORTTERY_MATCH_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdEqualTo(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID =", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdNotEqualTo(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID <>", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdGreaterThan(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID >", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID >=", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdLessThan(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID <", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdLessThanOrEqualTo(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID <=", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdLike(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID like", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdNotLike(String value) {
            addCriterion("SPORTTERY_MATCH_INFO_ID not like", value, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdIn(List<String> values) {
            addCriterion("SPORTTERY_MATCH_INFO_ID in", values, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdNotIn(List<String> values) {
            addCriterion("SPORTTERY_MATCH_INFO_ID not in", values, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdBetween(String value1, String value2) {
            addCriterion("SPORTTERY_MATCH_INFO_ID between", value1, value2, "sportteryMatchInfoId");
            return (Criteria) this;
        }

        public Criteria andSportteryMatchInfoIdNotBetween(String value1, String value2) {
            addCriterion("SPORTTERY_MATCH_INFO_ID not between", value1, value2, "sportteryMatchInfoId");
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