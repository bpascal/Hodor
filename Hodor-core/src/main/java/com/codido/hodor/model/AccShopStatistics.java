package com.codido.hodor.model;

/**
 * 店铺首页信息查询
 */
public class AccShopStatistics {

    private long orderCount;//有多少个订单
    private long orderPiceSum;//订单的金额
    private long amtCount;//中奖的个数
    private long amtSum;//中奖总金额

    public AccShopStatistics() {
        super();
    }


    public AccShopStatistics(Long orderCount, Long orderPiceSum, Long amtCount, Long amtSum) {
        super();
        this.orderCount = orderCount == null ? 0 : orderCount;
        this.orderPiceSum = orderPiceSum == null ? 0 : orderPiceSum;
        this.amtCount = amtCount == null ? 0 : amtCount;
        this.amtSum = amtSum == null ? 0 : amtSum;
    }


    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }

    public long getOrderPiceSum() {
        return orderPiceSum;
    }

    public void setOrderPiceSum(long orderPiceSum) {
        this.orderPiceSum = orderPiceSum;
    }

    public long getAmtCount() {
        return amtCount;
    }

    public void setAmtCount(long amtCount) {
        this.amtCount = amtCount;
    }

    public long getAmtSum() {
        return amtSum;
    }

    public void setAmtSum(long amtSum) {
        this.amtSum = amtSum;
    }

    @Override
    public String toString() {
        return "AccShopStatistics{" +
                "orderCount=" + orderCount +
                ", orderPiceSum=" + orderPiceSum +
                ", amtCount=" + amtCount +
                ", amtSum=" + amtSum +
                '}';
    }
}
