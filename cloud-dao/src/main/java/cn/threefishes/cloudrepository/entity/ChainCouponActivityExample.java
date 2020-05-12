package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ChainCouponActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChainCouponActivityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNull() {
            addCriterion("area_info is null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNotNull() {
            addCriterion("area_info is not null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoEqualTo(String value) {
            addCriterion("area_info =", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotEqualTo(String value) {
            addCriterion("area_info <>", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThan(String value) {
            addCriterion("area_info >", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("area_info >=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThan(String value) {
            addCriterion("area_info <", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("area_info <=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLike(String value) {
            addCriterion("area_info like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotLike(String value) {
            addCriterion("area_info not like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIn(List<String> values) {
            addCriterion("area_info in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotIn(List<String> values) {
            addCriterion("area_info not in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoBetween(String value1, String value2) {
            addCriterion("area_info between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotBetween(String value1, String value2) {
            addCriterion("area_info not between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateIsNull() {
            addCriterion("chain_able_state is null");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateIsNotNull() {
            addCriterion("chain_able_state is not null");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateEqualTo(Integer value) {
            addCriterion("chain_able_state =", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateNotEqualTo(Integer value) {
            addCriterion("chain_able_state <>", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateGreaterThan(Integer value) {
            addCriterion("chain_able_state >", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_able_state >=", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateLessThan(Integer value) {
            addCriterion("chain_able_state <", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateLessThanOrEqualTo(Integer value) {
            addCriterion("chain_able_state <=", value, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateIn(List<Integer> values) {
            addCriterion("chain_able_state in", values, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateNotIn(List<Integer> values) {
            addCriterion("chain_able_state not in", values, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateBetween(Integer value1, Integer value2) {
            addCriterion("chain_able_state between", value1, value2, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAbleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_able_state not between", value1, value2, "chainAbleState");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumIsNull() {
            addCriterion("chain_available_num is null");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumIsNotNull() {
            addCriterion("chain_available_num is not null");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumEqualTo(Integer value) {
            addCriterion("chain_available_num =", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumNotEqualTo(Integer value) {
            addCriterion("chain_available_num <>", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumGreaterThan(Integer value) {
            addCriterion("chain_available_num >", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_available_num >=", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumLessThan(Integer value) {
            addCriterion("chain_available_num <", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumLessThanOrEqualTo(Integer value) {
            addCriterion("chain_available_num <=", value, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumIn(List<Integer> values) {
            addCriterion("chain_available_num in", values, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumNotIn(List<Integer> values) {
            addCriterion("chain_available_num not in", values, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumBetween(Integer value1, Integer value2) {
            addCriterion("chain_available_num between", value1, value2, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainAvailableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_available_num not between", value1, value2, "chainAvailableNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumIsNull() {
            addCriterion("chain_giveout_num is null");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumIsNotNull() {
            addCriterion("chain_giveout_num is not null");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumEqualTo(Integer value) {
            addCriterion("chain_giveout_num =", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumNotEqualTo(Integer value) {
            addCriterion("chain_giveout_num <>", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumGreaterThan(Integer value) {
            addCriterion("chain_giveout_num >", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_giveout_num >=", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumLessThan(Integer value) {
            addCriterion("chain_giveout_num <", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumLessThanOrEqualTo(Integer value) {
            addCriterion("chain_giveout_num <=", value, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumIn(List<Integer> values) {
            addCriterion("chain_giveout_num in", values, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumNotIn(List<Integer> values) {
            addCriterion("chain_giveout_num not in", values, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumBetween(Integer value1, Integer value2) {
            addCriterion("chain_giveout_num between", value1, value2, "chainGiveoutNum");
            return (Criteria) this;
        }

        public Criteria andChainGiveoutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_giveout_num not between", value1, value2, "chainGiveoutNum");
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