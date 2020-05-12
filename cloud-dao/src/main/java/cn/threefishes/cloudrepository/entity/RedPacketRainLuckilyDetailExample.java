package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketRainLuckilyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketRainLuckilyDetailExample() {
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

        public Criteria andRainIdIsNull() {
            addCriterion("rain_id is null");
            return (Criteria) this;
        }

        public Criteria andRainIdIsNotNull() {
            addCriterion("rain_id is not null");
            return (Criteria) this;
        }

        public Criteria andRainIdEqualTo(Integer value) {
            addCriterion("rain_id =", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotEqualTo(Integer value) {
            addCriterion("rain_id <>", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThan(Integer value) {
            addCriterion("rain_id >", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rain_id >=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThan(Integer value) {
            addCriterion("rain_id <", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThanOrEqualTo(Integer value) {
            addCriterion("rain_id <=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdIn(List<Integer> values) {
            addCriterion("rain_id in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotIn(List<Integer> values) {
            addCriterion("rain_id not in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdBetween(Integer value1, Integer value2) {
            addCriterion("rain_id between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rain_id not between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainNumIsNull() {
            addCriterion("rain_num is null");
            return (Criteria) this;
        }

        public Criteria andRainNumIsNotNull() {
            addCriterion("rain_num is not null");
            return (Criteria) this;
        }

        public Criteria andRainNumEqualTo(String value) {
            addCriterion("rain_num =", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumNotEqualTo(String value) {
            addCriterion("rain_num <>", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumGreaterThan(String value) {
            addCriterion("rain_num >", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumGreaterThanOrEqualTo(String value) {
            addCriterion("rain_num >=", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumLessThan(String value) {
            addCriterion("rain_num <", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumLessThanOrEqualTo(String value) {
            addCriterion("rain_num <=", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumLike(String value) {
            addCriterion("rain_num like", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumNotLike(String value) {
            addCriterion("rain_num not like", value, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumIn(List<String> values) {
            addCriterion("rain_num in", values, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumNotIn(List<String> values) {
            addCriterion("rain_num not in", values, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumBetween(String value1, String value2) {
            addCriterion("rain_num between", value1, value2, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNumNotBetween(String value1, String value2) {
            addCriterion("rain_num not between", value1, value2, "rainNum");
            return (Criteria) this;
        }

        public Criteria andRainNameIsNull() {
            addCriterion("rain_name is null");
            return (Criteria) this;
        }

        public Criteria andRainNameIsNotNull() {
            addCriterion("rain_name is not null");
            return (Criteria) this;
        }

        public Criteria andRainNameEqualTo(String value) {
            addCriterion("rain_name =", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotEqualTo(String value) {
            addCriterion("rain_name <>", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameGreaterThan(String value) {
            addCriterion("rain_name >", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameGreaterThanOrEqualTo(String value) {
            addCriterion("rain_name >=", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLessThan(String value) {
            addCriterion("rain_name <", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLessThanOrEqualTo(String value) {
            addCriterion("rain_name <=", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLike(String value) {
            addCriterion("rain_name like", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotLike(String value) {
            addCriterion("rain_name not like", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameIn(List<String> values) {
            addCriterion("rain_name in", values, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotIn(List<String> values) {
            addCriterion("rain_name not in", values, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameBetween(String value1, String value2) {
            addCriterion("rain_name between", value1, value2, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotBetween(String value1, String value2) {
            addCriterion("rain_name not between", value1, value2, "rainName");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNull() {
            addCriterion("prize_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNotNull() {
            addCriterion("prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdEqualTo(Integer value) {
            addCriterion("prize_id =", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotEqualTo(Integer value) {
            addCriterion("prize_id <>", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThan(Integer value) {
            addCriterion("prize_id >", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_id >=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThan(Integer value) {
            addCriterion("prize_id <", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prize_id <=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIn(List<Integer> values) {
            addCriterion("prize_id in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotIn(List<Integer> values) {
            addCriterion("prize_id not in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("prize_id between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_id not between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeDescIsNull() {
            addCriterion("prize_desc is null");
            return (Criteria) this;
        }

        public Criteria andPrizeDescIsNotNull() {
            addCriterion("prize_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeDescEqualTo(String value) {
            addCriterion("prize_desc =", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescNotEqualTo(String value) {
            addCriterion("prize_desc <>", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescGreaterThan(String value) {
            addCriterion("prize_desc >", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescGreaterThanOrEqualTo(String value) {
            addCriterion("prize_desc >=", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescLessThan(String value) {
            addCriterion("prize_desc <", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescLessThanOrEqualTo(String value) {
            addCriterion("prize_desc <=", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescLike(String value) {
            addCriterion("prize_desc like", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescNotLike(String value) {
            addCriterion("prize_desc not like", value, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescIn(List<String> values) {
            addCriterion("prize_desc in", values, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescNotIn(List<String> values) {
            addCriterion("prize_desc not in", values, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescBetween(String value1, String value2) {
            addCriterion("prize_desc between", value1, value2, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeDescNotBetween(String value1, String value2) {
            addCriterion("prize_desc not between", value1, value2, "prizeDesc");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNull() {
            addCriterion("prize_type is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNotNull() {
            addCriterion("prize_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeEqualTo(Integer value) {
            addCriterion("prize_type =", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotEqualTo(Integer value) {
            addCriterion("prize_type <>", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThan(Integer value) {
            addCriterion("prize_type >", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_type >=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThan(Integer value) {
            addCriterion("prize_type <", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("prize_type <=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIn(List<Integer> values) {
            addCriterion("prize_type in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotIn(List<Integer> values) {
            addCriterion("prize_type not in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeBetween(Integer value1, Integer value2) {
            addCriterion("prize_type between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_type not between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andGetPrizeIsNull() {
            addCriterion("get_prize is null");
            return (Criteria) this;
        }

        public Criteria andGetPrizeIsNotNull() {
            addCriterion("get_prize is not null");
            return (Criteria) this;
        }

        public Criteria andGetPrizeEqualTo(Integer value) {
            addCriterion("get_prize =", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeNotEqualTo(Integer value) {
            addCriterion("get_prize <>", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeGreaterThan(Integer value) {
            addCriterion("get_prize >", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_prize >=", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeLessThan(Integer value) {
            addCriterion("get_prize <", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeLessThanOrEqualTo(Integer value) {
            addCriterion("get_prize <=", value, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeIn(List<Integer> values) {
            addCriterion("get_prize in", values, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeNotIn(List<Integer> values) {
            addCriterion("get_prize not in", values, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeBetween(Integer value1, Integer value2) {
            addCriterion("get_prize between", value1, value2, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeNotBetween(Integer value1, Integer value2) {
            addCriterion("get_prize not between", value1, value2, "getPrize");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeIsNull() {
            addCriterion("get_prize_time is null");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeIsNotNull() {
            addCriterion("get_prize_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeEqualTo(Date value) {
            addCriterion("get_prize_time =", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeNotEqualTo(Date value) {
            addCriterion("get_prize_time <>", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeGreaterThan(Date value) {
            addCriterion("get_prize_time >", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("get_prize_time >=", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeLessThan(Date value) {
            addCriterion("get_prize_time <", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeLessThanOrEqualTo(Date value) {
            addCriterion("get_prize_time <=", value, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeIn(List<Date> values) {
            addCriterion("get_prize_time in", values, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeNotIn(List<Date> values) {
            addCriterion("get_prize_time not in", values, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeBetween(Date value1, Date value2) {
            addCriterion("get_prize_time between", value1, value2, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andGetPrizeTimeNotBetween(Date value1, Date value2) {
            addCriterion("get_prize_time not between", value1, value2, "getPrizeTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIsNull() {
            addCriterion("prize_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIsNotNull() {
            addCriterion("prize_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeEqualTo(Date value) {
            addCriterion("prize_expire_time =", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotEqualTo(Date value) {
            addCriterion("prize_expire_time <>", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeGreaterThan(Date value) {
            addCriterion("prize_expire_time >", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prize_expire_time >=", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeLessThan(Date value) {
            addCriterion("prize_expire_time <", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("prize_expire_time <=", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIn(List<Date> values) {
            addCriterion("prize_expire_time in", values, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotIn(List<Date> values) {
            addCriterion("prize_expire_time not in", values, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeBetween(Date value1, Date value2) {
            addCriterion("prize_expire_time between", value1, value2, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("prize_expire_time not between", value1, value2, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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