package com.example.xsdPro.model;

public class StoreTypeKey {
    private Integer companyId;

    private Integer storeTypeId;

    public StoreTypeKey(Integer companyId, Integer storeTypeId) {
        this.companyId = companyId;
        this.storeTypeId = storeTypeId;
    }

    public StoreTypeKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Integer storeTypeId) {
        this.storeTypeId = storeTypeId;
    }
}