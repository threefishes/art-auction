package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConformExample() {
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

        public Criteria andConformIdIsNull() {
            addCriterion("conform_id is null");
            return (Criteria) this;
        }

        public Criteria andConformIdIsNotNull() {
            addCriterion("conform_id is not null");
            return (Criteria) this;
        }

        public Criteria andConformIdEqualTo(Integer value) {
            addCriterion("conform_id =", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdNotEqualTo(Integer value) {
            addCriterion("conform_id <>", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdGreaterThan(Integer value) {
            addCriterion("conform_id >", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("conform_id >=", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdLessThan(Integer value) {
            addCriterion("conform_id <", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdLessThanOrEqualTo(Integer value) {
            addCriterion("conform_id <=", value, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdIn(List<Integer> values) {
            addCriterion("conform_id in", values, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdNotIn(List<Integer> values) {
            addCriterion("conform_id not in", values, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdBetween(Integer value1, Integer value2) {
            addCriterion("conform_id between", value1, value2, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("conform_id not between", value1, value2, "conformId");
            return (Criteria) this;
        }

        public Criteria andConformNameIsNull() {
            addCriterion("conform_name is null");
            return (Criteria) this;
        }

        public Criteria andConformNameIsNotNull() {
            addCriterion("conform_name is not null");
            return (Criteria) this;
        }

        public Criteria andConformNameEqualTo(String value) {
            addCriterion("conform_name =", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameNotEqualTo(String value) {
            addCriterion("conform_name <>", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameGreaterThan(String value) {
            addCriterion("conform_name >", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameGreaterThanOrEqualTo(String value) {
            addCriterion("conform_name >=", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameLessThan(String value) {
            addCriterion("conform_name <", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameLessThanOrEqualTo(String value) {
            addCriterion("conform_name <=", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameLike(String value) {
            addCriterion("conform_name like", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameNotLike(String value) {
            addCriterion("conform_name not like", value, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameIn(List<String> values) {
            addCriterion("conform_name in", values, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameNotIn(List<String> values) {
            addCriterion("conform_name not in", values, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameBetween(String value1, String value2) {
            addCriterion("conform_name between", value1, value2, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformNameNotBetween(String value1, String value2) {
            addCriterion("conform_name not between", value1, value2, "conformName");
            return (Criteria) this;
        }

        public Criteria andConformPriceIsNull() {
            addCriterion("conform_price is null");
            return (Criteria) this;
        }

        public Criteria andConformPriceIsNotNull() {
            addCriterion("conform_price is not null");
            return (Criteria) this;
        }

        public Criteria andConformPriceEqualTo(BigDecimal value) {
            addCriterion("conform_price =", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotEqualTo(BigDecimal value) {
            addCriterion("conform_price <>", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceGreaterThan(BigDecimal value) {
            addCriterion("conform_price >", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("conform_price >=", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceLessThan(BigDecimal value) {
            addCriterion("conform_price <", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("conform_price <=", value, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceIn(List<BigDecimal> values) {
            addCriterion("conform_price in", values, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotIn(List<BigDecimal> values) {
            addCriterion("conform_price not in", values, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conform_price between", value1, value2, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conform_price not between", value1, value2, "conformPrice");
            return (Criteria) this;
        }

        public Criteria andConformStateIsNull() {
            addCriterion("conform_state is null");
            return (Criteria) this;
        }

        public Criteria andConformStateIsNotNull() {
            addCriterion("conform_state is not null");
            return (Criteria) this;
        }

        public Criteria andConformStateEqualTo(Integer value) {
            addCriterion("conform_state =", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateNotEqualTo(Integer value) {
            addCriterion("conform_state <>", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateGreaterThan(Integer value) {
            addCriterion("conform_state >", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("conform_state >=", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateLessThan(Integer value) {
            addCriterion("conform_state <", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateLessThanOrEqualTo(Integer value) {
            addCriterion("conform_state <=", value, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateIn(List<Integer> values) {
            addCriterion("conform_state in", values, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateNotIn(List<Integer> values) {
            addCriterion("conform_state not in", values, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateBetween(Integer value1, Integer value2) {
            addCriterion("conform_state between", value1, value2, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformStateNotBetween(Integer value1, Integer value2) {
            addCriterion("conform_state not between", value1, value2, "conformState");
            return (Criteria) this;
        }

        public Criteria andConformTitleIsNull() {
            addCriterion("conform_title is null");
            return (Criteria) this;
        }

        public Criteria andConformTitleIsNotNull() {
            addCriterion("conform_title is not null");
            return (Criteria) this;
        }

        public Criteria andConformTitleEqualTo(String value) {
            addCriterion("conform_title =", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleNotEqualTo(String value) {
            addCriterion("conform_title <>", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleGreaterThan(String value) {
            addCriterion("conform_title >", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("conform_title >=", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleLessThan(String value) {
            addCriterion("conform_title <", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleLessThanOrEqualTo(String value) {
            addCriterion("conform_title <=", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleLike(String value) {
            addCriterion("conform_title like", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleNotLike(String value) {
            addCriterion("conform_title not like", value, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleIn(List<String> values) {
            addCriterion("conform_title in", values, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleNotIn(List<String> values) {
            addCriterion("conform_title not in", values, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleBetween(String value1, String value2) {
            addCriterion("conform_title between", value1, value2, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andConformTitleNotBetween(String value1, String value2) {
            addCriterion("conform_title not between", value1, value2, "conformTitle");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIsNull() {
            addCriterion("is_free_freight is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIsNotNull() {
            addCriterion("is_free_freight is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightEqualTo(Integer value) {
            addCriterion("is_free_freight =", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotEqualTo(Integer value) {
            addCriterion("is_free_freight <>", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightGreaterThan(Integer value) {
            addCriterion("is_free_freight >", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free_freight >=", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightLessThan(Integer value) {
            addCriterion("is_free_freight <", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightLessThanOrEqualTo(Integer value) {
            addCriterion("is_free_freight <=", value, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightIn(List<Integer> values) {
            addCriterion("is_free_freight in", values, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotIn(List<Integer> values) {
            addCriterion("is_free_freight not in", values, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightBetween(Integer value1, Integer value2) {
            addCriterion("is_free_freight between", value1, value2, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsFreeFreightNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free_freight not between", value1, value2, "isFreeFreight");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Integer value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Integer value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Integer value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Integer value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Integer value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Integer> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Integer> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Integer value1, Integer value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Integer value1, Integer value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsIsNull() {
            addCriterion("rule_out_area_ids is null");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsIsNotNull() {
            addCriterion("rule_out_area_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsEqualTo(String value) {
            addCriterion("rule_out_area_ids =", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsNotEqualTo(String value) {
            addCriterion("rule_out_area_ids <>", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsGreaterThan(String value) {
            addCriterion("rule_out_area_ids >", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsGreaterThanOrEqualTo(String value) {
            addCriterion("rule_out_area_ids >=", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsLessThan(String value) {
            addCriterion("rule_out_area_ids <", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsLessThanOrEqualTo(String value) {
            addCriterion("rule_out_area_ids <=", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsLike(String value) {
            addCriterion("rule_out_area_ids like", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsNotLike(String value) {
            addCriterion("rule_out_area_ids not like", value, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsIn(List<String> values) {
            addCriterion("rule_out_area_ids in", values, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsNotIn(List<String> values) {
            addCriterion("rule_out_area_ids not in", values, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsBetween(String value1, String value2) {
            addCriterion("rule_out_area_ids between", value1, value2, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaIdsNotBetween(String value1, String value2) {
            addCriterion("rule_out_area_ids not between", value1, value2, "ruleOutAreaIds");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesIsNull() {
            addCriterion("rule_out_area_names is null");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesIsNotNull() {
            addCriterion("rule_out_area_names is not null");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesEqualTo(String value) {
            addCriterion("rule_out_area_names =", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesNotEqualTo(String value) {
            addCriterion("rule_out_area_names <>", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesGreaterThan(String value) {
            addCriterion("rule_out_area_names >", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesGreaterThanOrEqualTo(String value) {
            addCriterion("rule_out_area_names >=", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesLessThan(String value) {
            addCriterion("rule_out_area_names <", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesLessThanOrEqualTo(String value) {
            addCriterion("rule_out_area_names <=", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesLike(String value) {
            addCriterion("rule_out_area_names like", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesNotLike(String value) {
            addCriterion("rule_out_area_names not like", value, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesIn(List<String> values) {
            addCriterion("rule_out_area_names in", values, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesNotIn(List<String> values) {
            addCriterion("rule_out_area_names not in", values, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesBetween(String value1, String value2) {
            addCriterion("rule_out_area_names between", value1, value2, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andRuleOutAreaNamesNotBetween(String value1, String value2) {
            addCriterion("rule_out_area_names not between", value1, value2, "ruleOutAreaNames");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIsNull() {
            addCriterion("template_price is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIsNotNull() {
            addCriterion("template_price is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceEqualTo(BigDecimal value) {
            addCriterion("template_price =", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotEqualTo(BigDecimal value) {
            addCriterion("template_price <>", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceGreaterThan(BigDecimal value) {
            addCriterion("template_price >", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("template_price >=", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceLessThan(BigDecimal value) {
            addCriterion("template_price <", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("template_price <=", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIn(List<BigDecimal> values) {
            addCriterion("template_price in", values, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotIn(List<BigDecimal> values) {
            addCriterion("template_price not in", values, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("template_price between", value1, value2, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("template_price not between", value1, value2, "templatePrice");
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