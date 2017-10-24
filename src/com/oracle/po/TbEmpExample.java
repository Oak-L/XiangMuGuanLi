package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbEmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEmpExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNull() {
            addCriterion("DutyID is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("DutyID is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(Integer value) {
            addCriterion("DutyID =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(Integer value) {
            addCriterion("DutyID <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(Integer value) {
            addCriterion("DutyID >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DutyID >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(Integer value) {
            addCriterion("DutyID <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(Integer value) {
            addCriterion("DutyID <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<Integer> values) {
            addCriterion("DutyID in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<Integer> values) {
            addCriterion("DutyID not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(Integer value1, Integer value2) {
            addCriterion("DutyID between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(Integer value1, Integer value2) {
            addCriterion("DutyID not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmptypeIsNull() {
            addCriterion("empType is null");
            return (Criteria) this;
        }

        public Criteria andEmptypeIsNotNull() {
            addCriterion("empType is not null");
            return (Criteria) this;
        }

        public Criteria andEmptypeEqualTo(String value) {
            addCriterion("empType =", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotEqualTo(String value) {
            addCriterion("empType <>", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeGreaterThan(String value) {
            addCriterion("empType >", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeGreaterThanOrEqualTo(String value) {
            addCriterion("empType >=", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLessThan(String value) {
            addCriterion("empType <", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLessThanOrEqualTo(String value) {
            addCriterion("empType <=", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeLike(String value) {
            addCriterion("empType like", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotLike(String value) {
            addCriterion("empType not like", value, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeIn(List<String> values) {
            addCriterion("empType in", values, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotIn(List<String> values) {
            addCriterion("empType not in", values, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeBetween(String value1, String value2) {
            addCriterion("empType between", value1, value2, "emptype");
            return (Criteria) this;
        }

        public Criteria andEmptypeNotBetween(String value1, String value2) {
            addCriterion("empType not between", value1, value2, "emptype");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("BankNo is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BankNo is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BankNo =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BankNo <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BankNo >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BankNo >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BankNo <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BankNo <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BankNo like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BankNo not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BankNo in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BankNo not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BankNo between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BankNo not between", value1, value2, "bankno");
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

        public Criteria andSubsidyIsNull() {
            addCriterion("subsidy is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyIsNotNull() {
            addCriterion("subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyEqualTo(Integer value) {
            addCriterion("subsidy =", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotEqualTo(Integer value) {
            addCriterion("subsidy <>", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThan(Integer value) {
            addCriterion("subsidy >", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThanOrEqualTo(Integer value) {
            addCriterion("subsidy >=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThan(Integer value) {
            addCriterion("subsidy <", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThanOrEqualTo(Integer value) {
            addCriterion("subsidy <=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyIn(List<Integer> values) {
            addCriterion("subsidy in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotIn(List<Integer> values) {
            addCriterion("subsidy not in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyBetween(Integer value1, Integer value2) {
            addCriterion("subsidy between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotBetween(Integer value1, Integer value2) {
            addCriterion("subsidy not between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("hiredate is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("hiredate >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(Date value) {
            addCriterionForJDBCDate("hiredate <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate not between", value1, value2, "hiredate");
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