package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreBindCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreBindCategoryExample() {
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

        public Criteria andBindIdIsNull() {
            addCriterion("bind_id is null");
            return (Criteria) this;
        }

        public Criteria andBindIdIsNotNull() {
            addCriterion("bind_id is not null");
            return (Criteria) this;
        }

        public Criteria andBindIdEqualTo(Integer value) {
            addCriterion("bind_id =", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotEqualTo(Integer value) {
            addCriterion("bind_id <>", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThan(Integer value) {
            addCriterion("bind_id >", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_id >=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThan(Integer value) {
            addCriterion("bind_id <", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThanOrEqualTo(Integer value) {
            addCriterion("bind_id <=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdIn(List<Integer> values) {
            addCriterion("bind_id in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotIn(List<Integer> values) {
            addCriterion("bind_id not in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdBetween(Integer value1, Integer value2) {
            addCriterion("bind_id between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_id not between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindStateIsNull() {
            addCriterion("bind_state is null");
            return (Criteria) this;
        }

        public Criteria andBindStateIsNotNull() {
            addCriterion("bind_state is not null");
            return (Criteria) this;
        }

        public Criteria andBindStateEqualTo(Integer value) {
            addCriterion("bind_state =", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateNotEqualTo(Integer value) {
            addCriterion("bind_state <>", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateGreaterThan(Integer value) {
            addCriterion("bind_state >", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_state >=", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateLessThan(Integer value) {
            addCriterion("bind_state <", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateLessThanOrEqualTo(Integer value) {
            addCriterion("bind_state <=", value, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateIn(List<Integer> values) {
            addCriterion("bind_state in", values, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateNotIn(List<Integer> values) {
            addCriterion("bind_state not in", values, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateBetween(Integer value1, Integer value2) {
            addCriterion("bind_state between", value1, value2, "bindState");
            return (Criteria) this;
        }

        public Criteria andBindStateNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_state not between", value1, value2, "bindState");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNull() {
            addCriterion("category_id1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNotNull() {
            addCriterion("category_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1EqualTo(Integer value) {
            addCriterion("category_id1 =", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotEqualTo(Integer value) {
            addCriterion("category_id1 <>", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThan(Integer value) {
            addCriterion("category_id1 >", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id1 >=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThan(Integer value) {
            addCriterion("category_id1 <", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThanOrEqualTo(Integer value) {
            addCriterion("category_id1 <=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1In(List<Integer> values) {
            addCriterion("category_id1 in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotIn(List<Integer> values) {
            addCriterion("category_id1 not in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1Between(Integer value1, Integer value2) {
            addCriterion("category_id1 between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id1 not between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNull() {
            addCriterion("category_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNotNull() {
            addCriterion("category_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2EqualTo(Integer value) {
            addCriterion("category_id2 =", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotEqualTo(Integer value) {
            addCriterion("category_id2 <>", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThan(Integer value) {
            addCriterion("category_id2 >", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id2 >=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThan(Integer value) {
            addCriterion("category_id2 <", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThanOrEqualTo(Integer value) {
            addCriterion("category_id2 <=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2In(List<Integer> values) {
            addCriterion("category_id2 in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotIn(List<Integer> values) {
            addCriterion("category_id2 not in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2Between(Integer value1, Integer value2) {
            addCriterion("category_id2 between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id2 not between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNull() {
            addCriterion("category_id3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNotNull() {
            addCriterion("category_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3EqualTo(Integer value) {
            addCriterion("category_id3 =", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotEqualTo(Integer value) {
            addCriterion("category_id3 <>", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThan(Integer value) {
            addCriterion("category_id3 >", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id3 >=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThan(Integer value) {
            addCriterion("category_id3 <", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThanOrEqualTo(Integer value) {
            addCriterion("category_id3 <=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3In(List<Integer> values) {
            addCriterion("category_id3 in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotIn(List<Integer> values) {
            addCriterion("category_id3 not in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3Between(Integer value1, Integer value2) {
            addCriterion("category_id3 between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id3 not between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryName1IsNull() {
            addCriterion("category_name1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryName1IsNotNull() {
            addCriterion("category_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryName1EqualTo(String value) {
            addCriterion("category_name1 =", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1NotEqualTo(String value) {
            addCriterion("category_name1 <>", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1GreaterThan(String value) {
            addCriterion("category_name1 >", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1GreaterThanOrEqualTo(String value) {
            addCriterion("category_name1 >=", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1LessThan(String value) {
            addCriterion("category_name1 <", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1LessThanOrEqualTo(String value) {
            addCriterion("category_name1 <=", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1Like(String value) {
            addCriterion("category_name1 like", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1NotLike(String value) {
            addCriterion("category_name1 not like", value, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1In(List<String> values) {
            addCriterion("category_name1 in", values, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1NotIn(List<String> values) {
            addCriterion("category_name1 not in", values, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1Between(String value1, String value2) {
            addCriterion("category_name1 between", value1, value2, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName1NotBetween(String value1, String value2) {
            addCriterion("category_name1 not between", value1, value2, "categoryName1");
            return (Criteria) this;
        }

        public Criteria andCategoryName2IsNull() {
            addCriterion("category_name2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryName2IsNotNull() {
            addCriterion("category_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryName2EqualTo(String value) {
            addCriterion("category_name2 =", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2NotEqualTo(String value) {
            addCriterion("category_name2 <>", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2GreaterThan(String value) {
            addCriterion("category_name2 >", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2GreaterThanOrEqualTo(String value) {
            addCriterion("category_name2 >=", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2LessThan(String value) {
            addCriterion("category_name2 <", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2LessThanOrEqualTo(String value) {
            addCriterion("category_name2 <=", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2Like(String value) {
            addCriterion("category_name2 like", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2NotLike(String value) {
            addCriterion("category_name2 not like", value, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2In(List<String> values) {
            addCriterion("category_name2 in", values, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2NotIn(List<String> values) {
            addCriterion("category_name2 not in", values, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2Between(String value1, String value2) {
            addCriterion("category_name2 between", value1, value2, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName2NotBetween(String value1, String value2) {
            addCriterion("category_name2 not between", value1, value2, "categoryName2");
            return (Criteria) this;
        }

        public Criteria andCategoryName3IsNull() {
            addCriterion("category_name3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryName3IsNotNull() {
            addCriterion("category_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryName3EqualTo(String value) {
            addCriterion("category_name3 =", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3NotEqualTo(String value) {
            addCriterion("category_name3 <>", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3GreaterThan(String value) {
            addCriterion("category_name3 >", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3GreaterThanOrEqualTo(String value) {
            addCriterion("category_name3 >=", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3LessThan(String value) {
            addCriterion("category_name3 <", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3LessThanOrEqualTo(String value) {
            addCriterion("category_name3 <=", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3Like(String value) {
            addCriterion("category_name3 like", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3NotLike(String value) {
            addCriterion("category_name3 not like", value, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3In(List<String> values) {
            addCriterion("category_name3 in", values, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3NotIn(List<String> values) {
            addCriterion("category_name3 not in", values, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3Between(String value1, String value2) {
            addCriterion("category_name3 between", value1, value2, "categoryName3");
            return (Criteria) this;
        }

        public Criteria andCategoryName3NotBetween(String value1, String value2) {
            addCriterion("category_name3 not between", value1, value2, "categoryName3");
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