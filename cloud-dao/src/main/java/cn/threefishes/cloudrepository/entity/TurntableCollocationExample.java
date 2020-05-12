package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class TurntableCollocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TurntableCollocationExample() {
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

        public Criteria andCollocationIdIsNull() {
            addCriterion("collocation_id is null");
            return (Criteria) this;
        }

        public Criteria andCollocationIdIsNotNull() {
            addCriterion("collocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationIdEqualTo(Integer value) {
            addCriterion("collocation_id =", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotEqualTo(Integer value) {
            addCriterion("collocation_id <>", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdGreaterThan(Integer value) {
            addCriterion("collocation_id >", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collocation_id >=", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdLessThan(Integer value) {
            addCriterion("collocation_id <", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("collocation_id <=", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdIn(List<Integer> values) {
            addCriterion("collocation_id in", values, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotIn(List<Integer> values) {
            addCriterion("collocation_id not in", values, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdBetween(Integer value1, Integer value2) {
            addCriterion("collocation_id between", value1, value2, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collocation_id not between", value1, value2, "collocationId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIsNull() {
            addCriterion("turntable_id is null");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIsNotNull() {
            addCriterion("turntable_id is not null");
            return (Criteria) this;
        }

        public Criteria andTurntableIdEqualTo(Integer value) {
            addCriterion("turntable_id =", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotEqualTo(Integer value) {
            addCriterion("turntable_id <>", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdGreaterThan(Integer value) {
            addCriterion("turntable_id >", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("turntable_id >=", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdLessThan(Integer value) {
            addCriterion("turntable_id <", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdLessThanOrEqualTo(Integer value) {
            addCriterion("turntable_id <=", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIn(List<Integer> values) {
            addCriterion("turntable_id in", values, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotIn(List<Integer> values) {
            addCriterion("turntable_id not in", values, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdBetween(Integer value1, Integer value2) {
            addCriterion("turntable_id between", value1, value2, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("turntable_id not between", value1, value2, "turntableId");
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

        public Criteria andCollocationNameIsNull() {
            addCriterion("collocation_name is null");
            return (Criteria) this;
        }

        public Criteria andCollocationNameIsNotNull() {
            addCriterion("collocation_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationNameEqualTo(String value) {
            addCriterion("collocation_name =", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotEqualTo(String value) {
            addCriterion("collocation_name <>", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameGreaterThan(String value) {
            addCriterion("collocation_name >", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("collocation_name >=", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLessThan(String value) {
            addCriterion("collocation_name <", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLessThanOrEqualTo(String value) {
            addCriterion("collocation_name <=", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLike(String value) {
            addCriterion("collocation_name like", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotLike(String value) {
            addCriterion("collocation_name not like", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameIn(List<String> values) {
            addCriterion("collocation_name in", values, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotIn(List<String> values) {
            addCriterion("collocation_name not in", values, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameBetween(String value1, String value2) {
            addCriterion("collocation_name between", value1, value2, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotBetween(String value1, String value2) {
            addCriterion("collocation_name not between", value1, value2, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIsNull() {
            addCriterion("collocation_content is null");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIsNotNull() {
            addCriterion("collocation_content is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationContentEqualTo(String value) {
            addCriterion("collocation_content =", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotEqualTo(String value) {
            addCriterion("collocation_content <>", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentGreaterThan(String value) {
            addCriterion("collocation_content >", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentGreaterThanOrEqualTo(String value) {
            addCriterion("collocation_content >=", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLessThan(String value) {
            addCriterion("collocation_content <", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLessThanOrEqualTo(String value) {
            addCriterion("collocation_content <=", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLike(String value) {
            addCriterion("collocation_content like", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotLike(String value) {
            addCriterion("collocation_content not like", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIn(List<String> values) {
            addCriterion("collocation_content in", values, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotIn(List<String> values) {
            addCriterion("collocation_content not in", values, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentBetween(String value1, String value2) {
            addCriterion("collocation_content between", value1, value2, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotBetween(String value1, String value2) {
            addCriterion("collocation_content not between", value1, value2, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIsNull() {
            addCriterion("prize_price is null");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIsNotNull() {
            addCriterion("prize_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrizePriceEqualTo(Double value) {
            addCriterion("prize_price =", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotEqualTo(Double value) {
            addCriterion("prize_price <>", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceGreaterThan(Double value) {
            addCriterion("prize_price >", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("prize_price >=", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceLessThan(Double value) {
            addCriterion("prize_price <", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceLessThanOrEqualTo(Double value) {
            addCriterion("prize_price <=", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIn(List<Double> values) {
            addCriterion("prize_price in", values, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotIn(List<Double> values) {
            addCriterion("prize_price not in", values, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceBetween(Double value1, Double value2) {
            addCriterion("prize_price between", value1, value2, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotBetween(Double value1, Double value2) {
            addCriterion("prize_price not between", value1, value2, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNull() {
            addCriterion("num_limit is null");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNotNull() {
            addCriterion("num_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimitEqualTo(Integer value) {
            addCriterion("num_limit =", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotEqualTo(Integer value) {
            addCriterion("num_limit <>", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThan(Integer value) {
            addCriterion("num_limit >", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_limit >=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThan(Integer value) {
            addCriterion("num_limit <", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThanOrEqualTo(Integer value) {
            addCriterion("num_limit <=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitIn(List<Integer> values) {
            addCriterion("num_limit in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotIn(List<Integer> values) {
            addCriterion("num_limit not in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitBetween(Integer value1, Integer value2) {
            addCriterion("num_limit between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("num_limit not between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateIsNull() {
            addCriterion("luckily_rate is null");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateIsNotNull() {
            addCriterion("luckily_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateEqualTo(Integer value) {
            addCriterion("luckily_rate =", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateNotEqualTo(Integer value) {
            addCriterion("luckily_rate <>", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateGreaterThan(Integer value) {
            addCriterion("luckily_rate >", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckily_rate >=", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateLessThan(Integer value) {
            addCriterion("luckily_rate <", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateLessThanOrEqualTo(Integer value) {
            addCriterion("luckily_rate <=", value, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateIn(List<Integer> values) {
            addCriterion("luckily_rate in", values, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateNotIn(List<Integer> values) {
            addCriterion("luckily_rate not in", values, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateBetween(Integer value1, Integer value2) {
            addCriterion("luckily_rate between", value1, value2, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andLuckilyRateNotBetween(Integer value1, Integer value2) {
            addCriterion("luckily_rate not between", value1, value2, "luckilyRate");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andHasCollocationIsNull() {
            addCriterion("has_collocation is null");
            return (Criteria) this;
        }

        public Criteria andHasCollocationIsNotNull() {
            addCriterion("has_collocation is not null");
            return (Criteria) this;
        }

        public Criteria andHasCollocationEqualTo(Integer value) {
            addCriterion("has_collocation =", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationNotEqualTo(Integer value) {
            addCriterion("has_collocation <>", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationGreaterThan(Integer value) {
            addCriterion("has_collocation >", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_collocation >=", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationLessThan(Integer value) {
            addCriterion("has_collocation <", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationLessThanOrEqualTo(Integer value) {
            addCriterion("has_collocation <=", value, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationIn(List<Integer> values) {
            addCriterion("has_collocation in", values, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationNotIn(List<Integer> values) {
            addCriterion("has_collocation not in", values, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationBetween(Integer value1, Integer value2) {
            addCriterion("has_collocation between", value1, value2, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andHasCollocationNotBetween(Integer value1, Integer value2) {
            addCriterion("has_collocation not between", value1, value2, "hasCollocation");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNull() {
            addCriterion("del_status is null");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNotNull() {
            addCriterion("del_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelStatusEqualTo(Integer value) {
            addCriterion("del_status =", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotEqualTo(Integer value) {
            addCriterion("del_status <>", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThan(Integer value) {
            addCriterion("del_status >", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_status >=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThan(Integer value) {
            addCriterion("del_status <", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("del_status <=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusIn(List<Integer> values) {
            addCriterion("del_status in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotIn(List<Integer> values) {
            addCriterion("del_status not in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusBetween(Integer value1, Integer value2) {
            addCriterion("del_status between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("del_status not between", value1, value2, "delStatus");
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