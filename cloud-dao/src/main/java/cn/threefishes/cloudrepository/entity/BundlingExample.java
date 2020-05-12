package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BundlingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BundlingExample() {
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

        public Criteria andBundlingIdIsNull() {
            addCriterion("bundling_id is null");
            return (Criteria) this;
        }

        public Criteria andBundlingIdIsNotNull() {
            addCriterion("bundling_id is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingIdEqualTo(Integer value) {
            addCriterion("bundling_id =", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotEqualTo(Integer value) {
            addCriterion("bundling_id <>", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdGreaterThan(Integer value) {
            addCriterion("bundling_id >", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bundling_id >=", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdLessThan(Integer value) {
            addCriterion("bundling_id <", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdLessThanOrEqualTo(Integer value) {
            addCriterion("bundling_id <=", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdIn(List<Integer> values) {
            addCriterion("bundling_id in", values, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotIn(List<Integer> values) {
            addCriterion("bundling_id not in", values, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdBetween(Integer value1, Integer value2) {
            addCriterion("bundling_id between", value1, value2, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bundling_id not between", value1, value2, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainIsNull() {
            addCriterion("bundling_explain is null");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainIsNotNull() {
            addCriterion("bundling_explain is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainEqualTo(String value) {
            addCriterion("bundling_explain =", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainNotEqualTo(String value) {
            addCriterion("bundling_explain <>", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainGreaterThan(String value) {
            addCriterion("bundling_explain >", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainGreaterThanOrEqualTo(String value) {
            addCriterion("bundling_explain >=", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainLessThan(String value) {
            addCriterion("bundling_explain <", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainLessThanOrEqualTo(String value) {
            addCriterion("bundling_explain <=", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainLike(String value) {
            addCriterion("bundling_explain like", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainNotLike(String value) {
            addCriterion("bundling_explain not like", value, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainIn(List<String> values) {
            addCriterion("bundling_explain in", values, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainNotIn(List<String> values) {
            addCriterion("bundling_explain not in", values, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainBetween(String value1, String value2) {
            addCriterion("bundling_explain between", value1, value2, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingExplainNotBetween(String value1, String value2) {
            addCriterion("bundling_explain not between", value1, value2, "bundlingExplain");
            return (Criteria) this;
        }

        public Criteria andBundlingNameIsNull() {
            addCriterion("bundling_name is null");
            return (Criteria) this;
        }

        public Criteria andBundlingNameIsNotNull() {
            addCriterion("bundling_name is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingNameEqualTo(String value) {
            addCriterion("bundling_name =", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameNotEqualTo(String value) {
            addCriterion("bundling_name <>", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameGreaterThan(String value) {
            addCriterion("bundling_name >", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameGreaterThanOrEqualTo(String value) {
            addCriterion("bundling_name >=", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameLessThan(String value) {
            addCriterion("bundling_name <", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameLessThanOrEqualTo(String value) {
            addCriterion("bundling_name <=", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameLike(String value) {
            addCriterion("bundling_name like", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameNotLike(String value) {
            addCriterion("bundling_name not like", value, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameIn(List<String> values) {
            addCriterion("bundling_name in", values, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameNotIn(List<String> values) {
            addCriterion("bundling_name not in", values, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameBetween(String value1, String value2) {
            addCriterion("bundling_name between", value1, value2, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingNameNotBetween(String value1, String value2) {
            addCriterion("bundling_name not between", value1, value2, "bundlingName");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleIsNull() {
            addCriterion("bundling_title is null");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleIsNotNull() {
            addCriterion("bundling_title is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleEqualTo(String value) {
            addCriterion("bundling_title =", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleNotEqualTo(String value) {
            addCriterion("bundling_title <>", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleGreaterThan(String value) {
            addCriterion("bundling_title >", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleGreaterThanOrEqualTo(String value) {
            addCriterion("bundling_title >=", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleLessThan(String value) {
            addCriterion("bundling_title <", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleLessThanOrEqualTo(String value) {
            addCriterion("bundling_title <=", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleLike(String value) {
            addCriterion("bundling_title like", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleNotLike(String value) {
            addCriterion("bundling_title not like", value, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleIn(List<String> values) {
            addCriterion("bundling_title in", values, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleNotIn(List<String> values) {
            addCriterion("bundling_title not in", values, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleBetween(String value1, String value2) {
            addCriterion("bundling_title between", value1, value2, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andBundlingTitleNotBetween(String value1, String value2) {
            addCriterion("bundling_title not between", value1, value2, "bundlingTitle");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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