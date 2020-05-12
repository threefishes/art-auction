package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ActivityGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityGiftExample() {
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

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIsNull() {
            addCriterion("gift_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIsNotNull() {
            addCriterion("gift_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameEqualTo(String value) {
            addCriterion("gift_goods_name =", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotEqualTo(String value) {
            addCriterion("gift_goods_name <>", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameGreaterThan(String value) {
            addCriterion("gift_goods_name >", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_goods_name >=", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLessThan(String value) {
            addCriterion("gift_goods_name <", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("gift_goods_name <=", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLike(String value) {
            addCriterion("gift_goods_name like", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotLike(String value) {
            addCriterion("gift_goods_name not like", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIn(List<String> values) {
            addCriterion("gift_goods_name in", values, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotIn(List<String> values) {
            addCriterion("gift_goods_name not in", values, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameBetween(String value1, String value2) {
            addCriterion("gift_goods_name between", value1, value2, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotBetween(String value1, String value2) {
            addCriterion("gift_goods_name not between", value1, value2, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameIsNull() {
            addCriterion("gift_image_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameIsNotNull() {
            addCriterion("gift_image_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameEqualTo(String value) {
            addCriterion("gift_image_name =", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameNotEqualTo(String value) {
            addCriterion("gift_image_name <>", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameGreaterThan(String value) {
            addCriterion("gift_image_name >", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_image_name >=", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameLessThan(String value) {
            addCriterion("gift_image_name <", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameLessThanOrEqualTo(String value) {
            addCriterion("gift_image_name <=", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameLike(String value) {
            addCriterion("gift_image_name like", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameNotLike(String value) {
            addCriterion("gift_image_name not like", value, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameIn(List<String> values) {
            addCriterion("gift_image_name in", values, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameNotIn(List<String> values) {
            addCriterion("gift_image_name not in", values, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameBetween(String value1, String value2) {
            addCriterion("gift_image_name between", value1, value2, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftImageNameNotBetween(String value1, String value2) {
            addCriterion("gift_image_name not between", value1, value2, "giftImageName");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNull() {
            addCriterion("gift_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNotNull() {
            addCriterion("gift_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceEqualTo(BigDecimal value) {
            addCriterion("gift_price =", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotEqualTo(BigDecimal value) {
            addCriterion("gift_price <>", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThan(BigDecimal value) {
            addCriterion("gift_price >", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_price >=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThan(BigDecimal value) {
            addCriterion("gift_price <", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_price <=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIn(List<BigDecimal> values) {
            addCriterion("gift_price in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotIn(List<BigDecimal> values) {
            addCriterion("gift_price not in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_price between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_price not between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftStateIsNull() {
            addCriterion("gift_state is null");
            return (Criteria) this;
        }

        public Criteria andGiftStateIsNotNull() {
            addCriterion("gift_state is not null");
            return (Criteria) this;
        }

        public Criteria andGiftStateEqualTo(Integer value) {
            addCriterion("gift_state =", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateNotEqualTo(Integer value) {
            addCriterion("gift_state <>", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateGreaterThan(Integer value) {
            addCriterion("gift_state >", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_state >=", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateLessThan(Integer value) {
            addCriterion("gift_state <", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateLessThanOrEqualTo(Integer value) {
            addCriterion("gift_state <=", value, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateIn(List<Integer> values) {
            addCriterion("gift_state in", values, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateNotIn(List<Integer> values) {
            addCriterion("gift_state not in", values, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateBetween(Integer value1, Integer value2) {
            addCriterion("gift_state between", value1, value2, "giftState");
            return (Criteria) this;
        }

        public Criteria andGiftStateNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_state not between", value1, value2, "giftState");
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