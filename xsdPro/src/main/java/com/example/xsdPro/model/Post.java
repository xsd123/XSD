package com.example.xsdPro.model;

import java.util.Date;

public class Post extends PostKey {
    private String postCode;

    private String postName;

    private String remark;

    private String insPersonName;

    private Date insDate;

    public Post(Integer companyId, Integer id, String postCode, String postName, String remark, String insPersonName, Date insDate) {
        super(companyId, id);
        this.postCode = postCode;
        this.postName = postName;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public Post() {
        super();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}