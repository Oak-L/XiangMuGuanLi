package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbRequirementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRequirementExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRequirementidIsNull() {
            addCriterion("requirementID is null");
            return (Criteria) this;
        }

        public Criteria andRequirementidIsNotNull() {
            addCriterion("requirementID is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementidEqualTo(Integer value) {
            addCriterion("requirementID =", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotEqualTo(Integer value) {
            addCriterion("requirementID <>", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThan(Integer value) {
            addCriterion("requirementID >", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThanOrEqualTo(Integer value) {
            addCriterion("requirementID >=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThan(Integer value) {
            addCriterion("requirementID <", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThanOrEqualTo(Integer value) {
            addCriterion("requirementID <=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidIn(List<Integer> values) {
            addCriterion("requirementID in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotIn(List<Integer> values) {
            addCriterion("requirementID not in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidBetween(Integer value1, Integer value2) {
            addCriterion("requirementID between", value1, value2, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotBetween(Integer value1, Integer value2) {
            addCriterion("requirementID not between", value1, value2, "requirementid");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andRequirementnameIsNull() {
            addCriterion("requirementName is null");
            return (Criteria) this;
        }

        public Criteria andRequirementnameIsNotNull() {
            addCriterion("requirementName is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementnameEqualTo(String value) {
            addCriterion("requirementName =", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameNotEqualTo(String value) {
            addCriterion("requirementName <>", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameGreaterThan(String value) {
            addCriterion("requirementName >", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameGreaterThanOrEqualTo(String value) {
            addCriterion("requirementName >=", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameLessThan(String value) {
            addCriterion("requirementName <", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameLessThanOrEqualTo(String value) {
            addCriterion("requirementName <=", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameLike(String value) {
            addCriterion("requirementName like", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameNotLike(String value) {
            addCriterion("requirementName not like", value, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameIn(List<String> values) {
            addCriterion("requirementName in", values, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameNotIn(List<String> values) {
            addCriterion("requirementName not in", values, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameBetween(String value1, String value2) {
            addCriterion("requirementName between", value1, value2, "requirementname");
            return (Criteria) this;
        }

        public Criteria andRequirementnameNotBetween(String value1, String value2) {
            addCriterion("requirementName not between", value1, value2, "requirementname");
            return (Criteria) this;
        }

        public Criteria andEditionIsNull() {
            addCriterion("Edition is null");
            return (Criteria) this;
        }

        public Criteria andEditionIsNotNull() {
            addCriterion("Edition is not null");
            return (Criteria) this;
        }

        public Criteria andEditionEqualTo(Float value) {
            addCriterion("Edition =", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotEqualTo(Float value) {
            addCriterion("Edition <>", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThan(Float value) {
            addCriterion("Edition >", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThanOrEqualTo(Float value) {
            addCriterion("Edition >=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThan(Float value) {
            addCriterion("Edition <", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThanOrEqualTo(Float value) {
            addCriterion("Edition <=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionIn(List<Float> values) {
            addCriterion("Edition in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotIn(List<Float> values) {
            addCriterion("Edition not in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionBetween(Float value1, Float value2) {
            addCriterion("Edition between", value1, value2, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotBetween(Float value1, Float value2) {
            addCriterion("Edition not between", value1, value2, "edition");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UpdateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("Descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("Descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("Descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("Descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("Descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("Descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("Descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("Descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("Descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("Descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("Descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("Descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("Descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("Descript not between", value1, value2, "descript");
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