package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChainServicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChainServicesExample() {
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

        public Criteria andServicesIdIsNull() {
            addCriterion("services_id is null");
            return (Criteria) this;
        }

        public Criteria andServicesIdIsNotNull() {
            addCriterion("services_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicesIdEqualTo(Integer value) {
            addCriterion("services_id =", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdNotEqualTo(Integer value) {
            addCriterion("services_id <>", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdGreaterThan(Integer value) {
            addCriterion("services_id >", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("services_id >=", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdLessThan(Integer value) {
            addCriterion("services_id <", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdLessThanOrEqualTo(Integer value) {
            addCriterion("services_id <=", value, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdIn(List<Integer> values) {
            addCriterion("services_id in", values, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdNotIn(List<Integer> values) {
            addCriterion("services_id not in", values, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdBetween(Integer value1, Integer value2) {
            addCriterion("services_id between", value1, value2, "servicesId");
            return (Criteria) this;
        }

        public Criteria andServicesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("services_id not between", value1, value2, "servicesId");
            return (Criteria) this;
        }

        public Criteria andAbleStateIsNull() {
            addCriterion("able_state is null");
            return (Criteria) this;
        }

        public Criteria andAbleStateIsNotNull() {
            addCriterion("able_state is not null");
            return (Criteria) this;
        }

        public Criteria andAbleStateEqualTo(Integer value) {
            addCriterion("able_state =", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateNotEqualTo(Integer value) {
            addCriterion("able_state <>", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateGreaterThan(Integer value) {
            addCriterion("able_state >", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("able_state >=", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateLessThan(Integer value) {
            addCriterion("able_state <", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateLessThanOrEqualTo(Integer value) {
            addCriterion("able_state <=", value, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateIn(List<Integer> values) {
            addCriterion("able_state in", values, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateNotIn(List<Integer> values) {
            addCriterion("able_state not in", values, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateBetween(Integer value1, Integer value2) {
            addCriterion("able_state between", value1, value2, "ableState");
            return (Criteria) this;
        }

        public Criteria andAbleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("able_state not between", value1, value2, "ableState");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andChainNameIsNull() {
            addCriterion("chain_name is null");
            return (Criteria) this;
        }

        public Criteria andChainNameIsNotNull() {
            addCriterion("chain_name is not null");
            return (Criteria) this;
        }

        public Criteria andChainNameEqualTo(String value) {
            addCriterion("chain_name =", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotEqualTo(String value) {
            addCriterion("chain_name <>", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameGreaterThan(String value) {
            addCriterion("chain_name >", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameGreaterThanOrEqualTo(String value) {
            addCriterion("chain_name >=", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLessThan(String value) {
            addCriterion("chain_name <", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLessThanOrEqualTo(String value) {
            addCriterion("chain_name <=", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLike(String value) {
            addCriterion("chain_name like", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotLike(String value) {
            addCriterion("chain_name not like", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameIn(List<String> values) {
            addCriterion("chain_name in", values, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotIn(List<String> values) {
            addCriterion("chain_name not in", values, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameBetween(String value1, String value2) {
            addCriterion("chain_name between", value1, value2, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotBetween(String value1, String value2) {
            addCriterion("chain_name not between", value1, value2, "chainName");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionIsNull() {
            addCriterion("services_description is null");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionIsNotNull() {
            addCriterion("services_description is not null");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionEqualTo(String value) {
            addCriterion("services_description =", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionNotEqualTo(String value) {
            addCriterion("services_description <>", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionGreaterThan(String value) {
            addCriterion("services_description >", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("services_description >=", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionLessThan(String value) {
            addCriterion("services_description <", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("services_description <=", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionLike(String value) {
            addCriterion("services_description like", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionNotLike(String value) {
            addCriterion("services_description not like", value, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionIn(List<String> values) {
            addCriterion("services_description in", values, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionNotIn(List<String> values) {
            addCriterion("services_description not in", values, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionBetween(String value1, String value2) {
            addCriterion("services_description between", value1, value2, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesDescriptionNotBetween(String value1, String value2) {
            addCriterion("services_description not between", value1, value2, "servicesDescription");
            return (Criteria) this;
        }

        public Criteria andServicesNameIsNull() {
            addCriterion("services_name is null");
            return (Criteria) this;
        }

        public Criteria andServicesNameIsNotNull() {
            addCriterion("services_name is not null");
            return (Criteria) this;
        }

        public Criteria andServicesNameEqualTo(String value) {
            addCriterion("services_name =", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameNotEqualTo(String value) {
            addCriterion("services_name <>", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameGreaterThan(String value) {
            addCriterion("services_name >", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameGreaterThanOrEqualTo(String value) {
            addCriterion("services_name >=", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameLessThan(String value) {
            addCriterion("services_name <", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameLessThanOrEqualTo(String value) {
            addCriterion("services_name <=", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameLike(String value) {
            addCriterion("services_name like", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameNotLike(String value) {
            addCriterion("services_name not like", value, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameIn(List<String> values) {
            addCriterion("services_name in", values, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameNotIn(List<String> values) {
            addCriterion("services_name not in", values, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameBetween(String value1, String value2) {
            addCriterion("services_name between", value1, value2, "servicesName");
            return (Criteria) this;
        }

        public Criteria andServicesNameNotBetween(String value1, String value2) {
            addCriterion("services_name not between", value1, value2, "servicesName");
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