package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersPushLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersPushLogExample() {
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

        public Criteria andPushLogIdIsNull() {
            addCriterion("push_log_id is null");
            return (Criteria) this;
        }

        public Criteria andPushLogIdIsNotNull() {
            addCriterion("push_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushLogIdEqualTo(Integer value) {
            addCriterion("push_log_id =", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdNotEqualTo(Integer value) {
            addCriterion("push_log_id <>", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdGreaterThan(Integer value) {
            addCriterion("push_log_id >", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_log_id >=", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdLessThan(Integer value) {
            addCriterion("push_log_id <", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("push_log_id <=", value, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdIn(List<Integer> values) {
            addCriterion("push_log_id in", values, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdNotIn(List<Integer> values) {
            addCriterion("push_log_id not in", values, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdBetween(Integer value1, Integer value2) {
            addCriterion("push_log_id between", value1, value2, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("push_log_id not between", value1, value2, "pushLogId");
            return (Criteria) this;
        }

        public Criteria andPushFlagIsNull() {
            addCriterion("push_flag is null");
            return (Criteria) this;
        }

        public Criteria andPushFlagIsNotNull() {
            addCriterion("push_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPushFlagEqualTo(Integer value) {
            addCriterion("push_flag =", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotEqualTo(Integer value) {
            addCriterion("push_flag <>", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagGreaterThan(Integer value) {
            addCriterion("push_flag >", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_flag >=", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagLessThan(Integer value) {
            addCriterion("push_flag <", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagLessThanOrEqualTo(Integer value) {
            addCriterion("push_flag <=", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagIn(List<Integer> values) {
            addCriterion("push_flag in", values, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotIn(List<Integer> values) {
            addCriterion("push_flag not in", values, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagBetween(Integer value1, Integer value2) {
            addCriterion("push_flag between", value1, value2, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("push_flag not between", value1, value2, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdIsNull() {
            addCriterion("push_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdIsNotNull() {
            addCriterion("push_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdEqualTo(Integer value) {
            addCriterion("push_order_id =", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdNotEqualTo(Integer value) {
            addCriterion("push_order_id <>", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdGreaterThan(Integer value) {
            addCriterion("push_order_id >", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_order_id >=", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdLessThan(Integer value) {
            addCriterion("push_order_id <", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("push_order_id <=", value, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdIn(List<Integer> values) {
            addCriterion("push_order_id in", values, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdNotIn(List<Integer> values) {
            addCriterion("push_order_id not in", values, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("push_order_id between", value1, value2, "pushOrderId");
            return (Criteria) this;
        }

        public Criteria andPushOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("push_order_id not between", value1, value2, "pushOrderId");
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