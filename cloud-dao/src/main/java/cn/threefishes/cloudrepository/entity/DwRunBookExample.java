package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class DwRunBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DwRunBookExample() {
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

        public Criteria andRunBookIdIsNull() {
            addCriterion("run_book_id is null");
            return (Criteria) this;
        }

        public Criteria andRunBookIdIsNotNull() {
            addCriterion("run_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andRunBookIdEqualTo(Integer value) {
            addCriterion("run_book_id =", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdNotEqualTo(Integer value) {
            addCriterion("run_book_id <>", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdGreaterThan(Integer value) {
            addCriterion("run_book_id >", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_book_id >=", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdLessThan(Integer value) {
            addCriterion("run_book_id <", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("run_book_id <=", value, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdIn(List<Integer> values) {
            addCriterion("run_book_id in", values, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdNotIn(List<Integer> values) {
            addCriterion("run_book_id not in", values, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdBetween(Integer value1, Integer value2) {
            addCriterion("run_book_id between", value1, value2, "runBookId");
            return (Criteria) this;
        }

        public Criteria andRunBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("run_book_id not between", value1, value2, "runBookId");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNull() {
            addCriterion("orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNotNull() {
            addCriterion("orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnEqualTo(Long value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(Long value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(Long value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(Long value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(Long value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<Long> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<Long> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(Long value1, Long value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(Long value1, Long value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andRunBookStateIsNull() {
            addCriterion("run_book_state is null");
            return (Criteria) this;
        }

        public Criteria andRunBookStateIsNotNull() {
            addCriterion("run_book_state is not null");
            return (Criteria) this;
        }

        public Criteria andRunBookStateEqualTo(Integer value) {
            addCriterion("run_book_state =", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateNotEqualTo(Integer value) {
            addCriterion("run_book_state <>", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateGreaterThan(Integer value) {
            addCriterion("run_book_state >", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_book_state >=", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateLessThan(Integer value) {
            addCriterion("run_book_state <", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateLessThanOrEqualTo(Integer value) {
            addCriterion("run_book_state <=", value, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateIn(List<Integer> values) {
            addCriterion("run_book_state in", values, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateNotIn(List<Integer> values) {
            addCriterion("run_book_state not in", values, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateBetween(Integer value1, Integer value2) {
            addCriterion("run_book_state between", value1, value2, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookStateNotBetween(Integer value1, Integer value2) {
            addCriterion("run_book_state not between", value1, value2, "runBookState");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeIsNull() {
            addCriterion("run_book_type is null");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeIsNotNull() {
            addCriterion("run_book_type is not null");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeEqualTo(Integer value) {
            addCriterion("run_book_type =", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeNotEqualTo(Integer value) {
            addCriterion("run_book_type <>", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeGreaterThan(Integer value) {
            addCriterion("run_book_type >", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_book_type >=", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeLessThan(Integer value) {
            addCriterion("run_book_type <", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeLessThanOrEqualTo(Integer value) {
            addCriterion("run_book_type <=", value, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeIn(List<Integer> values) {
            addCriterion("run_book_type in", values, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeNotIn(List<Integer> values) {
            addCriterion("run_book_type not in", values, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeBetween(Integer value1, Integer value2) {
            addCriterion("run_book_type between", value1, value2, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("run_book_type not between", value1, value2, "runBookType");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsIsNull() {
            addCriterion("run_book_params is null");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsIsNotNull() {
            addCriterion("run_book_params is not null");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsEqualTo(String value) {
            addCriterion("run_book_params =", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsNotEqualTo(String value) {
            addCriterion("run_book_params <>", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsGreaterThan(String value) {
            addCriterion("run_book_params >", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsGreaterThanOrEqualTo(String value) {
            addCriterion("run_book_params >=", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsLessThan(String value) {
            addCriterion("run_book_params <", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsLessThanOrEqualTo(String value) {
            addCriterion("run_book_params <=", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsLike(String value) {
            addCriterion("run_book_params like", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsNotLike(String value) {
            addCriterion("run_book_params not like", value, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsIn(List<String> values) {
            addCriterion("run_book_params in", values, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsNotIn(List<String> values) {
            addCriterion("run_book_params not in", values, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsBetween(String value1, String value2) {
            addCriterion("run_book_params between", value1, value2, "runBookParams");
            return (Criteria) this;
        }

        public Criteria andRunBookParamsNotBetween(String value1, String value2) {
            addCriterion("run_book_params not between", value1, value2, "runBookParams");
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