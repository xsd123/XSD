package com.example.xsdPro.model;

public class PersonTargetKey {
    private Integer companyId;

    private Integer branchId;

    private Integer personId;

    private Integer tYear;

    private Integer tMonth;

    public PersonTargetKey(Integer companyId, Integer branchId, Integer personId, Integer tYear, Integer tMonth) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.personId = personId;
        this.tYear = tYear;
        this.tMonth = tMonth;
    }

    public PersonTargetKey() {
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

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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