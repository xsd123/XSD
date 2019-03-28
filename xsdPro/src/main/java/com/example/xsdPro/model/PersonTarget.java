package com.example.xsdPro.model;

import java.util.Date;

public class PersonTarget extends PersonTargetKey {
    private Integer targetAmount;

    private String remark;

    private Integer insPersonId;

    private Date insDate;

    public PersonTarget(Integer companyId, Integer branchId, Integer personId, Integer tYear, Integer tMonth, Integer targetAmount, String remark, Integer insPersonId, Date insDate) {
        super(companyId, branchId, personId, tYear, tMonth);
        this.targetAmount = targetAmount;
        this.remark = remark;
        this.insPersonId = insPersonId;
        this.insDate = insDate;
    }

    public PersonTarget() {
        super();
    }

    public Integer getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Integer targetAmount) {
        this.targetAmount = targetAmount;
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