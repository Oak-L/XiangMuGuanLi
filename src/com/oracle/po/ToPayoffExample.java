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
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("PAYID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("PAYID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("PAYID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("PAYID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("PAYID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("PAYID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("PAYID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("PAYID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYID not between", value1, value2, "payid");
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

        public Criteria andSalIsNull() {
            addCriterion("SAL is null");
            return (Criteria) this;
        }

        public Criteria andSalIsNotNull() {
            addCriterion("SAL is not null");
            return (Criteria) this;
        }

        public Criteria andSalEqualTo(Integer value) {
            addCriterion("SAL =", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotEqualTo(Integer value) {
            addCriterion("SAL <>", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalGreaterThan(Integer value) {
            addCriterion("SAL >", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAL >=", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalLessThan(Integer value) {
            addCriterion("SAL <", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalLessThanOrEqualTo(Integer value) {
            addCriterion("SAL <=", value, "sal");
            return (Criteria) this;
        }

        public Criteria andSalIn(List<Integer> values) {
            addCriterion("SAL in", values, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotIn(List<Integer> values) {
            addCriterion("SAL not in", values, "sal");
            return (Criteria) this;
        }

        public Criteria andSalBetween(Integer value1, Integer value2) {
            addCriterion("SAL between", value1, value2, "sal");
            return (Criteria) this;
        }

        public Criteria andSalNotBetween(Integer value1, Integer value2) {
            addCriterion("SAL not between", value1, value2, "sal");
            return (Criteria) this;
        }

        public Criteria andCommIsNull() {
            addCriterion("COMM is null");
            return (Criteria) this;
        }

        public Criteria andCommIsNotNull() {
            addCriterion("COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCommEqualTo(Integer value) {
            addCriterion("COMM =", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotEqualTo(Integer value) {
            addCriterion("COMM <>", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThan(Integer value) {
            addCriterion("COMM >", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMM >=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThan(Integer value) {
            addCriterion("COMM <", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThanOrEqualTo(Integer value) {
            addCriterion("COMM <=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommIn(List<Integer> values) {
            addCriterion("COMM in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotIn(List<Integer> values) {
            addCriterion("COMM not in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommBetween(Integer value1, Integer value2) {
            addCriterion("COMM between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotBetween(Integer value1, Integer value2) {
            addCriterion("COMM not between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andDeductsumIsNull() {
            addCriterion("DEDUCTSUM is null");
            return (Criteria) this;
        }

        public Criteria andDeductsumIsNotNull() {
            addCriterion("DEDUCTSUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeductsumEqualTo(Integer value) {
            addCriterion("DEDUCTSUM =", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotEqualTo(Integer value) {
            addCriterion("DEDUCTSUM <>", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumGreaterThan(Integer value) {
            addCriterion("DEDUCTSUM >", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEDUCTSUM >=", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumLessThan(Integer value) {
            addCriterion("DEDUCTSUM <", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumLessThanOrEqualTo(Integer value) {
            addCriterion("DEDUCTSUM <=", value, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumIn(List<Integer> values) {
            addCriterion("DEDUCTSUM in", values, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotIn(List<Integer> values) {
            addCriterion("DEDUCTSUM not in", values, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumBetween(Integer value1, Integer value2) {
            addCriterion("DEDUCTSUM between", value1, value2, "deductsum");
            return (Criteria) this;
        }

        public Criteria andDeductsumNotBetween(Integer value1, Integer value2) {
            addCriterion("DEDUCTSUM not between", value1, value2, "deductsum");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNull() {
            addCriterion("MIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNotNull() {
            addCriterion("MIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuEqualTo(String value) {
            addCriterion("MIAOSHU =", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotEqualTo(String value) {
            addCriterion("MIAOSHU <>", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThan(String value) {
            addCriterion("MIAOSHU >", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("MIAOSHU >=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThan(String value) {
            addCriterion("MIAOSHU <", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThanOrEqualTo(String value) {
            addCriterion("MIAOSHU <=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLike(String value) {
            addCriterion("MIAOSHU like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotLike(String value) {
            addCriterion("MIAOSHU not like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIn(List<String> values) {
            addCriterion("MIAOSHU in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotIn(List<String> values) {
            addCriterion("MIAOSHU not in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuBetween(String value1, String value2) {
            addCriterion("MIAOSHU between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotBetween(String value1, String value2) {
            addCriterion("MIAOSHU not between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("ZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("ZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("ZHUANGTAI =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("ZHUANGTAI <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("ZHUANGTAI >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANGTAI >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("ZHUANGTAI <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANGTAI <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("ZHUANGTAI in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("ZHUANGTAI not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANGTAI between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANGTAI not between", value1, value2, "zhuangtai");
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