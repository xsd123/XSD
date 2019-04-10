package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.Date;

public class Part extends PartKey {
    private String partCode;

    private String partPy;

    private String partName;

    private Integer partPropertiesId;

    private Integer partTypeId;

    private Integer partClassId;

    private BigDecimal busAmount;

    private Boolean goodsFlag;

    private Boolean paintFlag;

    private Boolean stopFlag;

    private BigDecimal minStock;

    private BigDecimal maxStock;

    private Boolean remindFlag;

    private Integer unitId;

    private String remark;

    private String insPersonName;

    private Date insDate;

    private String updatePersonName;

    private Date updateDate;

    public Part(Integer companyId, Integer branchId, Integer partId, String partCode, String partPy, String partName, Integer partPropertiesId, Integer partTypeId, Integer partClassId, BigDecimal busAmount, Boolean goodsFlag, Boolean paintFlag, Boolean stopFlag, BigDecimal minStock, BigDecimal maxStock, Boolean remindFlag, Integer unitId, String remark, String insPersonName, Date insDate, String updatePersonName, Date updateDate) {
        super(companyId, branchId, partId);
        this.partCode = partCode;
        this.partPy = partPy;
        this.partName = partName;
        this.partPropertiesId = partPropertiesId;
        this.partTypeId = partTypeId;
        this.partClassId = partClassId;
        this.busAmount = busAmount;
        this.goodsFlag = goodsFlag;
        this.paintFlag = paintFlag;
        this.stopFlag = stopFlag;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.remindFlag = remindFlag;
        this.unitId = unitId;
        this.remark = remark;
        this.insPersonName = insPersonName;
        this.insDate = insDate;
        this.updatePersonName = updatePersonName;
        this.updateDate = updateDate;
    }

    public Part() {
        super();
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode == null ? null : partCode.trim();
    }

    public String getPartPy() {
        return partPy;
    }

    public void setPartPy(String partPy) {
        this.partPy = partPy == null ? null : partPy.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public Integer getPartPropertiesId() {
        return partPropertiesId;
    }

    public void setPartPropertiesId(Integer partPropertiesId) {
        this.partPropertiesId = partPropertiesId;
    }

    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }

    public Integer getPartClassId() {
        return partClassId;
    }

    public void setPartClassId(Integer partClassId) {
        this.partClassId = partClassId;
    }

    public BigDecimal getBusAmount() {
        return busAmount;
    }

    public void setBusAmount(BigDecimal busAmount) {
        this.busAmount = busAmount;
    }

    public Boolean getGoodsFlag() {
        return goodsFlag;
    }

    public void setGoodsFlag(Boolean goodsFlag) {
        this.goodsFlag = goodsFlag;
    }

    public Boolean getPaintFlag() {
        return paintFlag;
    }

    public void setPaintFlag(Boolean paintFlag) {
        this.paintFlag = paintFlag;
    }

    public Boolean getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(Boolean stopFlag) {
        this.stopFlag = stopFlag;
    }

    public BigDecimal getMinStock() {
        return minStock;
    }

    public void setMinStock(BigDecimal minStock) {
        this.minStock = minStock;
    }

    public BigDecimal getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(BigDecimal maxStock) {
        this.maxStock = maxStock;
    }

    public Boolean getRemindFlag() {
        return remindFlag;
    }

    public void setRemindFlag(Boolean remindFlag) {
        this.remindFlag = remindFlag;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getUpdatePersonName() {
        return updatePersonName;
    }

    public void setUpdatePersonName(String updatePersonName) {
        this.updatePersonName = updatePersonName == null ? null : updatePersonName.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}