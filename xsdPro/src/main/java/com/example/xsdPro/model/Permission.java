package com.example.xsdPro.model;

import java.util.Date;

public class Permission {
    private Integer id;

    private Boolean available;

    private String name;

    private Date numberSort;

    private Long parentId;

    private String parentIds;

    private String permission;

    private String url;

    private String resourceType;

    public Permission(Integer id, Boolean available, String name, Date numberSort, Long parentId, String parentIds, String permission, String url, String resourceType) {
        this.id = id;
        this.available = available;
        this.name = name;
        this.numberSort = numberSort;
        this.parentId = parentId;
        this.parentIds = parentIds;
        this.permission = permission;
        this.url = url;
        this.resourceType = resourceType;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getNumberSort() {
        return numberSort;
    }

    public void setNumberSort(Date numberSort) {
        this.numberSort = numberSort;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }
}