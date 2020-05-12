package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreCustomsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreCustomsInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAlipayCustomsPlaceIsNull() {
            addCriterion("alipay_customs_place is null");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceIsNotNull() {
            addCriterion("alipay_customs_place is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceEqualTo(String value) {
            addCriterion("alipay_customs_place =", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceNotEqualTo(String value) {
            addCriterion("alipay_customs_place <>", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceGreaterThan(String value) {
            addCriterion("alipay_customs_place >", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_customs_place >=", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceLessThan(String value) {
            addCriterion("alipay_customs_place <", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceLessThanOrEqualTo(String value) {
            addCriterion("alipay_customs_place <=", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceLike(String value) {
            addCriterion("alipay_customs_place like", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceNotLike(String value) {
            addCriterion("alipay_customs_place not like", value, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceIn(List<String> values) {
            addCriterion("alipay_customs_place in", values, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceNotIn(List<String> values) {
            addCriterion("alipay_customs_place not in", values, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceBetween(String value1, String value2) {
            addCriterion("alipay_customs_place between", value1, value2, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAlipayCustomsPlaceNotBetween(String value1, String value2) {
            addCriterion("alipay_customs_place not between", value1, value2, "alipayCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceIsNull() {
            addCriterion("wechat_customs_place is null");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceIsNotNull() {
            addCriterion("wechat_customs_place is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceEqualTo(String value) {
            addCriterion("wechat_customs_place =", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceNotEqualTo(String value) {
            addCriterion("wechat_customs_place <>", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceGreaterThan(String value) {
            addCriterion("wechat_customs_place >", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_customs_place >=", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceLessThan(String value) {
            addCriterion("wechat_customs_place <", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceLessThanOrEqualTo(String value) {
            addCriterion("wechat_customs_place <=", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceLike(String value) {
            addCriterion("wechat_customs_place like", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceNotLike(String value) {
            addCriterion("wechat_customs_place not like", value, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceIn(List<String> values) {
            addCriterion("wechat_customs_place in", values, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceNotIn(List<String> values) {
            addCriterion("wechat_customs_place not in", values, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceBetween(String value1, String value2) {
            addCriterion("wechat_customs_place between", value1, value2, "wechatCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andWechatCustomsPlaceNotBetween(String value1, String value2) {
            addCriterion("wechat_customs_place not between", value1, value2, "wechatCustomsPlace");
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