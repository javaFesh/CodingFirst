package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProblemExample() {
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

        public Criteria andProblemtypeIsNull() {
            addCriterion("problemType is null");
            return (Criteria) this;
        }

        public Criteria andProblemtypeIsNotNull() {
            addCriterion("problemType is not null");
            return (Criteria) this;
        }

        public Criteria andProblemtypeEqualTo(Long value) {
            addCriterion("problemType =", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotEqualTo(Long value) {
            addCriterion("problemType <>", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeGreaterThan(Long value) {
            addCriterion("problemType >", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeGreaterThanOrEqualTo(Long value) {
            addCriterion("problemType >=", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeLessThan(Long value) {
            addCriterion("problemType <", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeLessThanOrEqualTo(Long value) {
            addCriterion("problemType <=", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeIn(List<Long> values) {
            addCriterion("problemType in", values, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotIn(List<Long> values) {
            addCriterion("problemType not in", values, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeBetween(Long value1, Long value2) {
            addCriterion("problemType between", value1, value2, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotBetween(Long value1, Long value2) {
            addCriterion("problemType not between", value1, value2, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtitleIsNull() {
            addCriterion("problemTitle is null");
            return (Criteria) this;
        }

        public Criteria andProblemtitleIsNotNull() {
            addCriterion("problemTitle is not null");
            return (Criteria) this;
        }

        public Criteria andProblemtitleEqualTo(String value) {
            addCriterion("problemTitle =", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleNotEqualTo(String value) {
            addCriterion("problemTitle <>", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleGreaterThan(String value) {
            addCriterion("problemTitle >", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleGreaterThanOrEqualTo(String value) {
            addCriterion("problemTitle >=", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleLessThan(String value) {
            addCriterion("problemTitle <", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleLessThanOrEqualTo(String value) {
            addCriterion("problemTitle <=", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleLike(String value) {
            addCriterion("problemTitle like", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleNotLike(String value) {
            addCriterion("problemTitle not like", value, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleIn(List<String> values) {
            addCriterion("problemTitle in", values, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleNotIn(List<String> values) {
            addCriterion("problemTitle not in", values, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleBetween(String value1, String value2) {
            addCriterion("problemTitle between", value1, value2, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemtitleNotBetween(String value1, String value2) {
            addCriterion("problemTitle not between", value1, value2, "problemtitle");
            return (Criteria) this;
        }

        public Criteria andProblemawardIsNull() {
            addCriterion("problemAward is null");
            return (Criteria) this;
        }

        public Criteria andProblemawardIsNotNull() {
            addCriterion("problemAward is not null");
            return (Criteria) this;
        }

        public Criteria andProblemawardEqualTo(Long value) {
            addCriterion("problemAward =", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardNotEqualTo(Long value) {
            addCriterion("problemAward <>", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardGreaterThan(Long value) {
            addCriterion("problemAward >", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardGreaterThanOrEqualTo(Long value) {
            addCriterion("problemAward >=", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardLessThan(Long value) {
            addCriterion("problemAward <", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardLessThanOrEqualTo(Long value) {
            addCriterion("problemAward <=", value, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardIn(List<Long> values) {
            addCriterion("problemAward in", values, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardNotIn(List<Long> values) {
            addCriterion("problemAward not in", values, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardBetween(Long value1, Long value2) {
            addCriterion("problemAward between", value1, value2, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemawardNotBetween(Long value1, Long value2) {
            addCriterion("problemAward not between", value1, value2, "problemaward");
            return (Criteria) this;
        }

        public Criteria andProblemauthorIsNull() {
            addCriterion("problemAuthor is null");
            return (Criteria) this;
        }

        public Criteria andProblemauthorIsNotNull() {
            addCriterion("problemAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andProblemauthorEqualTo(String value) {
            addCriterion("problemAuthor =", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorNotEqualTo(String value) {
            addCriterion("problemAuthor <>", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorGreaterThan(String value) {
            addCriterion("problemAuthor >", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorGreaterThanOrEqualTo(String value) {
            addCriterion("problemAuthor >=", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorLessThan(String value) {
            addCriterion("problemAuthor <", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorLessThanOrEqualTo(String value) {
            addCriterion("problemAuthor <=", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorLike(String value) {
            addCriterion("problemAuthor like", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorNotLike(String value) {
            addCriterion("problemAuthor not like", value, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorIn(List<String> values) {
            addCriterion("problemAuthor in", values, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorNotIn(List<String> values) {
            addCriterion("problemAuthor not in", values, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorBetween(String value1, String value2) {
            addCriterion("problemAuthor between", value1, value2, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemauthorNotBetween(String value1, String value2) {
            addCriterion("problemAuthor not between", value1, value2, "problemauthor");
            return (Criteria) this;
        }

        public Criteria andProblemownerIsNull() {
            addCriterion("problemOwner is null");
            return (Criteria) this;
        }

        public Criteria andProblemownerIsNotNull() {
            addCriterion("problemOwner is not null");
            return (Criteria) this;
        }

        public Criteria andProblemownerEqualTo(String value) {
            addCriterion("problemOwner =", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerNotEqualTo(String value) {
            addCriterion("problemOwner <>", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerGreaterThan(String value) {
            addCriterion("problemOwner >", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerGreaterThanOrEqualTo(String value) {
            addCriterion("problemOwner >=", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerLessThan(String value) {
            addCriterion("problemOwner <", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerLessThanOrEqualTo(String value) {
            addCriterion("problemOwner <=", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerLike(String value) {
            addCriterion("problemOwner like", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerNotLike(String value) {
            addCriterion("problemOwner not like", value, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerIn(List<String> values) {
            addCriterion("problemOwner in", values, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerNotIn(List<String> values) {
            addCriterion("problemOwner not in", values, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerBetween(String value1, String value2) {
            addCriterion("problemOwner between", value1, value2, "problemowner");
            return (Criteria) this;
        }

        public Criteria andProblemownerNotBetween(String value1, String value2) {
            addCriterion("problemOwner not between", value1, value2, "problemowner");
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

        public Criteria andProblemansIsNull() {
            addCriterion("problemAns is null");
            return (Criteria) this;
        }

        public Criteria andProblemansIsNotNull() {
            addCriterion("problemAns is not null");
            return (Criteria) this;
        }

        public Criteria andProblemansEqualTo(String value) {
            addCriterion("problemAns =", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansNotEqualTo(String value) {
            addCriterion("problemAns <>", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansGreaterThan(String value) {
            addCriterion("problemAns >", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansGreaterThanOrEqualTo(String value) {
            addCriterion("problemAns >=", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansLessThan(String value) {
            addCriterion("problemAns <", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansLessThanOrEqualTo(String value) {
            addCriterion("problemAns <=", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansLike(String value) {
            addCriterion("problemAns like", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansNotLike(String value) {
            addCriterion("problemAns not like", value, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansIn(List<String> values) {
            addCriterion("problemAns in", values, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansNotIn(List<String> values) {
            addCriterion("problemAns not in", values, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansBetween(String value1, String value2) {
            addCriterion("problemAns between", value1, value2, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemansNotBetween(String value1, String value2) {
            addCriterion("problemAns not between", value1, value2, "problemans");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisIsNull() {
            addCriterion("problemAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisIsNotNull() {
            addCriterion("problemAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisEqualTo(String value) {
            addCriterion("problemAnalysis =", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisNotEqualTo(String value) {
            addCriterion("problemAnalysis <>", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisGreaterThan(String value) {
            addCriterion("problemAnalysis >", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("problemAnalysis >=", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisLessThan(String value) {
            addCriterion("problemAnalysis <", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisLessThanOrEqualTo(String value) {
            addCriterion("problemAnalysis <=", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisLike(String value) {
            addCriterion("problemAnalysis like", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisNotLike(String value) {
            addCriterion("problemAnalysis not like", value, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisIn(List<String> values) {
            addCriterion("problemAnalysis in", values, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisNotIn(List<String> values) {
            addCriterion("problemAnalysis not in", values, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisBetween(String value1, String value2) {
            addCriterion("problemAnalysis between", value1, value2, "problemanalysis");
            return (Criteria) this;
        }

        public Criteria andProblemanalysisNotBetween(String value1, String value2) {
            addCriterion("problemAnalysis not between", value1, value2, "problemanalysis");
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