package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartPropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartPropertiesExample() {
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

        public Criteria andPartPropertiesIdIsNull() {
            addCriterion("part_properties_id is null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdIsNotNull() {
            addCriterion("part_properties_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdEqualTo(Integer value) {
            addCriterion("part_properties_id =", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdNotEqualTo(Integer value) {
            addCriterion("part_properties_id <>", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdGreaterThan(Integer value) {
            addCriterion("part_properties_id >", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_properties_id >=", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdLessThan(Integer value) {
            addCriterion("part_properties_id <", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdLessThanOrEqualTo(Integer value) {
            addCriterion("part_properties_id <=", value, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdIn(List<Integer> values) {
            addCriterion("part_properties_id in", values, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdNotIn(List<Integer> values) {
            addCriterion("part_properties_id not in", values, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdBetween(Integer value1, Integer value2) {
            addCriterion("part_properties_id between", value1, value2, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("part_properties_id not between", value1, value2, "partPropertiesId");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeIsNull() {
            addCriterion("part_properties_code is null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeIsNotNull() {
            addCriterion("part_properties_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeEqualTo(String value) {
            addCriterion("part_properties_code =", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeNotEqualTo(String value) {
            addCriterion("part_properties_code <>", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeGreaterThan(String value) {
            addCriterion("part_properties_code >", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("part_properties_code >=", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeLessThan(String value) {
            addCriterion("part_properties_code <", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeLessThanOrEqualTo(String value) {
            addCriterion("part_properties_code <=", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeLike(String value) {
            addCriterion("part_properties_code like", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeNotLike(String value) {
            addCriterion("part_properties_code not like", value, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeIn(List<String> values) {
            addCriterion("part_properties_code in", values, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeNotIn(List<String> values) {
            addCriterion("part_properties_code not in", values, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeBetween(String value1, String value2) {
            addCriterion("part_properties_code between", value1, value2, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesCodeNotBetween(String value1, String value2) {
            addCriterion("part_properties_code not between", value1, value2, "partPropertiesCode");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameIsNull() {
            addCriterion("part_properties_name is null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameIsNotNull() {
            addCriterion("part_properties_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameEqualTo(String value) {
            addCriterion("part_properties_name =", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameNotEqualTo(String value) {
            addCriterion("part_properties_name <>", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameGreaterThan(String value) {
            addCriterion("part_properties_name >", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_properties_name >=", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameLessThan(String value) {
            addCriterion("part_properties_name <", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameLessThanOrEqualTo(String value) {
            addCriterion("part_properties_name <=", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameLike(String value) {
            addCriterion("part_properties_name like", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameNotLike(String value) {
            addCriterion("part_properties_name not like", value, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameIn(List<String> values) {
            addCriterion("part_properties_name in", values, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameNotIn(List<String> values) {
            addCriterion("part_properties_name not in", values, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameBetween(String value1, String value2) {
            addCriterion("part_properties_name between", value1, value2, "partPropertiesName");
            return (Criteria) this;
        }

        public Criteria andPartPropertiesNameNotBetween(String value1, String value2) {
            addCriterion("part_properties_name not between", value1, value2, "partPropertiesName");
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

        public Criteria andInsPersonIdIsNull() {
            addCriterion("ins_person_id is null");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdIsNotNull() {
            addCriterion("ins_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdEqualTo(Integer value) {
            addCriterion("ins_person_id =", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdNotEqualTo(Integer value) {
            addCriterion("ins_person_id <>", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdGreaterThan(Integer value) {
            addCriterion("ins_person_id >", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_person_id >=", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdLessThan(Integer value) {
            addCriterion("ins_person_id <", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("ins_person_id <=", value, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdIn(List<Integer> values) {
            addCriterion("ins_person_id in", values, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdNotIn(List<Integer> values) {
            addCriterion("ins_person_id not in", values, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("ins_person_id between", value1, value2, "insPersonId");
            return (Criteria) this;
        }

        public Criteria andInsPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_person_id not between", value1, value2, "insPersonId");
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