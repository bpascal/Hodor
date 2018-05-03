package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotMatchExample() {
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

        public Criteria andMatchNameIsNull() {
            addCriterion("MATCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatchNameIsNotNull() {
            addCriterion("MATCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchNameEqualTo(String value) {
            addCriterion("MATCH_NAME =", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotEqualTo(String value) {
            addCriterion("MATCH_NAME <>", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThan(String value) {
            addCriterion("MATCH_NAME >", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_NAME >=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThan(String value) {
            addCriterion("MATCH_NAME <", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThanOrEqualTo(String value) {
            addCriterion("MATCH_NAME <=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLike(String value) {
            addCriterion("MATCH_NAME like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotLike(String value) {
            addCriterion("MATCH_NAME not like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameIn(List<String> values) {
            addCriterion("MATCH_NAME in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotIn(List<String> values) {
            addCriterion("MATCH_NAME not in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameBetween(String value1, String value2) {
            addCriterion("MATCH_NAME between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotBetween(String value1, String value2) {
            addCriterion("MATCH_NAME not between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchCodeIsNull() {
            addCriterion("MATCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMatchCodeIsNotNull() {
            addCriterion("MATCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchCodeEqualTo(String value) {
            addCriterion("MATCH_CODE =", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeNotEqualTo(String value) {
            addCriterion("MATCH_CODE <>", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeGreaterThan(String value) {
            addCriterion("MATCH_CODE >", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_CODE >=", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeLessThan(String value) {
            addCriterion("MATCH_CODE <", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_CODE <=", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeLike(String value) {
            addCriterion("MATCH_CODE like", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeNotLike(String value) {
            addCriterion("MATCH_CODE not like", value, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeIn(List<String> values) {
            addCriterion("MATCH_CODE in", values, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeNotIn(List<String> values) {
            addCriterion("MATCH_CODE not in", values, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeBetween(String value1, String value2) {
            addCriterion("MATCH_CODE between", value1, value2, "matchCode");
            return (Criteria) this;
        }

        public Criteria andMatchCodeNotBetween(String value1, String value2) {
            addCriterion("MATCH_CODE not between", value1, value2, "matchCode");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdIsNull() {
            addCriterion("OUT_MATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdIsNotNull() {
            addCriterion("OUT_MATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdEqualTo(String value) {
            addCriterion("OUT_MATCH_ID =", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdNotEqualTo(String value) {
            addCriterion("OUT_MATCH_ID <>", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdGreaterThan(String value) {
            addCriterion("OUT_MATCH_ID >", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_MATCH_ID >=", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdLessThan(String value) {
            addCriterion("OUT_MATCH_ID <", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdLessThanOrEqualTo(String value) {
            addCriterion("OUT_MATCH_ID <=", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdLike(String value) {
            addCriterion("OUT_MATCH_ID like", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdNotLike(String value) {
            addCriterion("OUT_MATCH_ID not like", value, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdIn(List<String> values) {
            addCriterion("OUT_MATCH_ID in", values, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdNotIn(List<String> values) {
            addCriterion("OUT_MATCH_ID not in", values, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdBetween(String value1, String value2) {
            addCriterion("OUT_MATCH_ID between", value1, value2, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andOutMatchIdNotBetween(String value1, String value2) {
            addCriterion("OUT_MATCH_ID not between", value1, value2, "outMatchId");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("MATCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("MATCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(String value) {
            addCriterion("MATCH_TYPE =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(String value) {
            addCriterion("MATCH_TYPE <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(String value) {
            addCriterion("MATCH_TYPE >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(String value) {
            addCriterion("MATCH_TYPE <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLike(String value) {
            addCriterion("MATCH_TYPE like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotLike(String value) {
            addCriterion("MATCH_TYPE not like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<String> values) {
            addCriterion("MATCH_TYPE in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<String> values) {
            addCriterion("MATCH_TYPE not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE not between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeIsNull() {
            addCriterion("MATCH_LEAGUE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeIsNotNull() {
            addCriterion("MATCH_LEAGUE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_CODE =", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeNotEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_CODE <>", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeGreaterThan(String value) {
            addCriterion("MATCH_LEAGUE_CODE >", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_CODE >=", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeLessThan(String value) {
            addCriterion("MATCH_LEAGUE_CODE <", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_CODE <=", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeLike(String value) {
            addCriterion("MATCH_LEAGUE_CODE like", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeNotLike(String value) {
            addCriterion("MATCH_LEAGUE_CODE not like", value, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_CODE in", values, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeNotIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_CODE not in", values, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_CODE between", value1, value2, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueCodeNotBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_CODE not between", value1, value2, "matchLeagueCode");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameIsNull() {
            addCriterion("MATCH_LEAGUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameIsNotNull() {
            addCriterion("MATCH_LEAGUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_NAME =", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameNotEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_NAME <>", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameGreaterThan(String value) {
            addCriterion("MATCH_LEAGUE_NAME >", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_NAME >=", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameLessThan(String value) {
            addCriterion("MATCH_LEAGUE_NAME <", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameLessThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_NAME <=", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameLike(String value) {
            addCriterion("MATCH_LEAGUE_NAME like", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameNotLike(String value) {
            addCriterion("MATCH_LEAGUE_NAME not like", value, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_NAME in", values, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameNotIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_NAME not in", values, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_NAME between", value1, value2, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueNameNotBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_NAME not between", value1, value2, "matchLeagueName");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlIsNull() {
            addCriterion("MATCH_LEAGUE_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlIsNotNull() {
            addCriterion("MATCH_LEAGUE_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL =", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlNotEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL <>", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlGreaterThan(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL >", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL >=", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlLessThan(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL <", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlLessThanOrEqualTo(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL <=", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlLike(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL like", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlNotLike(String value) {
            addCriterion("MATCH_LEAGUE_ICON_URL not like", value, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_ICON_URL in", values, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlNotIn(List<String> values) {
            addCriterion("MATCH_LEAGUE_ICON_URL not in", values, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_ICON_URL between", value1, value2, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchLeagueIconUrlNotBetween(String value1, String value2) {
            addCriterion("MATCH_LEAGUE_ICON_URL not between", value1, value2, "matchLeagueIconUrl");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNull() {
            addCriterion("MATCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNotNull() {
            addCriterion("MATCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEqualTo(Date value) {
            addCriterion("MATCH_TIME =", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotEqualTo(Date value) {
            addCriterion("MATCH_TIME <>", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThan(Date value) {
            addCriterion("MATCH_TIME >", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MATCH_TIME >=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThan(Date value) {
            addCriterion("MATCH_TIME <", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("MATCH_TIME <=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIn(List<Date> values) {
            addCriterion("MATCH_TIME in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotIn(List<Date> values) {
            addCriterion("MATCH_TIME not in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeBetween(Date value1, Date value2) {
            addCriterion("MATCH_TIME between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("MATCH_TIME not between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchStsIsNull() {
            addCriterion("MATCH_STS is null");
            return (Criteria) this;
        }

        public Criteria andMatchStsIsNotNull() {
            addCriterion("MATCH_STS is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStsEqualTo(String value) {
            addCriterion("MATCH_STS =", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsNotEqualTo(String value) {
            addCriterion("MATCH_STS <>", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsGreaterThan(String value) {
            addCriterion("MATCH_STS >", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_STS >=", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsLessThan(String value) {
            addCriterion("MATCH_STS <", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsLessThanOrEqualTo(String value) {
            addCriterion("MATCH_STS <=", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsLike(String value) {
            addCriterion("MATCH_STS like", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsNotLike(String value) {
            addCriterion("MATCH_STS not like", value, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsIn(List<String> values) {
            addCriterion("MATCH_STS in", values, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsNotIn(List<String> values) {
            addCriterion("MATCH_STS not in", values, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsBetween(String value1, String value2) {
            addCriterion("MATCH_STS between", value1, value2, "matchSts");
            return (Criteria) this;
        }

        public Criteria andMatchStsNotBetween(String value1, String value2) {
            addCriterion("MATCH_STS not between", value1, value2, "matchSts");
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

        public Criteria andHomeTeamNameIsNull() {
            addCriterion("HOME_TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameIsNotNull() {
            addCriterion("HOME_TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEqualTo(String value) {
            addCriterion("HOME_TEAM_NAME =", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotEqualTo(String value) {
            addCriterion("HOME_TEAM_NAME <>", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameGreaterThan(String value) {
            addCriterion("HOME_TEAM_NAME >", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_TEAM_NAME >=", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLessThan(String value) {
            addCriterion("HOME_TEAM_NAME <", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLessThanOrEqualTo(String value) {
            addCriterion("HOME_TEAM_NAME <=", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLike(String value) {
            addCriterion("HOME_TEAM_NAME like", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotLike(String value) {
            addCriterion("HOME_TEAM_NAME not like", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameIn(List<String> values) {
            addCriterion("HOME_TEAM_NAME in", values, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotIn(List<String> values) {
            addCriterion("HOME_TEAM_NAME not in", values, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameBetween(String value1, String value2) {
            addCriterion("HOME_TEAM_NAME between", value1, value2, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotBetween(String value1, String value2) {
            addCriterion("HOME_TEAM_NAME not between", value1, value2, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlIsNull() {
            addCriterion("HOME_TEAM_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlIsNotNull() {
            addCriterion("HOME_TEAM_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlEqualTo(String value) {
            addCriterion("HOME_TEAM_ICON_URL =", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlNotEqualTo(String value) {
            addCriterion("HOME_TEAM_ICON_URL <>", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlGreaterThan(String value) {
            addCriterion("HOME_TEAM_ICON_URL >", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_TEAM_ICON_URL >=", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlLessThan(String value) {
            addCriterion("HOME_TEAM_ICON_URL <", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlLessThanOrEqualTo(String value) {
            addCriterion("HOME_TEAM_ICON_URL <=", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlLike(String value) {
            addCriterion("HOME_TEAM_ICON_URL like", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlNotLike(String value) {
            addCriterion("HOME_TEAM_ICON_URL not like", value, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlIn(List<String> values) {
            addCriterion("HOME_TEAM_ICON_URL in", values, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlNotIn(List<String> values) {
            addCriterion("HOME_TEAM_ICON_URL not in", values, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlBetween(String value1, String value2) {
            addCriterion("HOME_TEAM_ICON_URL between", value1, value2, "homeTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconUrlNotBetween(String value1, String value2) {
            addCriterion("HOME_TEAM_ICON_URL not between", value1, value2, "homeTeamIconUrl");
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

        public Criteria andGuestTeamNameIsNull() {
            addCriterion("GUEST_TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameIsNotNull() {
            addCriterion("GUEST_TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameEqualTo(String value) {
            addCriterion("GUEST_TEAM_NAME =", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameNotEqualTo(String value) {
            addCriterion("GUEST_TEAM_NAME <>", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameGreaterThan(String value) {
            addCriterion("GUEST_TEAM_NAME >", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("GUEST_TEAM_NAME >=", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameLessThan(String value) {
            addCriterion("GUEST_TEAM_NAME <", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameLessThanOrEqualTo(String value) {
            addCriterion("GUEST_TEAM_NAME <=", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameLike(String value) {
            addCriterion("GUEST_TEAM_NAME like", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameNotLike(String value) {
            addCriterion("GUEST_TEAM_NAME not like", value, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameIn(List<String> values) {
            addCriterion("GUEST_TEAM_NAME in", values, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameNotIn(List<String> values) {
            addCriterion("GUEST_TEAM_NAME not in", values, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameBetween(String value1, String value2) {
            addCriterion("GUEST_TEAM_NAME between", value1, value2, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNameNotBetween(String value1, String value2) {
            addCriterion("GUEST_TEAM_NAME not between", value1, value2, "guestTeamName");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlIsNull() {
            addCriterion("GUEST_TEAM_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlIsNotNull() {
            addCriterion("GUEST_TEAM_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlEqualTo(String value) {
            addCriterion("GUEST_TEAM_ICON_URL =", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlNotEqualTo(String value) {
            addCriterion("GUEST_TEAM_ICON_URL <>", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlGreaterThan(String value) {
            addCriterion("GUEST_TEAM_ICON_URL >", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("GUEST_TEAM_ICON_URL >=", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlLessThan(String value) {
            addCriterion("GUEST_TEAM_ICON_URL <", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlLessThanOrEqualTo(String value) {
            addCriterion("GUEST_TEAM_ICON_URL <=", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlLike(String value) {
            addCriterion("GUEST_TEAM_ICON_URL like", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlNotLike(String value) {
            addCriterion("GUEST_TEAM_ICON_URL not like", value, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlIn(List<String> values) {
            addCriterion("GUEST_TEAM_ICON_URL in", values, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlNotIn(List<String> values) {
            addCriterion("GUEST_TEAM_ICON_URL not in", values, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlBetween(String value1, String value2) {
            addCriterion("GUEST_TEAM_ICON_URL between", value1, value2, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIconUrlNotBetween(String value1, String value2) {
            addCriterion("GUEST_TEAM_ICON_URL not between", value1, value2, "guestTeamIconUrl");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsIsNull() {
            addCriterion("HOME_WIN_ODDS is null");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsIsNotNull() {
            addCriterion("HOME_WIN_ODDS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsEqualTo(String value) {
            addCriterion("HOME_WIN_ODDS =", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsNotEqualTo(String value) {
            addCriterion("HOME_WIN_ODDS <>", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsGreaterThan(String value) {
            addCriterion("HOME_WIN_ODDS >", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_WIN_ODDS >=", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsLessThan(String value) {
            addCriterion("HOME_WIN_ODDS <", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsLessThanOrEqualTo(String value) {
            addCriterion("HOME_WIN_ODDS <=", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsLike(String value) {
            addCriterion("HOME_WIN_ODDS like", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsNotLike(String value) {
            addCriterion("HOME_WIN_ODDS not like", value, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsIn(List<String> values) {
            addCriterion("HOME_WIN_ODDS in", values, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsNotIn(List<String> values) {
            addCriterion("HOME_WIN_ODDS not in", values, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsBetween(String value1, String value2) {
            addCriterion("HOME_WIN_ODDS between", value1, value2, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeWinOddsNotBetween(String value1, String value2) {
            addCriterion("HOME_WIN_ODDS not between", value1, value2, "homeWinOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsIsNull() {
            addCriterion("HOME_LOST_ODDS is null");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsIsNotNull() {
            addCriterion("HOME_LOST_ODDS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsEqualTo(String value) {
            addCriterion("HOME_LOST_ODDS =", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsNotEqualTo(String value) {
            addCriterion("HOME_LOST_ODDS <>", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsGreaterThan(String value) {
            addCriterion("HOME_LOST_ODDS >", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_LOST_ODDS >=", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsLessThan(String value) {
            addCriterion("HOME_LOST_ODDS <", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsLessThanOrEqualTo(String value) {
            addCriterion("HOME_LOST_ODDS <=", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsLike(String value) {
            addCriterion("HOME_LOST_ODDS like", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsNotLike(String value) {
            addCriterion("HOME_LOST_ODDS not like", value, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsIn(List<String> values) {
            addCriterion("HOME_LOST_ODDS in", values, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsNotIn(List<String> values) {
            addCriterion("HOME_LOST_ODDS not in", values, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsBetween(String value1, String value2) {
            addCriterion("HOME_LOST_ODDS between", value1, value2, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeLostOddsNotBetween(String value1, String value2) {
            addCriterion("HOME_LOST_ODDS not between", value1, value2, "homeLostOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsIsNull() {
            addCriterion("HOME_DRAW_ODDS is null");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsIsNotNull() {
            addCriterion("HOME_DRAW_ODDS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsEqualTo(String value) {
            addCriterion("HOME_DRAW_ODDS =", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsNotEqualTo(String value) {
            addCriterion("HOME_DRAW_ODDS <>", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsGreaterThan(String value) {
            addCriterion("HOME_DRAW_ODDS >", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_DRAW_ODDS >=", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsLessThan(String value) {
            addCriterion("HOME_DRAW_ODDS <", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsLessThanOrEqualTo(String value) {
            addCriterion("HOME_DRAW_ODDS <=", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsLike(String value) {
            addCriterion("HOME_DRAW_ODDS like", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsNotLike(String value) {
            addCriterion("HOME_DRAW_ODDS not like", value, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsIn(List<String> values) {
            addCriterion("HOME_DRAW_ODDS in", values, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsNotIn(List<String> values) {
            addCriterion("HOME_DRAW_ODDS not in", values, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsBetween(String value1, String value2) {
            addCriterion("HOME_DRAW_ODDS between", value1, value2, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andHomeDrawOddsNotBetween(String value1, String value2) {
            addCriterion("HOME_DRAW_ODDS not between", value1, value2, "homeDrawOdds");
            return (Criteria) this;
        }

        public Criteria andMatchResultIsNull() {
            addCriterion("MATCH_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andMatchResultIsNotNull() {
            addCriterion("MATCH_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andMatchResultEqualTo(String value) {
            addCriterion("MATCH_RESULT =", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultNotEqualTo(String value) {
            addCriterion("MATCH_RESULT <>", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultGreaterThan(String value) {
            addCriterion("MATCH_RESULT >", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_RESULT >=", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultLessThan(String value) {
            addCriterion("MATCH_RESULT <", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultLessThanOrEqualTo(String value) {
            addCriterion("MATCH_RESULT <=", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultLike(String value) {
            addCriterion("MATCH_RESULT like", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultNotLike(String value) {
            addCriterion("MATCH_RESULT not like", value, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultIn(List<String> values) {
            addCriterion("MATCH_RESULT in", values, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultNotIn(List<String> values) {
            addCriterion("MATCH_RESULT not in", values, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultBetween(String value1, String value2) {
            addCriterion("MATCH_RESULT between", value1, value2, "matchResult");
            return (Criteria) this;
        }

        public Criteria andMatchResultNotBetween(String value1, String value2) {
            addCriterion("MATCH_RESULT not between", value1, value2, "matchResult");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreIsNull() {
            addCriterion("HALF_TIME_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreIsNotNull() {
            addCriterion("HALF_TIME_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreEqualTo(String value) {
            addCriterion("HALF_TIME_SCORE =", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreNotEqualTo(String value) {
            addCriterion("HALF_TIME_SCORE <>", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreGreaterThan(String value) {
            addCriterion("HALF_TIME_SCORE >", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreGreaterThanOrEqualTo(String value) {
            addCriterion("HALF_TIME_SCORE >=", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreLessThan(String value) {
            addCriterion("HALF_TIME_SCORE <", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreLessThanOrEqualTo(String value) {
            addCriterion("HALF_TIME_SCORE <=", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreLike(String value) {
            addCriterion("HALF_TIME_SCORE like", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreNotLike(String value) {
            addCriterion("HALF_TIME_SCORE not like", value, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreIn(List<String> values) {
            addCriterion("HALF_TIME_SCORE in", values, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreNotIn(List<String> values) {
            addCriterion("HALF_TIME_SCORE not in", values, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreBetween(String value1, String value2) {
            addCriterion("HALF_TIME_SCORE between", value1, value2, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andHalfTimeScoreNotBetween(String value1, String value2) {
            addCriterion("HALF_TIME_SCORE not between", value1, value2, "halfTimeScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIsNull() {
            addCriterion("MATCH_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIsNotNull() {
            addCriterion("MATCH_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchScoreEqualTo(String value) {
            addCriterion("MATCH_SCORE =", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotEqualTo(String value) {
            addCriterion("MATCH_SCORE <>", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreGreaterThan(String value) {
            addCriterion("MATCH_SCORE >", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_SCORE >=", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreLessThan(String value) {
            addCriterion("MATCH_SCORE <", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreLessThanOrEqualTo(String value) {
            addCriterion("MATCH_SCORE <=", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreLike(String value) {
            addCriterion("MATCH_SCORE like", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotLike(String value) {
            addCriterion("MATCH_SCORE not like", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIn(List<String> values) {
            addCriterion("MATCH_SCORE in", values, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotIn(List<String> values) {
            addCriterion("MATCH_SCORE not in", values, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreBetween(String value1, String value2) {
            addCriterion("MATCH_SCORE between", value1, value2, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotBetween(String value1, String value2) {
            addCriterion("MATCH_SCORE not between", value1, value2, "matchScore");
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