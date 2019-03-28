package com.example.xsdPro.model;

import java.util.Date;

public class BranchTargetType extends BranchTargetTypeKey {
    private Integer vehicleTypeId;

    private Integer vehicleTypeInColorId;

    private Integer targetAmount;

    private String remark;

    private Integer insPersonId;

    private Date insDate;

    public BranchTargetType(Integer companyId, Integer branchId, Integer tYear, Integer tMonth, Integer id, Integer vehicleTypeId, Integer vehicleTypeInColorId, Integer targetAmount, String remark, Integer insPersonId, Date insDate) {
        super(companyId, branchId, tYear, tMonth, id);
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleTypeInColorId = vehicleTypeInColorId;
        this.targetAmount = targetAmount;
        this.remark = remark;
        this.insPersonId = insPersonId;
        this.insDate = insDate;
    }

    public BranchTargetType() {
        super();
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public Integer getVehicleTypeInColorId() {
        return vehicleTypeInColorId;
    }

    public void setVehicleTypeInColorId(Integer vehicleTypeInColorId) {
        this.vehicleTypeInColorId = vehicleTypeInColorId;
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