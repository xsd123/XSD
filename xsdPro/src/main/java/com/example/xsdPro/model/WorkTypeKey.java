package com.example.xsdPro.model;

public class WorkTypeKey {
    private Integer companyId;

    private Integer typeId;

    public WorkTypeKey(Integer companyId, Integer typeId) {
        this.companyId = companyId;
        this.typeId = typeId;
    }

    public WorkTypeKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}