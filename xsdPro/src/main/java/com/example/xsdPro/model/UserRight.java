package com.example.xsdPro.model;

public class UserRight extends UserRightKey {
    private Short insRight;

    private Short updateRight;

    private Short delRight;

    private Short serchRight;

    private Short auditRight;

    public UserRight(Integer companyId, String userCode, Integer moduleId, Short insRight, Short updateRight, Short delRight, Short serchRight, Short auditRight) {
        super(companyId, userCode, moduleId);
        this.insRight = insRight;
        this.updateRight = updateRight;
        this.delRight = delRight;
        this.serchRight = serchRight;
        this.auditRight = auditRight;
    }

    public UserRight() {
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
}