package com.example.xsdPro.model;

public class Module {
    private Integer id;

    private String moduleCode;

    private String moduleName;

    private String remark;

    public Module(Integer id, String moduleCode, String moduleName, String remark) {
        this.id = id;
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.remark = remark;
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
}