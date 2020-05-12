package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributorStatsLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributorStatsLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNull() {
            addCriterion("distributor_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNotNull() {
            addCriterion("distributor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdEqualTo(Integer value) {
            addCriterion("distributor_id =", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotEqualTo(Integer value) {
            addCriterion("distributor_id <>", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThan(Integer value) {
            addCriterion("distributor_id >", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_id >=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThan(Integer value) {
            addCriterion("distributor_id <", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_id <=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIn(List<Integer> values) {
            addCriterion("distributor_id in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotIn(List<Integer> values) {
            addCriterion("distributor_id not in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id not between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNull() {
            addCriterion("trigger_type is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNotNull() {
            addCriterion("trigger_type is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeEqualTo(Integer value) {
            addCriterion("trigger_type =", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotEqualTo(Integer value) {
            addCriterion("trigger_type <>", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThan(Integer value) {
            addCriterion("trigger_type >", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trigger_type >=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThan(Integer value) {
            addCriterion("trigger_type <", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trigger_type <=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIn(List<Integer> values) {
            addCriterion("trigger_type in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotIn(List<Integer> values) {
            addCriterion("trigger_type not in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeBetween(Integer value1, Integer value2) {
            addCriterion("trigger_type between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trigger_type not between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateIsNull() {
            addCriterion("trigger_type_state is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateIsNotNull() {
            addCriterion("trigger_type_state is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateEqualTo(Integer value) {
            addCriterion("trigger_type_state =", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateNotEqualTo(Integer value) {
            addCriterion("trigger_type_state <>", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateGreaterThan(Integer value) {
            addCriterion("trigger_type_state >", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("trigger_type_state >=", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateLessThan(Integer value) {
            addCriterion("trigger_type_state <", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateLessThanOrEqualTo(Integer value) {
            addCriterion("trigger_type_state <=", value, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateIn(List<Integer> values) {
            addCriterion("trigger_type_state in", values, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateNotIn(List<Integer> values) {
            addCriterion("trigger_type_state not in", values, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateBetween(Integer value1, Integer value2) {
            addCriterion("trigger_type_state between", value1, value2, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("trigger_type_state not between", value1, value2, "triggerTypeState");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdIsNull() {
            addCriterion("distribution_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdIsNotNull() {
            addCriterion("distribution_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdEqualTo(Integer value) {
            addCriterion("distribution_orders_id =", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdNotEqualTo(Integer value) {
            addCriterion("distribution_orders_id <>", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdGreaterThan(Integer value) {
            addCriterion("distribution_orders_id >", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_id >=", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdLessThan(Integer value) {
            addCriterion("distribution_orders_id <", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_id <=", value, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdIn(List<Integer> values) {
            addCriterion("distribution_orders_id in", values, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdNotIn(List<Integer> values) {
            addCriterion("distribution_orders_id not in", values, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_id between", value1, value2, "distributionOrdersId");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_id not between", value1, value2, "distributionOrdersId");
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

        public Criteria andVisitorLogIdIsNull() {
            addCriterion("visitor_log_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdIsNotNull() {
            addCriterion("visitor_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdEqualTo(Integer value) {
            addCriterion("visitor_log_id =", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdNotEqualTo(Integer value) {
            addCriterion("visitor_log_id <>", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdGreaterThan(Integer value) {
            addCriterion("visitor_log_id >", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitor_log_id >=", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdLessThan(Integer value) {
            addCriterion("visitor_log_id <", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("visitor_log_id <=", value, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdIn(List<Integer> values) {
            addCriterion("visitor_log_id in", values, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdNotIn(List<Integer> values) {
            addCriterion("visitor_log_id not in", values, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdBetween(Integer value1, Integer value2) {
            addCriterion("visitor_log_id between", value1, value2, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andVisitorLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visitor_log_id not between", value1, value2, "visitorLogId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
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

        public Criteria andAmountChangeIsNull() {
            addCriterion("amount_change is null");
            return (Criteria) this;
        }

        public Criteria andAmountChangeIsNotNull() {
            addCriterion("amount_change is not null");
            return (Criteria) this;
        }

        public Criteria andAmountChangeEqualTo(String value) {
            addCriterion("amount_change =", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeNotEqualTo(String value) {
            addCriterion("amount_change <>", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeGreaterThan(String value) {
            addCriterion("amount_change >", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeGreaterThanOrEqualTo(String value) {
            addCriterion("amount_change >=", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeLessThan(String value) {
            addCriterion("amount_change <", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeLessThanOrEqualTo(String value) {
            addCriterion("amount_change <=", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeLike(String value) {
            addCriterion("amount_change like", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeNotLike(String value) {
            addCriterion("amount_change not like", value, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeIn(List<String> values) {
            addCriterion("amount_change in", values, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeNotIn(List<String> values) {
            addCriterion("amount_change not in", values, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeBetween(String value1, String value2) {
            addCriterion("amount_change between", value1, value2, "amountChange");
            return (Criteria) this;
        }

        public Criteria andAmountChangeNotBetween(String value1, String value2) {
            addCriterion("amount_change not between", value1, value2, "amountChange");
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