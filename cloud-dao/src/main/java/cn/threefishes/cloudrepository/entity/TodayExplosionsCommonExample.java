package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class TodayExplosionsCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TodayExplosionsCommonExample() {
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

        public Criteria andExplosionsCommonIdIsNull() {
            addCriterion("explosions_common_id is null");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdIsNotNull() {
            addCriterion("explosions_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdEqualTo(Integer value) {
            addCriterion("explosions_common_id =", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdNotEqualTo(Integer value) {
            addCriterion("explosions_common_id <>", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdGreaterThan(Integer value) {
            addCriterion("explosions_common_id >", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("explosions_common_id >=", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdLessThan(Integer value) {
            addCriterion("explosions_common_id <", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("explosions_common_id <=", value, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdIn(List<Integer> values) {
            addCriterion("explosions_common_id in", values, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdNotIn(List<Integer> values) {
            addCriterion("explosions_common_id not in", values, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("explosions_common_id between", value1, value2, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andExplosionsCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("explosions_common_id not between", value1, value2, "explosionsCommonId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNull() {
            addCriterion("goods_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNotNull() {
            addCriterion("goods_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeEqualTo(String value) {
            addCriterion("goods_describe =", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotEqualTo(String value) {
            addCriterion("goods_describe <>", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThan(String value) {
            addCriterion("goods_describe >", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_describe >=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThan(String value) {
            addCriterion("goods_describe <", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThanOrEqualTo(String value) {
            addCriterion("goods_describe <=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLike(String value) {
            addCriterion("goods_describe like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotLike(String value) {
            addCriterion("goods_describe not like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIn(List<String> values) {
            addCriterion("goods_describe in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotIn(List<String> values) {
            addCriterion("goods_describe not in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeBetween(String value1, String value2) {
            addCriterion("goods_describe between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotBetween(String value1, String value2) {
            addCriterion("goods_describe not between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysIsNull() {
            addCriterion("buyer_says is null");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysIsNotNull() {
            addCriterion("buyer_says is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysEqualTo(String value) {
            addCriterion("buyer_says =", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysNotEqualTo(String value) {
            addCriterion("buyer_says <>", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysGreaterThan(String value) {
            addCriterion("buyer_says >", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_says >=", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysLessThan(String value) {
            addCriterion("buyer_says <", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysLessThanOrEqualTo(String value) {
            addCriterion("buyer_says <=", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysLike(String value) {
            addCriterion("buyer_says like", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysNotLike(String value) {
            addCriterion("buyer_says not like", value, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysIn(List<String> values) {
            addCriterion("buyer_says in", values, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysNotIn(List<String> values) {
            addCriterion("buyer_says not in", values, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysBetween(String value1, String value2) {
            addCriterion("buyer_says between", value1, value2, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andBuyerSaysNotBetween(String value1, String value2) {
            addCriterion("buyer_says not between", value1, value2, "buyerSays");
            return (Criteria) this;
        }

        public Criteria andTagOneIsNull() {
            addCriterion("tag_one is null");
            return (Criteria) this;
        }

        public Criteria andTagOneIsNotNull() {
            addCriterion("tag_one is not null");
            return (Criteria) this;
        }

        public Criteria andTagOneEqualTo(String value) {
            addCriterion("tag_one =", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneNotEqualTo(String value) {
            addCriterion("tag_one <>", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneGreaterThan(String value) {
            addCriterion("tag_one >", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneGreaterThanOrEqualTo(String value) {
            addCriterion("tag_one >=", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneLessThan(String value) {
            addCriterion("tag_one <", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneLessThanOrEqualTo(String value) {
            addCriterion("tag_one <=", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneLike(String value) {
            addCriterion("tag_one like", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneNotLike(String value) {
            addCriterion("tag_one not like", value, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneIn(List<String> values) {
            addCriterion("tag_one in", values, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneNotIn(List<String> values) {
            addCriterion("tag_one not in", values, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneBetween(String value1, String value2) {
            addCriterion("tag_one between", value1, value2, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagOneNotBetween(String value1, String value2) {
            addCriterion("tag_one not between", value1, value2, "tagOne");
            return (Criteria) this;
        }

        public Criteria andTagTwoIsNull() {
            addCriterion("tag_two is null");
            return (Criteria) this;
        }

        public Criteria andTagTwoIsNotNull() {
            addCriterion("tag_two is not null");
            return (Criteria) this;
        }

        public Criteria andTagTwoEqualTo(String value) {
            addCriterion("tag_two =", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoNotEqualTo(String value) {
            addCriterion("tag_two <>", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoGreaterThan(String value) {
            addCriterion("tag_two >", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoGreaterThanOrEqualTo(String value) {
            addCriterion("tag_two >=", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoLessThan(String value) {
            addCriterion("tag_two <", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoLessThanOrEqualTo(String value) {
            addCriterion("tag_two <=", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoLike(String value) {
            addCriterion("tag_two like", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoNotLike(String value) {
            addCriterion("tag_two not like", value, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoIn(List<String> values) {
            addCriterion("tag_two in", values, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoNotIn(List<String> values) {
            addCriterion("tag_two not in", values, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoBetween(String value1, String value2) {
            addCriterion("tag_two between", value1, value2, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagTwoNotBetween(String value1, String value2) {
            addCriterion("tag_two not between", value1, value2, "tagTwo");
            return (Criteria) this;
        }

        public Criteria andTagThreeIsNull() {
            addCriterion("tag_three is null");
            return (Criteria) this;
        }

        public Criteria andTagThreeIsNotNull() {
            addCriterion("tag_three is not null");
            return (Criteria) this;
        }

        public Criteria andTagThreeEqualTo(String value) {
            addCriterion("tag_three =", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeNotEqualTo(String value) {
            addCriterion("tag_three <>", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeGreaterThan(String value) {
            addCriterion("tag_three >", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeGreaterThanOrEqualTo(String value) {
            addCriterion("tag_three >=", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeLessThan(String value) {
            addCriterion("tag_three <", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeLessThanOrEqualTo(String value) {
            addCriterion("tag_three <=", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeLike(String value) {
            addCriterion("tag_three like", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeNotLike(String value) {
            addCriterion("tag_three not like", value, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeIn(List<String> values) {
            addCriterion("tag_three in", values, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeNotIn(List<String> values) {
            addCriterion("tag_three not in", values, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeBetween(String value1, String value2) {
            addCriterion("tag_three between", value1, value2, "tagThree");
            return (Criteria) this;
        }

        public Criteria andTagThreeNotBetween(String value1, String value2) {
            addCriterion("tag_three not between", value1, value2, "tagThree");
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