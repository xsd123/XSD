package com.example.xsdPro.model;

import java.util.Date;

public class PartClass extends PartClassKey {
    private String partClassCode;

    private String partClassName;

    private String remark;

    private Integer insPersonId;

    private Date insDate;

    public PartClass(Integer companyId, Integer branchId, Integer partClassId, String partClassCode, String partClassName, String remark, Integer insPersonId, Date insDate) {
        super(companyId, branchId, partClassId);
        this.partClassCode = partClassCode;
        this.partClassName = partClassName;
        this.remark = remark;
        this.insPersonId = insPersonId;
        this.insDate = insDate;
    }

    public PartClass() {
        super();
    }

    public String getPartClassCode() {
        return partClassCode;
    }

    public void setPartClassCode(String partClassCode) {
        this.partClassCode = partClassCode == null ? null : partClassCode.trim();
    }

    public String getPartClassName() {
        return partClassName;
    }

    public void setPartClassName(String partClassName) {
        this.partClassName = partClassName == null ? null : partClassName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getInsPersonId() {
        return insPersonId;
    }

    public void setInsPersonId(Integer insPersonId) {
        this.insPersonId = insPersonId;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }
}