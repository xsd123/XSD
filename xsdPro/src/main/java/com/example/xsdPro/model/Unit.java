package com.example.xsdPro.model;

import java.util.Date;

public class Unit extends UnitKey {
    private String unitCode;

    private String unitName;

    private String remark;

    private String insPersonName;

    private Date insDate;

    public Unit(Integer companyId, Integer unitId, String unitCode, String unitName, String remark, String insPersonName, Date insDate) {
        super(companyId, unitId);
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public Unit() {
        super();
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInsPersonName() {
        return insPersonName;
    }

    public void setInsPersonName(String insPersonName) {
        this.insPersonName = insPersonName == null ? null : insPersonName.trim();
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }
}