package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class OrdersSeckillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersSeckillExample() {
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

        public Criteria andOrdersSeckillIdIsNull() {
            addCriterion("orders_seckill_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdIsNotNull() {
            addCriterion("orders_seckill_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdEqualTo(Integer value) {
            addCriterion("orders_seckill_id =", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdNotEqualTo(Integer value) {
            addCriterion("orders_seckill_id <>", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdGreaterThan(Integer value) {
            addCriterion("orders_seckill_id >", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_seckill_id >=", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdLessThan(Integer value) {
            addCriterion("orders_seckill_id <", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_seckill_id <=", value, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdIn(List<Integer> values) {
            addCriterion("orders_seckill_id in", values, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdNotIn(List<Integer> values) {
            addCriterion("orders_seckill_id not in", values, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_seckill_id between", value1, value2, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andOrdersSeckillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_seckill_id not between", value1, value2, "ordersSeckillId");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
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

        public Criteria andSeckillGoodsIdIsNull() {
            addCriterion("seckill_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdIsNotNull() {
            addCriterion("seckill_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdEqualTo(Integer value) {
            addCriterion("seckill_goods_id =", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdNotEqualTo(Integer value) {
            addCriterion("seckill_goods_id <>", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdGreaterThan(Integer value) {
            addCriterion("seckill_goods_id >", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_goods_id >=", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdLessThan(Integer value) {
            addCriterion("seckill_goods_id <", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_goods_id <=", value, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdIn(List<Integer> values) {
            addCriterion("seckill_goods_id in", values, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdNotIn(List<Integer> values) {
            addCriterion("seckill_goods_id not in", values, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("seckill_goods_id between", value1, value2, "seckillGoodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_goods_id not between", value1, value2, "seckillGoodsId");
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