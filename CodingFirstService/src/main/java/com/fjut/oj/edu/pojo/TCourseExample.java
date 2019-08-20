package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCourseExample() {
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

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionIsNull() {
            addCriterion("courseIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionIsNotNull() {
            addCriterion("courseIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionEqualTo(String value) {
            addCriterion("courseIntroduction =", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionNotEqualTo(String value) {
            addCriterion("courseIntroduction <>", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionGreaterThan(String value) {
            addCriterion("courseIntroduction >", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("courseIntroduction >=", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionLessThan(String value) {
            addCriterion("courseIntroduction <", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionLessThanOrEqualTo(String value) {
            addCriterion("courseIntroduction <=", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionLike(String value) {
            addCriterion("courseIntroduction like", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionNotLike(String value) {
            addCriterion("courseIntroduction not like", value, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionIn(List<String> values) {
            addCriterion("courseIntroduction in", values, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionNotIn(List<String> values) {
            addCriterion("courseIntroduction not in", values, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionBetween(String value1, String value2) {
            addCriterion("courseIntroduction between", value1, value2, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseintroductionNotBetween(String value1, String value2) {
            addCriterion("courseIntroduction not between", value1, value2, "courseintroduction");
            return (Criteria) this;
        }

        public Criteria andCourseimgIsNull() {
            addCriterion("courseImg is null");
            return (Criteria) this;
        }

        public Criteria andCourseimgIsNotNull() {
            addCriterion("courseImg is not null");
            return (Criteria) this;
        }

        public Criteria andCourseimgEqualTo(String value) {
            addCriterion("courseImg =", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgNotEqualTo(String value) {
            addCriterion("courseImg <>", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgGreaterThan(String value) {
            addCriterion("courseImg >", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgGreaterThanOrEqualTo(String value) {
            addCriterion("courseImg >=", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgLessThan(String value) {
            addCriterion("courseImg <", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgLessThanOrEqualTo(String value) {
            addCriterion("courseImg <=", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgLike(String value) {
            addCriterion("courseImg like", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgNotLike(String value) {
            addCriterion("courseImg not like", value, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgIn(List<String> values) {
            addCriterion("courseImg in", values, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgNotIn(List<String> values) {
            addCriterion("courseImg not in", values, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgBetween(String value1, String value2) {
            addCriterion("courseImg between", value1, value2, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourseimgNotBetween(String value1, String value2) {
            addCriterion("courseImg not between", value1, value2, "courseimg");
            return (Criteria) this;
        }

        public Criteria andCourselengthIsNull() {
            addCriterion("courseLength is null");
            return (Criteria) this;
        }

        public Criteria andCourselengthIsNotNull() {
            addCriterion("courseLength is not null");
            return (Criteria) this;
        }

        public Criteria andCourselengthEqualTo(Long value) {
            addCriterion("courseLength =", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthNotEqualTo(Long value) {
            addCriterion("courseLength <>", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthGreaterThan(Long value) {
            addCriterion("courseLength >", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthGreaterThanOrEqualTo(Long value) {
            addCriterion("courseLength >=", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthLessThan(Long value) {
            addCriterion("courseLength <", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthLessThanOrEqualTo(Long value) {
            addCriterion("courseLength <=", value, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthIn(List<Long> values) {
            addCriterion("courseLength in", values, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthNotIn(List<Long> values) {
            addCriterion("courseLength not in", values, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthBetween(Long value1, Long value2) {
            addCriterion("courseLength between", value1, value2, "courselength");
            return (Criteria) this;
        }

        public Criteria andCourselengthNotBetween(Long value1, Long value2) {
            addCriterion("courseLength not between", value1, value2, "courselength");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIsNull() {
            addCriterion("courseStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIsNotNull() {
            addCriterion("courseStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeEqualTo(Date value) {
            addCriterion("courseStartTime =", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotEqualTo(Date value) {
            addCriterion("courseStartTime <>", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThan(Date value) {
            addCriterion("courseStartTime >", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("courseStartTime >=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThan(Date value) {
            addCriterion("courseStartTime <", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThanOrEqualTo(Date value) {
            addCriterion("courseStartTime <=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIn(List<Date> values) {
            addCriterion("courseStartTime in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotIn(List<Date> values) {
            addCriterion("courseStartTime not in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeBetween(Date value1, Date value2) {
            addCriterion("courseStartTime between", value1, value2, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotBetween(Date value1, Date value2) {
            addCriterion("courseStartTime not between", value1, value2, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIsNull() {
            addCriterion("courseEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIsNotNull() {
            addCriterion("courseEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeEqualTo(Date value) {
            addCriterion("courseEndTime =", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotEqualTo(Date value) {
            addCriterion("courseEndTime <>", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThan(Date value) {
            addCriterion("courseEndTime >", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("courseEndTime >=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThan(Date value) {
            addCriterion("courseEndTime <", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThanOrEqualTo(Date value) {
            addCriterion("courseEndTime <=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIn(List<Date> values) {
            addCriterion("courseEndTime in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotIn(List<Date> values) {
            addCriterion("courseEndTime not in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeBetween(Date value1, Date value2) {
            addCriterion("courseEndTime between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotBetween(Date value1, Date value2) {
            addCriterion("courseEndTime not between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Long value) {
            addCriterion("teacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Long value) {
            addCriterion("teacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Long value) {
            addCriterion("teacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("teacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Long value) {
            addCriterion("teacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("teacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Long> values) {
            addCriterion("teacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Long> values) {
            addCriterion("teacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Long value1, Long value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andCoursechargeIsNull() {
            addCriterion("courseCharge is null");
            return (Criteria) this;
        }

        public Criteria andCoursechargeIsNotNull() {
            addCriterion("courseCharge is not null");
            return (Criteria) this;
        }

        public Criteria andCoursechargeEqualTo(Double value) {
            addCriterion("courseCharge =", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeNotEqualTo(Double value) {
            addCriterion("courseCharge <>", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeGreaterThan(Double value) {
            addCriterion("courseCharge >", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeGreaterThanOrEqualTo(Double value) {
            addCriterion("courseCharge >=", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeLessThan(Double value) {
            addCriterion("courseCharge <", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeLessThanOrEqualTo(Double value) {
            addCriterion("courseCharge <=", value, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeIn(List<Double> values) {
            addCriterion("courseCharge in", values, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeNotIn(List<Double> values) {
            addCriterion("courseCharge not in", values, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeBetween(Double value1, Double value2) {
            addCriterion("courseCharge between", value1, value2, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursechargeNotBetween(Double value1, Double value2) {
            addCriterion("courseCharge not between", value1, value2, "coursecharge");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountIsNull() {
            addCriterion("courseNumAccount is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountIsNotNull() {
            addCriterion("courseNumAccount is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountEqualTo(Long value) {
            addCriterion("courseNumAccount =", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountNotEqualTo(Long value) {
            addCriterion("courseNumAccount <>", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountGreaterThan(Long value) {
            addCriterion("courseNumAccount >", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountGreaterThanOrEqualTo(Long value) {
            addCriterion("courseNumAccount >=", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountLessThan(Long value) {
            addCriterion("courseNumAccount <", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountLessThanOrEqualTo(Long value) {
            addCriterion("courseNumAccount <=", value, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountIn(List<Long> values) {
            addCriterion("courseNumAccount in", values, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountNotIn(List<Long> values) {
            addCriterion("courseNumAccount not in", values, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountBetween(Long value1, Long value2) {
            addCriterion("courseNumAccount between", value1, value2, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursenumaccountNotBetween(Long value1, Long value2) {
            addCriterion("courseNumAccount not between", value1, value2, "coursenumaccount");
            return (Criteria) this;
        }

        public Criteria andCoursepushIsNull() {
            addCriterion("coursePush is null");
            return (Criteria) this;
        }

        public Criteria andCoursepushIsNotNull() {
            addCriterion("coursePush is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepushEqualTo(Long value) {
            addCriterion("coursePush =", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushNotEqualTo(Long value) {
            addCriterion("coursePush <>", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushGreaterThan(Long value) {
            addCriterion("coursePush >", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushGreaterThanOrEqualTo(Long value) {
            addCriterion("coursePush >=", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushLessThan(Long value) {
            addCriterion("coursePush <", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushLessThanOrEqualTo(Long value) {
            addCriterion("coursePush <=", value, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushIn(List<Long> values) {
            addCriterion("coursePush in", values, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushNotIn(List<Long> values) {
            addCriterion("coursePush not in", values, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushBetween(Long value1, Long value2) {
            addCriterion("coursePush between", value1, value2, "coursepush");
            return (Criteria) this;
        }

        public Criteria andCoursepushNotBetween(Long value1, Long value2) {
            addCriterion("coursePush not between", value1, value2, "coursepush");
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