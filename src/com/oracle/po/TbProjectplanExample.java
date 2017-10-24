package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbProjectplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProjectplanExample() {
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

        public Criteria andPlanidIsNull() {
            addCriterion("planID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planID not between", value1, value2, "planid");
            return (Criteria) this;
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

        public Criteria andTbPlanidIsNull() {
            addCriterion("TB__planID is null");
            return (Criteria) this;
        }

        public Criteria andTbPlanidIsNotNull() {
            addCriterion("TB__planID is not null");
            return (Criteria) this;
        }

        public Criteria andTbPlanidEqualTo(Integer value) {
            addCriterion("TB__planID =", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotEqualTo(Integer value) {
            addCriterion("TB__planID <>", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidGreaterThan(Integer value) {
            addCriterion("TB__planID >", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TB__planID >=", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidLessThan(Integer value) {
            addCriterion("TB__planID <", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("TB__planID <=", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidIn(List<Integer> values) {
            addCriterion("TB__planID in", values, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotIn(List<Integer> values) {
            addCriterion("TB__planID not in", values, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidBetween(Integer value1, Integer value2) {
            addCriterion("TB__planID between", value1, value2, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("TB__planID not between", value1, value2, "tbPlanid");
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

        public Criteria andPlantitleIsNull() {
            addCriterion("planTitle is null");
            return (Criteria) this;
        }

        public Criteria andPlantitleIsNotNull() {
            addCriterion("planTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPlantitleEqualTo(String value) {
            addCriterion("planTitle =", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotEqualTo(String value) {
            addCriterion("planTitle <>", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThan(String value) {
            addCriterion("planTitle >", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThanOrEqualTo(String value) {
            addCriterion("planTitle >=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThan(String value) {
            addCriterion("planTitle <", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThanOrEqualTo(String value) {
            addCriterion("planTitle <=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLike(String value) {
            addCriterion("planTitle like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotLike(String value) {
            addCriterion("planTitle not like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleIn(List<String> values) {
            addCriterion("planTitle in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotIn(List<String> values) {
            addCriterion("planTitle not in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleBetween(String value1, String value2) {
            addCriterion("planTitle between", value1, value2, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotBetween(String value1, String value2) {
            addCriterion("planTitle not between", value1, value2, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIsNull() {
            addCriterion("planBeginDate is null");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIsNotNull() {
            addCriterion("planBeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateEqualTo(Date value) {
            addCriterionForJDBCDate("planBeginDate =", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("planBeginDate <>", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("planBeginDate >", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planBeginDate >=", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateLessThan(Date value) {
            addCriterionForJDBCDate("planBeginDate <", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planBeginDate <=", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIn(List<Date> values) {
            addCriterionForJDBCDate("planBeginDate in", values, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("planBeginDate not in", values, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planBeginDate between", value1, value2, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planBeginDate not between", value1, value2, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNull() {
            addCriterion("planEndDate is null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNotNull() {
            addCriterion("planEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateEqualTo(Date value) {
            addCriterionForJDBCDate("planEndDate =", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("planEndDate <>", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("planEndDate >", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planEndDate >=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThan(Date value) {
            addCriterionForJDBCDate("planEndDate <", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planEndDate <=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIn(List<Date> values) {
            addCriterionForJDBCDate("planEndDate in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("planEndDate not in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planEndDate between", value1, value2, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planEndDate not between", value1, value2, "planenddate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIsNull() {
            addCriterion("realBeginDate is null");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIsNotNull() {
            addCriterion("realBeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andRealbegindateEqualTo(Date value) {
            addCriterionForJDBCDate("realBeginDate =", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("realBeginDate <>", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("realBeginDate >", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realBeginDate >=", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateLessThan(Date value) {
            addCriterionForJDBCDate("realBeginDate <", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realBeginDate <=", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIn(List<Date> values) {
            addCriterionForJDBCDate("realBeginDate in", values, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("realBeginDate not in", values, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realBeginDate between", value1, value2, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realBeginDate not between", value1, value2, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealenddateIsNull() {
            addCriterion("realEndDate is null");
            return (Criteria) this;
        }

        public Criteria andRealenddateIsNotNull() {
            addCriterion("realEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andRealenddateEqualTo(Date value) {
            addCriterionForJDBCDate("realEndDate =", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("realEndDate <>", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("realEndDate >", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realEndDate >=", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateLessThan(Date value) {
            addCriterionForJDBCDate("realEndDate <", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realEndDate <=", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateIn(List<Date> values) {
            addCriterionForJDBCDate("realEndDate in", values, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("realEndDate not in", values, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realEndDate between", value1, value2, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realEndDate not between", value1, value2, "realenddate");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNull() {
            addCriterion("timeLimit is null");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNotNull() {
            addCriterion("timeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelimitEqualTo(Integer value) {
            addCriterion("timeLimit =", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotEqualTo(Integer value) {
            addCriterion("timeLimit <>", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThan(Integer value) {
            addCriterion("timeLimit >", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeLimit >=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThan(Integer value) {
            addCriterion("timeLimit <", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThanOrEqualTo(Integer value) {
            addCriterion("timeLimit <=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitIn(List<Integer> values) {
            addCriterion("timeLimit in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotIn(List<Integer> values) {
            addCriterion("timeLimit not in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitBetween(Integer value1, Integer value2) {
            addCriterion("timeLimit between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("timeLimit not between", value1, value2, "timelimit");
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

        public Criteria andTasktypeIsNull() {
            addCriterion("taskType is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("taskType is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(Integer value) {
            addCriterion("taskType =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(Integer value) {
            addCriterion("taskType <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(Integer value) {
            addCriterion("taskType >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskType >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(Integer value) {
            addCriterion("taskType <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(Integer value) {
            addCriterion("taskType <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<Integer> values) {
            addCriterion("taskType in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<Integer> values) {
            addCriterion("taskType not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(Integer value1, Integer value2) {
            addCriterion("taskType between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("taskType not between", value1, value2, "tasktype");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNull() {
            addCriterion("expired is null");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNotNull() {
            addCriterion("expired is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredEqualTo(Integer value) {
            addCriterion("expired =", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotEqualTo(Integer value) {
            addCriterion("expired <>", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThan(Integer value) {
            addCriterion("expired >", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("expired >=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThan(Integer value) {
            addCriterion("expired <", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThanOrEqualTo(Integer value) {
            addCriterion("expired <=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredIn(List<Integer> values) {
            addCriterion("expired in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotIn(List<Integer> values) {
            addCriterion("expired not in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredBetween(Integer value1, Integer value2) {
            addCriterion("expired between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotBetween(Integer value1, Integer value2) {
            addCriterion("expired not between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpireddayIsNull() {
            addCriterion("expiredDay is null");
            return (Criteria) this;
        }

        public Criteria andExpireddayIsNotNull() {
            addCriterion("expiredDay is not null");
            return (Criteria) this;
        }

        public Criteria andExpireddayEqualTo(Integer value) {
            addCriterion("expiredDay =", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotEqualTo(Integer value) {
            addCriterion("expiredDay <>", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayGreaterThan(Integer value) {
            addCriterion("expiredDay >", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiredDay >=", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayLessThan(Integer value) {
            addCriterion("expiredDay <", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayLessThanOrEqualTo(Integer value) {
            addCriterion("expiredDay <=", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayIn(List<Integer> values) {
            addCriterion("expiredDay in", values, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotIn(List<Integer> values) {
            addCriterion("expiredDay not in", values, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayBetween(Integer value1, Integer value2) {
            addCriterion("expiredDay between", value1, value2, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotBetween(Integer value1, Integer value2) {
            addCriterion("expiredDay not between", value1, value2, "expiredday");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNull() {
            addCriterion("planDesc is null");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNotNull() {
            addCriterion("planDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPlandescEqualTo(String value) {
            addCriterion("planDesc =", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotEqualTo(String value) {
            addCriterion("planDesc <>", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThan(String value) {
            addCriterion("planDesc >", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThanOrEqualTo(String value) {
            addCriterion("planDesc >=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThan(String value) {
            addCriterion("planDesc <", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThanOrEqualTo(String value) {
            addCriterion("planDesc <=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLike(String value) {
            addCriterion("planDesc like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotLike(String value) {
            addCriterion("planDesc not like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescIn(List<String> values) {
            addCriterion("planDesc in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotIn(List<String> values) {
            addCriterion("planDesc not in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescBetween(String value1, String value2) {
            addCriterion("planDesc between", value1, value2, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotBetween(String value1, String value2) {
            addCriterion("planDesc not between", value1, value2, "plandesc");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNull() {
            addCriterion("finishRate is null");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNotNull() {
            addCriterion("finishRate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishrateEqualTo(Integer value) {
            addCriterion("finishRate =", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotEqualTo(Integer value) {
            addCriterion("finishRate <>", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThan(Integer value) {
            addCriterion("finishRate >", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishRate >=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThan(Integer value) {
            addCriterion("finishRate <", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThanOrEqualTo(Integer value) {
            addCriterion("finishRate <=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateIn(List<Integer> values) {
            addCriterion("finishRate in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotIn(List<Integer> values) {
            addCriterion("finishRate not in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateBetween(Integer value1, Integer value2) {
            addCriterion("finishRate between", value1, value2, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotBetween(Integer value1, Integer value2) {
            addCriterion("finishRate not between", value1, value2, "finishrate");
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