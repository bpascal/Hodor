package com.codido.hodor.model;

public class UsrShopRela {
    private Long usrShopRelaId;

    private Long userId;

    private Long shopId;

    private String shopType;

    private String usrShopRelaSts;

    private Integer usrShopRelaSort;

    public UsrShopRela(Long usrShopRelaId, Long userId, Long shopId, String shopType, String usrShopRelaSts, Integer usrShopRelaSort) {
        this.usrShopRelaId = usrShopRelaId;
        this.userId = userId;
        this.shopId = shopId;
        this.shopType = shopType;
        this.usrShopRelaSts = usrShopRelaSts;
        this.usrShopRelaSort = usrShopRelaSort;
    }

    public UsrShopRela() {
        super();
    }

    public Long getUsrShopRelaId() {
        return usrShopRelaId;
    }

    public void setUsrShopRelaId(Long usrShopRelaId) {
        this.usrShopRelaId = usrShopRelaId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getUsrShopRelaSts() {
        return usrShopRelaSts;
    }

    public void setUsrShopRelaSts(String usrShopRelaSts) {
        this.usrShopRelaSts = usrShopRelaSts == null ? null : usrShopRelaSts.trim();
    }

    public Integer getUsrShopRelaSort() {
        return usrShopRelaSort;
    }

    public void setUsrShopRelaSort(Integer usrShopRelaSort) {
        this.usrShopRelaSort = usrShopRelaSort;
    }
}