package com.example.xsdPro.model;

import java.util.Date;

public class Branch extends BranchKey {
    private String branchCode;

    private String branchName;

    private Integer supserBranchId;

    private Short branchProperty;

    private Integer brandId;

    private Integer headPersonId;

    private String remark;

    private String insPersonName;

    private Date insDate;

    public Branch(Integer companyId, Integer branchId, String branchCode, String branchName, Integer supserBranchId, Short branchProperty, Integer brandId, Integer headPersonId, String remark, String insPersonName, Date insDate) {
        super(companyId, branchId);
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.supserBranchId = supserBranchId;
        this.branchProperty = branchProperty;
        this.brandId = brandId;
        this.headPersonId = headPersonId;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public Branch() {
        super();
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public Integer getSupserBranchId() {
        return supserBranchId;
    }

    public void setSupserBranchId(Integer supserBranchId) {
        this.supserBranchId = supserBranchId;
    }

    public Short getBranchProperty() {
        return branchProperty;
    }

    public void setBranchProperty(Short branchProperty) {
        this.branchProperty = branchProperty;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHeadPersonId() {
        return headPersonId;
    }

    public void setHeadPersonId(Integer headPersonId) {
        this.headPersonId = headPersonId;
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