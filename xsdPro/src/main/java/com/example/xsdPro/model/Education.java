package com.example.xsdPro.model;

public class Education extends EducationKey {
    private String educationCode;

    private String educationName;

    private String remark;

    public Education(Integer companyId, Integer id, String educationCode, String educationName, String remark) {
        super(companyId, id);
        this.educationCode = educationCode;
        this.educationName = educationName;
        this.remark = remark;
    }

    public Education() {
        super();
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode == null ? null : educationCode.trim();
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}