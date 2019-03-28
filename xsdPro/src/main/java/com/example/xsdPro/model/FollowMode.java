package com.example.xsdPro.model;

public class FollowMode {
    private Integer followModeId;

    private String followMode;

    private String remark;

    public FollowMode(Integer followModeId, String followMode, String remark) {
        this.followModeId = followModeId;
        this.followMode = followMode;
        this.remark = remark;
    }

    public FollowMode() {
        super();
    }

    public Integer getFollowModeId() {
        return followModeId;
    }

    public void setFollowModeId(Integer followModeId) {
        this.followModeId = followModeId;
    }

    public String getFollowMode() {
        return followMode;
    }

    public void setFollowMode(String followMode) {
        this.followMode = followMode == null ? null : followMode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}