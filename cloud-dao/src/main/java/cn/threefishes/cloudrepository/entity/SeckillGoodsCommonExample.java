package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeckillGoodsCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeckillGoodsCommonExample() {
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

        public Criteria andSeckillCommonIdIsNull() {
            addCriterion("seckill_common_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdIsNotNull() {
            addCriterion("seckill_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdEqualTo(Integer value) {
            addCriterion("seckill_common_id =", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdNotEqualTo(Integer value) {
            addCriterion("seckill_common_id <>", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdGreaterThan(Integer value) {
            addCriterion("seckill_common_id >", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_common_id >=", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdLessThan(Integer value) {
            addCriterion("seckill_common_id <", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_common_id <=", value, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdIn(List<Integer> values) {
            addCriterion("seckill_common_id in", values, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdNotIn(List<Integer> values) {
            addCriterion("seckill_common_id not in", values, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("seckill_common_id between", value1, value2, "seckillCommonId");
            return (Criteria) this;
        }

        public Criteria andSeckillCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_common_id not between", value1, value2, "seckillCommonId");
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

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNull() {
            addCriterion("goods_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNotNull() {
            addCriterion("goods_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumEqualTo(Integer value) {
            addCriterion("goods_sale_num =", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotEqualTo(Integer value) {
            addCriterion("goods_sale_num <>", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThan(Integer value) {
            addCriterion("goods_sale_num >", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num >=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThan(Integer value) {
            addCriterion("goods_sale_num <", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num <=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIn(List<Integer> values) {
            addCriterion("goods_sale_num in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotIn(List<Integer> values) {
            addCriterion("goods_sale_num not in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num not between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNull() {
            addCriterion("goods_storage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNotNull() {
            addCriterion("goods_storage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageEqualTo(Integer value) {
            addCriterion("goods_storage =", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotEqualTo(Integer value) {
            addCriterion("goods_storage <>", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThan(Integer value) {
            addCriterion("goods_storage >", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_storage >=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThan(Integer value) {
            addCriterion("goods_storage <", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThanOrEqualTo(Integer value) {
            addCriterion("goods_storage <=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIn(List<Integer> values) {
            addCriterion("goods_storage in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotIn(List<Integer> values) {
            addCriterion("goods_storage not in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageBetween(Integer value1, Integer value2) {
            addCriterion("goods_storage between", value1, value2, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_storage not between", value1, value2, "goodsStorage");
            return (Criteria) this;
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

        public Criteria andVerifyRemarkIsNull() {
            addCriterion("verify_remark is null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNotNull() {
            addCriterion("verify_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkEqualTo(String value) {
            addCriterion("verify_remark =", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotEqualTo(String value) {
            addCriterion("verify_remark <>", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThan(String value) {
            addCriterion("verify_remark >", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("verify_remark >=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThan(String value) {
            addCriterion("verify_remark <", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThanOrEqualTo(String value) {
            addCriterion("verify_remark <=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLike(String value) {
            addCriterion("verify_remark like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotLike(String value) {
            addCriterion("verify_remark not like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIn(List<String> values) {
            addCriterion("verify_remark in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotIn(List<String> values) {
            addCriterion("verify_remark not in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkBetween(String value1, String value2) {
            addCriterion("verify_remark between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotBetween(String value1, String value2) {
            addCriterion("verify_remark not between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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