package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeckillScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeckillScheduleExample() {
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

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIsNull() {
            addCriterion("schedule_name is null");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIsNotNull() {
            addCriterion("schedule_name is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleNameEqualTo(String value) {
            addCriterion("schedule_name =", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotEqualTo(String value) {
            addCriterion("schedule_name <>", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameGreaterThan(String value) {
            addCriterion("schedule_name >", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_name >=", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLessThan(String value) {
            addCriterion("schedule_name <", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLessThanOrEqualTo(String value) {
            addCriterion("schedule_name <=", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLike(String value) {
            addCriterion("schedule_name like", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotLike(String value) {
            addCriterion("schedule_name not like", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIn(List<String> values) {
            addCriterion("schedule_name in", values, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotIn(List<String> values) {
            addCriterion("schedule_name not in", values, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameBetween(String value1, String value2) {
            addCriterion("schedule_name between", value1, value2, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotBetween(String value1, String value2) {
            addCriterion("schedule_name not between", value1, value2, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleStateIsNull() {
            addCriterion("schedule_state is null");
            return (Criteria) this;
        }

        public Criteria andScheduleStateIsNotNull() {
            addCriterion("schedule_state is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleStateEqualTo(Integer value) {
            addCriterion("schedule_state =", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateNotEqualTo(Integer value) {
            addCriterion("schedule_state <>", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateGreaterThan(Integer value) {
            addCriterion("schedule_state >", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_state >=", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateLessThan(Integer value) {
            addCriterion("schedule_state <", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_state <=", value, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateIn(List<Integer> values) {
            addCriterion("schedule_state in", values, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateNotIn(List<Integer> values) {
            addCriterion("schedule_state not in", values, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateBetween(Integer value1, Integer value2) {
            addCriterion("schedule_state between", value1, value2, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andScheduleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_state not between", value1, value2, "scheduleState");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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