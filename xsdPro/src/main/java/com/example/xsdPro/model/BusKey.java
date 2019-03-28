package com.example.xsdPro.model;

public class BusKey {
    private Integer companyId;

    private Integer branchId;

    private Integer busId;

    public BusKey(Integer companyId, Integer branchId, Integer busId) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.busId = busId;
    }

    public BusKey() {
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

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}