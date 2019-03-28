package com.example.xsdPro.model;

public class VehicleTypeOutColorKey {
    private Integer companyId;

    private Integer brandId;

    private Integer vehicleSystemId;

    private Integer vehicleTypeId;

    private Integer vehicleTypeOutColorId;

    public VehicleTypeOutColorKey(Integer companyId, Integer brandId, Integer vehicleSystemId, Integer vehicleTypeId, Integer vehicleTypeOutColorId) {
        this.companyId = companyId;
        this.brandId = brandId;
        this.vehicleSystemId = vehicleSystemId;
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleTypeOutColorId = vehicleTypeOutColorId;
    }

    public VehicleTypeOutColorKey() {
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

    public Integer getVehicleTypeOutColorId() {
        return vehicleTypeOutColorId;
    }

    public void setVehicleTypeOutColorId(Integer vehicleTypeOutColorId) {
        this.vehicleTypeOutColorId = vehicleTypeOutColorId;
    }
}