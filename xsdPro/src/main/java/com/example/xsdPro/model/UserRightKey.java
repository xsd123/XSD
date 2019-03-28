package com.example.xsdPro.model;

public class UserRightKey {
    private Integer companyId;

    private String userCode;

    private Integer moduleId;

    public UserRightKey(Integer companyId, String userCode, Integer moduleId) {
        this.companyId = companyId;
        this.userCode = userCode;
        this.moduleId = moduleId;
    }

    public UserRightKey() {
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

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}