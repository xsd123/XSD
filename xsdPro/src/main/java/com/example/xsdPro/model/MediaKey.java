package com.example.xsdPro.model;

public class MediaKey {
    private Integer mediaId;

    private Integer companyId;

    public MediaKey(Integer mediaId, Integer companyId) {
        this.mediaId = mediaId;
        this.companyId = companyId;
    }

    public MediaKey() {
        super();
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}