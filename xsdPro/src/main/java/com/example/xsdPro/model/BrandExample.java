package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandCodeIsNull() {
            addCriterion("brand_code is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brand_code is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(String value) {
            addCriterion("brand_code =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(String value) {
            addCriterion("brand_code <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(String value) {
            addCriterion("brand_code >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_code >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(String value) {
            addCriterion("brand_code <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("brand_code <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLike(String value) {
            addCriterion("brand_code like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotLike(String value) {
            addCriterion("brand_code not like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<String> values) {
            addCriterion("brand_code in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<String> values) {
            addCriterion("brand_code not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(String value1, String value2) {
            addCriterion("brand_code between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(String value1, String value2) {
            addCriterion("brand_code not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixIsNull() {
            addCriterion("customer_code_prefix is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixIsNotNull() {
            addCriterion("customer_code_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixEqualTo(String value) {
            addCriterion("customer_code_prefix =", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixNotEqualTo(String value) {
            addCriterion("customer_code_prefix <>", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixGreaterThan(String value) {
            addCriterion("customer_code_prefix >", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code_prefix >=", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixLessThan(String value) {
            addCriterion("customer_code_prefix <", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixLessThanOrEqualTo(String value) {
            addCriterion("customer_code_prefix <=", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixLike(String value) {
            addCriterion("customer_code_prefix like", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixNotLike(String value) {
            addCriterion("customer_code_prefix not like", value, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixIn(List<String> values) {
            addCriterion("customer_code_prefix in", values, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixNotIn(List<String> values) {
            addCriterion("customer_code_prefix not in", values, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixBetween(String value1, String value2) {
            addCriterion("customer_code_prefix between", value1, value2, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andCustomerCodePrefixNotBetween(String value1, String value2) {
            addCriterion("customer_code_prefix not between", value1, value2, "customerCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixIsNull() {
            addCriterion("indent_code_prefix is null");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixIsNotNull() {
            addCriterion("indent_code_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixEqualTo(String value) {
            addCriterion("indent_code_prefix =", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixNotEqualTo(String value) {
            addCriterion("indent_code_prefix <>", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixGreaterThan(String value) {
            addCriterion("indent_code_prefix >", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("indent_code_prefix >=", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixLessThan(String value) {
            addCriterion("indent_code_prefix <", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixLessThanOrEqualTo(String value) {
            addCriterion("indent_code_prefix <=", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixLike(String value) {
            addCriterion("indent_code_prefix like", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixNotLike(String value) {
            addCriterion("indent_code_prefix not like", value, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixIn(List<String> values) {
            addCriterion("indent_code_prefix in", values, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixNotIn(List<String> values) {
            addCriterion("indent_code_prefix not in", values, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixBetween(String value1, String value2) {
            addCriterion("indent_code_prefix between", value1, value2, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andIndentCodePrefixNotBetween(String value1, String value2) {
            addCriterion("indent_code_prefix not between", value1, value2, "indentCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixIsNull() {
            addCriterion("m_code_prefix is null");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixIsNotNull() {
            addCriterion("m_code_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixEqualTo(String value) {
            addCriterion("m_code_prefix =", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixNotEqualTo(String value) {
            addCriterion("m_code_prefix <>", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixGreaterThan(String value) {
            addCriterion("m_code_prefix >", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("m_code_prefix >=", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixLessThan(String value) {
            addCriterion("m_code_prefix <", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixLessThanOrEqualTo(String value) {
            addCriterion("m_code_prefix <=", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixLike(String value) {
            addCriterion("m_code_prefix like", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixNotLike(String value) {
            addCriterion("m_code_prefix not like", value, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixIn(List<String> values) {
            addCriterion("m_code_prefix in", values, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixNotIn(List<String> values) {
            addCriterion("m_code_prefix not in", values, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixBetween(String value1, String value2) {
            addCriterion("m_code_prefix between", value1, value2, "mCodePrefix");
            return (Criteria) this;
        }

        public Criteria andMCodePrefixNotBetween(String value1, String value2) {
            addCriterion("m_code_prefix not between", value1, value2, "mCodePrefix");
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