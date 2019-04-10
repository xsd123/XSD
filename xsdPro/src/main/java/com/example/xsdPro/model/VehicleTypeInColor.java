package com.example.xsdPro.model;

public class VehicleTypeInColor extends VehicleTypeInColorKey {
    private String vehicleTypeInColorCode;

    private String vehicleTypeInColorName;

    private String remark;

    public VehicleTypeInColor(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypeInColorId, String vehicleTypeInColorCode, String vehicleTypeInColorName, String remark) {
        super(companyId, brandId, vehicleSystemId, vehicleTypeId, vehicleTypeInColorId);
        this.vehicleTypeInColorCode = vehicleTypeInColorCode;
        this.vehicleTypeInColorName = vehicleTypeInColorName;
        this.remark = remark;
    }

    public VehicleTypeInColor() {
        super();
    }

    public String getVehicleTypeInColorCode() {
        return vehicleTypeInColorCode;
    }

    public void setVehicleTypeInColorCode(String vehicleTypeInColorCode) {
        this.vehicleTypeInColorCode = vehicleTypeInColorCode == null ? null : vehicleTypeInColorCode.trim();
    }

    public String getVehicleTypeInColorName() {
        return vehicleTypeInColorName;
    }

    public void setVehicleTypeInColorName(String vehicleTypeInColorName) {
        this.vehicleTypeInColorName = vehicleTypeInColorName == null ? null : vehicleTypeInColorName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}