package com.example.xsdPro.model;

public class BusInOutLogKey {
    private Integer companyId;

    private Integer branchId;

    private Integer id;

    public BusInOutLogKey(Integer companyId, Integer branchId, Integer id) {
        this.companyId = companyId;
        this.branchId = branchId;
        this.id = id;
    }

    public BusInOutLogKey() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}