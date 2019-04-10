package com.example.xsdPro.model;

public class StoreHouseKey {
    private Integer companyId;

    private Integer branchId;

    private Integer storeId;

    private Integer storeHouseId;

    public StoreHouseKey(Integer companyId, Integer branchId, Integer storeId, Integer storeHouseId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.storeId = storeId;
        this.storeHouseId = storeHouseId;
    }

    public StoreHouseKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreHouseId() {
        return storeHouseId;
    }

    public void setStoreHouseId(Integer storeHouseId) {
        this.storeHouseId = storeHouseId;
    }
}