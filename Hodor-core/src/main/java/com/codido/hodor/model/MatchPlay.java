package com.codido.hodor.model;

public class MatchPlay {
    private Long matchPlayId;

    private String playName;

    private Long playLottoId;

    private String playCode;

    public MatchPlay(Long matchPlayId, String playName, Long playLottoId, String playCode) {
        this.matchPlayId = matchPlayId;
        this.playName = playName;
        this.playLottoId = playLottoId;
        this.playCode = playCode;
    }

    public MatchPlay() {
        super();
    }

    public Long getMatchPlayId() {
        return matchPlayId;
    }

    public void setMatchPlayId(Long matchPlayId) {
        this.matchPlayId = matchPlayId;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName == null ? null : playName.trim();
    }

    public Long getPlayLottoId() {
        return playLottoId;
    }

    public void setPlayLottoId(Long playLottoId) {
        this.playLottoId = playLottoId;
    }

    public String getPlayCode() {
        return playCode;
    }

    public void setPlayCode(String playCode) {
        this.playCode = playCode == null ? null : playCode.trim();
    }
}