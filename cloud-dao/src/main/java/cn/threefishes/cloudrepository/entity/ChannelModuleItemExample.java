package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ChannelModuleItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelModuleItemExample() {
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

        public Criteria andModuleItemIdIsNull() {
            addCriterion("module_item_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdIsNotNull() {
            addCriterion("module_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdEqualTo(Integer value) {
            addCriterion("module_item_id =", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdNotEqualTo(Integer value) {
            addCriterion("module_item_id <>", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdGreaterThan(Integer value) {
            addCriterion("module_item_id >", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_item_id >=", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdLessThan(Integer value) {
            addCriterion("module_item_id <", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_item_id <=", value, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdIn(List<Integer> values) {
            addCriterion("module_item_id in", values, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdNotIn(List<Integer> values) {
            addCriterion("module_item_id not in", values, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdBetween(Integer value1, Integer value2) {
            addCriterion("module_item_id between", value1, value2, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_item_id not between", value1, value2, "moduleItemId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyIsNull() {
            addCriterion("module_item_key is null");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyIsNotNull() {
            addCriterion("module_item_key is not null");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyEqualTo(String value) {
            addCriterion("module_item_key =", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyNotEqualTo(String value) {
            addCriterion("module_item_key <>", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyGreaterThan(String value) {
            addCriterion("module_item_key >", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyGreaterThanOrEqualTo(String value) {
            addCriterion("module_item_key >=", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyLessThan(String value) {
            addCriterion("module_item_key <", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyLessThanOrEqualTo(String value) {
            addCriterion("module_item_key <=", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyLike(String value) {
            addCriterion("module_item_key like", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyNotLike(String value) {
            addCriterion("module_item_key not like", value, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyIn(List<String> values) {
            addCriterion("module_item_key in", values, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyNotIn(List<String> values) {
            addCriterion("module_item_key not in", values, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyBetween(String value1, String value2) {
            addCriterion("module_item_key between", value1, value2, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemKeyNotBetween(String value1, String value2) {
            addCriterion("module_item_key not between", value1, value2, "moduleItemKey");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameIsNull() {
            addCriterion("module_item_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameIsNotNull() {
            addCriterion("module_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameEqualTo(String value) {
            addCriterion("module_item_name =", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameNotEqualTo(String value) {
            addCriterion("module_item_name <>", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameGreaterThan(String value) {
            addCriterion("module_item_name >", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_item_name >=", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameLessThan(String value) {
            addCriterion("module_item_name <", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameLessThanOrEqualTo(String value) {
            addCriterion("module_item_name <=", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameLike(String value) {
            addCriterion("module_item_name like", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameNotLike(String value) {
            addCriterion("module_item_name not like", value, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameIn(List<String> values) {
            addCriterion("module_item_name in", values, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameNotIn(List<String> values) {
            addCriterion("module_item_name not in", values, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameBetween(String value1, String value2) {
            addCriterion("module_item_name between", value1, value2, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemNameNotBetween(String value1, String value2) {
            addCriterion("module_item_name not between", value1, value2, "moduleItemName");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortIsNull() {
            addCriterion("module_item_sort is null");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortIsNotNull() {
            addCriterion("module_item_sort is not null");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortEqualTo(Integer value) {
            addCriterion("module_item_sort =", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortNotEqualTo(Integer value) {
            addCriterion("module_item_sort <>", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortGreaterThan(Integer value) {
            addCriterion("module_item_sort >", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_item_sort >=", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortLessThan(Integer value) {
            addCriterion("module_item_sort <", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortLessThanOrEqualTo(Integer value) {
            addCriterion("module_item_sort <=", value, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortIn(List<Integer> values) {
            addCriterion("module_item_sort in", values, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortNotIn(List<Integer> values) {
            addCriterion("module_item_sort not in", values, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortBetween(Integer value1, Integer value2) {
            addCriterion("module_item_sort between", value1, value2, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemSortNotBetween(Integer value1, Integer value2) {
            addCriterion("module_item_sort not between", value1, value2, "moduleItemSort");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeIsNull() {
            addCriterion("module_item_type is null");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeIsNotNull() {
            addCriterion("module_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeEqualTo(String value) {
            addCriterion("module_item_type =", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeNotEqualTo(String value) {
            addCriterion("module_item_type <>", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeGreaterThan(String value) {
            addCriterion("module_item_type >", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("module_item_type >=", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeLessThan(String value) {
            addCriterion("module_item_type <", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeLessThanOrEqualTo(String value) {
            addCriterion("module_item_type <=", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeLike(String value) {
            addCriterion("module_item_type like", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeNotLike(String value) {
            addCriterion("module_item_type not like", value, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeIn(List<String> values) {
            addCriterion("module_item_type in", values, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeNotIn(List<String> values) {
            addCriterion("module_item_type not in", values, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeBetween(String value1, String value2) {
            addCriterion("module_item_type between", value1, value2, "moduleItemType");
            return (Criteria) this;
        }

        public Criteria andModuleItemTypeNotBetween(String value1, String value2) {
            addCriterion("module_item_type not between", value1, value2, "moduleItemType");
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