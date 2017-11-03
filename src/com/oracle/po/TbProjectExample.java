package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProjectExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("PROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("PROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("PROJECTID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("PROJECTID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("PROJECTID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECTID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("PROJECTID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECTID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("PROJECTID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("PROJECTID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("PROJECTID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECTID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
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

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("PROJECTNAME like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("PROJECTNAME not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProsumIsNull() {
            addCriterion("PROSUM is null");
            return (Criteria) this;
        }

        public Criteria andProsumIsNotNull() {
            addCriterion("PROSUM is not null");
            return (Criteria) this;
        }

        public Criteria andProsumEqualTo(Integer value) {
            addCriterion("PROSUM =", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotEqualTo(Integer value) {
            addCriterion("PROSUM <>", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumGreaterThan(Integer value) {
            addCriterion("PROSUM >", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROSUM >=", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumLessThan(Integer value) {
            addCriterion("PROSUM <", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumLessThanOrEqualTo(Integer value) {
            addCriterion("PROSUM <=", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumIn(List<Integer> values) {
            addCriterion("PROSUM in", values, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotIn(List<Integer> values) {
            addCriterion("PROSUM not in", values, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumBetween(Integer value1, Integer value2) {
            addCriterion("PROSUM between", value1, value2, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotBetween(Integer value1, Integer value2) {
            addCriterion("PROSUM not between", value1, value2, "prosum");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
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

        public Criteria andBudgetIsNull() {
            addCriterion("BUDGET is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("BUDGET is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(Integer value) {
            addCriterion("BUDGET =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(Integer value) {
            addCriterion("BUDGET <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(Integer value) {
            addCriterion("BUDGET >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUDGET >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(Integer value) {
            addCriterion("BUDGET <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(Integer value) {
            addCriterion("BUDGET <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<Integer> values) {
            addCriterion("BUDGET in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<Integer> values) {
            addCriterion("BUDGET not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(Integer value1, Integer value2) {
            addCriterion("BUDGET between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(Integer value1, Integer value2) {
            addCriterion("BUDGET not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andRealcostIsNull() {
            addCriterion("REALCOST is null");
            return (Criteria) this;
        }

        public Criteria andRealcostIsNotNull() {
            addCriterion("REALCOST is not null");
            return (Criteria) this;
        }

        public Criteria andRealcostEqualTo(Integer value) {
            addCriterion("REALCOST =", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotEqualTo(Integer value) {
            addCriterion("REALCOST <>", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostGreaterThan(Integer value) {
            addCriterion("REALCOST >", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostGreaterThanOrEqualTo(Integer value) {
            addCriterion("REALCOST >=", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostLessThan(Integer value) {
            addCriterion("REALCOST <", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostLessThanOrEqualTo(Integer value) {
            addCriterion("REALCOST <=", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostIn(List<Integer> values) {
            addCriterion("REALCOST in", values, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotIn(List<Integer> values) {
            addCriterion("REALCOST not in", values, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostBetween(Integer value1, Integer value2) {
            addCriterion("REALCOST between", value1, value2, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotBetween(Integer value1, Integer value2) {
            addCriterion("REALCOST not between", value1, value2, "realcost");
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