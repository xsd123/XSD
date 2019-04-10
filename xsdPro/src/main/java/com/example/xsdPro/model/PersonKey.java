package com.example.xsdPro.model;

public class PersonKey {
    private Integer companyId;

    private Integer personId;

    public PersonKey(Integer companyId, Integer personId) {
        this.companyId = companyId;
        this.personId = personId;
    }

    public PersonKey() {
        super();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}