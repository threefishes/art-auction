package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CancelOrdersCodPushLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CancelOrdersCodPushLogExample() {
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

        public Criteria andPushOrdersIdIsNull() {
            addCriterion("push_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdIsNotNull() {
            addCriterion("push_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdEqualTo(Integer value) {
            addCriterion("push_orders_id =", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdNotEqualTo(Integer value) {
            addCriterion("push_orders_id <>", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdGreaterThan(Integer value) {
            addCriterion("push_orders_id >", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_orders_id >=", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdLessThan(Integer value) {
            addCriterion("push_orders_id <", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("push_orders_id <=", value, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdIn(List<Integer> values) {
            addCriterion("push_orders_id in", values, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdNotIn(List<Integer> values) {
            addCriterion("push_orders_id not in", values, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("push_orders_id between", value1, value2, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("push_orders_id not between", value1, value2, "pushOrdersId");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNull() {
            addCriterion("push_state is null");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNotNull() {
            addCriterion("push_state is not null");
            return (Criteria) this;
        }

        public Criteria andPushStateEqualTo(Integer value) {
            addCriterion("push_state =", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotEqualTo(Integer value) {
            addCriterion("push_state <>", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThan(Integer value) {
            addCriterion("push_state >", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_state >=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThan(Integer value) {
            addCriterion("push_state <", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThanOrEqualTo(Integer value) {
            addCriterion("push_state <=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateIn(List<Integer> values) {
            addCriterion("push_state in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotIn(List<Integer> values) {
            addCriterion("push_state not in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateBetween(Integer value1, Integer value2) {
            addCriterion("push_state between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotBetween(Integer value1, Integer value2) {
            addCriterion("push_state not between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnIsNull() {
            addCriterion("push_orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnIsNotNull() {
            addCriterion("push_orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnEqualTo(String value) {
            addCriterion("push_orders_sn =", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnNotEqualTo(String value) {
            addCriterion("push_orders_sn <>", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnGreaterThan(String value) {
            addCriterion("push_orders_sn >", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("push_orders_sn >=", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnLessThan(String value) {
            addCriterion("push_orders_sn <", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("push_orders_sn <=", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnLike(String value) {
            addCriterion("push_orders_sn like", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnNotLike(String value) {
            addCriterion("push_orders_sn not like", value, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnIn(List<String> values) {
            addCriterion("push_orders_sn in", values, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnNotIn(List<String> values) {
            addCriterion("push_orders_sn not in", values, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnBetween(String value1, String value2) {
            addCriterion("push_orders_sn between", value1, value2, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushOrdersSnNotBetween(String value1, String value2) {
            addCriterion("push_orders_sn not between", value1, value2, "pushOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPushDataIsNull() {
            addCriterion("push_data is null");
            return (Criteria) this;
        }

        public Criteria andPushDataIsNotNull() {
            addCriterion("push_data is not null");
            return (Criteria) this;
        }

        public Criteria andPushDataEqualTo(String value) {
            addCriterion("push_data =", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataNotEqualTo(String value) {
            addCriterion("push_data <>", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataGreaterThan(String value) {
            addCriterion("push_data >", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataGreaterThanOrEqualTo(String value) {
            addCriterion("push_data >=", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataLessThan(String value) {
            addCriterion("push_data <", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataLessThanOrEqualTo(String value) {
            addCriterion("push_data <=", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataLike(String value) {
            addCriterion("push_data like", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataNotLike(String value) {
            addCriterion("push_data not like", value, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataIn(List<String> values) {
            addCriterion("push_data in", values, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataNotIn(List<String> values) {
            addCriterion("push_data not in", values, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataBetween(String value1, String value2) {
            addCriterion("push_data between", value1, value2, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushDataNotBetween(String value1, String value2) {
            addCriterion("push_data not between", value1, value2, "pushData");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNull() {
            addCriterion("push_content is null");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNotNull() {
            addCriterion("push_content is not null");
            return (Criteria) this;
        }

        public Criteria andPushContentEqualTo(String value) {
            addCriterion("push_content =", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotEqualTo(String value) {
            addCriterion("push_content <>", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThan(String value) {
            addCriterion("push_content >", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThanOrEqualTo(String value) {
            addCriterion("push_content >=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThan(String value) {
            addCriterion("push_content <", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThanOrEqualTo(String value) {
            addCriterion("push_content <=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLike(String value) {
            addCriterion("push_content like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotLike(String value) {
            addCriterion("push_content not like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentIn(List<String> values) {
            addCriterion("push_content in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotIn(List<String> values) {
            addCriterion("push_content not in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentBetween(String value1, String value2) {
            addCriterion("push_content between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotBetween(String value1, String value2) {
            addCriterion("push_content not between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeIsNull() {
            addCriterion("push_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeIsNotNull() {
            addCriterion("push_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeEqualTo(Date value) {
            addCriterion("push_create_time =", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeNotEqualTo(Date value) {
            addCriterion("push_create_time <>", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeGreaterThan(Date value) {
            addCriterion("push_create_time >", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_create_time >=", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeLessThan(Date value) {
            addCriterion("push_create_time <", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_create_time <=", value, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeIn(List<Date> values) {
            addCriterion("push_create_time in", values, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeNotIn(List<Date> values) {
            addCriterion("push_create_time not in", values, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeBetween(Date value1, Date value2) {
            addCriterion("push_create_time between", value1, value2, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_create_time not between", value1, value2, "pushCreateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeIsNull() {
            addCriterion("push_update_time is null");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeIsNotNull() {
            addCriterion("push_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeEqualTo(Date value) {
            addCriterion("push_update_time =", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeNotEqualTo(Date value) {
            addCriterion("push_update_time <>", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeGreaterThan(Date value) {
            addCriterion("push_update_time >", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_update_time >=", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeLessThan(Date value) {
            addCriterion("push_update_time <", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_update_time <=", value, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeIn(List<Date> values) {
            addCriterion("push_update_time in", values, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeNotIn(List<Date> values) {
            addCriterion("push_update_time not in", values, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("push_update_time between", value1, value2, "pushUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPushUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_update_time not between", value1, value2, "pushUpdateTime");
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