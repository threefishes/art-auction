package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class FormatTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormatTemplateExample() {
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

        public Criteria andFormatIdIsNull() {
            addCriterion("format_id is null");
            return (Criteria) this;
        }

        public Criteria andFormatIdIsNotNull() {
            addCriterion("format_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormatIdEqualTo(Integer value) {
            addCriterion("format_id =", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdNotEqualTo(Integer value) {
            addCriterion("format_id <>", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdGreaterThan(Integer value) {
            addCriterion("format_id >", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("format_id >=", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdLessThan(Integer value) {
            addCriterion("format_id <", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdLessThanOrEqualTo(Integer value) {
            addCriterion("format_id <=", value, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdIn(List<Integer> values) {
            addCriterion("format_id in", values, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdNotIn(List<Integer> values) {
            addCriterion("format_id not in", values, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdBetween(Integer value1, Integer value2) {
            addCriterion("format_id between", value1, value2, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("format_id not between", value1, value2, "formatId");
            return (Criteria) this;
        }

        public Criteria andFormatNameIsNull() {
            addCriterion("format_name is null");
            return (Criteria) this;
        }

        public Criteria andFormatNameIsNotNull() {
            addCriterion("format_name is not null");
            return (Criteria) this;
        }

        public Criteria andFormatNameEqualTo(String value) {
            addCriterion("format_name =", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameNotEqualTo(String value) {
            addCriterion("format_name <>", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameGreaterThan(String value) {
            addCriterion("format_name >", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameGreaterThanOrEqualTo(String value) {
            addCriterion("format_name >=", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameLessThan(String value) {
            addCriterion("format_name <", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameLessThanOrEqualTo(String value) {
            addCriterion("format_name <=", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameLike(String value) {
            addCriterion("format_name like", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameNotLike(String value) {
            addCriterion("format_name not like", value, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameIn(List<String> values) {
            addCriterion("format_name in", values, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameNotIn(List<String> values) {
            addCriterion("format_name not in", values, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameBetween(String value1, String value2) {
            addCriterion("format_name between", value1, value2, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatNameNotBetween(String value1, String value2) {
            addCriterion("format_name not between", value1, value2, "formatName");
            return (Criteria) this;
        }

        public Criteria andFormatSiteIsNull() {
            addCriterion("format_site is null");
            return (Criteria) this;
        }

        public Criteria andFormatSiteIsNotNull() {
            addCriterion("format_site is not null");
            return (Criteria) this;
        }

        public Criteria andFormatSiteEqualTo(Integer value) {
            addCriterion("format_site =", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteNotEqualTo(Integer value) {
            addCriterion("format_site <>", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteGreaterThan(Integer value) {
            addCriterion("format_site >", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("format_site >=", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteLessThan(Integer value) {
            addCriterion("format_site <", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteLessThanOrEqualTo(Integer value) {
            addCriterion("format_site <=", value, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteIn(List<Integer> values) {
            addCriterion("format_site in", values, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteNotIn(List<Integer> values) {
            addCriterion("format_site not in", values, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteBetween(Integer value1, Integer value2) {
            addCriterion("format_site between", value1, value2, "formatSite");
            return (Criteria) this;
        }

        public Criteria andFormatSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("format_site not between", value1, value2, "formatSite");
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