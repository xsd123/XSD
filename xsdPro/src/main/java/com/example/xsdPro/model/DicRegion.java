package com.example.xsdPro.model;

public class DicRegion {
    private String id;

    private String name;

    private String parentid;

    private String shortname;

    private String leveltype;

    private String citycode;

    private String zipcode;

    private String mergername;

    private String lng;

    private String lat;

    private String pinyin;

    public DicRegion(String id, String name, String parentid, String shortname, String leveltype, String citycode, String zipcode, String mergername, String lng, String lat, String pinyin) {
        this.id = id;
        this.name = name;
        this.parentid = parentid;
        this.shortname = shortname;
        this.leveltype = leveltype;
        this.citycode = citycode;
        this.zipcode = zipcode;
        this.mergername = mergername;
        this.lng = lng;
        this.lat = lat;
        this.pinyin = pinyin;
    }

    public DicRegion() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getLeveltype() {
        return leveltype;
    }

    public void setLeveltype(String leveltype) {
        this.leveltype = leveltype == null ? null : leveltype.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getMergername() {
        return mergername;
    }

    public void setMergername(String mergername) {
        this.mergername = mergername == null ? null : mergername.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }
}