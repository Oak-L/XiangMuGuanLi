package com.oracle.po;

import java.util.ArrayList;
import java.util.List;

public class TbReceivemessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbReceivemessageExample() {
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

        public Criteria andReceiveidIsNull() {
            addCriterion("RECEIVEID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveidIsNotNull() {
            addCriterion("RECEIVEID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveidEqualTo(Integer value) {
            addCriterion("RECEIVEID =", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotEqualTo(Integer value) {
            addCriterion("RECEIVEID <>", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThan(Integer value) {
            addCriterion("RECEIVEID >", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECEIVEID >=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThan(Integer value) {
            addCriterion("RECEIVEID <", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThanOrEqualTo(Integer value) {
            addCriterion("RECEIVEID <=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidIn(List<Integer> values) {
            addCriterion("RECEIVEID in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotIn(List<Integer> values) {
            addCriterion("RECEIVEID not in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVEID between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVEID not between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andSendidIsNull() {
            addCriterion("SENDID is null");
            return (Criteria) this;
        }

        public Criteria andSendidIsNotNull() {
            addCriterion("SENDID is not null");
            return (Criteria) this;
        }

        public Criteria andSendidEqualTo(Integer value) {
            addCriterion("SENDID =", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotEqualTo(Integer value) {
            addCriterion("SENDID <>", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThan(Integer value) {
            addCriterion("SENDID >", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENDID >=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThan(Integer value) {
            addCriterion("SENDID <", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThanOrEqualTo(Integer value) {
            addCriterion("SENDID <=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidIn(List<Integer> values) {
            addCriterion("SENDID in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotIn(List<Integer> values) {
            addCriterion("SENDID not in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidBetween(Integer value1, Integer value2) {
            addCriterion("SENDID between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotBetween(Integer value1, Integer value2) {
            addCriterion("SENDID not between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andMessagestateIsNull() {
            addCriterion("MESSAGESTATE is null");
            return (Criteria) this;
        }

        public Criteria andMessagestateIsNotNull() {
            addCriterion("MESSAGESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestateEqualTo(String value) {
            addCriterion("MESSAGESTATE =", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotEqualTo(String value) {
            addCriterion("MESSAGESTATE <>", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThan(String value) {
            addCriterion("MESSAGESTATE >", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGESTATE >=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThan(String value) {
            addCriterion("MESSAGESTATE <", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThanOrEqualTo(String value) {
            addCriterion("MESSAGESTATE <=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLike(String value) {
            addCriterion("MESSAGESTATE like", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotLike(String value) {
            addCriterion("MESSAGESTATE not like", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateIn(List<String> values) {
            addCriterion("MESSAGESTATE in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotIn(List<String> values) {
            addCriterion("MESSAGESTATE not in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateBetween(String value1, String value2) {
            addCriterion("MESSAGESTATE between", value1, value2, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotBetween(String value1, String value2) {
            addCriterion("MESSAGESTATE not between", value1, value2, "messagestate");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
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