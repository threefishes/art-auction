package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class BrandLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandLabelExample() {
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

        public Criteria andBrandLabelIdIsNull() {
            addCriterion("brand_label_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdIsNotNull() {
            addCriterion("brand_label_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdEqualTo(Integer value) {
            addCriterion("brand_label_id =", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdNotEqualTo(Integer value) {
            addCriterion("brand_label_id <>", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdGreaterThan(Integer value) {
            addCriterion("brand_label_id >", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_label_id >=", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdLessThan(Integer value) {
            addCriterion("brand_label_id <", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_label_id <=", value, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdIn(List<Integer> values) {
            addCriterion("brand_label_id in", values, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdNotIn(List<Integer> values) {
            addCriterion("brand_label_id not in", values, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_label_id between", value1, value2, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_label_id not between", value1, value2, "brandLabelId");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameIsNull() {
            addCriterion("brand_label_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameIsNotNull() {
            addCriterion("brand_label_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameEqualTo(String value) {
            addCriterion("brand_label_name =", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameNotEqualTo(String value) {
            addCriterion("brand_label_name <>", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameGreaterThan(String value) {
            addCriterion("brand_label_name >", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_label_name >=", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameLessThan(String value) {
            addCriterion("brand_label_name <", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameLessThanOrEqualTo(String value) {
            addCriterion("brand_label_name <=", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameLike(String value) {
            addCriterion("brand_label_name like", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameNotLike(String value) {
            addCriterion("brand_label_name not like", value, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameIn(List<String> values) {
            addCriterion("brand_label_name in", values, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameNotIn(List<String> values) {
            addCriterion("brand_label_name not in", values, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameBetween(String value1, String value2) {
            addCriterion("brand_label_name between", value1, value2, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelNameNotBetween(String value1, String value2) {
            addCriterion("brand_label_name not between", value1, value2, "brandLabelName");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortIsNull() {
            addCriterion("brand_label_sort is null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortIsNotNull() {
            addCriterion("brand_label_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortEqualTo(Integer value) {
            addCriterion("brand_label_sort =", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortNotEqualTo(Integer value) {
            addCriterion("brand_label_sort <>", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortGreaterThan(Integer value) {
            addCriterion("brand_label_sort >", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_label_sort >=", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortLessThan(Integer value) {
            addCriterion("brand_label_sort <", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortLessThanOrEqualTo(Integer value) {
            addCriterion("brand_label_sort <=", value, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortIn(List<Integer> values) {
            addCriterion("brand_label_sort in", values, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortNotIn(List<Integer> values) {
            addCriterion("brand_label_sort not in", values, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortBetween(Integer value1, Integer value2) {
            addCriterion("brand_label_sort between", value1, value2, "brandLabelSort");
            return (Criteria) this;
        }

        public Criteria andBrandLabelSortNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_label_sort not between", value1, value2, "brandLabelSort");
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