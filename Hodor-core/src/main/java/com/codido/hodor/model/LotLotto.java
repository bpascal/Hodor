package com.codido.hodor.model;

import java.util.Date;

public class LotLotto {
    private Long lottoId;

    private String lottoName;

    private String lottoDesc;

    private String lottoOwner;

    private String lottoShotValue;

    private String lottoIconUrl;

    private String lottoBackgroundUrl;

    private String lottoSts;

    private String lottoType;

    private String lottoPublishDay;

    private Date lottoPublishTime;

    private Long lastLottoInstId;

    public LotLotto(Long lottoId, String lottoName, String lottoDesc, String lottoOwner, String lottoShotValue, String lottoIconUrl, String lottoBackgroundUrl, String lottoSts, String lottoType, String lottoPublishDay, Date lottoPublishTime, Long lastLottoInstId) {
        this.lottoId = lottoId;
        this.lottoName = lottoName;
        this.lottoDesc = lottoDesc;
        this.lottoOwner = lottoOwner;
        this.lottoShotValue = lottoShotValue;
        this.lottoIconUrl = lottoIconUrl;
        this.lottoBackgroundUrl = lottoBackgroundUrl;
        this.lottoSts = lottoSts;
        this.lottoType = lottoType;
        this.lottoPublishDay = lottoPublishDay;
        this.lottoPublishTime = lottoPublishTime;
        this.lastLottoInstId = lastLottoInstId;
    }

    public LotLotto() {
        super();
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getLottoName() {
        return lottoName;
    }

    public void setLottoName(String lottoName) {
        this.lottoName = lottoName == null ? null : lottoName.trim();
    }

    public String getLottoDesc() {
        return lottoDesc;
    }

    public void setLottoDesc(String lottoDesc) {
        this.lottoDesc = lottoDesc == null ? null : lottoDesc.trim();
    }

    public String getLottoOwner() {
        return lottoOwner;
    }

    public void setLottoOwner(String lottoOwner) {
        this.lottoOwner = lottoOwner == null ? null : lottoOwner.trim();
    }

    public String getLottoShotValue() {
        return lottoShotValue;
    }

    public void setLottoShotValue(String lottoShotValue) {
        this.lottoShotValue = lottoShotValue == null ? null : lottoShotValue.trim();
    }

    public String getLottoIconUrl() {
        return lottoIconUrl;
    }

    public void setLottoIconUrl(String lottoIconUrl) {
        this.lottoIconUrl = lottoIconUrl == null ? null : lottoIconUrl.trim();
    }

    public String getLottoBackgroundUrl() {
        return lottoBackgroundUrl;
    }

    public void setLottoBackgroundUrl(String lottoBackgroundUrl) {
        this.lottoBackgroundUrl = lottoBackgroundUrl == null ? null : lottoBackgroundUrl.trim();
    }

    public String getLottoSts() {
        return lottoSts;
    }

    public void setLottoSts(String lottoSts) {
        this.lottoSts = lottoSts == null ? null : lottoSts.trim();
    }

    public String getLottoType() {
        return lottoType;
    }

    public void setLottoType(String lottoType) {
        this.lottoType = lottoType == null ? null : lottoType.trim();
    }

    public String getLottoPublishDay() {
        return lottoPublishDay;
    }

    public void setLottoPublishDay(String lottoPublishDay) {
        this.lottoPublishDay = lottoPublishDay == null ? null : lottoPublishDay.trim();
    }

    public Date getLottoPublishTime() {
        return lottoPublishTime;
    }

    public void setLottoPublishTime(Date lottoPublishTime) {
        this.lottoPublishTime = lottoPublishTime;
    }

    public Long getLastLottoInstId() {
        return lastLottoInstId;
    }

    public void setLastLottoInstId(Long lastLottoInstId) {
        this.lastLottoInstId = lastLottoInstId;
    }
}