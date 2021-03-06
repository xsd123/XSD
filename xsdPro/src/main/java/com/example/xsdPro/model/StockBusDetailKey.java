package com.example.xsdPro.model;

public class StockBusDetailKey {
    private Integer companyId;

    private Integer branchId;

    private Integer storeId;

    private Integer busId;

    private Integer id;

    public StockBusDetailKey(Integer companyId, Integer branchId, Integer storeId, Integer busId, Integer id) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.storeId = storeId;
        this.busId = busId;
        this.id = id;
    }

    public StockBusDetailKey() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}