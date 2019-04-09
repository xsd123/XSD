package com.example.xsdPro.model.VO;

import java.util.Date;
import java.util.List;

public class CompanyVO {
    private Integer id;

    /**
     *公司代码
     */
    private String companyCode;

    /**
     *公司名称
     */
    private String companyName;

    /**
     *公司简称
     */
    private String companyNameJ;

    /**
     *省
     */
    private String province;

    /**
     *市
     */
    private String city;

    /**
     *区
     */
    private String district;

    /**
     *邮编
     */
    private String post;

    /**
     *地址
     */
    private String eMail;

    /**
     *级别123456级等
     */
    private String grade;

    /**
     *开业时间
     */
    private Date dateOpening;

    /**
     *传真
     */
    private String fax;

    /**
     *企业性质
     */
    private String nature;

    /**
     *公司地址
     */
    private String address;

    /**
     *公司状态 1－未审核，2－审核通过，3－审核未通过，4－关闭
     */
    private Integer statue;

    /**
     *允许的门店最大数量
     */
    private Integer stopAmont;

    /**
     *备注
     */
    private String remark;

    /**
     *平台录入人员
     */
    private String insMan;

    /**
     *录入时间
     */
    private Date insDate;

    /**
     *修改人员
     */
    private String updateMan;

    /**
     *修改时间
     */
    private Date updateDate;

    /**
     *允许的门店最大数量
     */
    private String administratorName;

    /**
     *本公司系统胡超级管理人员用户名，在公司审核通过后，填写此栏目
     */
    private String administratorPass;

    /**
     *本公司超级管理人员的密码。在公司审核通过后，填写此栏目
     */
    private String auditor;

    /**
     *审核人员
     */
    private Date auditorDate;

    /**
     *审核时间
     */
    private String closeMan;

    /**
     *关闭时间
     */
    private Date closeDate;



    private List<BranchVO> branchVOList; //子级菜单集合

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

    public List<BranchVO> getBranchVOList() {
        return branchVOList;
    }

    public void setBranchVOList(List<BranchVO> branchVOList) {
        this.branchVOList = branchVOList;
    }
}
