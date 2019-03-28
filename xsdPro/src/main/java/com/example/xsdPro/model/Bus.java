package com.example.xsdPro.model;

import java.util.Date;

public class Bus extends BusKey {
    private String busCode;

    private Integer vehicleSystemId;

    private Integer vehicleTypeId;

    private Integer vehicleTypeInColorId;

    private Integer vehicleTypeOutColorId;

    private Integer vehicleTypePackageId;

    private Integer minStock;

    private Integer maxStock;

    private Boolean remindFlag;

    private Integer unitId;

    private String remark;

    private String insPersonName;

    private Date insDate;

    private String updatePersonName;

    private Date updateDate;

    public Bus(Integer companyId, Integer branchId, Integer busId, String busCode, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypeInColorId, Integer vehicleTypeOutColorId, Integer vehicleTypePackageId, Integer minStock, Integer maxStock, Boolean remindFlag, Integer unitId, String remark, String insPersonName, Date insDate, String updatePersonName, Date updateDate) {
        super(companyId, branchId, busId);
        this.busCode = busCode;
        this.vehicleSystemId = vehicleSystemId;
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleTypeInColorId = vehicleTypeInColorId;
        this.vehicleTypeOutColorId = vehicleTypeOutColorId;
        this.vehicleTypePackageId = vehicleTypePackageId;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.remindFlag = remindFlag;
        this.unitId = unitId;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.updatePersonName = updatePersonName;
        this.updateDate = updateDate;
    }

    public Bus() {
        super();
    }

    public String getBusCode() {
        return busCode;
    }

    public void setBusCode(String busCode) {
        this.busCode = busCode == null ? null : busCode.trim();
    }

    public Integer getVehicleSystemId() {
        return vehicleSystemId;
    }

    public void setVehicleSystemId(Integer vehicleSystemId) {
        this.vehicleSystemId = vehicleSystemId;
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

    public Integer getVehicleTypeOutColorId() {
        return vehicleTypeOutColorId;
    }

    public void setVehicleTypeOutColorId(Integer vehicleTypeOutColorId) {
        this.vehicleTypeOutColorId = vehicleTypeOutColorId;
    }

    public Integer getVehicleTypePackageId() {
        return vehicleTypePackageId;
    }

    public void setVehicleTypePackageId(Integer vehicleTypePackageId) {
        this.vehicleTypePackageId = vehicleTypePackageId;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public Boolean getRemindFlag() {
        return remindFlag;
    }

    public void setRemindFlag(Boolean remindFlag) {
        this.remindFlag = remindFlag;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
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

    public String getUpdatePersonName() {
        return updatePersonName;
    }

    public void setUpdatePersonName(String updatePersonName) {
        this.updatePersonName = updatePersonName == null ? null : updatePersonName.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}