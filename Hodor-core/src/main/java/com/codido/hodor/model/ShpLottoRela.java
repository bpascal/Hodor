package com.codido.hodor.model;

public class ShpLottoRela {
    private Long shopLottoRelaId;

    private Long shopId;

    private Long lottoId;

    private String lottoTradSts;

    private Integer lottoSort;

    private Integer shopLottoOrderCount;

    private Long shopLottoOrderAmt;

    public ShpLottoRela(Long shopLottoRelaId, Long shopId, Long lottoId, String lottoTradSts, Integer lottoSort, Integer shopLottoOrderCount, Long shopLottoOrderAmt) {
        this.shopLottoRelaId = shopLottoRelaId;
        this.shopId = shopId;
        this.lottoId = lottoId;
        this.lottoTradSts = lottoTradSts;
        this.lottoSort = lottoSort;
        this.shopLottoOrderCount = shopLottoOrderCount;
        this.shopLottoOrderAmt = shopLottoOrderAmt;
    }

    public ShpLottoRela() {
        super();
    }

    public Long getShopLottoRelaId() {
        return shopLottoRelaId;
    }

    public void setShopLottoRelaId(Long shopLottoRelaId) {
        this.shopLottoRelaId = shopLottoRelaId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getLottoTradSts() {
        return lottoTradSts;
    }

    public void setLottoTradSts(String lottoTradSts) {
        this.lottoTradSts = lottoTradSts == null ? null : lottoTradSts.trim();
    }

    public Integer getLottoSort() {
        return lottoSort;
    }

    public void setLottoSort(Integer lottoSort) {
        this.lottoSort = lottoSort;
    }

    public Integer getShopLottoOrderCount() {
        return shopLottoOrderCount;
    }

    public void setShopLottoOrderCount(Integer shopLottoOrderCount) {
        this.shopLottoOrderCount = shopLottoOrderCount;
    }

    public Long getShopLottoOrderAmt() {
        return shopLottoOrderAmt;
    }

    public void setShopLottoOrderAmt(Long shopLottoOrderAmt) {
        this.shopLottoOrderAmt = shopLottoOrderAmt;
    }
}