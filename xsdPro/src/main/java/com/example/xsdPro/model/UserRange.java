package com.example.xsdPro.model;

import java.util.Date;

public class UserRange extends UserRangeKey {
    private String insPersonName;

    private Date insDate;

    public UserRange(Integer companyId, String userCode, Integer branchId, String insPersonName, Date insDate) {
        super(companyId, userCode, branchId);
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public UserRange() {
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