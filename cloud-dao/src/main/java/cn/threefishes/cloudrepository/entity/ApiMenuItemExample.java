package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ApiMenuItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiMenuItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("Item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("Item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("Item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("Item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("Item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("Item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("Item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("Item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("Item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("Item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemDataIsNull() {
            addCriterion("item_data is null");
            return (Criteria) this;
        }

        public Criteria andItemDataIsNotNull() {
            addCriterion("item_data is not null");
            return (Criteria) this;
        }

        public Criteria andItemDataEqualTo(String value) {
            addCriterion("item_data =", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataNotEqualTo(String value) {
            addCriterion("item_data <>", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataGreaterThan(String value) {
            addCriterion("item_data >", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataGreaterThanOrEqualTo(String value) {
            addCriterion("item_data >=", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataLessThan(String value) {
            addCriterion("item_data <", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataLessThanOrEqualTo(String value) {
            addCriterion("item_data <=", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataLike(String value) {
            addCriterion("item_data like", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataNotLike(String value) {
            addCriterion("item_data not like", value, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataIn(List<String> values) {
            addCriterion("item_data in", values, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataNotIn(List<String> values) {
            addCriterion("item_data not in", values, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataBetween(String value1, String value2) {
            addCriterion("item_data between", value1, value2, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemDataNotBetween(String value1, String value2) {
            addCriterion("item_data not between", value1, value2, "itemData");
            return (Criteria) this;
        }

        public Criteria andItemMoreIsNull() {
            addCriterion("item_more is null");
            return (Criteria) this;
        }

        public Criteria andItemMoreIsNotNull() {
            addCriterion("item_more is not null");
            return (Criteria) this;
        }

        public Criteria andItemMoreEqualTo(String value) {
            addCriterion("item_more =", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreNotEqualTo(String value) {
            addCriterion("item_more <>", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreGreaterThan(String value) {
            addCriterion("item_more >", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreGreaterThanOrEqualTo(String value) {
            addCriterion("item_more >=", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreLessThan(String value) {
            addCriterion("item_more <", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreLessThanOrEqualTo(String value) {
            addCriterion("item_more <=", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreLike(String value) {
            addCriterion("item_more like", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreNotLike(String value) {
            addCriterion("item_more not like", value, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreIn(List<String> values) {
            addCriterion("item_more in", values, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreNotIn(List<String> values) {
            addCriterion("item_more not in", values, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreBetween(String value1, String value2) {
            addCriterion("item_more between", value1, value2, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemMoreNotBetween(String value1, String value2) {
            addCriterion("item_more not between", value1, value2, "itemMore");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSubitemDataIsNull() {
            addCriterion("subitem_data is null");
            return (Criteria) this;
        }

        public Criteria andSubitemDataIsNotNull() {
            addCriterion("subitem_data is not null");
            return (Criteria) this;
        }

        public Criteria andSubitemDataEqualTo(String value) {
            addCriterion("subitem_data =", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataNotEqualTo(String value) {
            addCriterion("subitem_data <>", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataGreaterThan(String value) {
            addCriterion("subitem_data >", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataGreaterThanOrEqualTo(String value) {
            addCriterion("subitem_data >=", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataLessThan(String value) {
            addCriterion("subitem_data <", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataLessThanOrEqualTo(String value) {
            addCriterion("subitem_data <=", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataLike(String value) {
            addCriterion("subitem_data like", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataNotLike(String value) {
            addCriterion("subitem_data not like", value, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataIn(List<String> values) {
            addCriterion("subitem_data in", values, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataNotIn(List<String> values) {
            addCriterion("subitem_data not in", values, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataBetween(String value1, String value2) {
            addCriterion("subitem_data between", value1, value2, "subitemData");
            return (Criteria) this;
        }

        public Criteria andSubitemDataNotBetween(String value1, String value2) {
            addCriterion("subitem_data not between", value1, value2, "subitemData");
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