package com.example.xsdPro.model;

public class UserRangeKey {
    private Integer companyId;

    private String userCode;

    private Integer branchId;

    public UserRangeKey(Integer companyId, String userCode, Integer branchId) {
        this.companyId = companyId;
        this.userCode = userCode;
        this.branchId = branchId;
    }

    public UserRangeKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}