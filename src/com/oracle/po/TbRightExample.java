package com.oracle.po;

import java.util.ArrayList;
import java.util.List;

public class TbRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRightExample() {
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

        public Criteria andRightidIsNull() {
            addCriterion("rightID is null");
            return (Criteria) this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("rightID is not null");
            return (Criteria) this;
        }

        public Criteria andRightidEqualTo(String value) {
            addCriterion("rightID =", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotEqualTo(String value) {
            addCriterion("rightID <>", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThan(String value) {
            addCriterion("rightID >", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(String value) {
            addCriterion("rightID >=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThan(String value) {
            addCriterion("rightID <", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThanOrEqualTo(String value) {
            addCriterion("rightID <=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLike(String value) {
            addCriterion("rightID like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotLike(String value) {
            addCriterion("rightID not like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidIn(List<String> values) {
            addCriterion("rightID in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotIn(List<String> values) {
            addCriterion("rightID not in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidBetween(String value1, String value2) {
            addCriterion("rightID between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotBetween(String value1, String value2) {
            addCriterion("rightID not between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNull() {
            addCriterion("rightName is null");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNotNull() {
            addCriterion("rightName is not null");
            return (Criteria) this;
        }

        public Criteria andRightnameEqualTo(String value) {
            addCriterion("rightName =", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotEqualTo(String value) {
            addCriterion("rightName <>", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThan(String value) {
            addCriterion("rightName >", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThanOrEqualTo(String value) {
            addCriterion("rightName >=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThan(String value) {
            addCriterion("rightName <", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThanOrEqualTo(String value) {
            addCriterion("rightName <=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLike(String value) {
            addCriterion("rightName like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotLike(String value) {
            addCriterion("rightName not like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameIn(List<String> values) {
            addCriterion("rightName in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotIn(List<String> values) {
            addCriterion("rightName not in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameBetween(String value1, String value2) {
            addCriterion("rightName between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotBetween(String value1, String value2) {
            addCriterion("rightName not between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNull() {
            addCriterion("rightURL is null");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNotNull() {
            addCriterion("rightURL is not null");
            return (Criteria) this;
        }

        public Criteria andRighturlEqualTo(String value) {
            addCriterion("rightURL =", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotEqualTo(String value) {
            addCriterion("rightURL <>", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThan(String value) {
            addCriterion("rightURL >", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThanOrEqualTo(String value) {
            addCriterion("rightURL >=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThan(String value) {
            addCriterion("rightURL <", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThanOrEqualTo(String value) {
            addCriterion("rightURL <=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLike(String value) {
            addCriterion("rightURL like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotLike(String value) {
            addCriterion("rightURL not like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlIn(List<String> values) {
            addCriterion("rightURL in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotIn(List<String> values) {
            addCriterion("rightURL not in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlBetween(String value1, String value2) {
            addCriterion("rightURL between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotBetween(String value1, String value2) {
            addCriterion("rightURL not between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNull() {
            addCriterion("urlName is null");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNotNull() {
            addCriterion("urlName is not null");
            return (Criteria) this;
        }

        public Criteria andUrlnameEqualTo(String value) {
            addCriterion("urlName =", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotEqualTo(String value) {
            addCriterion("urlName <>", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThan(String value) {
            addCriterion("urlName >", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThanOrEqualTo(String value) {
            addCriterion("urlName >=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThan(String value) {
            addCriterion("urlName <", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThanOrEqualTo(String value) {
            addCriterion("urlName <=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLike(String value) {
            addCriterion("urlName like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotLike(String value) {
            addCriterion("urlName not like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameIn(List<String> values) {
            addCriterion("urlName in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotIn(List<String> values) {
            addCriterion("urlName not in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameBetween(String value1, String value2) {
            addCriterion("urlName between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotBetween(String value1, String value2) {
            addCriterion("urlName not between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andRightdescIsNull() {
            addCriterion("rightDesc is null");
            return (Criteria) this;
        }

        public Criteria andRightdescIsNotNull() {
            addCriterion("rightDesc is not null");
            return (Criteria) this;
        }

        public Criteria andRightdescEqualTo(String value) {
            addCriterion("rightDesc =", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotEqualTo(String value) {
            addCriterion("rightDesc <>", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescGreaterThan(String value) {
            addCriterion("rightDesc >", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescGreaterThanOrEqualTo(String value) {
            addCriterion("rightDesc >=", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLessThan(String value) {
            addCriterion("rightDesc <", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLessThanOrEqualTo(String value) {
            addCriterion("rightDesc <=", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLike(String value) {
            addCriterion("rightDesc like", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotLike(String value) {
            addCriterion("rightDesc not like", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescIn(List<String> values) {
            addCriterion("rightDesc in", values, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotIn(List<String> values) {
            addCriterion("rightDesc not in", values, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescBetween(String value1, String value2) {
            addCriterion("rightDesc between", value1, value2, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotBetween(String value1, String value2) {
            addCriterion("rightDesc not between", value1, value2, "rightdesc");
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