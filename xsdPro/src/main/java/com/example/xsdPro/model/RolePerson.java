package com.example.xsdPro.model;

import java.util.Date;

public class RolePerson extends RolePersonKey {
    private String insPersonName;

    private Date insDate;

    public RolePerson(Integer companyId, Integer roleId, String userCode, String insPersonName, Date insDate) {
        super(companyId, roleId, userCode);
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public RolePerson() {
        super();
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
}