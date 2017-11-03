package com.oracle.po;

import java.util.ArrayList;
import java.util.List;

public class TbDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDutyExample() {
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

        public Criteria andDutyidIsNull() {
            addCriterion("DUTYID is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("DUTYID is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(Integer value) {
            addCriterion("DUTYID =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(Integer value) {
            addCriterion("DUTYID <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(Integer value) {
            addCriterion("DUTYID >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DUTYID >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(Integer value) {
            addCriterion("DUTYID <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(Integer value) {
            addCriterion("DUTYID <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<Integer> values) {
            addCriterion("DUTYID in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<Integer> values) {
            addCriterion("DUTYID not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(Integer value1, Integer value2) {
            addCriterion("DUTYID between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(Integer value1, Integer value2) {
            addCriterion("DUTYID not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutynameIsNull() {
            addCriterion("DUTYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDutynameIsNotNull() {
            addCriterion("DUTYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDutynameEqualTo(String value) {
            addCriterion("DUTYNAME =", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotEqualTo(String value) {
            addCriterion("DUTYNAME <>", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameGreaterThan(String value) {
            addCriterion("DUTYNAME >", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameGreaterThanOrEqualTo(String value) {
            addCriterion("DUTYNAME >=", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLessThan(String value) {
            addCriterion("DUTYNAME <", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLessThanOrEqualTo(String value) {
            addCriterion("DUTYNAME <=", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLike(String value) {
            addCriterion("DUTYNAME like", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotLike(String value) {
            addCriterion("DUTYNAME not like", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameIn(List<String> values) {
            addCriterion("DUTYNAME in", values, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotIn(List<String> values) {
            addCriterion("DUTYNAME not in", values, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameBetween(String value1, String value2) {
            addCriterion("DUTYNAME between", value1, value2, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotBetween(String value1, String value2) {
            addCriterion("DUTYNAME not between", value1, value2, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("DESCRIPT is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("DESCRIPT is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("DESCRIPT =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("DESCRIPT <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("DESCRIPT >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPT >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("DESCRIPT <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPT <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("DESCRIPT like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("DESCRIPT not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("DESCRIPT in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("DESCRIPT not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("DESCRIPT between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("DESCRIPT not between", value1, value2, "descript");
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