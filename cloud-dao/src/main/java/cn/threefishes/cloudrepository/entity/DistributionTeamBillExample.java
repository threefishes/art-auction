package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributionTeamBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributionTeamBillExample() {
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

        public Criteria andTeamBillIdIsNull() {
            addCriterion("team_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdIsNotNull() {
            addCriterion("team_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdEqualTo(Integer value) {
            addCriterion("team_bill_id =", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdNotEqualTo(Integer value) {
            addCriterion("team_bill_id <>", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdGreaterThan(Integer value) {
            addCriterion("team_bill_id >", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_bill_id >=", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdLessThan(Integer value) {
            addCriterion("team_bill_id <", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_bill_id <=", value, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdIn(List<Integer> values) {
            addCriterion("team_bill_id in", values, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdNotIn(List<Integer> values) {
            addCriterion("team_bill_id not in", values, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdBetween(Integer value1, Integer value2) {
            addCriterion("team_bill_id between", value1, value2, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_bill_id not between", value1, value2, "teamBillId");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnIsNull() {
            addCriterion("team_bill_sn is null");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnIsNotNull() {
            addCriterion("team_bill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnEqualTo(Integer value) {
            addCriterion("team_bill_sn =", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnNotEqualTo(Integer value) {
            addCriterion("team_bill_sn <>", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnGreaterThan(Integer value) {
            addCriterion("team_bill_sn >", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_bill_sn >=", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnLessThan(Integer value) {
            addCriterion("team_bill_sn <", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnLessThanOrEqualTo(Integer value) {
            addCriterion("team_bill_sn <=", value, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnIn(List<Integer> values) {
            addCriterion("team_bill_sn in", values, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnNotIn(List<Integer> values) {
            addCriterion("team_bill_sn not in", values, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnBetween(Integer value1, Integer value2) {
            addCriterion("team_bill_sn between", value1, value2, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamBillSnNotBetween(Integer value1, Integer value2) {
            addCriterion("team_bill_sn not between", value1, value2, "teamBillSn");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountIsNull() {
            addCriterion("team_orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountIsNotNull() {
            addCriterion("team_orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountEqualTo(BigDecimal value) {
            addCriterion("team_orders_amount =", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountNotEqualTo(BigDecimal value) {
            addCriterion("team_orders_amount <>", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountGreaterThan(BigDecimal value) {
            addCriterion("team_orders_amount >", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_orders_amount >=", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountLessThan(BigDecimal value) {
            addCriterion("team_orders_amount <", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_orders_amount <=", value, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountIn(List<BigDecimal> values) {
            addCriterion("team_orders_amount in", values, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountNotIn(List<BigDecimal> values) {
            addCriterion("team_orders_amount not in", values, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_orders_amount between", value1, value2, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOrdersAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_orders_amount not between", value1, value2, "teamOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIsNull() {
            addCriterion("team_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIsNotNull() {
            addCriterion("team_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeEqualTo(Date value) {
            addCriterion("team_create_time =", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotEqualTo(Date value) {
            addCriterion("team_create_time <>", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeGreaterThan(Date value) {
            addCriterion("team_create_time >", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_create_time >=", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeLessThan(Date value) {
            addCriterion("team_create_time <", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_create_time <=", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIn(List<Date> values) {
            addCriterion("team_create_time in", values, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotIn(List<Date> values) {
            addCriterion("team_create_time not in", values, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeBetween(Date value1, Date value2) {
            addCriterion("team_create_time between", value1, value2, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_create_time not between", value1, value2, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeIsNull() {
            addCriterion("team_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeIsNotNull() {
            addCriterion("team_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeEqualTo(Date value) {
            addCriterion("team_end_time =", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeNotEqualTo(Date value) {
            addCriterion("team_end_time <>", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeGreaterThan(Date value) {
            addCriterion("team_end_time >", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_end_time >=", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeLessThan(Date value) {
            addCriterion("team_end_time <", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_end_time <=", value, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeIn(List<Date> values) {
            addCriterion("team_end_time in", values, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeNotIn(List<Date> values) {
            addCriterion("team_end_time not in", values, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeBetween(Date value1, Date value2) {
            addCriterion("team_end_time between", value1, value2, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_end_time not between", value1, value2, "teamEndTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeIsNull() {
            addCriterion("team_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeIsNotNull() {
            addCriterion("team_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeEqualTo(Date value) {
            addCriterion("team_start_time =", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeNotEqualTo(Date value) {
            addCriterion("team_start_time <>", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeGreaterThan(Date value) {
            addCriterion("team_start_time >", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_start_time >=", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeLessThan(Date value) {
            addCriterion("team_start_time <", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_start_time <=", value, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeIn(List<Date> values) {
            addCriterion("team_start_time in", values, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeNotIn(List<Date> values) {
            addCriterion("team_start_time not in", values, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeBetween(Date value1, Date value2) {
            addCriterion("team_start_time between", value1, value2, "teamStartTime");
            return (Criteria) this;
        }

        public Criteria andTeamStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_start_time not between", value1, value2, "teamStartTime");
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

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountIsNull() {
            addCriterion("team_open_shop_amount is null");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountIsNotNull() {
            addCriterion("team_open_shop_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountEqualTo(BigDecimal value) {
            addCriterion("team_open_shop_amount =", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountNotEqualTo(BigDecimal value) {
            addCriterion("team_open_shop_amount <>", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountGreaterThan(BigDecimal value) {
            addCriterion("team_open_shop_amount >", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_open_shop_amount >=", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountLessThan(BigDecimal value) {
            addCriterion("team_open_shop_amount <", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_open_shop_amount <=", value, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountIn(List<BigDecimal> values) {
            addCriterion("team_open_shop_amount in", values, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountNotIn(List<BigDecimal> values) {
            addCriterion("team_open_shop_amount not in", values, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_open_shop_amount between", value1, value2, "teamOpenShopAmount");
            return (Criteria) this;
        }

        public Criteria andTeamOpenShopAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_open_shop_amount not between", value1, value2, "teamOpenShopAmount");
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