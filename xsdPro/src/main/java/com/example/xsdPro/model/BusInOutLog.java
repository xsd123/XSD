package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.Date;

public class BusInOutLog extends BusInOutLogKey {
    private Integer busId;

    private Boolean inOutFlag;

    private String indentNumer;

    private Integer vehicleTypePackageId;

    private BigDecimal amount;

    private Integer personId;

    private Date dateTime;

    private String frameNumber;

    private String engineNumber;

    public BusInOutLog(Integer companyId, Integer branchId, Integer id, Integer busId, Boolean inOutFlag, String indentNumer, Integer vehicleTypePackageId, BigDecimal amount, Integer personId, Date dateTime, String frameNumber, String engineNumber) {
        super(companyId, branchId, id);
        this.busId = busId;
        this.inOutFlag = inOutFlag;
        this.indentNumer = indentNumer;
        this.vehicleTypePackageId = vehicleTypePackageId;
        this.amount = amount;
        this.personId = personId;
        this.dateTime = dateTime;
        this.frameNumber = frameNumber;
        this.engineNumber = engineNumber;
    }

    public BusInOutLog() {
        super();
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Boolean getInOutFlag() {
        return inOutFlag;
    }

    public void setInOutFlag(Boolean inOutFlag) {
        this.inOutFlag = inOutFlag;
    }

    public String getIndentNumer() {
        return indentNumer;
    }

    public void setIndentNumer(String indentNumer) {
        this.indentNumer = indentNumer == null ? null : indentNumer.trim();
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

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
}