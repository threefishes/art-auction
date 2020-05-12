package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributionOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributionOrdersExample() {
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

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Integer value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Integer value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Integer value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Integer value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Integer value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Integer> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Integer> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
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

        public Criteria andDistributionOrdersTypeIsNull() {
            addCriterion("distribution_orders_type is null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeIsNotNull() {
            addCriterion("distribution_orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeEqualTo(Integer value) {
            addCriterion("distribution_orders_type =", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeNotEqualTo(Integer value) {
            addCriterion("distribution_orders_type <>", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeGreaterThan(Integer value) {
            addCriterion("distribution_orders_type >", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_type >=", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeLessThan(Integer value) {
            addCriterion("distribution_orders_type <", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_type <=", value, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeIn(List<Integer> values) {
            addCriterion("distribution_orders_type in", values, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeNotIn(List<Integer> values) {
            addCriterion("distribution_orders_type not in", values, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_type between", value1, value2, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_type not between", value1, value2, "distributionOrdersType");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayIsNull() {
            addCriterion("distribution_store_pay is null");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayIsNotNull() {
            addCriterion("distribution_store_pay is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayEqualTo(Integer value) {
            addCriterion("distribution_store_pay =", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayNotEqualTo(Integer value) {
            addCriterion("distribution_store_pay <>", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayGreaterThan(Integer value) {
            addCriterion("distribution_store_pay >", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_store_pay >=", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayLessThan(Integer value) {
            addCriterion("distribution_store_pay <", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_store_pay <=", value, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayIn(List<Integer> values) {
            addCriterion("distribution_store_pay in", values, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayNotIn(List<Integer> values) {
            addCriterion("distribution_store_pay not in", values, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayBetween(Integer value1, Integer value2) {
            addCriterion("distribution_store_pay between", value1, value2, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_store_pay not between", value1, value2, "distributionStorePay");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeIsNull() {
            addCriterion("distribution_store_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeIsNotNull() {
            addCriterion("distribution_store_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeEqualTo(Date value) {
            addCriterion("distribution_store_pay_time =", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeNotEqualTo(Date value) {
            addCriterion("distribution_store_pay_time <>", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeGreaterThan(Date value) {
            addCriterion("distribution_store_pay_time >", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_store_pay_time >=", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeLessThan(Date value) {
            addCriterion("distribution_store_pay_time <", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_store_pay_time <=", value, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeIn(List<Date> values) {
            addCriterion("distribution_store_pay_time in", values, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeNotIn(List<Date> values) {
            addCriterion("distribution_store_pay_time not in", values, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_store_pay_time between", value1, value2, "distributionStorePayTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStorePayTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_store_pay_time not between", value1, value2, "distributionStorePayTime");
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

        public Criteria andOrdersFinishTimeIsNull() {
            addCriterion("orders_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeIsNotNull() {
            addCriterion("orders_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeEqualTo(Date value) {
            addCriterion("orders_finish_time =", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeNotEqualTo(Date value) {
            addCriterion("orders_finish_time <>", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeGreaterThan(Date value) {
            addCriterion("orders_finish_time >", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_finish_time >=", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeLessThan(Date value) {
            addCriterion("orders_finish_time <", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("orders_finish_time <=", value, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeIn(List<Date> values) {
            addCriterion("orders_finish_time in", values, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeNotIn(List<Date> values) {
            addCriterion("orders_finish_time not in", values, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeBetween(Date value1, Date value2) {
            addCriterion("orders_finish_time between", value1, value2, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("orders_finish_time not between", value1, value2, "ordersFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIsNull() {
            addCriterion("orders_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIsNotNull() {
            addCriterion("orders_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdEqualTo(Integer value) {
            addCriterion("orders_goods_id =", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotEqualTo(Integer value) {
            addCriterion("orders_goods_id <>", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThan(Integer value) {
            addCriterion("orders_goods_id >", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id >=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThan(Integer value) {
            addCriterion("orders_goods_id <", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id <=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIn(List<Integer> values) {
            addCriterion("orders_goods_id in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotIn(List<Integer> values) {
            addCriterion("orders_goods_id not in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id between", value1, value2, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id not between", value1, value2, "ordersGoodsId");
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

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Integer value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Integer value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Integer value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Integer value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Integer> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Integer> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpIsNull() {
            addCriterion("is_store_up is null");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpIsNotNull() {
            addCriterion("is_store_up is not null");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpEqualTo(Integer value) {
            addCriterion("is_store_up =", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotEqualTo(Integer value) {
            addCriterion("is_store_up <>", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpGreaterThan(Integer value) {
            addCriterion("is_store_up >", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_store_up >=", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpLessThan(Integer value) {
            addCriterion("is_store_up <", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpLessThanOrEqualTo(Integer value) {
            addCriterion("is_store_up <=", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpIn(List<Integer> values) {
            addCriterion("is_store_up in", values, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotIn(List<Integer> values) {
            addCriterion("is_store_up not in", values, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpBetween(Integer value1, Integer value2) {
            addCriterion("is_store_up between", value1, value2, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotBetween(Integer value1, Integer value2) {
            addCriterion("is_store_up not between", value1, value2, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsAwardIsNull() {
            addCriterion("is_award is null");
            return (Criteria) this;
        }

        public Criteria andIsAwardIsNotNull() {
            addCriterion("is_award is not null");
            return (Criteria) this;
        }

        public Criteria andIsAwardEqualTo(Integer value) {
            addCriterion("is_award =", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardNotEqualTo(Integer value) {
            addCriterion("is_award <>", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardGreaterThan(Integer value) {
            addCriterion("is_award >", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_award >=", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardLessThan(Integer value) {
            addCriterion("is_award <", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardLessThanOrEqualTo(Integer value) {
            addCriterion("is_award <=", value, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardIn(List<Integer> values) {
            addCriterion("is_award in", values, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardNotIn(List<Integer> values) {
            addCriterion("is_award not in", values, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardBetween(Integer value1, Integer value2) {
            addCriterion("is_award between", value1, value2, "isAward");
            return (Criteria) this;
        }

        public Criteria andIsAwardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_award not between", value1, value2, "isAward");
            return (Criteria) this;
        }

        public Criteria andDistributorRankIsNull() {
            addCriterion("distributor_rank is null");
            return (Criteria) this;
        }

        public Criteria andDistributorRankIsNotNull() {
            addCriterion("distributor_rank is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorRankEqualTo(Integer value) {
            addCriterion("distributor_rank =", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankNotEqualTo(Integer value) {
            addCriterion("distributor_rank <>", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankGreaterThan(Integer value) {
            addCriterion("distributor_rank >", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_rank >=", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankLessThan(Integer value) {
            addCriterion("distributor_rank <", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_rank <=", value, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankIn(List<Integer> values) {
            addCriterion("distributor_rank in", values, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankNotIn(List<Integer> values) {
            addCriterion("distributor_rank not in", values, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankBetween(Integer value1, Integer value2) {
            addCriterion("distributor_rank between", value1, value2, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorRankNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_rank not between", value1, value2, "distributorRank");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountIsNull() {
            addCriterion("distributor_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountIsNotNull() {
            addCriterion("distributor_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("distributor_commission_amount =", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("distributor_commission_amount <>", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("distributor_commission_amount >", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distributor_commission_amount >=", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountLessThan(BigDecimal value) {
            addCriterion("distributor_commission_amount <", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distributor_commission_amount <=", value, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("distributor_commission_amount in", values, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("distributor_commission_amount not in", values, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distributor_commission_amount between", value1, value2, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distributor_commission_amount not between", value1, value2, "distributorCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountIsNull() {
            addCriterion("charge_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountIsNotNull() {
            addCriterion("charge_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("charge_commission_amount =", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("charge_commission_amount <>", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("charge_commission_amount >", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_commission_amount >=", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountLessThan(BigDecimal value) {
            addCriterion("charge_commission_amount <", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_commission_amount <=", value, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("charge_commission_amount in", values, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("charge_commission_amount not in", values, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_commission_amount between", value1, value2, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andChargeCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_commission_amount not between", value1, value2, "chargeCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountIsNull() {
            addCriterion("manager_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountIsNotNull() {
            addCriterion("manager_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("manager_commission_amount =", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("manager_commission_amount <>", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("manager_commission_amount >", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manager_commission_amount >=", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountLessThan(BigDecimal value) {
            addCriterion("manager_commission_amount <", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manager_commission_amount <=", value, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("manager_commission_amount in", values, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("manager_commission_amount not in", values, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manager_commission_amount between", value1, value2, "managerCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andManagerCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manager_commission_amount not between", value1, value2, "managerCommissionAmount");
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