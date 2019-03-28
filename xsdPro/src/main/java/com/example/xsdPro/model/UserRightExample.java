package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.List;

public class UserRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRightExample() {
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
            addCriterion("Company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("Company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("Company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("Company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("Company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("Company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("Company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("Company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("Company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("Module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("Module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("Module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("Module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("Module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("Module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("Module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("Module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("Module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andInsRightIsNull() {
            addCriterion("ins_right is null");
            return (Criteria) this;
        }

        public Criteria andInsRightIsNotNull() {
            addCriterion("ins_right is not null");
            return (Criteria) this;
        }

        public Criteria andInsRightEqualTo(Short value) {
            addCriterion("ins_right =", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightNotEqualTo(Short value) {
            addCriterion("ins_right <>", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightGreaterThan(Short value) {
            addCriterion("ins_right >", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightGreaterThanOrEqualTo(Short value) {
            addCriterion("ins_right >=", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightLessThan(Short value) {
            addCriterion("ins_right <", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightLessThanOrEqualTo(Short value) {
            addCriterion("ins_right <=", value, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightIn(List<Short> values) {
            addCriterion("ins_right in", values, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightNotIn(List<Short> values) {
            addCriterion("ins_right not in", values, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightBetween(Short value1, Short value2) {
            addCriterion("ins_right between", value1, value2, "insRight");
            return (Criteria) this;
        }

        public Criteria andInsRightNotBetween(Short value1, Short value2) {
            addCriterion("ins_right not between", value1, value2, "insRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightIsNull() {
            addCriterion("update_right is null");
            return (Criteria) this;
        }

        public Criteria andUpdateRightIsNotNull() {
            addCriterion("update_right is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateRightEqualTo(Short value) {
            addCriterion("update_right =", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightNotEqualTo(Short value) {
            addCriterion("update_right <>", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightGreaterThan(Short value) {
            addCriterion("update_right >", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightGreaterThanOrEqualTo(Short value) {
            addCriterion("update_right >=", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightLessThan(Short value) {
            addCriterion("update_right <", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightLessThanOrEqualTo(Short value) {
            addCriterion("update_right <=", value, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightIn(List<Short> values) {
            addCriterion("update_right in", values, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightNotIn(List<Short> values) {
            addCriterion("update_right not in", values, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightBetween(Short value1, Short value2) {
            addCriterion("update_right between", value1, value2, "updateRight");
            return (Criteria) this;
        }

        public Criteria andUpdateRightNotBetween(Short value1, Short value2) {
            addCriterion("update_right not between", value1, value2, "updateRight");
            return (Criteria) this;
        }

        public Criteria andDelRightIsNull() {
            addCriterion("del_right is null");
            return (Criteria) this;
        }

        public Criteria andDelRightIsNotNull() {
            addCriterion("del_right is not null");
            return (Criteria) this;
        }

        public Criteria andDelRightEqualTo(Short value) {
            addCriterion("del_right =", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotEqualTo(Short value) {
            addCriterion("del_right <>", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightGreaterThan(Short value) {
            addCriterion("del_right >", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightGreaterThanOrEqualTo(Short value) {
            addCriterion("del_right >=", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightLessThan(Short value) {
            addCriterion("del_right <", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightLessThanOrEqualTo(Short value) {
            addCriterion("del_right <=", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightIn(List<Short> values) {
            addCriterion("del_right in", values, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotIn(List<Short> values) {
            addCriterion("del_right not in", values, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightBetween(Short value1, Short value2) {
            addCriterion("del_right between", value1, value2, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotBetween(Short value1, Short value2) {
            addCriterion("del_right not between", value1, value2, "delRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightIsNull() {
            addCriterion("serch_right is null");
            return (Criteria) this;
        }

        public Criteria andSerchRightIsNotNull() {
            addCriterion("serch_right is not null");
            return (Criteria) this;
        }

        public Criteria andSerchRightEqualTo(Short value) {
            addCriterion("serch_right =", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightNotEqualTo(Short value) {
            addCriterion("serch_right <>", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightGreaterThan(Short value) {
            addCriterion("serch_right >", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightGreaterThanOrEqualTo(Short value) {
            addCriterion("serch_right >=", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightLessThan(Short value) {
            addCriterion("serch_right <", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightLessThanOrEqualTo(Short value) {
            addCriterion("serch_right <=", value, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightIn(List<Short> values) {
            addCriterion("serch_right in", values, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightNotIn(List<Short> values) {
            addCriterion("serch_right not in", values, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightBetween(Short value1, Short value2) {
            addCriterion("serch_right between", value1, value2, "serchRight");
            return (Criteria) this;
        }

        public Criteria andSerchRightNotBetween(Short value1, Short value2) {
            addCriterion("serch_right not between", value1, value2, "serchRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightIsNull() {
            addCriterion("audit_right is null");
            return (Criteria) this;
        }

        public Criteria andAuditRightIsNotNull() {
            addCriterion("audit_right is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRightEqualTo(Short value) {
            addCriterion("audit_right =", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightNotEqualTo(Short value) {
            addCriterion("audit_right <>", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightGreaterThan(Short value) {
            addCriterion("audit_right >", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightGreaterThanOrEqualTo(Short value) {
            addCriterion("audit_right >=", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightLessThan(Short value) {
            addCriterion("audit_right <", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightLessThanOrEqualTo(Short value) {
            addCriterion("audit_right <=", value, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightIn(List<Short> values) {
            addCriterion("audit_right in", values, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightNotIn(List<Short> values) {
            addCriterion("audit_right not in", values, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightBetween(Short value1, Short value2) {
            addCriterion("audit_right between", value1, value2, "auditRight");
            return (Criteria) this;
        }

        public Criteria andAuditRightNotBetween(Short value1, Short value2) {
            addCriterion("audit_right not between", value1, value2, "auditRight");
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