package com.example.xsdPro.model;

public class StoreType extends StoreTypeKey {
    private String typeCode;

    private String typeName;

    private String remark;

    public StoreType(Integer companyId, Integer storeTypeId, String typeCode, String typeName, String remark) {
        super(companyId, storeTypeId);
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.remark = remark;
    }

    public StoreType() {
        super();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}