package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RechargeOrdersGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeOrdersGoodsExample() {
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

        public Criteria andOrdersGoodsIdIsNull() {
            addCriterion("orders_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIsNotNull() {
            addCriterion("orders_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdEqualTo(Integer value) {
            addCriterion("orders_goods_id =", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotEqualTo(Integer value) {
            addCriterion("orders_goods_id <>", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThan(Integer value) {
            addCriterion("orders_goods_id >", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id >=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThan(Integer value) {
            addCriterion("orders_goods_id <", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id <=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIn(List<Integer> values) {
            addCriterion("orders_goods_id in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotIn(List<Integer> values) {
            addCriterion("orders_goods_id not in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id between", value1, value2, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id not between", value1, value2, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andBasePriceIsNull() {
            addCriterion("base_price is null");
            return (Criteria) this;
        }

        public Criteria andBasePriceIsNotNull() {
            addCriterion("base_price is not null");
            return (Criteria) this;
        }

        public Criteria andBasePriceEqualTo(BigDecimal value) {
            addCriterion("base_price =", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotEqualTo(BigDecimal value) {
            addCriterion("base_price <>", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceGreaterThan(BigDecimal value) {
            addCriterion("base_price >", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_price >=", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceLessThan(BigDecimal value) {
            addCriterion("base_price <", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_price <=", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceIn(List<BigDecimal> values) {
            addCriterion("base_price in", values, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotIn(List<BigDecimal> values) {
            addCriterion("base_price not in", values, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_price between", value1, value2, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_price not between", value1, value2, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdIsNull() {
            addCriterion("cartgory_id is null");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdIsNotNull() {
            addCriterion("cartgory_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdEqualTo(Integer value) {
            addCriterion("cartgory_id =", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdNotEqualTo(Integer value) {
            addCriterion("cartgory_id <>", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdGreaterThan(Integer value) {
            addCriterion("cartgory_id >", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartgory_id >=", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdLessThan(Integer value) {
            addCriterion("cartgory_id <", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("cartgory_id <=", value, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdIn(List<Integer> values) {
            addCriterion("cartgory_id in", values, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdNotIn(List<Integer> values) {
            addCriterion("cartgory_id not in", values, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdBetween(Integer value1, Integer value2) {
            addCriterion("cartgory_id between", value1, value2, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCartgoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cartgory_id not between", value1, value2, "cartgoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNull() {
            addCriterion("category_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNotNull() {
            addCriterion("category_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1EqualTo(Integer value) {
            addCriterion("category_id_1 =", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotEqualTo(Integer value) {
            addCriterion("category_id_1 <>", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThan(Integer value) {
            addCriterion("category_id_1 >", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_1 >=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThan(Integer value) {
            addCriterion("category_id_1 <", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_1 <=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1In(List<Integer> values) {
            addCriterion("category_id_1 in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotIn(List<Integer> values) {
            addCriterion("category_id_1 not in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1Between(Integer value1, Integer value2) {
            addCriterion("category_id_1 between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_1 not between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNull() {
            addCriterion("category_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNotNull() {
            addCriterion("category_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2EqualTo(Integer value) {
            addCriterion("category_id_2 =", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotEqualTo(Integer value) {
            addCriterion("category_id_2 <>", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThan(Integer value) {
            addCriterion("category_id_2 >", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_2 >=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThan(Integer value) {
            addCriterion("category_id_2 <", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_2 <=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2In(List<Integer> values) {
            addCriterion("category_id_2 in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotIn(List<Integer> values) {
            addCriterion("category_id_2 not in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2Between(Integer value1, Integer value2) {
            addCriterion("category_id_2 between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_2 not between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNull() {
            addCriterion("category_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNotNull() {
            addCriterion("category_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3EqualTo(Integer value) {
            addCriterion("category_id_3 =", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotEqualTo(Integer value) {
            addCriterion("category_id_3 <>", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThan(Integer value) {
            addCriterion("category_id_3 >", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_3 >=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThan(Integer value) {
            addCriterion("category_id_3 <", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_3 <=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3In(List<Integer> values) {
            addCriterion("category_id_3 in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotIn(List<Integer> values) {
            addCriterion("category_id_3 not in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3Between(Integer value1, Integer value2) {
            addCriterion("category_id_3 between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_3 not between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Integer value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Integer value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Integer value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Integer value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Integer value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Integer> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Integer> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNull() {
            addCriterion("commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNotNull() {
            addCriterion("commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("commission_amount =", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("commission_amount <>", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("commission_amount >", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_amount >=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThan(BigDecimal value) {
            addCriterion("commission_amount <", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_amount <=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("commission_amount in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("commission_amount not in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_amount between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_amount not between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementRateIsNull() {
            addCriterion("settlement_rate is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRateIsNotNull() {
            addCriterion("settlement_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRateEqualTo(BigDecimal value) {
            addCriterion("settlement_rate =", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateNotEqualTo(BigDecimal value) {
            addCriterion("settlement_rate <>", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateGreaterThan(BigDecimal value) {
            addCriterion("settlement_rate >", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_rate >=", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateLessThan(BigDecimal value) {
            addCriterion("settlement_rate <", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_rate <=", value, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateIn(List<BigDecimal> values) {
            addCriterion("settlement_rate in", values, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateNotIn(List<BigDecimal> values) {
            addCriterion("settlement_rate not in", values, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_rate between", value1, value2, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_rate not between", value1, value2, "settlementRate");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNull() {
            addCriterion("settlement_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNotNull() {
            addCriterion("settlement_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountEqualTo(BigDecimal value) {
            addCriterion("settlement_amount =", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotEqualTo(BigDecimal value) {
            addCriterion("settlement_amount <>", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThan(BigDecimal value) {
            addCriterion("settlement_amount >", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_amount >=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThan(BigDecimal value) {
            addCriterion("settlement_amount <", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_amount <=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIn(List<BigDecimal> values) {
            addCriterion("settlement_amount in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotIn(List<BigDecimal> values) {
            addCriterion("settlement_amount not in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_amount between", value1, value2, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_amount not between", value1, value2, "settlementAmount");
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

        public Criteria andContractIsNull() {
            addCriterion("contract is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("contract is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("contract =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("contract <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("contract >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("contract >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("contract <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("contract <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("contract like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("contract not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("contract in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("contract not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("contract between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("contract not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNull() {
            addCriterion("goods_full_specs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNotNull() {
            addCriterion("goods_full_specs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsEqualTo(String value) {
            addCriterion("goods_full_specs =", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotEqualTo(String value) {
            addCriterion("goods_full_specs <>", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThan(String value) {
            addCriterion("goods_full_specs >", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_full_specs >=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThan(String value) {
            addCriterion("goods_full_specs <", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThanOrEqualTo(String value) {
            addCriterion("goods_full_specs <=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLike(String value) {
            addCriterion("goods_full_specs like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotLike(String value) {
            addCriterion("goods_full_specs not like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIn(List<String> values) {
            addCriterion("goods_full_specs in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotIn(List<String> values) {
            addCriterion("goods_full_specs not in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsBetween(String value1, String value2) {
            addCriterion("goods_full_specs between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotBetween(String value1, String value2) {
            addCriterion("goods_full_specs not between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andGoodsPayAmountIsNull() {
            addCriterion("goods_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountIsNotNull() {
            addCriterion("goods_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountEqualTo(BigDecimal value) {
            addCriterion("goods_pay_amount =", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_pay_amount <>", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_pay_amount >", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_pay_amount >=", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountLessThan(BigDecimal value) {
            addCriterion("goods_pay_amount <", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_pay_amount <=", value, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountIn(List<BigDecimal> values) {
            addCriterion("goods_pay_amount in", values, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_pay_amount not in", values, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_pay_amount between", value1, value2, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_pay_amount not between", value1, value2, "goodsPayAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIsNull() {
            addCriterion("join_big_sale is null");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIsNotNull() {
            addCriterion("join_big_sale is not null");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleEqualTo(Integer value) {
            addCriterion("join_big_sale =", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotEqualTo(Integer value) {
            addCriterion("join_big_sale <>", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleGreaterThan(Integer value) {
            addCriterion("join_big_sale >", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_big_sale >=", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleLessThan(Integer value) {
            addCriterion("join_big_sale <", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleLessThanOrEqualTo(Integer value) {
            addCriterion("join_big_sale <=", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIn(List<Integer> values) {
            addCriterion("join_big_sale in", values, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotIn(List<Integer> values) {
            addCriterion("join_big_sale not in", values, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleBetween(Integer value1, Integer value2) {
            addCriterion("join_big_sale between", value1, value2, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("join_big_sale not between", value1, value2, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIsNull() {
            addCriterion("recharge_deno is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIsNotNull() {
            addCriterion("recharge_deno is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoEqualTo(String value) {
            addCriterion("recharge_deno =", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotEqualTo(String value) {
            addCriterion("recharge_deno <>", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoGreaterThan(String value) {
            addCriterion("recharge_deno >", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_deno >=", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLessThan(String value) {
            addCriterion("recharge_deno <", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLessThanOrEqualTo(String value) {
            addCriterion("recharge_deno <=", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoLike(String value) {
            addCriterion("recharge_deno like", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotLike(String value) {
            addCriterion("recharge_deno not like", value, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoIn(List<String> values) {
            addCriterion("recharge_deno in", values, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotIn(List<String> values) {
            addCriterion("recharge_deno not in", values, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoBetween(String value1, String value2) {
            addCriterion("recharge_deno between", value1, value2, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeDenoNotBetween(String value1, String value2) {
            addCriterion("recharge_deno not between", value1, value2, "rechargeDeno");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIsNull() {
            addCriterion("recharge_voucher is null");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIsNotNull() {
            addCriterion("recharge_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherEqualTo(String value) {
            addCriterion("recharge_voucher =", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotEqualTo(String value) {
            addCriterion("recharge_voucher <>", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherGreaterThan(String value) {
            addCriterion("recharge_voucher >", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_voucher >=", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLessThan(String value) {
            addCriterion("recharge_voucher <", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLessThanOrEqualTo(String value) {
            addCriterion("recharge_voucher <=", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherLike(String value) {
            addCriterion("recharge_voucher like", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotLike(String value) {
            addCriterion("recharge_voucher not like", value, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherIn(List<String> values) {
            addCriterion("recharge_voucher in", values, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotIn(List<String> values) {
            addCriterion("recharge_voucher not in", values, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherBetween(String value1, String value2) {
            addCriterion("recharge_voucher between", value1, value2, "rechargeVoucher");
            return (Criteria) this;
        }

        public Criteria andRechargeVoucherNotBetween(String value1, String value2) {
            addCriterion("recharge_voucher not between", value1, value2, "rechargeVoucher");
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

        public Criteria andOrdersSnIsNull() {
            addCriterion("orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNotNull() {
            addCriterion("orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnEqualTo(Long value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(Long value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(Long value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(Long value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(Long value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<Long> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<Long> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(Long value1, Long value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(Long value1, Long value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNull() {
            addCriterion("promotion_title is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNotNull() {
            addCriterion("promotion_title is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleEqualTo(String value) {
            addCriterion("promotion_title =", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotEqualTo(String value) {
            addCriterion("promotion_title <>", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThan(String value) {
            addCriterion("promotion_title >", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_title >=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThan(String value) {
            addCriterion("promotion_title <", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThanOrEqualTo(String value) {
            addCriterion("promotion_title <=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLike(String value) {
            addCriterion("promotion_title like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotLike(String value) {
            addCriterion("promotion_title not like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIn(List<String> values) {
            addCriterion("promotion_title in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotIn(List<String> values) {
            addCriterion("promotion_title not in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleBetween(String value1, String value2) {
            addCriterion("promotion_title between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotBetween(String value1, String value2) {
            addCriterion("promotion_title not between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedIsNull() {
            addCriterion("refund_applyed is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedIsNotNull() {
            addCriterion("refund_applyed is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedEqualTo(Integer value) {
            addCriterion("refund_applyed =", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedNotEqualTo(Integer value) {
            addCriterion("refund_applyed <>", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedGreaterThan(Integer value) {
            addCriterion("refund_applyed >", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_applyed >=", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedLessThan(Integer value) {
            addCriterion("refund_applyed <", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedLessThanOrEqualTo(Integer value) {
            addCriterion("refund_applyed <=", value, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedIn(List<Integer> values) {
            addCriterion("refund_applyed in", values, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedNotIn(List<Integer> values) {
            addCriterion("refund_applyed not in", values, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedBetween(Integer value1, Integer value2) {
            addCriterion("refund_applyed between", value1, value2, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andRefundApplyedNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_applyed not between", value1, value2, "refundApplyed");
            return (Criteria) this;
        }

        public Criteria andSendTimesIsNull() {
            addCriterion("send_times is null");
            return (Criteria) this;
        }

        public Criteria andSendTimesIsNotNull() {
            addCriterion("send_times is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimesEqualTo(Integer value) {
            addCriterion("send_times =", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesNotEqualTo(Integer value) {
            addCriterion("send_times <>", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesGreaterThan(Integer value) {
            addCriterion("send_times >", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_times >=", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesLessThan(Integer value) {
            addCriterion("send_times <", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesLessThanOrEqualTo(Integer value) {
            addCriterion("send_times <=", value, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesIn(List<Integer> values) {
            addCriterion("send_times in", values, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesNotIn(List<Integer> values) {
            addCriterion("send_times not in", values, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesBetween(Integer value1, Integer value2) {
            addCriterion("send_times between", value1, value2, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andSendTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("send_times not between", value1, value2, "sendTimes");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIsNull() {
            addCriterion("shop_commitment_amount is null");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIsNotNull() {
            addCriterion("shop_commitment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount =", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount <>", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountGreaterThan(BigDecimal value) {
            addCriterion("shop_commitment_amount >", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount >=", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountLessThan(BigDecimal value) {
            addCriterion("shop_commitment_amount <", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_commitment_amount <=", value, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountIn(List<BigDecimal> values) {
            addCriterion("shop_commitment_amount in", values, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotIn(List<BigDecimal> values) {
            addCriterion("shop_commitment_amount not in", values, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_commitment_amount between", value1, value2, "shopCommitmentAmount");
            return (Criteria) this;
        }

        public Criteria andShopCommitmentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_commitment_amount not between", value1, value2, "shopCommitmentAmount");
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

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIsNull() {
            addCriterion("virtual_overdue_refund is null");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIsNotNull() {
            addCriterion("virtual_overdue_refund is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund =", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund <>", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundGreaterThan(Integer value) {
            addCriterion("virtual_overdue_refund >", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund >=", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundLessThan(Integer value) {
            addCriterion("virtual_overdue_refund <", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund <=", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIn(List<Integer> values) {
            addCriterion("virtual_overdue_refund in", values, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotIn(List<Integer> values) {
            addCriterion("virtual_overdue_refund not in", values, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundBetween(Integer value1, Integer value2) {
            addCriterion("virtual_overdue_refund between", value1, value2, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_overdue_refund not between", value1, value2, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIsNull() {
            addCriterion("online_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIsNotNull() {
            addCriterion("online_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceEqualTo(BigDecimal value) {
            addCriterion("online_pay_price =", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotEqualTo(BigDecimal value) {
            addCriterion("online_pay_price <>", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceGreaterThan(BigDecimal value) {
            addCriterion("online_pay_price >", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_price >=", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceLessThan(BigDecimal value) {
            addCriterion("online_pay_price <", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_price <=", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIn(List<BigDecimal> values) {
            addCriterion("online_pay_price in", values, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotIn(List<BigDecimal> values) {
            addCriterion("online_pay_price not in", values, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_price between", value1, value2, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_price not between", value1, value2, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceIsNull() {
            addCriterion("all_online_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceIsNotNull() {
            addCriterion("all_online_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceEqualTo(BigDecimal value) {
            addCriterion("all_online_pay_price =", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceNotEqualTo(BigDecimal value) {
            addCriterion("all_online_pay_price <>", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceGreaterThan(BigDecimal value) {
            addCriterion("all_online_pay_price >", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_online_pay_price >=", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceLessThan(BigDecimal value) {
            addCriterion("all_online_pay_price <", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_online_pay_price <=", value, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceIn(List<BigDecimal> values) {
            addCriterion("all_online_pay_price in", values, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceNotIn(List<BigDecimal> values) {
            addCriterion("all_online_pay_price not in", values, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_online_pay_price between", value1, value2, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andAllOnlinePayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_online_pay_price not between", value1, value2, "allOnlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIsNull() {
            addCriterion("dw_specsid is null");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIsNotNull() {
            addCriterion("dw_specsid is not null");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidEqualTo(Integer value) {
            addCriterion("dw_specsid =", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotEqualTo(Integer value) {
            addCriterion("dw_specsid <>", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidGreaterThan(Integer value) {
            addCriterion("dw_specsid >", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_specsid >=", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidLessThan(Integer value) {
            addCriterion("dw_specsid <", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidLessThanOrEqualTo(Integer value) {
            addCriterion("dw_specsid <=", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIn(List<Integer> values) {
            addCriterion("dw_specsid in", values, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotIn(List<Integer> values) {
            addCriterion("dw_specsid not in", values, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidBetween(Integer value1, Integer value2) {
            addCriterion("dw_specsid between", value1, value2, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_specsid not between", value1, value2, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNull() {
            addCriterion("dw_id is null");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNotNull() {
            addCriterion("dw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwIdEqualTo(Integer value) {
            addCriterion("dw_id =", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotEqualTo(Integer value) {
            addCriterion("dw_id <>", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThan(Integer value) {
            addCriterion("dw_id >", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_id >=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThan(Integer value) {
            addCriterion("dw_id <", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThanOrEqualTo(Integer value) {
            addCriterion("dw_id <=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdIn(List<Integer> values) {
            addCriterion("dw_id in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotIn(List<Integer> values) {
            addCriterion("dw_id not in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdBetween(Integer value1, Integer value2) {
            addCriterion("dw_id between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_id not between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andYgPriceIsNull() {
            addCriterion("yg_price is null");
            return (Criteria) this;
        }

        public Criteria andYgPriceIsNotNull() {
            addCriterion("yg_price is not null");
            return (Criteria) this;
        }

        public Criteria andYgPriceEqualTo(BigDecimal value) {
            addCriterion("yg_price =", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotEqualTo(BigDecimal value) {
            addCriterion("yg_price <>", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceGreaterThan(BigDecimal value) {
            addCriterion("yg_price >", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yg_price >=", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceLessThan(BigDecimal value) {
            addCriterion("yg_price <", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yg_price <=", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceIn(List<BigDecimal> values) {
            addCriterion("yg_price in", values, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotIn(List<BigDecimal> values) {
            addCriterion("yg_price not in", values, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yg_price between", value1, value2, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yg_price not between", value1, value2, "ygPrice");
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