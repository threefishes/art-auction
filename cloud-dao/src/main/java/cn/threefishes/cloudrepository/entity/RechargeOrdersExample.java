package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeOrdersExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateIsNull() {
            addCriterion("admin_receive_pay_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateIsNotNull() {
            addCriterion("admin_receive_pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateEqualTo(Integer value) {
            addCriterion("admin_receive_pay_state =", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateNotEqualTo(Integer value) {
            addCriterion("admin_receive_pay_state <>", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateGreaterThan(Integer value) {
            addCriterion("admin_receive_pay_state >", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_receive_pay_state >=", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateLessThan(Integer value) {
            addCriterion("admin_receive_pay_state <", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_receive_pay_state <=", value, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateIn(List<Integer> values) {
            addCriterion("admin_receive_pay_state in", values, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateNotIn(List<Integer> values) {
            addCriterion("admin_receive_pay_state not in", values, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_receive_pay_state between", value1, value2, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andAdminReceivePayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_receive_pay_state not between", value1, value2, "adminReceivePayState");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(Integer value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(Integer value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(Integer value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(Integer value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<Integer> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<Integer> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(Integer value1, Integer value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelRoleIsNull() {
            addCriterion("cancel_role is null");
            return (Criteria) this;
        }

        public Criteria andCancelRoleIsNotNull() {
            addCriterion("cancel_role is not null");
            return (Criteria) this;
        }

        public Criteria andCancelRoleEqualTo(String value) {
            addCriterion("cancel_role =", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleNotEqualTo(String value) {
            addCriterion("cancel_role <>", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleGreaterThan(String value) {
            addCriterion("cancel_role >", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_role >=", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleLessThan(String value) {
            addCriterion("cancel_role <", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleLessThanOrEqualTo(String value) {
            addCriterion("cancel_role <=", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleLike(String value) {
            addCriterion("cancel_role like", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleNotLike(String value) {
            addCriterion("cancel_role not like", value, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleIn(List<String> values) {
            addCriterion("cancel_role in", values, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleNotIn(List<String> values) {
            addCriterion("cancel_role not in", values, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleBetween(String value1, String value2) {
            addCriterion("cancel_role between", value1, value2, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelRoleNotBetween(String value1, String value2) {
            addCriterion("cancel_role not between", value1, value2, "cancelRole");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andConformPriceIsNull() {
            addCriterion("conform_price is null");
            return (Criteria) this;
        }

        public Criteria andConformPriceIsNotNull() {
            addCriterion("conform_price is not null");
            return (Criteria) this;
        }

        public Criteria andConformPriceEqualTo(BigDecimal value) {
            addCriterion("conform_price =", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotEqualTo(BigDecimal value) {
            addCriterion("conform_price <>", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceGreaterThan(BigDecimal value) {
            addCriterion("conform_price >", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("conform_price >=", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceLessThan(BigDecimal value) {
            addCriterion("conform_price <", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("conform_price <=", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceIn(List<BigDecimal> values) {
            addCriterion("conform_price in", values, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotIn(List<BigDecimal> values) {
            addCriterion("conform_price not in", values, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conform_price between", value1, value2, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conform_price not between", value1, value2, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
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

        public Criteria andCreateTimeDateIsNull() {
            addCriterion("create_time_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateIsNotNull() {
            addCriterion("create_time_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateEqualTo(String value) {
            addCriterion("create_time_date =", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateNotEqualTo(String value) {
            addCriterion("create_time_date <>", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateGreaterThan(String value) {
            addCriterion("create_time_date >", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_time_date >=", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateLessThan(String value) {
            addCriterion("create_time_date <", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateLessThanOrEqualTo(String value) {
            addCriterion("create_time_date <=", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateLike(String value) {
            addCriterion("create_time_date like", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateNotLike(String value) {
            addCriterion("create_time_date not like", value, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateIn(List<String> values) {
            addCriterion("create_time_date in", values, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateNotIn(List<String> values) {
            addCriterion("create_time_date not in", values, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateBetween(String value1, String value2) {
            addCriterion("create_time_date between", value1, value2, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDateNotBetween(String value1, String value2) {
            addCriterion("create_time_date not between", value1, value2, "createTimeDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourIsNull() {
            addCriterion("create_time_hour is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourIsNotNull() {
            addCriterion("create_time_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourEqualTo(String value) {
            addCriterion("create_time_hour =", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourNotEqualTo(String value) {
            addCriterion("create_time_hour <>", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourGreaterThan(String value) {
            addCriterion("create_time_hour >", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourGreaterThanOrEqualTo(String value) {
            addCriterion("create_time_hour >=", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourLessThan(String value) {
            addCriterion("create_time_hour <", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourLessThanOrEqualTo(String value) {
            addCriterion("create_time_hour <=", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourLike(String value) {
            addCriterion("create_time_hour like", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourNotLike(String value) {
            addCriterion("create_time_hour not like", value, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourIn(List<String> values) {
            addCriterion("create_time_hour in", values, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourNotIn(List<String> values) {
            addCriterion("create_time_hour not in", values, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourBetween(String value1, String value2) {
            addCriterion("create_time_hour between", value1, value2, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeHourNotBetween(String value1, String value2) {
            addCriterion("create_time_hour not between", value1, value2, "createTimeHour");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNull() {
            addCriterion("delete_state is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNotNull() {
            addCriterion("delete_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateEqualTo(Integer value) {
            addCriterion("delete_state =", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotEqualTo(Integer value) {
            addCriterion("delete_state <>", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThan(Integer value) {
            addCriterion("delete_state >", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_state >=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThan(Integer value) {
            addCriterion("delete_state <", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThanOrEqualTo(Integer value) {
            addCriterion("delete_state <=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIn(List<Integer> values) {
            addCriterion("delete_state in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotIn(List<Integer> values) {
            addCriterion("delete_state not in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateBetween(Integer value1, Integer value2) {
            addCriterion("delete_state between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_state not between", value1, value2, "deleteState");
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

        public Criteria andEvaluationStateIsNull() {
            addCriterion("evaluation_state is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateIsNotNull() {
            addCriterion("evaluation_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateEqualTo(Integer value) {
            addCriterion("evaluation_state =", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotEqualTo(Integer value) {
            addCriterion("evaluation_state <>", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateGreaterThan(Integer value) {
            addCriterion("evaluation_state >", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_state >=", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateLessThan(Integer value) {
            addCriterion("evaluation_state <", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_state <=", value, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateIn(List<Integer> values) {
            addCriterion("evaluation_state in", values, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotIn(List<Integer> values) {
            addCriterion("evaluation_state not in", values, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_state between", value1, value2, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationStateNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_state not between", value1, value2, "evaluationState");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Integer value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Integer value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Integer value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Integer value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Integer> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Integer> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Integer value1, Integer value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
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

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNull() {
            addCriterion("orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNotNull() {
            addCriterion("orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountEqualTo(BigDecimal value) {
            addCriterion("orders_amount =", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotEqualTo(BigDecimal value) {
            addCriterion("orders_amount <>", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThan(BigDecimal value) {
            addCriterion("orders_amount >", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_amount >=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThan(BigDecimal value) {
            addCriterion("orders_amount <", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_amount <=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIn(List<BigDecimal> values) {
            addCriterion("orders_amount in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotIn(List<BigDecimal> values) {
            addCriterion("orders_amount not in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_amount between", value1, value2, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_amount not between", value1, value2, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersFromIsNull() {
            addCriterion("orders_from is null");
            return (Criteria) this;
        }

        public Criteria andOrdersFromIsNotNull() {
            addCriterion("orders_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersFromEqualTo(String value) {
            addCriterion("orders_from =", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromNotEqualTo(String value) {
            addCriterion("orders_from <>", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromGreaterThan(String value) {
            addCriterion("orders_from >", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromGreaterThanOrEqualTo(String value) {
            addCriterion("orders_from >=", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromLessThan(String value) {
            addCriterion("orders_from <", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromLessThanOrEqualTo(String value) {
            addCriterion("orders_from <=", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromLike(String value) {
            addCriterion("orders_from like", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromNotLike(String value) {
            addCriterion("orders_from not like", value, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromIn(List<String> values) {
            addCriterion("orders_from in", values, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromNotIn(List<String> values) {
            addCriterion("orders_from not in", values, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromBetween(String value1, String value2) {
            addCriterion("orders_from between", value1, value2, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFromNotBetween(String value1, String value2) {
            addCriterion("orders_from not between", value1, value2, "ordersFrom");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1IsNull() {
            addCriterion("orders_from1 is null");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1IsNotNull() {
            addCriterion("orders_from1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1EqualTo(String value) {
            addCriterion("orders_from1 =", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1NotEqualTo(String value) {
            addCriterion("orders_from1 <>", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1GreaterThan(String value) {
            addCriterion("orders_from1 >", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1GreaterThanOrEqualTo(String value) {
            addCriterion("orders_from1 >=", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1LessThan(String value) {
            addCriterion("orders_from1 <", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1LessThanOrEqualTo(String value) {
            addCriterion("orders_from1 <=", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1Like(String value) {
            addCriterion("orders_from1 like", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1NotLike(String value) {
            addCriterion("orders_from1 not like", value, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1In(List<String> values) {
            addCriterion("orders_from1 in", values, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1NotIn(List<String> values) {
            addCriterion("orders_from1 not in", values, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1Between(String value1, String value2) {
            addCriterion("orders_from1 between", value1, value2, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersFrom1NotBetween(String value1, String value2) {
            addCriterion("orders_from1 not between", value1, value2, "ordersFrom1");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNull() {
            addCriterion("orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNotNull() {
            addCriterion("orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnEqualTo(Long value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(Long value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(Long value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(Long value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(Long value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<Long> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<Long> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(Long value1, Long value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(Long value1, Long value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNull() {
            addCriterion("orders_state is null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNotNull() {
            addCriterion("orders_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateEqualTo(Integer value) {
            addCriterion("orders_state =", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotEqualTo(Integer value) {
            addCriterion("orders_state <>", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThan(Integer value) {
            addCriterion("orders_state >", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_state >=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThan(Integer value) {
            addCriterion("orders_state <", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThanOrEqualTo(Integer value) {
            addCriterion("orders_state <=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIn(List<Integer> values) {
            addCriterion("orders_state in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotIn(List<Integer> values) {
            addCriterion("orders_state not in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateBetween(Integer value1, Integer value2) {
            addCriterion("orders_state between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_state not between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIsNull() {
            addCriterion("recharge_state is null");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIsNotNull() {
            addCriterion("recharge_state is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeStateEqualTo(Integer value) {
            addCriterion("recharge_state =", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotEqualTo(Integer value) {
            addCriterion("recharge_state <>", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateGreaterThan(Integer value) {
            addCriterion("recharge_state >", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_state >=", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateLessThan(Integer value) {
            addCriterion("recharge_state <", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_state <=", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIn(List<Integer> values) {
            addCriterion("recharge_state in", values, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotIn(List<Integer> values) {
            addCriterion("recharge_state not in", values, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateBetween(Integer value1, Integer value2) {
            addCriterion("recharge_state between", value1, value2, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_state not between", value1, value2, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIsNull() {
            addCriterion("out_orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIsNotNull() {
            addCriterion("out_orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnEqualTo(String value) {
            addCriterion("out_orders_sn =", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotEqualTo(String value) {
            addCriterion("out_orders_sn <>", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnGreaterThan(String value) {
            addCriterion("out_orders_sn >", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("out_orders_sn >=", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLessThan(String value) {
            addCriterion("out_orders_sn <", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("out_orders_sn <=", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLike(String value) {
            addCriterion("out_orders_sn like", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotLike(String value) {
            addCriterion("out_orders_sn not like", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIn(List<String> values) {
            addCriterion("out_orders_sn in", values, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotIn(List<String> values) {
            addCriterion("out_orders_sn not in", values, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnBetween(String value1, String value2) {
            addCriterion("out_orders_sn between", value1, value2, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotBetween(String value1, String value2) {
            addCriterion("out_orders_sn not between", value1, value2, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(Long value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(Long value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(Long value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(Long value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(Long value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<Long> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<Long> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(Long value1, Long value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(Long value1, Long value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIsNull() {
            addCriterion("payment_client_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIsNotNull() {
            addCriterion("payment_client_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeEqualTo(String value) {
            addCriterion("payment_client_type =", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotEqualTo(String value) {
            addCriterion("payment_client_type <>", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeGreaterThan(String value) {
            addCriterion("payment_client_type >", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_client_type >=", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLessThan(String value) {
            addCriterion("payment_client_type <", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_client_type <=", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLike(String value) {
            addCriterion("payment_client_type like", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotLike(String value) {
            addCriterion("payment_client_type not like", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIn(List<String> values) {
            addCriterion("payment_client_type in", values, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotIn(List<String> values) {
            addCriterion("payment_client_type not in", values, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeBetween(String value1, String value2) {
            addCriterion("payment_client_type between", value1, value2, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotBetween(String value1, String value2) {
            addCriterion("payment_client_type not between", value1, value2, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNull() {
            addCriterion("payment_code is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("payment_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(String value) {
            addCriterion("payment_code =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(String value) {
            addCriterion("payment_code <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(String value) {
            addCriterion("payment_code >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_code >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(String value) {
            addCriterion("payment_code <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(String value) {
            addCriterion("payment_code <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLike(String value) {
            addCriterion("payment_code like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotLike(String value) {
            addCriterion("payment_code not like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<String> values) {
            addCriterion("payment_code in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<String> values) {
            addCriterion("payment_code not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(String value1, String value2) {
            addCriterion("payment_code between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(String value1, String value2) {
            addCriterion("payment_code not between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountIsNull() {
            addCriterion("predeposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountIsNotNull() {
            addCriterion("predeposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount =", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount <>", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_amount >", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount >=", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_amount <", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount <=", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_amount in", values, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_amount not in", values, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_amount between", value1, value2, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_amount not between", value1, value2, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIsNull() {
            addCriterion("receiver_message is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIsNotNull() {
            addCriterion("receiver_message is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageEqualTo(String value) {
            addCriterion("receiver_message =", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotEqualTo(String value) {
            addCriterion("receiver_message <>", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageGreaterThan(String value) {
            addCriterion("receiver_message >", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_message >=", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLessThan(String value) {
            addCriterion("receiver_message <", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLessThanOrEqualTo(String value) {
            addCriterion("receiver_message <=", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLike(String value) {
            addCriterion("receiver_message like", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotLike(String value) {
            addCriterion("receiver_message not like", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIn(List<String> values) {
            addCriterion("receiver_message in", values, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotIn(List<String> values) {
            addCriterion("receiver_message not in", values, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageBetween(String value1, String value2) {
            addCriterion("receiver_message between", value1, value2, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotBetween(String value1, String value2) {
            addCriterion("receiver_message not between", value1, value2, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneIsNull() {
            addCriterion("recharge_phone is null");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneIsNotNull() {
            addCriterion("recharge_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneEqualTo(String value) {
            addCriterion("recharge_phone =", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneNotEqualTo(String value) {
            addCriterion("recharge_phone <>", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneGreaterThan(String value) {
            addCriterion("recharge_phone >", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_phone >=", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneLessThan(String value) {
            addCriterion("recharge_phone <", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneLessThanOrEqualTo(String value) {
            addCriterion("recharge_phone <=", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneLike(String value) {
            addCriterion("recharge_phone like", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneNotLike(String value) {
            addCriterion("recharge_phone not like", value, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneIn(List<String> values) {
            addCriterion("recharge_phone in", values, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneNotIn(List<String> values) {
            addCriterion("recharge_phone not in", values, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneBetween(String value1, String value2) {
            addCriterion("recharge_phone between", value1, value2, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRechargePhoneNotBetween(String value1, String value2) {
            addCriterion("recharge_phone not between", value1, value2, "rechargePhone");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIsNull() {
            addCriterion("shop_commitment_amount is null");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIsNotNull() {
            addCriterion("shop_commitment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount =", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount <>", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountGreaterThan(BigDecimal value) {
            addCriterion("shop_commitment_amount >", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount >=", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountLessThan(BigDecimal value) {
            addCriterion("shop_commitment_amount <", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount <=", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIn(List<BigDecimal> values) {
            addCriterion("shop_commitment_amount in", values, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotIn(List<BigDecimal> values) {
            addCriterion("shop_commitment_amount not in", values, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_commitment_amount between", value1, value2, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_commitment_amount not between", value1, value2, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountIsNull() {
            addCriterion("store_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountIsNotNull() {
            addCriterion("store_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("store_discount_amount =", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_discount_amount <>", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("store_discount_amount >", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_discount_amount >=", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountLessThan(BigDecimal value) {
            addCriterion("store_discount_amount <", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_discount_amount <=", value, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("store_discount_amount in", values, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_discount_amount not in", values, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_discount_amount between", value1, value2, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_discount_amount not between", value1, value2, "storeDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIsNull() {
            addCriterion("recharge_deno is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIsNotNull() {
            addCriterion("recharge_deno is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoEqualTo(String value) {
            addCriterion("recharge_deno =", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotEqualTo(String value) {
            addCriterion("recharge_deno <>", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoGreaterThan(String value) {
            addCriterion("recharge_deno >", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_deno >=", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLessThan(String value) {
            addCriterion("recharge_deno <", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLessThanOrEqualTo(String value) {
            addCriterion("recharge_deno <=", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLike(String value) {
            addCriterion("recharge_deno like", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotLike(String value) {
            addCriterion("recharge_deno not like", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIn(List<String> values) {
            addCriterion("recharge_deno in", values, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotIn(List<String> values) {
            addCriterion("recharge_deno not in", values, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoBetween(String value1, String value2) {
            addCriterion("recharge_deno between", value1, value2, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotBetween(String value1, String value2) {
            addCriterion("recharge_deno not between", value1, value2, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIsNull() {
            addCriterion("recharge_voucher is null");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIsNotNull() {
            addCriterion("recharge_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherEqualTo(String value) {
            addCriterion("recharge_voucher =", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotEqualTo(String value) {
            addCriterion("recharge_voucher <>", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherGreaterThan(String value) {
            addCriterion("recharge_voucher >", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_voucher >=", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLessThan(String value) {
            addCriterion("recharge_voucher <", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLessThanOrEqualTo(String value) {
            addCriterion("recharge_voucher <=", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLike(String value) {
            addCriterion("recharge_voucher like", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotLike(String value) {
            addCriterion("recharge_voucher not like", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIn(List<String> values) {
            addCriterion("recharge_voucher in", values, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotIn(List<String> values) {
            addCriterion("recharge_voucher not in", values, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherBetween(String value1, String value2) {
            addCriterion("recharge_voucher between", value1, value2, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotBetween(String value1, String value2) {
            addCriterion("recharge_voucher not between", value1, value2, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNull() {
            addCriterion("use_state is null");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNotNull() {
            addCriterion("use_state is not null");
            return (Criteria) this;
        }

        public Criteria andUseStateEqualTo(Integer value) {
            addCriterion("use_state =", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotEqualTo(Integer value) {
            addCriterion("use_state <>", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThan(Integer value) {
            addCriterion("use_state >", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_state >=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThan(Integer value) {
            addCriterion("use_state <", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThanOrEqualTo(Integer value) {
            addCriterion("use_state <=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateIn(List<Integer> values) {
            addCriterion("use_state in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotIn(List<Integer> values) {
            addCriterion("use_state not in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateBetween(Integer value1, Integer value2) {
            addCriterion("use_state between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotBetween(Integer value1, Integer value2) {
            addCriterion("use_state not between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNull() {
            addCriterion("voucher_code is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNotNull() {
            addCriterion("voucher_code is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeEqualTo(String value) {
            addCriterion("voucher_code =", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotEqualTo(String value) {
            addCriterion("voucher_code <>", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThan(String value) {
            addCriterion("voucher_code >", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_code >=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThan(String value) {
            addCriterion("voucher_code <", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThanOrEqualTo(String value) {
            addCriterion("voucher_code <=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLike(String value) {
            addCriterion("voucher_code like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotLike(String value) {
            addCriterion("voucher_code not like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIn(List<String> values) {
            addCriterion("voucher_code in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotIn(List<String> values) {
            addCriterion("voucher_code not in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeBetween(String value1, String value2) {
            addCriterion("voucher_code between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotBetween(String value1, String value2) {
            addCriterion("voucher_code not between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNull() {
            addCriterion("voucher_price is null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNotNull() {
            addCriterion("voucher_price is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceEqualTo(BigDecimal value) {
            addCriterion("voucher_price =", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotEqualTo(BigDecimal value) {
            addCriterion("voucher_price <>", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThan(BigDecimal value) {
            addCriterion("voucher_price >", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_price >=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThan(BigDecimal value) {
            addCriterion("voucher_price <", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("voucher_price <=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIn(List<BigDecimal> values) {
            addCriterion("voucher_price in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotIn(List<BigDecimal> values) {
            addCriterion("voucher_price not in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_price between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucher_price not between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNull() {
            addCriterion("push_state is null");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNotNull() {
            addCriterion("push_state is not null");
            return (Criteria) this;
        }

        public Criteria andPushStateEqualTo(Integer value) {
            addCriterion("push_state =", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotEqualTo(Integer value) {
            addCriterion("push_state <>", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThan(Integer value) {
            addCriterion("push_state >", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_state >=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThan(Integer value) {
            addCriterion("push_state <", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThanOrEqualTo(Integer value) {
            addCriterion("push_state <=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateIn(List<Integer> values) {
            addCriterion("push_state in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotIn(List<Integer> values) {
            addCriterion("push_state not in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateBetween(Integer value1, Integer value2) {
            addCriterion("push_state between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotBetween(Integer value1, Integer value2) {
            addCriterion("push_state not between", value1, value2, "pushState");
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