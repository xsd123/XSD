package com.example.xsdPro.model;

public class PartTypeKey {
    private Integer companyId;

    private Integer branchId;

    private Integer partTypeId;

    public PartTypeKey(Integer companyId, Integer branchId, Integer partTypeId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.partTypeId = partTypeId;
    }

    public PartTypeKey() {
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

    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }
}