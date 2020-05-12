package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoryCommissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryCommissionExample() {
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

        public Criteria andCommissionIdIsNull() {
            addCriterion("commission_id is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIdIsNotNull() {
            addCriterion("commission_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionIdEqualTo(Integer value) {
            addCriterion("commission_id =", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotEqualTo(Integer value) {
            addCriterion("commission_id <>", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdGreaterThan(Integer value) {
            addCriterion("commission_id >", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_id >=", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdLessThan(Integer value) {
            addCriterion("commission_id <", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("commission_id <=", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdIn(List<Integer> values) {
            addCriterion("commission_id in", values, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotIn(List<Integer> values) {
            addCriterion("commission_id not in", values, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdBetween(Integer value1, Integer value2) {
            addCriterion("commission_id between", value1, value2, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_id not between", value1, value2, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Integer value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Integer value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Integer value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Integer value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Integer value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Integer> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Integer> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateIsNull() {
            addCriterion("self_commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateIsNotNull() {
            addCriterion("self_commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateEqualTo(Integer value) {
            addCriterion("self_commission_rate =", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateNotEqualTo(Integer value) {
            addCriterion("self_commission_rate <>", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateGreaterThan(Integer value) {
            addCriterion("self_commission_rate >", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_commission_rate >=", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateLessThan(Integer value) {
            addCriterion("self_commission_rate <", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateLessThanOrEqualTo(Integer value) {
            addCriterion("self_commission_rate <=", value, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateIn(List<Integer> values) {
            addCriterion("self_commission_rate in", values, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateNotIn(List<Integer> values) {
            addCriterion("self_commission_rate not in", values, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateBetween(Integer value1, Integer value2) {
            addCriterion("self_commission_rate between", value1, value2, "selfCommissionRate");
            return (Criteria) this;
        }

        public Criteria andSelfCommissionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("self_commission_rate not between", value1, value2, "selfCommissionRate");
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