package com.codido.hodor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
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

        public Criteria andInitUserIdIsNull() {
            addCriterion("INIT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInitUserIdIsNotNull() {
            addCriterion("INIT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInitUserIdEqualTo(Long value) {
            addCriterion("INIT_USER_ID =", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotEqualTo(Long value) {
            addCriterion("INIT_USER_ID <>", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdGreaterThan(Long value) {
            addCriterion("INIT_USER_ID >", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INIT_USER_ID >=", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdLessThan(Long value) {
            addCriterion("INIT_USER_ID <", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdLessThanOrEqualTo(Long value) {
            addCriterion("INIT_USER_ID <=", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdIn(List<Long> values) {
            addCriterion("INIT_USER_ID in", values, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotIn(List<Long> values) {
            addCriterion("INIT_USER_ID not in", values, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdBetween(Long value1, Long value2) {
            addCriterion("INIT_USER_ID between", value1, value2, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotBetween(Long value1, Long value2) {
            addCriterion("INIT_USER_ID not between", value1, value2, "initUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdIsNull() {
            addCriterion("DEAL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealUserIdIsNotNull() {
            addCriterion("DEAL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealUserIdEqualTo(Long value) {
            addCriterion("DEAL_USER_ID =", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdNotEqualTo(Long value) {
            addCriterion("DEAL_USER_ID <>", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdGreaterThan(Long value) {
            addCriterion("DEAL_USER_ID >", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_USER_ID >=", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdLessThan(Long value) {
            addCriterion("DEAL_USER_ID <", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_USER_ID <=", value, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdIn(List<Long> values) {
            addCriterion("DEAL_USER_ID in", values, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdNotIn(List<Long> values) {
            addCriterion("DEAL_USER_ID not in", values, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdBetween(Long value1, Long value2) {
            addCriterion("DEAL_USER_ID between", value1, value2, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealUserIdNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_USER_ID not between", value1, value2, "dealUserId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdIsNull() {
            addCriterion("DEAL_SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealShopIdIsNotNull() {
            addCriterion("DEAL_SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealShopIdEqualTo(Long value) {
            addCriterion("DEAL_SHOP_ID =", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdNotEqualTo(Long value) {
            addCriterion("DEAL_SHOP_ID <>", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdGreaterThan(Long value) {
            addCriterion("DEAL_SHOP_ID >", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_SHOP_ID >=", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdLessThan(Long value) {
            addCriterion("DEAL_SHOP_ID <", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_SHOP_ID <=", value, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdIn(List<Long> values) {
            addCriterion("DEAL_SHOP_ID in", values, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdNotIn(List<Long> values) {
            addCriterion("DEAL_SHOP_ID not in", values, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdBetween(Long value1, Long value2) {
            addCriterion("DEAL_SHOP_ID between", value1, value2, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andDealShopIdNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_SHOP_ID not between", value1, value2, "dealShopId");
            return (Criteria) this;
        }

        public Criteria andBetTimesIsNull() {
            addCriterion("BET_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andBetTimesIsNotNull() {
            addCriterion("BET_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andBetTimesEqualTo(Integer value) {
            addCriterion("BET_TIMES =", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesNotEqualTo(Integer value) {
            addCriterion("BET_TIMES <>", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesGreaterThan(Integer value) {
            addCriterion("BET_TIMES >", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("BET_TIMES >=", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesLessThan(Integer value) {
            addCriterion("BET_TIMES <", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesLessThanOrEqualTo(Integer value) {
            addCriterion("BET_TIMES <=", value, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesIn(List<Integer> values) {
            addCriterion("BET_TIMES in", values, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesNotIn(List<Integer> values) {
            addCriterion("BET_TIMES not in", values, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesBetween(Integer value1, Integer value2) {
            addCriterion("BET_TIMES between", value1, value2, "betTimes");
            return (Criteria) this;
        }

        public Criteria andBetTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("BET_TIMES not between", value1, value2, "betTimes");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountIsNull() {
            addCriterion("ORDER_TOTAL_BETS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountIsNotNull() {
            addCriterion("ORDER_TOTAL_BETS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountEqualTo(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT =", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountNotEqualTo(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT <>", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountGreaterThan(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT >", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT >=", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountLessThan(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT <", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_TOTAL_BETS_COUNT <=", value, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountIn(List<Integer> values) {
            addCriterion("ORDER_TOTAL_BETS_COUNT in", values, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountNotIn(List<Integer> values) {
            addCriterion("ORDER_TOTAL_BETS_COUNT not in", values, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_TOTAL_BETS_COUNT between", value1, value2, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_TOTAL_BETS_COUNT not between", value1, value2, "orderTotalBetsCount");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("ORDER_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("ORDER_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Integer value) {
            addCriterion("ORDER_PRICE =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Integer value) {
            addCriterion("ORDER_PRICE <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Integer value) {
            addCriterion("ORDER_PRICE >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_PRICE >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Integer value) {
            addCriterion("ORDER_PRICE <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_PRICE <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Integer> values) {
            addCriterion("ORDER_PRICE in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Integer> values) {
            addCriterion("ORDER_PRICE not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_PRICE between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_PRICE not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNull() {
            addCriterion("ORDER_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNotNull() {
            addCriterion("ORDER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStsEqualTo(String value) {
            addCriterion("ORDER_STS =", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotEqualTo(String value) {
            addCriterion("ORDER_STS <>", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThan(String value) {
            addCriterion("ORDER_STS >", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STS >=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThan(String value) {
            addCriterion("ORDER_STS <", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STS <=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLike(String value) {
            addCriterion("ORDER_STS like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotLike(String value) {
            addCriterion("ORDER_STS not like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsIn(List<String> values) {
            addCriterion("ORDER_STS in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotIn(List<String> values) {
            addCriterion("ORDER_STS not in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsBetween(String value1, String value2) {
            addCriterion("ORDER_STS between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_STS not between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andComGameStyleIsNull() {
            addCriterion("COM_GAME_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andComGameStyleIsNotNull() {
            addCriterion("COM_GAME_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andComGameStyleEqualTo(String value) {
            addCriterion("COM_GAME_STYLE =", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleNotEqualTo(String value) {
            addCriterion("COM_GAME_STYLE <>", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleGreaterThan(String value) {
            addCriterion("COM_GAME_STYLE >", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleGreaterThanOrEqualTo(String value) {
            addCriterion("COM_GAME_STYLE >=", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleLessThan(String value) {
            addCriterion("COM_GAME_STYLE <", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleLessThanOrEqualTo(String value) {
            addCriterion("COM_GAME_STYLE <=", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleLike(String value) {
            addCriterion("COM_GAME_STYLE like", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleNotLike(String value) {
            addCriterion("COM_GAME_STYLE not like", value, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleIn(List<String> values) {
            addCriterion("COM_GAME_STYLE in", values, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleNotIn(List<String> values) {
            addCriterion("COM_GAME_STYLE not in", values, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleBetween(String value1, String value2) {
            addCriterion("COM_GAME_STYLE between", value1, value2, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andComGameStyleNotBetween(String value1, String value2) {
            addCriterion("COM_GAME_STYLE not between", value1, value2, "comGameStyle");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsIsNull() {
            addCriterion("TICKET_UPLOAD_STS is null");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsIsNotNull() {
            addCriterion("TICKET_UPLOAD_STS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsEqualTo(String value) {
            addCriterion("TICKET_UPLOAD_STS =", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsNotEqualTo(String value) {
            addCriterion("TICKET_UPLOAD_STS <>", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsGreaterThan(String value) {
            addCriterion("TICKET_UPLOAD_STS >", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_UPLOAD_STS >=", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsLessThan(String value) {
            addCriterion("TICKET_UPLOAD_STS <", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsLessThanOrEqualTo(String value) {
            addCriterion("TICKET_UPLOAD_STS <=", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsLike(String value) {
            addCriterion("TICKET_UPLOAD_STS like", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsNotLike(String value) {
            addCriterion("TICKET_UPLOAD_STS not like", value, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsIn(List<String> values) {
            addCriterion("TICKET_UPLOAD_STS in", values, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsNotIn(List<String> values) {
            addCriterion("TICKET_UPLOAD_STS not in", values, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsBetween(String value1, String value2) {
            addCriterion("TICKET_UPLOAD_STS between", value1, value2, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadStsNotBetween(String value1, String value2) {
            addCriterion("TICKET_UPLOAD_STS not between", value1, value2, "ticketUploadSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsIsNull() {
            addCriterion("BONUS_STS is null");
            return (Criteria) this;
        }

        public Criteria andBonusStsIsNotNull() {
            addCriterion("BONUS_STS is not null");
            return (Criteria) this;
        }

        public Criteria andBonusStsEqualTo(String value) {
            addCriterion("BONUS_STS =", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsNotEqualTo(String value) {
            addCriterion("BONUS_STS <>", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsGreaterThan(String value) {
            addCriterion("BONUS_STS >", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_STS >=", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsLessThan(String value) {
            addCriterion("BONUS_STS <", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsLessThanOrEqualTo(String value) {
            addCriterion("BONUS_STS <=", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsLike(String value) {
            addCriterion("BONUS_STS like", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsNotLike(String value) {
            addCriterion("BONUS_STS not like", value, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsIn(List<String> values) {
            addCriterion("BONUS_STS in", values, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsNotIn(List<String> values) {
            addCriterion("BONUS_STS not in", values, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsBetween(String value1, String value2) {
            addCriterion("BONUS_STS between", value1, value2, "bonusSts");
            return (Criteria) this;
        }

        public Criteria andBonusStsNotBetween(String value1, String value2) {
            addCriterion("BONUS_STS not between", value1, value2, "bonusSts");
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

        public Criteria andBonusDescIsNull() {
            addCriterion("BONUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBonusDescIsNotNull() {
            addCriterion("BONUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBonusDescEqualTo(String value) {
            addCriterion("BONUS_DESC =", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescNotEqualTo(String value) {
            addCriterion("BONUS_DESC <>", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescGreaterThan(String value) {
            addCriterion("BONUS_DESC >", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_DESC >=", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescLessThan(String value) {
            addCriterion("BONUS_DESC <", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescLessThanOrEqualTo(String value) {
            addCriterion("BONUS_DESC <=", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescLike(String value) {
            addCriterion("BONUS_DESC like", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescNotLike(String value) {
            addCriterion("BONUS_DESC not like", value, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescIn(List<String> values) {
            addCriterion("BONUS_DESC in", values, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescNotIn(List<String> values) {
            addCriterion("BONUS_DESC not in", values, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescBetween(String value1, String value2) {
            addCriterion("BONUS_DESC between", value1, value2, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusDescNotBetween(String value1, String value2) {
            addCriterion("BONUS_DESC not between", value1, value2, "bonusDesc");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoIsNull() {
            addCriterion("BONUS_PAY_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoIsNotNull() {
            addCriterion("BONUS_PAY_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoEqualTo(String value) {
            addCriterion("BONUS_PAY_ORDER_NO =", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoNotEqualTo(String value) {
            addCriterion("BONUS_PAY_ORDER_NO <>", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoGreaterThan(String value) {
            addCriterion("BONUS_PAY_ORDER_NO >", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_PAY_ORDER_NO >=", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoLessThan(String value) {
            addCriterion("BONUS_PAY_ORDER_NO <", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoLessThanOrEqualTo(String value) {
            addCriterion("BONUS_PAY_ORDER_NO <=", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoLike(String value) {
            addCriterion("BONUS_PAY_ORDER_NO like", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoNotLike(String value) {
            addCriterion("BONUS_PAY_ORDER_NO not like", value, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoIn(List<String> values) {
            addCriterion("BONUS_PAY_ORDER_NO in", values, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoNotIn(List<String> values) {
            addCriterion("BONUS_PAY_ORDER_NO not in", values, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoBetween(String value1, String value2) {
            addCriterion("BONUS_PAY_ORDER_NO between", value1, value2, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andBonusPayOrderNoNotBetween(String value1, String value2) {
            addCriterion("BONUS_PAY_ORDER_NO not between", value1, value2, "bonusPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("ORDER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("ORDER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("ORDER_CREATE_TIME >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("ORDER_CREATE_TIME <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("ORDER_CREATE_TIME in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("ORDER_CREATE_TIME not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_TIME between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_TIME not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNull() {
            addCriterion("ORDER_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNotNull() {
            addCriterion("ORDER_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeEqualTo(Date value) {
            addCriterion("ORDER_CANCEL_TIME =", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotEqualTo(Date value) {
            addCriterion("ORDER_CANCEL_TIME <>", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThan(Date value) {
            addCriterion("ORDER_CANCEL_TIME >", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_CANCEL_TIME >=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThan(Date value) {
            addCriterion("ORDER_CANCEL_TIME <", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_CANCEL_TIME <=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIn(List<Date> values) {
            addCriterion("ORDER_CANCEL_TIME in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotIn(List<Date> values) {
            addCriterion("ORDER_CANCEL_TIME not in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_CANCEL_TIME between", value1, value2, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_CANCEL_TIME not between", value1, value2, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNull() {
            addCriterion("ORDER_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNotNull() {
            addCriterion("ORDER_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME =", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME <>", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThan(Date value) {
            addCriterion("ORDER_SEND_TIME >", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME >=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThan(Date value) {
            addCriterion("ORDER_SEND_TIME <", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME <=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIn(List<Date> values) {
            addCriterion("ORDER_SEND_TIME in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotIn(List<Date> values) {
            addCriterion("ORDER_SEND_TIME not in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_SEND_TIME between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_SEND_TIME not between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeIsNull() {
            addCriterion("ORDER_ACCEPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeIsNotNull() {
            addCriterion("ORDER_ACCEPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeEqualTo(Date value) {
            addCriterion("ORDER_ACCEPT_TIME =", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeNotEqualTo(Date value) {
            addCriterion("ORDER_ACCEPT_TIME <>", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeGreaterThan(Date value) {
            addCriterion("ORDER_ACCEPT_TIME >", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_ACCEPT_TIME >=", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeLessThan(Date value) {
            addCriterion("ORDER_ACCEPT_TIME <", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_ACCEPT_TIME <=", value, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeIn(List<Date> values) {
            addCriterion("ORDER_ACCEPT_TIME in", values, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeNotIn(List<Date> values) {
            addCriterion("ORDER_ACCEPT_TIME not in", values, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_ACCEPT_TIME between", value1, value2, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_ACCEPT_TIME not between", value1, value2, "orderAcceptTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicIsNull() {
            addCriterion("ORDER_TICKET_PIC is null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicIsNotNull() {
            addCriterion("ORDER_TICKET_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicEqualTo(String value) {
            addCriterion("ORDER_TICKET_PIC =", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicNotEqualTo(String value) {
            addCriterion("ORDER_TICKET_PIC <>", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicGreaterThan(String value) {
            addCriterion("ORDER_TICKET_PIC >", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TICKET_PIC >=", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicLessThan(String value) {
            addCriterion("ORDER_TICKET_PIC <", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TICKET_PIC <=", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicLike(String value) {
            addCriterion("ORDER_TICKET_PIC like", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicNotLike(String value) {
            addCriterion("ORDER_TICKET_PIC not like", value, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicIn(List<String> values) {
            addCriterion("ORDER_TICKET_PIC in", values, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicNotIn(List<String> values) {
            addCriterion("ORDER_TICKET_PIC not in", values, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicBetween(String value1, String value2) {
            addCriterion("ORDER_TICKET_PIC between", value1, value2, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andOrderTicketPicNotBetween(String value1, String value2) {
            addCriterion("ORDER_TICKET_PIC not between", value1, value2, "orderTicketPic");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdIsNull() {
            addCriterion("SUBMIT_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdIsNotNull() {
            addCriterion("SUBMIT_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdEqualTo(String value) {
            addCriterion("SUBMIT_FORM_ID =", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdNotEqualTo(String value) {
            addCriterion("SUBMIT_FORM_ID <>", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdGreaterThan(String value) {
            addCriterion("SUBMIT_FORM_ID >", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMIT_FORM_ID >=", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdLessThan(String value) {
            addCriterion("SUBMIT_FORM_ID <", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdLessThanOrEqualTo(String value) {
            addCriterion("SUBMIT_FORM_ID <=", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdLike(String value) {
            addCriterion("SUBMIT_FORM_ID like", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdNotLike(String value) {
            addCriterion("SUBMIT_FORM_ID not like", value, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdIn(List<String> values) {
            addCriterion("SUBMIT_FORM_ID in", values, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdNotIn(List<String> values) {
            addCriterion("SUBMIT_FORM_ID not in", values, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdBetween(String value1, String value2) {
            addCriterion("SUBMIT_FORM_ID between", value1, value2, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andSubmitFormIdNotBetween(String value1, String value2) {
            addCriterion("SUBMIT_FORM_ID not between", value1, value2, "submitFormId");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIsNull() {
            addCriterion("ORDER_PUSHMSG_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIsNotNull() {
            addCriterion("ORDER_PUSHMSG_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS =", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS <>", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsGreaterThan(String value) {
            addCriterion("ORDER_PUSHMSG_STS >", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS >=", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLessThan(String value) {
            addCriterion("ORDER_PUSHMSG_STS <", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PUSHMSG_STS <=", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsLike(String value) {
            addCriterion("ORDER_PUSHMSG_STS like", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotLike(String value) {
            addCriterion("ORDER_PUSHMSG_STS not like", value, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsIn(List<String> values) {
            addCriterion("ORDER_PUSHMSG_STS in", values, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotIn(List<String> values) {
            addCriterion("ORDER_PUSHMSG_STS not in", values, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsBetween(String value1, String value2) {
            addCriterion("ORDER_PUSHMSG_STS between", value1, value2, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andOrderPushmsgStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_PUSHMSG_STS not between", value1, value2, "orderPushmsgSts");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeIsNull() {
            addCriterion("TICKET_UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeIsNotNull() {
            addCriterion("TICKET_UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeEqualTo(Date value) {
            addCriterion("TICKET_UPLOAD_TIME =", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeNotEqualTo(Date value) {
            addCriterion("TICKET_UPLOAD_TIME <>", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeGreaterThan(Date value) {
            addCriterion("TICKET_UPLOAD_TIME >", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_UPLOAD_TIME >=", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeLessThan(Date value) {
            addCriterion("TICKET_UPLOAD_TIME <", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_UPLOAD_TIME <=", value, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeIn(List<Date> values) {
            addCriterion("TICKET_UPLOAD_TIME in", values, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeNotIn(List<Date> values) {
            addCriterion("TICKET_UPLOAD_TIME not in", values, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeBetween(Date value1, Date value2) {
            addCriterion("TICKET_UPLOAD_TIME between", value1, value2, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andTicketUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_UPLOAD_TIME not between", value1, value2, "ticketUploadTime");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNull() {
            addCriterion("PAY_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNotNull() {
            addCriterion("PAY_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdEqualTo(String value) {
            addCriterion("PAY_ORDER_ID =", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotEqualTo(String value) {
            addCriterion("PAY_ORDER_ID <>", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThan(String value) {
            addCriterion("PAY_ORDER_ID >", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_ID >=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThan(String value) {
            addCriterion("PAY_ORDER_ID <", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_ID <=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLike(String value) {
            addCriterion("PAY_ORDER_ID like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotLike(String value) {
            addCriterion("PAY_ORDER_ID not like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIn(List<String> values) {
            addCriterion("PAY_ORDER_ID in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotIn(List<String> values) {
            addCriterion("PAY_ORDER_ID not in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_ID between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_ID not between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("PAY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("PAY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("PAY_CHANNEL =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("PAY_CHANNEL >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("PAY_CHANNEL <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("PAY_CHANNEL like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("PAY_CHANNEL not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("PAY_CHANNEL in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayStsIsNull() {
            addCriterion("PAY_STS is null");
            return (Criteria) this;
        }

        public Criteria andPayStsIsNotNull() {
            addCriterion("PAY_STS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStsEqualTo(String value) {
            addCriterion("PAY_STS =", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsNotEqualTo(String value) {
            addCriterion("PAY_STS <>", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsGreaterThan(String value) {
            addCriterion("PAY_STS >", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STS >=", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsLessThan(String value) {
            addCriterion("PAY_STS <", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsLessThanOrEqualTo(String value) {
            addCriterion("PAY_STS <=", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsLike(String value) {
            addCriterion("PAY_STS like", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsNotLike(String value) {
            addCriterion("PAY_STS not like", value, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsIn(List<String> values) {
            addCriterion("PAY_STS in", values, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsNotIn(List<String> values) {
            addCriterion("PAY_STS not in", values, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsBetween(String value1, String value2) {
            addCriterion("PAY_STS between", value1, value2, "paySts");
            return (Criteria) this;
        }

        public Criteria andPayStsNotBetween(String value1, String value2) {
            addCriterion("PAY_STS not between", value1, value2, "paySts");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNull() {
            addCriterion("ORDER_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNotNull() {
            addCriterion("ORDER_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeEqualTo(Date value) {
            addCriterion("ORDER_PAY_TIME =", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotEqualTo(Date value) {
            addCriterion("ORDER_PAY_TIME <>", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThan(Date value) {
            addCriterion("ORDER_PAY_TIME >", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_PAY_TIME >=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThan(Date value) {
            addCriterion("ORDER_PAY_TIME <", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_PAY_TIME <=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIn(List<Date> values) {
            addCriterion("ORDER_PAY_TIME in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotIn(List<Date> values) {
            addCriterion("ORDER_PAY_TIME not in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_PAY_TIME between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_PAY_TIME not between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeIsNull() {
            addCriterion("ORDER_REJECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeIsNotNull() {
            addCriterion("ORDER_REJECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeEqualTo(Date value) {
            addCriterion("ORDER_REJECT_TIME =", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeNotEqualTo(Date value) {
            addCriterion("ORDER_REJECT_TIME <>", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeGreaterThan(Date value) {
            addCriterion("ORDER_REJECT_TIME >", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_REJECT_TIME >=", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeLessThan(Date value) {
            addCriterion("ORDER_REJECT_TIME <", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_REJECT_TIME <=", value, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeIn(List<Date> values) {
            addCriterion("ORDER_REJECT_TIME in", values, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeNotIn(List<Date> values) {
            addCriterion("ORDER_REJECT_TIME not in", values, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_REJECT_TIME between", value1, value2, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderRejectTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_REJECT_TIME not between", value1, value2, "orderRejectTime");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("ORDER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("ORDER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("ORDER_SOURCE =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("ORDER_SOURCE <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("ORDER_SOURCE >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("ORDER_SOURCE <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("ORDER_SOURCE like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("ORDER_SOURCE not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("ORDER_SOURCE in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("ORDER_SOURCE not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE not between", value1, value2, "orderSource");
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

        public Criteria andCopOrderNoIsNull() {
            addCriterion("COP_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoIsNotNull() {
            addCriterion("COP_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoEqualTo(String value) {
            addCriterion("COP_ORDER_NO =", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoNotEqualTo(String value) {
            addCriterion("COP_ORDER_NO <>", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoGreaterThan(String value) {
            addCriterion("COP_ORDER_NO >", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("COP_ORDER_NO >=", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoLessThan(String value) {
            addCriterion("COP_ORDER_NO <", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoLessThanOrEqualTo(String value) {
            addCriterion("COP_ORDER_NO <=", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoLike(String value) {
            addCriterion("COP_ORDER_NO like", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoNotLike(String value) {
            addCriterion("COP_ORDER_NO not like", value, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoIn(List<String> values) {
            addCriterion("COP_ORDER_NO in", values, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoNotIn(List<String> values) {
            addCriterion("COP_ORDER_NO not in", values, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoBetween(String value1, String value2) {
            addCriterion("COP_ORDER_NO between", value1, value2, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andCopOrderNoNotBetween(String value1, String value2) {
            addCriterion("COP_ORDER_NO not between", value1, value2, "copOrderNo");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeIsNull() {
            addCriterion("RECIVE_BONUS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeIsNotNull() {
            addCriterion("RECIVE_BONUS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_TIME =", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeNotEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_TIME <>", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeGreaterThan(Date value) {
            addCriterion("RECIVE_BONUS_TIME >", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_TIME >=", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeLessThan(Date value) {
            addCriterion("RECIVE_BONUS_TIME <", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_TIME <=", value, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeIn(List<Date> values) {
            addCriterion("RECIVE_BONUS_TIME in", values, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeNotIn(List<Date> values) {
            addCriterion("RECIVE_BONUS_TIME not in", values, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeBetween(Date value1, Date value2) {
            addCriterion("RECIVE_BONUS_TIME between", value1, value2, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECIVE_BONUS_TIME not between", value1, value2, "reciveBonusTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeIsNull() {
            addCriterion("RECIVE_BONUS_STS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeIsNotNull() {
            addCriterion("RECIVE_BONUS_STS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME =", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeNotEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME <>", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeGreaterThan(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME >", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME >=", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeLessThan(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME <", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECIVE_BONUS_STS_TIME <=", value, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeIn(List<Date> values) {
            addCriterion("RECIVE_BONUS_STS_TIME in", values, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeNotIn(List<Date> values) {
            addCriterion("RECIVE_BONUS_STS_TIME not in", values, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeBetween(Date value1, Date value2) {
            addCriterion("RECIVE_BONUS_STS_TIME between", value1, value2, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andReciveBonusStsTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECIVE_BONUS_STS_TIME not between", value1, value2, "reciveBonusStsTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeIsNull() {
            addCriterion("APPLY_BONUS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeIsNotNull() {
            addCriterion("APPLY_BONUS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeEqualTo(Date value) {
            addCriterion("APPLY_BONUS_TIME =", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeNotEqualTo(Date value) {
            addCriterion("APPLY_BONUS_TIME <>", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeGreaterThan(Date value) {
            addCriterion("APPLY_BONUS_TIME >", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_BONUS_TIME >=", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeLessThan(Date value) {
            addCriterion("APPLY_BONUS_TIME <", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_BONUS_TIME <=", value, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeIn(List<Date> values) {
            addCriterion("APPLY_BONUS_TIME in", values, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeNotIn(List<Date> values) {
            addCriterion("APPLY_BONUS_TIME not in", values, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_BONUS_TIME between", value1, value2, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andApplyBonusTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_BONUS_TIME not between", value1, value2, "applyBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeIsNull() {
            addCriterion("FINISH_BONUS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeIsNotNull() {
            addCriterion("FINISH_BONUS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeEqualTo(Date value) {
            addCriterion("FINISH_BONUS_TIME =", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeNotEqualTo(Date value) {
            addCriterion("FINISH_BONUS_TIME <>", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeGreaterThan(Date value) {
            addCriterion("FINISH_BONUS_TIME >", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISH_BONUS_TIME >=", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeLessThan(Date value) {
            addCriterion("FINISH_BONUS_TIME <", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISH_BONUS_TIME <=", value, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeIn(List<Date> values) {
            addCriterion("FINISH_BONUS_TIME in", values, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeNotIn(List<Date> values) {
            addCriterion("FINISH_BONUS_TIME not in", values, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeBetween(Date value1, Date value2) {
            addCriterion("FINISH_BONUS_TIME between", value1, value2, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andFinishBonusTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISH_BONUS_TIME not between", value1, value2, "finishBonusTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsIsNull() {
            addCriterion("ORDER_TICKET_RECIVE_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsIsNotNull() {
            addCriterion("ORDER_TICKET_RECIVE_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsEqualTo(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS =", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsNotEqualTo(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS <>", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsGreaterThan(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS >", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS >=", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsLessThan(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS <", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS <=", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsLike(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS like", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsNotLike(String value) {
            addCriterion("ORDER_TICKET_RECIVE_STS not like", value, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsIn(List<String> values) {
            addCriterion("ORDER_TICKET_RECIVE_STS in", values, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsNotIn(List<String> values) {
            addCriterion("ORDER_TICKET_RECIVE_STS not in", values, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsBetween(String value1, String value2) {
            addCriterion("ORDER_TICKET_RECIVE_STS between", value1, value2, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_TICKET_RECIVE_STS not between", value1, value2, "orderTicketReciveSts");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeIsNull() {
            addCriterion("ORDER_TICKET_RECIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeIsNotNull() {
            addCriterion("ORDER_TICKET_RECIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeEqualTo(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME =", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME <>", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeGreaterThan(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME >", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME >=", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeLessThan(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME <", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TICKET_RECIVE_TIME <=", value, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeIn(List<Date> values) {
            addCriterion("ORDER_TICKET_RECIVE_TIME in", values, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TICKET_RECIVE_TIME not in", values, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TICKET_RECIVE_TIME between", value1, value2, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderTicketReciveTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TICKET_RECIVE_TIME not between", value1, value2, "orderTicketReciveTime");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNull() {
            addCriterion("ORDER_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNotNull() {
            addCriterion("ORDER_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelEqualTo(String value) {
            addCriterion("ORDER_CHANNEL =", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotEqualTo(String value) {
            addCriterion("ORDER_CHANNEL <>", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThan(String value) {
            addCriterion("ORDER_CHANNEL >", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CHANNEL >=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThan(String value) {
            addCriterion("ORDER_CHANNEL <", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CHANNEL <=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLike(String value) {
            addCriterion("ORDER_CHANNEL like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotLike(String value) {
            addCriterion("ORDER_CHANNEL not like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIn(List<String> values) {
            addCriterion("ORDER_CHANNEL in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotIn(List<String> values) {
            addCriterion("ORDER_CHANNEL not in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelBetween(String value1, String value2) {
            addCriterion("ORDER_CHANNEL between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotBetween(String value1, String value2) {
            addCriterion("ORDER_CHANNEL not between", value1, value2, "orderChannel");
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