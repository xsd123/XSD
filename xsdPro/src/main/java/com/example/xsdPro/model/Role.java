package com.example.xsdPro.model;

import java.util.Date;

public class Role extends RoleKey {
    private String roleCode;

    private String roleName;

    private Integer statue;

    private String insPersonName;

    private Date insDate;

    private String remark;

    public Role(Integer companyId, Integer roleId, String roleCode, String roleName, Integer statue, String insPersonName, Date insDate, String remark) {
        super(companyId, roleId);
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.statue = statue;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.remark = remark;
    }

    public Role() {
        super();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public String getInsPersonName() {
        return insPersonName;
    }

    public void setInsPersonName(String insPersonName) {
        this.insPersonName = insPersonName == null ? null : insPersonName.trim();
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}