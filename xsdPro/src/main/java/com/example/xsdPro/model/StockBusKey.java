package com.example.xsdPro.model;

public class StockBusKey {
    private Integer companyId;

    private Integer branchId;

    private Integer storeId;

    private Integer busId;

    public StockBusKey(Integer companyId, Integer branchId, Integer storeId, Integer busId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.storeId = storeId;
        this.busId = busId;
    }

    public StockBusKey() {
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

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}