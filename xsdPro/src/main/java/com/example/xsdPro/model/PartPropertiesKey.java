package com.example.xsdPro.model;

public class PartPropertiesKey {
    private Integer companyId;

    private Integer branchId;

    private Integer partPropertiesId;

    public PartPropertiesKey(Integer companyId, Integer branchId, Integer partPropertiesId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.partPropertiesId = partPropertiesId;
    }

    public PartPropertiesKey() {
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

    public Integer getPartPropertiesId() {
        return partPropertiesId;
    }

    public void setPartPropertiesId(Integer partPropertiesId) {
        this.partPropertiesId = partPropertiesId;
    }
}