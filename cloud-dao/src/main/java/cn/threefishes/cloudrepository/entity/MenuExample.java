package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuAdIsNull() {
            addCriterion("menu_ad is null");
            return (Criteria) this;
        }

        public Criteria andMenuAdIsNotNull() {
            addCriterion("menu_ad is not null");
            return (Criteria) this;
        }

        public Criteria andMenuAdEqualTo(String value) {
            addCriterion("menu_ad =", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdNotEqualTo(String value) {
            addCriterion("menu_ad <>", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdGreaterThan(String value) {
            addCriterion("menu_ad >", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_ad >=", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdLessThan(String value) {
            addCriterion("menu_ad <", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdLessThanOrEqualTo(String value) {
            addCriterion("menu_ad <=", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdLike(String value) {
            addCriterion("menu_ad like", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdNotLike(String value) {
            addCriterion("menu_ad not like", value, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdIn(List<String> values) {
            addCriterion("menu_ad in", values, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdNotIn(List<String> values) {
            addCriterion("menu_ad not in", values, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdBetween(String value1, String value2) {
            addCriterion("menu_ad between", value1, value2, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuAdNotBetween(String value1, String value2) {
            addCriterion("menu_ad not between", value1, value2, "menuAd");
            return (Criteria) this;
        }

        public Criteria andMenuDataIsNull() {
            addCriterion("menu_data is null");
            return (Criteria) this;
        }

        public Criteria andMenuDataIsNotNull() {
            addCriterion("menu_data is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDataEqualTo(String value) {
            addCriterion("menu_data =", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataNotEqualTo(String value) {
            addCriterion("menu_data <>", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataGreaterThan(String value) {
            addCriterion("menu_data >", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataGreaterThanOrEqualTo(String value) {
            addCriterion("menu_data >=", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataLessThan(String value) {
            addCriterion("menu_data <", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataLessThanOrEqualTo(String value) {
            addCriterion("menu_data <=", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataLike(String value) {
            addCriterion("menu_data like", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataNotLike(String value) {
            addCriterion("menu_data not like", value, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataIn(List<String> values) {
            addCriterion("menu_data in", values, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataNotIn(List<String> values) {
            addCriterion("menu_data not in", values, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataBetween(String value1, String value2) {
            addCriterion("menu_data between", value1, value2, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuDataNotBetween(String value1, String value2) {
            addCriterion("menu_data not between", value1, value2, "menuData");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("menu_icon is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("menu_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("menu_icon =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("menu_icon <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("menu_icon >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("menu_icon >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("menu_icon <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("menu_icon <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("menu_icon like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("menu_icon not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("menu_icon in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("menu_icon not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("menu_icon between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("menu_icon not between", value1, value2, "menuIcon");
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

        public Criteria andMenuNavIsNull() {
            addCriterion("menu_nav is null");
            return (Criteria) this;
        }

        public Criteria andMenuNavIsNotNull() {
            addCriterion("menu_nav is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNavEqualTo(String value) {
            addCriterion("menu_nav =", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavNotEqualTo(String value) {
            addCriterion("menu_nav <>", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavGreaterThan(String value) {
            addCriterion("menu_nav >", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavGreaterThanOrEqualTo(String value) {
            addCriterion("menu_nav >=", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavLessThan(String value) {
            addCriterion("menu_nav <", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavLessThanOrEqualTo(String value) {
            addCriterion("menu_nav <=", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavLike(String value) {
            addCriterion("menu_nav like", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavNotLike(String value) {
            addCriterion("menu_nav not like", value, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavIn(List<String> values) {
            addCriterion("menu_nav in", values, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavNotIn(List<String> values) {
            addCriterion("menu_nav not in", values, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavBetween(String value1, String value2) {
            addCriterion("menu_nav between", value1, value2, "menuNav");
            return (Criteria) this;
        }

        public Criteria andMenuNavNotBetween(String value1, String value2) {
            addCriterion("menu_nav not between", value1, value2, "menuNav");
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