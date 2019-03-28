package com.example.xsdPro.model;

public class Brand extends BrandKey {
    private String brandCode;

    private String brandName;

    private String customerCodePrefix;

    private String indentCodePrefix;

    private String mCodePrefix;

    private String remark;

    public Brand(Integer companyId, Integer brandId, String brandCode, String brandName, String customerCodePrefix, String indentCodePrefix, String mCodePrefix, String remark) {
        super(companyId, brandId);
        this.brandCode = brandCode;
        this.brandName = brandName;
        this.customerCodePrefix = customerCodePrefix;
        this.indentCodePrefix = indentCodePrefix;
        this.mCodePrefix = mCodePrefix;
        this.remark = remark;
    }

    public Brand() {
        super();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getCustomerCodePrefix() {
        return customerCodePrefix;
    }

    public void setCustomerCodePrefix(String customerCodePrefix) {
        this.customerCodePrefix = customerCodePrefix == null ? null : customerCodePrefix.trim();
    }

    public String getIndentCodePrefix() {
        return indentCodePrefix;
    }

    public void setIndentCodePrefix(String indentCodePrefix) {
        this.indentCodePrefix = indentCodePrefix == null ? null : indentCodePrefix.trim();
    }

    public String getmCodePrefix() {
        return mCodePrefix;
    }

    public void setmCodePrefix(String mCodePrefix) {
        this.mCodePrefix = mCodePrefix == null ? null : mCodePrefix.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}