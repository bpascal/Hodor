package com.codido.hodor.model;

public class LotInstMatchOP {
    private Long lotInstMatchId;

    private Long lottoInstId;

    private Long matchId;

    private Integer matchSort;

    private String lotInstMatchSts;

    private String lotInstMatchResult;

    private LotMatch lotMatch;

    public LotInstMatchOP(Long lotInstMatchId, Long lottoInstId, Long matchId, Integer matchSort, String lotInstMatchSts, String lotInstMatchResult) {
        this.lotInstMatchId = lotInstMatchId;
        this.lottoInstId = lottoInstId;
        this.matchId = matchId;
        this.matchSort = matchSort;
        this.lotInstMatchSts = lotInstMatchSts;
        this.lotInstMatchResult = lotInstMatchResult;
    }

    public LotInstMatchOP() {
        super();
    }

    public Long getLotInstMatchId() {
        return lotInstMatchId;
    }

    public void setLotInstMatchId(Long lotInstMatchId) {
        this.lotInstMatchId = lotInstMatchId;
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getMatchSort() {
        return matchSort;
    }

    public void setMatchSort(Integer matchSort) {
        this.matchSort = matchSort;
    }

    public String getLotInstMatchSts() {
        return lotInstMatchSts;
    }

    public void setLotInstMatchSts(String lotInstMatchSts) {
        this.lotInstMatchSts = lotInstMatchSts == null ? null : lotInstMatchSts.trim();
    }

    public String getLotInstMatchResult() {
        return lotInstMatchResult;
    }

    public void setLotInstMatchResult(String lotInstMatchResult) {
        this.lotInstMatchResult = lotInstMatchResult == null ? null : lotInstMatchResult.trim();
    }

    public LotMatch getLotMatch() {
        return lotMatch;
    }

    public void setLotMatch(LotMatch lotMatch) {
        this.lotMatch = lotMatch;
    }
}