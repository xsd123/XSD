package com.example.xsdPro.model;

import java.util.Date;

public class RoleRange extends RoleRangeKey {
    private String insPersonName;

    private Date insDate;

    public RoleRange(Integer companyId, Integer roleId, Integer branchId, String insPersonName, Date insDate) {
        super(companyId, roleId, branchId);
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public RoleRange() {
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