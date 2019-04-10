package com.example.xsdPro.model.Vo;

import com.example.xsdPro.model.BranchKey;
import com.example.xsdPro.model.Person;

import java.util.Date;
import java.util.List;

public class BranchVo extends BranchKey {

    private String branchCode;

    private String branchName;

    private Integer supserBranchId;

    private Short branchProperty;

    private Integer brandId;

    private Integer headPersonId;

    private String remark;

    private String insPersonName;

    private Date insDate;

    private List<BranchVo> list;  //子节点集合

    private List<Person> personList;

    public BranchVo(){}

    public BranchVo(Integer companyId, Integer branchId, String branchCode, String branchName, Integer supserBranchId, Short branchProperty, Integer brandId, Integer headPersonId, String remark, String insPersonName, Date insDate, List<BranchVo> list, List<Person> personList) {
        super(companyId, branchId);
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.supserBranchId = supserBranchId;
        this.branchProperty = branchProperty;
        this.brandId = brandId;
        this.headPersonId = headPersonId;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.list = list;
        this.personList = personList;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getSupserBranchId() {
        return supserBranchId;
    }

    public void setSupserBranchId(Integer supserBranchId) {
        this.supserBranchId = supserBranchId;
    }

    public Short getBranchProperty() {
        return branchProperty;
    }

    public void setBranchProperty(Short branchProperty) {
        this.branchProperty = branchProperty;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHeadPersonId() {
        return headPersonId;
    }

    public void setHeadPersonId(Integer headPersonId) {
        this.headPersonId = headPersonId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInsPersonName() {
        return insPersonName;
    }

    public void setInsPersonName(String insPersonName) {
        this.insPersonName = insPersonName;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public List<BranchVo> getList() {
        return list;
    }

    public void setList(List<BranchVo> list) {
        this.list = list;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
