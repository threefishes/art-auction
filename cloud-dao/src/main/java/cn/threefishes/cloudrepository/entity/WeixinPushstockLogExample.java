package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeixinPushstockLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinPushstockLogExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andAutoidIsNull() {
            addCriterion("autoid is null");
            return (Criteria) this;
        }

        public Criteria andAutoidIsNotNull() {
            addCriterion("autoid is not null");
            return (Criteria) this;
        }

        public Criteria andAutoidEqualTo(Integer value) {
            addCriterion("autoid =", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotEqualTo(Integer value) {
            addCriterion("autoid <>", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThan(Integer value) {
            addCriterion("autoid >", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("autoid >=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThan(Integer value) {
            addCriterion("autoid <", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThanOrEqualTo(Integer value) {
            addCriterion("autoid <=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidIn(List<Integer> values) {
            addCriterion("autoid in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotIn(List<Integer> values) {
            addCriterion("autoid not in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidBetween(Integer value1, Integer value2) {
            addCriterion("autoid between", value1, value2, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotBetween(Integer value1, Integer value2) {
            addCriterion("autoid not between", value1, value2, "autoid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andUnidIsNull() {
            addCriterion("unid is null");
            return (Criteria) this;
        }

        public Criteria andUnidIsNotNull() {
            addCriterion("unid is not null");
            return (Criteria) this;
        }

        public Criteria andUnidEqualTo(String value) {
            addCriterion("unid =", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotEqualTo(String value) {
            addCriterion("unid <>", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThan(String value) {
            addCriterion("unid >", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThanOrEqualTo(String value) {
            addCriterion("unid >=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThan(String value) {
            addCriterion("unid <", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThanOrEqualTo(String value) {
            addCriterion("unid <=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLike(String value) {
            addCriterion("unid like", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotLike(String value) {
            addCriterion("unid not like", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidIn(List<String> values) {
            addCriterion("unid in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotIn(List<String> values) {
            addCriterion("unid not in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidBetween(String value1, String value2) {
            addCriterion("unid between", value1, value2, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotBetween(String value1, String value2) {
            addCriterion("unid not between", value1, value2, "unid");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Integer> values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Integer> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterion("atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterion("atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterion("atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterion("atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterion("atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterion("atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterion("atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterion("atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterion("atime not between", value1, value2, "atime");
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