package com.codido.hodor.model;

public class PubParam {
    private Integer paramId;

    private String paramName;

    private String paramKey;

    private String paramValue;

    private String channelFlag;

    public PubParam(Integer paramId, String paramName, String paramKey, String paramValue, String channelFlag) {
        this.paramId = paramId;
        this.paramName = paramName;
        this.paramKey = paramKey;
        this.paramValue = paramValue;
        this.channelFlag = channelFlag;
    }

    public PubParam() {
        super();
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey == null ? null : paramKey.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getChannelFlag() {
        return channelFlag;
    }

    public void setChannelFlag(String channelFlag) {
        this.channelFlag = channelFlag == null ? null : channelFlag.trim();
    }
}