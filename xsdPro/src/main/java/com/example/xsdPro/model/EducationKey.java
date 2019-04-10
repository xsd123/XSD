package com.example.xsdPro.model;

public class EducationKey {
    private Integer companyId;

    private Integer id;

    public EducationKey(Integer companyId, Integer id) {
        this.companyId = companyId;
        this.id = id;
    }

    public EducationKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}