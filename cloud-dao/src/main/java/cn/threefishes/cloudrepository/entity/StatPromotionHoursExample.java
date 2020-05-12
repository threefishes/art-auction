package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatPromotionHoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatPromotionHoursExample() {
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

        public Criteria andOrdersGoodsNumIsNull() {
            addCriterion("orders_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumIsNotNull() {
            addCriterion("orders_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumEqualTo(Long value) {
            addCriterion("orders_goods_num =", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumNotEqualTo(Long value) {
            addCriterion("orders_goods_num <>", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumGreaterThan(Long value) {
            addCriterion("orders_goods_num >", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_goods_num >=", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumLessThan(Long value) {
            addCriterion("orders_goods_num <", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumLessThanOrEqualTo(Long value) {
            addCriterion("orders_goods_num <=", value, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumIn(List<Long> values) {
            addCriterion("orders_goods_num in", values, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumNotIn(List<Long> values) {
            addCriterion("orders_goods_num not in", values, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumBetween(Long value1, Long value2) {
            addCriterion("orders_goods_num between", value1, value2, "ordersGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsNumNotBetween(Long value1, Long value2) {
            addCriterion("orders_goods_num not between", value1, value2, "ordersGoodsNum");
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

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Integer value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Integer value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Integer value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Integer value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Integer> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Integer> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
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

        public Criteria andStatHourIsNull() {
            addCriterion("stat_hour is null");
            return (Criteria) this;
        }

        public Criteria andStatHourIsNotNull() {
            addCriterion("stat_hour is not null");
            return (Criteria) this;
        }

        public Criteria andStatHourEqualTo(Integer value) {
            addCriterion("stat_hour =", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotEqualTo(Integer value) {
            addCriterion("stat_hour <>", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourGreaterThan(Integer value) {
            addCriterion("stat_hour >", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_hour >=", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourLessThan(Integer value) {
            addCriterion("stat_hour <", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourLessThanOrEqualTo(Integer value) {
            addCriterion("stat_hour <=", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourIn(List<Integer> values) {
            addCriterion("stat_hour in", values, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotIn(List<Integer> values) {
            addCriterion("stat_hour not in", values, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourBetween(Integer value1, Integer value2) {
            addCriterion("stat_hour between", value1, value2, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_hour not between", value1, value2, "statHour");
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