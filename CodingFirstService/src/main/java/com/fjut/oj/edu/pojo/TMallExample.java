package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andMallidIsNull() {
            addCriterion("mallId is null");
            return (Criteria) this;
        }

        public Criteria andMallidIsNotNull() {
            addCriterion("mallId is not null");
            return (Criteria) this;
        }

        public Criteria andMallidEqualTo(Long value) {
            addCriterion("mallId =", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotEqualTo(Long value) {
            addCriterion("mallId <>", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidGreaterThan(Long value) {
            addCriterion("mallId >", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidGreaterThanOrEqualTo(Long value) {
            addCriterion("mallId >=", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidLessThan(Long value) {
            addCriterion("mallId <", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidLessThanOrEqualTo(Long value) {
            addCriterion("mallId <=", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidIn(List<Long> values) {
            addCriterion("mallId in", values, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotIn(List<Long> values) {
            addCriterion("mallId not in", values, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidBetween(Long value1, Long value2) {
            addCriterion("mallId between", value1, value2, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotBetween(Long value1, Long value2) {
            addCriterion("mallId not between", value1, value2, "mallid");
            return (Criteria) this;
        }

        public Criteria andMalltitleIsNull() {
            addCriterion("mallTitle is null");
            return (Criteria) this;
        }

        public Criteria andMalltitleIsNotNull() {
            addCriterion("mallTitle is not null");
            return (Criteria) this;
        }

        public Criteria andMalltitleEqualTo(String value) {
            addCriterion("mallTitle =", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleNotEqualTo(String value) {
            addCriterion("mallTitle <>", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleGreaterThan(String value) {
            addCriterion("mallTitle >", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleGreaterThanOrEqualTo(String value) {
            addCriterion("mallTitle >=", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleLessThan(String value) {
            addCriterion("mallTitle <", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleLessThanOrEqualTo(String value) {
            addCriterion("mallTitle <=", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleLike(String value) {
            addCriterion("mallTitle like", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleNotLike(String value) {
            addCriterion("mallTitle not like", value, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleIn(List<String> values) {
            addCriterion("mallTitle in", values, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleNotIn(List<String> values) {
            addCriterion("mallTitle not in", values, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleBetween(String value1, String value2) {
            addCriterion("mallTitle between", value1, value2, "malltitle");
            return (Criteria) this;
        }

        public Criteria andMalltitleNotBetween(String value1, String value2) {
            addCriterion("mallTitle not between", value1, value2, "malltitle");
            return (Criteria) this;
        }

        public Criteria andAcbIsNull() {
            addCriterion("acb is null");
            return (Criteria) this;
        }

        public Criteria andAcbIsNotNull() {
            addCriterion("acb is not null");
            return (Criteria) this;
        }

        public Criteria andAcbEqualTo(Long value) {
            addCriterion("acb =", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbNotEqualTo(Long value) {
            addCriterion("acb <>", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbGreaterThan(Long value) {
            addCriterion("acb >", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbGreaterThanOrEqualTo(Long value) {
            addCriterion("acb >=", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbLessThan(Long value) {
            addCriterion("acb <", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbLessThanOrEqualTo(Long value) {
            addCriterion("acb <=", value, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbIn(List<Long> values) {
            addCriterion("acb in", values, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbNotIn(List<Long> values) {
            addCriterion("acb not in", values, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbBetween(Long value1, Long value2) {
            addCriterion("acb between", value1, value2, "acb");
            return (Criteria) this;
        }

        public Criteria andAcbNotBetween(Long value1, Long value2) {
            addCriterion("acb not between", value1, value2, "acb");
            return (Criteria) this;
        }

        public Criteria andRmbIsNull() {
            addCriterion("rmb is null");
            return (Criteria) this;
        }

        public Criteria andRmbIsNotNull() {
            addCriterion("rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRmbEqualTo(Long value) {
            addCriterion("rmb =", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotEqualTo(Long value) {
            addCriterion("rmb <>", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbGreaterThan(Long value) {
            addCriterion("rmb >", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbGreaterThanOrEqualTo(Long value) {
            addCriterion("rmb >=", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbLessThan(Long value) {
            addCriterion("rmb <", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbLessThanOrEqualTo(Long value) {
            addCriterion("rmb <=", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbIn(List<Long> values) {
            addCriterion("rmb in", values, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotIn(List<Long> values) {
            addCriterion("rmb not in", values, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbBetween(Long value1, Long value2) {
            addCriterion("rmb between", value1, value2, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotBetween(Long value1, Long value2) {
            addCriterion("rmb not between", value1, value2, "rmb");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCTime("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCTime("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCTime("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andBuylimitIsNull() {
            addCriterion("buyLimit is null");
            return (Criteria) this;
        }

        public Criteria andBuylimitIsNotNull() {
            addCriterion("buyLimit is not null");
            return (Criteria) this;
        }

        public Criteria andBuylimitEqualTo(Long value) {
            addCriterion("buyLimit =", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitNotEqualTo(Long value) {
            addCriterion("buyLimit <>", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitGreaterThan(Long value) {
            addCriterion("buyLimit >", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitGreaterThanOrEqualTo(Long value) {
            addCriterion("buyLimit >=", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitLessThan(Long value) {
            addCriterion("buyLimit <", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitLessThanOrEqualTo(Long value) {
            addCriterion("buyLimit <=", value, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitIn(List<Long> values) {
            addCriterion("buyLimit in", values, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitNotIn(List<Long> values) {
            addCriterion("buyLimit not in", values, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitBetween(Long value1, Long value2) {
            addCriterion("buyLimit between", value1, value2, "buylimit");
            return (Criteria) this;
        }

        public Criteria andBuylimitNotBetween(Long value1, Long value2) {
            addCriterion("buyLimit not between", value1, value2, "buylimit");
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