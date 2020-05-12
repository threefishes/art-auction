package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class IndexFloorItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexFloorItemExample() {
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

        public Criteria andFloorItemIdIsNull() {
            addCriterion("floor_item_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdIsNotNull() {
            addCriterion("floor_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdEqualTo(Integer value) {
            addCriterion("floor_item_id =", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdNotEqualTo(Integer value) {
            addCriterion("floor_item_id <>", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdGreaterThan(Integer value) {
            addCriterion("floor_item_id >", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_item_id >=", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdLessThan(Integer value) {
            addCriterion("floor_item_id <", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_item_id <=", value, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdIn(List<Integer> values) {
            addCriterion("floor_item_id in", values, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdNotIn(List<Integer> values) {
            addCriterion("floor_item_id not in", values, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_item_id between", value1, value2, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_item_id not between", value1, value2, "floorItemId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyIsNull() {
            addCriterion("floor_item_key is null");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyIsNotNull() {
            addCriterion("floor_item_key is not null");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyEqualTo(String value) {
            addCriterion("floor_item_key =", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyNotEqualTo(String value) {
            addCriterion("floor_item_key <>", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyGreaterThan(String value) {
            addCriterion("floor_item_key >", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyGreaterThanOrEqualTo(String value) {
            addCriterion("floor_item_key >=", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyLessThan(String value) {
            addCriterion("floor_item_key <", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyLessThanOrEqualTo(String value) {
            addCriterion("floor_item_key <=", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyLike(String value) {
            addCriterion("floor_item_key like", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyNotLike(String value) {
            addCriterion("floor_item_key not like", value, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyIn(List<String> values) {
            addCriterion("floor_item_key in", values, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyNotIn(List<String> values) {
            addCriterion("floor_item_key not in", values, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyBetween(String value1, String value2) {
            addCriterion("floor_item_key between", value1, value2, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemKeyNotBetween(String value1, String value2) {
            addCriterion("floor_item_key not between", value1, value2, "floorItemKey");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameIsNull() {
            addCriterion("floor_item_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameIsNotNull() {
            addCriterion("floor_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameEqualTo(String value) {
            addCriterion("floor_item_name =", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameNotEqualTo(String value) {
            addCriterion("floor_item_name <>", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameGreaterThan(String value) {
            addCriterion("floor_item_name >", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_item_name >=", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameLessThan(String value) {
            addCriterion("floor_item_name <", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameLessThanOrEqualTo(String value) {
            addCriterion("floor_item_name <=", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameLike(String value) {
            addCriterion("floor_item_name like", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameNotLike(String value) {
            addCriterion("floor_item_name not like", value, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameIn(List<String> values) {
            addCriterion("floor_item_name in", values, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameNotIn(List<String> values) {
            addCriterion("floor_item_name not in", values, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameBetween(String value1, String value2) {
            addCriterion("floor_item_name between", value1, value2, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemNameNotBetween(String value1, String value2) {
            addCriterion("floor_item_name not between", value1, value2, "floorItemName");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortIsNull() {
            addCriterion("floor_item_sort is null");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortIsNotNull() {
            addCriterion("floor_item_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortEqualTo(Integer value) {
            addCriterion("floor_item_sort =", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortNotEqualTo(Integer value) {
            addCriterion("floor_item_sort <>", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortGreaterThan(Integer value) {
            addCriterion("floor_item_sort >", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_item_sort >=", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortLessThan(Integer value) {
            addCriterion("floor_item_sort <", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortLessThanOrEqualTo(Integer value) {
            addCriterion("floor_item_sort <=", value, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortIn(List<Integer> values) {
            addCriterion("floor_item_sort in", values, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortNotIn(List<Integer> values) {
            addCriterion("floor_item_sort not in", values, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortBetween(Integer value1, Integer value2) {
            addCriterion("floor_item_sort between", value1, value2, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemSortNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_item_sort not between", value1, value2, "floorItemSort");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeIsNull() {
            addCriterion("floor_item_type is null");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeIsNotNull() {
            addCriterion("floor_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeEqualTo(String value) {
            addCriterion("floor_item_type =", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeNotEqualTo(String value) {
            addCriterion("floor_item_type <>", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeGreaterThan(String value) {
            addCriterion("floor_item_type >", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("floor_item_type >=", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeLessThan(String value) {
            addCriterion("floor_item_type <", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeLessThanOrEqualTo(String value) {
            addCriterion("floor_item_type <=", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeLike(String value) {
            addCriterion("floor_item_type like", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeNotLike(String value) {
            addCriterion("floor_item_type not like", value, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeIn(List<String> values) {
            addCriterion("floor_item_type in", values, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeNotIn(List<String> values) {
            addCriterion("floor_item_type not in", values, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeBetween(String value1, String value2) {
            addCriterion("floor_item_type between", value1, value2, "floorItemType");
            return (Criteria) this;
        }

        public Criteria andFloorItemTypeNotBetween(String value1, String value2) {
            addCriterion("floor_item_type not between", value1, value2, "floorItemType");
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