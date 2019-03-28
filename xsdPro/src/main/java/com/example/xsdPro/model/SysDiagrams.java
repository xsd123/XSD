package com.example.xsdPro.model;

public class SysDiagrams {
    private Integer diagramId;

    private String name;

    private Integer principalId;

    private Integer version;

    private byte[] definition;

    public SysDiagrams(Integer diagramId, String name, Integer principalId, Integer version, byte[] definition) {
        this.diagramId = diagramId;
        this.name = name;
        this.principalId = principalId;
        this.version = version;
        this.definition = definition;
    }

    public SysDiagrams() {
        super();
    }

    public Integer getDiagramId() {
        return diagramId;
    }

    public void setDiagramId(Integer diagramId) {
        this.diagramId = diagramId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public byte[] getDefinition() {
        return definition;
    }

    public void setDefinition(byte[] definition) {
        this.definition = definition;
    }
}