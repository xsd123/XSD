package com.example.xsdPro.model;

public class Media extends MediaKey {
    private String mediaCode;

    private String mediaName;

    public Media(Integer mediaId, Integer companyId, String mediaCode, String mediaName) {
        super(mediaId, companyId);
        this.mediaCode = mediaCode;
        this.mediaName = mediaName;
    }

    public Media() {
        super();
    }

    public String getMediaCode() {
        return mediaCode;
    }

    public void setMediaCode(String mediaCode) {
        this.mediaCode = mediaCode == null ? null : mediaCode.trim();
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName == null ? null : mediaName.trim();
    }
}