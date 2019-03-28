package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.List;

public class StoreHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreHouseExample() {
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

        public Criteria andStoreHouseCodeIsNull() {
            addCriterion("store_house_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeIsNotNull() {
            addCriterion("store_house_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeEqualTo(String value) {
            addCriterion("store_house_code =", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeNotEqualTo(String value) {
            addCriterion("store_house_code <>", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeGreaterThan(String value) {
            addCriterion("store_house_code >", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_house_code >=", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeLessThan(String value) {
            addCriterion("store_house_code <", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeLessThanOrEqualTo(String value) {
            addCriterion("store_house_code <=", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeLike(String value) {
            addCriterion("store_house_code like", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeNotLike(String value) {
            addCriterion("store_house_code not like", value, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeIn(List<String> values) {
            addCriterion("store_house_code in", values, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeNotIn(List<String> values) {
            addCriterion("store_house_code not in", values, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeBetween(String value1, String value2) {
            addCriterion("store_house_code between", value1, value2, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseCodeNotBetween(String value1, String value2) {
            addCriterion("store_house_code not between", value1, value2, "storeHouseCode");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameIsNull() {
            addCriterion("store_house_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameIsNotNull() {
            addCriterion("store_house_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameEqualTo(String value) {
            addCriterion("store_house_name =", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameNotEqualTo(String value) {
            addCriterion("store_house_name <>", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameGreaterThan(String value) {
            addCriterion("store_house_name >", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_house_name >=", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameLessThan(String value) {
            addCriterion("store_house_name <", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameLessThanOrEqualTo(String value) {
            addCriterion("store_house_name <=", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameLike(String value) {
            addCriterion("store_house_name like", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameNotLike(String value) {
            addCriterion("store_house_name not like", value, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameIn(List<String> values) {
            addCriterion("store_house_name in", values, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameNotIn(List<String> values) {
            addCriterion("store_house_name not in", values, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameBetween(String value1, String value2) {
            addCriterion("store_house_name between", value1, value2, "storeHouseName");
            return (Criteria) this;
        }

        public Criteria andStoreHouseNameNotBetween(String value1, String value2) {
            addCriterion("store_house_name not between", value1, value2, "storeHouseName");
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