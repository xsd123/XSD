package com.example.xsdPro.model;

public class UserKey {
    private Integer companyId;

    private String userCode;

    public UserKey(Integer companyId, String userCode) {
        this.companyId = companyId;
        this.userCode = userCode;
    }

    public UserKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }
}