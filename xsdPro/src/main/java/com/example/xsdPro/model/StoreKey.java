package com.example.xsdPro.model;

public class StoreKey {
    private Integer companyId;

    private Integer branchId;

    private Integer storeId;

    public StoreKey(Integer companyId, Integer branchId, Integer storeId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.storeId = storeId;
    }

    public StoreKey() {
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
}