package com.example.xsdPro.model;

public class RolePersonKey {
    private Integer companyId;

    private Integer roleId;

    private String userCode;

    public RolePersonKey(Integer companyId, Integer roleId, String userCode) {
        this.companyId = companyId;
        this.roleId = roleId;
        this.userCode = userCode;
    }

    public RolePersonKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }
}