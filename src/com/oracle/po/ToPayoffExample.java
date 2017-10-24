package com.oracle.po;

import java.util.ArrayList;
import java.util.List;

public class ToPayoffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToPayoffExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("PayID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PayID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("PayID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("PayID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("PayID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("PayID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("PayID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("PayID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("PayID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("PayID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayID not between", value1, value2, "payid");
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

        public Criteria andTbEmpidIsNull() {
            addCriterion("TB__EmpID is null");
            return (Criteria) this;
        }

        public Criteria andTbEmpidIsNotNull() {
            addCriterion("TB__EmpID is not null");
            return (Criteria) this;
        }

        public Criteria andTbEmpidEqualTo(Integer value) {
            addCriterion("TB__EmpID =", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotEqualTo(Integer value) {
            addCriterion("TB__EmpID <>", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidGreaterThan(Integer value) {
            addCriterion("TB__EmpID >", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TB__EmpID >=", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidLessThan(Integer value) {
            addCriterion("TB__EmpID <", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("TB__EmpID <=", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidIn(List<Integer> values) {
            addCriterion("TB__EmpID in", values, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotIn(List<Integer> values) {
            addCriterion("TB__EmpID not in", values, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidBetween(Integer value1, Integer value2) {
            addCriterion("TB__EmpID between", value1, value2, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("TB__EmpID not between", value1, value2, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andSalIsNull() {
            addCriterion("Sal is null");
            return (Criteria) this;
        }

        public Criteria andSalIsNotNull() {
            addCriterion("Sal is not null");
            return (Criteria) this;
        }

        public Criteria andSalEqualTo(Integer value) {
            addCriterion("Sal =", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotEqualTo(Integer value) {
            addCriterion("Sal <>", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalGreaterThan(Integer value) {
            addCriterion("Sal >", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sal >=", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalLessThan(Integer value) {
            addCriterion("Sal <", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalLessThanOrEqualTo(Integer value) {
            addCriterion("Sal <=", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalIn(List<Integer> values) {
            addCriterion("Sal in", values, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotIn(List<Integer> values) {
            addCriterion("Sal not in", values, "sal");
            return (Criteria) this;
        }

        public Criteria andSalBetween(Integer value1, Integer value2) {
            addCriterion("Sal between", value1, value2, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotBetween(Integer value1, Integer value2) {
            addCriterion("Sal not between", value1, value2, "sal");
            return (Criteria) this;
        }

        public Criteria andCommIsNull() {
            addCriterion("comm is null");
            return (Criteria) this;
        }

        public Criteria andCommIsNotNull() {
            addCriterion("comm is not null");
            return (Criteria) this;
        }

        public Criteria andCommEqualTo(Integer value) {
            addCriterion("comm =", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotEqualTo(Integer value) {
            addCriterion("comm <>", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThan(Integer value) {
            addCriterion("comm >", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm >=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThan(Integer value) {
            addCriterion("comm <", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThanOrEqualTo(Integer value) {
            addCriterion("comm <=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommIn(List<Integer> values) {
            addCriterion("comm in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotIn(List<Integer> values) {
            addCriterion("comm not in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommBetween(Integer value1, Integer value2) {
            addCriterion("comm between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotBetween(Integer value1, Integer value2) {
            addCriterion("comm not between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andDeductsumIsNull() {
            addCriterion("deductSum is null");
            return (Criteria) this;
        }

        public Criteria andDeductsumIsNotNull() {
            addCriterion("deductSum is not null");
            return (Criteria) this;
        }

        public Criteria andDeductsumEqualTo(Integer value) {
            addCriterion("deductSum =", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotEqualTo(Integer value) {
            addCriterion("deductSum <>", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumGreaterThan(Integer value) {
            addCriterion("deductSum >", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("deductSum >=", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumLessThan(Integer value) {
            addCriterion("deductSum <", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumLessThanOrEqualTo(Integer value) {
            addCriterion("deductSum <=", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumIn(List<Integer> values) {
            addCriterion("deductSum in", values, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotIn(List<Integer> values) {
            addCriterion("deductSum not in", values, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumBetween(Integer value1, Integer value2) {
            addCriterion("deductSum between", value1, value2, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotBetween(Integer value1, Integer value2) {
            addCriterion("deductSum not between", value1, value2, "deductsum");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
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