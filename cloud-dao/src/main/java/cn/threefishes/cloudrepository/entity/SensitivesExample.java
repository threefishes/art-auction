package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SensitivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SensitivesExample() {
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

        public Criteria andSensitiveIdIsNull() {
            addCriterion("sensitive_id is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdIsNotNull() {
            addCriterion("sensitive_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdEqualTo(Integer value) {
            addCriterion("sensitive_id =", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdNotEqualTo(Integer value) {
            addCriterion("sensitive_id <>", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdGreaterThan(Integer value) {
            addCriterion("sensitive_id >", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensitive_id >=", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdLessThan(Integer value) {
            addCriterion("sensitive_id <", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("sensitive_id <=", value, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdIn(List<Integer> values) {
            addCriterion("sensitive_id in", values, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdNotIn(List<Integer> values) {
            addCriterion("sensitive_id not in", values, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdBetween(Integer value1, Integer value2) {
            addCriterion("sensitive_id between", value1, value2, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andSensitiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sensitive_id not between", value1, value2, "sensitiveId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIsNull() {
            addCriterion("sensitive_word is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIsNotNull() {
            addCriterion("sensitive_word is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordEqualTo(String value) {
            addCriterion("sensitive_word =", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotEqualTo(String value) {
            addCriterion("sensitive_word <>", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordGreaterThan(String value) {
            addCriterion("sensitive_word >", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordGreaterThanOrEqualTo(String value) {
            addCriterion("sensitive_word >=", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLessThan(String value) {
            addCriterion("sensitive_word <", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLessThanOrEqualTo(String value) {
            addCriterion("sensitive_word <=", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLike(String value) {
            addCriterion("sensitive_word like", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotLike(String value) {
            addCriterion("sensitive_word not like", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIn(List<String> values) {
            addCriterion("sensitive_word in", values, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotIn(List<String> values) {
            addCriterion("sensitive_word not in", values, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordBetween(String value1, String value2) {
            addCriterion("sensitive_word between", value1, value2, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotBetween(String value1, String value2) {
            addCriterion("sensitive_word not between", value1, value2, "sensitiveWord");
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