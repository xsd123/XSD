package com.example.xsdPro.model;

import java.util.Date;

public class PartProperties extends PartPropertiesKey {
    private String partPropertiesCode;

    private String partPropertiesName;

    private String remark;

    private Integer insPersonId;

    private Date insDate;

    public PartProperties(Integer companyId, Integer branchId, Integer partPropertiesId, String partPropertiesCode, String partPropertiesName, String remark, Integer insPersonId, Date insDate) {
        super(companyId, branchId, partPropertiesId);
        this.partPropertiesCode = partPropertiesCode;
        this.partPropertiesName = partPropertiesName;
        this.remark = remark;
        this.insPersonId = insPersonId;
        this.insDate = insDate;
    }

    public PartProperties() {
        super();
    }

    public String getPartPropertiesCode() {
        return partPropertiesCode;
    }

    public void setPartPropertiesCode(String partPropertiesCode) {
        this.partPropertiesCode = partPropertiesCode == null ? null : partPropertiesCode.trim();
    }

    public String getPartPropertiesName() {
        return partPropertiesName;
    }

    public void setPartPropertiesName(String partPropertiesName) {
        this.partPropertiesName = partPropertiesName == null ? null : partPropertiesName.trim();
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