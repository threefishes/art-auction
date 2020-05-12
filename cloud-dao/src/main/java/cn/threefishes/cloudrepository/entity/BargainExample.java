package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BargainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BargainExample() {
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

        public Criteria andBargainIdIsNull() {
            addCriterion("bargain_id is null");
            return (Criteria) this;
        }

        public Criteria andBargainIdIsNotNull() {
            addCriterion("bargain_id is not null");
            return (Criteria) this;
        }

        public Criteria andBargainIdEqualTo(Integer value) {
            addCriterion("bargain_id =", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdNotEqualTo(Integer value) {
            addCriterion("bargain_id <>", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdGreaterThan(Integer value) {
            addCriterion("bargain_id >", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bargain_id >=", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdLessThan(Integer value) {
            addCriterion("bargain_id <", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdLessThanOrEqualTo(Integer value) {
            addCriterion("bargain_id <=", value, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdIn(List<Integer> values) {
            addCriterion("bargain_id in", values, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdNotIn(List<Integer> values) {
            addCriterion("bargain_id not in", values, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdBetween(Integer value1, Integer value2) {
            addCriterion("bargain_id between", value1, value2, "bargainId");
            return (Criteria) this;
        }

        public Criteria andBargainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bargain_id not between", value1, value2, "bargainId");
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

        public Criteria andBargainStorageIsNull() {
            addCriterion("bargain_storage is null");
            return (Criteria) this;
        }

        public Criteria andBargainStorageIsNotNull() {
            addCriterion("bargain_storage is not null");
            return (Criteria) this;
        }

        public Criteria andBargainStorageEqualTo(Integer value) {
            addCriterion("bargain_storage =", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageNotEqualTo(Integer value) {
            addCriterion("bargain_storage <>", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageGreaterThan(Integer value) {
            addCriterion("bargain_storage >", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("bargain_storage >=", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageLessThan(Integer value) {
            addCriterion("bargain_storage <", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageLessThanOrEqualTo(Integer value) {
            addCriterion("bargain_storage <=", value, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageIn(List<Integer> values) {
            addCriterion("bargain_storage in", values, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageNotIn(List<Integer> values) {
            addCriterion("bargain_storage not in", values, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageBetween(Integer value1, Integer value2) {
            addCriterion("bargain_storage between", value1, value2, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBargainStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("bargain_storage not between", value1, value2, "bargainStorage");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIsNull() {
            addCriterion("bottom_price is null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIsNotNull() {
            addCriterion("bottom_price is not null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceEqualTo(BigDecimal value) {
            addCriterion("bottom_price =", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotEqualTo(BigDecimal value) {
            addCriterion("bottom_price <>", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThan(BigDecimal value) {
            addCriterion("bottom_price >", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bottom_price >=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThan(BigDecimal value) {
            addCriterion("bottom_price <", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bottom_price <=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIn(List<BigDecimal> values) {
            addCriterion("bottom_price in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotIn(List<BigDecimal> values) {
            addCriterion("bottom_price not in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bottom_price between", value1, value2, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bottom_price not between", value1, value2, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxIsNull() {
            addCriterion("interval_max is null");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxIsNotNull() {
            addCriterion("interval_max is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxEqualTo(BigDecimal value) {
            addCriterion("interval_max =", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxNotEqualTo(BigDecimal value) {
            addCriterion("interval_max <>", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxGreaterThan(BigDecimal value) {
            addCriterion("interval_max >", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interval_max >=", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxLessThan(BigDecimal value) {
            addCriterion("interval_max <", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interval_max <=", value, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxIn(List<BigDecimal> values) {
            addCriterion("interval_max in", values, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxNotIn(List<BigDecimal> values) {
            addCriterion("interval_max not in", values, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interval_max between", value1, value2, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interval_max not between", value1, value2, "intervalMax");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIsNull() {
            addCriterion("interval_min is null");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIsNotNull() {
            addCriterion("interval_min is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalMinEqualTo(BigDecimal value) {
            addCriterion("interval_min =", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotEqualTo(BigDecimal value) {
            addCriterion("interval_min <>", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinGreaterThan(BigDecimal value) {
            addCriterion("interval_min >", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interval_min >=", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinLessThan(BigDecimal value) {
            addCriterion("interval_min <", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interval_min <=", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIn(List<BigDecimal> values) {
            addCriterion("interval_min in", values, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotIn(List<BigDecimal> values) {
            addCriterion("interval_min not in", values, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interval_min between", value1, value2, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interval_min not between", value1, value2, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIsNull() {
            addCriterion("join_number is null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIsNotNull() {
            addCriterion("join_number is not null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberEqualTo(Integer value) {
            addCriterion("join_number =", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotEqualTo(Integer value) {
            addCriterion("join_number <>", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberGreaterThan(Integer value) {
            addCriterion("join_number >", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_number >=", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberLessThan(Integer value) {
            addCriterion("join_number <", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberLessThanOrEqualTo(Integer value) {
            addCriterion("join_number <=", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIn(List<Integer> values) {
            addCriterion("join_number in", values, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotIn(List<Integer> values) {
            addCriterion("join_number not in", values, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberBetween(Integer value1, Integer value2) {
            addCriterion("join_number between", value1, value2, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("join_number not between", value1, value2, "joinNumber");
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