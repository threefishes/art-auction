package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatMemberExample() {
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

        public Criteria andStatIdIsNull() {
            addCriterion("stat_id is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(Integer value) {
            addCriterion("stat_id =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(Integer value) {
            addCriterion("stat_id <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(Integer value) {
            addCriterion("stat_id >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_id >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(Integer value) {
            addCriterion("stat_id <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("stat_id <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<Integer> values) {
            addCriterion("stat_id in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<Integer> values) {
            addCriterion("stat_id not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(Integer value1, Integer value2) {
            addCriterion("stat_id between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_id not between", value1, value2, "statId");
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

        public Criteria andOrdersNumIsNull() {
            addCriterion("orders_num is null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIsNotNull() {
            addCriterion("orders_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumEqualTo(Long value) {
            addCriterion("orders_num =", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotEqualTo(Long value) {
            addCriterion("orders_num <>", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThan(Long value) {
            addCriterion("orders_num >", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_num >=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThan(Long value) {
            addCriterion("orders_num <", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThanOrEqualTo(Long value) {
            addCriterion("orders_num <=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIn(List<Long> values) {
            addCriterion("orders_num in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotIn(List<Long> values) {
            addCriterion("orders_num not in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumBetween(Long value1, Long value2) {
            addCriterion("orders_num between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotBetween(Long value1, Long value2) {
            addCriterion("orders_num not between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseIsNull() {
            addCriterion("points_increase is null");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseIsNotNull() {
            addCriterion("points_increase is not null");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseEqualTo(Long value) {
            addCriterion("points_increase =", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseNotEqualTo(Long value) {
            addCriterion("points_increase <>", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseGreaterThan(Long value) {
            addCriterion("points_increase >", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseGreaterThanOrEqualTo(Long value) {
            addCriterion("points_increase >=", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseLessThan(Long value) {
            addCriterion("points_increase <", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseLessThanOrEqualTo(Long value) {
            addCriterion("points_increase <=", value, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseIn(List<Long> values) {
            addCriterion("points_increase in", values, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseNotIn(List<Long> values) {
            addCriterion("points_increase not in", values, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseBetween(Long value1, Long value2) {
            addCriterion("points_increase between", value1, value2, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsIncreaseNotBetween(Long value1, Long value2) {
            addCriterion("points_increase not between", value1, value2, "pointsIncrease");
            return (Criteria) this;
        }

        public Criteria andPointsReduceIsNull() {
            addCriterion("points_reduce is null");
            return (Criteria) this;
        }

        public Criteria andPointsReduceIsNotNull() {
            addCriterion("points_reduce is not null");
            return (Criteria) this;
        }

        public Criteria andPointsReduceEqualTo(Long value) {
            addCriterion("points_reduce =", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceNotEqualTo(Long value) {
            addCriterion("points_reduce <>", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceGreaterThan(Long value) {
            addCriterion("points_reduce >", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceGreaterThanOrEqualTo(Long value) {
            addCriterion("points_reduce >=", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceLessThan(Long value) {
            addCriterion("points_reduce <", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceLessThanOrEqualTo(Long value) {
            addCriterion("points_reduce <=", value, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceIn(List<Long> values) {
            addCriterion("points_reduce in", values, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceNotIn(List<Long> values) {
            addCriterion("points_reduce not in", values, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceBetween(Long value1, Long value2) {
            addCriterion("points_reduce between", value1, value2, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPointsReduceNotBetween(Long value1, Long value2) {
            addCriterion("points_reduce not between", value1, value2, "pointsReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseIsNull() {
            addCriterion("predeposit_increase is null");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseIsNotNull() {
            addCriterion("predeposit_increase is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseEqualTo(BigDecimal value) {
            addCriterion("predeposit_increase =", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_increase <>", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseGreaterThan(BigDecimal value) {
            addCriterion("predeposit_increase >", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_increase >=", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseLessThan(BigDecimal value) {
            addCriterion("predeposit_increase <", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_increase <=", value, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseIn(List<BigDecimal> values) {
            addCriterion("predeposit_increase in", values, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_increase not in", values, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_increase between", value1, value2, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositIncreaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_increase not between", value1, value2, "predepositIncrease");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceIsNull() {
            addCriterion("predeposit_reduce is null");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceIsNotNull() {
            addCriterion("predeposit_reduce is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceEqualTo(BigDecimal value) {
            addCriterion("predeposit_reduce =", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_reduce <>", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceGreaterThan(BigDecimal value) {
            addCriterion("predeposit_reduce >", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_reduce >=", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceLessThan(BigDecimal value) {
            addCriterion("predeposit_reduce <", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_reduce <=", value, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceIn(List<BigDecimal> values) {
            addCriterion("predeposit_reduce in", values, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_reduce not in", values, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_reduce between", value1, value2, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andPredepositReduceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_reduce not between", value1, value2, "predepositReduce");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNull() {
            addCriterion("stat_date is null");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNotNull() {
            addCriterion("stat_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatDateEqualTo(Date value) {
            addCriterion("stat_date =", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotEqualTo(Date value) {
            addCriterion("stat_date <>", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThan(Date value) {
            addCriterion("stat_date >", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stat_date >=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThan(Date value) {
            addCriterion("stat_date <", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThanOrEqualTo(Date value) {
            addCriterion("stat_date <=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateIn(List<Date> values) {
            addCriterion("stat_date in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotIn(List<Date> values) {
            addCriterion("stat_date not in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateBetween(Date value1, Date value2) {
            addCriterion("stat_date between", value1, value2, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotBetween(Date value1, Date value2) {
            addCriterion("stat_date not between", value1, value2, "statDate");
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