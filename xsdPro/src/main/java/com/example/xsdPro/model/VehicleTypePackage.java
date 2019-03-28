package com.example.xsdPro.model;

public class VehicleTypePackage extends VehicleTypePackageKey {
    private String vehicleTypePackageCode;

    private String vehicleTypePackageName;

    private String remark;

    public VehicleTypePackage(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypePackageId, String vehicleTypePackageCode, String vehicleTypePackageName, String remark) {
        super(companyId, brandId, vehicleSystemId, vehicleTypeId, vehicleTypePackageId);
        this.vehicleTypePackageCode = vehicleTypePackageCode;
        this.vehicleTypePackageName = vehicleTypePackageName;
        this.remark = remark;
    }

    public VehicleTypePackage() {
        super();
    }

    public String getVehicleTypePackageCode() {
        return vehicleTypePackageCode;
    }

    public void setVehicleTypePackageCode(String vehicleTypePackageCode) {
        this.vehicleTypePackageCode = vehicleTypePackageCode == null ? null : vehicleTypePackageCode.trim();
    }

    public String getVehicleTypePackageName() {
        return vehicleTypePackageName;
    }

    public void setVehicleTypePackageName(String vehicleTypePackageName) {
        this.vehicleTypePackageName = vehicleTypePackageName == null ? null : vehicleTypePackageName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}