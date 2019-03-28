package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andPersonCodeIsNull() {
            addCriterion("person_code is null");
            return (Criteria) this;
        }

        public Criteria andPersonCodeIsNotNull() {
            addCriterion("person_code is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCodeEqualTo(String value) {
            addCriterion("person_code =", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotEqualTo(String value) {
            addCriterion("person_code <>", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeGreaterThan(String value) {
            addCriterion("person_code >", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("person_code >=", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLessThan(String value) {
            addCriterion("person_code <", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLessThanOrEqualTo(String value) {
            addCriterion("person_code <=", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLike(String value) {
            addCriterion("person_code like", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotLike(String value) {
            addCriterion("person_code not like", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeIn(List<String> values) {
            addCriterion("person_code in", values, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotIn(List<String> values) {
            addCriterion("person_code not in", values, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeBetween(String value1, String value2) {
            addCriterion("person_code between", value1, value2, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotBetween(String value1, String value2) {
            addCriterion("person_code not between", value1, value2, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
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

        public Criteria andChargeFlagIsNull() {
            addCriterion("charge_flag is null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIsNotNull() {
            addCriterion("charge_flag is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagEqualTo(String value) {
            addCriterion("charge_flag =", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotEqualTo(String value) {
            addCriterion("charge_flag <>", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThan(String value) {
            addCriterion("charge_flag >", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("charge_flag >=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThan(String value) {
            addCriterion("charge_flag <", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThanOrEqualTo(String value) {
            addCriterion("charge_flag <=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLike(String value) {
            addCriterion("charge_flag like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotLike(String value) {
            addCriterion("charge_flag not like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIn(List<String> values) {
            addCriterion("charge_flag in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotIn(List<String> values) {
            addCriterion("charge_flag not in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagBetween(String value1, String value2) {
            addCriterion("charge_flag between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotBetween(String value1, String value2) {
            addCriterion("charge_flag not between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("Birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("Birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("Birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("Birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("Birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("Birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("Birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("Birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("Birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("Birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("Birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("CARD is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("CARD =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("CARD <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("CARD >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("CARD >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("CARD <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("CARD <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("CARD like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("CARD not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("CARD in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("CARD not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("CARD between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("CARD not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("Education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("Education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Integer value) {
            addCriterion("Education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Integer value) {
            addCriterion("Education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Integer value) {
            addCriterion("Education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Integer value) {
            addCriterion("Education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Integer> values) {
            addCriterion("Education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Integer> values) {
            addCriterion("Education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Integer value1, Integer value2) {
            addCriterion("Education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNull() {
            addCriterion("graduation_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNotNull() {
            addCriterion("graduation_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateEqualTo(Date value) {
            addCriterion("graduation_date =", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotEqualTo(Date value) {
            addCriterion("graduation_date <>", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThan(Date value) {
            addCriterion("graduation_date >", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_date >=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThan(Date value) {
            addCriterion("graduation_date <", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThanOrEqualTo(Date value) {
            addCriterion("graduation_date <=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIn(List<Date> values) {
            addCriterion("graduation_date in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotIn(List<Date> values) {
            addCriterion("graduation_date not in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateBetween(Date value1, Date value2) {
            addCriterion("graduation_date between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotBetween(Date value1, Date value2) {
            addCriterion("graduation_date not between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("Address1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("Address1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("Address1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("Address1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("Address1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("Address1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("Address1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("Address1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("Address1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("Address1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("Address1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("Address1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("Address1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("Address1 not between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1IsNull() {
            addCriterion("Native_place1 is null");
            return (Criteria) this;
        }

        public Criteria andNativePlace1IsNotNull() {
            addCriterion("Native_place1 is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlace1EqualTo(String value) {
            addCriterion("Native_place1 =", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1NotEqualTo(String value) {
            addCriterion("Native_place1 <>", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1GreaterThan(String value) {
            addCriterion("Native_place1 >", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1GreaterThanOrEqualTo(String value) {
            addCriterion("Native_place1 >=", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1LessThan(String value) {
            addCriterion("Native_place1 <", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1LessThanOrEqualTo(String value) {
            addCriterion("Native_place1 <=", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1Like(String value) {
            addCriterion("Native_place1 like", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1NotLike(String value) {
            addCriterion("Native_place1 not like", value, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1In(List<String> values) {
            addCriterion("Native_place1 in", values, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1NotIn(List<String> values) {
            addCriterion("Native_place1 not in", values, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1Between(String value1, String value2) {
            addCriterion("Native_place1 between", value1, value2, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace1NotBetween(String value1, String value2) {
            addCriterion("Native_place1 not between", value1, value2, "nativePlace1");
            return (Criteria) this;
        }

        public Criteria andNativePlace2IsNull() {
            addCriterion("Native_place2 is null");
            return (Criteria) this;
        }

        public Criteria andNativePlace2IsNotNull() {
            addCriterion("Native_place2 is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlace2EqualTo(String value) {
            addCriterion("Native_place2 =", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2NotEqualTo(String value) {
            addCriterion("Native_place2 <>", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2GreaterThan(String value) {
            addCriterion("Native_place2 >", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2GreaterThanOrEqualTo(String value) {
            addCriterion("Native_place2 >=", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2LessThan(String value) {
            addCriterion("Native_place2 <", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2LessThanOrEqualTo(String value) {
            addCriterion("Native_place2 <=", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2Like(String value) {
            addCriterion("Native_place2 like", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2NotLike(String value) {
            addCriterion("Native_place2 not like", value, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2In(List<String> values) {
            addCriterion("Native_place2 in", values, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2NotIn(List<String> values) {
            addCriterion("Native_place2 not in", values, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2Between(String value1, String value2) {
            addCriterion("Native_place2 between", value1, value2, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace2NotBetween(String value1, String value2) {
            addCriterion("Native_place2 not between", value1, value2, "nativePlace2");
            return (Criteria) this;
        }

        public Criteria andNativePlace3IsNull() {
            addCriterion("Native_place3 is null");
            return (Criteria) this;
        }

        public Criteria andNativePlace3IsNotNull() {
            addCriterion("Native_place3 is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlace3EqualTo(String value) {
            addCriterion("Native_place3 =", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3NotEqualTo(String value) {
            addCriterion("Native_place3 <>", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3GreaterThan(String value) {
            addCriterion("Native_place3 >", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3GreaterThanOrEqualTo(String value) {
            addCriterion("Native_place3 >=", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3LessThan(String value) {
            addCriterion("Native_place3 <", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3LessThanOrEqualTo(String value) {
            addCriterion("Native_place3 <=", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3Like(String value) {
            addCriterion("Native_place3 like", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3NotLike(String value) {
            addCriterion("Native_place3 not like", value, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3In(List<String> values) {
            addCriterion("Native_place3 in", values, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3NotIn(List<String> values) {
            addCriterion("Native_place3 not in", values, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3Between(String value1, String value2) {
            addCriterion("Native_place3 between", value1, value2, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andNativePlace3NotBetween(String value1, String value2) {
            addCriterion("Native_place3 not between", value1, value2, "nativePlace3");
            return (Criteria) this;
        }

        public Criteria andStatueIsNull() {
            addCriterion("statue is null");
            return (Criteria) this;
        }

        public Criteria andStatueIsNotNull() {
            addCriterion("statue is not null");
            return (Criteria) this;
        }

        public Criteria andStatueEqualTo(Integer value) {
            addCriterion("statue =", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotEqualTo(Integer value) {
            addCriterion("statue <>", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThan(Integer value) {
            addCriterion("statue >", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("statue >=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThan(Integer value) {
            addCriterion("statue <", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThanOrEqualTo(Integer value) {
            addCriterion("statue <=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueIn(List<Integer> values) {
            addCriterion("statue in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotIn(List<Integer> values) {
            addCriterion("statue not in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueBetween(Integer value1, Integer value2) {
            addCriterion("statue between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotBetween(Integer value1, Integer value2) {
            addCriterion("statue not between", value1, value2, "statue");
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

        public Criteria andInTransactorIsNull() {
            addCriterion("in_Transactor is null");
            return (Criteria) this;
        }

        public Criteria andInTransactorIsNotNull() {
            addCriterion("in_Transactor is not null");
            return (Criteria) this;
        }

        public Criteria andInTransactorEqualTo(String value) {
            addCriterion("in_Transactor =", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorNotEqualTo(String value) {
            addCriterion("in_Transactor <>", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorGreaterThan(String value) {
            addCriterion("in_Transactor >", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("in_Transactor >=", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorLessThan(String value) {
            addCriterion("in_Transactor <", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorLessThanOrEqualTo(String value) {
            addCriterion("in_Transactor <=", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorLike(String value) {
            addCriterion("in_Transactor like", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorNotLike(String value) {
            addCriterion("in_Transactor not like", value, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorIn(List<String> values) {
            addCriterion("in_Transactor in", values, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorNotIn(List<String> values) {
            addCriterion("in_Transactor not in", values, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorBetween(String value1, String value2) {
            addCriterion("in_Transactor between", value1, value2, "inTransactor");
            return (Criteria) this;
        }

        public Criteria andInTransactorNotBetween(String value1, String value2) {
            addCriterion("in_Transactor not between", value1, value2, "inTransactor");
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

        public Criteria andUpdateTransactorIsNull() {
            addCriterion("update_Transactor is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorIsNotNull() {
            addCriterion("update_Transactor is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorEqualTo(String value) {
            addCriterion("update_Transactor =", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorNotEqualTo(String value) {
            addCriterion("update_Transactor <>", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorGreaterThan(String value) {
            addCriterion("update_Transactor >", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("update_Transactor >=", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorLessThan(String value) {
            addCriterion("update_Transactor <", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorLessThanOrEqualTo(String value) {
            addCriterion("update_Transactor <=", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorLike(String value) {
            addCriterion("update_Transactor like", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorNotLike(String value) {
            addCriterion("update_Transactor not like", value, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorIn(List<String> values) {
            addCriterion("update_Transactor in", values, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorNotIn(List<String> values) {
            addCriterion("update_Transactor not in", values, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorBetween(String value1, String value2) {
            addCriterion("update_Transactor between", value1, value2, "updateTransactor");
            return (Criteria) this;
        }

        public Criteria andUpdateTransactorNotBetween(String value1, String value2) {
            addCriterion("update_Transactor not between", value1, value2, "updateTransactor");
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

        public Criteria andOutTransactorIsNull() {
            addCriterion("out_Transactor is null");
            return (Criteria) this;
        }

        public Criteria andOutTransactorIsNotNull() {
            addCriterion("out_Transactor is not null");
            return (Criteria) this;
        }

        public Criteria andOutTransactorEqualTo(String value) {
            addCriterion("out_Transactor =", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorNotEqualTo(String value) {
            addCriterion("out_Transactor <>", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorGreaterThan(String value) {
            addCriterion("out_Transactor >", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("out_Transactor >=", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorLessThan(String value) {
            addCriterion("out_Transactor <", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorLessThanOrEqualTo(String value) {
            addCriterion("out_Transactor <=", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorLike(String value) {
            addCriterion("out_Transactor like", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorNotLike(String value) {
            addCriterion("out_Transactor not like", value, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorIn(List<String> values) {
            addCriterion("out_Transactor in", values, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorNotIn(List<String> values) {
            addCriterion("out_Transactor not in", values, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorBetween(String value1, String value2) {
            addCriterion("out_Transactor between", value1, value2, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutTransactorNotBetween(String value1, String value2) {
            addCriterion("out_Transactor not between", value1, value2, "outTransactor");
            return (Criteria) this;
        }

        public Criteria andOutSersonIsNull() {
            addCriterion("out_serson is null");
            return (Criteria) this;
        }

        public Criteria andOutSersonIsNotNull() {
            addCriterion("out_serson is not null");
            return (Criteria) this;
        }

        public Criteria andOutSersonEqualTo(String value) {
            addCriterion("out_serson =", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonNotEqualTo(String value) {
            addCriterion("out_serson <>", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonGreaterThan(String value) {
            addCriterion("out_serson >", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonGreaterThanOrEqualTo(String value) {
            addCriterion("out_serson >=", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonLessThan(String value) {
            addCriterion("out_serson <", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonLessThanOrEqualTo(String value) {
            addCriterion("out_serson <=", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonLike(String value) {
            addCriterion("out_serson like", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonNotLike(String value) {
            addCriterion("out_serson not like", value, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonIn(List<String> values) {
            addCriterion("out_serson in", values, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonNotIn(List<String> values) {
            addCriterion("out_serson not in", values, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonBetween(String value1, String value2) {
            addCriterion("out_serson between", value1, value2, "outSerson");
            return (Criteria) this;
        }

        public Criteria andOutSersonNotBetween(String value1, String value2) {
            addCriterion("out_serson not between", value1, value2, "outSerson");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
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