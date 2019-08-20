package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TChapterExample() {
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

        public Criteria andChapteridIsNull() {
            addCriterion("chapterId is null");
            return (Criteria) this;
        }

        public Criteria andChapteridIsNotNull() {
            addCriterion("chapterId is not null");
            return (Criteria) this;
        }

        public Criteria andChapteridEqualTo(Long value) {
            addCriterion("chapterId =", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotEqualTo(Long value) {
            addCriterion("chapterId <>", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThan(Long value) {
            addCriterion("chapterId >", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThanOrEqualTo(Long value) {
            addCriterion("chapterId >=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThan(Long value) {
            addCriterion("chapterId <", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThanOrEqualTo(Long value) {
            addCriterion("chapterId <=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridIn(List<Long> values) {
            addCriterion("chapterId in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotIn(List<Long> values) {
            addCriterion("chapterId not in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridBetween(Long value1, Long value2) {
            addCriterion("chapterId between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotBetween(Long value1, Long value2) {
            addCriterion("chapterId not between", value1, value2, "chapterid");
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

        public Criteria andChapternameIsNull() {
            addCriterion("chapterName is null");
            return (Criteria) this;
        }

        public Criteria andChapternameIsNotNull() {
            addCriterion("chapterName is not null");
            return (Criteria) this;
        }

        public Criteria andChapternameEqualTo(String value) {
            addCriterion("chapterName =", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotEqualTo(String value) {
            addCriterion("chapterName <>", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThan(String value) {
            addCriterion("chapterName >", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThanOrEqualTo(String value) {
            addCriterion("chapterName >=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThan(String value) {
            addCriterion("chapterName <", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThanOrEqualTo(String value) {
            addCriterion("chapterName <=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLike(String value) {
            addCriterion("chapterName like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotLike(String value) {
            addCriterion("chapterName not like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameIn(List<String> values) {
            addCriterion("chapterName in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotIn(List<String> values) {
            addCriterion("chapterName not in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameBetween(String value1, String value2) {
            addCriterion("chapterName between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotBetween(String value1, String value2) {
            addCriterion("chapterName not between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsIsNull() {
            addCriterion("chapterIntroductions is null");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsIsNotNull() {
            addCriterion("chapterIntroductions is not null");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsEqualTo(String value) {
            addCriterion("chapterIntroductions =", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsNotEqualTo(String value) {
            addCriterion("chapterIntroductions <>", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsGreaterThan(String value) {
            addCriterion("chapterIntroductions >", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsGreaterThanOrEqualTo(String value) {
            addCriterion("chapterIntroductions >=", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsLessThan(String value) {
            addCriterion("chapterIntroductions <", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsLessThanOrEqualTo(String value) {
            addCriterion("chapterIntroductions <=", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsLike(String value) {
            addCriterion("chapterIntroductions like", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsNotLike(String value) {
            addCriterion("chapterIntroductions not like", value, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsIn(List<String> values) {
            addCriterion("chapterIntroductions in", values, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsNotIn(List<String> values) {
            addCriterion("chapterIntroductions not in", values, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsBetween(String value1, String value2) {
            addCriterion("chapterIntroductions between", value1, value2, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionsNotBetween(String value1, String value2) {
            addCriterion("chapterIntroductions not between", value1, value2, "chapterintroductions");
            return (Criteria) this;
        }

        public Criteria andChapterresourceIsNull() {
            addCriterion("chapterResource is null");
            return (Criteria) this;
        }

        public Criteria andChapterresourceIsNotNull() {
            addCriterion("chapterResource is not null");
            return (Criteria) this;
        }

        public Criteria andChapterresourceEqualTo(String value) {
            addCriterion("chapterResource =", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceNotEqualTo(String value) {
            addCriterion("chapterResource <>", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceGreaterThan(String value) {
            addCriterion("chapterResource >", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceGreaterThanOrEqualTo(String value) {
            addCriterion("chapterResource >=", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceLessThan(String value) {
            addCriterion("chapterResource <", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceLessThanOrEqualTo(String value) {
            addCriterion("chapterResource <=", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceLike(String value) {
            addCriterion("chapterResource like", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceNotLike(String value) {
            addCriterion("chapterResource not like", value, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceIn(List<String> values) {
            addCriterion("chapterResource in", values, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceNotIn(List<String> values) {
            addCriterion("chapterResource not in", values, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceBetween(String value1, String value2) {
            addCriterion("chapterResource between", value1, value2, "chapterresource");
            return (Criteria) this;
        }

        public Criteria andChapterresourceNotBetween(String value1, String value2) {
            addCriterion("chapterResource not between", value1, value2, "chapterresource");
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