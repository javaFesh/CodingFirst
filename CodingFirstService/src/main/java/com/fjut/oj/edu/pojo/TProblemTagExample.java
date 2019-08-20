package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TProblemTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProblemTagExample() {
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

        public Criteria andPTagidIsNull() {
            addCriterion("p_tagId is null");
            return (Criteria) this;
        }

        public Criteria andPTagidIsNotNull() {
            addCriterion("p_tagId is not null");
            return (Criteria) this;
        }

        public Criteria andPTagidEqualTo(Long value) {
            addCriterion("p_tagId =", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidNotEqualTo(Long value) {
            addCriterion("p_tagId <>", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidGreaterThan(Long value) {
            addCriterion("p_tagId >", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidGreaterThanOrEqualTo(Long value) {
            addCriterion("p_tagId >=", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidLessThan(Long value) {
            addCriterion("p_tagId <", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidLessThanOrEqualTo(Long value) {
            addCriterion("p_tagId <=", value, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidIn(List<Long> values) {
            addCriterion("p_tagId in", values, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidNotIn(List<Long> values) {
            addCriterion("p_tagId not in", values, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidBetween(Long value1, Long value2) {
            addCriterion("p_tagId between", value1, value2, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagidNotBetween(Long value1, Long value2) {
            addCriterion("p_tagId not between", value1, value2, "pTagid");
            return (Criteria) this;
        }

        public Criteria andPTagnameIsNull() {
            addCriterion("p_tagName is null");
            return (Criteria) this;
        }

        public Criteria andPTagnameIsNotNull() {
            addCriterion("p_tagName is not null");
            return (Criteria) this;
        }

        public Criteria andPTagnameEqualTo(String value) {
            addCriterion("p_tagName =", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameNotEqualTo(String value) {
            addCriterion("p_tagName <>", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameGreaterThan(String value) {
            addCriterion("p_tagName >", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameGreaterThanOrEqualTo(String value) {
            addCriterion("p_tagName >=", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameLessThan(String value) {
            addCriterion("p_tagName <", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameLessThanOrEqualTo(String value) {
            addCriterion("p_tagName <=", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameLike(String value) {
            addCriterion("p_tagName like", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameNotLike(String value) {
            addCriterion("p_tagName not like", value, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameIn(List<String> values) {
            addCriterion("p_tagName in", values, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameNotIn(List<String> values) {
            addCriterion("p_tagName not in", values, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameBetween(String value1, String value2) {
            addCriterion("p_tagName between", value1, value2, "pTagname");
            return (Criteria) this;
        }

        public Criteria andPTagnameNotBetween(String value1, String value2) {
            addCriterion("p_tagName not between", value1, value2, "pTagname");
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