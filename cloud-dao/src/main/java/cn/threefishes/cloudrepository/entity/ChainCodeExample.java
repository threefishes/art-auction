package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ChainCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChainCodeExample() {
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

        public Criteria andChainCodeIdIsNull() {
            addCriterion("chain_code_id is null");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdIsNotNull() {
            addCriterion("chain_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdEqualTo(Integer value) {
            addCriterion("chain_code_id =", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdNotEqualTo(Integer value) {
            addCriterion("chain_code_id <>", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdGreaterThan(Integer value) {
            addCriterion("chain_code_id >", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_code_id >=", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdLessThan(Integer value) {
            addCriterion("chain_code_id <", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("chain_code_id <=", value, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdIn(List<Integer> values) {
            addCriterion("chain_code_id in", values, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdNotIn(List<Integer> values) {
            addCriterion("chain_code_id not in", values, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("chain_code_id between", value1, value2, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_code_id not between", value1, value2, "chainCodeId");
            return (Criteria) this;
        }

        public Criteria andChainIdIsNull() {
            addCriterion("chain_id is null");
            return (Criteria) this;
        }

        public Criteria andChainIdIsNotNull() {
            addCriterion("chain_id is not null");
            return (Criteria) this;
        }

        public Criteria andChainIdEqualTo(Integer value) {
            addCriterion("chain_id =", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotEqualTo(Integer value) {
            addCriterion("chain_id <>", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdGreaterThan(Integer value) {
            addCriterion("chain_id >", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_id >=", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdLessThan(Integer value) {
            addCriterion("chain_id <", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdLessThanOrEqualTo(Integer value) {
            addCriterion("chain_id <=", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdIn(List<Integer> values) {
            addCriterion("chain_id in", values, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotIn(List<Integer> values) {
            addCriterion("chain_id not in", values, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdBetween(Integer value1, Integer value2) {
            addCriterion("chain_id between", value1, value2, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_id not between", value1, value2, "chainId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andTakeCodeIsNull() {
            addCriterion("take_code is null");
            return (Criteria) this;
        }

        public Criteria andTakeCodeIsNotNull() {
            addCriterion("take_code is not null");
            return (Criteria) this;
        }

        public Criteria andTakeCodeEqualTo(Integer value) {
            addCriterion("take_code =", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeNotEqualTo(Integer value) {
            addCriterion("take_code <>", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeGreaterThan(Integer value) {
            addCriterion("take_code >", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_code >=", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeLessThan(Integer value) {
            addCriterion("take_code <", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("take_code <=", value, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeIn(List<Integer> values) {
            addCriterion("take_code in", values, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeNotIn(List<Integer> values) {
            addCriterion("take_code not in", values, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeBetween(Integer value1, Integer value2) {
            addCriterion("take_code between", value1, value2, "takeCode");
            return (Criteria) this;
        }

        public Criteria andTakeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("take_code not between", value1, value2, "takeCode");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNull() {
            addCriterion("use_state is null");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNotNull() {
            addCriterion("use_state is not null");
            return (Criteria) this;
        }

        public Criteria andUseStateEqualTo(Integer value) {
            addCriterion("use_state =", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotEqualTo(Integer value) {
            addCriterion("use_state <>", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThan(Integer value) {
            addCriterion("use_state >", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_state >=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThan(Integer value) {
            addCriterion("use_state <", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThanOrEqualTo(Integer value) {
            addCriterion("use_state <=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateIn(List<Integer> values) {
            addCriterion("use_state in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotIn(List<Integer> values) {
            addCriterion("use_state not in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateBetween(Integer value1, Integer value2) {
            addCriterion("use_state between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotBetween(Integer value1, Integer value2) {
            addCriterion("use_state not between", value1, value2, "useState");
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