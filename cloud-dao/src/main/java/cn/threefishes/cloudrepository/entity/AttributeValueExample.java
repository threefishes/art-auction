package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AttributeValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeValueExample() {
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

        public Criteria andAttributeValueIdIsNull() {
            addCriterion("attribute_value_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdIsNotNull() {
            addCriterion("attribute_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdEqualTo(Integer value) {
            addCriterion("attribute_value_id =", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdNotEqualTo(Integer value) {
            addCriterion("attribute_value_id <>", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdGreaterThan(Integer value) {
            addCriterion("attribute_value_id >", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_value_id >=", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdLessThan(Integer value) {
            addCriterion("attribute_value_id <", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_value_id <=", value, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdIn(List<Integer> values) {
            addCriterion("attribute_value_id in", values, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdNotIn(List<Integer> values) {
            addCriterion("attribute_value_id not in", values, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_value_id between", value1, value2, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_value_id not between", value1, value2, "attributeValueId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNull() {
            addCriterion("attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNotNull() {
            addCriterion("attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdEqualTo(Integer value) {
            addCriterion("attribute_id =", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotEqualTo(Integer value) {
            addCriterion("attribute_id <>", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThan(Integer value) {
            addCriterion("attribute_id >", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_id >=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThan(Integer value) {
            addCriterion("attribute_id <", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_id <=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIn(List<Integer> values) {
            addCriterion("attribute_id in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotIn(List<Integer> values) {
            addCriterion("attribute_id not in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id not between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameIsNull() {
            addCriterion("attribute_value_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameIsNotNull() {
            addCriterion("attribute_value_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameEqualTo(String value) {
            addCriterion("attribute_value_name =", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameNotEqualTo(String value) {
            addCriterion("attribute_value_name <>", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameGreaterThan(String value) {
            addCriterion("attribute_value_name >", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value_name >=", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameLessThan(String value) {
            addCriterion("attribute_value_name <", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameLessThanOrEqualTo(String value) {
            addCriterion("attribute_value_name <=", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameLike(String value) {
            addCriterion("attribute_value_name like", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameNotLike(String value) {
            addCriterion("attribute_value_name not like", value, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameIn(List<String> values) {
            addCriterion("attribute_value_name in", values, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameNotIn(List<String> values) {
            addCriterion("attribute_value_name not in", values, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameBetween(String value1, String value2) {
            addCriterion("attribute_value_name between", value1, value2, "attributeValueName");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNameNotBetween(String value1, String value2) {
            addCriterion("attribute_value_name not between", value1, value2, "attributeValueName");
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