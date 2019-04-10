package com.example.xsdPro.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartExample() {
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

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Integer value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Integer value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Integer value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Integer value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Integer> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Integer> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Integer value1, Integer value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartCodeIsNull() {
            addCriterion("part_code is null");
            return (Criteria) this;
        }

        public Criteria andPartCodeIsNotNull() {
            addCriterion("part_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartCodeEqualTo(String value) {
            addCriterion("part_code =", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeNotEqualTo(String value) {
            addCriterion("part_code <>", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeGreaterThan(String value) {
            addCriterion("part_code >", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("part_code >=", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeLessThan(String value) {
            addCriterion("part_code <", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeLessThanOrEqualTo(String value) {
            addCriterion("part_code <=", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeLike(String value) {
            addCriterion("part_code like", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeNotLike(String value) {
            addCriterion("part_code not like", value, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeIn(List<String> values) {
            addCriterion("part_code in", values, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeNotIn(List<String> values) {
            addCriterion("part_code not in", values, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeBetween(String value1, String value2) {
            addCriterion("part_code between", value1, value2, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartCodeNotBetween(String value1, String value2) {
            addCriterion("part_code not between", value1, value2, "partCode");
            return (Criteria) this;
        }

        public Criteria andPartPyIsNull() {
            addCriterion("part_py is null");
            return (Criteria) this;
        }

        public Criteria andPartPyIsNotNull() {
            addCriterion("part_py is not null");
            return (Criteria) this;
        }

        public Criteria andPartPyEqualTo(String value) {
            addCriterion("part_py =", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyNotEqualTo(String value) {
            addCriterion("part_py <>", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyGreaterThan(String value) {
            addCriterion("part_py >", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyGreaterThanOrEqualTo(String value) {
            addCriterion("part_py >=", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyLessThan(String value) {
            addCriterion("part_py <", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyLessThanOrEqualTo(String value) {
            addCriterion("part_py <=", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyLike(String value) {
            addCriterion("part_py like", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyNotLike(String value) {
            addCriterion("part_py not like", value, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyIn(List<String> values) {
            addCriterion("part_py in", values, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyNotIn(List<String> values) {
            addCriterion("part_py not in", values, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyBetween(String value1, String value2) {
            addCriterion("part_py between", value1, value2, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartPyNotBetween(String value1, String value2) {
            addCriterion("part_py not between", value1, value2, "partPy");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
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

        public Criteria andPartTypeIdIsNull() {
            addCriterion("part_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdIsNotNull() {
            addCriterion("part_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdEqualTo(Integer value) {
            addCriterion("part_type_id =", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdNotEqualTo(Integer value) {
            addCriterion("part_type_id <>", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdGreaterThan(Integer value) {
            addCriterion("part_type_id >", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_type_id >=", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdLessThan(Integer value) {
            addCriterion("part_type_id <", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("part_type_id <=", value, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdIn(List<Integer> values) {
            addCriterion("part_type_id in", values, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdNotIn(List<Integer> values) {
            addCriterion("part_type_id not in", values, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("part_type_id between", value1, value2, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("part_type_id not between", value1, value2, "partTypeId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIsNull() {
            addCriterion("part_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIsNotNull() {
            addCriterion("part_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartClassIdEqualTo(Integer value) {
            addCriterion("part_class_id =", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotEqualTo(Integer value) {
            addCriterion("part_class_id <>", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdGreaterThan(Integer value) {
            addCriterion("part_class_id >", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_class_id >=", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdLessThan(Integer value) {
            addCriterion("part_class_id <", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("part_class_id <=", value, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdIn(List<Integer> values) {
            addCriterion("part_class_id in", values, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotIn(List<Integer> values) {
            addCriterion("part_class_id not in", values, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdBetween(Integer value1, Integer value2) {
            addCriterion("part_class_id between", value1, value2, "partClassId");
            return (Criteria) this;
        }

        public Criteria andPartClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("part_class_id not between", value1, value2, "partClassId");
            return (Criteria) this;
        }

        public Criteria andBusAmountIsNull() {
            addCriterion("bus_amount is null");
            return (Criteria) this;
        }

        public Criteria andBusAmountIsNotNull() {
            addCriterion("bus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBusAmountEqualTo(BigDecimal value) {
            addCriterion("bus_amount =", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountNotEqualTo(BigDecimal value) {
            addCriterion("bus_amount <>", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountGreaterThan(BigDecimal value) {
            addCriterion("bus_amount >", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bus_amount >=", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountLessThan(BigDecimal value) {
            addCriterion("bus_amount <", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bus_amount <=", value, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountIn(List<BigDecimal> values) {
            addCriterion("bus_amount in", values, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountNotIn(List<BigDecimal> values) {
            addCriterion("bus_amount not in", values, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bus_amount between", value1, value2, "busAmount");
            return (Criteria) this;
        }

        public Criteria andBusAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bus_amount not between", value1, value2, "busAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagIsNull() {
            addCriterion("goods_flag is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagIsNotNull() {
            addCriterion("goods_flag is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagEqualTo(Boolean value) {
            addCriterion("goods_flag =", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagNotEqualTo(Boolean value) {
            addCriterion("goods_flag <>", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagGreaterThan(Boolean value) {
            addCriterion("goods_flag >", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("goods_flag >=", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagLessThan(Boolean value) {
            addCriterion("goods_flag <", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("goods_flag <=", value, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagIn(List<Boolean> values) {
            addCriterion("goods_flag in", values, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagNotIn(List<Boolean> values) {
            addCriterion("goods_flag not in", values, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_flag between", value1, value2, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andGoodsFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_flag not between", value1, value2, "goodsFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagIsNull() {
            addCriterion("paint_flag is null");
            return (Criteria) this;
        }

        public Criteria andPaintFlagIsNotNull() {
            addCriterion("paint_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPaintFlagEqualTo(Boolean value) {
            addCriterion("paint_flag =", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagNotEqualTo(Boolean value) {
            addCriterion("paint_flag <>", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagGreaterThan(Boolean value) {
            addCriterion("paint_flag >", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("paint_flag >=", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagLessThan(Boolean value) {
            addCriterion("paint_flag <", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("paint_flag <=", value, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagIn(List<Boolean> values) {
            addCriterion("paint_flag in", values, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagNotIn(List<Boolean> values) {
            addCriterion("paint_flag not in", values, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("paint_flag between", value1, value2, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andPaintFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("paint_flag not between", value1, value2, "paintFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagIsNull() {
            addCriterion("stop_flag is null");
            return (Criteria) this;
        }

        public Criteria andStopFlagIsNotNull() {
            addCriterion("stop_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStopFlagEqualTo(Boolean value) {
            addCriterion("stop_flag =", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotEqualTo(Boolean value) {
            addCriterion("stop_flag <>", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagGreaterThan(Boolean value) {
            addCriterion("stop_flag >", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stop_flag >=", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagLessThan(Boolean value) {
            addCriterion("stop_flag <", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("stop_flag <=", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagIn(List<Boolean> values) {
            addCriterion("stop_flag in", values, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotIn(List<Boolean> values) {
            addCriterion("stop_flag not in", values, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("stop_flag between", value1, value2, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stop_flag not between", value1, value2, "stopFlag");
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

        public Criteria andMinStockEqualTo(BigDecimal value) {
            addCriterion("min_stock =", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotEqualTo(BigDecimal value) {
            addCriterion("min_stock <>", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThan(BigDecimal value) {
            addCriterion("min_stock >", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_stock >=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThan(BigDecimal value) {
            addCriterion("min_stock <", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_stock <=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockIn(List<BigDecimal> values) {
            addCriterion("min_stock in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotIn(List<BigDecimal> values) {
            addCriterion("min_stock not in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_stock between", value1, value2, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andMaxStockEqualTo(BigDecimal value) {
            addCriterion("max_stock =", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotEqualTo(BigDecimal value) {
            addCriterion("max_stock <>", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThan(BigDecimal value) {
            addCriterion("max_stock >", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_stock >=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThan(BigDecimal value) {
            addCriterion("max_stock <", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_stock <=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockIn(List<BigDecimal> values) {
            addCriterion("max_stock in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotIn(List<BigDecimal> values) {
            addCriterion("max_stock not in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_stock between", value1, value2, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotBetween(BigDecimal value1, BigDecimal value2) {
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