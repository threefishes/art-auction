package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ChainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChainExample() {
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

        public Criteria andAllStarSumIsNull() {
            addCriterion("all_star_sum is null");
            return (Criteria) this;
        }

        public Criteria andAllStarSumIsNotNull() {
            addCriterion("all_star_sum is not null");
            return (Criteria) this;
        }

        public Criteria andAllStarSumEqualTo(Integer value) {
            addCriterion("all_star_sum =", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumNotEqualTo(Integer value) {
            addCriterion("all_star_sum <>", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumGreaterThan(Integer value) {
            addCriterion("all_star_sum >", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_star_sum >=", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumLessThan(Integer value) {
            addCriterion("all_star_sum <", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumLessThanOrEqualTo(Integer value) {
            addCriterion("all_star_sum <=", value, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumIn(List<Integer> values) {
            addCriterion("all_star_sum in", values, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumNotIn(List<Integer> values) {
            addCriterion("all_star_sum not in", values, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumBetween(Integer value1, Integer value2) {
            addCriterion("all_star_sum between", value1, value2, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAllStarSumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_star_sum not between", value1, value2, "allStarSum");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNull() {
            addCriterion("area_id1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNotNull() {
            addCriterion("area_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId1EqualTo(Integer value) {
            addCriterion("area_id1 =", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotEqualTo(Integer value) {
            addCriterion("area_id1 <>", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThan(Integer value) {
            addCriterion("area_id1 >", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id1 >=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThan(Integer value) {
            addCriterion("area_id1 <", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("area_id1 <=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1In(List<Integer> values) {
            addCriterion("area_id1 in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotIn(List<Integer> values) {
            addCriterion("area_id1 not in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1Between(Integer value1, Integer value2) {
            addCriterion("area_id1 between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id1 not between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNull() {
            addCriterion("area_id2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNotNull() {
            addCriterion("area_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId2EqualTo(Integer value) {
            addCriterion("area_id2 =", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotEqualTo(Integer value) {
            addCriterion("area_id2 <>", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThan(Integer value) {
            addCriterion("area_id2 >", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id2 >=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThan(Integer value) {
            addCriterion("area_id2 <", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("area_id2 <=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2In(List<Integer> values) {
            addCriterion("area_id2 in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotIn(List<Integer> values) {
            addCriterion("area_id2 not in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2Between(Integer value1, Integer value2) {
            addCriterion("area_id2 between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id2 not between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId3IsNull() {
            addCriterion("area_id3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId3IsNotNull() {
            addCriterion("area_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId3EqualTo(Integer value) {
            addCriterion("area_id3 =", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotEqualTo(Integer value) {
            addCriterion("area_id3 <>", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3GreaterThan(Integer value) {
            addCriterion("area_id3 >", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id3 >=", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3LessThan(Integer value) {
            addCriterion("area_id3 <", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3LessThanOrEqualTo(Integer value) {
            addCriterion("area_id3 <=", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3In(List<Integer> values) {
            addCriterion("area_id3 in", values, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotIn(List<Integer> values) {
            addCriterion("area_id3 not in", values, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3Between(Integer value1, Integer value2) {
            addCriterion("area_id3 between", value1, value2, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id3 not between", value1, value2, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId4IsNull() {
            addCriterion("area_id4 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId4IsNotNull() {
            addCriterion("area_id4 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId4EqualTo(Integer value) {
            addCriterion("area_id4 =", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotEqualTo(Integer value) {
            addCriterion("area_id4 <>", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4GreaterThan(Integer value) {
            addCriterion("area_id4 >", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id4 >=", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4LessThan(Integer value) {
            addCriterion("area_id4 <", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4LessThanOrEqualTo(Integer value) {
            addCriterion("area_id4 <=", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4In(List<Integer> values) {
            addCriterion("area_id4 in", values, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotIn(List<Integer> values) {
            addCriterion("area_id4 not in", values, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4Between(Integer value1, Integer value2) {
            addCriterion("area_id4 between", value1, value2, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id4 not between", value1, value2, "areaId4");
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

        public Criteria andChainOpeningTimeIsNull() {
            addCriterion("chain_opening_time is null");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeIsNotNull() {
            addCriterion("chain_opening_time is not null");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeEqualTo(String value) {
            addCriterion("chain_opening_time =", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeNotEqualTo(String value) {
            addCriterion("chain_opening_time <>", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeGreaterThan(String value) {
            addCriterion("chain_opening_time >", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("chain_opening_time >=", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeLessThan(String value) {
            addCriterion("chain_opening_time <", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeLessThanOrEqualTo(String value) {
            addCriterion("chain_opening_time <=", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeLike(String value) {
            addCriterion("chain_opening_time like", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeNotLike(String value) {
            addCriterion("chain_opening_time not like", value, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeIn(List<String> values) {
            addCriterion("chain_opening_time in", values, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeNotIn(List<String> values) {
            addCriterion("chain_opening_time not in", values, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeBetween(String value1, String value2) {
            addCriterion("chain_opening_time between", value1, value2, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainOpeningTimeNotBetween(String value1, String value2) {
            addCriterion("chain_opening_time not between", value1, value2, "chainOpeningTime");
            return (Criteria) this;
        }

        public Criteria andChainPhoneIsNull() {
            addCriterion("chain_phone is null");
            return (Criteria) this;
        }

        public Criteria andChainPhoneIsNotNull() {
            addCriterion("chain_phone is not null");
            return (Criteria) this;
        }

        public Criteria andChainPhoneEqualTo(String value) {
            addCriterion("chain_phone =", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneNotEqualTo(String value) {
            addCriterion("chain_phone <>", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneGreaterThan(String value) {
            addCriterion("chain_phone >", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("chain_phone >=", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneLessThan(String value) {
            addCriterion("chain_phone <", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneLessThanOrEqualTo(String value) {
            addCriterion("chain_phone <=", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneLike(String value) {
            addCriterion("chain_phone like", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneNotLike(String value) {
            addCriterion("chain_phone not like", value, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneIn(List<String> values) {
            addCriterion("chain_phone in", values, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneNotIn(List<String> values) {
            addCriterion("chain_phone not in", values, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneBetween(String value1, String value2) {
            addCriterion("chain_phone between", value1, value2, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainPhoneNotBetween(String value1, String value2) {
            addCriterion("chain_phone not between", value1, value2, "chainPhone");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineIsNull() {
            addCriterion("chain_traffic_line is null");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineIsNotNull() {
            addCriterion("chain_traffic_line is not null");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineEqualTo(String value) {
            addCriterion("chain_traffic_line =", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineNotEqualTo(String value) {
            addCriterion("chain_traffic_line <>", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineGreaterThan(String value) {
            addCriterion("chain_traffic_line >", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineGreaterThanOrEqualTo(String value) {
            addCriterion("chain_traffic_line >=", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineLessThan(String value) {
            addCriterion("chain_traffic_line <", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineLessThanOrEqualTo(String value) {
            addCriterion("chain_traffic_line <=", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineLike(String value) {
            addCriterion("chain_traffic_line like", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineNotLike(String value) {
            addCriterion("chain_traffic_line not like", value, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineIn(List<String> values) {
            addCriterion("chain_traffic_line in", values, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineNotIn(List<String> values) {
            addCriterion("chain_traffic_line not in", values, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineBetween(String value1, String value2) {
            addCriterion("chain_traffic_line between", value1, value2, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andChainTrafficLineNotBetween(String value1, String value2) {
            addCriterion("chain_traffic_line not between", value1, value2, "chainTrafficLine");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClerkNameIsNull() {
            addCriterion("clerk_name is null");
            return (Criteria) this;
        }

        public Criteria andClerkNameIsNotNull() {
            addCriterion("clerk_name is not null");
            return (Criteria) this;
        }

        public Criteria andClerkNameEqualTo(String value) {
            addCriterion("clerk_name =", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotEqualTo(String value) {
            addCriterion("clerk_name <>", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameGreaterThan(String value) {
            addCriterion("clerk_name >", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameGreaterThanOrEqualTo(String value) {
            addCriterion("clerk_name >=", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLessThan(String value) {
            addCriterion("clerk_name <", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLessThanOrEqualTo(String value) {
            addCriterion("clerk_name <=", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLike(String value) {
            addCriterion("clerk_name like", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotLike(String value) {
            addCriterion("clerk_name not like", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameIn(List<String> values) {
            addCriterion("clerk_name in", values, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotIn(List<String> values) {
            addCriterion("clerk_name not in", values, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameBetween(String value1, String value2) {
            addCriterion("clerk_name between", value1, value2, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotBetween(String value1, String value2) {
            addCriterion("clerk_name not between", value1, value2, "clerkName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNull() {
            addCriterion("evaluate_num is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNotNull() {
            addCriterion("evaluate_num is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumEqualTo(Integer value) {
            addCriterion("evaluate_num =", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotEqualTo(Integer value) {
            addCriterion("evaluate_num <>", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThan(Integer value) {
            addCriterion("evaluate_num >", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num >=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThan(Integer value) {
            addCriterion("evaluate_num <", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num <=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIn(List<Integer> values) {
            addCriterion("evaluate_num in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotIn(List<Integer> values) {
            addCriterion("evaluate_num not in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num not between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumIsNull() {
            addCriterion("five_star_num is null");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumIsNotNull() {
            addCriterion("five_star_num is not null");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumEqualTo(Integer value) {
            addCriterion("five_star_num =", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumNotEqualTo(Integer value) {
            addCriterion("five_star_num <>", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumGreaterThan(Integer value) {
            addCriterion("five_star_num >", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("five_star_num >=", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumLessThan(Integer value) {
            addCriterion("five_star_num <", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumLessThanOrEqualTo(Integer value) {
            addCriterion("five_star_num <=", value, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumIn(List<Integer> values) {
            addCriterion("five_star_num in", values, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumNotIn(List<Integer> values) {
            addCriterion("five_star_num not in", values, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumBetween(Integer value1, Integer value2) {
            addCriterion("five_star_num between", value1, value2, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFiveStarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("five_star_num not between", value1, value2, "fiveStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumIsNull() {
            addCriterion("four_star_num is null");
            return (Criteria) this;
        }

        public Criteria andFourStarNumIsNotNull() {
            addCriterion("four_star_num is not null");
            return (Criteria) this;
        }

        public Criteria andFourStarNumEqualTo(Integer value) {
            addCriterion("four_star_num =", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumNotEqualTo(Integer value) {
            addCriterion("four_star_num <>", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumGreaterThan(Integer value) {
            addCriterion("four_star_num >", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("four_star_num >=", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumLessThan(Integer value) {
            addCriterion("four_star_num <", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumLessThanOrEqualTo(Integer value) {
            addCriterion("four_star_num <=", value, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumIn(List<Integer> values) {
            addCriterion("four_star_num in", values, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumNotIn(List<Integer> values) {
            addCriterion("four_star_num not in", values, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumBetween(Integer value1, Integer value2) {
            addCriterion("four_star_num between", value1, value2, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andFourStarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("four_star_num not between", value1, value2, "fourStarNum");
            return (Criteria) this;
        }

        public Criteria andImageName1IsNull() {
            addCriterion("image_name1 is null");
            return (Criteria) this;
        }

        public Criteria andImageName1IsNotNull() {
            addCriterion("image_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageName1EqualTo(String value) {
            addCriterion("image_name1 =", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1NotEqualTo(String value) {
            addCriterion("image_name1 <>", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1GreaterThan(String value) {
            addCriterion("image_name1 >", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1GreaterThanOrEqualTo(String value) {
            addCriterion("image_name1 >=", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1LessThan(String value) {
            addCriterion("image_name1 <", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1LessThanOrEqualTo(String value) {
            addCriterion("image_name1 <=", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1Like(String value) {
            addCriterion("image_name1 like", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1NotLike(String value) {
            addCriterion("image_name1 not like", value, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1In(List<String> values) {
            addCriterion("image_name1 in", values, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1NotIn(List<String> values) {
            addCriterion("image_name1 not in", values, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1Between(String value1, String value2) {
            addCriterion("image_name1 between", value1, value2, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName1NotBetween(String value1, String value2) {
            addCriterion("image_name1 not between", value1, value2, "imageName1");
            return (Criteria) this;
        }

        public Criteria andImageName2IsNull() {
            addCriterion("image_name2 is null");
            return (Criteria) this;
        }

        public Criteria andImageName2IsNotNull() {
            addCriterion("image_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageName2EqualTo(String value) {
            addCriterion("image_name2 =", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2NotEqualTo(String value) {
            addCriterion("image_name2 <>", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2GreaterThan(String value) {
            addCriterion("image_name2 >", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2GreaterThanOrEqualTo(String value) {
            addCriterion("image_name2 >=", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2LessThan(String value) {
            addCriterion("image_name2 <", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2LessThanOrEqualTo(String value) {
            addCriterion("image_name2 <=", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2Like(String value) {
            addCriterion("image_name2 like", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2NotLike(String value) {
            addCriterion("image_name2 not like", value, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2In(List<String> values) {
            addCriterion("image_name2 in", values, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2NotIn(List<String> values) {
            addCriterion("image_name2 not in", values, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2Between(String value1, String value2) {
            addCriterion("image_name2 between", value1, value2, "imageName2");
            return (Criteria) this;
        }

        public Criteria andImageName2NotBetween(String value1, String value2) {
            addCriterion("image_name2 not between", value1, value2, "imageName2");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Float value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Float value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Float value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Float value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Float value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Float value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Float> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Float> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Float value1, Float value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Float value1, Float value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Float value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Float value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Float value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Float value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Float value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Float value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Float> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Float> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Float value1, Float value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Float value1, Float value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andOneStarNumIsNull() {
            addCriterion("one_star_num is null");
            return (Criteria) this;
        }

        public Criteria andOneStarNumIsNotNull() {
            addCriterion("one_star_num is not null");
            return (Criteria) this;
        }

        public Criteria andOneStarNumEqualTo(Integer value) {
            addCriterion("one_star_num =", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumNotEqualTo(Integer value) {
            addCriterion("one_star_num <>", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumGreaterThan(Integer value) {
            addCriterion("one_star_num >", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("one_star_num >=", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumLessThan(Integer value) {
            addCriterion("one_star_num <", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumLessThanOrEqualTo(Integer value) {
            addCriterion("one_star_num <=", value, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumIn(List<Integer> values) {
            addCriterion("one_star_num in", values, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumNotIn(List<Integer> values) {
            addCriterion("one_star_num not in", values, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumBetween(Integer value1, Integer value2) {
            addCriterion("one_star_num between", value1, value2, "oneStarNum");
            return (Criteria) this;
        }

        public Criteria andOneStarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("one_star_num not between", value1, value2, "oneStarNum");
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

        public Criteria andThreeStarNumIsNull() {
            addCriterion("three_star_num is null");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumIsNotNull() {
            addCriterion("three_star_num is not null");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumEqualTo(Integer value) {
            addCriterion("three_star_num =", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumNotEqualTo(Integer value) {
            addCriterion("three_star_num <>", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumGreaterThan(Integer value) {
            addCriterion("three_star_num >", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_star_num >=", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumLessThan(Integer value) {
            addCriterion("three_star_num <", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumLessThanOrEqualTo(Integer value) {
            addCriterion("three_star_num <=", value, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumIn(List<Integer> values) {
            addCriterion("three_star_num in", values, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumNotIn(List<Integer> values) {
            addCriterion("three_star_num not in", values, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumBetween(Integer value1, Integer value2) {
            addCriterion("three_star_num between", value1, value2, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andThreeStarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("three_star_num not between", value1, value2, "threeStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumIsNull() {
            addCriterion("two_star_num is null");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumIsNotNull() {
            addCriterion("two_star_num is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumEqualTo(Integer value) {
            addCriterion("two_star_num =", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumNotEqualTo(Integer value) {
            addCriterion("two_star_num <>", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumGreaterThan(Integer value) {
            addCriterion("two_star_num >", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("two_star_num >=", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumLessThan(Integer value) {
            addCriterion("two_star_num <", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumLessThanOrEqualTo(Integer value) {
            addCriterion("two_star_num <=", value, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumIn(List<Integer> values) {
            addCriterion("two_star_num in", values, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumNotIn(List<Integer> values) {
            addCriterion("two_star_num not in", values, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumBetween(Integer value1, Integer value2) {
            addCriterion("two_star_num between", value1, value2, "twoStarNum");
            return (Criteria) this;
        }

        public Criteria andTwoStarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("two_star_num not between", value1, value2, "twoStarNum");
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