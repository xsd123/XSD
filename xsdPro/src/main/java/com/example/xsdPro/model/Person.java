package com.example.xsdPro.model;

import java.util.Date;

public class Person extends PersonKey {
    private String personCode;

    private String personName;

    private Short sex;

    private Integer branchId;

    private String chargeFlag;

    private Date birthDate;

    private String card;

    private String tel;

    private String eMail;

    private String school;

    private String major;

    private Integer educationId;

    private Date graduationDate;

    private String address;

    private String address1;

    private String nativePlace1;

    private String nativePlace2;

    private String nativePlace3;

    private Integer statue;

    private Date inDate;

    private String inTransactor;

    private Date updateDate;

    private String updateTransactor;

    private Date outDate;

    private String outTransactor;

    private String outSerson;

    private Integer postId;

    private String remark;

    public Person(Integer companyId, Integer personId, String personCode, String personName, Short sex, Integer branchId, String chargeFlag, Date birthDate, String card, String tel, String eMail, String school, String major, Integer educationId, Date graduationDate, String address, String address1, String nativePlace1, String nativePlace2, String nativePlace3, Integer statue, Date inDate, String inTransactor, Date updateDate, String updateTransactor, Date outDate, String outTransactor, String outSerson, Integer postId, String remark) {
        super(companyId, personId);
        this.personCode = personCode;
        this.personName = personName;
        this.sex = sex;
        this.branchId = branchId;
        this.chargeFlag = chargeFlag;
        this.birthDate = birthDate;
        this.card = card;
        this.tel = tel;
        this.eMail = eMail;
        this.school = school;
        this.major = major;
        this.educationId = educationId;
        this.graduationDate = graduationDate;
        this.address = address;
        this.address1 = address1;
        this.nativePlace1 = nativePlace1;
        this.nativePlace2 = nativePlace2;
        this.nativePlace3 = nativePlace3;
        this.statue = statue;
        this.inDate = inDate;
        this.inTransactor = inTransactor;
        this.updateDate = updateDate;
        this.updateTransactor = updateTransactor;
        this.outDate = outDate;
        this.outTransactor = outTransactor;
        this.outSerson = outSerson;
        this.postId = postId;
        this.remark = remark;
    }

    public Person() {
        super();
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode == null ? null : personCode.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag == null ? null : chargeFlag.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getNativePlace1() {
        return nativePlace1;
    }

    public void setNativePlace1(String nativePlace1) {
        this.nativePlace1 = nativePlace1 == null ? null : nativePlace1.trim();
    }

    public String getNativePlace2() {
        return nativePlace2;
    }

    public void setNativePlace2(String nativePlace2) {
        this.nativePlace2 = nativePlace2 == null ? null : nativePlace2.trim();
    }

    public String getNativePlace3() {
        return nativePlace3;
    }

    public void setNativePlace3(String nativePlace3) {
        this.nativePlace3 = nativePlace3 == null ? null : nativePlace3.trim();
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public String getInTransactor() {
        return inTransactor;
    }

    public void setInTransactor(String inTransactor) {
        this.inTransactor = inTransactor == null ? null : inTransactor.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateTransactor() {
        return updateTransactor;
    }

    public void setUpdateTransactor(String updateTransactor) {
        this.updateTransactor = updateTransactor == null ? null : updateTransactor.trim();
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getOutTransactor() {
        return outTransactor;
    }

    public void setOutTransactor(String outTransactor) {
        this.outTransactor = outTransactor == null ? null : outTransactor.trim();
    }

    public String getOutSerson() {
        return outSerson;
    }

    public void setOutSerson(String outSerson) {
        this.outSerson = outSerson == null ? null : outSerson.trim();
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}