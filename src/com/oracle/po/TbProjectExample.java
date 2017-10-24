package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andCompanyidIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("CompanyID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("CompanyID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("CompanyID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CompanyID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("CompanyID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("CompanyID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("CompanyID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("CompanyID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID not between", value1, value2, "companyid");
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

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProsumIsNull() {
            addCriterion("proSum is null");
            return (Criteria) this;
        }

        public Criteria andProsumIsNotNull() {
            addCriterion("proSum is not null");
            return (Criteria) this;
        }

        public Criteria andProsumEqualTo(Integer value) {
            addCriterion("proSum =", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotEqualTo(Integer value) {
            addCriterion("proSum <>", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumGreaterThan(Integer value) {
            addCriterion("proSum >", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("proSum >=", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumLessThan(Integer value) {
            addCriterion("proSum <", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumLessThanOrEqualTo(Integer value) {
            addCriterion("proSum <=", value, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumIn(List<Integer> values) {
            addCriterion("proSum in", values, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotIn(List<Integer> values) {
            addCriterion("proSum not in", values, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumBetween(Integer value1, Integer value2) {
            addCriterion("proSum between", value1, value2, "prosum");
            return (Criteria) this;
        }

        public Criteria andProsumNotBetween(Integer value1, Integer value2) {
            addCriterion("proSum not between", value1, value2, "prosum");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(Integer value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(Integer value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(Integer value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(Integer value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(Integer value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<Integer> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<Integer> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(Integer value1, Integer value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(Integer value1, Integer value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andRealcostIsNull() {
            addCriterion("realCost is null");
            return (Criteria) this;
        }

        public Criteria andRealcostIsNotNull() {
            addCriterion("realCost is not null");
            return (Criteria) this;
        }

        public Criteria andRealcostEqualTo(Integer value) {
            addCriterion("realCost =", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotEqualTo(Integer value) {
            addCriterion("realCost <>", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostGreaterThan(Integer value) {
            addCriterion("realCost >", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostGreaterThanOrEqualTo(Integer value) {
            addCriterion("realCost >=", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostLessThan(Integer value) {
            addCriterion("realCost <", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostLessThanOrEqualTo(Integer value) {
            addCriterion("realCost <=", value, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostIn(List<Integer> values) {
            addCriterion("realCost in", values, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotIn(List<Integer> values) {
            addCriterion("realCost not in", values, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostBetween(Integer value1, Integer value2) {
            addCriterion("realCost between", value1, value2, "realcost");
            return (Criteria) this;
        }

        public Criteria andRealcostNotBetween(Integer value1, Integer value2) {
            addCriterion("realCost not between", value1, value2, "realcost");
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