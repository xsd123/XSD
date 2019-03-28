package com.example.xsdPro.model;

public class VehicleSystemKey {
    private Integer companyId;

    private Integer brandId;

    private Integer vehicleSystemId;

    public VehicleSystemKey(Integer companyId, Integer brandId, Integer vehicleSystemId) {
        this.companyId = companyId;
        this.brandId = brandId;
        this.vehicleSystemId = vehicleSystemId;
    }

    public VehicleSystemKey() {
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
}