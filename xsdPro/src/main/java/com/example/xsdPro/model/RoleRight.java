package com.example.xsdPro.model;

import java.util.Date;

public class RoleRight extends RoleRightKey {
    private Short insRight;

    private Short updateRight;

    private Short delRight;

    private Short serchRight;

    private Short auditRight;

    private String insPersonName;

    private Date insDate;

    public RoleRight(Integer companyId, Integer roleId, Integer moduleId, Short insRight, Short updateRight, Short delRight, Short serchRight, Short auditRight, String insPersonName, Date insDate) {
        super(companyId, roleId, moduleId);
        this.insRight = insRight;
        this.updateRight = updateRight;
        this.delRight = delRight;
        this.serchRight = serchRight;
        this.auditRight = auditRight;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
    }

    public RoleRight() {
        super();
    }

    public Short getInsRight() {
        return insRight;
    }

    public void setInsRight(Short insRight) {
        this.insRight = insRight;
    }

    public Short getUpdateRight() {
        return updateRight;
    }

    public void setUpdateRight(Short updateRight) {
        this.updateRight = updateRight;
    }

    public Short getDelRight() {
        return delRight;
    }

    public void setDelRight(Short delRight) {
        this.delRight = delRight;
    }

    public Short getSerchRight() {
        return serchRight;
    }

    public void setSerchRight(Short serchRight) {
        this.serchRight = serchRight;
    }

    public Short getAuditRight() {
        return auditRight;
    }

    public void setAuditRight(Short auditRight) {
        this.auditRight = auditRight;
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