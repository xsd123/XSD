package com.example.xsdPro.model;

public class RoleKey {
    private Integer roleId;

    private Integer companyId;

    public RoleKey(Integer roleId, Integer companyId) {
        this.roleId = roleId;
        this.companyId = companyId;
    }

    public RoleKey() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}