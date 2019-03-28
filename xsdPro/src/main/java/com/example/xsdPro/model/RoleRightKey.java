package com.example.xsdPro.model;

public class RoleRightKey {
    private Integer companyId;

    private Integer roleId;

    private Integer moduleId;

    public RoleRightKey(Integer companyId, Integer roleId, Integer moduleId) {
        this.companyId = companyId;
        this.roleId = roleId;
        this.moduleId = moduleId;
    }

    public RoleRightKey() {
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

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}