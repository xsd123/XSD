package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJIsNull() {
            addCriterion("company_name_j is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJIsNotNull() {
            addCriterion("company_name_j is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJEqualTo(String value) {
            addCriterion("company_name_j =", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJNotEqualTo(String value) {
            addCriterion("company_name_j <>", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJGreaterThan(String value) {
            addCriterion("company_name_j >", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJGreaterThanOrEqualTo(String value) {
            addCriterion("company_name_j >=", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJLessThan(String value) {
            addCriterion("company_name_j <", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJLessThanOrEqualTo(String value) {
            addCriterion("company_name_j <=", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJLike(String value) {
            addCriterion("company_name_j like", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJNotLike(String value) {
            addCriterion("company_name_j not like", value, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJIn(List<String> values) {
            addCriterion("company_name_j in", values, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJNotIn(List<String> values) {
            addCriterion("company_name_j not in", values, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJBetween(String value1, String value2) {
            addCriterion("company_name_j between", value1, value2, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJNotBetween(String value1, String value2) {
            addCriterion("company_name_j not between", value1, value2, "companyNameJ");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andDateOpeningIsNull() {
            addCriterion("date_opening is null");
            return (Criteria) this;
        }

        public Criteria andDateOpeningIsNotNull() {
            addCriterion("date_opening is not null");
            return (Criteria) this;
        }

        public Criteria andDateOpeningEqualTo(Date value) {
            addCriterion("date_opening =", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningNotEqualTo(Date value) {
            addCriterion("date_opening <>", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningGreaterThan(Date value) {
            addCriterion("date_opening >", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningGreaterThanOrEqualTo(Date value) {
            addCriterion("date_opening >=", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningLessThan(Date value) {
            addCriterion("date_opening <", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningLessThanOrEqualTo(Date value) {
            addCriterion("date_opening <=", value, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningIn(List<Date> values) {
            addCriterion("date_opening in", values, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningNotIn(List<Date> values) {
            addCriterion("date_opening not in", values, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningBetween(Date value1, Date value2) {
            addCriterion("date_opening between", value1, value2, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andDateOpeningNotBetween(Date value1, Date value2) {
            addCriterion("date_opening not between", value1, value2, "dateOpening");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andStopAmontIsNull() {
            addCriterion("stop_amont is null");
            return (Criteria) this;
        }

        public Criteria andStopAmontIsNotNull() {
            addCriterion("stop_amont is not null");
            return (Criteria) this;
        }

        public Criteria andStopAmontEqualTo(Integer value) {
            addCriterion("stop_amont =", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontNotEqualTo(Integer value) {
            addCriterion("stop_amont <>", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontGreaterThan(Integer value) {
            addCriterion("stop_amont >", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_amont >=", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontLessThan(Integer value) {
            addCriterion("stop_amont <", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontLessThanOrEqualTo(Integer value) {
            addCriterion("stop_amont <=", value, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontIn(List<Integer> values) {
            addCriterion("stop_amont in", values, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontNotIn(List<Integer> values) {
            addCriterion("stop_amont not in", values, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontBetween(Integer value1, Integer value2) {
            addCriterion("stop_amont between", value1, value2, "stopAmont");
            return (Criteria) this;
        }

        public Criteria andStopAmontNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_amont not between", value1, value2, "stopAmont");
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

        public Criteria andInsManIsNull() {
            addCriterion("ins_man is null");
            return (Criteria) this;
        }

        public Criteria andInsManIsNotNull() {
            addCriterion("ins_man is not null");
            return (Criteria) this;
        }

        public Criteria andInsManEqualTo(String value) {
            addCriterion("ins_man =", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManNotEqualTo(String value) {
            addCriterion("ins_man <>", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManGreaterThan(String value) {
            addCriterion("ins_man >", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManGreaterThanOrEqualTo(String value) {
            addCriterion("ins_man >=", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManLessThan(String value) {
            addCriterion("ins_man <", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManLessThanOrEqualTo(String value) {
            addCriterion("ins_man <=", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManLike(String value) {
            addCriterion("ins_man like", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManNotLike(String value) {
            addCriterion("ins_man not like", value, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManIn(List<String> values) {
            addCriterion("ins_man in", values, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManNotIn(List<String> values) {
            addCriterion("ins_man not in", values, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManBetween(String value1, String value2) {
            addCriterion("ins_man between", value1, value2, "insMan");
            return (Criteria) this;
        }

        public Criteria andInsManNotBetween(String value1, String value2) {
            addCriterion("ins_man not between", value1, value2, "insMan");
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

        public Criteria andUpdateManIsNull() {
            addCriterion("update_man is null");
            return (Criteria) this;
        }

        public Criteria andUpdateManIsNotNull() {
            addCriterion("update_man is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateManEqualTo(String value) {
            addCriterion("update_man =", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotEqualTo(String value) {
            addCriterion("update_man <>", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManGreaterThan(String value) {
            addCriterion("update_man >", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManGreaterThanOrEqualTo(String value) {
            addCriterion("update_man >=", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManLessThan(String value) {
            addCriterion("update_man <", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManLessThanOrEqualTo(String value) {
            addCriterion("update_man <=", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManLike(String value) {
            addCriterion("update_man like", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotLike(String value) {
            addCriterion("update_man not like", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManIn(List<String> values) {
            addCriterion("update_man in", values, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotIn(List<String> values) {
            addCriterion("update_man not in", values, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManBetween(String value1, String value2) {
            addCriterion("update_man between", value1, value2, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotBetween(String value1, String value2) {
            addCriterion("update_man not between", value1, value2, "updateMan");
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

        public Criteria andAdministratorNameIsNull() {
            addCriterion("administrator_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIsNotNull() {
            addCriterion("administrator_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameEqualTo(String value) {
            addCriterion("administrator_name =", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotEqualTo(String value) {
            addCriterion("administrator_name <>", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThan(String value) {
            addCriterion("administrator_name >", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_name >=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThan(String value) {
            addCriterion("administrator_name <", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThanOrEqualTo(String value) {
            addCriterion("administrator_name <=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLike(String value) {
            addCriterion("administrator_name like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotLike(String value) {
            addCriterion("administrator_name not like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIn(List<String> values) {
            addCriterion("administrator_name in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotIn(List<String> values) {
            addCriterion("administrator_name not in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameBetween(String value1, String value2) {
            addCriterion("administrator_name between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotBetween(String value1, String value2) {
            addCriterion("administrator_name not between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassIsNull() {
            addCriterion("administrator_pass is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassIsNotNull() {
            addCriterion("administrator_pass is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassEqualTo(String value) {
            addCriterion("administrator_pass =", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassNotEqualTo(String value) {
            addCriterion("administrator_pass <>", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassGreaterThan(String value) {
            addCriterion("administrator_pass >", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_pass >=", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassLessThan(String value) {
            addCriterion("administrator_pass <", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassLessThanOrEqualTo(String value) {
            addCriterion("administrator_pass <=", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassLike(String value) {
            addCriterion("administrator_pass like", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassNotLike(String value) {
            addCriterion("administrator_pass not like", value, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassIn(List<String> values) {
            addCriterion("administrator_pass in", values, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassNotIn(List<String> values) {
            addCriterion("administrator_pass not in", values, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassBetween(String value1, String value2) {
            addCriterion("administrator_pass between", value1, value2, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAdministratorPassNotBetween(String value1, String value2) {
            addCriterion("administrator_pass not between", value1, value2, "administratorPass");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("Auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("Auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("Auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("Auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("Auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("Auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("Auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("Auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("Auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("Auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("Auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("Auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("Auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("Auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIsNull() {
            addCriterion("Auditor_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIsNotNull() {
            addCriterion("Auditor_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorDateEqualTo(Date value) {
            addCriterion("Auditor_date =", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotEqualTo(Date value) {
            addCriterion("Auditor_date <>", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateGreaterThan(Date value) {
            addCriterion("Auditor_date >", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Auditor_date >=", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateLessThan(Date value) {
            addCriterion("Auditor_date <", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateLessThanOrEqualTo(Date value) {
            addCriterion("Auditor_date <=", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIn(List<Date> values) {
            addCriterion("Auditor_date in", values, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotIn(List<Date> values) {
            addCriterion("Auditor_date not in", values, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateBetween(Date value1, Date value2) {
            addCriterion("Auditor_date between", value1, value2, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotBetween(Date value1, Date value2) {
            addCriterion("Auditor_date not between", value1, value2, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andCloseManIsNull() {
            addCriterion("Close_man is null");
            return (Criteria) this;
        }

        public Criteria andCloseManIsNotNull() {
            addCriterion("Close_man is not null");
            return (Criteria) this;
        }

        public Criteria andCloseManEqualTo(String value) {
            addCriterion("Close_man =", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManNotEqualTo(String value) {
            addCriterion("Close_man <>", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManGreaterThan(String value) {
            addCriterion("Close_man >", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManGreaterThanOrEqualTo(String value) {
            addCriterion("Close_man >=", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManLessThan(String value) {
            addCriterion("Close_man <", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManLessThanOrEqualTo(String value) {
            addCriterion("Close_man <=", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManLike(String value) {
            addCriterion("Close_man like", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManNotLike(String value) {
            addCriterion("Close_man not like", value, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManIn(List<String> values) {
            addCriterion("Close_man in", values, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManNotIn(List<String> values) {
            addCriterion("Close_man not in", values, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManBetween(String value1, String value2) {
            addCriterion("Close_man between", value1, value2, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseManNotBetween(String value1, String value2) {
            addCriterion("Close_man not between", value1, value2, "closeMan");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("Close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("Close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(Date value) {
            addCriterion("Close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(Date value) {
            addCriterion("Close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(Date value) {
            addCriterion("Close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(Date value) {
            addCriterion("Close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("Close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<Date> values) {
            addCriterion("Close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<Date> values) {
            addCriterion("Close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(Date value1, Date value2) {
            addCriterion("Close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("Close_date not between", value1, value2, "closeDate");
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