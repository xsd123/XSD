package com.example.xsdPro.model;

import java.util.ArrayList;
import java.util.List;

public class FollowModeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowModeExample() {
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

        public Criteria andFollowModeIdIsNull() {
            addCriterion("follow_mode_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdIsNotNull() {
            addCriterion("follow_mode_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdEqualTo(Integer value) {
            addCriterion("follow_mode_id =", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdNotEqualTo(Integer value) {
            addCriterion("follow_mode_id <>", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdGreaterThan(Integer value) {
            addCriterion("follow_mode_id >", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_mode_id >=", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdLessThan(Integer value) {
            addCriterion("follow_mode_id <", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_mode_id <=", value, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdIn(List<Integer> values) {
            addCriterion("follow_mode_id in", values, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdNotIn(List<Integer> values) {
            addCriterion("follow_mode_id not in", values, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_mode_id between", value1, value2, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_mode_id not between", value1, value2, "followModeId");
            return (Criteria) this;
        }

        public Criteria andFollowModeIsNull() {
            addCriterion("follow_mode is null");
            return (Criteria) this;
        }

        public Criteria andFollowModeIsNotNull() {
            addCriterion("follow_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFollowModeEqualTo(String value) {
            addCriterion("follow_mode =", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotEqualTo(String value) {
            addCriterion("follow_mode <>", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeGreaterThan(String value) {
            addCriterion("follow_mode >", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeGreaterThanOrEqualTo(String value) {
            addCriterion("follow_mode >=", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLessThan(String value) {
            addCriterion("follow_mode <", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLessThanOrEqualTo(String value) {
            addCriterion("follow_mode <=", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLike(String value) {
            addCriterion("follow_mode like", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotLike(String value) {
            addCriterion("follow_mode not like", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeIn(List<String> values) {
            addCriterion("follow_mode in", values, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotIn(List<String> values) {
            addCriterion("follow_mode not in", values, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeBetween(String value1, String value2) {
            addCriterion("follow_mode between", value1, value2, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotBetween(String value1, String value2) {
            addCriterion("follow_mode not between", value1, value2, "followMode");
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