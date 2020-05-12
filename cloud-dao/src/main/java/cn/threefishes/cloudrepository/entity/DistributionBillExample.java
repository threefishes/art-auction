package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributionBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributionBillExample() {
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

        public Criteria andDistributionBillIdIsNull() {
            addCriterion("distribution_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdIsNotNull() {
            addCriterion("distribution_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdEqualTo(Integer value) {
            addCriterion("distribution_bill_id =", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdNotEqualTo(Integer value) {
            addCriterion("distribution_bill_id <>", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdGreaterThan(Integer value) {
            addCriterion("distribution_bill_id >", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_bill_id >=", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdLessThan(Integer value) {
            addCriterion("distribution_bill_id <", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_bill_id <=", value, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdIn(List<Integer> values) {
            addCriterion("distribution_bill_id in", values, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdNotIn(List<Integer> values) {
            addCriterion("distribution_bill_id not in", values, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdBetween(Integer value1, Integer value2) {
            addCriterion("distribution_bill_id between", value1, value2, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_bill_id not between", value1, value2, "distributionBillId");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnIsNull() {
            addCriterion("distribution_bill_sn is null");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnIsNotNull() {
            addCriterion("distribution_bill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnEqualTo(Integer value) {
            addCriterion("distribution_bill_sn =", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnNotEqualTo(Integer value) {
            addCriterion("distribution_bill_sn <>", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnGreaterThan(Integer value) {
            addCriterion("distribution_bill_sn >", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_bill_sn >=", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnLessThan(Integer value) {
            addCriterion("distribution_bill_sn <", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_bill_sn <=", value, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnIn(List<Integer> values) {
            addCriterion("distribution_bill_sn in", values, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnNotIn(List<Integer> values) {
            addCriterion("distribution_bill_sn not in", values, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnBetween(Integer value1, Integer value2) {
            addCriterion("distribution_bill_sn between", value1, value2, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionBillSnNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_bill_sn not between", value1, value2, "distributionBillSn");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountIsNull() {
            addCriterion("distribution_orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountIsNotNull() {
            addCriterion("distribution_orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountEqualTo(BigDecimal value) {
            addCriterion("distribution_orders_amount =", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountNotEqualTo(BigDecimal value) {
            addCriterion("distribution_orders_amount <>", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountGreaterThan(BigDecimal value) {
            addCriterion("distribution_orders_amount >", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_orders_amount >=", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountLessThan(BigDecimal value) {
            addCriterion("distribution_orders_amount <", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_orders_amount <=", value, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountIn(List<BigDecimal> values) {
            addCriterion("distribution_orders_amount in", values, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountNotIn(List<BigDecimal> values) {
            addCriterion("distribution_orders_amount not in", values, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_orders_amount between", value1, value2, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_orders_amount not between", value1, value2, "distributionOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeIsNull() {
            addCriterion("distribution_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeIsNotNull() {
            addCriterion("distribution_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeEqualTo(Date value) {
            addCriterion("distribution_create_time =", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeNotEqualTo(Date value) {
            addCriterion("distribution_create_time <>", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeGreaterThan(Date value) {
            addCriterion("distribution_create_time >", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_create_time >=", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeLessThan(Date value) {
            addCriterion("distribution_create_time <", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_create_time <=", value, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeIn(List<Date> values) {
            addCriterion("distribution_create_time in", values, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeNotIn(List<Date> values) {
            addCriterion("distribution_create_time not in", values, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_create_time between", value1, value2, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_create_time not between", value1, value2, "distributionCreateTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeIsNull() {
            addCriterion("distribution_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeIsNotNull() {
            addCriterion("distribution_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeEqualTo(Date value) {
            addCriterion("distribution_end_time =", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeNotEqualTo(Date value) {
            addCriterion("distribution_end_time <>", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeGreaterThan(Date value) {
            addCriterion("distribution_end_time >", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_end_time >=", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeLessThan(Date value) {
            addCriterion("distribution_end_time <", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_end_time <=", value, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeIn(List<Date> values) {
            addCriterion("distribution_end_time in", values, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeNotIn(List<Date> values) {
            addCriterion("distribution_end_time not in", values, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_end_time between", value1, value2, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_end_time not between", value1, value2, "distributionEndTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeIsNull() {
            addCriterion("distribution_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeIsNotNull() {
            addCriterion("distribution_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeEqualTo(Date value) {
            addCriterion("distribution_start_time =", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeNotEqualTo(Date value) {
            addCriterion("distribution_start_time <>", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeGreaterThan(Date value) {
            addCriterion("distribution_start_time >", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_start_time >=", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeLessThan(Date value) {
            addCriterion("distribution_start_time <", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_start_time <=", value, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeIn(List<Date> values) {
            addCriterion("distribution_start_time in", values, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeNotIn(List<Date> values) {
            addCriterion("distribution_start_time not in", values, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_start_time between", value1, value2, "distributionStartTime");
            return (Criteria) this;
        }

        public Criteria andDistributionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_start_time not between", value1, value2, "distributionStartTime");
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

        public Criteria andOpenShopAmountIsNull() {
            addCriterion("open_shop_amount is null");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountIsNotNull() {
            addCriterion("open_shop_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount =", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount <>", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountGreaterThan(BigDecimal value) {
            addCriterion("open_shop_amount >", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount >=", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountLessThan(BigDecimal value) {
            addCriterion("open_shop_amount <", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount <=", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountIn(List<BigDecimal> values) {
            addCriterion("open_shop_amount in", values, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotIn(List<BigDecimal> values) {
            addCriterion("open_shop_amount not in", values, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_shop_amount between", value1, value2, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_shop_amount not between", value1, value2, "openShopAmount");
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