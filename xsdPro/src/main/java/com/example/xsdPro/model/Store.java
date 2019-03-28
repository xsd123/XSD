package com.example.xsdPro.model;

public class Store extends StoreKey {
    private String storeCode;

    private String storeName;

    private Integer storeTypeId;

    private Boolean negativeFlag;

    private String address;

    private String remark;

    public Store(Integer companyId, Integer branchId, Integer storeId, String storeCode, String storeName, Integer storeTypeId, Boolean negativeFlag, String address, String remark) {
        super(companyId, branchId, storeId);
        this.storeCode = storeCode;
        this.storeName = storeName;
        this.storeTypeId = storeTypeId;
        this.negativeFlag = negativeFlag;
        this.address = address;
        this.remark = remark;
    }

    public Store() {
        super();
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Integer storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public Boolean getNegativeFlag() {
        return negativeFlag;
    }

    public void setNegativeFlag(Boolean negativeFlag) {
        this.negativeFlag = negativeFlag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}