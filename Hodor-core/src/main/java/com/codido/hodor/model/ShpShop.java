package com.codido.hodor.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShpShop {
    private Long shopId;

    private String shopName;

    private String shopDesc;

    private Long shopOwnerId;

    private String shopIconUrl;

    private String shopMblNo;

    private String shopWxId;

    private String shopAlipayId;

    private String shopQrcodeUrl;

    private String shopSlogen1;

    private String shopSlogen2;

    private String shopType;

    private Long shopMainLottoId;

    private Long shopSubLottoId;

    private Integer shopUserCount;

    private Integer shopTotalOrderCount;

    private Long shopTotalOrderAmt;

    private Integer shopTotalBounsCount;

    private Long shopTotalBounsAmt;

    private BigDecimal shopTotalCommission;

    private String shopAddress;

    private String shopSts;

    private String shopTradSts;

    private Date shopTradBeginTime;

    private Date shopTradEndTime;

    private BigDecimal shopTradRate;

    private String shopChannal;

    public ShpShop(Long shopId, String shopName, String shopDesc, Long shopOwnerId, String shopIconUrl, String shopMblNo, String shopWxId, String shopAlipayId, String shopQrcodeUrl, String shopSlogen1, String shopSlogen2, String shopType, Long shopMainLottoId, Long shopSubLottoId, Integer shopUserCount, Integer shopTotalOrderCount, Long shopTotalOrderAmt, Integer shopTotalBounsCount, Long shopTotalBounsAmt, BigDecimal shopTotalCommission, String shopAddress, String shopSts, String shopTradSts, Date shopTradBeginTime, Date shopTradEndTime, BigDecimal shopTradRate, String shopChannal) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopDesc = shopDesc;
        this.shopOwnerId = shopOwnerId;
        this.shopIconUrl = shopIconUrl;
        this.shopMblNo = shopMblNo;
        this.shopWxId = shopWxId;
        this.shopAlipayId = shopAlipayId;
        this.shopQrcodeUrl = shopQrcodeUrl;
        this.shopSlogen1 = shopSlogen1;
        this.shopSlogen2 = shopSlogen2;
        this.shopType = shopType;
        this.shopMainLottoId = shopMainLottoId;
        this.shopSubLottoId = shopSubLottoId;
        this.shopUserCount = shopUserCount;
        this.shopTotalOrderCount = shopTotalOrderCount;
        this.shopTotalOrderAmt = shopTotalOrderAmt;
        this.shopTotalBounsCount = shopTotalBounsCount;
        this.shopTotalBounsAmt = shopTotalBounsAmt;
        this.shopTotalCommission = shopTotalCommission;
        this.shopAddress = shopAddress;
        this.shopSts = shopSts;
        this.shopTradSts = shopTradSts;
        this.shopTradBeginTime = shopTradBeginTime;
        this.shopTradEndTime = shopTradEndTime;
        this.shopTradRate = shopTradRate;
        this.shopChannal = shopChannal;
    }

    public ShpShop() {
        super();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc == null ? null : shopDesc.trim();
    }

    public Long getShopOwnerId() {
        return shopOwnerId;
    }

    public void setShopOwnerId(Long shopOwnerId) {
        this.shopOwnerId = shopOwnerId;
    }

    public String getShopIconUrl() {
        return shopIconUrl;
    }

    public void setShopIconUrl(String shopIconUrl) {
        this.shopIconUrl = shopIconUrl == null ? null : shopIconUrl.trim();
    }

    public String getShopMblNo() {
        return shopMblNo;
    }

    public void setShopMblNo(String shopMblNo) {
        this.shopMblNo = shopMblNo == null ? null : shopMblNo.trim();
    }

    public String getShopWxId() {
        return shopWxId;
    }

    public void setShopWxId(String shopWxId) {
        this.shopWxId = shopWxId == null ? null : shopWxId.trim();
    }

    public String getShopAlipayId() {
        return shopAlipayId;
    }

    public void setShopAlipayId(String shopAlipayId) {
        this.shopAlipayId = shopAlipayId == null ? null : shopAlipayId.trim();
    }

    public String getShopQrcodeUrl() {
        return shopQrcodeUrl;
    }

    public void setShopQrcodeUrl(String shopQrcodeUrl) {
        this.shopQrcodeUrl = shopQrcodeUrl == null ? null : shopQrcodeUrl.trim();
    }

    public String getShopSlogen1() {
        return shopSlogen1;
    }

    public void setShopSlogen1(String shopSlogen1) {
        this.shopSlogen1 = shopSlogen1 == null ? null : shopSlogen1.trim();
    }

    public String getShopSlogen2() {
        return shopSlogen2;
    }

    public void setShopSlogen2(String shopSlogen2) {
        this.shopSlogen2 = shopSlogen2 == null ? null : shopSlogen2.trim();
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public Long getShopMainLottoId() {
        return shopMainLottoId;
    }

    public void setShopMainLottoId(Long shopMainLottoId) {
        this.shopMainLottoId = shopMainLottoId;
    }

    public Long getShopSubLottoId() {
        return shopSubLottoId;
    }

    public void setShopSubLottoId(Long shopSubLottoId) {
        this.shopSubLottoId = shopSubLottoId;
    }

    public Integer getShopUserCount() {
        return shopUserCount;
    }

    public void setShopUserCount(Integer shopUserCount) {
        this.shopUserCount = shopUserCount;
    }

    public Integer getShopTotalOrderCount() {
        return shopTotalOrderCount;
    }

    public void setShopTotalOrderCount(Integer shopTotalOrderCount) {
        this.shopTotalOrderCount = shopTotalOrderCount;
    }

    public Long getShopTotalOrderAmt() {
        return shopTotalOrderAmt;
    }

    public void setShopTotalOrderAmt(Long shopTotalOrderAmt) {
        this.shopTotalOrderAmt = shopTotalOrderAmt;
    }

    public Integer getShopTotalBounsCount() {
        return shopTotalBounsCount;
    }

    public void setShopTotalBounsCount(Integer shopTotalBounsCount) {
        this.shopTotalBounsCount = shopTotalBounsCount;
    }

    public Long getShopTotalBounsAmt() {
        return shopTotalBounsAmt;
    }

    public void setShopTotalBounsAmt(Long shopTotalBounsAmt) {
        this.shopTotalBounsAmt = shopTotalBounsAmt;
    }

    public BigDecimal getShopTotalCommission() {
        return shopTotalCommission;
    }

    public void setShopTotalCommission(BigDecimal shopTotalCommission) {
        this.shopTotalCommission = shopTotalCommission;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopSts() {
        return shopSts;
    }

    public void setShopSts(String shopSts) {
        this.shopSts = shopSts == null ? null : shopSts.trim();
    }

    public String getShopTradSts() {
        return shopTradSts;
    }

    public void setShopTradSts(String shopTradSts) {
        this.shopTradSts = shopTradSts == null ? null : shopTradSts.trim();
    }

    public Date getShopTradBeginTime() {
        return shopTradBeginTime;
    }

    public void setShopTradBeginTime(Date shopTradBeginTime) {
        this.shopTradBeginTime = shopTradBeginTime;
    }

    public Date getShopTradEndTime() {
        return shopTradEndTime;
    }

    public void setShopTradEndTime(Date shopTradEndTime) {
        this.shopTradEndTime = shopTradEndTime;
    }

    public BigDecimal getShopTradRate() {
        return shopTradRate;
    }

    public void setShopTradRate(BigDecimal shopTradRate) {
        this.shopTradRate = shopTradRate;
    }

    public String getShopChannal() {
        return shopChannal;
    }

    public void setShopChannal(String shopChannal) {
        this.shopChannal = shopChannal == null ? null : shopChannal.trim();
    }
}