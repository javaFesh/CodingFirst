package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TNoteExample() {
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

        public Criteria andNoteidIsNull() {
            addCriterion("noteId is null");
            return (Criteria) this;
        }

        public Criteria andNoteidIsNotNull() {
            addCriterion("noteId is not null");
            return (Criteria) this;
        }

        public Criteria andNoteidEqualTo(Long value) {
            addCriterion("noteId =", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotEqualTo(Long value) {
            addCriterion("noteId <>", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThan(Long value) {
            addCriterion("noteId >", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThanOrEqualTo(Long value) {
            addCriterion("noteId >=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThan(Long value) {
            addCriterion("noteId <", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThanOrEqualTo(Long value) {
            addCriterion("noteId <=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidIn(List<Long> values) {
            addCriterion("noteId in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotIn(List<Long> values) {
            addCriterion("noteId not in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidBetween(Long value1, Long value2) {
            addCriterion("noteId between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotBetween(Long value1, Long value2) {
            addCriterion("noteId not between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNotetitleIsNull() {
            addCriterion("noteTitle is null");
            return (Criteria) this;
        }

        public Criteria andNotetitleIsNotNull() {
            addCriterion("noteTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNotetitleEqualTo(String value) {
            addCriterion("noteTitle =", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotEqualTo(String value) {
            addCriterion("noteTitle <>", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleGreaterThan(String value) {
            addCriterion("noteTitle >", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleGreaterThanOrEqualTo(String value) {
            addCriterion("noteTitle >=", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLessThan(String value) {
            addCriterion("noteTitle <", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLessThanOrEqualTo(String value) {
            addCriterion("noteTitle <=", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleLike(String value) {
            addCriterion("noteTitle like", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotLike(String value) {
            addCriterion("noteTitle not like", value, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleIn(List<String> values) {
            addCriterion("noteTitle in", values, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotIn(List<String> values) {
            addCriterion("noteTitle not in", values, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleBetween(String value1, String value2) {
            addCriterion("noteTitle between", value1, value2, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetitleNotBetween(String value1, String value2) {
            addCriterion("noteTitle not between", value1, value2, "notetitle");
            return (Criteria) this;
        }

        public Criteria andNotetextIsNull() {
            addCriterion("noteText is null");
            return (Criteria) this;
        }

        public Criteria andNotetextIsNotNull() {
            addCriterion("noteText is not null");
            return (Criteria) this;
        }

        public Criteria andNotetextEqualTo(String value) {
            addCriterion("noteText =", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextNotEqualTo(String value) {
            addCriterion("noteText <>", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextGreaterThan(String value) {
            addCriterion("noteText >", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextGreaterThanOrEqualTo(String value) {
            addCriterion("noteText >=", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextLessThan(String value) {
            addCriterion("noteText <", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextLessThanOrEqualTo(String value) {
            addCriterion("noteText <=", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextLike(String value) {
            addCriterion("noteText like", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextNotLike(String value) {
            addCriterion("noteText not like", value, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextIn(List<String> values) {
            addCriterion("noteText in", values, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextNotIn(List<String> values) {
            addCriterion("noteText not in", values, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextBetween(String value1, String value2) {
            addCriterion("noteText between", value1, value2, "notetext");
            return (Criteria) this;
        }

        public Criteria andNotetextNotBetween(String value1, String value2) {
            addCriterion("noteText not between", value1, value2, "notetext");
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