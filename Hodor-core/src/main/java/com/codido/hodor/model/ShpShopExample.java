package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShpShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShpShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNull() {
            addCriterion("SHOP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNotNull() {
            addCriterion("SHOP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescEqualTo(String value) {
            addCriterion("SHOP_DESC =", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotEqualTo(String value) {
            addCriterion("SHOP_DESC <>", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThan(String value) {
            addCriterion("SHOP_DESC >", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_DESC >=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThan(String value) {
            addCriterion("SHOP_DESC <", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThanOrEqualTo(String value) {
            addCriterion("SHOP_DESC <=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLike(String value) {
            addCriterion("SHOP_DESC like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotLike(String value) {
            addCriterion("SHOP_DESC not like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescIn(List<String> values) {
            addCriterion("SHOP_DESC in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotIn(List<String> values) {
            addCriterion("SHOP_DESC not in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescBetween(String value1, String value2) {
            addCriterion("SHOP_DESC between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotBetween(String value1, String value2) {
            addCriterion("SHOP_DESC not between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdIsNull() {
            addCriterion("SHOP_OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdIsNotNull() {
            addCriterion("SHOP_OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdEqualTo(Long value) {
            addCriterion("SHOP_OWNER_ID =", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdNotEqualTo(Long value) {
            addCriterion("SHOP_OWNER_ID <>", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdGreaterThan(Long value) {
            addCriterion("SHOP_OWNER_ID >", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_OWNER_ID >=", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdLessThan(Long value) {
            addCriterion("SHOP_OWNER_ID <", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_OWNER_ID <=", value, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdIn(List<Long> values) {
            addCriterion("SHOP_OWNER_ID in", values, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdNotIn(List<Long> values) {
            addCriterion("SHOP_OWNER_ID not in", values, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_OWNER_ID between", value1, value2, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_OWNER_ID not between", value1, value2, "shopOwnerId");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlIsNull() {
            addCriterion("SHOP_ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlIsNotNull() {
            addCriterion("SHOP_ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlEqualTo(String value) {
            addCriterion("SHOP_ICON_URL =", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlNotEqualTo(String value) {
            addCriterion("SHOP_ICON_URL <>", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlGreaterThan(String value) {
            addCriterion("SHOP_ICON_URL >", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ICON_URL >=", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlLessThan(String value) {
            addCriterion("SHOP_ICON_URL <", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ICON_URL <=", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlLike(String value) {
            addCriterion("SHOP_ICON_URL like", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlNotLike(String value) {
            addCriterion("SHOP_ICON_URL not like", value, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlIn(List<String> values) {
            addCriterion("SHOP_ICON_URL in", values, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlNotIn(List<String> values) {
            addCriterion("SHOP_ICON_URL not in", values, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlBetween(String value1, String value2) {
            addCriterion("SHOP_ICON_URL between", value1, value2, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopIconUrlNotBetween(String value1, String value2) {
            addCriterion("SHOP_ICON_URL not between", value1, value2, "shopIconUrl");
            return (Criteria) this;
        }

        public Criteria andShopMblNoIsNull() {
            addCriterion("SHOP_MBL_NO is null");
            return (Criteria) this;
        }

        public Criteria andShopMblNoIsNotNull() {
            addCriterion("SHOP_MBL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andShopMblNoEqualTo(String value) {
            addCriterion("SHOP_MBL_NO =", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoNotEqualTo(String value) {
            addCriterion("SHOP_MBL_NO <>", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoGreaterThan(String value) {
            addCriterion("SHOP_MBL_NO >", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MBL_NO >=", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoLessThan(String value) {
            addCriterion("SHOP_MBL_NO <", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MBL_NO <=", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoLike(String value) {
            addCriterion("SHOP_MBL_NO like", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoNotLike(String value) {
            addCriterion("SHOP_MBL_NO not like", value, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoIn(List<String> values) {
            addCriterion("SHOP_MBL_NO in", values, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoNotIn(List<String> values) {
            addCriterion("SHOP_MBL_NO not in", values, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoBetween(String value1, String value2) {
            addCriterion("SHOP_MBL_NO between", value1, value2, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopMblNoNotBetween(String value1, String value2) {
            addCriterion("SHOP_MBL_NO not between", value1, value2, "shopMblNo");
            return (Criteria) this;
        }

        public Criteria andShopWxIdIsNull() {
            addCriterion("SHOP_WX_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopWxIdIsNotNull() {
            addCriterion("SHOP_WX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopWxIdEqualTo(String value) {
            addCriterion("SHOP_WX_ID =", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdNotEqualTo(String value) {
            addCriterion("SHOP_WX_ID <>", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdGreaterThan(String value) {
            addCriterion("SHOP_WX_ID >", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_WX_ID >=", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdLessThan(String value) {
            addCriterion("SHOP_WX_ID <", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdLessThanOrEqualTo(String value) {
            addCriterion("SHOP_WX_ID <=", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdLike(String value) {
            addCriterion("SHOP_WX_ID like", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdNotLike(String value) {
            addCriterion("SHOP_WX_ID not like", value, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdIn(List<String> values) {
            addCriterion("SHOP_WX_ID in", values, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdNotIn(List<String> values) {
            addCriterion("SHOP_WX_ID not in", values, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdBetween(String value1, String value2) {
            addCriterion("SHOP_WX_ID between", value1, value2, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopWxIdNotBetween(String value1, String value2) {
            addCriterion("SHOP_WX_ID not between", value1, value2, "shopWxId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdIsNull() {
            addCriterion("SHOP_ALIPAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdIsNotNull() {
            addCriterion("SHOP_ALIPAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdEqualTo(String value) {
            addCriterion("SHOP_ALIPAY_ID =", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdNotEqualTo(String value) {
            addCriterion("SHOP_ALIPAY_ID <>", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdGreaterThan(String value) {
            addCriterion("SHOP_ALIPAY_ID >", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ALIPAY_ID >=", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdLessThan(String value) {
            addCriterion("SHOP_ALIPAY_ID <", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ALIPAY_ID <=", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdLike(String value) {
            addCriterion("SHOP_ALIPAY_ID like", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdNotLike(String value) {
            addCriterion("SHOP_ALIPAY_ID not like", value, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdIn(List<String> values) {
            addCriterion("SHOP_ALIPAY_ID in", values, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdNotIn(List<String> values) {
            addCriterion("SHOP_ALIPAY_ID not in", values, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdBetween(String value1, String value2) {
            addCriterion("SHOP_ALIPAY_ID between", value1, value2, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopAlipayIdNotBetween(String value1, String value2) {
            addCriterion("SHOP_ALIPAY_ID not between", value1, value2, "shopAlipayId");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlIsNull() {
            addCriterion("SHOP_QRCODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlIsNotNull() {
            addCriterion("SHOP_QRCODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlEqualTo(String value) {
            addCriterion("SHOP_QRCODE_URL =", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlNotEqualTo(String value) {
            addCriterion("SHOP_QRCODE_URL <>", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlGreaterThan(String value) {
            addCriterion("SHOP_QRCODE_URL >", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_QRCODE_URL >=", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlLessThan(String value) {
            addCriterion("SHOP_QRCODE_URL <", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("SHOP_QRCODE_URL <=", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlLike(String value) {
            addCriterion("SHOP_QRCODE_URL like", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlNotLike(String value) {
            addCriterion("SHOP_QRCODE_URL not like", value, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlIn(List<String> values) {
            addCriterion("SHOP_QRCODE_URL in", values, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlNotIn(List<String> values) {
            addCriterion("SHOP_QRCODE_URL not in", values, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlBetween(String value1, String value2) {
            addCriterion("SHOP_QRCODE_URL between", value1, value2, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("SHOP_QRCODE_URL not between", value1, value2, "shopQrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1IsNull() {
            addCriterion("SHOP_SLOGEN1 is null");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1IsNotNull() {
            addCriterion("SHOP_SLOGEN1 is not null");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1EqualTo(String value) {
            addCriterion("SHOP_SLOGEN1 =", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1NotEqualTo(String value) {
            addCriterion("SHOP_SLOGEN1 <>", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1GreaterThan(String value) {
            addCriterion("SHOP_SLOGEN1 >", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1GreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_SLOGEN1 >=", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1LessThan(String value) {
            addCriterion("SHOP_SLOGEN1 <", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1LessThanOrEqualTo(String value) {
            addCriterion("SHOP_SLOGEN1 <=", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1Like(String value) {
            addCriterion("SHOP_SLOGEN1 like", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1NotLike(String value) {
            addCriterion("SHOP_SLOGEN1 not like", value, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1In(List<String> values) {
            addCriterion("SHOP_SLOGEN1 in", values, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1NotIn(List<String> values) {
            addCriterion("SHOP_SLOGEN1 not in", values, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1Between(String value1, String value2) {
            addCriterion("SHOP_SLOGEN1 between", value1, value2, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen1NotBetween(String value1, String value2) {
            addCriterion("SHOP_SLOGEN1 not between", value1, value2, "shopSlogen1");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2IsNull() {
            addCriterion("SHOP_SLOGEN2 is null");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2IsNotNull() {
            addCriterion("SHOP_SLOGEN2 is not null");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2EqualTo(String value) {
            addCriterion("SHOP_SLOGEN2 =", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2NotEqualTo(String value) {
            addCriterion("SHOP_SLOGEN2 <>", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2GreaterThan(String value) {
            addCriterion("SHOP_SLOGEN2 >", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2GreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_SLOGEN2 >=", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2LessThan(String value) {
            addCriterion("SHOP_SLOGEN2 <", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2LessThanOrEqualTo(String value) {
            addCriterion("SHOP_SLOGEN2 <=", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2Like(String value) {
            addCriterion("SHOP_SLOGEN2 like", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2NotLike(String value) {
            addCriterion("SHOP_SLOGEN2 not like", value, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2In(List<String> values) {
            addCriterion("SHOP_SLOGEN2 in", values, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2NotIn(List<String> values) {
            addCriterion("SHOP_SLOGEN2 not in", values, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2Between(String value1, String value2) {
            addCriterion("SHOP_SLOGEN2 between", value1, value2, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopSlogen2NotBetween(String value1, String value2) {
            addCriterion("SHOP_SLOGEN2 not between", value1, value2, "shopSlogen2");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("SHOP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("SHOP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("SHOP_TYPE =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("SHOP_TYPE <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("SHOP_TYPE >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("SHOP_TYPE <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("SHOP_TYPE like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("SHOP_TYPE not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("SHOP_TYPE in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("SHOP_TYPE not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdIsNull() {
            addCriterion("SHOP_MAIN_LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdIsNotNull() {
            addCriterion("SHOP_MAIN_LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdEqualTo(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID =", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdNotEqualTo(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID <>", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdGreaterThan(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID >", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID >=", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdLessThan(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID <", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_MAIN_LOTTO_ID <=", value, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdIn(List<Long> values) {
            addCriterion("SHOP_MAIN_LOTTO_ID in", values, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdNotIn(List<Long> values) {
            addCriterion("SHOP_MAIN_LOTTO_ID not in", values, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_MAIN_LOTTO_ID between", value1, value2, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopMainLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_MAIN_LOTTO_ID not between", value1, value2, "shopMainLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdIsNull() {
            addCriterion("SHOP_SUB_LOTTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdIsNotNull() {
            addCriterion("SHOP_SUB_LOTTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdEqualTo(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID =", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdNotEqualTo(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID <>", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdGreaterThan(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID >", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID >=", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdLessThan(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID <", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_SUB_LOTTO_ID <=", value, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdIn(List<Long> values) {
            addCriterion("SHOP_SUB_LOTTO_ID in", values, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdNotIn(List<Long> values) {
            addCriterion("SHOP_SUB_LOTTO_ID not in", values, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_SUB_LOTTO_ID between", value1, value2, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopSubLottoIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_SUB_LOTTO_ID not between", value1, value2, "shopSubLottoId");
            return (Criteria) this;
        }

        public Criteria andShopUserCountIsNull() {
            addCriterion("SHOP_USER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andShopUserCountIsNotNull() {
            addCriterion("SHOP_USER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShopUserCountEqualTo(Integer value) {
            addCriterion("SHOP_USER_COUNT =", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountNotEqualTo(Integer value) {
            addCriterion("SHOP_USER_COUNT <>", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountGreaterThan(Integer value) {
            addCriterion("SHOP_USER_COUNT >", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_USER_COUNT >=", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountLessThan(Integer value) {
            addCriterion("SHOP_USER_COUNT <", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_USER_COUNT <=", value, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountIn(List<Integer> values) {
            addCriterion("SHOP_USER_COUNT in", values, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountNotIn(List<Integer> values) {
            addCriterion("SHOP_USER_COUNT not in", values, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_USER_COUNT between", value1, value2, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_USER_COUNT not between", value1, value2, "shopUserCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountIsNull() {
            addCriterion("SHOP_TOTAL_ORDER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountIsNotNull() {
            addCriterion("SHOP_TOTAL_ORDER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT =", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountNotEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT <>", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountGreaterThan(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT >", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT >=", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountLessThan(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT <", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT <=", value, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountIn(List<Integer> values) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT in", values, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountNotIn(List<Integer> values) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT not in", values, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT between", value1, value2, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_TOTAL_ORDER_COUNT not between", value1, value2, "shopTotalOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtIsNull() {
            addCriterion("SHOP_TOTAL_ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtIsNotNull() {
            addCriterion("SHOP_TOTAL_ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT =", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtNotEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT <>", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtGreaterThan(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT >", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT >=", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtLessThan(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT <", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_ORDER_AMT <=", value, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtIn(List<Long> values) {
            addCriterion("SHOP_TOTAL_ORDER_AMT in", values, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtNotIn(List<Long> values) {
            addCriterion("SHOP_TOTAL_ORDER_AMT not in", values, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtBetween(Long value1, Long value2) {
            addCriterion("SHOP_TOTAL_ORDER_AMT between", value1, value2, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalOrderAmtNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_TOTAL_ORDER_AMT not between", value1, value2, "shopTotalOrderAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountIsNull() {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountIsNotNull() {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT =", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountNotEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT <>", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountGreaterThan(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT >", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT >=", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountLessThan(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT <", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT <=", value, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountIn(List<Integer> values) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT in", values, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountNotIn(List<Integer> values) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT not in", values, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT between", value1, value2, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_TOTAL_BOUNS_COUNT not between", value1, value2, "shopTotalBounsCount");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtIsNull() {
            addCriterion("SHOP_TOTAL_BOUNS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtIsNotNull() {
            addCriterion("SHOP_TOTAL_BOUNS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT =", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtNotEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT <>", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtGreaterThan(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT >", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT >=", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtLessThan(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT <", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT <=", value, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtIn(List<Long> values) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT in", values, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtNotIn(List<Long> values) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT not in", values, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtBetween(Long value1, Long value2) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT between", value1, value2, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalBounsAmtNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_TOTAL_BOUNS_AMT not between", value1, value2, "shopTotalBounsAmt");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionIsNull() {
            addCriterion("SHOP_TOTAL_COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionIsNotNull() {
            addCriterion("SHOP_TOTAL_COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionEqualTo(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION =", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionNotEqualTo(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION <>", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionGreaterThan(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION >", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION >=", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionLessThan(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION <", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_TOTAL_COMMISSION <=", value, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionIn(List<BigDecimal> values) {
            addCriterion("SHOP_TOTAL_COMMISSION in", values, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionNotIn(List<BigDecimal> values) {
            addCriterion("SHOP_TOTAL_COMMISSION not in", values, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_TOTAL_COMMISSION between", value1, value2, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopTotalCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_TOTAL_COMMISSION not between", value1, value2, "shopTotalCommission");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("SHOP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("SHOP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("SHOP_ADDRESS =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("SHOP_ADDRESS >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("SHOP_ADDRESS <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("SHOP_ADDRESS like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("SHOP_ADDRESS not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("SHOP_ADDRESS in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("SHOP_ADDRESS not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopStsIsNull() {
            addCriterion("SHOP_STS is null");
            return (Criteria) this;
        }

        public Criteria andShopStsIsNotNull() {
            addCriterion("SHOP_STS is not null");
            return (Criteria) this;
        }

        public Criteria andShopStsEqualTo(String value) {
            addCriterion("SHOP_STS =", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsNotEqualTo(String value) {
            addCriterion("SHOP_STS <>", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsGreaterThan(String value) {
            addCriterion("SHOP_STS >", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_STS >=", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsLessThan(String value) {
            addCriterion("SHOP_STS <", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsLessThanOrEqualTo(String value) {
            addCriterion("SHOP_STS <=", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsLike(String value) {
            addCriterion("SHOP_STS like", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsNotLike(String value) {
            addCriterion("SHOP_STS not like", value, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsIn(List<String> values) {
            addCriterion("SHOP_STS in", values, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsNotIn(List<String> values) {
            addCriterion("SHOP_STS not in", values, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsBetween(String value1, String value2) {
            addCriterion("SHOP_STS between", value1, value2, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopStsNotBetween(String value1, String value2) {
            addCriterion("SHOP_STS not between", value1, value2, "shopSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsIsNull() {
            addCriterion("SHOP_TRAD_STS is null");
            return (Criteria) this;
        }

        public Criteria andShopTradStsIsNotNull() {
            addCriterion("SHOP_TRAD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andShopTradStsEqualTo(String value) {
            addCriterion("SHOP_TRAD_STS =", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsNotEqualTo(String value) {
            addCriterion("SHOP_TRAD_STS <>", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsGreaterThan(String value) {
            addCriterion("SHOP_TRAD_STS >", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_TRAD_STS >=", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsLessThan(String value) {
            addCriterion("SHOP_TRAD_STS <", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsLessThanOrEqualTo(String value) {
            addCriterion("SHOP_TRAD_STS <=", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsLike(String value) {
            addCriterion("SHOP_TRAD_STS like", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsNotLike(String value) {
            addCriterion("SHOP_TRAD_STS not like", value, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsIn(List<String> values) {
            addCriterion("SHOP_TRAD_STS in", values, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsNotIn(List<String> values) {
            addCriterion("SHOP_TRAD_STS not in", values, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsBetween(String value1, String value2) {
            addCriterion("SHOP_TRAD_STS between", value1, value2, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradStsNotBetween(String value1, String value2) {
            addCriterion("SHOP_TRAD_STS not between", value1, value2, "shopTradSts");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeIsNull() {
            addCriterion("SHOP_TRAD_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeIsNotNull() {
            addCriterion("SHOP_TRAD_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME =", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME <>", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME >", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME >=", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeLessThan(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME <", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME <=", value, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME in", values, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME not in", values, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME between", value1, value2, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("SHOP_TRAD_BEGIN_TIME not between", value1, value2, "shopTradBeginTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeIsNull() {
            addCriterion("SHOP_TRAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeIsNotNull() {
            addCriterion("SHOP_TRAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME =", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME <>", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME >", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME >=", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME <", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME <=", value, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME in", values, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME not in", values, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME between", value1, value2, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("SHOP_TRAD_END_TIME not between", value1, value2, "shopTradEndTime");
            return (Criteria) this;
        }

        public Criteria andShopTradRateIsNull() {
            addCriterion("SHOP_TRAD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andShopTradRateIsNotNull() {
            addCriterion("SHOP_TRAD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andShopTradRateEqualTo(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE =", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateNotEqualTo(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE <>", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateGreaterThan(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE >", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE >=", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateLessThan(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE <", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_TRAD_RATE <=", value, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateIn(List<BigDecimal> values) {
            addCriterion("SHOP_TRAD_RATE in", values, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateNotIn(List<BigDecimal> values) {
            addCriterion("SHOP_TRAD_RATE not in", values, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_TRAD_RATE between", value1, value2, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopTradRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_TRAD_RATE not between", value1, value2, "shopTradRate");
            return (Criteria) this;
        }

        public Criteria andShopChannalIsNull() {
            addCriterion("SHOP_CHANNAL is null");
            return (Criteria) this;
        }

        public Criteria andShopChannalIsNotNull() {
            addCriterion("SHOP_CHANNAL is not null");
            return (Criteria) this;
        }

        public Criteria andShopChannalEqualTo(String value) {
            addCriterion("SHOP_CHANNAL =", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalNotEqualTo(String value) {
            addCriterion("SHOP_CHANNAL <>", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalGreaterThan(String value) {
            addCriterion("SHOP_CHANNAL >", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_CHANNAL >=", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalLessThan(String value) {
            addCriterion("SHOP_CHANNAL <", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalLessThanOrEqualTo(String value) {
            addCriterion("SHOP_CHANNAL <=", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalLike(String value) {
            addCriterion("SHOP_CHANNAL like", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalNotLike(String value) {
            addCriterion("SHOP_CHANNAL not like", value, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalIn(List<String> values) {
            addCriterion("SHOP_CHANNAL in", values, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalNotIn(List<String> values) {
            addCriterion("SHOP_CHANNAL not in", values, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalBetween(String value1, String value2) {
            addCriterion("SHOP_CHANNAL between", value1, value2, "shopChannal");
            return (Criteria) this;
        }

        public Criteria andShopChannalNotBetween(String value1, String value2) {
            addCriterion("SHOP_CHANNAL not between", value1, value2, "shopChannal");
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