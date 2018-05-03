package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrUserExample() {
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

        public Criteria andUserNicknameIsNull() {
            addCriterion("USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("USER_NICKNAME =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("USER_NICKNAME <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("USER_NICKNAME >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("USER_NICKNAME <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("USER_NICKNAME like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("USER_NICKNAME not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("USER_NICKNAME in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("USER_NICKNAME not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNull() {
            addCriterion("USER_REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNotNull() {
            addCriterion("USER_REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameEqualTo(String value) {
            addCriterion("USER_REALNAME =", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotEqualTo(String value) {
            addCriterion("USER_REALNAME <>", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThan(String value) {
            addCriterion("USER_REALNAME >", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_REALNAME >=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThan(String value) {
            addCriterion("USER_REALNAME <", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("USER_REALNAME <=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLike(String value) {
            addCriterion("USER_REALNAME like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotLike(String value) {
            addCriterion("USER_REALNAME not like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIn(List<String> values) {
            addCriterion("USER_REALNAME in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotIn(List<String> values) {
            addCriterion("USER_REALNAME not in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameBetween(String value1, String value2) {
            addCriterion("USER_REALNAME between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotBetween(String value1, String value2) {
            addCriterion("USER_REALNAME not between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("USER_MOBILE =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("USER_MOBILE <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("USER_MOBILE >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("USER_MOBILE <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("USER_MOBILE like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("USER_MOBILE not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("USER_MOBILE in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("USER_MOBILE not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("USER_MOBILE between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNull() {
            addCriterion("USER_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNotNull() {
            addCriterion("USER_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardEqualTo(String value) {
            addCriterion("USER_IDCARD =", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotEqualTo(String value) {
            addCriterion("USER_IDCARD <>", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThan(String value) {
            addCriterion("USER_IDCARD >", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IDCARD >=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThan(String value) {
            addCriterion("USER_IDCARD <", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThanOrEqualTo(String value) {
            addCriterion("USER_IDCARD <=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLike(String value) {
            addCriterion("USER_IDCARD like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotLike(String value) {
            addCriterion("USER_IDCARD not like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIn(List<String> values) {
            addCriterion("USER_IDCARD in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotIn(List<String> values) {
            addCriterion("USER_IDCARD not in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardBetween(String value1, String value2) {
            addCriterion("USER_IDCARD between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotBetween(String value1, String value2) {
            addCriterion("USER_IDCARD not between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserStsIsNull() {
            addCriterion("USER_STS is null");
            return (Criteria) this;
        }

        public Criteria andUserStsIsNotNull() {
            addCriterion("USER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStsEqualTo(String value) {
            addCriterion("USER_STS =", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsNotEqualTo(String value) {
            addCriterion("USER_STS <>", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsGreaterThan(String value) {
            addCriterion("USER_STS >", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STS >=", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsLessThan(String value) {
            addCriterion("USER_STS <", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsLessThanOrEqualTo(String value) {
            addCriterion("USER_STS <=", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsLike(String value) {
            addCriterion("USER_STS like", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsNotLike(String value) {
            addCriterion("USER_STS not like", value, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsIn(List<String> values) {
            addCriterion("USER_STS in", values, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsNotIn(List<String> values) {
            addCriterion("USER_STS not in", values, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsBetween(String value1, String value2) {
            addCriterion("USER_STS between", value1, value2, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserStsNotBetween(String value1, String value2) {
            addCriterion("USER_STS not between", value1, value2, "userSts");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlIsNull() {
            addCriterion("USER_HEADIMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlIsNotNull() {
            addCriterion("USER_HEADIMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlEqualTo(String value) {
            addCriterion("USER_HEADIMG_URL =", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlNotEqualTo(String value) {
            addCriterion("USER_HEADIMG_URL <>", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlGreaterThan(String value) {
            addCriterion("USER_HEADIMG_URL >", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("USER_HEADIMG_URL >=", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlLessThan(String value) {
            addCriterion("USER_HEADIMG_URL <", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlLessThanOrEqualTo(String value) {
            addCriterion("USER_HEADIMG_URL <=", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlLike(String value) {
            addCriterion("USER_HEADIMG_URL like", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlNotLike(String value) {
            addCriterion("USER_HEADIMG_URL not like", value, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlIn(List<String> values) {
            addCriterion("USER_HEADIMG_URL in", values, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlNotIn(List<String> values) {
            addCriterion("USER_HEADIMG_URL not in", values, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlBetween(String value1, String value2) {
            addCriterion("USER_HEADIMG_URL between", value1, value2, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgUrlNotBetween(String value1, String value2) {
            addCriterion("USER_HEADIMG_URL not between", value1, value2, "userHeadimgUrl");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNull() {
            addCriterion("USER_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNotNull() {
            addCriterion("USER_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountryEqualTo(String value) {
            addCriterion("USER_COUNTRY =", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotEqualTo(String value) {
            addCriterion("USER_COUNTRY <>", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThan(String value) {
            addCriterion("USER_COUNTRY >", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThanOrEqualTo(String value) {
            addCriterion("USER_COUNTRY >=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThan(String value) {
            addCriterion("USER_COUNTRY <", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThanOrEqualTo(String value) {
            addCriterion("USER_COUNTRY <=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLike(String value) {
            addCriterion("USER_COUNTRY like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotLike(String value) {
            addCriterion("USER_COUNTRY not like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryIn(List<String> values) {
            addCriterion("USER_COUNTRY in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotIn(List<String> values) {
            addCriterion("USER_COUNTRY not in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryBetween(String value1, String value2) {
            addCriterion("USER_COUNTRY between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotBetween(String value1, String value2) {
            addCriterion("USER_COUNTRY not between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("USER_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("USER_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("USER_PROVINCE =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("USER_PROVINCE <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("USER_PROVINCE >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PROVINCE >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("USER_PROVINCE <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("USER_PROVINCE <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("USER_PROVINCE like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("USER_PROVINCE not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("USER_PROVINCE in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("USER_PROVINCE not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("USER_PROVINCE between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("USER_PROVINCE not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("USER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("USER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("USER_CITY =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("USER_CITY <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("USER_CITY >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CITY >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("USER_CITY <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("USER_CITY <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("USER_CITY like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("USER_CITY not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("USER_CITY in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("USER_CITY not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("USER_CITY between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("USER_CITY not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdIsNull() {
            addCriterion("USER_CURRENT_TOKEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdIsNotNull() {
            addCriterion("USER_CURRENT_TOKEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdEqualTo(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID =", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdNotEqualTo(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID <>", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdGreaterThan(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID >", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID >=", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdLessThan(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID <", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_CURRENT_TOKEN_ID <=", value, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdIn(List<Long> values) {
            addCriterion("USER_CURRENT_TOKEN_ID in", values, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdNotIn(List<Long> values) {
            addCriterion("USER_CURRENT_TOKEN_ID not in", values, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdBetween(Long value1, Long value2) {
            addCriterion("USER_CURRENT_TOKEN_ID between", value1, value2, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserCurrentTokenIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_CURRENT_TOKEN_ID not between", value1, value2, "userCurrentTokenId");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenIsNull() {
            addCriterion("USER_WX_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenIsNotNull() {
            addCriterion("USER_WX_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenEqualTo(String value) {
            addCriterion("USER_WX_TOKEN =", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenNotEqualTo(String value) {
            addCriterion("USER_WX_TOKEN <>", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenGreaterThan(String value) {
            addCriterion("USER_WX_TOKEN >", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WX_TOKEN >=", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenLessThan(String value) {
            addCriterion("USER_WX_TOKEN <", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenLessThanOrEqualTo(String value) {
            addCriterion("USER_WX_TOKEN <=", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenLike(String value) {
            addCriterion("USER_WX_TOKEN like", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenNotLike(String value) {
            addCriterion("USER_WX_TOKEN not like", value, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenIn(List<String> values) {
            addCriterion("USER_WX_TOKEN in", values, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenNotIn(List<String> values) {
            addCriterion("USER_WX_TOKEN not in", values, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenBetween(String value1, String value2) {
            addCriterion("USER_WX_TOKEN between", value1, value2, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxTokenNotBetween(String value1, String value2) {
            addCriterion("USER_WX_TOKEN not between", value1, value2, "userWxToken");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdIsNull() {
            addCriterion("USER_WX_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdIsNotNull() {
            addCriterion("USER_WX_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdEqualTo(String value) {
            addCriterion("USER_WX_OPEN_ID =", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdNotEqualTo(String value) {
            addCriterion("USER_WX_OPEN_ID <>", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdGreaterThan(String value) {
            addCriterion("USER_WX_OPEN_ID >", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WX_OPEN_ID >=", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdLessThan(String value) {
            addCriterion("USER_WX_OPEN_ID <", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("USER_WX_OPEN_ID <=", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdLike(String value) {
            addCriterion("USER_WX_OPEN_ID like", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdNotLike(String value) {
            addCriterion("USER_WX_OPEN_ID not like", value, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdIn(List<String> values) {
            addCriterion("USER_WX_OPEN_ID in", values, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdNotIn(List<String> values) {
            addCriterion("USER_WX_OPEN_ID not in", values, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdBetween(String value1, String value2) {
            addCriterion("USER_WX_OPEN_ID between", value1, value2, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("USER_WX_OPEN_ID not between", value1, value2, "userWxOpenId");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameIsNull() {
            addCriterion("USER_WX_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameIsNotNull() {
            addCriterion("USER_WX_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameEqualTo(String value) {
            addCriterion("USER_WX_NICKNAME =", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameNotEqualTo(String value) {
            addCriterion("USER_WX_NICKNAME <>", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameGreaterThan(String value) {
            addCriterion("USER_WX_NICKNAME >", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WX_NICKNAME >=", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameLessThan(String value) {
            addCriterion("USER_WX_NICKNAME <", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameLessThanOrEqualTo(String value) {
            addCriterion("USER_WX_NICKNAME <=", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameLike(String value) {
            addCriterion("USER_WX_NICKNAME like", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameNotLike(String value) {
            addCriterion("USER_WX_NICKNAME not like", value, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameIn(List<String> values) {
            addCriterion("USER_WX_NICKNAME in", values, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameNotIn(List<String> values) {
            addCriterion("USER_WX_NICKNAME not in", values, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameBetween(String value1, String value2) {
            addCriterion("USER_WX_NICKNAME between", value1, value2, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxNicknameNotBetween(String value1, String value2) {
            addCriterion("USER_WX_NICKNAME not between", value1, value2, "userWxNickname");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeIsNull() {
            addCriterion("USER_WX_PRIVILEGE is null");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeIsNotNull() {
            addCriterion("USER_WX_PRIVILEGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeEqualTo(String value) {
            addCriterion("USER_WX_PRIVILEGE =", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeNotEqualTo(String value) {
            addCriterion("USER_WX_PRIVILEGE <>", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeGreaterThan(String value) {
            addCriterion("USER_WX_PRIVILEGE >", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WX_PRIVILEGE >=", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeLessThan(String value) {
            addCriterion("USER_WX_PRIVILEGE <", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeLessThanOrEqualTo(String value) {
            addCriterion("USER_WX_PRIVILEGE <=", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeLike(String value) {
            addCriterion("USER_WX_PRIVILEGE like", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeNotLike(String value) {
            addCriterion("USER_WX_PRIVILEGE not like", value, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeIn(List<String> values) {
            addCriterion("USER_WX_PRIVILEGE in", values, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeNotIn(List<String> values) {
            addCriterion("USER_WX_PRIVILEGE not in", values, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeBetween(String value1, String value2) {
            addCriterion("USER_WX_PRIVILEGE between", value1, value2, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxPrivilegeNotBetween(String value1, String value2) {
            addCriterion("USER_WX_PRIVILEGE not between", value1, value2, "userWxPrivilege");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidIsNull() {
            addCriterion("USER_WX_UNIONID is null");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidIsNotNull() {
            addCriterion("USER_WX_UNIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidEqualTo(String value) {
            addCriterion("USER_WX_UNIONID =", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidNotEqualTo(String value) {
            addCriterion("USER_WX_UNIONID <>", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidGreaterThan(String value) {
            addCriterion("USER_WX_UNIONID >", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WX_UNIONID >=", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidLessThan(String value) {
            addCriterion("USER_WX_UNIONID <", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidLessThanOrEqualTo(String value) {
            addCriterion("USER_WX_UNIONID <=", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidLike(String value) {
            addCriterion("USER_WX_UNIONID like", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidNotLike(String value) {
            addCriterion("USER_WX_UNIONID not like", value, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidIn(List<String> values) {
            addCriterion("USER_WX_UNIONID in", values, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidNotIn(List<String> values) {
            addCriterion("USER_WX_UNIONID not in", values, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidBetween(String value1, String value2) {
            addCriterion("USER_WX_UNIONID between", value1, value2, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserWxUnionidNotBetween(String value1, String value2) {
            addCriterion("USER_WX_UNIONID not between", value1, value2, "userWxUnionid");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIsNull() {
            addCriterion("WX_ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIsNotNull() {
            addCriterion("WX_ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN =", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN <>", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenGreaterThan(String value) {
            addCriterion("WX_ACCESS_TOKEN >", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN >=", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLessThan(String value) {
            addCriterion("WX_ACCESS_TOKEN <", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("WX_ACCESS_TOKEN <=", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenLike(String value) {
            addCriterion("WX_ACCESS_TOKEN like", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotLike(String value) {
            addCriterion("WX_ACCESS_TOKEN not like", value, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenIn(List<String> values) {
            addCriterion("WX_ACCESS_TOKEN in", values, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotIn(List<String> values) {
            addCriterion("WX_ACCESS_TOKEN not in", values, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenBetween(String value1, String value2) {
            addCriterion("WX_ACCESS_TOKEN between", value1, value2, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxAccessTokenNotBetween(String value1, String value2) {
            addCriterion("WX_ACCESS_TOKEN not between", value1, value2, "wxAccessToken");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyIsNull() {
            addCriterion("WX_SESSSION_KEY is null");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyIsNotNull() {
            addCriterion("WX_SESSSION_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyEqualTo(String value) {
            addCriterion("WX_SESSSION_KEY =", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyNotEqualTo(String value) {
            addCriterion("WX_SESSSION_KEY <>", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyGreaterThan(String value) {
            addCriterion("WX_SESSSION_KEY >", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("WX_SESSSION_KEY >=", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyLessThan(String value) {
            addCriterion("WX_SESSSION_KEY <", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyLessThanOrEqualTo(String value) {
            addCriterion("WX_SESSSION_KEY <=", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyLike(String value) {
            addCriterion("WX_SESSSION_KEY like", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyNotLike(String value) {
            addCriterion("WX_SESSSION_KEY not like", value, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyIn(List<String> values) {
            addCriterion("WX_SESSSION_KEY in", values, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyNotIn(List<String> values) {
            addCriterion("WX_SESSSION_KEY not in", values, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyBetween(String value1, String value2) {
            addCriterion("WX_SESSSION_KEY between", value1, value2, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxSesssionKeyNotBetween(String value1, String value2) {
            addCriterion("WX_SESSSION_KEY not between", value1, value2, "wxSesssionKey");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIsNull() {
            addCriterion("WX_REFRESH_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIsNotNull() {
            addCriterion("WX_REFRESH_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenEqualTo(String value) {
            addCriterion("WX_REFRESH_TOKEN =", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotEqualTo(String value) {
            addCriterion("WX_REFRESH_TOKEN <>", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenGreaterThan(String value) {
            addCriterion("WX_REFRESH_TOKEN >", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("WX_REFRESH_TOKEN >=", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLessThan(String value) {
            addCriterion("WX_REFRESH_TOKEN <", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("WX_REFRESH_TOKEN <=", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLike(String value) {
            addCriterion("WX_REFRESH_TOKEN like", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotLike(String value) {
            addCriterion("WX_REFRESH_TOKEN not like", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIn(List<String> values) {
            addCriterion("WX_REFRESH_TOKEN in", values, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotIn(List<String> values) {
            addCriterion("WX_REFRESH_TOKEN not in", values, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenBetween(String value1, String value2) {
            addCriterion("WX_REFRESH_TOKEN between", value1, value2, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("WX_REFRESH_TOKEN not between", value1, value2, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("USER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("USER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("USER_CREATE_TIME =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("USER_CREATE_TIME <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("USER_CREATE_TIME >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_CREATE_TIME >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("USER_CREATE_TIME <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_CREATE_TIME <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("USER_CREATE_TIME in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("USER_CREATE_TIME not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("USER_CREATE_TIME between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_CREATE_TIME not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("USER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("USER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("USER_SOURCE =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("USER_SOURCE <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("USER_SOURCE >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("USER_SOURCE <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("USER_SOURCE like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("USER_SOURCE not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("USER_SOURCE in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("USER_SOURCE not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("USER_SOURCE between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("USER_SOURCE not between", value1, value2, "userSource");
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