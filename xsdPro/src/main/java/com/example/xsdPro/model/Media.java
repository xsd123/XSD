package com.example.xsdPro.model;

public class Media {
    private Integer mediaId;

    private String mediaName;

    public Media(Integer mediaId, String mediaName) {
        this.mediaId = mediaId;
        this.mediaName = mediaName;
    }

    public Media() {
        super();
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName == null ? null : mediaName.trim();
    }
}