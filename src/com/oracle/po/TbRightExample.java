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
            addCriterion("RIGHTID is null");
            return (Criteria) this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("RIGHTID is not null");
            return (Criteria) this;
        }

        public Criteria andRightidEqualTo(String value) {
            addCriterion("RIGHTID =", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotEqualTo(String value) {
            addCriterion("RIGHTID <>", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThan(String value) {
            addCriterion("RIGHTID >", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTID >=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThan(String value) {
            addCriterion("RIGHTID <", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThanOrEqualTo(String value) {
            addCriterion("RIGHTID <=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLike(String value) {
            addCriterion("RIGHTID like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotLike(String value) {
            addCriterion("RIGHTID not like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidIn(List<String> values) {
            addCriterion("RIGHTID in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotIn(List<String> values) {
            addCriterion("RIGHTID not in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidBetween(String value1, String value2) {
            addCriterion("RIGHTID between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotBetween(String value1, String value2) {
            addCriterion("RIGHTID not between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNull() {
            addCriterion("RIGHTNAME is null");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNotNull() {
            addCriterion("RIGHTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRightnameEqualTo(String value) {
            addCriterion("RIGHTNAME =", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotEqualTo(String value) {
            addCriterion("RIGHTNAME <>", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThan(String value) {
            addCriterion("RIGHTNAME >", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTNAME >=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThan(String value) {
            addCriterion("RIGHTNAME <", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThanOrEqualTo(String value) {
            addCriterion("RIGHTNAME <=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLike(String value) {
            addCriterion("RIGHTNAME like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotLike(String value) {
            addCriterion("RIGHTNAME not like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameIn(List<String> values) {
            addCriterion("RIGHTNAME in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotIn(List<String> values) {
            addCriterion("RIGHTNAME not in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameBetween(String value1, String value2) {
            addCriterion("RIGHTNAME between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotBetween(String value1, String value2) {
            addCriterion("RIGHTNAME not between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNull() {
            addCriterion("RIGHTURL is null");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNotNull() {
            addCriterion("RIGHTURL is not null");
            return (Criteria) this;
        }

        public Criteria andRighturlEqualTo(String value) {
            addCriterion("RIGHTURL =", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotEqualTo(String value) {
            addCriterion("RIGHTURL <>", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThan(String value) {
            addCriterion("RIGHTURL >", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTURL >=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThan(String value) {
            addCriterion("RIGHTURL <", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThanOrEqualTo(String value) {
            addCriterion("RIGHTURL <=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLike(String value) {
            addCriterion("RIGHTURL like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotLike(String value) {
            addCriterion("RIGHTURL not like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlIn(List<String> values) {
            addCriterion("RIGHTURL in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotIn(List<String> values) {
            addCriterion("RIGHTURL not in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlBetween(String value1, String value2) {
            addCriterion("RIGHTURL between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotBetween(String value1, String value2) {
            addCriterion("RIGHTURL not between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNull() {
            addCriterion("URLNAME is null");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNotNull() {
            addCriterion("URLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUrlnameEqualTo(String value) {
            addCriterion("URLNAME =", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotEqualTo(String value) {
            addCriterion("URLNAME <>", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThan(String value) {
            addCriterion("URLNAME >", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThanOrEqualTo(String value) {
            addCriterion("URLNAME >=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThan(String value) {
            addCriterion("URLNAME <", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThanOrEqualTo(String value) {
            addCriterion("URLNAME <=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLike(String value) {
            addCriterion("URLNAME like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotLike(String value) {
            addCriterion("URLNAME not like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameIn(List<String> values) {
            addCriterion("URLNAME in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotIn(List<String> values) {
            addCriterion("URLNAME not in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameBetween(String value1, String value2) {
            addCriterion("URLNAME between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotBetween(String value1, String value2) {
            addCriterion("URLNAME not between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andRightdescIsNull() {
            addCriterion("RIGHTDESC is null");
            return (Criteria) this;
        }

        public Criteria andRightdescIsNotNull() {
            addCriterion("RIGHTDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRightdescEqualTo(String value) {
            addCriterion("RIGHTDESC =", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotEqualTo(String value) {
            addCriterion("RIGHTDESC <>", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescGreaterThan(String value) {
            addCriterion("RIGHTDESC >", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTDESC >=", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLessThan(String value) {
            addCriterion("RIGHTDESC <", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLessThanOrEqualTo(String value) {
            addCriterion("RIGHTDESC <=", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescLike(String value) {
            addCriterion("RIGHTDESC like", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotLike(String value) {
            addCriterion("RIGHTDESC not like", value, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescIn(List<String> values) {
            addCriterion("RIGHTDESC in", values, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotIn(List<String> values) {
            addCriterion("RIGHTDESC not in", values, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescBetween(String value1, String value2) {
            addCriterion("RIGHTDESC between", value1, value2, "rightdesc");
            return (Criteria) this;
        }

        public Criteria andRightdescNotBetween(String value1, String value2) {
            addCriterion("RIGHTDESC not between", value1, value2, "rightdesc");
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