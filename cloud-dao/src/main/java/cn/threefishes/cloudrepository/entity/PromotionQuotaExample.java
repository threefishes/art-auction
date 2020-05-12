package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionQuotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionQuotaExample() {
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

        public Criteria andBargainEndTimeIsNull() {
            addCriterion("bargain_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeIsNotNull() {
            addCriterion("bargain_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeEqualTo(Date value) {
            addCriterion("bargain_end_time =", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeNotEqualTo(Date value) {
            addCriterion("bargain_end_time <>", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeGreaterThan(Date value) {
            addCriterion("bargain_end_time >", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bargain_end_time >=", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeLessThan(Date value) {
            addCriterion("bargain_end_time <", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("bargain_end_time <=", value, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeIn(List<Date> values) {
            addCriterion("bargain_end_time in", values, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeNotIn(List<Date> values) {
            addCriterion("bargain_end_time not in", values, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeBetween(Date value1, Date value2) {
            addCriterion("bargain_end_time between", value1, value2, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBargainEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("bargain_end_time not between", value1, value2, "bargainEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeIsNull() {
            addCriterion("book_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeIsNotNull() {
            addCriterion("book_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeEqualTo(Date value) {
            addCriterion("book_end_time =", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeNotEqualTo(Date value) {
            addCriterion("book_end_time <>", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeGreaterThan(Date value) {
            addCriterion("book_end_time >", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_end_time >=", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeLessThan(Date value) {
            addCriterion("book_end_time <", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("book_end_time <=", value, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeIn(List<Date> values) {
            addCriterion("book_end_time in", values, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeNotIn(List<Date> values) {
            addCriterion("book_end_time not in", values, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeBetween(Date value1, Date value2) {
            addCriterion("book_end_time between", value1, value2, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBookEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("book_end_time not between", value1, value2, "bookEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeIsNull() {
            addCriterion("bundling_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeIsNotNull() {
            addCriterion("bundling_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeEqualTo(Date value) {
            addCriterion("bundling_end_time =", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeNotEqualTo(Date value) {
            addCriterion("bundling_end_time <>", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeGreaterThan(Date value) {
            addCriterion("bundling_end_time >", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bundling_end_time >=", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeLessThan(Date value) {
            addCriterion("bundling_end_time <", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("bundling_end_time <=", value, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeIn(List<Date> values) {
            addCriterion("bundling_end_time in", values, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeNotIn(List<Date> values) {
            addCriterion("bundling_end_time not in", values, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeBetween(Date value1, Date value2) {
            addCriterion("bundling_end_time between", value1, value2, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andBundlingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("bundling_end_time not between", value1, value2, "bundlingEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeIsNull() {
            addCriterion("combo_end_time is null");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeIsNotNull() {
            addCriterion("combo_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeEqualTo(Date value) {
            addCriterion("combo_end_time =", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeNotEqualTo(Date value) {
            addCriterion("combo_end_time <>", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeGreaterThan(Date value) {
            addCriterion("combo_end_time >", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("combo_end_time >=", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeLessThan(Date value) {
            addCriterion("combo_end_time <", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("combo_end_time <=", value, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeIn(List<Date> values) {
            addCriterion("combo_end_time in", values, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeNotIn(List<Date> values) {
            addCriterion("combo_end_time not in", values, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeBetween(Date value1, Date value2) {
            addCriterion("combo_end_time between", value1, value2, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andComboEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("combo_end_time not between", value1, value2, "comboEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeIsNull() {
            addCriterion("conform_end_time is null");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeIsNotNull() {
            addCriterion("conform_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeEqualTo(Date value) {
            addCriterion("conform_end_time =", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeNotEqualTo(Date value) {
            addCriterion("conform_end_time <>", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeGreaterThan(Date value) {
            addCriterion("conform_end_time >", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("conform_end_time >=", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeLessThan(Date value) {
            addCriterion("conform_end_time <", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("conform_end_time <=", value, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeIn(List<Date> values) {
            addCriterion("conform_end_time in", values, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeNotIn(List<Date> values) {
            addCriterion("conform_end_time not in", values, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeBetween(Date value1, Date value2) {
            addCriterion("conform_end_time between", value1, value2, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andConformEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("conform_end_time not between", value1, value2, "conformEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIsNull() {
            addCriterion("discount_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIsNotNull() {
            addCriterion("discount_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeEqualTo(Date value) {
            addCriterion("discount_end_time =", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotEqualTo(Date value) {
            addCriterion("discount_end_time <>", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeGreaterThan(Date value) {
            addCriterion("discount_end_time >", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_end_time >=", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeLessThan(Date value) {
            addCriterion("discount_end_time <", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("discount_end_time <=", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIn(List<Date> values) {
            addCriterion("discount_end_time in", values, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotIn(List<Date> values) {
            addCriterion("discount_end_time not in", values, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeBetween(Date value1, Date value2) {
            addCriterion("discount_end_time between", value1, value2, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("discount_end_time not between", value1, value2, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeIsNull() {
            addCriterion("gift_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeIsNotNull() {
            addCriterion("gift_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeEqualTo(Date value) {
            addCriterion("gift_end_time =", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeNotEqualTo(Date value) {
            addCriterion("gift_end_time <>", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeGreaterThan(Date value) {
            addCriterion("gift_end_time >", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gift_end_time >=", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeLessThan(Date value) {
            addCriterion("gift_end_time <", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("gift_end_time <=", value, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeIn(List<Date> values) {
            addCriterion("gift_end_time in", values, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeNotIn(List<Date> values) {
            addCriterion("gift_end_time not in", values, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeBetween(Date value1, Date value2) {
            addCriterion("gift_end_time between", value1, value2, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("gift_end_time not between", value1, value2, "giftEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIsNull() {
            addCriterion("group_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIsNotNull() {
            addCriterion("group_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeEqualTo(Date value) {
            addCriterion("group_end_time =", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotEqualTo(Date value) {
            addCriterion("group_end_time <>", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeGreaterThan(Date value) {
            addCriterion("group_end_time >", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_end_time >=", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeLessThan(Date value) {
            addCriterion("group_end_time <", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_end_time <=", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIn(List<Date> values) {
            addCriterion("group_end_time in", values, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotIn(List<Date> values) {
            addCriterion("group_end_time not in", values, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeBetween(Date value1, Date value2) {
            addCriterion("group_end_time between", value1, value2, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_end_time not between", value1, value2, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeIsNull() {
            addCriterion("points_goods_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeIsNotNull() {
            addCriterion("points_goods_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeEqualTo(Date value) {
            addCriterion("points_goods_end_time =", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeNotEqualTo(Date value) {
            addCriterion("points_goods_end_time <>", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeGreaterThan(Date value) {
            addCriterion("points_goods_end_time >", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("points_goods_end_time >=", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeLessThan(Date value) {
            addCriterion("points_goods_end_time <", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("points_goods_end_time <=", value, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeIn(List<Date> values) {
            addCriterion("points_goods_end_time in", values, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeNotIn(List<Date> values) {
            addCriterion("points_goods_end_time not in", values, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeBetween(Date value1, Date value2) {
            addCriterion("points_goods_end_time between", value1, value2, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("points_goods_end_time not between", value1, value2, "pointsGoodsEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeIsNull() {
            addCriterion("seckill_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeIsNotNull() {
            addCriterion("seckill_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeEqualTo(Date value) {
            addCriterion("seckill_end_time =", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeNotEqualTo(Date value) {
            addCriterion("seckill_end_time <>", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeGreaterThan(Date value) {
            addCriterion("seckill_end_time >", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seckill_end_time >=", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeLessThan(Date value) {
            addCriterion("seckill_end_time <", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("seckill_end_time <=", value, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeIn(List<Date> values) {
            addCriterion("seckill_end_time in", values, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeNotIn(List<Date> values) {
            addCriterion("seckill_end_time not in", values, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeBetween(Date value1, Date value2) {
            addCriterion("seckill_end_time between", value1, value2, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andSeckillEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("seckill_end_time not between", value1, value2, "seckillEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeIsNull() {
            addCriterion("theme_end_time is null");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeIsNotNull() {
            addCriterion("theme_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeEqualTo(Date value) {
            addCriterion("theme_end_time =", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeNotEqualTo(Date value) {
            addCriterion("theme_end_time <>", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeGreaterThan(Date value) {
            addCriterion("theme_end_time >", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("theme_end_time >=", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeLessThan(Date value) {
            addCriterion("theme_end_time <", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("theme_end_time <=", value, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeIn(List<Date> values) {
            addCriterion("theme_end_time in", values, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeNotIn(List<Date> values) {
            addCriterion("theme_end_time not in", values, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeBetween(Date value1, Date value2) {
            addCriterion("theme_end_time between", value1, value2, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andThemeEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("theme_end_time not between", value1, value2, "themeEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeIsNull() {
            addCriterion("trys_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeIsNotNull() {
            addCriterion("trys_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeEqualTo(Date value) {
            addCriterion("trys_end_time =", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeNotEqualTo(Date value) {
            addCriterion("trys_end_time <>", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeGreaterThan(Date value) {
            addCriterion("trys_end_time >", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trys_end_time >=", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeLessThan(Date value) {
            addCriterion("trys_end_time <", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("trys_end_time <=", value, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeIn(List<Date> values) {
            addCriterion("trys_end_time in", values, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeNotIn(List<Date> values) {
            addCriterion("trys_end_time not in", values, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeBetween(Date value1, Date value2) {
            addCriterion("trys_end_time between", value1, value2, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andTrysEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("trys_end_time not between", value1, value2, "trysEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeIsNull() {
            addCriterion("voucher_end_time is null");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeIsNotNull() {
            addCriterion("voucher_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeEqualTo(Date value) {
            addCriterion("voucher_end_time =", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeNotEqualTo(Date value) {
            addCriterion("voucher_end_time <>", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeGreaterThan(Date value) {
            addCriterion("voucher_end_time >", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("voucher_end_time >=", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeLessThan(Date value) {
            addCriterion("voucher_end_time <", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("voucher_end_time <=", value, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeIn(List<Date> values) {
            addCriterion("voucher_end_time in", values, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeNotIn(List<Date> values) {
            addCriterion("voucher_end_time not in", values, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeBetween(Date value1, Date value2) {
            addCriterion("voucher_end_time between", value1, value2, "voucherEndTime");
            return (Criteria) this;
        }

        public Criteria andVoucherEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("voucher_end_time not between", value1, value2, "voucherEndTime");
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