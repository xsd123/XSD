package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonTargetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonTargetExample() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andTYearIsNull() {
            addCriterion("T_year is null");
            return (Criteria) this;
        }

        public Criteria andTYearIsNotNull() {
            addCriterion("T_year is not null");
            return (Criteria) this;
        }

        public Criteria andTYearEqualTo(Integer value) {
            addCriterion("T_year =", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotEqualTo(Integer value) {
            addCriterion("T_year <>", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThan(Integer value) {
            addCriterion("T_year >", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_year >=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThan(Integer value) {
            addCriterion("T_year <", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThanOrEqualTo(Integer value) {
            addCriterion("T_year <=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearIn(List<Integer> values) {
            addCriterion("T_year in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotIn(List<Integer> values) {
            addCriterion("T_year not in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearBetween(Integer value1, Integer value2) {
            addCriterion("T_year between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotBetween(Integer value1, Integer value2) {
            addCriterion("T_year not between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTMonthIsNull() {
            addCriterion("T_month is null");
            return (Criteria) this;
        }

        public Criteria andTMonthIsNotNull() {
            addCriterion("T_month is not null");
            return (Criteria) this;
        }

        public Criteria andTMonthEqualTo(Integer value) {
            addCriterion("T_month =", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotEqualTo(Integer value) {
            addCriterion("T_month <>", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthGreaterThan(Integer value) {
            addCriterion("T_month >", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_month >=", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthLessThan(Integer value) {
            addCriterion("T_month <", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthLessThanOrEqualTo(Integer value) {
            addCriterion("T_month <=", value, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthIn(List<Integer> values) {
            addCriterion("T_month in", values, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotIn(List<Integer> values) {
            addCriterion("T_month not in", values, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthBetween(Integer value1, Integer value2) {
            addCriterion("T_month between", value1, value2, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("T_month not between", value1, value2, "tMonth");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNull() {
            addCriterion("target_amount is null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNotNull() {
            addCriterion("target_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountEqualTo(Integer value) {
            addCriterion("target_amount =", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotEqualTo(Integer value) {
            addCriterion("target_amount <>", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThan(Integer value) {
            addCriterion("target_amount >", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_amount >=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThan(Integer value) {
            addCriterion("target_amount <", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThanOrEqualTo(Integer value) {
            addCriterion("target_amount <=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIn(List<Integer> values) {
            addCriterion("target_amount in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotIn(List<Integer> values) {
            addCriterion("target_amount not in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountBetween(Integer value1, Integer value2) {
            addCriterion("target_amount between", value1, value2, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("target_amount not between", value1, value2, "targetAmount");
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