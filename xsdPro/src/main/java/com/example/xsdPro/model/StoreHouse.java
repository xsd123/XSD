package com.example.xsdPro.model;

public class StoreHouse extends StoreHouseKey {
    private String storeHouseCode;

    private String storeHouseName;

    private String remark;

    public StoreHouse(Integer companyId, Integer branchId, Integer storeId, Integer storeHouseId, String storeHouseCode, String storeHouseName, String remark) {
        super(companyId, branchId, storeId, storeHouseId);
        this.storeHouseCode = storeHouseCode;
        this.storeHouseName = storeHouseName;
        this.remark = remark;
    }

    public StoreHouse() {
        super();
    }

    public String getStoreHouseCode() {
        return storeHouseCode;
    }

    public void setStoreHouseCode(String storeHouseCode) {
        this.storeHouseCode = storeHouseCode == null ? null : storeHouseCode.trim();
    }

    public String getStoreHouseName() {
        return storeHouseName;
    }

    public void setStoreHouseName(String storeHouseName) {
        this.storeHouseName = storeHouseName == null ? null : storeHouseName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}