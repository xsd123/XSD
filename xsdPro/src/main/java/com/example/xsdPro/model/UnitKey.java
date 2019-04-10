package com.example.xsdPro.model;

public class UnitKey {
    private Integer companyId;

    private Integer unitId;

    public UnitKey(Integer companyId, Integer unitId) {
        this.companyId = companyId;
        this.unitId = unitId;
    }

    public UnitKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }
}