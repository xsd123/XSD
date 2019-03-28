package com.example.xsdPro.model;

public class RoleRangeKey {
    private Integer companyId;

    private Integer roleId;

    private Integer branchId;

    public RoleRangeKey(Integer companyId, Integer roleId, Integer branchId) {
        this.companyId = companyId;
        this.roleId = roleId;
        this.branchId = branchId;
    }

    public RoleRangeKey() {
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

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}