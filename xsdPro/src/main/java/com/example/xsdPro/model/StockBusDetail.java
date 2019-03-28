package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.Date;

public class StockBusDetail extends StockBusDetailKey {
    private Integer storeHouseId;

    private String frameNumber;

    private String engineNumber;

    private String standard;

    private String busYear;

    private Date manufactureDate;

    private Date tDate;

    private Date inDate;

    private Integer inPersonId;

    private Integer freeDay;

    private Integer vehicleTypePackageId;

    private BigDecimal amount;

    private BigDecimal price;

    private String indentNumber;

    private String inNumber;

    private String outNumber;

    private Boolean outFlag;

    private Date outDate;

    private Integer outPersonId;

    private Boolean lockFlag;

    public StockBusDetail(Integer companyId, Integer branchId, Integer storeId, Integer busId, Integer id, Integer storeHouseId, String frameNumber, String engineNumber, String standard, String busYear, Date manufactureDate, Date tDate, Date inDate, Integer inPersonId, Integer freeDay, Integer vehicleTypePackageId, BigDecimal amount, BigDecimal price, String indentNumber, String inNumber, String outNumber, Boolean outFlag, Date outDate, Integer outPersonId, Boolean lockFlag) {
        super(companyId, branchId, storeId, busId, id);
        this.storeHouseId = storeHouseId;
        this.frameNumber = frameNumber;
        this.engineNumber = engineNumber;
        this.standard = standard;
        this.busYear = busYear;
        this.manufactureDate = manufactureDate;
        this.tDate = tDate;
        this.inDate = inDate;
        this.inPersonId = inPersonId;
        this.freeDay = freeDay;
        this.vehicleTypePackageId = vehicleTypePackageId;
        this.amount = amount;
        this.price = price;
        this.indentNumber = indentNumber;
        this.inNumber = inNumber;
        this.outNumber = outNumber;
        this.outFlag = outFlag;
        this.outDate = outDate;
        this.outPersonId = outPersonId;
        this.lockFlag = lockFlag;
    }

    public StockBusDetail() {
        super();
    }

    public Integer getStoreHouseId() {
        return storeHouseId;
    }

    public void setStoreHouseId(Integer storeHouseId) {
        this.storeHouseId = storeHouseId;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber == null ? null : frameNumber.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getBusYear() {
        return busYear;
    }

    public void setBusYear(String busYear) {
        this.busYear = busYear == null ? null : busYear.trim();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getInPersonId() {
        return inPersonId;
    }

    public void setInPersonId(Integer inPersonId) {
        this.inPersonId = inPersonId;
    }

    public Integer getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(Integer freeDay) {
        this.freeDay = freeDay;
    }

    public Integer getVehicleTypePackageId() {
        return vehicleTypePackageId;
    }

    public void setVehicleTypePackageId(Integer vehicleTypePackageId) {
        this.vehicleTypePackageId = vehicleTypePackageId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIndentNumber() {
        return indentNumber;
    }

    public void setIndentNumber(String indentNumber) {
        this.indentNumber = indentNumber == null ? null : indentNumber.trim();
    }

    public String getInNumber() {
        return inNumber;
    }

    public void setInNumber(String inNumber) {
        this.inNumber = inNumber == null ? null : inNumber.trim();
    }

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber == null ? null : outNumber.trim();
    }

    public Boolean getOutFlag() {
        return outFlag;
    }

    public void setOutFlag(Boolean outFlag) {
        this.outFlag = outFlag;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Integer getOutPersonId() {
        return outPersonId;
    }

    public void setOutPersonId(Integer outPersonId) {
        this.outPersonId = outPersonId;
    }

    public Boolean getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Boolean lockFlag) {
        this.lockFlag = lockFlag;
    }
}