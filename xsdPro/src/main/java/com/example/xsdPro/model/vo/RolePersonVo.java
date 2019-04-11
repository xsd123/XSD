package com.example.xsdPro.model.vo;

import com.example.xsdPro.model.RolePersonKey;
import com.example.xsdPro.model.RoleRight;

import java.util.Date;
import java.util.List;

public class RolePersonVo extends RolePersonKey {
    private String insPersonName;

    private Date insDate;

    List<RoleRight> roleRight;

    public  RolePersonVo(){}
    public RolePersonVo(Integer companyId, Integer roleId, String userCode, String insPersonName, Date insDate, List<RoleRight> roleRight) {
        super(companyId, roleId, userCode);
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.roleRight = roleRight;
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

    public List<RoleRight> getRoleRight() {
        return roleRight;
    }

    public void setRoleRight(List<RoleRight> roleRight) {
        this.roleRight = roleRight;
    }
}
