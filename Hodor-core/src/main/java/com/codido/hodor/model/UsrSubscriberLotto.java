package com.codido.hodor.model;

import java.util.Date;

public class UsrSubscriberLotto {
    private Long usrSubscribLottoId;

    private Long userId;

    private Long lottoId;

    private String subscribSts;

    private Date subscribTme;

    private Date unsubscribTme;

    public UsrSubscriberLotto(Long usrSubscribLottoId, Long userId, Long lottoId, String subscribSts, Date subscribTme, Date unsubscribTme) {
        this.usrSubscribLottoId = usrSubscribLottoId;
        this.userId = userId;
        this.lottoId = lottoId;
        this.subscribSts = subscribSts;
        this.subscribTme = subscribTme;
        this.unsubscribTme = unsubscribTme;
    }

    public UsrSubscriberLotto() {
        super();
    }

    public Long getUsrSubscribLottoId() {
        return usrSubscribLottoId;
    }

    public void setUsrSubscribLottoId(Long usrSubscribLottoId) {
        this.usrSubscribLottoId = usrSubscribLottoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLottoId() {
        return lottoId;
    }

    public void setLottoId(Long lottoId) {
        this.lottoId = lottoId;
    }

    public String getSubscribSts() {
        return subscribSts;
    }

    public void setSubscribSts(String subscribSts) {
        this.subscribSts = subscribSts == null ? null : subscribSts.trim();
    }

    public Date getSubscribTme() {
        return subscribTme;
    }

    public void setSubscribTme(Date subscribTme) {
        this.subscribTme = subscribTme;
    }

    public Date getUnsubscribTme() {
        return unsubscribTme;
    }

    public void setUnsubscribTme(Date unsubscribTme) {
        this.unsubscribTme = unsubscribTme;
    }
}