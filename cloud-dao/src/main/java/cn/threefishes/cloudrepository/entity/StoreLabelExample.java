package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreLabelExample() {
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

        public Criteria andStoreLabelIdIsNull() {
            addCriterion("store_label_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdIsNotNull() {
            addCriterion("store_label_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdEqualTo(Integer value) {
            addCriterion("store_label_id =", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdNotEqualTo(Integer value) {
            addCriterion("store_label_id <>", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdGreaterThan(Integer value) {
            addCriterion("store_label_id >", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_label_id >=", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdLessThan(Integer value) {
            addCriterion("store_label_id <", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_label_id <=", value, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdIn(List<Integer> values) {
            addCriterion("store_label_id in", values, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdNotIn(List<Integer> values) {
            addCriterion("store_label_id not in", values, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("store_label_id between", value1, value2, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andStoreLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_label_id not between", value1, value2, "storeLabelId");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andIsFoldIsNull() {
            addCriterion("is_fold is null");
            return (Criteria) this;
        }

        public Criteria andIsFoldIsNotNull() {
            addCriterion("is_fold is not null");
            return (Criteria) this;
        }

        public Criteria andIsFoldEqualTo(Integer value) {
            addCriterion("is_fold =", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldNotEqualTo(Integer value) {
            addCriterion("is_fold <>", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldGreaterThan(Integer value) {
            addCriterion("is_fold >", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_fold >=", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldLessThan(Integer value) {
            addCriterion("is_fold <", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldLessThanOrEqualTo(Integer value) {
            addCriterion("is_fold <=", value, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldIn(List<Integer> values) {
            addCriterion("is_fold in", values, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldNotIn(List<Integer> values) {
            addCriterion("is_fold not in", values, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldBetween(Integer value1, Integer value2) {
            addCriterion("is_fold between", value1, value2, "isFold");
            return (Criteria) this;
        }

        public Criteria andIsFoldNotBetween(Integer value1, Integer value2) {
            addCriterion("is_fold not between", value1, value2, "isFold");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andStoreLabelNameIsNull() {
            addCriterion("store_label_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameIsNotNull() {
            addCriterion("store_label_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameEqualTo(String value) {
            addCriterion("store_label_name =", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameNotEqualTo(String value) {
            addCriterion("store_label_name <>", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameGreaterThan(String value) {
            addCriterion("store_label_name >", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_label_name >=", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameLessThan(String value) {
            addCriterion("store_label_name <", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameLessThanOrEqualTo(String value) {
            addCriterion("store_label_name <=", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameLike(String value) {
            addCriterion("store_label_name like", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameNotLike(String value) {
            addCriterion("store_label_name not like", value, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameIn(List<String> values) {
            addCriterion("store_label_name in", values, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameNotIn(List<String> values) {
            addCriterion("store_label_name not in", values, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameBetween(String value1, String value2) {
            addCriterion("store_label_name between", value1, value2, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelNameNotBetween(String value1, String value2) {
            addCriterion("store_label_name not between", value1, value2, "storeLabelName");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortIsNull() {
            addCriterion("store_label_sort is null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortIsNotNull() {
            addCriterion("store_label_sort is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortEqualTo(Integer value) {
            addCriterion("store_label_sort =", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortNotEqualTo(Integer value) {
            addCriterion("store_label_sort <>", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortGreaterThan(Integer value) {
            addCriterion("store_label_sort >", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_label_sort >=", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortLessThan(Integer value) {
            addCriterion("store_label_sort <", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortLessThanOrEqualTo(Integer value) {
            addCriterion("store_label_sort <=", value, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortIn(List<Integer> values) {
            addCriterion("store_label_sort in", values, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortNotIn(List<Integer> values) {
            addCriterion("store_label_sort not in", values, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortBetween(Integer value1, Integer value2) {
            addCriterion("store_label_sort between", value1, value2, "storeLabelSort");
            return (Criteria) this;
        }

        public Criteria andStoreLabelSortNotBetween(Integer value1, Integer value2) {
            addCriterion("store_label_sort not between", value1, value2, "storeLabelSort");
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