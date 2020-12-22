package com.codido.hodor.core.model;

public class PubParam {
    private Long paramId;

    private String paramName;

    private String paramKey;

    private String paramValue;

    public PubParam(Long paramId, String paramName, String paramKey, String paramValue) {
        this.paramId = paramId;
        this.paramName = paramName;
        this.paramKey = paramKey;
        this.paramValue = paramValue;
    }

    public PubParam() {
        super();
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
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
}