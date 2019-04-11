package com.example.xsdPro.model;

import org.hibernate.validator.constraints.NotEmpty;


public class UserKey {
    private Integer companyId;

    @NotEmpty(message="用户名不能为空！")
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