package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusExample() {
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

        public Criteria andBusCodeIsNull() {
            addCriterion("bus_code is null");
            return (Criteria) this;
        }

        public Criteria andBusCodeIsNotNull() {
            addCriterion("bus_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusCodeEqualTo(String value) {
            addCriterion("bus_code =", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeNotEqualTo(String value) {
            addCriterion("bus_code <>", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeGreaterThan(String value) {
            addCriterion("bus_code >", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bus_code >=", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeLessThan(String value) {
            addCriterion("bus_code <", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeLessThanOrEqualTo(String value) {
            addCriterion("bus_code <=", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeLike(String value) {
            addCriterion("bus_code like", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeNotLike(String value) {
            addCriterion("bus_code not like", value, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeIn(List<String> values) {
            addCriterion("bus_code in", values, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeNotIn(List<String> values) {
            addCriterion("bus_code not in", values, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeBetween(String value1, String value2) {
            addCriterion("bus_code between", value1, value2, "busCode");
            return (Criteria) this;
        }

        public Criteria andBusCodeNotBetween(String value1, String value2) {
            addCriterion("bus_code not between", value1, value2, "busCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdIsNull() {
            addCriterion("Vehicle_system_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdIsNotNull() {
            addCriterion("Vehicle_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdEqualTo(Integer value) {
            addCriterion("Vehicle_system_id =", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdNotEqualTo(Integer value) {
            addCriterion("Vehicle_system_id <>", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdGreaterThan(Integer value) {
            addCriterion("Vehicle_system_id >", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_system_id >=", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdLessThan(Integer value) {
            addCriterion("Vehicle_system_id <", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_system_id <=", value, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdIn(List<Integer> values) {
            addCriterion("Vehicle_system_id in", values, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdNotIn(List<Integer> values) {
            addCriterion("Vehicle_system_id not in", values, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_system_id between", value1, value2, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_system_id not between", value1, value2, "vehicleSystemId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdIsNull() {
            addCriterion("Vehicle_type_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdIsNotNull() {
            addCriterion("Vehicle_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdEqualTo(Integer value) {
            addCriterion("Vehicle_type_id =", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdNotEqualTo(Integer value) {
            addCriterion("Vehicle_type_id <>", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdGreaterThan(Integer value) {
            addCriterion("Vehicle_type_id >", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_id >=", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdLessThan(Integer value) {
            addCriterion("Vehicle_type_id <", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_id <=", value, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdIn(List<Integer> values) {
            addCriterion("Vehicle_type_id in", values, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdNotIn(List<Integer> values) {
            addCriterion("Vehicle_type_id not in", values, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_id between", value1, value2, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_id not between", value1, value2, "vehicleTypeId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdIsNull() {
            addCriterion("Vehicle_type_in_color_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdIsNotNull() {
            addCriterion("Vehicle_type_in_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdEqualTo(Integer value) {
            addCriterion("Vehicle_type_in_color_id =", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdNotEqualTo(Integer value) {
            addCriterion("Vehicle_type_in_color_id <>", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdGreaterThan(Integer value) {
            addCriterion("Vehicle_type_in_color_id >", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_in_color_id >=", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdLessThan(Integer value) {
            addCriterion("Vehicle_type_in_color_id <", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_in_color_id <=", value, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdIn(List<Integer> values) {
            addCriterion("Vehicle_type_in_color_id in", values, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdNotIn(List<Integer> values) {
            addCriterion("Vehicle_type_in_color_id not in", values, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_in_color_id between", value1, value2, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeInColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_in_color_id not between", value1, value2, "vehicleTypeInColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdIsNull() {
            addCriterion("Vehicle_type_out_color_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdIsNotNull() {
            addCriterion("Vehicle_type_out_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdEqualTo(Integer value) {
            addCriterion("Vehicle_type_out_color_id =", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdNotEqualTo(Integer value) {
            addCriterion("Vehicle_type_out_color_id <>", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdGreaterThan(Integer value) {
            addCriterion("Vehicle_type_out_color_id >", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_out_color_id >=", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdLessThan(Integer value) {
            addCriterion("Vehicle_type_out_color_id <", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vehicle_type_out_color_id <=", value, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdIn(List<Integer> values) {
            addCriterion("Vehicle_type_out_color_id in", values, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdNotIn(List<Integer> values) {
            addCriterion("Vehicle_type_out_color_id not in", values, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_out_color_id between", value1, value2, "vehicleTypeOutColorId");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeOutColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vehicle_type_out_color_id not between", value1, value2, "vehicleTypeOutColorId");
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

        public Criteria andMinStockIsNull() {
            addCriterion("min_stock is null");
            return (Criteria) this;
        }

        public Criteria andMinStockIsNotNull() {
            addCriterion("min_stock is not null");
            return (Criteria) this;
        }

        public Criteria andMinStockEqualTo(Integer value) {
            addCriterion("min_stock =", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotEqualTo(Integer value) {
            addCriterion("min_stock <>", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThan(Integer value) {
            addCriterion("min_stock >", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_stock >=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThan(Integer value) {
            addCriterion("min_stock <", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThanOrEqualTo(Integer value) {
            addCriterion("min_stock <=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockIn(List<Integer> values) {
            addCriterion("min_stock in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotIn(List<Integer> values) {
            addCriterion("min_stock not in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockBetween(Integer value1, Integer value2) {
            addCriterion("min_stock between", value1, value2, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotBetween(Integer value1, Integer value2) {
            addCriterion("min_stock not between", value1, value2, "minStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockIsNull() {
            addCriterion("max_stock is null");
            return (Criteria) this;
        }

        public Criteria andMaxStockIsNotNull() {
            addCriterion("max_stock is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStockEqualTo(Integer value) {
            addCriterion("max_stock =", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotEqualTo(Integer value) {
            addCriterion("max_stock <>", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThan(Integer value) {
            addCriterion("max_stock >", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_stock >=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThan(Integer value) {
            addCriterion("max_stock <", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThanOrEqualTo(Integer value) {
            addCriterion("max_stock <=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockIn(List<Integer> values) {
            addCriterion("max_stock in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotIn(List<Integer> values) {
            addCriterion("max_stock not in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockBetween(Integer value1, Integer value2) {
            addCriterion("max_stock between", value1, value2, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotBetween(Integer value1, Integer value2) {
            addCriterion("max_stock not between", value1, value2, "maxStock");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIsNull() {
            addCriterion("remind_flag is null");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIsNotNull() {
            addCriterion("remind_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRemindFlagEqualTo(Boolean value) {
            addCriterion("remind_flag =", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotEqualTo(Boolean value) {
            addCriterion("remind_flag <>", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagGreaterThan(Boolean value) {
            addCriterion("remind_flag >", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("remind_flag >=", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagLessThan(Boolean value) {
            addCriterion("remind_flag <", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("remind_flag <=", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIn(List<Boolean> values) {
            addCriterion("remind_flag in", values, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotIn(List<Boolean> values) {
            addCriterion("remind_flag not in", values, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("remind_flag between", value1, value2, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("remind_flag not between", value1, value2, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameIsNull() {
            addCriterion("ins_person_name is null");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameIsNotNull() {
            addCriterion("ins_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameEqualTo(String value) {
            addCriterion("ins_person_name =", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameNotEqualTo(String value) {
            addCriterion("ins_person_name <>", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameGreaterThan(String value) {
            addCriterion("ins_person_name >", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("ins_person_name >=", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameLessThan(String value) {
            addCriterion("ins_person_name <", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameLessThanOrEqualTo(String value) {
            addCriterion("ins_person_name <=", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameLike(String value) {
            addCriterion("ins_person_name like", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameNotLike(String value) {
            addCriterion("ins_person_name not like", value, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameIn(List<String> values) {
            addCriterion("ins_person_name in", values, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameNotIn(List<String> values) {
            addCriterion("ins_person_name not in", values, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameBetween(String value1, String value2) {
            addCriterion("ins_person_name between", value1, value2, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsPersonNameNotBetween(String value1, String value2) {
            addCriterion("ins_person_name not between", value1, value2, "insPersonName");
            return (Criteria) this;
        }

        public Criteria andInsDateIsNull() {
            addCriterion("ins_date is null");
            return (Criteria) this;
        }

        public Criteria andInsDateIsNotNull() {
            addCriterion("ins_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsDateEqualTo(Date value) {
            addCriterion("ins_date =", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateNotEqualTo(Date value) {
            addCriterion("ins_date <>", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateGreaterThan(Date value) {
            addCriterion("ins_date >", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_date >=", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateLessThan(Date value) {
            addCriterion("ins_date <", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateLessThanOrEqualTo(Date value) {
            addCriterion("ins_date <=", value, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateIn(List<Date> values) {
            addCriterion("ins_date in", values, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateNotIn(List<Date> values) {
            addCriterion("ins_date not in", values, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateBetween(Date value1, Date value2) {
            addCriterion("ins_date between", value1, value2, "insDate");
            return (Criteria) this;
        }

        public Criteria andInsDateNotBetween(Date value1, Date value2) {
            addCriterion("ins_date not between", value1, value2, "insDate");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNull() {
            addCriterion("update_person_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNotNull() {
            addCriterion("update_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameEqualTo(String value) {
            addCriterion("update_person_name =", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotEqualTo(String value) {
            addCriterion("update_person_name <>", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThan(String value) {
            addCriterion("update_person_name >", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_person_name >=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThan(String value) {
            addCriterion("update_person_name <", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("update_person_name <=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLike(String value) {
            addCriterion("update_person_name like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotLike(String value) {
            addCriterion("update_person_name not like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIn(List<String> values) {
            addCriterion("update_person_name in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotIn(List<String> values) {
            addCriterion("update_person_name not in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameBetween(String value1, String value2) {
            addCriterion("update_person_name between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotBetween(String value1, String value2) {
            addCriterion("update_person_name not between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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