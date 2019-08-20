package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRouteExample() {
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

        public Criteria andRouteouteidIsNull() {
            addCriterion("RouteOuteid is null");
            return (Criteria) this;
        }

        public Criteria andRouteouteidIsNotNull() {
            addCriterion("RouteOuteid is not null");
            return (Criteria) this;
        }

        public Criteria andRouteouteidEqualTo(Long value) {
            addCriterion("RouteOuteid =", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidNotEqualTo(Long value) {
            addCriterion("RouteOuteid <>", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidGreaterThan(Long value) {
            addCriterion("RouteOuteid >", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidGreaterThanOrEqualTo(Long value) {
            addCriterion("RouteOuteid >=", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidLessThan(Long value) {
            addCriterion("RouteOuteid <", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidLessThanOrEqualTo(Long value) {
            addCriterion("RouteOuteid <=", value, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidIn(List<Long> values) {
            addCriterion("RouteOuteid in", values, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidNotIn(List<Long> values) {
            addCriterion("RouteOuteid not in", values, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidBetween(Long value1, Long value2) {
            addCriterion("RouteOuteid between", value1, value2, "routeouteid");
            return (Criteria) this;
        }

        public Criteria andRouteouteidNotBetween(Long value1, Long value2) {
            addCriterion("RouteOuteid not between", value1, value2, "routeouteid");
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

        public Criteria andLnameIsNull() {
            addCriterion("lname is null");
            return (Criteria) this;
        }

        public Criteria andLnameIsNotNull() {
            addCriterion("lname is not null");
            return (Criteria) this;
        }

        public Criteria andLnameEqualTo(String value) {
            addCriterion("lname =", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotEqualTo(String value) {
            addCriterion("lname <>", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThan(String value) {
            addCriterion("lname >", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThanOrEqualTo(String value) {
            addCriterion("lname >=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThan(String value) {
            addCriterion("lname <", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThanOrEqualTo(String value) {
            addCriterion("lname <=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLike(String value) {
            addCriterion("lname like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotLike(String value) {
            addCriterion("lname not like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameIn(List<String> values) {
            addCriterion("lname in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotIn(List<String> values) {
            addCriterion("lname not in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameBetween(String value1, String value2) {
            addCriterion("lname between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotBetween(String value1, String value2) {
            addCriterion("lname not between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsIsNull() {
            addCriterion("lbigintroductions is null");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsIsNotNull() {
            addCriterion("lbigintroductions is not null");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsEqualTo(String value) {
            addCriterion("lbigintroductions =", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsNotEqualTo(String value) {
            addCriterion("lbigintroductions <>", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsGreaterThan(String value) {
            addCriterion("lbigintroductions >", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsGreaterThanOrEqualTo(String value) {
            addCriterion("lbigintroductions >=", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsLessThan(String value) {
            addCriterion("lbigintroductions <", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsLessThanOrEqualTo(String value) {
            addCriterion("lbigintroductions <=", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsLike(String value) {
            addCriterion("lbigintroductions like", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsNotLike(String value) {
            addCriterion("lbigintroductions not like", value, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsIn(List<String> values) {
            addCriterion("lbigintroductions in", values, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsNotIn(List<String> values) {
            addCriterion("lbigintroductions not in", values, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsBetween(String value1, String value2) {
            addCriterion("lbigintroductions between", value1, value2, "lbigintroductions");
            return (Criteria) this;
        }

        public Criteria andLbigintroductionsNotBetween(String value1, String value2) {
            addCriterion("lbigintroductions not between", value1, value2, "lbigintroductions");
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