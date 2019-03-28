package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.List;

public class VehicleSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleSystemExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
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

        public Criteria andVehicleSystemCodeIsNull() {
            addCriterion("Vehicle_system_code is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeIsNotNull() {
            addCriterion("Vehicle_system_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeEqualTo(String value) {
            addCriterion("Vehicle_system_code =", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeNotEqualTo(String value) {
            addCriterion("Vehicle_system_code <>", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeGreaterThan(String value) {
            addCriterion("Vehicle_system_code >", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Vehicle_system_code >=", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeLessThan(String value) {
            addCriterion("Vehicle_system_code <", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("Vehicle_system_code <=", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeLike(String value) {
            addCriterion("Vehicle_system_code like", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeNotLike(String value) {
            addCriterion("Vehicle_system_code not like", value, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeIn(List<String> values) {
            addCriterion("Vehicle_system_code in", values, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeNotIn(List<String> values) {
            addCriterion("Vehicle_system_code not in", values, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeBetween(String value1, String value2) {
            addCriterion("Vehicle_system_code between", value1, value2, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemCodeNotBetween(String value1, String value2) {
            addCriterion("Vehicle_system_code not between", value1, value2, "vehicleSystemCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameIsNull() {
            addCriterion("Vehicle_system_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameIsNotNull() {
            addCriterion("Vehicle_system_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameEqualTo(String value) {
            addCriterion("Vehicle_system_NAME =", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameNotEqualTo(String value) {
            addCriterion("Vehicle_system_NAME <>", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameGreaterThan(String value) {
            addCriterion("Vehicle_system_NAME >", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("Vehicle_system_NAME >=", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameLessThan(String value) {
            addCriterion("Vehicle_system_NAME <", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameLessThanOrEqualTo(String value) {
            addCriterion("Vehicle_system_NAME <=", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameLike(String value) {
            addCriterion("Vehicle_system_NAME like", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameNotLike(String value) {
            addCriterion("Vehicle_system_NAME not like", value, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameIn(List<String> values) {
            addCriterion("Vehicle_system_NAME in", values, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameNotIn(List<String> values) {
            addCriterion("Vehicle_system_NAME not in", values, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameBetween(String value1, String value2) {
            addCriterion("Vehicle_system_NAME between", value1, value2, "vehicleSystemName");
            return (Criteria) this;
        }

        public Criteria andVehicleSystemNameNotBetween(String value1, String value2) {
            addCriterion("Vehicle_system_NAME not between", value1, value2, "vehicleSystemName");
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