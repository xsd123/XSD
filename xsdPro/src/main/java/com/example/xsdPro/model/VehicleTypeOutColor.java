package com.example.xsdPro.model;

public class VehicleTypeOutColor extends VehicleTypeOutColorKey {
    private String vehicleTypeOutColorCode;

    private String vehicleTypeOutColorName;

    private String remark;

    public VehicleTypeOutColor(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypeOutColorId, String vehicleTypeOutColorCode, String vehicleTypeOutColorName, String remark) {
        super(companyId, brandId, vehicleSystemId, vehicleTypeId, vehicleTypeOutColorId);
        this.vehicleTypeOutColorCode = vehicleTypeOutColorCode;
        this.vehicleTypeOutColorName = vehicleTypeOutColorName;
        this.remark = remark;
    }

    public VehicleTypeOutColor() {
        super();
    }

    public String getVehicleTypeOutColorCode() {
        return vehicleTypeOutColorCode;
    }

    public void setVehicleTypeOutColorCode(String vehicleTypeOutColorCode) {
        this.vehicleTypeOutColorCode = vehicleTypeOutColorCode == null ? null : vehicleTypeOutColorCode.trim();
    }

    public String getVehicleTypeOutColorName() {
        return vehicleTypeOutColorName;
    }

    public void setVehicleTypeOutColorName(String vehicleTypeOutColorName) {
        this.vehicleTypeOutColorName = vehicleTypeOutColorName == null ? null : vehicleTypeOutColorName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}