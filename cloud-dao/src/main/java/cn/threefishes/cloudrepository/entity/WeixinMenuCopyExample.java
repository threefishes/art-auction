package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinMenuCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinMenuCopyExample() {
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

        public Criteria andClickMsgTypeIsNull() {
            addCriterion("click_msg_type is null");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeIsNotNull() {
            addCriterion("click_msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeEqualTo(String value) {
            addCriterion("click_msg_type =", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeNotEqualTo(String value) {
            addCriterion("click_msg_type <>", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeGreaterThan(String value) {
            addCriterion("click_msg_type >", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("click_msg_type >=", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeLessThan(String value) {
            addCriterion("click_msg_type <", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("click_msg_type <=", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeLike(String value) {
            addCriterion("click_msg_type like", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeNotLike(String value) {
            addCriterion("click_msg_type not like", value, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeIn(List<String> values) {
            addCriterion("click_msg_type in", values, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeNotIn(List<String> values) {
            addCriterion("click_msg_type not in", values, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeBetween(String value1, String value2) {
            addCriterion("click_msg_type between", value1, value2, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andClickMsgTypeNotBetween(String value1, String value2) {
            addCriterion("click_msg_type not between", value1, value2, "clickMsgType");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNull() {
            addCriterion("menu_key is null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNotNull() {
            addCriterion("menu_key is not null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyEqualTo(String value) {
            addCriterion("menu_key =", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotEqualTo(String value) {
            addCriterion("menu_key <>", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThan(String value) {
            addCriterion("menu_key >", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThanOrEqualTo(String value) {
            addCriterion("menu_key >=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThan(String value) {
            addCriterion("menu_key <", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThanOrEqualTo(String value) {
            addCriterion("menu_key <=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLike(String value) {
            addCriterion("menu_key like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotLike(String value) {
            addCriterion("menu_key not like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIn(List<String> values) {
            addCriterion("menu_key in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotIn(List<String> values) {
            addCriterion("menu_key not in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyBetween(String value1, String value2) {
            addCriterion("menu_key between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotBetween(String value1, String value2) {
            addCriterion("menu_key not between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("menu_sort is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("menu_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Integer value) {
            addCriterion("menu_sort =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Integer value) {
            addCriterion("menu_sort <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Integer value) {
            addCriterion("menu_sort >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_sort >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Integer value) {
            addCriterion("menu_sort <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("menu_sort <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Integer> values) {
            addCriterion("menu_sort in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Integer> values) {
            addCriterion("menu_sort not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuStateIsNull() {
            addCriterion("menu_state is null");
            return (Criteria) this;
        }

        public Criteria andMenuStateIsNotNull() {
            addCriterion("menu_state is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStateEqualTo(Integer value) {
            addCriterion("menu_state =", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotEqualTo(Integer value) {
            addCriterion("menu_state <>", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateGreaterThan(Integer value) {
            addCriterion("menu_state >", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_state >=", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateLessThan(Integer value) {
            addCriterion("menu_state <", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateLessThanOrEqualTo(Integer value) {
            addCriterion("menu_state <=", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateIn(List<Integer> values) {
            addCriterion("menu_state in", values, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotIn(List<Integer> values) {
            addCriterion("menu_state not in", values, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateBetween(Integer value1, Integer value2) {
            addCriterion("menu_state between", value1, value2, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_state not between", value1, value2, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlIsNull() {
            addCriterion("menu_view_url is null");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlIsNotNull() {
            addCriterion("menu_view_url is not null");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlEqualTo(String value) {
            addCriterion("menu_view_url =", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlNotEqualTo(String value) {
            addCriterion("menu_view_url <>", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlGreaterThan(String value) {
            addCriterion("menu_view_url >", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlGreaterThanOrEqualTo(String value) {
            addCriterion("menu_view_url >=", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlLessThan(String value) {
            addCriterion("menu_view_url <", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlLessThanOrEqualTo(String value) {
            addCriterion("menu_view_url <=", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlLike(String value) {
            addCriterion("menu_view_url like", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlNotLike(String value) {
            addCriterion("menu_view_url not like", value, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlIn(List<String> values) {
            addCriterion("menu_view_url in", values, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlNotIn(List<String> values) {
            addCriterion("menu_view_url not in", values, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlBetween(String value1, String value2) {
            addCriterion("menu_view_url between", value1, value2, "menuViewUrl");
            return (Criteria) this;
        }

        public Criteria andMenuViewUrlNotBetween(String value1, String value2) {
            addCriterion("menu_view_url not between", value1, value2, "menuViewUrl");
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

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
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