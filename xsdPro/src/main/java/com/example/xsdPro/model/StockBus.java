package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.Date;

public class StockBus extends StockBusKey {
    private BigDecimal amount;

    private String unitId;

    private BigDecimal price;

    private Integer inPersonId;

    private Date inDate;

    private Integer updatePersonId;

    private Date updateDate;

    public StockBus(Integer companyId, Integer branchId, Integer storeId, Integer busId, BigDecimal amount, String unitId, BigDecimal price, Integer inPersonId, Date inDate, Integer updatePersonId, Date updateDate) {
        super(companyId, branchId, storeId, busId);
        this.amount = amount;
        this.unitId = unitId;
        this.price = price;
        this.inPersonId = inPersonId;
        this.inDate = inDate;
        this.updatePersonId = updatePersonId;
        this.updateDate = updateDate;
    }

    public StockBus() {
        super();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInPersonId() {
        return inPersonId;
    }

    public void setInPersonId(Integer inPersonId) {
        this.inPersonId = inPersonId;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getUpdatePersonId() {
        return updatePersonId;
    }

    public void setUpdatePersonId(Integer updatePersonId) {
        this.updatePersonId = updatePersonId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}