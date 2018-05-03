package com.codido.hodor.model;

public class LotLottoBonus {
    private Long lottoBonusId;

    private Long lottoId;

    private String lottoBonusName;

    private String lottoBonusLevel;

    private String lottoBonusDesc;

    private String lottoBonusMemo;

    private String lottoBonusSts;

    public LotLottoBonus(Long lottoBonusId, Long lottoId, String lottoBonusName, String lottoBonusLevel, String lottoBonusDesc, String lottoBonusMemo, String lottoBonusSts) {
        this.lottoBonusId = lottoBonusId;
        this.lottoId = lottoId;
        this.lottoBonusName = lottoBonusName;
        this.lottoBonusLevel = lottoBonusLevel;
        this.lottoBonusDesc = lottoBonusDesc;
        this.lottoBonusMemo = lottoBonusMemo;
        this.lottoBonusSts = lottoBonusSts;
    }

    public LotLottoBonus() {
        super();
    }

    public Long getLottoBonusId() {
        return lottoBonusId;
    }

    public void setLottoBonusId(Long lottoBonusId) {
        this.lottoBonusId = lottoBonusId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getLottoBonusName() {
        return lottoBonusName;
    }

    public void setLottoBonusName(String lottoBonusName) {
        this.lottoBonusName = lottoBonusName == null ? null : lottoBonusName.trim();
    }

    public String getLottoBonusLevel() {
        return lottoBonusLevel;
    }

    public void setLottoBonusLevel(String lottoBonusLevel) {
        this.lottoBonusLevel = lottoBonusLevel == null ? null : lottoBonusLevel.trim();
    }

    public String getLottoBonusDesc() {
        return lottoBonusDesc;
    }

    public void setLottoBonusDesc(String lottoBonusDesc) {
        this.lottoBonusDesc = lottoBonusDesc == null ? null : lottoBonusDesc.trim();
    }

    public String getLottoBonusMemo() {
        return lottoBonusMemo;
    }

    public void setLottoBonusMemo(String lottoBonusMemo) {
        this.lottoBonusMemo = lottoBonusMemo == null ? null : lottoBonusMemo.trim();
    }

    public String getLottoBonusSts() {
        return lottoBonusSts;
    }

    public void setLottoBonusSts(String lottoBonusSts) {
        this.lottoBonusSts = lottoBonusSts == null ? null : lottoBonusSts.trim();
    }
}