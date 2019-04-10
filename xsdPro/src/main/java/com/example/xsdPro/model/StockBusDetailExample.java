package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockBusDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockBusDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Integer value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Integer value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Integer value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Integer value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Integer> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Integer> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNull() {
            addCriterion("bus_id is null");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNotNull() {
            addCriterion("bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusIdEqualTo(Integer value) {
            addCriterion("bus_id =", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotEqualTo(Integer value) {
            addCriterion("bus_id <>", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThan(Integer value) {
            addCriterion("bus_id >", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_id >=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThan(Integer value) {
            addCriterion("bus_id <", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bus_id <=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdIn(List<Integer> values) {
            addCriterion("bus_id in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotIn(List<Integer> values) {
            addCriterion("bus_id not in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdBetween(Integer value1, Integer value2) {
            addCriterion("bus_id between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_id not between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdIsNull() {
            addCriterion("store_house_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdIsNotNull() {
            addCriterion("store_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdEqualTo(Integer value) {
            addCriterion("store_house_id =", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdNotEqualTo(Integer value) {
            addCriterion("store_house_id <>", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdGreaterThan(Integer value) {
            addCriterion("store_house_id >", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_house_id >=", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdLessThan(Integer value) {
            addCriterion("store_house_id <", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_house_id <=", value, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdIn(List<Integer> values) {
            addCriterion("store_house_id in", values, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdNotIn(List<Integer> values) {
            addCriterion("store_house_id not in", values, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("store_house_id between", value1, value2, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andStoreHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_house_id not between", value1, value2, "storeHouseId");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNull() {
            addCriterion("Frame_number is null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNotNull() {
            addCriterion("Frame_number is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberEqualTo(String value) {
            addCriterion("Frame_number =", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotEqualTo(String value) {
            addCriterion("Frame_number <>", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThan(String value) {
            addCriterion("Frame_number >", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Frame_number >=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThan(String value) {
            addCriterion("Frame_number <", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThanOrEqualTo(String value) {
            addCriterion("Frame_number <=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLike(String value) {
            addCriterion("Frame_number like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotLike(String value) {
            addCriterion("Frame_number not like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIn(List<String> values) {
            addCriterion("Frame_number in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotIn(List<String> values) {
            addCriterion("Frame_number not in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberBetween(String value1, String value2) {
            addCriterion("Frame_number between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotBetween(String value1, String value2) {
            addCriterion("Frame_number not between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("Engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("Engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("Engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("Engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("Engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("Engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("Engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("Engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("Engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("Engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("Engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("Engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("Engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andBusYearIsNull() {
            addCriterion("bus_year is null");
            return (Criteria) this;
        }

        public Criteria andBusYearIsNotNull() {
            addCriterion("bus_year is not null");
            return (Criteria) this;
        }

        public Criteria andBusYearEqualTo(String value) {
            addCriterion("bus_year =", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearNotEqualTo(String value) {
            addCriterion("bus_year <>", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearGreaterThan(String value) {
            addCriterion("bus_year >", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearGreaterThanOrEqualTo(String value) {
            addCriterion("bus_year >=", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearLessThan(String value) {
            addCriterion("bus_year <", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearLessThanOrEqualTo(String value) {
            addCriterion("bus_year <=", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearLike(String value) {
            addCriterion("bus_year like", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearNotLike(String value) {
            addCriterion("bus_year not like", value, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearIn(List<String> values) {
            addCriterion("bus_year in", values, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearNotIn(List<String> values) {
            addCriterion("bus_year not in", values, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearBetween(String value1, String value2) {
            addCriterion("bus_year between", value1, value2, "busYear");
            return (Criteria) this;
        }

        public Criteria andBusYearNotBetween(String value1, String value2) {
            addCriterion("bus_year not between", value1, value2, "busYear");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNull() {
            addCriterion("manufacture_date is null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNotNull() {
            addCriterion("manufacture_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateEqualTo(Date value) {
            addCriterion("manufacture_date =", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotEqualTo(Date value) {
            addCriterion("manufacture_date <>", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThan(Date value) {
            addCriterion("manufacture_date >", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThanOrEqualTo(Date value) {
            addCriterion("manufacture_date >=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThan(Date value) {
            addCriterion("manufacture_date <", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThanOrEqualTo(Date value) {
            addCriterion("manufacture_date <=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIn(List<Date> values) {
            addCriterion("manufacture_date in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotIn(List<Date> values) {
            addCriterion("manufacture_date not in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateBetween(Date value1, Date value2) {
            addCriterion("manufacture_date between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotBetween(Date value1, Date value2) {
            addCriterion("manufacture_date not between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andTDateIsNull() {
            addCriterion("T_date is null");
            return (Criteria) this;
        }

        public Criteria andTDateIsNotNull() {
            addCriterion("T_date is not null");
            return (Criteria) this;
        }

        public Criteria andTDateEqualTo(Date value) {
            addCriterion("T_date =", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotEqualTo(Date value) {
            addCriterion("T_date <>", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThan(Date value) {
            addCriterion("T_date >", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThanOrEqualTo(Date value) {
            addCriterion("T_date >=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThan(Date value) {
            addCriterion("T_date <", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThanOrEqualTo(Date value) {
            addCriterion("T_date <=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateIn(List<Date> values) {
            addCriterion("T_date in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotIn(List<Date> values) {
            addCriterion("T_date not in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateBetween(Date value1, Date value2) {
            addCriterion("T_date between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotBetween(Date value1, Date value2) {
            addCriterion("T_date not between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInPersonIdIsNull() {
            addCriterion("in_person_id is null");
            return (Criteria) this;
        }

        public Criteria andInPersonIdIsNotNull() {
            addCriterion("in_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andInPersonIdEqualTo(Integer value) {
            addCriterion("in_person_id =", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdNotEqualTo(Integer value) {
            addCriterion("in_person_id <>", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdGreaterThan(Integer value) {
            addCriterion("in_person_id >", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_person_id >=", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdLessThan(Integer value) {
            addCriterion("in_person_id <", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_person_id <=", value, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdIn(List<Integer> values) {
            addCriterion("in_person_id in", values, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdNotIn(List<Integer> values) {
            addCriterion("in_person_id not in", values, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("in_person_id between", value1, value2, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andInPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_person_id not between", value1, value2, "inPersonId");
            return (Criteria) this;
        }

        public Criteria andFreeDayIsNull() {
            addCriterion("free_day is null");
            return (Criteria) this;
        }

        public Criteria andFreeDayIsNotNull() {
            addCriterion("free_day is not null");
            return (Criteria) this;
        }

        public Criteria andFreeDayEqualTo(Integer value) {
            addCriterion("free_day =", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayNotEqualTo(Integer value) {
            addCriterion("free_day <>", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayGreaterThan(Integer value) {
            addCriterion("free_day >", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_day >=", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayLessThan(Integer value) {
            addCriterion("free_day <", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayLessThanOrEqualTo(Integer value) {
            addCriterion("free_day <=", value, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayIn(List<Integer> values) {
            addCriterion("free_day in", values, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayNotIn(List<Integer> values) {
            addCriterion("free_day not in", values, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayBetween(Integer value1, Integer value2) {
            addCriterion("free_day between", value1, value2, "freeDay");
            return (Criteria) this;
        }

        public Criteria andFreeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("free_day not between", value1, value2, "freeDay");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdIsNull() {
            addCriterion("Vehicle_type_package_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdIsNotNull() {
            addCriterion("Vehicle_type_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdEqualTo(Integer value) {
            addCriterion("Vehicle_type_package_id =", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdNotEqualTo(Integer value) {
            addCriterion("Vehicle_type_package_id <>", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdGreaterThan(Integer value) {
            addCriterion("Vehicle_type_package_id >", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_package_id >=", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdLessThan(Integer value) {
            addCriterion("Vehicle_type_package_id <", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_package_id <=", value, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdIn(List<Integer> values) {
            addCriterion("Vehicle_type_package_id in", values, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdNotIn(List<Integer> values) {
            addCriterion("Vehicle_type_package_id not in", values, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_package_id between", value1, value2, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypePackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_package_id not between", value1, value2, "vehicleTypePackageId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIndentNumberIsNull() {
            addCriterion("indent_number is null");
            return (Criteria) this;
        }

        public Criteria andIndentNumberIsNotNull() {
            addCriterion("indent_number is not null");
            return (Criteria) this;
        }

        public Criteria andIndentNumberEqualTo(String value) {
            addCriterion("indent_number =", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberNotEqualTo(String value) {
            addCriterion("indent_number <>", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberGreaterThan(String value) {
            addCriterion("indent_number >", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("indent_number >=", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberLessThan(String value) {
            addCriterion("indent_number <", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberLessThanOrEqualTo(String value) {
            addCriterion("indent_number <=", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberLike(String value) {
            addCriterion("indent_number like", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberNotLike(String value) {
            addCriterion("indent_number not like", value, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberIn(List<String> values) {
            addCriterion("indent_number in", values, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberNotIn(List<String> values) {
            addCriterion("indent_number not in", values, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberBetween(String value1, String value2) {
            addCriterion("indent_number between", value1, value2, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andIndentNumberNotBetween(String value1, String value2) {
            addCriterion("indent_number not between", value1, value2, "indentNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberIsNull() {
            addCriterion("in_number is null");
            return (Criteria) this;
        }

        public Criteria andInNumberIsNotNull() {
            addCriterion("in_number is not null");
            return (Criteria) this;
        }

        public Criteria andInNumberEqualTo(String value) {
            addCriterion("in_number =", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotEqualTo(String value) {
            addCriterion("in_number <>", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberGreaterThan(String value) {
            addCriterion("in_number >", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberGreaterThanOrEqualTo(String value) {
            addCriterion("in_number >=", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberLessThan(String value) {
            addCriterion("in_number <", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberLessThanOrEqualTo(String value) {
            addCriterion("in_number <=", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberLike(String value) {
            addCriterion("in_number like", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotLike(String value) {
            addCriterion("in_number not like", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberIn(List<String> values) {
            addCriterion("in_number in", values, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotIn(List<String> values) {
            addCriterion("in_number not in", values, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberBetween(String value1, String value2) {
            addCriterion("in_number between", value1, value2, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotBetween(String value1, String value2) {
            addCriterion("in_number not between", value1, value2, "inNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNull() {
            addCriterion("out_number is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("out_number is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(String value) {
            addCriterion("out_number =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(String value) {
            addCriterion("out_number <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(String value) {
            addCriterion("out_number >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(String value) {
            addCriterion("out_number >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(String value) {
            addCriterion("out_number <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(String value) {
            addCriterion("out_number <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLike(String value) {
            addCriterion("out_number like", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotLike(String value) {
            addCriterion("out_number not like", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<String> values) {
            addCriterion("out_number in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<String> values) {
            addCriterion("out_number not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(String value1, String value2) {
            addCriterion("out_number between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(String value1, String value2) {
            addCriterion("out_number not between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutFlagIsNull() {
            addCriterion("out_flag is null");
            return (Criteria) this;
        }

        public Criteria andOutFlagIsNotNull() {
            addCriterion("out_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOutFlagEqualTo(Boolean value) {
            addCriterion("out_flag =", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagNotEqualTo(Boolean value) {
            addCriterion("out_flag <>", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagGreaterThan(Boolean value) {
            addCriterion("out_flag >", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("out_flag >=", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagLessThan(Boolean value) {
            addCriterion("out_flag <", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("out_flag <=", value, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagIn(List<Boolean> values) {
            addCriterion("out_flag in", values, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagNotIn(List<Boolean> values) {
            addCriterion("out_flag not in", values, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("out_flag between", value1, value2, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("out_flag not between", value1, value2, "outFlag");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNull() {
            addCriterion("out_date is null");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNotNull() {
            addCriterion("out_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutDateEqualTo(Date value) {
            addCriterion("out_date =", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotEqualTo(Date value) {
            addCriterion("out_date <>", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThan(Date value) {
            addCriterion("out_date >", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("out_date >=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThan(Date value) {
            addCriterion("out_date <", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThanOrEqualTo(Date value) {
            addCriterion("out_date <=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIn(List<Date> values) {
            addCriterion("out_date in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotIn(List<Date> values) {
            addCriterion("out_date not in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateBetween(Date value1, Date value2) {
            addCriterion("out_date between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotBetween(Date value1, Date value2) {
            addCriterion("out_date not between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdIsNull() {
            addCriterion("out_person_id is null");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdIsNotNull() {
            addCriterion("out_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdEqualTo(Integer value) {
            addCriterion("out_person_id =", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdNotEqualTo(Integer value) {
            addCriterion("out_person_id <>", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdGreaterThan(Integer value) {
            addCriterion("out_person_id >", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_person_id >=", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdLessThan(Integer value) {
            addCriterion("out_person_id <", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_person_id <=", value, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdIn(List<Integer> values) {
            addCriterion("out_person_id in", values, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdNotIn(List<Integer> values) {
            addCriterion("out_person_id not in", values, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("out_person_id between", value1, value2, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andOutPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_person_id not between", value1, value2, "outPersonId");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNull() {
            addCriterion("lock_flag is null");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNotNull() {
            addCriterion("lock_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLockFlagEqualTo(Boolean value) {
            addCriterion("lock_flag =", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotEqualTo(Boolean value) {
            addCriterion("lock_flag <>", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThan(Boolean value) {
            addCriterion("lock_flag >", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lock_flag >=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThan(Boolean value) {
            addCriterion("lock_flag <", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("lock_flag <=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagIn(List<Boolean> values) {
            addCriterion("lock_flag in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotIn(List<Boolean> values) {
            addCriterion("lock_flag not in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_flag between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_flag not between", value1, value2, "lockFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}