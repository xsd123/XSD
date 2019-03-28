package com.example.xsdPro.model;

import java.util.Date;

public class WorkType extends WorkTypeKey {
    private String typeCode;

    private String typeName;

    private String remark;

    private String insPersonName;

    private Date insDate;

    public WorkType(Integer companyId, Integer typeId, String typeCode, String typeName, String remark, String insPersonName, Date insDate) {
        super(companyId, typeId);
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public WorkType() {
        super();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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