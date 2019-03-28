package com.example.xsdPro.model;

public class VehicleTypePackageKey {
    private Integer companyId;

    private Integer brandId;

    private Integer vehicleSystemId;

    private Integer vehicleTypeId;

    private Integer vehicleTypePackageId;

    public VehicleTypePackageKey(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypePackageId) {
        this.companyId = companyId;
        this.brandId = brandId;
        this.vehicleSystemId = vehicleSystemId;
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleTypePackageId = vehicleTypePackageId;
    }

    public VehicleTypePackageKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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

    public Integer getVehicleTypePackageId() {
        return vehicleTypePackageId;
    }

    public void setVehicleTypePackageId(Integer vehicleTypePackageId) {
        this.vehicleTypePackageId = vehicleTypePackageId;
    }
}