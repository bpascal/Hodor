package com.codido.hodor.model;

public class UsrTag {
    private Long tagId;

    private String tagName;

    private String tagDesc;

    private String tagSts;

    public UsrTag(Long tagId, String tagName, String tagDesc, String tagSts) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.tagDesc = tagDesc;
        this.tagSts = tagSts;
    }

    public UsrTag() {
        super();
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    public String getTagSts() {
        return tagSts;
    }

    public void setTagSts(String tagSts) {
        this.tagSts = tagSts == null ? null : tagSts.trim();
    }
}