package com.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbModuleExample() {
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

        public Criteria andModuleidIsNull() {
            addCriterion("MODULEID is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("MODULEID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(Integer value) {
            addCriterion("MODULEID =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(Integer value) {
            addCriterion("MODULEID <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(Integer value) {
            addCriterion("MODULEID >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODULEID >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(Integer value) {
            addCriterion("MODULEID <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(Integer value) {
            addCriterion("MODULEID <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<Integer> values) {
            addCriterion("MODULEID in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<Integer> values) {
            addCriterion("MODULEID not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(Integer value1, Integer value2) {
            addCriterion("MODULEID between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(Integer value1, Integer value2) {
            addCriterion("MODULEID not between", value1, value2, "moduleid");
            return (Criteria) this;
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

        public Criteria andModulenameIsNull() {
            addCriterion("MODULENAME is null");
            return (Criteria) this;
        }

        public Criteria andModulenameIsNotNull() {
            addCriterion("MODULENAME is not null");
            return (Criteria) this;
        }

        public Criteria andModulenameEqualTo(String value) {
            addCriterion("MODULENAME =", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotEqualTo(String value) {
            addCriterion("MODULENAME <>", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThan(String value) {
            addCriterion("MODULENAME >", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULENAME >=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThan(String value) {
            addCriterion("MODULENAME <", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThanOrEqualTo(String value) {
            addCriterion("MODULENAME <=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLike(String value) {
            addCriterion("MODULENAME like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotLike(String value) {
            addCriterion("MODULENAME not like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameIn(List<String> values) {
            addCriterion("MODULENAME in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotIn(List<String> values) {
            addCriterion("MODULENAME not in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameBetween(String value1, String value2) {
            addCriterion("MODULENAME between", value1, value2, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotBetween(String value1, String value2) {
            addCriterion("MODULENAME not between", value1, value2, "modulename");
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

        public Criteria andIdentifierIsNull() {
            addCriterion("IDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("IDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("IDENTIFIER =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("IDENTIFIER <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("IDENTIFIER >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFIER >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("IDENTIFIER <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFIER <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("IDENTIFIER like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("IDENTIFIER not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("IDENTIFIER in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("IDENTIFIER not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("IDENTIFIER between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("IDENTIFIER not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andModuledescIsNull() {
            addCriterion("MODULEDESC is null");
            return (Criteria) this;
        }

        public Criteria andModuledescIsNotNull() {
            addCriterion("MODULEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andModuledescEqualTo(String value) {
            addCriterion("MODULEDESC =", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescNotEqualTo(String value) {
            addCriterion("MODULEDESC <>", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescGreaterThan(String value) {
            addCriterion("MODULEDESC >", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescGreaterThanOrEqualTo(String value) {
            addCriterion("MODULEDESC >=", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescLessThan(String value) {
            addCriterion("MODULEDESC <", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescLessThanOrEqualTo(String value) {
            addCriterion("MODULEDESC <=", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescLike(String value) {
            addCriterion("MODULEDESC like", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescNotLike(String value) {
            addCriterion("MODULEDESC not like", value, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescIn(List<String> values) {
            addCriterion("MODULEDESC in", values, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescNotIn(List<String> values) {
            addCriterion("MODULEDESC not in", values, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescBetween(String value1, String value2) {
            addCriterion("MODULEDESC between", value1, value2, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andModuledescNotBetween(String value1, String value2) {
            addCriterion("MODULEDESC not between", value1, value2, "moduledesc");
            return (Criteria) this;
        }

        public Criteria andRequiredesIsNull() {
            addCriterion("REQUIREDES is null");
            return (Criteria) this;
        }

        public Criteria andRequiredesIsNotNull() {
            addCriterion("REQUIREDES is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredesEqualTo(String value) {
            addCriterion("REQUIREDES =", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesNotEqualTo(String value) {
            addCriterion("REQUIREDES <>", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesGreaterThan(String value) {
            addCriterion("REQUIREDES >", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIREDES >=", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesLessThan(String value) {
            addCriterion("REQUIREDES <", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesLessThanOrEqualTo(String value) {
            addCriterion("REQUIREDES <=", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesLike(String value) {
            addCriterion("REQUIREDES like", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesNotLike(String value) {
            addCriterion("REQUIREDES not like", value, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesIn(List<String> values) {
            addCriterion("REQUIREDES in", values, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesNotIn(List<String> values) {
            addCriterion("REQUIREDES not in", values, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesBetween(String value1, String value2) {
            addCriterion("REQUIREDES between", value1, value2, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequiredesNotBetween(String value1, String value2) {
            addCriterion("REQUIREDES not between", value1, value2, "requiredes");
            return (Criteria) this;
        }

        public Criteria andRequirementidIsNull() {
            addCriterion("REQUIREMENTID is null");
            return (Criteria) this;
        }

        public Criteria andRequirementidIsNotNull() {
            addCriterion("REQUIREMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementidEqualTo(Integer value) {
            addCriterion("REQUIREMENTID =", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotEqualTo(Integer value) {
            addCriterion("REQUIREMENTID <>", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThan(Integer value) {
            addCriterion("REQUIREMENTID >", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REQUIREMENTID >=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThan(Integer value) {
            addCriterion("REQUIREMENTID <", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThanOrEqualTo(Integer value) {
            addCriterion("REQUIREMENTID <=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidIn(List<Integer> values) {
            addCriterion("REQUIREMENTID in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotIn(List<Integer> values) {
            addCriterion("REQUIREMENTID not in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidBetween(Integer value1, Integer value2) {
            addCriterion("REQUIREMENTID between", value1, value2, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotBetween(Integer value1, Integer value2) {
            addCriterion("REQUIREMENTID not between", value1, value2, "requirementid");
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