package com.example.xsdPro.model;

public class Module {
    private Integer id;

    private String moduleCode;

    private String moduleName;

    private String remark;

    private String parentId;

    private String permission;

    private String url;

    public Module(Integer id, String moduleCode, String moduleName, String remark, String parentId, String permission, String url) {
        this.id = id;
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.remark = remark;
        this.parentId = parentId;
        this.permission = permission;
        this.url = url;
    }

    public Module() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}