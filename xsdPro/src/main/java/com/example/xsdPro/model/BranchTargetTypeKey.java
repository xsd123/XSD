package com.example.xsdPro.model;

public class BranchTargetTypeKey {
    private Integer companyId;

    private Integer branchId;

    private Integer tYear;

    private Integer tMonth;

    private Integer id;

    public BranchTargetTypeKey(Integer companyId, Integer branchId, Integer tYear, Integer tMonth, Integer id) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.tYear = tYear;
        this.tMonth = tMonth;
        this.id = id;
    }

    public BranchTargetTypeKey() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}