package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FreightAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreightAreaExample() {
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

        public Criteria andFreightAreaIdIsNull() {
            addCriterion("freight_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdIsNotNull() {
            addCriterion("freight_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdEqualTo(Integer value) {
            addCriterion("freight_area_id =", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdNotEqualTo(Integer value) {
            addCriterion("freight_area_id <>", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdGreaterThan(Integer value) {
            addCriterion("freight_area_id >", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_area_id >=", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdLessThan(Integer value) {
            addCriterion("freight_area_id <", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("freight_area_id <=", value, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdIn(List<Integer> values) {
            addCriterion("freight_area_id in", values, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdNotIn(List<Integer> values) {
            addCriterion("freight_area_id not in", values, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("freight_area_id between", value1, value2, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_area_id not between", value1, value2, "freightAreaId");
            return (Criteria) this;
        }

        public Criteria andFreightIdIsNull() {
            addCriterion("freight_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightIdIsNotNull() {
            addCriterion("freight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightIdEqualTo(Integer value) {
            addCriterion("freight_id =", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotEqualTo(Integer value) {
            addCriterion("freight_id <>", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThan(Integer value) {
            addCriterion("freight_id >", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_id >=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThan(Integer value) {
            addCriterion("freight_id <", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThanOrEqualTo(Integer value) {
            addCriterion("freight_id <=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdIn(List<Integer> values) {
            addCriterion("freight_id in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotIn(List<Integer> values) {
            addCriterion("freight_id not in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdBetween(Integer value1, Integer value2) {
            addCriterion("freight_id between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_id not between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andItem1IsNull() {
            addCriterion("item1 is null");
            return (Criteria) this;
        }

        public Criteria andItem1IsNotNull() {
            addCriterion("item1 is not null");
            return (Criteria) this;
        }

        public Criteria andItem1EqualTo(BigDecimal value) {
            addCriterion("item1 =", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotEqualTo(BigDecimal value) {
            addCriterion("item1 <>", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThan(BigDecimal value) {
            addCriterion("item1 >", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item1 >=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThan(BigDecimal value) {
            addCriterion("item1 <", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("item1 <=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1In(List<BigDecimal> values) {
            addCriterion("item1 in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotIn(List<BigDecimal> values) {
            addCriterion("item1 not in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("item1 between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item1 not between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem2IsNull() {
            addCriterion("item2 is null");
            return (Criteria) this;
        }

        public Criteria andItem2IsNotNull() {
            addCriterion("item2 is not null");
            return (Criteria) this;
        }

        public Criteria andItem2EqualTo(BigDecimal value) {
            addCriterion("item2 =", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotEqualTo(BigDecimal value) {
            addCriterion("item2 <>", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThan(BigDecimal value) {
            addCriterion("item2 >", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item2 >=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThan(BigDecimal value) {
            addCriterion("item2 <", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("item2 <=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2In(List<BigDecimal> values) {
            addCriterion("item2 in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotIn(List<BigDecimal> values) {
            addCriterion("item2 not in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("item2 between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item2 not between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNull() {
            addCriterion("price1 is null");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNotNull() {
            addCriterion("price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice1EqualTo(BigDecimal value) {
            addCriterion("price1 =", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotEqualTo(BigDecimal value) {
            addCriterion("price1 <>", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThan(BigDecimal value) {
            addCriterion("price1 >", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price1 >=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThan(BigDecimal value) {
            addCriterion("price1 <", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price1 <=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1In(List<BigDecimal> values) {
            addCriterion("price1 in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotIn(List<BigDecimal> values) {
            addCriterion("price1 not in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price1 between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price1 not between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("price2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(BigDecimal value) {
            addCriterion("price2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(BigDecimal value) {
            addCriterion("price2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(BigDecimal value) {
            addCriterion("price2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(BigDecimal value) {
            addCriterion("price2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<BigDecimal> values) {
            addCriterion("price2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<BigDecimal> values) {
            addCriterion("price2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price2 not between", value1, value2, "price2");
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