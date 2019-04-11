package com.example.xsdPro.model.Vo;

import com.example.xsdPro.model.UserKey;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import java.util.List;

public class UserVo  extends UserKey {
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @NotEmpty(message="集团代码不能为空！")
    private String companyCode;
    @NotEmpty(message="密码不能为空！")
    private String userPass;

    private Integer personId;

    private Integer statue;

    private String insPersonName;

    private Date insDate;

    private String salt;

    private List roleStrlist;//用户角色集合

    private List PerminsStrlist;//用户权限集合

    public List getRoleStrlist() {
        return roleStrlist;
    }

    public void setRoleStrlist(List roleStrlist) {
        this.roleStrlist = roleStrlist;
    }

    public List getPerminsStrlist() {
        return PerminsStrlist;
    }

    public void setPerminsStrlist(List perminsStrlist) {
        PerminsStrlist = perminsStrlist;
    }


    public UserVo(String companyCode,Integer companyId, String userCode, String userPass, Integer personId, Integer statue, String insPersonName, Date insDate, String salt) {
        super(companyId, userCode);
        this.companyCode = companyCode;
        this.userPass = userPass;
        this.personId = personId;
        this.statue = statue;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.salt = salt;
    }

    public UserVo() {
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
