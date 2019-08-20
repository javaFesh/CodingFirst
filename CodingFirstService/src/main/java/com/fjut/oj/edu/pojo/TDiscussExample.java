package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDiscussExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDiscussExample() {
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

        public Criteria andDiscussidIsNull() {
            addCriterion("discussId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussidIsNotNull() {
            addCriterion("discussId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussidEqualTo(Long value) {
            addCriterion("discussId =", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotEqualTo(Long value) {
            addCriterion("discussId <>", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThan(Long value) {
            addCriterion("discussId >", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThanOrEqualTo(Long value) {
            addCriterion("discussId >=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThan(Long value) {
            addCriterion("discussId <", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThanOrEqualTo(Long value) {
            addCriterion("discussId <=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidIn(List<Long> values) {
            addCriterion("discussId in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotIn(List<Long> values) {
            addCriterion("discussId not in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidBetween(Long value1, Long value2) {
            addCriterion("discussId between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotBetween(Long value1, Long value2) {
            addCriterion("discussId not between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleIsNull() {
            addCriterion("discussTitle is null");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleIsNotNull() {
            addCriterion("discussTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleEqualTo(String value) {
            addCriterion("discussTitle =", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleNotEqualTo(String value) {
            addCriterion("discussTitle <>", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleGreaterThan(String value) {
            addCriterion("discussTitle >", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleGreaterThanOrEqualTo(String value) {
            addCriterion("discussTitle >=", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleLessThan(String value) {
            addCriterion("discussTitle <", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleLessThanOrEqualTo(String value) {
            addCriterion("discussTitle <=", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleLike(String value) {
            addCriterion("discussTitle like", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleNotLike(String value) {
            addCriterion("discussTitle not like", value, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleIn(List<String> values) {
            addCriterion("discussTitle in", values, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleNotIn(List<String> values) {
            addCriterion("discussTitle not in", values, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleBetween(String value1, String value2) {
            addCriterion("discussTitle between", value1, value2, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstitleNotBetween(String value1, String value2) {
            addCriterion("discussTitle not between", value1, value2, "discusstitle");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeIsNull() {
            addCriterion("discussTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeIsNotNull() {
            addCriterion("discussTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeEqualTo(Date value) {
            addCriterion("discussTime =", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeNotEqualTo(Date value) {
            addCriterion("discussTime <>", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeGreaterThan(Date value) {
            addCriterion("discussTime >", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discussTime >=", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeLessThan(Date value) {
            addCriterion("discussTime <", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeLessThanOrEqualTo(Date value) {
            addCriterion("discussTime <=", value, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeIn(List<Date> values) {
            addCriterion("discussTime in", values, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeNotIn(List<Date> values) {
            addCriterion("discussTime not in", values, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeBetween(Date value1, Date value2) {
            addCriterion("discussTime between", value1, value2, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscusstimeNotBetween(Date value1, Date value2) {
            addCriterion("discussTime not between", value1, value2, "discusstime");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorIsNull() {
            addCriterion("discussAuthor is null");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorIsNotNull() {
            addCriterion("discussAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorEqualTo(String value) {
            addCriterion("discussAuthor =", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorNotEqualTo(String value) {
            addCriterion("discussAuthor <>", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorGreaterThan(String value) {
            addCriterion("discussAuthor >", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorGreaterThanOrEqualTo(String value) {
            addCriterion("discussAuthor >=", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorLessThan(String value) {
            addCriterion("discussAuthor <", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorLessThanOrEqualTo(String value) {
            addCriterion("discussAuthor <=", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorLike(String value) {
            addCriterion("discussAuthor like", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorNotLike(String value) {
            addCriterion("discussAuthor not like", value, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorIn(List<String> values) {
            addCriterion("discussAuthor in", values, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorNotIn(List<String> values) {
            addCriterion("discussAuthor not in", values, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorBetween(String value1, String value2) {
            addCriterion("discussAuthor between", value1, value2, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussauthorNotBetween(String value1, String value2) {
            addCriterion("discussAuthor not between", value1, value2, "discussauthor");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbIsNull() {
            addCriterion("discussDacb is null");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbIsNotNull() {
            addCriterion("discussDacb is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbEqualTo(Long value) {
            addCriterion("discussDacb =", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbNotEqualTo(Long value) {
            addCriterion("discussDacb <>", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbGreaterThan(Long value) {
            addCriterion("discussDacb >", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbGreaterThanOrEqualTo(Long value) {
            addCriterion("discussDacb >=", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbLessThan(Long value) {
            addCriterion("discussDacb <", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbLessThanOrEqualTo(Long value) {
            addCriterion("discussDacb <=", value, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbIn(List<Long> values) {
            addCriterion("discussDacb in", values, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbNotIn(List<Long> values) {
            addCriterion("discussDacb not in", values, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbBetween(Long value1, Long value2) {
            addCriterion("discussDacb between", value1, value2, "discussdacb");
            return (Criteria) this;
        }

        public Criteria andDiscussdacbNotBetween(Long value1, Long value2) {
            addCriterion("discussDacb not between", value1, value2, "discussdacb");
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