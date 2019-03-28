package com.example.xsdPro.model;

public class VehicleSystem extends VehicleSystemKey {
    private String vehicleSystemCode;

    private String vehicleSystemName;

    private String remark;

    public VehicleSystem(Integer companyId, Integer brandId, Integer vehicleSystemId, String vehicleSystemCode, String vehicleSystemName, String remark) {
        super(companyId, brandId, vehicleSystemId);
        this.vehicleSystemCode = vehicleSystemCode;
        this.vehicleSystemName = vehicleSystemName;
        this.remark = remark;
    }

    public VehicleSystem() {
        super();
    }

    public String getVehicleSystemCode() {
        return vehicleSystemCode;
    }

    public void setVehicleSystemCode(String vehicleSystemCode) {
        this.vehicleSystemCode = vehicleSystemCode == null ? null : vehicleSystemCode.trim();
    }

    public String getVehicleSystemName() {
        return vehicleSystemName;
    }

    public void setVehicleSystemName(String vehicleSystemName) {
        this.vehicleSystemName = vehicleSystemName == null ? null : vehicleSystemName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}