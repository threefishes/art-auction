package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticlePositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlePositionExample() {
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

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryIsNull() {
            addCriterion("allow_add_category is null");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryIsNotNull() {
            addCriterion("allow_add_category is not null");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryEqualTo(Integer value) {
            addCriterion("allow_add_category =", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryNotEqualTo(Integer value) {
            addCriterion("allow_add_category <>", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryGreaterThan(Integer value) {
            addCriterion("allow_add_category >", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_add_category >=", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryLessThan(Integer value) {
            addCriterion("allow_add_category <", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("allow_add_category <=", value, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryIn(List<Integer> values) {
            addCriterion("allow_add_category in", values, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryNotIn(List<Integer> values) {
            addCriterion("allow_add_category not in", values, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryBetween(Integer value1, Integer value2) {
            addCriterion("allow_add_category between", value1, value2, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andAllowAddCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_add_category not between", value1, value2, "allowAddCategory");
            return (Criteria) this;
        }

        public Criteria andPositionTitleIsNull() {
            addCriterion("position_title is null");
            return (Criteria) this;
        }

        public Criteria andPositionTitleIsNotNull() {
            addCriterion("position_title is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTitleEqualTo(String value) {
            addCriterion("position_title =", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleNotEqualTo(String value) {
            addCriterion("position_title <>", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleGreaterThan(String value) {
            addCriterion("position_title >", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("position_title >=", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleLessThan(String value) {
            addCriterion("position_title <", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleLessThanOrEqualTo(String value) {
            addCriterion("position_title <=", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleLike(String value) {
            addCriterion("position_title like", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleNotLike(String value) {
            addCriterion("position_title not like", value, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleIn(List<String> values) {
            addCriterion("position_title in", values, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleNotIn(List<String> values) {
            addCriterion("position_title not in", values, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleBetween(String value1, String value2) {
            addCriterion("position_title between", value1, value2, "positionTitle");
            return (Criteria) this;
        }

        public Criteria andPositionTitleNotBetween(String value1, String value2) {
            addCriterion("position_title not between", value1, value2, "positionTitle");
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