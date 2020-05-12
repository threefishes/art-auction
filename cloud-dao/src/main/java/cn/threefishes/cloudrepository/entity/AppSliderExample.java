package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AppSliderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppSliderExample() {
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

        public Criteria andAppSliderIdIsNull() {
            addCriterion("app_slider_id is null");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdIsNotNull() {
            addCriterion("app_slider_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdEqualTo(Integer value) {
            addCriterion("app_slider_id =", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdNotEqualTo(Integer value) {
            addCriterion("app_slider_id <>", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdGreaterThan(Integer value) {
            addCriterion("app_slider_id >", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_slider_id >=", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdLessThan(Integer value) {
            addCriterion("app_slider_id <", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_slider_id <=", value, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdIn(List<Integer> values) {
            addCriterion("app_slider_id in", values, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdNotIn(List<Integer> values) {
            addCriterion("app_slider_id not in", values, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdBetween(Integer value1, Integer value2) {
            addCriterion("app_slider_id between", value1, value2, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_slider_id not between", value1, value2, "appSliderId");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyIsNull() {
            addCriterion("app_slider_key is null");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyIsNotNull() {
            addCriterion("app_slider_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyEqualTo(String value) {
            addCriterion("app_slider_key =", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyNotEqualTo(String value) {
            addCriterion("app_slider_key <>", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyGreaterThan(String value) {
            addCriterion("app_slider_key >", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_slider_key >=", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyLessThan(String value) {
            addCriterion("app_slider_key <", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyLessThanOrEqualTo(String value) {
            addCriterion("app_slider_key <=", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyLike(String value) {
            addCriterion("app_slider_key like", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyNotLike(String value) {
            addCriterion("app_slider_key not like", value, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyIn(List<String> values) {
            addCriterion("app_slider_key in", values, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyNotIn(List<String> values) {
            addCriterion("app_slider_key not in", values, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyBetween(String value1, String value2) {
            addCriterion("app_slider_key between", value1, value2, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderKeyNotBetween(String value1, String value2) {
            addCriterion("app_slider_key not between", value1, value2, "appSliderKey");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortIsNull() {
            addCriterion("app_slider_sort is null");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortIsNotNull() {
            addCriterion("app_slider_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortEqualTo(Integer value) {
            addCriterion("app_slider_sort =", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortNotEqualTo(Integer value) {
            addCriterion("app_slider_sort <>", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortGreaterThan(Integer value) {
            addCriterion("app_slider_sort >", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_slider_sort >=", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortLessThan(Integer value) {
            addCriterion("app_slider_sort <", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortLessThanOrEqualTo(Integer value) {
            addCriterion("app_slider_sort <=", value, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortIn(List<Integer> values) {
            addCriterion("app_slider_sort in", values, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortNotIn(List<Integer> values) {
            addCriterion("app_slider_sort not in", values, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortBetween(Integer value1, Integer value2) {
            addCriterion("app_slider_sort between", value1, value2, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderSortNotBetween(Integer value1, Integer value2) {
            addCriterion("app_slider_sort not between", value1, value2, "appSliderSort");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeIsNull() {
            addCriterion("app_slider_type is null");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeIsNotNull() {
            addCriterion("app_slider_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeEqualTo(String value) {
            addCriterion("app_slider_type =", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeNotEqualTo(String value) {
            addCriterion("app_slider_type <>", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeGreaterThan(String value) {
            addCriterion("app_slider_type >", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_slider_type >=", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeLessThan(String value) {
            addCriterion("app_slider_type <", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeLessThanOrEqualTo(String value) {
            addCriterion("app_slider_type <=", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeLike(String value) {
            addCriterion("app_slider_type like", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeNotLike(String value) {
            addCriterion("app_slider_type not like", value, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeIn(List<String> values) {
            addCriterion("app_slider_type in", values, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeNotIn(List<String> values) {
            addCriterion("app_slider_type not in", values, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeBetween(String value1, String value2) {
            addCriterion("app_slider_type between", value1, value2, "appSliderType");
            return (Criteria) this;
        }

        public Criteria andAppSliderTypeNotBetween(String value1, String value2) {
            addCriterion("app_slider_type not between", value1, value2, "appSliderType");
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