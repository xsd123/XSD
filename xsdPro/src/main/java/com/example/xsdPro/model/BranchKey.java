package com.example.xsdPro.model;

public class BranchKey {
    private Integer companyId;

    private Integer branchId;

    public BranchKey(Integer companyId, Integer branchId) {
        this.companyId = companyId;
        this.branchId = branchId;
    }

    public BranchKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}