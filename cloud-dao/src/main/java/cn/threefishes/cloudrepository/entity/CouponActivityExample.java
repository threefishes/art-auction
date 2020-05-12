package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponActivityExample() {
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

        public Criteria andActivityExplainIsNull() {
            addCriterion("activity_explain is null");
            return (Criteria) this;
        }

        public Criteria andActivityExplainIsNotNull() {
            addCriterion("activity_explain is not null");
            return (Criteria) this;
        }

        public Criteria andActivityExplainEqualTo(String value) {
            addCriterion("activity_explain =", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainNotEqualTo(String value) {
            addCriterion("activity_explain <>", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainGreaterThan(String value) {
            addCriterion("activity_explain >", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainGreaterThanOrEqualTo(String value) {
            addCriterion("activity_explain >=", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainLessThan(String value) {
            addCriterion("activity_explain <", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainLessThanOrEqualTo(String value) {
            addCriterion("activity_explain <=", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainLike(String value) {
            addCriterion("activity_explain like", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainNotLike(String value) {
            addCriterion("activity_explain not like", value, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainIn(List<String> values) {
            addCriterion("activity_explain in", values, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainNotIn(List<String> values) {
            addCriterion("activity_explain not in", values, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainBetween(String value1, String value2) {
            addCriterion("activity_explain between", value1, value2, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityExplainNotBetween(String value1, String value2) {
            addCriterion("activity_explain not between", value1, value2, "activityExplain");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNull() {
            addCriterion("activity_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNotNull() {
            addCriterion("activity_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeEqualTo(Date value) {
            addCriterion("activity_start_time =", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotEqualTo(Date value) {
            addCriterion("activity_start_time <>", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThan(Date value) {
            addCriterion("activity_start_time >", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_time >=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThan(Date value) {
            addCriterion("activity_start_time <", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_time <=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIn(List<Date> values) {
            addCriterion("activity_start_time in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotIn(List<Date> values) {
            addCriterion("activity_start_time not in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeBetween(Date value1, Date value2) {
            addCriterion("activity_start_time between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_time not between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStateEqualTo(Integer value) {
            addCriterion("activity_state =", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotEqualTo(Integer value) {
            addCriterion("activity_state <>", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThan(Integer value) {
            addCriterion("activity_state >", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_state >=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThan(Integer value) {
            addCriterion("activity_state <", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_state <=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIn(List<Integer> values) {
            addCriterion("activity_state in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotIn(List<Integer> values) {
            addCriterion("activity_state not in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateBetween(Integer value1, Integer value2) {
            addCriterion("activity_state between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_state not between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Integer value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Integer value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Integer value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Integer value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Integer> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Integer> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Integer value1, Integer value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNull() {
            addCriterion("app_usable is null");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNotNull() {
            addCriterion("app_usable is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsableEqualTo(Integer value) {
            addCriterion("app_usable =", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotEqualTo(Integer value) {
            addCriterion("app_usable <>", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThan(Integer value) {
            addCriterion("app_usable >", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_usable >=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThan(Integer value) {
            addCriterion("app_usable <", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThanOrEqualTo(Integer value) {
            addCriterion("app_usable <=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableIn(List<Integer> values) {
            addCriterion("app_usable in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotIn(List<Integer> values) {
            addCriterion("app_usable not in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableBetween(Integer value1, Integer value2) {
            addCriterion("app_usable between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("app_usable not between", value1, value2, "appUsable");
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

        public Criteria andExpendPointsIsNull() {
            addCriterion("expend_points is null");
            return (Criteria) this;
        }

        public Criteria andExpendPointsIsNotNull() {
            addCriterion("expend_points is not null");
            return (Criteria) this;
        }

        public Criteria andExpendPointsEqualTo(Integer value) {
            addCriterion("expend_points =", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotEqualTo(Integer value) {
            addCriterion("expend_points <>", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsGreaterThan(Integer value) {
            addCriterion("expend_points >", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("expend_points >=", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsLessThan(Integer value) {
            addCriterion("expend_points <", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsLessThanOrEqualTo(Integer value) {
            addCriterion("expend_points <=", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsIn(List<Integer> values) {
            addCriterion("expend_points in", values, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotIn(List<Integer> values) {
            addCriterion("expend_points not in", values, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsBetween(Integer value1, Integer value2) {
            addCriterion("expend_points between", value1, value2, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("expend_points not between", value1, value2, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIsNull() {
            addCriterion("giveout_num is null");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIsNotNull() {
            addCriterion("giveout_num is not null");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumEqualTo(Integer value) {
            addCriterion("giveout_num =", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotEqualTo(Integer value) {
            addCriterion("giveout_num <>", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumGreaterThan(Integer value) {
            addCriterion("giveout_num >", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveout_num >=", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumLessThan(Integer value) {
            addCriterion("giveout_num <", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumLessThanOrEqualTo(Integer value) {
            addCriterion("giveout_num <=", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIn(List<Integer> values) {
            addCriterion("giveout_num in", values, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotIn(List<Integer> values) {
            addCriterion("giveout_num not in", values, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumBetween(Integer value1, Integer value2) {
            addCriterion("giveout_num between", value1, value2, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("giveout_num not between", value1, value2, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIsNull() {
            addCriterion("have_created is null");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIsNotNull() {
            addCriterion("have_created is not null");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedEqualTo(Integer value) {
            addCriterion("have_created =", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotEqualTo(Integer value) {
            addCriterion("have_created <>", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedGreaterThan(Integer value) {
            addCriterion("have_created >", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_created >=", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedLessThan(Integer value) {
            addCriterion("have_created <", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("have_created <=", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIn(List<Integer> values) {
            addCriterion("have_created in", values, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotIn(List<Integer> values) {
            addCriterion("have_created not in", values, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedBetween(Integer value1, Integer value2) {
            addCriterion("have_created between", value1, value2, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("have_created not between", value1, value2, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIsNull() {
            addCriterion("limit_member_grade_level is null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIsNotNull() {
            addCriterion("limit_member_grade_level is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelEqualTo(Integer value) {
            addCriterion("limit_member_grade_level =", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotEqualTo(Integer value) {
            addCriterion("limit_member_grade_level <>", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelGreaterThan(Integer value) {
            addCriterion("limit_member_grade_level >", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_member_grade_level >=", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelLessThan(Integer value) {
            addCriterion("limit_member_grade_level <", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("limit_member_grade_level <=", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIn(List<Integer> values) {
            addCriterion("limit_member_grade_level in", values, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotIn(List<Integer> values) {
            addCriterion("limit_member_grade_level not in", values, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelBetween(Integer value1, Integer value2) {
            addCriterion("limit_member_grade_level between", value1, value2, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_member_grade_level not between", value1, value2, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIsNull() {
            addCriterion("limit_member_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIsNotNull() {
            addCriterion("limit_member_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameEqualTo(String value) {
            addCriterion("limit_member_grade_name =", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotEqualTo(String value) {
            addCriterion("limit_member_grade_name <>", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameGreaterThan(String value) {
            addCriterion("limit_member_grade_name >", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("limit_member_grade_name >=", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLessThan(String value) {
            addCriterion("limit_member_grade_name <", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLessThanOrEqualTo(String value) {
            addCriterion("limit_member_grade_name <=", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLike(String value) {
            addCriterion("limit_member_grade_name like", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotLike(String value) {
            addCriterion("limit_member_grade_name not like", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIn(List<String> values) {
            addCriterion("limit_member_grade_name in", values, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotIn(List<String> values) {
            addCriterion("limit_member_grade_name not in", values, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameBetween(String value1, String value2) {
            addCriterion("limit_member_grade_name between", value1, value2, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotBetween(String value1, String value2) {
            addCriterion("limit_member_grade_name not between", value1, value2, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andRecommendStateIsNull() {
            addCriterion("recommend_state is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStateIsNotNull() {
            addCriterion("recommend_state is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStateEqualTo(Integer value) {
            addCriterion("recommend_state =", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateNotEqualTo(Integer value) {
            addCriterion("recommend_state <>", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateGreaterThan(Integer value) {
            addCriterion("recommend_state >", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_state >=", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateLessThan(Integer value) {
            addCriterion("recommend_state <", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_state <=", value, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateIn(List<Integer> values) {
            addCriterion("recommend_state in", values, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateNotIn(List<Integer> values) {
            addCriterion("recommend_state not in", values, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateBetween(Integer value1, Integer value2) {
            addCriterion("recommend_state between", value1, value2, "recommendState");
            return (Criteria) this;
        }

        public Criteria andRecommendStateNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_state not between", value1, value2, "recommendState");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateIsNull() {
            addCriterion("store_commitment_rate is null");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateIsNotNull() {
            addCriterion("store_commitment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateEqualTo(Double value) {
            addCriterion("store_commitment_rate =", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateNotEqualTo(Double value) {
            addCriterion("store_commitment_rate <>", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateGreaterThan(Double value) {
            addCriterion("store_commitment_rate >", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateGreaterThanOrEqualTo(Double value) {
            addCriterion("store_commitment_rate >=", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateLessThan(Double value) {
            addCriterion("store_commitment_rate <", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateLessThanOrEqualTo(Double value) {
            addCriterion("store_commitment_rate <=", value, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateIn(List<Double> values) {
            addCriterion("store_commitment_rate in", values, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateNotIn(List<Double> values) {
            addCriterion("store_commitment_rate not in", values, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateBetween(Double value1, Double value2) {
            addCriterion("store_commitment_rate between", value1, value2, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentRateNotBetween(Double value1, Double value2) {
            addCriterion("store_commitment_rate not between", value1, value2, "storeCommitmentRate");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
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

        public Criteria andUseEndTimeIsNull() {
            addCriterion("use_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNotNull() {
            addCriterion("use_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeEqualTo(Date value) {
            addCriterion("use_end_time =", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotEqualTo(Date value) {
            addCriterion("use_end_time <>", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThan(Date value) {
            addCriterion("use_end_time >", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_end_time >=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThan(Date value) {
            addCriterion("use_end_time <", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("use_end_time <=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIn(List<Date> values) {
            addCriterion("use_end_time in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotIn(List<Date> values) {
            addCriterion("use_end_time not in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeBetween(Date value1, Date value2) {
            addCriterion("use_end_time between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("use_end_time not between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeIsNull() {
            addCriterion("use_goods_range is null");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeIsNotNull() {
            addCriterion("use_goods_range is not null");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeEqualTo(Integer value) {
            addCriterion("use_goods_range =", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeNotEqualTo(Integer value) {
            addCriterion("use_goods_range <>", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeGreaterThan(Integer value) {
            addCriterion("use_goods_range >", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_goods_range >=", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeLessThan(Integer value) {
            addCriterion("use_goods_range <", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeLessThanOrEqualTo(Integer value) {
            addCriterion("use_goods_range <=", value, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeIn(List<Integer> values) {
            addCriterion("use_goods_range in", values, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeNotIn(List<Integer> values) {
            addCriterion("use_goods_range not in", values, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeBetween(Integer value1, Integer value2) {
            addCriterion("use_goods_range between", value1, value2, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_goods_range not between", value1, value2, "useGoodsRange");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainIsNull() {
            addCriterion("use_goods_range_explain is null");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainIsNotNull() {
            addCriterion("use_goods_range_explain is not null");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainEqualTo(String value) {
            addCriterion("use_goods_range_explain =", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainNotEqualTo(String value) {
            addCriterion("use_goods_range_explain <>", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainGreaterThan(String value) {
            addCriterion("use_goods_range_explain >", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainGreaterThanOrEqualTo(String value) {
            addCriterion("use_goods_range_explain >=", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainLessThan(String value) {
            addCriterion("use_goods_range_explain <", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainLessThanOrEqualTo(String value) {
            addCriterion("use_goods_range_explain <=", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainLike(String value) {
            addCriterion("use_goods_range_explain like", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainNotLike(String value) {
            addCriterion("use_goods_range_explain not like", value, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainIn(List<String> values) {
            addCriterion("use_goods_range_explain in", values, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainNotIn(List<String> values) {
            addCriterion("use_goods_range_explain not in", values, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainBetween(String value1, String value2) {
            addCriterion("use_goods_range_explain between", value1, value2, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseGoodsRangeExplainNotBetween(String value1, String value2) {
            addCriterion("use_goods_range_explain not between", value1, value2, "useGoodsRangeExplain");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNull() {
            addCriterion("use_start_time is null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNotNull() {
            addCriterion("use_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeEqualTo(Date value) {
            addCriterion("use_start_time =", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotEqualTo(Date value) {
            addCriterion("use_start_time <>", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThan(Date value) {
            addCriterion("use_start_time >", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_start_time >=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThan(Date value) {
            addCriterion("use_start_time <", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("use_start_time <=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIn(List<Date> values) {
            addCriterion("use_start_time in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotIn(List<Date> values) {
            addCriterion("use_start_time not in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeBetween(Date value1, Date value2) {
            addCriterion("use_start_time between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("use_start_time not between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNull() {
            addCriterion("used_num is null");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNotNull() {
            addCriterion("used_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNumEqualTo(Integer value) {
            addCriterion("used_num =", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotEqualTo(Integer value) {
            addCriterion("used_num <>", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThan(Integer value) {
            addCriterion("used_num >", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_num >=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThan(Integer value) {
            addCriterion("used_num <", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThanOrEqualTo(Integer value) {
            addCriterion("used_num <=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumIn(List<Integer> values) {
            addCriterion("used_num in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotIn(List<Integer> values) {
            addCriterion("used_num not in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumBetween(Integer value1, Integer value2) {
            addCriterion("used_num between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("used_num not between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("valid_days is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("valid_days is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(Integer value) {
            addCriterion("valid_days =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(Integer value) {
            addCriterion("valid_days <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(Integer value) {
            addCriterion("valid_days >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_days >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(Integer value) {
            addCriterion("valid_days <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(Integer value) {
            addCriterion("valid_days <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<Integer> values) {
            addCriterion("valid_days in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<Integer> values) {
            addCriterion("valid_days not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(Integer value1, Integer value2) {
            addCriterion("valid_days between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_days not between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNull() {
            addCriterion("web_usable is null");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNotNull() {
            addCriterion("web_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWebUsableEqualTo(Integer value) {
            addCriterion("web_usable =", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotEqualTo(Integer value) {
            addCriterion("web_usable <>", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThan(Integer value) {
            addCriterion("web_usable >", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_usable >=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThan(Integer value) {
            addCriterion("web_usable <", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThanOrEqualTo(Integer value) {
            addCriterion("web_usable <=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableIn(List<Integer> values) {
            addCriterion("web_usable in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotIn(List<Integer> values) {
            addCriterion("web_usable not in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableBetween(Integer value1, Integer value2) {
            addCriterion("web_usable between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("web_usable not between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNull() {
            addCriterion("wechat_usable is null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNotNull() {
            addCriterion("wechat_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableEqualTo(Integer value) {
            addCriterion("wechat_usable =", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotEqualTo(Integer value) {
            addCriterion("wechat_usable <>", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThan(Integer value) {
            addCriterion("wechat_usable >", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable >=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThan(Integer value) {
            addCriterion("wechat_usable <", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable <=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIn(List<Integer> values) {
            addCriterion("wechat_usable in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotIn(List<Integer> values) {
            addCriterion("wechat_usable not in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable not between", value1, value2, "wechatUsable");
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