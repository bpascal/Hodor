package com.codido.hodor.model;

import java.util.Date;

public class OrdSendMsgRec {
    private Long sendmsgRecId;

    private String orderNo;

    private String openId;

    private String templateId;

    private String formId;

    private String sendReqUrl;

    private Date sendMsgTime;

    private String sendMsgSts;

    private String sendMsgPara;

    private String sendMsgRet;

    public OrdSendMsgRec(Long sendmsgRecId, String orderNo, String openId, String templateId, String formId, String sendReqUrl, Date sendMsgTime, String sendMsgSts, String sendMsgPara, String sendMsgRet) {
        this.sendmsgRecId = sendmsgRecId;
        this.orderNo = orderNo;
        this.openId = openId;
        this.templateId = templateId;
        this.formId = formId;
        this.sendReqUrl = sendReqUrl;
        this.sendMsgTime = sendMsgTime;
        this.sendMsgSts = sendMsgSts;
        this.sendMsgPara = sendMsgPara;
        this.sendMsgRet = sendMsgRet;
    }

    public OrdSendMsgRec() {
        super();
    }

    public Long getSendmsgRecId() {
        return sendmsgRecId;
    }

    public void setSendmsgRecId(Long sendmsgRecId) {
        this.sendmsgRecId = sendmsgRecId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    public String getSendReqUrl() {
        return sendReqUrl;
    }

    public void setSendReqUrl(String sendReqUrl) {
        this.sendReqUrl = sendReqUrl == null ? null : sendReqUrl.trim();
    }

    public Date getSendMsgTime() {
        return sendMsgTime;
    }

    public void setSendMsgTime(Date sendMsgTime) {
        this.sendMsgTime = sendMsgTime;
    }

    public String getSendMsgSts() {
        return sendMsgSts;
    }

    public void setSendMsgSts(String sendMsgSts) {
        this.sendMsgSts = sendMsgSts == null ? null : sendMsgSts.trim();
    }

    public String getSendMsgPara() {
        return sendMsgPara;
    }

    public void setSendMsgPara(String sendMsgPara) {
        this.sendMsgPara = sendMsgPara == null ? null : sendMsgPara.trim();
    }

    public String getSendMsgRet() {
        return sendMsgRet;
    }

    public void setSendMsgRet(String sendMsgRet) {
        this.sendMsgRet = sendMsgRet == null ? null : sendMsgRet.trim();
    }
}