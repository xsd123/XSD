package com.example.xsdPro.model;

public class PartClassKey {
    private Integer companyId;

    private Integer branchId;

    private Integer partClassId;

    public PartClassKey(Integer companyId, Integer branchId, Integer partClassId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.partClassId = partClassId;
    }

    public PartClassKey() {
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

    public Integer getPartClassId() {
        return partClassId;
    }

    public void setPartClassId(Integer partClassId) {
        this.partClassId = partClassId;
    }
}