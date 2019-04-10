package com.example.xsdPro.model;

public class BrandKey {
    private Integer companyId;

    private Integer brandId;

    public BrandKey(Integer companyId, Integer brandId) {
        this.companyId = companyId;
        this.brandId = brandId;
    }

    public BrandKey() {
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
}