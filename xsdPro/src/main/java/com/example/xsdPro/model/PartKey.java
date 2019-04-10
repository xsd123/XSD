package com.example.xsdPro.model;

public class PartKey {
    private Integer companyId;

    private Integer branchId;

    private Integer partId;

    public PartKey(Integer companyId, Integer branchId, Integer partId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.partId = partId;
    }

    public PartKey() {
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

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }
}