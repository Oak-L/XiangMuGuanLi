package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNull() {
            addCriterion("FUNCTIONID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("FUNCTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(Integer value) {
            addCriterion("FUNCTIONID =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(Integer value) {
            addCriterion("FUNCTIONID <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(Integer value) {
            addCriterion("FUNCTIONID >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNCTIONID >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(Integer value) {
            addCriterion("FUNCTIONID <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(Integer value) {
            addCriterion("FUNCTIONID <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<Integer> values) {
            addCriterion("FUNCTIONID in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<Integer> values) {
            addCriterion("FUNCTIONID not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTIONID between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTIONID not between", value1, value2, "functionid");
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

        public Criteria andTbPlanidIsNull() {
            addCriterion("TB__PLANID is null");
            return (Criteria) this;
        }

        public Criteria andTbPlanidIsNotNull() {
            addCriterion("TB__PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andTbPlanidEqualTo(Integer value) {
            addCriterion("TB__PLANID =", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotEqualTo(Integer value) {
            addCriterion("TB__PLANID <>", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidGreaterThan(Integer value) {
            addCriterion("TB__PLANID >", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TB__PLANID >=", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidLessThan(Integer value) {
            addCriterion("TB__PLANID <", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("TB__PLANID <=", value, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidIn(List<Integer> values) {
            addCriterion("TB__PLANID in", values, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotIn(List<Integer> values) {
            addCriterion("TB__PLANID not in", values, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidBetween(Integer value1, Integer value2) {
            addCriterion("TB__PLANID between", value1, value2, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("TB__PLANID not between", value1, value2, "tbPlanid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidIsNull() {
            addCriterion("TB__EMPID is null");
            return (Criteria) this;
        }

        public Criteria andTbEmpidIsNotNull() {
            addCriterion("TB__EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andTbEmpidEqualTo(Integer value) {
            addCriterion("TB__EMPID =", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotEqualTo(Integer value) {
            addCriterion("TB__EMPID <>", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidGreaterThan(Integer value) {
            addCriterion("TB__EMPID >", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TB__EMPID >=", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidLessThan(Integer value) {
            addCriterion("TB__EMPID <", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("TB__EMPID <=", value, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidIn(List<Integer> values) {
            addCriterion("TB__EMPID in", values, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotIn(List<Integer> values) {
            addCriterion("TB__EMPID not in", values, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidBetween(Integer value1, Integer value2) {
            addCriterion("TB__EMPID between", value1, value2, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andTbEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("TB__EMPID not between", value1, value2, "tbEmpid");
            return (Criteria) this;
        }

        public Criteria andPlantitleIsNull() {
            addCriterion("PLANTITLE is null");
            return (Criteria) this;
        }

        public Criteria andPlantitleIsNotNull() {
            addCriterion("PLANTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPlantitleEqualTo(String value) {
            addCriterion("PLANTITLE =", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotEqualTo(String value) {
            addCriterion("PLANTITLE <>", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThan(String value) {
            addCriterion("PLANTITLE >", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThanOrEqualTo(String value) {
            addCriterion("PLANTITLE >=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThan(String value) {
            addCriterion("PLANTITLE <", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThanOrEqualTo(String value) {
            addCriterion("PLANTITLE <=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLike(String value) {
            addCriterion("PLANTITLE like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotLike(String value) {
            addCriterion("PLANTITLE not like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleIn(List<String> values) {
            addCriterion("PLANTITLE in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotIn(List<String> values) {
            addCriterion("PLANTITLE not in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleBetween(String value1, String value2) {
            addCriterion("PLANTITLE between", value1, value2, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotBetween(String value1, String value2) {
            addCriterion("PLANTITLE not between", value1, value2, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIsNull() {
            addCriterion("PLANBEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIsNotNull() {
            addCriterion("PLANBEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateEqualTo(Date value) {
            addCriterion("PLANBEGINDATE =", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotEqualTo(Date value) {
            addCriterion("PLANBEGINDATE <>", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateGreaterThan(Date value) {
            addCriterion("PLANBEGINDATE >", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANBEGINDATE >=", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateLessThan(Date value) {
            addCriterion("PLANBEGINDATE <", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateLessThanOrEqualTo(Date value) {
            addCriterion("PLANBEGINDATE <=", value, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateIn(List<Date> values) {
            addCriterion("PLANBEGINDATE in", values, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotIn(List<Date> values) {
            addCriterion("PLANBEGINDATE not in", values, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateBetween(Date value1, Date value2) {
            addCriterion("PLANBEGINDATE between", value1, value2, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanbegindateNotBetween(Date value1, Date value2) {
            addCriterion("PLANBEGINDATE not between", value1, value2, "planbegindate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNull() {
            addCriterion("PLANENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNotNull() {
            addCriterion("PLANENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateEqualTo(Date value) {
            addCriterion("PLANENDDATE =", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotEqualTo(Date value) {
            addCriterion("PLANENDDATE <>", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThan(Date value) {
            addCriterion("PLANENDDATE >", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANENDDATE >=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThan(Date value) {
            addCriterion("PLANENDDATE <", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThanOrEqualTo(Date value) {
            addCriterion("PLANENDDATE <=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIn(List<Date> values) {
            addCriterion("PLANENDDATE in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotIn(List<Date> values) {
            addCriterion("PLANENDDATE not in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateBetween(Date value1, Date value2) {
            addCriterion("PLANENDDATE between", value1, value2, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotBetween(Date value1, Date value2) {
            addCriterion("PLANENDDATE not between", value1, value2, "planenddate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIsNull() {
            addCriterion("REALBEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIsNotNull() {
            addCriterion("REALBEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealbegindateEqualTo(Date value) {
            addCriterion("REALBEGINDATE =", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotEqualTo(Date value) {
            addCriterion("REALBEGINDATE <>", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateGreaterThan(Date value) {
            addCriterion("REALBEGINDATE >", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("REALBEGINDATE >=", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateLessThan(Date value) {
            addCriterion("REALBEGINDATE <", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateLessThanOrEqualTo(Date value) {
            addCriterion("REALBEGINDATE <=", value, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateIn(List<Date> values) {
            addCriterion("REALBEGINDATE in", values, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotIn(List<Date> values) {
            addCriterion("REALBEGINDATE not in", values, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateBetween(Date value1, Date value2) {
            addCriterion("REALBEGINDATE between", value1, value2, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealbegindateNotBetween(Date value1, Date value2) {
            addCriterion("REALBEGINDATE not between", value1, value2, "realbegindate");
            return (Criteria) this;
        }

        public Criteria andRealenddateIsNull() {
            addCriterion("REALENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRealenddateIsNotNull() {
            addCriterion("REALENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealenddateEqualTo(Date value) {
            addCriterion("REALENDDATE =", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotEqualTo(Date value) {
            addCriterion("REALENDDATE <>", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateGreaterThan(Date value) {
            addCriterion("REALENDDATE >", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("REALENDDATE >=", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateLessThan(Date value) {
            addCriterion("REALENDDATE <", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateLessThanOrEqualTo(Date value) {
            addCriterion("REALENDDATE <=", value, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateIn(List<Date> values) {
            addCriterion("REALENDDATE in", values, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotIn(List<Date> values) {
            addCriterion("REALENDDATE not in", values, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateBetween(Date value1, Date value2) {
            addCriterion("REALENDDATE between", value1, value2, "realenddate");
            return (Criteria) this;
        }

        public Criteria andRealenddateNotBetween(Date value1, Date value2) {
            addCriterion("REALENDDATE not between", value1, value2, "realenddate");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNull() {
            addCriterion("TIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNotNull() {
            addCriterion("TIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimelimitEqualTo(Integer value) {
            addCriterion("TIMELIMIT =", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotEqualTo(Integer value) {
            addCriterion("TIMELIMIT <>", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThan(Integer value) {
            addCriterion("TIMELIMIT >", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIMELIMIT >=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThan(Integer value) {
            addCriterion("TIMELIMIT <", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThanOrEqualTo(Integer value) {
            addCriterion("TIMELIMIT <=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitIn(List<Integer> values) {
            addCriterion("TIMELIMIT in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotIn(List<Integer> values) {
            addCriterion("TIMELIMIT not in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitBetween(Integer value1, Integer value2) {
            addCriterion("TIMELIMIT between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("TIMELIMIT not between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("TASKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("TASKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(Integer value) {
            addCriterion("TASKTYPE =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(Integer value) {
            addCriterion("TASKTYPE <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(Integer value) {
            addCriterion("TASKTYPE >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASKTYPE >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(Integer value) {
            addCriterion("TASKTYPE <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(Integer value) {
            addCriterion("TASKTYPE <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<Integer> values) {
            addCriterion("TASKTYPE in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<Integer> values) {
            addCriterion("TASKTYPE not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(Integer value1, Integer value2) {
            addCriterion("TASKTYPE between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TASKTYPE not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNull() {
            addCriterion("EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNotNull() {
            addCriterion("EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredEqualTo(Integer value) {
            addCriterion("EXPIRED =", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotEqualTo(Integer value) {
            addCriterion("EXPIRED <>", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThan(Integer value) {
            addCriterion("EXPIRED >", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRED >=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThan(Integer value) {
            addCriterion("EXPIRED <", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRED <=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredIn(List<Integer> values) {
            addCriterion("EXPIRED in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotIn(List<Integer> values) {
            addCriterion("EXPIRED not in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRED between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRED not between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpireddayIsNull() {
            addCriterion("EXPIREDDAY is null");
            return (Criteria) this;
        }

        public Criteria andExpireddayIsNotNull() {
            addCriterion("EXPIREDDAY is not null");
            return (Criteria) this;
        }

        public Criteria andExpireddayEqualTo(Integer value) {
            addCriterion("EXPIREDDAY =", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotEqualTo(Integer value) {
            addCriterion("EXPIREDDAY <>", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayGreaterThan(Integer value) {
            addCriterion("EXPIREDDAY >", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIREDDAY >=", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayLessThan(Integer value) {
            addCriterion("EXPIREDDAY <", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIREDDAY <=", value, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayIn(List<Integer> values) {
            addCriterion("EXPIREDDAY in", values, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotIn(List<Integer> values) {
            addCriterion("EXPIREDDAY not in", values, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayBetween(Integer value1, Integer value2) {
            addCriterion("EXPIREDDAY between", value1, value2, "expiredday");
            return (Criteria) this;
        }

        public Criteria andExpireddayNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIREDDAY not between", value1, value2, "expiredday");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNull() {
            addCriterion("PLANDESC is null");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNotNull() {
            addCriterion("PLANDESC is not null");
            return (Criteria) this;
        }

        public Criteria andPlandescEqualTo(String value) {
            addCriterion("PLANDESC =", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotEqualTo(String value) {
            addCriterion("PLANDESC <>", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThan(String value) {
            addCriterion("PLANDESC >", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThanOrEqualTo(String value) {
            addCriterion("PLANDESC >=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThan(String value) {
            addCriterion("PLANDESC <", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThanOrEqualTo(String value) {
            addCriterion("PLANDESC <=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLike(String value) {
            addCriterion("PLANDESC like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotLike(String value) {
            addCriterion("PLANDESC not like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescIn(List<String> values) {
            addCriterion("PLANDESC in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotIn(List<String> values) {
            addCriterion("PLANDESC not in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescBetween(String value1, String value2) {
            addCriterion("PLANDESC between", value1, value2, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotBetween(String value1, String value2) {
            addCriterion("PLANDESC not between", value1, value2, "plandesc");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNull() {
            addCriterion("FINISHRATE is null");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNotNull() {
            addCriterion("FINISHRATE is not null");
            return (Criteria) this;
        }

        public Criteria andFinishrateEqualTo(Integer value) {
            addCriterion("FINISHRATE =", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotEqualTo(Integer value) {
            addCriterion("FINISHRATE <>", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThan(Integer value) {
            addCriterion("FINISHRATE >", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINISHRATE >=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThan(Integer value) {
            addCriterion("FINISHRATE <", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThanOrEqualTo(Integer value) {
            addCriterion("FINISHRATE <=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateIn(List<Integer> values) {
            addCriterion("FINISHRATE in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotIn(List<Integer> values) {
            addCriterion("FINISHRATE not in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateBetween(Integer value1, Integer value2) {
            addCriterion("FINISHRATE between", value1, value2, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotBetween(Integer value1, Integer value2) {
            addCriterion("FINISHRATE not between", value1, value2, "finishrate");
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