package com.example.xsdPro.model;

import java.util.Date;

public class Company {
    private Integer id;

    private String companyCode;

    private String companyName;

    private String companyNameJ;

    private String province;

    private String city;

    private String district;

    private String post;

    private String eMail;

    private String grade;

    private Date dateOpening;

    private String fax;

    private String nature;

    private String address;

    private Integer statue;

    private Integer stopAmont;

    private String remark;

    private String insMan;

    private Date insDate;

    private String updateMan;

    private Date updateDate;

    private String administratorName;

    private String administratorPass;

    private String auditor;

    private Date auditorDate;

    private String closeMan;

    private Date closeDate;

    public Company(Integer id, String companyCode, String companyName, String companyNameJ, String province, String city, String district, String post, String eMail, String grade, Date dateOpening, String fax, String nature, String address, Integer statue, Integer stopAmont, String remark, String insMan, Date insDate, String updateMan, Date updateDate, String administratorName, String administratorPass, String auditor, Date auditorDate, String closeMan, Date closeDate) {
        this.id = id;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyNameJ = companyNameJ;
        this.province = province;
        this.city = city;
        this.district = district;
        this.post = post;
        this.eMail = eMail;
        this.grade = grade;
        this.dateOpening = dateOpening;
        this.fax = fax;
        this.nature = nature;
        this.address = address;
        this.statue = statue;
        this.stopAmont = stopAmont;
        this.remark = remark;
        this.insMan = insMan;
        this.insDate = insDate;
        this.updateMan = updateMan;
        this.updateDate = updateDate;
        this.administratorName = administratorName;
        this.administratorPass = administratorPass;
        this.auditor = auditor;
        this.auditorDate = auditorDate;
        this.closeMan = closeMan;
        this.closeDate = closeDate;
    }

    public Company() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyNameJ() {
        return companyNameJ;
    }

    public void setCompanyNameJ(String companyNameJ) {
        this.companyNameJ = companyNameJ == null ? null : companyNameJ.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Date getDateOpening() {
        return dateOpening;
    }

    public void setDateOpening(Date dateOpening) {
        this.dateOpening = dateOpening;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public Integer getStopAmont() {
        return stopAmont;
    }

    public void setStopAmont(Integer stopAmont) {
        this.stopAmont = stopAmont;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInsMan() {
        return insMan;
    }

    public void setInsMan(String insMan) {
        this.insMan = insMan == null ? null : insMan.trim();
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan == null ? null : updateMan.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName == null ? null : administratorName.trim();
    }

    public String getAdministratorPass() {
        return administratorPass;
    }

    public void setAdministratorPass(String administratorPass) {
        this.administratorPass = administratorPass == null ? null : administratorPass.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditorDate() {
        return auditorDate;
    }

    public void setAuditorDate(Date auditorDate) {
        this.auditorDate = auditorDate;
    }

    public String getCloseMan() {
        return closeMan;
    }

    public void setCloseMan(String closeMan) {
        this.closeMan = closeMan == null ? null : closeMan.trim();
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }
}