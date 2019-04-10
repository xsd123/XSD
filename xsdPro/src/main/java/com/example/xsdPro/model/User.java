package com.example.xsdPro.model;

import java.util.Date;

public class User extends UserKey {
    private String userPass;

    private Integer personId;

    private Integer statue;

    private String insPersonName;

    private Date insDate;

    private String salt;

    public User(Integer companyId, String userCode, String userPass, Integer personId, Integer statue, String insPersonName, Date insDate, String salt) {
        super(companyId, userCode);
        this.userPass = userPass;
        this.personId = personId;
        this.statue = statue;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.salt = salt;
    }

    public User() {
        super();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public String getInsPersonName() {
        return insPersonName;
    }

    public void setInsPersonName(String insPersonName) {
        this.insPersonName = insPersonName == null ? null : insPersonName.trim();
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}