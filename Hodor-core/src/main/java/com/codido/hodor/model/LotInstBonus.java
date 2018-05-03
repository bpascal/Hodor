package com.codido.hodor.model;

public class LotInstBonus {
    private Long bonusId;

    private Long lottoInstId;

    private Long lottoBonusId;

    private String bonusName;

    private String bonusLevel;

    private String bonusCount;

    private String bonusPreAmt;

    public LotInstBonus(Long bonusId, Long lottoInstId, Long lottoBonusId, String bonusName, String bonusLevel, String bonusCount, String bonusPreAmt) {
        this.bonusId = bonusId;
        this.lottoInstId = lottoInstId;
        this.lottoBonusId = lottoBonusId;
        this.bonusName = bonusName;
        this.bonusLevel = bonusLevel;
        this.bonusCount = bonusCount;
        this.bonusPreAmt = bonusPreAmt;
    }

    public LotInstBonus() {
        super();
    }

    public Long getBonusId() {
        return bonusId;
    }

    public void setBonusId(Long bonusId) {
        this.bonusId = bonusId;
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getLottoBonusId() {
        return lottoBonusId;
    }

    public void setLottoBonusId(Long lottoBonusId) {
        this.lottoBonusId = lottoBonusId;
    }

    public String getBonusName() {
        return bonusName;
    }

    public void setBonusName(String bonusName) {
        this.bonusName = bonusName == null ? null : bonusName.trim();
    }

    public String getBonusLevel() {
        return bonusLevel;
    }

    public void setBonusLevel(String bonusLevel) {
        this.bonusLevel = bonusLevel == null ? null : bonusLevel.trim();
    }

    public String getBonusCount() {
        return bonusCount;
    }

    public void setBonusCount(String bonusCount) {
        this.bonusCount = bonusCount == null ? null : bonusCount.trim();
    }

    public String getBonusPreAmt() {
        return bonusPreAmt;
    }

    public void setBonusPreAmt(String bonusPreAmt) {
        this.bonusPreAmt = bonusPreAmt == null ? null : bonusPreAmt.trim();
    }
}