package com.codido.hodor.model;

public class LotInstOP {
    private Long lottoInstId;

    private Long lottoId;

    public LotInstOP(Long lottoInstId, Long lottoId) {
        this.lottoInstId = lottoInstId;
        this.lottoId = lottoId;
    }

    public LotInstOP() {
        super();
    }

    public Long getLottoInstId() {
        return lottoInstId;
    }

    public void setLottoInstId(Long lottoInstId) {
        this.lottoInstId = lottoInstId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }
}