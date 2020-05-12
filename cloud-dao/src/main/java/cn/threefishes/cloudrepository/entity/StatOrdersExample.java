package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatOrdersExample() {
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

        public Criteria andAutoReceiveTimeIsNull() {
            addCriterion("auto_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeIsNotNull() {
            addCriterion("auto_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeEqualTo(Date value) {
            addCriterion("auto_receive_time =", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeNotEqualTo(Date value) {
            addCriterion("auto_receive_time <>", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeGreaterThan(Date value) {
            addCriterion("auto_receive_time >", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auto_receive_time >=", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeLessThan(Date value) {
            addCriterion("auto_receive_time <", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("auto_receive_time <=", value, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeIn(List<Date> values) {
            addCriterion("auto_receive_time in", values, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeNotIn(List<Date> values) {
            addCriterion("auto_receive_time not in", values, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("auto_receive_time between", value1, value2, "autoReceiveTime");
            return (Criteria) this;
        }

        public Criteria andAutoReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("auto_receive_time not between", value1, value2, "autoReceiveTime");
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

        public Criteria andCommissionAmountIsNull() {
            addCriterion("commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNotNull() {
            addCriterion("commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("commission_amount =", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("commission_amount <>", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("commission_amount >", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_amount >=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThan(BigDecimal value) {
            addCriterion("commission_amount <", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_amount <=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("commission_amount in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("commission_amount not in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_amount between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_amount not between", value1, value2, "commissionAmount");
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

        public Criteria andDelayReceiveStateIsNull() {
            addCriterion("delay_receive_state is null");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateIsNotNull() {
            addCriterion("delay_receive_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateEqualTo(Integer value) {
            addCriterion("delay_receive_state =", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateNotEqualTo(Integer value) {
            addCriterion("delay_receive_state <>", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateGreaterThan(Integer value) {
            addCriterion("delay_receive_state >", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_receive_state >=", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateLessThan(Integer value) {
            addCriterion("delay_receive_state <", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateLessThanOrEqualTo(Integer value) {
            addCriterion("delay_receive_state <=", value, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateIn(List<Integer> values) {
            addCriterion("delay_receive_state in", values, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateNotIn(List<Integer> values) {
            addCriterion("delay_receive_state not in", values, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateBetween(Integer value1, Integer value2) {
            addCriterion("delay_receive_state between", value1, value2, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andDelayReceiveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_receive_state not between", value1, value2, "delayReceiveState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateIsNull() {
            addCriterion("evaluation_append_state is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateIsNotNull() {
            addCriterion("evaluation_append_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateEqualTo(Integer value) {
            addCriterion("evaluation_append_state =", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateNotEqualTo(Integer value) {
            addCriterion("evaluation_append_state <>", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateGreaterThan(Integer value) {
            addCriterion("evaluation_append_state >", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_append_state >=", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateLessThan(Integer value) {
            addCriterion("evaluation_append_state <", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_append_state <=", value, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateIn(List<Integer> values) {
            addCriterion("evaluation_append_state in", values, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateNotIn(List<Integer> values) {
            addCriterion("evaluation_append_state not in", values, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_append_state between", value1, value2, "evaluationAppendState");
            return (Criteria) this;
        }

        public Criteria andEvaluationAppendStateNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_append_state not between", value1, value2, "evaluationAppendState");
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

        public Criteria andFreightAmountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(BigDecimal value) {
            addCriterion("freight_amount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("freight_amount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("freight_amount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(BigDecimal value) {
            addCriterion("freight_amount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<BigDecimal> values) {
            addCriterion("freight_amount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("freight_amount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount not between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIsNull() {
            addCriterion("is_free_freight is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIsNotNull() {
            addCriterion("is_free_freight is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightEqualTo(Integer value) {
            addCriterion("is_free_freight =", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotEqualTo(Integer value) {
            addCriterion("is_free_freight <>", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightGreaterThan(Integer value) {
            addCriterion("is_free_freight >", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free_freight >=", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightLessThan(Integer value) {
            addCriterion("is_free_freight <", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightLessThanOrEqualTo(Integer value) {
            addCriterion("is_free_freight <=", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIn(List<Integer> values) {
            addCriterion("is_free_freight in", values, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotIn(List<Integer> values) {
            addCriterion("is_free_freight not in", values, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightBetween(Integer value1, Integer value2) {
            addCriterion("is_free_freight between", value1, value2, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free_freight not between", value1, value2, "isFreeFreight");
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

        public Criteria andLockStateIsNull() {
            addCriterion("lock_state is null");
            return (Criteria) this;
        }

        public Criteria andLockStateIsNotNull() {
            addCriterion("lock_state is not null");
            return (Criteria) this;
        }

        public Criteria andLockStateEqualTo(Integer value) {
            addCriterion("lock_state =", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotEqualTo(Integer value) {
            addCriterion("lock_state <>", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThan(Integer value) {
            addCriterion("lock_state >", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_state >=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThan(Integer value) {
            addCriterion("lock_state <", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThanOrEqualTo(Integer value) {
            addCriterion("lock_state <=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateIn(List<Integer> values) {
            addCriterion("lock_state in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotIn(List<Integer> values) {
            addCriterion("lock_state not in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateBetween(Integer value1, Integer value2) {
            addCriterion("lock_state between", value1, value2, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_state not between", value1, value2, "lockState");
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

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
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

        public Criteria andPaymentTypeCodeIsNull() {
            addCriterion("payment_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeIsNotNull() {
            addCriterion("payment_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeEqualTo(String value) {
            addCriterion("payment_type_code =", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeNotEqualTo(String value) {
            addCriterion("payment_type_code <>", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeGreaterThan(String value) {
            addCriterion("payment_type_code >", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type_code >=", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeLessThan(String value) {
            addCriterion("payment_type_code <", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("payment_type_code <=", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeLike(String value) {
            addCriterion("payment_type_code like", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeNotLike(String value) {
            addCriterion("payment_type_code not like", value, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeIn(List<String> values) {
            addCriterion("payment_type_code in", values, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeNotIn(List<String> values) {
            addCriterion("payment_type_code not in", values, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeBetween(String value1, String value2) {
            addCriterion("payment_type_code between", value1, value2, "paymentTypeCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeCodeNotBetween(String value1, String value2) {
            addCriterion("payment_type_code not between", value1, value2, "paymentTypeCode");
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

        public Criteria andReciverAddressIsNull() {
            addCriterion("reciver_address is null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIsNotNull() {
            addCriterion("reciver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressEqualTo(String value) {
            addCriterion("reciver_address =", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotEqualTo(String value) {
            addCriterion("reciver_address <>", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThan(String value) {
            addCriterion("reciver_address >", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_address >=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThan(String value) {
            addCriterion("reciver_address <", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThanOrEqualTo(String value) {
            addCriterion("reciver_address <=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLike(String value) {
            addCriterion("reciver_address like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotLike(String value) {
            addCriterion("reciver_address not like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIn(List<String> values) {
            addCriterion("reciver_address in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotIn(List<String> values) {
            addCriterion("reciver_address not in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressBetween(String value1, String value2) {
            addCriterion("reciver_address between", value1, value2, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotBetween(String value1, String value2) {
            addCriterion("reciver_address not between", value1, value2, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1IsNull() {
            addCriterion("receiver_area_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1IsNotNull() {
            addCriterion("receiver_area_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1EqualTo(Integer value) {
            addCriterion("receiver_area_id_1 =", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 <>", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1GreaterThan(Integer value) {
            addCriterion("receiver_area_id_1 >", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 >=", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1LessThan(Integer value) {
            addCriterion("receiver_area_id_1 <", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 <=", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1In(List<Integer> values) {
            addCriterion("receiver_area_id_1 in", values, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_1 not in", values, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_1 between", value1, value2, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_1 not between", value1, value2, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2IsNull() {
            addCriterion("receiver_area_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2IsNotNull() {
            addCriterion("receiver_area_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2EqualTo(Integer value) {
            addCriterion("receiver_area_id_2 =", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 <>", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2GreaterThan(Integer value) {
            addCriterion("receiver_area_id_2 >", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 >=", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2LessThan(Integer value) {
            addCriterion("receiver_area_id_2 <", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 <=", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2In(List<Integer> values) {
            addCriterion("receiver_area_id_2 in", values, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_2 not in", values, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_2 between", value1, value2, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_2 not between", value1, value2, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3IsNull() {
            addCriterion("receiver_area_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3IsNotNull() {
            addCriterion("receiver_area_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3EqualTo(Integer value) {
            addCriterion("receiver_area_id_3 =", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 <>", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3GreaterThan(Integer value) {
            addCriterion("receiver_area_id_3 >", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 >=", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3LessThan(Integer value) {
            addCriterion("receiver_area_id_3 <", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 <=", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3In(List<Integer> values) {
            addCriterion("receiver_area_id_3 in", values, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_3 not in", values, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_3 between", value1, value2, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_3 not between", value1, value2, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4IsNull() {
            addCriterion("receiver_area_id_4 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4IsNotNull() {
            addCriterion("receiver_area_id_4 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4EqualTo(Integer value) {
            addCriterion("receiver_area_id_4 =", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 <>", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4GreaterThan(Integer value) {
            addCriterion("receiver_area_id_4 >", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 >=", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4LessThan(Integer value) {
            addCriterion("receiver_area_id_4 <", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 <=", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4In(List<Integer> values) {
            addCriterion("receiver_area_id_4 in", values, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_4 not in", values, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_4 between", value1, value2, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_4 not between", value1, value2, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIsNull() {
            addCriterion("receiver_area_info is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIsNotNull() {
            addCriterion("receiver_area_info is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoEqualTo(String value) {
            addCriterion("receiver_area_info =", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotEqualTo(String value) {
            addCriterion("receiver_area_info <>", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoGreaterThan(String value) {
            addCriterion("receiver_area_info >", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area_info >=", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLessThan(String value) {
            addCriterion("receiver_area_info <", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("receiver_area_info <=", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLike(String value) {
            addCriterion("receiver_area_info like", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotLike(String value) {
            addCriterion("receiver_area_info not like", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIn(List<String> values) {
            addCriterion("receiver_area_info in", values, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotIn(List<String> values) {
            addCriterion("receiver_area_info not in", values, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoBetween(String value1, String value2) {
            addCriterion("receiver_area_info between", value1, value2, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotBetween(String value1, String value2) {
            addCriterion("receiver_area_info not between", value1, value2, "receiverAreaInfo");
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

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
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

        public Criteria andRefundStateIsNull() {
            addCriterion("refund_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(Integer value) {
            addCriterion("refund_state =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(Integer value) {
            addCriterion("refund_state <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(Integer value) {
            addCriterion("refund_state >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_state >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(Integer value) {
            addCriterion("refund_state <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(Integer value) {
            addCriterion("refund_state <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<Integer> values) {
            addCriterion("refund_state in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<Integer> values) {
            addCriterion("refund_state not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(Integer value1, Integer value2) {
            addCriterion("refund_state between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_state not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNull() {
            addCriterion("ship_code is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("ship_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("ship_code =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("ship_code <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("ship_code >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_code >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("ship_code <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("ship_code <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("ship_code like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("ship_code not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("ship_code in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("ship_code not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("ship_code between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("ship_code not between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNull() {
            addCriterion("ship_note is null");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNotNull() {
            addCriterion("ship_note is not null");
            return (Criteria) this;
        }

        public Criteria andShipNoteEqualTo(String value) {
            addCriterion("ship_note =", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotEqualTo(String value) {
            addCriterion("ship_note <>", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThan(String value) {
            addCriterion("ship_note >", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThanOrEqualTo(String value) {
            addCriterion("ship_note >=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThan(String value) {
            addCriterion("ship_note <", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThanOrEqualTo(String value) {
            addCriterion("ship_note <=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLike(String value) {
            addCriterion("ship_note like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotLike(String value) {
            addCriterion("ship_note not like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteIn(List<String> values) {
            addCriterion("ship_note in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotIn(List<String> values) {
            addCriterion("ship_note not in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteBetween(String value1, String value2) {
            addCriterion("ship_note between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotBetween(String value1, String value2) {
            addCriterion("ship_note not between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNull() {
            addCriterion("ship_sn is null");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNotNull() {
            addCriterion("ship_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShipSnEqualTo(String value) {
            addCriterion("ship_sn =", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotEqualTo(String value) {
            addCriterion("ship_sn <>", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThan(String value) {
            addCriterion("ship_sn >", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThanOrEqualTo(String value) {
            addCriterion("ship_sn >=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThan(String value) {
            addCriterion("ship_sn <", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThanOrEqualTo(String value) {
            addCriterion("ship_sn <=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLike(String value) {
            addCriterion("ship_sn like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotLike(String value) {
            addCriterion("ship_sn not like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnIn(List<String> values) {
            addCriterion("ship_sn in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotIn(List<String> values) {
            addCriterion("ship_sn not in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnBetween(String value1, String value2) {
            addCriterion("ship_sn between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotBetween(String value1, String value2) {
            addCriterion("ship_sn not between", value1, value2, "shipSn");
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