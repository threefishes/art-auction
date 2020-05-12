package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RedPacketRainCollocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketRainCollocationExample() {
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

        public Criteria andPrizeActivityIdIsNull() {
            addCriterion("prize_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdIsNotNull() {
            addCriterion("prize_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdEqualTo(Integer value) {
            addCriterion("prize_activity_id =", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdNotEqualTo(Integer value) {
            addCriterion("prize_activity_id <>", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdGreaterThan(Integer value) {
            addCriterion("prize_activity_id >", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_activity_id >=", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdLessThan(Integer value) {
            addCriterion("prize_activity_id <", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("prize_activity_id <=", value, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdIn(List<Integer> values) {
            addCriterion("prize_activity_id in", values, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdNotIn(List<Integer> values) {
            addCriterion("prize_activity_id not in", values, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("prize_activity_id between", value1, value2, "prizeActivityId");
            return (Criteria) this;
        }

        public Criteria andPrizeActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_activity_id not between", value1, value2, "prizeActivityId");
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

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNull() {
            addCriterion("activity_rate is null");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNotNull() {
            addCriterion("activity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andActivityRateEqualTo(Integer value) {
            addCriterion("activity_rate =", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotEqualTo(Integer value) {
            addCriterion("activity_rate <>", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThan(Integer value) {
            addCriterion("activity_rate >", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_rate >=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThan(Integer value) {
            addCriterion("activity_rate <", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_rate <=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateIn(List<Integer> values) {
            addCriterion("activity_rate in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotIn(List<Integer> values) {
            addCriterion("activity_rate not in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateBetween(Integer value1, Integer value2) {
            addCriterion("activity_rate between", value1, value2, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_rate not between", value1, value2, "activityRate");
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

        public Criteria andForeignKeyIsNull() {
            addCriterion("foreign_key is null");
            return (Criteria) this;
        }

        public Criteria andForeignKeyIsNotNull() {
            addCriterion("foreign_key is not null");
            return (Criteria) this;
        }

        public Criteria andForeignKeyEqualTo(Integer value) {
            addCriterion("foreign_key =", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyNotEqualTo(Integer value) {
            addCriterion("foreign_key <>", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyGreaterThan(Integer value) {
            addCriterion("foreign_key >", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("foreign_key >=", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyLessThan(Integer value) {
            addCriterion("foreign_key <", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyLessThanOrEqualTo(Integer value) {
            addCriterion("foreign_key <=", value, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyIn(List<Integer> values) {
            addCriterion("foreign_key in", values, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyNotIn(List<Integer> values) {
            addCriterion("foreign_key not in", values, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyBetween(Integer value1, Integer value2) {
            addCriterion("foreign_key between", value1, value2, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andForeignKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("foreign_key not between", value1, value2, "foreignKey");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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