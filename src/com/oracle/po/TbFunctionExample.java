package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFunctionExample() {
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

        public Criteria andFunctionidIsNull() {
            addCriterion("FunctionID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("FunctionID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(Integer value) {
            addCriterion("FunctionID =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(Integer value) {
            addCriterion("FunctionID <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(Integer value) {
            addCriterion("FunctionID >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FunctionID >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(Integer value) {
            addCriterion("FunctionID <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(Integer value) {
            addCriterion("FunctionID <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<Integer> values) {
            addCriterion("FunctionID in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<Integer> values) {
            addCriterion("FunctionID not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(Integer value1, Integer value2) {
            addCriterion("FunctionID between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(Integer value1, Integer value2) {
            addCriterion("FunctionID not between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNull() {
            addCriterion("moduleID is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("moduleID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(Integer value) {
            addCriterion("moduleID =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(Integer value) {
            addCriterion("moduleID <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(Integer value) {
            addCriterion("moduleID >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moduleID >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(Integer value) {
            addCriterion("moduleID <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(Integer value) {
            addCriterion("moduleID <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<Integer> values) {
            addCriterion("moduleID in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<Integer> values) {
            addCriterion("moduleID not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(Integer value1, Integer value2) {
            addCriterion("moduleID between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(Integer value1, Integer value2) {
            addCriterion("moduleID not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNull() {
            addCriterion("FunctionName is null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNotNull() {
            addCriterion("FunctionName is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameEqualTo(String value) {
            addCriterion("FunctionName =", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotEqualTo(String value) {
            addCriterion("FunctionName <>", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThan(String value) {
            addCriterion("FunctionName >", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionName >=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThan(String value) {
            addCriterion("FunctionName <", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThanOrEqualTo(String value) {
            addCriterion("FunctionName <=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLike(String value) {
            addCriterion("FunctionName like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotLike(String value) {
            addCriterion("FunctionName not like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIn(List<String> values) {
            addCriterion("FunctionName in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotIn(List<String> values) {
            addCriterion("FunctionName not in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameBetween(String value1, String value2) {
            addCriterion("FunctionName between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotBetween(String value1, String value2) {
            addCriterion("FunctionName not between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andFunctiondescIsNull() {
            addCriterion("FunctionDesc is null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescIsNotNull() {
            addCriterion("FunctionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescEqualTo(String value) {
            addCriterion("FunctionDesc =", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotEqualTo(String value) {
            addCriterion("FunctionDesc <>", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescGreaterThan(String value) {
            addCriterion("FunctionDesc >", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionDesc >=", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLessThan(String value) {
            addCriterion("FunctionDesc <", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLessThanOrEqualTo(String value) {
            addCriterion("FunctionDesc <=", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLike(String value) {
            addCriterion("FunctionDesc like", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotLike(String value) {
            addCriterion("FunctionDesc not like", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescIn(List<String> values) {
            addCriterion("FunctionDesc in", values, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotIn(List<String> values) {
            addCriterion("FunctionDesc not in", values, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescBetween(String value1, String value2) {
            addCriterion("FunctionDesc between", value1, value2, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotBetween(String value1, String value2) {
            addCriterion("FunctionDesc not between", value1, value2, "functiondesc");
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