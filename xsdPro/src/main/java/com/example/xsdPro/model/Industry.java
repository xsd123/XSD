package com.example.xsdPro.model;

public class Industry {
    private Integer id;

    private String industryName;

    public Industry(Integer id, String industryName) {
        this.id = id;
        this.industryName = industryName;
    }

    public Industry() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }
}