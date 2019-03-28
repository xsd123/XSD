package com.example.xsdPro.model;

public class PostKey {
    private Integer companyId;

    private Integer id;

    public PostKey(Integer companyId, Integer id) {
        this.companyId = companyId;
        this.id = id;
    }

    public PostKey() {
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