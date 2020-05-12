package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatStoreHoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatStoreHoursExample() {
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

        public Criteria andStoreClassIdIsNull() {
            addCriterion("store_class_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdIsNotNull() {
            addCriterion("store_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdEqualTo(Integer value) {
            addCriterion("store_class_id =", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdNotEqualTo(Integer value) {
            addCriterion("store_class_id <>", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdGreaterThan(Integer value) {
            addCriterion("store_class_id >", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_class_id >=", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdLessThan(Integer value) {
            addCriterion("store_class_id <", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_class_id <=", value, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdIn(List<Integer> values) {
            addCriterion("store_class_id in", values, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdNotIn(List<Integer> values) {
            addCriterion("store_class_id not in", values, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdBetween(Integer value1, Integer value2) {
            addCriterion("store_class_id between", value1, value2, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_class_id not between", value1, value2, "storeClassId");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameIsNull() {
            addCriterion("store_class_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameIsNotNull() {
            addCriterion("store_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameEqualTo(String value) {
            addCriterion("store_class_name =", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameNotEqualTo(String value) {
            addCriterion("store_class_name <>", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameGreaterThan(String value) {
            addCriterion("store_class_name >", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_name >=", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameLessThan(String value) {
            addCriterion("store_class_name <", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameLessThanOrEqualTo(String value) {
            addCriterion("store_class_name <=", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameLike(String value) {
            addCriterion("store_class_name like", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameNotLike(String value) {
            addCriterion("store_class_name not like", value, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameIn(List<String> values) {
            addCriterion("store_class_name in", values, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameNotIn(List<String> values) {
            addCriterion("store_class_name not in", values, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameBetween(String value1, String value2) {
            addCriterion("store_class_name between", value1, value2, "storeClassName");
            return (Criteria) this;
        }

        public Criteria andStoreClassNameNotBetween(String value1, String value2) {
            addCriterion("store_class_name not between", value1, value2, "storeClassName");
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