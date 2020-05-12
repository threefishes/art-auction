package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckInExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andSuperIdIsNull() {
            addCriterion("super_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperIdIsNotNull() {
            addCriterion("super_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperIdEqualTo(Integer value) {
            addCriterion("super_id =", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotEqualTo(Integer value) {
            addCriterion("super_id <>", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdGreaterThan(Integer value) {
            addCriterion("super_id >", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_id >=", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdLessThan(Integer value) {
            addCriterion("super_id <", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdLessThanOrEqualTo(Integer value) {
            addCriterion("super_id <=", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdIn(List<Integer> values) {
            addCriterion("super_id in", values, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotIn(List<Integer> values) {
            addCriterion("super_id not in", values, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdBetween(Integer value1, Integer value2) {
            addCriterion("super_id between", value1, value2, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("super_id not between", value1, value2, "superId");
            return (Criteria) this;
        }

        public Criteria andContinueDaysIsNull() {
            addCriterion("continue_days is null");
            return (Criteria) this;
        }

        public Criteria andContinueDaysIsNotNull() {
            addCriterion("continue_days is not null");
            return (Criteria) this;
        }

        public Criteria andContinueDaysEqualTo(Integer value) {
            addCriterion("continue_days =", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysNotEqualTo(Integer value) {
            addCriterion("continue_days <>", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysGreaterThan(Integer value) {
            addCriterion("continue_days >", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_days >=", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysLessThan(Integer value) {
            addCriterion("continue_days <", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("continue_days <=", value, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysIn(List<Integer> values) {
            addCriterion("continue_days in", values, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysNotIn(List<Integer> values) {
            addCriterion("continue_days not in", values, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysBetween(Integer value1, Integer value2) {
            addCriterion("continue_days between", value1, value2, "continueDays");
            return (Criteria) this;
        }

        public Criteria andContinueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_days not between", value1, value2, "continueDays");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(BigDecimal value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(BigDecimal value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(BigDecimal value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(BigDecimal value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<BigDecimal> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<BigDecimal> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdIsNull() {
            addCriterion("share_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdIsNotNull() {
            addCriterion("share_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdEqualTo(Integer value) {
            addCriterion("share_activity_id =", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdNotEqualTo(Integer value) {
            addCriterion("share_activity_id <>", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdGreaterThan(Integer value) {
            addCriterion("share_activity_id >", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_activity_id >=", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdLessThan(Integer value) {
            addCriterion("share_activity_id <", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("share_activity_id <=", value, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdIn(List<Integer> values) {
            addCriterion("share_activity_id in", values, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdNotIn(List<Integer> values) {
            addCriterion("share_activity_id not in", values, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("share_activity_id between", value1, value2, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("share_activity_id not between", value1, value2, "shareActivityId");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceIsNull() {
            addCriterion("share_coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceIsNotNull() {
            addCriterion("share_coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceEqualTo(BigDecimal value) {
            addCriterion("share_coupon_price =", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceNotEqualTo(BigDecimal value) {
            addCriterion("share_coupon_price <>", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceGreaterThan(BigDecimal value) {
            addCriterion("share_coupon_price >", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_coupon_price >=", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceLessThan(BigDecimal value) {
            addCriterion("share_coupon_price <", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_coupon_price <=", value, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceIn(List<BigDecimal> values) {
            addCriterion("share_coupon_price in", values, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceNotIn(List<BigDecimal> values) {
            addCriterion("share_coupon_price not in", values, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_coupon_price between", value1, value2, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andShareCouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_coupon_price not between", value1, value2, "shareCouponPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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