package com.example.xsdPro.model;

public class BranchTargetKey {
    private Integer companyId;

    private Integer branchId;

    private Integer tYear;

    private Integer tMonth;

    public BranchTargetKey(Integer companyId, Integer branchId, Integer tYear, Integer tMonth) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.tYear = tYear;
        this.tMonth = tMonth;
    }

    public BranchTargetKey() {
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

    public Integer gettYear() {
        return tYear;
    }

    public void settYear(Integer tYear) {
        this.tYear = tYear;
    }

    public Integer gettMonth() {
        return tMonth;
    }

    public void settMonth(Integer tMonth) {
        this.tMonth = tMonth;
    }
}