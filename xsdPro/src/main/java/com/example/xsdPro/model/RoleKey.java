package com.example.xsdPro.model;

public class RoleKey {
    private Integer companyId;

    private Integer roleId;

    public RoleKey(Integer companyId, Integer roleId) {
        this.companyId = companyId;
        this.roleId = roleId;
    }

    public RoleKey() {
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
}