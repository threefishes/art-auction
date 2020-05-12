package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundReasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundReasonExample() {
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

        public Criteria andReasonIdIsNull() {
            addCriterion("reason_id is null");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNotNull() {
            addCriterion("reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andReasonIdEqualTo(Integer value) {
            addCriterion("reason_id =", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotEqualTo(Integer value) {
            addCriterion("reason_id <>", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThan(Integer value) {
            addCriterion("reason_id >", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reason_id >=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThan(Integer value) {
            addCriterion("reason_id <", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThanOrEqualTo(Integer value) {
            addCriterion("reason_id <=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdIn(List<Integer> values) {
            addCriterion("reason_id in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotIn(List<Integer> values) {
            addCriterion("reason_id not in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdBetween(Integer value1, Integer value2) {
            addCriterion("reason_id between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reason_id not between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIsNull() {
            addCriterion("reason_info is null");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIsNotNull() {
            addCriterion("reason_info is not null");
            return (Criteria) this;
        }

        public Criteria andReasonInfoEqualTo(String value) {
            addCriterion("reason_info =", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotEqualTo(String value) {
            addCriterion("reason_info <>", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoGreaterThan(String value) {
            addCriterion("reason_info >", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reason_info >=", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLessThan(String value) {
            addCriterion("reason_info <", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLessThanOrEqualTo(String value) {
            addCriterion("reason_info <=", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLike(String value) {
            addCriterion("reason_info like", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotLike(String value) {
            addCriterion("reason_info not like", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIn(List<String> values) {
            addCriterion("reason_info in", values, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotIn(List<String> values) {
            addCriterion("reason_info not in", values, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoBetween(String value1, String value2) {
            addCriterion("reason_info between", value1, value2, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotBetween(String value1, String value2) {
            addCriterion("reason_info not between", value1, value2, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonSortIsNull() {
            addCriterion("reason_sort is null");
            return (Criteria) this;
        }

        public Criteria andReasonSortIsNotNull() {
            addCriterion("reason_sort is not null");
            return (Criteria) this;
        }

        public Criteria andReasonSortEqualTo(Integer value) {
            addCriterion("reason_sort =", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortNotEqualTo(Integer value) {
            addCriterion("reason_sort <>", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortGreaterThan(Integer value) {
            addCriterion("reason_sort >", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("reason_sort >=", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortLessThan(Integer value) {
            addCriterion("reason_sort <", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortLessThanOrEqualTo(Integer value) {
            addCriterion("reason_sort <=", value, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortIn(List<Integer> values) {
            addCriterion("reason_sort in", values, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortNotIn(List<Integer> values) {
            addCriterion("reason_sort not in", values, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortBetween(Integer value1, Integer value2) {
            addCriterion("reason_sort between", value1, value2, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andReasonSortNotBetween(Integer value1, Integer value2) {
            addCriterion("reason_sort not between", value1, value2, "reasonSort");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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