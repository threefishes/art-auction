package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class WebSliderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebSliderExample() {
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

        public Criteria andWebSliderIdIsNull() {
            addCriterion("web_slider_id is null");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdIsNotNull() {
            addCriterion("web_slider_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdEqualTo(Integer value) {
            addCriterion("web_slider_id =", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdNotEqualTo(Integer value) {
            addCriterion("web_slider_id <>", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdGreaterThan(Integer value) {
            addCriterion("web_slider_id >", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_slider_id >=", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdLessThan(Integer value) {
            addCriterion("web_slider_id <", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_slider_id <=", value, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdIn(List<Integer> values) {
            addCriterion("web_slider_id in", values, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdNotIn(List<Integer> values) {
            addCriterion("web_slider_id not in", values, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdBetween(Integer value1, Integer value2) {
            addCriterion("web_slider_id between", value1, value2, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_slider_id not between", value1, value2, "webSliderId");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyIsNull() {
            addCriterion("web_slider_key is null");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyIsNotNull() {
            addCriterion("web_slider_key is not null");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyEqualTo(String value) {
            addCriterion("web_slider_key =", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyNotEqualTo(String value) {
            addCriterion("web_slider_key <>", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyGreaterThan(String value) {
            addCriterion("web_slider_key >", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyGreaterThanOrEqualTo(String value) {
            addCriterion("web_slider_key >=", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyLessThan(String value) {
            addCriterion("web_slider_key <", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyLessThanOrEqualTo(String value) {
            addCriterion("web_slider_key <=", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyLike(String value) {
            addCriterion("web_slider_key like", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyNotLike(String value) {
            addCriterion("web_slider_key not like", value, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyIn(List<String> values) {
            addCriterion("web_slider_key in", values, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyNotIn(List<String> values) {
            addCriterion("web_slider_key not in", values, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyBetween(String value1, String value2) {
            addCriterion("web_slider_key between", value1, value2, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderKeyNotBetween(String value1, String value2) {
            addCriterion("web_slider_key not between", value1, value2, "webSliderKey");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortIsNull() {
            addCriterion("web_slider_sort is null");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortIsNotNull() {
            addCriterion("web_slider_sort is not null");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortEqualTo(Integer value) {
            addCriterion("web_slider_sort =", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortNotEqualTo(Integer value) {
            addCriterion("web_slider_sort <>", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortGreaterThan(Integer value) {
            addCriterion("web_slider_sort >", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_slider_sort >=", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortLessThan(Integer value) {
            addCriterion("web_slider_sort <", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortLessThanOrEqualTo(Integer value) {
            addCriterion("web_slider_sort <=", value, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortIn(List<Integer> values) {
            addCriterion("web_slider_sort in", values, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortNotIn(List<Integer> values) {
            addCriterion("web_slider_sort not in", values, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortBetween(Integer value1, Integer value2) {
            addCriterion("web_slider_sort between", value1, value2, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderSortNotBetween(Integer value1, Integer value2) {
            addCriterion("web_slider_sort not between", value1, value2, "webSliderSort");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeIsNull() {
            addCriterion("web_slider_type is null");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeIsNotNull() {
            addCriterion("web_slider_type is not null");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeEqualTo(String value) {
            addCriterion("web_slider_type =", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeNotEqualTo(String value) {
            addCriterion("web_slider_type <>", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeGreaterThan(String value) {
            addCriterion("web_slider_type >", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("web_slider_type >=", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeLessThan(String value) {
            addCriterion("web_slider_type <", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeLessThanOrEqualTo(String value) {
            addCriterion("web_slider_type <=", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeLike(String value) {
            addCriterion("web_slider_type like", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeNotLike(String value) {
            addCriterion("web_slider_type not like", value, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeIn(List<String> values) {
            addCriterion("web_slider_type in", values, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeNotIn(List<String> values) {
            addCriterion("web_slider_type not in", values, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeBetween(String value1, String value2) {
            addCriterion("web_slider_type between", value1, value2, "webSliderType");
            return (Criteria) this;
        }

        public Criteria andWebSliderTypeNotBetween(String value1, String value2) {
            addCriterion("web_slider_type not between", value1, value2, "webSliderType");
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