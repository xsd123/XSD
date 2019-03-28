package com.example.xsdPro.model;

public class VehicleType extends VehicleTypeKey {
    private String vehicleTypeCode;

    private String vehicleTypeName;

    private String remark;

    public VehicleType(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, String vehicleTypeCode, String vehicleTypeName, String remark) {
        super(companyId, brandId, vehicleSystemId, vehicleTypeId);
        this.vehicleTypeCode = vehicleTypeCode;
        this.vehicleTypeName = vehicleTypeName;
        this.remark = remark;
    }

    public VehicleType() {
        super();
    }

    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode == null ? null : vehicleTypeCode.trim();
    }

    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName == null ? null : vehicleTypeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}