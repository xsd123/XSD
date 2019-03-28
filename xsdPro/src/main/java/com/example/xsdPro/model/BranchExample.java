package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BranchExample() {
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

        public Criteria andBranchCodeIsNull() {
            addCriterion("branch_code is null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNotNull() {
            addCriterion("branch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeEqualTo(String value) {
            addCriterion("branch_code =", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotEqualTo(String value) {
            addCriterion("branch_code <>", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThan(String value) {
            addCriterion("branch_code >", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("branch_code >=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThan(String value) {
            addCriterion("branch_code <", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("branch_code <=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLike(String value) {
            addCriterion("branch_code like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotLike(String value) {
            addCriterion("branch_code not like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIn(List<String> values) {
            addCriterion("branch_code in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotIn(List<String> values) {
            addCriterion("branch_code not in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeBetween(String value1, String value2) {
            addCriterion("branch_code between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotBetween(String value1, String value2) {
            addCriterion("branch_code not between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("branch_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("branch_name =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("branch_name <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("branch_name >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("branch_name <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("branch_name <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("branch_name like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("branch_name not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("branch_name in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("branch_name not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("branch_name between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("branch_name not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdIsNull() {
            addCriterion("Supser_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdIsNotNull() {
            addCriterion("Supser_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdEqualTo(Integer value) {
            addCriterion("Supser_branch_id =", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdNotEqualTo(Integer value) {
            addCriterion("Supser_branch_id <>", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdGreaterThan(Integer value) {
            addCriterion("Supser_branch_id >", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Supser_branch_id >=", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdLessThan(Integer value) {
            addCriterion("Supser_branch_id <", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("Supser_branch_id <=", value, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdIn(List<Integer> values) {
            addCriterion("Supser_branch_id in", values, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdNotIn(List<Integer> values) {
            addCriterion("Supser_branch_id not in", values, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("Supser_branch_id between", value1, value2, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andSupserBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Supser_branch_id not between", value1, value2, "supserBranchId");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyIsNull() {
            addCriterion("branch_property is null");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyIsNotNull() {
            addCriterion("branch_property is not null");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyEqualTo(Short value) {
            addCriterion("branch_property =", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyNotEqualTo(Short value) {
            addCriterion("branch_property <>", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyGreaterThan(Short value) {
            addCriterion("branch_property >", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyGreaterThanOrEqualTo(Short value) {
            addCriterion("branch_property >=", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyLessThan(Short value) {
            addCriterion("branch_property <", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyLessThanOrEqualTo(Short value) {
            addCriterion("branch_property <=", value, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyIn(List<Short> values) {
            addCriterion("branch_property in", values, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyNotIn(List<Short> values) {
            addCriterion("branch_property not in", values, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyBetween(Short value1, Short value2) {
            addCriterion("branch_property between", value1, value2, "branchProperty");
            return (Criteria) this;
        }

        public Criteria andBranchPropertyNotBetween(Short value1, Short value2) {
            addCriterion("branch_property not between", value1, value2, "branchProperty");
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

        public Criteria andHeadPersonIdIsNull() {
            addCriterion("head_person_id is null");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdIsNotNull() {
            addCriterion("head_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdEqualTo(Integer value) {
            addCriterion("head_person_id =", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdNotEqualTo(Integer value) {
            addCriterion("head_person_id <>", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdGreaterThan(Integer value) {
            addCriterion("head_person_id >", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("head_person_id >=", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdLessThan(Integer value) {
            addCriterion("head_person_id <", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("head_person_id <=", value, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdIn(List<Integer> values) {
            addCriterion("head_person_id in", values, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdNotIn(List<Integer> values) {
            addCriterion("head_person_id not in", values, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("head_person_id between", value1, value2, "headPersonId");
            return (Criteria) this;
        }

        public Criteria andHeadPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("head_person_id not between", value1, value2, "headPersonId");
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