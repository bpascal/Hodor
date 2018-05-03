package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.List;

public class UsrPasswordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrPasswordsExample() {
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

        public Criteria andUsrPwdIdIsNull() {
            addCriterion("USR_PWD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdIsNotNull() {
            addCriterion("USR_PWD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdEqualTo(Long value) {
            addCriterion("USR_PWD_ID =", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdNotEqualTo(Long value) {
            addCriterion("USR_PWD_ID <>", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdGreaterThan(Long value) {
            addCriterion("USR_PWD_ID >", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_PWD_ID >=", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdLessThan(Long value) {
            addCriterion("USR_PWD_ID <", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_PWD_ID <=", value, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdIn(List<Long> values) {
            addCriterion("USR_PWD_ID in", values, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdNotIn(List<Long> values) {
            addCriterion("USR_PWD_ID not in", values, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdBetween(Long value1, Long value2) {
            addCriterion("USR_PWD_ID between", value1, value2, "usrPwdId");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_PWD_ID not between", value1, value2, "usrPwdId");
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

        public Criteria andUserMblNoIsNull() {
            addCriterion("USER_MBL_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserMblNoIsNotNull() {
            addCriterion("USER_MBL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserMblNoEqualTo(String value) {
            addCriterion("USER_MBL_NO =", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoNotEqualTo(String value) {
            addCriterion("USER_MBL_NO <>", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoGreaterThan(String value) {
            addCriterion("USER_MBL_NO >", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MBL_NO >=", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoLessThan(String value) {
            addCriterion("USER_MBL_NO <", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoLessThanOrEqualTo(String value) {
            addCriterion("USER_MBL_NO <=", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoLike(String value) {
            addCriterion("USER_MBL_NO like", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoNotLike(String value) {
            addCriterion("USER_MBL_NO not like", value, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoIn(List<String> values) {
            addCriterion("USER_MBL_NO in", values, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoNotIn(List<String> values) {
            addCriterion("USER_MBL_NO not in", values, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoBetween(String value1, String value2) {
            addCriterion("USER_MBL_NO between", value1, value2, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserMblNoNotBetween(String value1, String value2) {
            addCriterion("USER_MBL_NO not between", value1, value2, "userMblNo");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("USER_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("USER_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("USER_LOGIN_NAME >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("USER_LOGIN_NAME <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("USER_LOGIN_NAME like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("USER_LOGIN_NAME not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("USER_LOGIN_NAME in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("USER_LOGIN_NAME not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_NAME between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_NAME not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsIsNull() {
            addCriterion("USER_PASSWORDS is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsIsNotNull() {
            addCriterion("USER_PASSWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsEqualTo(String value) {
            addCriterion("USER_PASSWORDS =", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsNotEqualTo(String value) {
            addCriterion("USER_PASSWORDS <>", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsGreaterThan(String value) {
            addCriterion("USER_PASSWORDS >", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORDS >=", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsLessThan(String value) {
            addCriterion("USER_PASSWORDS <", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORDS <=", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsLike(String value) {
            addCriterion("USER_PASSWORDS like", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsNotLike(String value) {
            addCriterion("USER_PASSWORDS not like", value, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsIn(List<String> values) {
            addCriterion("USER_PASSWORDS in", values, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsNotIn(List<String> values) {
            addCriterion("USER_PASSWORDS not in", values, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsBetween(String value1, String value2) {
            addCriterion("USER_PASSWORDS between", value1, value2, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andUserPasswordsNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORDS not between", value1, value2, "userPasswords");
            return (Criteria) this;
        }

        public Criteria andPwdTypeIsNull() {
            addCriterion("PWD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPwdTypeIsNotNull() {
            addCriterion("PWD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPwdTypeEqualTo(String value) {
            addCriterion("PWD_TYPE =", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeNotEqualTo(String value) {
            addCriterion("PWD_TYPE <>", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeGreaterThan(String value) {
            addCriterion("PWD_TYPE >", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PWD_TYPE >=", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeLessThan(String value) {
            addCriterion("PWD_TYPE <", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeLessThanOrEqualTo(String value) {
            addCriterion("PWD_TYPE <=", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeLike(String value) {
            addCriterion("PWD_TYPE like", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeNotLike(String value) {
            addCriterion("PWD_TYPE not like", value, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeIn(List<String> values) {
            addCriterion("PWD_TYPE in", values, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeNotIn(List<String> values) {
            addCriterion("PWD_TYPE not in", values, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeBetween(String value1, String value2) {
            addCriterion("PWD_TYPE between", value1, value2, "pwdType");
            return (Criteria) this;
        }

        public Criteria andPwdTypeNotBetween(String value1, String value2) {
            addCriterion("PWD_TYPE not between", value1, value2, "pwdType");
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