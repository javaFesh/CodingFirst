package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCollectExample() {
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

        public Criteria andCollectidIsNull() {
            addCriterion("collectId is null");
            return (Criteria) this;
        }

        public Criteria andCollectidIsNotNull() {
            addCriterion("collectId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectidEqualTo(Long value) {
            addCriterion("collectId =", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotEqualTo(Long value) {
            addCriterion("collectId <>", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThan(Long value) {
            addCriterion("collectId >", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThanOrEqualTo(Long value) {
            addCriterion("collectId >=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThan(Long value) {
            addCriterion("collectId <", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThanOrEqualTo(Long value) {
            addCriterion("collectId <=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidIn(List<Long> values) {
            addCriterion("collectId in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotIn(List<Long> values) {
            addCriterion("collectId not in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidBetween(Long value1, Long value2) {
            addCriterion("collectId between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotBetween(Long value1, Long value2) {
            addCriterion("collectId not between", value1, value2, "collectid");
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

        public Criteria andProblemidIsNull() {
            addCriterion("problemId is null");
            return (Criteria) this;
        }

        public Criteria andProblemidIsNotNull() {
            addCriterion("problemId is not null");
            return (Criteria) this;
        }

        public Criteria andProblemidEqualTo(Long value) {
            addCriterion("problemId =", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotEqualTo(Long value) {
            addCriterion("problemId <>", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThan(Long value) {
            addCriterion("problemId >", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThanOrEqualTo(Long value) {
            addCriterion("problemId >=", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidLessThan(Long value) {
            addCriterion("problemId <", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidLessThanOrEqualTo(Long value) {
            addCriterion("problemId <=", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidIn(List<Long> values) {
            addCriterion("problemId in", values, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotIn(List<Long> values) {
            addCriterion("problemId not in", values, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidBetween(Long value1, Long value2) {
            addCriterion("problemId between", value1, value2, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotBetween(Long value1, Long value2) {
            addCriterion("problemId not between", value1, value2, "problemid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Long value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Long value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Long value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Long value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Long value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Long> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Long> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Long value1, Long value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Long value1, Long value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
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