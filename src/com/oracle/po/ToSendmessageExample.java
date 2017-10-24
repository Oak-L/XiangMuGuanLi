package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ToSendmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToSendmessageExample() {
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

        public Criteria andSendidIsNull() {
            addCriterion("sendID is null");
            return (Criteria) this;
        }

        public Criteria andSendidIsNotNull() {
            addCriterion("sendID is not null");
            return (Criteria) this;
        }

        public Criteria andSendidEqualTo(Integer value) {
            addCriterion("sendID =", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotEqualTo(Integer value) {
            addCriterion("sendID <>", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThan(Integer value) {
            addCriterion("sendID >", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendID >=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThan(Integer value) {
            addCriterion("sendID <", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThanOrEqualTo(Integer value) {
            addCriterion("sendID <=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidIn(List<Integer> values) {
            addCriterion("sendID in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotIn(List<Integer> values) {
            addCriterion("sendID not in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidBetween(Integer value1, Integer value2) {
            addCriterion("sendID between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendID not between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EmpID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EmpID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("EmpID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("EmpID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("EmpID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmpID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("EmpID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("EmpID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("EmpID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("EmpID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("EmpID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmpID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNull() {
            addCriterion("MessageTitle is null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNotNull() {
            addCriterion("MessageTitle is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleEqualTo(String value) {
            addCriterion("MessageTitle =", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotEqualTo(String value) {
            addCriterion("MessageTitle <>", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThan(String value) {
            addCriterion("MessageTitle >", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("MessageTitle >=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThan(String value) {
            addCriterion("MessageTitle <", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThanOrEqualTo(String value) {
            addCriterion("MessageTitle <=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLike(String value) {
            addCriterion("MessageTitle like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotLike(String value) {
            addCriterion("MessageTitle not like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIn(List<String> values) {
            addCriterion("MessageTitle in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotIn(List<String> values) {
            addCriterion("MessageTitle not in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleBetween(String value1, String value2) {
            addCriterion("MessageTitle between", value1, value2, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotBetween(String value1, String value2) {
            addCriterion("MessageTitle not between", value1, value2, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("MessageContent is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("MessageContent is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("MessageContent =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("MessageContent <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("MessageContent >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("MessageContent >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("MessageContent <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("MessageContent <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("MessageContent like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("MessageContent not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("MessageContent in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("MessageContent not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("MessageContent between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("MessageContent not between", value1, value2, "messagecontent");
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

        public Criteria andMessagestateIsNull() {
            addCriterion("MessageState is null");
            return (Criteria) this;
        }

        public Criteria andMessagestateIsNotNull() {
            addCriterion("MessageState is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestateEqualTo(Integer value) {
            addCriterion("MessageState =", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotEqualTo(Integer value) {
            addCriterion("MessageState <>", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThan(Integer value) {
            addCriterion("MessageState >", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MessageState >=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThan(Integer value) {
            addCriterion("MessageState <", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThanOrEqualTo(Integer value) {
            addCriterion("MessageState <=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateIn(List<Integer> values) {
            addCriterion("MessageState in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotIn(List<Integer> values) {
            addCriterion("MessageState not in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateBetween(Integer value1, Integer value2) {
            addCriterion("MessageState between", value1, value2, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotBetween(Integer value1, Integer value2) {
            addCriterion("MessageState not between", value1, value2, "messagestate");
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