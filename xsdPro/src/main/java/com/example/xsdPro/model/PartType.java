package com.example.xsdPro.model;

import java.util.Date;

public class PartType extends PartTypeKey {
    private String partTypeCode;

    private String partTypeName;

    private String remark;

    private Integer insPersonId;

    private Date insDate;

    public PartType(Integer companyId, Integer branchId, Integer partTypeId, String partTypeCode, String partTypeName, String remark, Integer insPersonId, Date insDate) {
        super(companyId, branchId, partTypeId);
        this.partTypeCode = partTypeCode;
        this.partTypeName = partTypeName;
        this.remark = remark;
        this.insPersonId = insPersonId;
        this.insDate = insDate;
    }

    public PartType() {
        super();
    }

    public String getPartTypeCode() {
        return partTypeCode;
    }

    public void setPartTypeCode(String partTypeCode) {
        this.partTypeCode = partTypeCode == null ? null : partTypeCode.trim();
    }

    public String getPartTypeName() {
        return partTypeName;
    }

    public void setPartTypeName(String partTypeName) {
        this.partTypeName = partTypeName == null ? null : partTypeName.trim();
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