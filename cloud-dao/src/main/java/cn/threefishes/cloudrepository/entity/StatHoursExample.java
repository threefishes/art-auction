package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatHoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatHoursExample() {
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

        public Criteria andStatIdIsNull() {
            addCriterion("stat_id is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(Integer value) {
            addCriterion("stat_id =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(Integer value) {
            addCriterion("stat_id <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(Integer value) {
            addCriterion("stat_id >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_id >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(Integer value) {
            addCriterion("stat_id <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("stat_id <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<Integer> values) {
            addCriterion("stat_id in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<Integer> values) {
            addCriterion("stat_id not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(Integer value1, Integer value2) {
            addCriterion("stat_id between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_id not between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumIsNull() {
            addCriterion("new_goods_common_num is null");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumIsNotNull() {
            addCriterion("new_goods_common_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumEqualTo(Long value) {
            addCriterion("new_goods_common_num =", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumNotEqualTo(Long value) {
            addCriterion("new_goods_common_num <>", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumGreaterThan(Long value) {
            addCriterion("new_goods_common_num >", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumGreaterThanOrEqualTo(Long value) {
            addCriterion("new_goods_common_num >=", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumLessThan(Long value) {
            addCriterion("new_goods_common_num <", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumLessThanOrEqualTo(Long value) {
            addCriterion("new_goods_common_num <=", value, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumIn(List<Long> values) {
            addCriterion("new_goods_common_num in", values, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumNotIn(List<Long> values) {
            addCriterion("new_goods_common_num not in", values, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumBetween(Long value1, Long value2) {
            addCriterion("new_goods_common_num between", value1, value2, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewGoodsCommonNumNotBetween(Long value1, Long value2) {
            addCriterion("new_goods_common_num not between", value1, value2, "newGoodsCommonNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumIsNull() {
            addCriterion("new_member_num is null");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumIsNotNull() {
            addCriterion("new_member_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumEqualTo(Long value) {
            addCriterion("new_member_num =", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumNotEqualTo(Long value) {
            addCriterion("new_member_num <>", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumGreaterThan(Long value) {
            addCriterion("new_member_num >", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumGreaterThanOrEqualTo(Long value) {
            addCriterion("new_member_num >=", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumLessThan(Long value) {
            addCriterion("new_member_num <", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumLessThanOrEqualTo(Long value) {
            addCriterion("new_member_num <=", value, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumIn(List<Long> values) {
            addCriterion("new_member_num in", values, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumNotIn(List<Long> values) {
            addCriterion("new_member_num not in", values, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumBetween(Long value1, Long value2) {
            addCriterion("new_member_num between", value1, value2, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewMemberNumNotBetween(Long value1, Long value2) {
            addCriterion("new_member_num not between", value1, value2, "newMemberNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumIsNull() {
            addCriterion("new_store_num is null");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumIsNotNull() {
            addCriterion("new_store_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumEqualTo(Long value) {
            addCriterion("new_store_num =", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumNotEqualTo(Long value) {
            addCriterion("new_store_num <>", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumGreaterThan(Long value) {
            addCriterion("new_store_num >", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumGreaterThanOrEqualTo(Long value) {
            addCriterion("new_store_num >=", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumLessThan(Long value) {
            addCriterion("new_store_num <", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumLessThanOrEqualTo(Long value) {
            addCriterion("new_store_num <=", value, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumIn(List<Long> values) {
            addCriterion("new_store_num in", values, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumNotIn(List<Long> values) {
            addCriterion("new_store_num not in", values, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumBetween(Long value1, Long value2) {
            addCriterion("new_store_num between", value1, value2, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andNewStoreNumNotBetween(Long value1, Long value2) {
            addCriterion("new_store_num not between", value1, value2, "newStoreNum");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNull() {
            addCriterion("orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNotNull() {
            addCriterion("orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountEqualTo(BigDecimal value) {
            addCriterion("orders_amount =", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotEqualTo(BigDecimal value) {
            addCriterion("orders_amount <>", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThan(BigDecimal value) {
            addCriterion("orders_amount >", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_amount >=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThan(BigDecimal value) {
            addCriterion("orders_amount <", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_amount <=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIn(List<BigDecimal> values) {
            addCriterion("orders_amount in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotIn(List<BigDecimal> values) {
            addCriterion("orders_amount not in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_amount between", value1, value2, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_amount not between", value1, value2, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIsNull() {
            addCriterion("orders_num is null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIsNotNull() {
            addCriterion("orders_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumEqualTo(Long value) {
            addCriterion("orders_num =", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotEqualTo(Long value) {
            addCriterion("orders_num <>", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThan(Long value) {
            addCriterion("orders_num >", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_num >=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThan(Long value) {
            addCriterion("orders_num <", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThanOrEqualTo(Long value) {
            addCriterion("orders_num <=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIn(List<Long> values) {
            addCriterion("orders_num in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotIn(List<Long> values) {
            addCriterion("orders_num not in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumBetween(Long value1, Long value2) {
            addCriterion("orders_num between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotBetween(Long value1, Long value2) {
            addCriterion("orders_num not between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountIsNull() {
            addCriterion("predeposit_balance_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountIsNotNull() {
            addCriterion("predeposit_balance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_balance_amount =", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_balance_amount <>", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_balance_amount >", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_balance_amount >=", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_balance_amount <", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_balance_amount <=", value, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_balance_amount in", values, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_balance_amount not in", values, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_balance_amount between", value1, value2, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositBalanceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_balance_amount not between", value1, value2, "predepositBalanceAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountIsNull() {
            addCriterion("predeposit_cash_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountIsNotNull() {
            addCriterion("predeposit_cash_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_cash_amount =", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_cash_amount <>", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_cash_amount >", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_cash_amount >=", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_cash_amount <", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_cash_amount <=", value, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_cash_amount in", values, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_cash_amount not in", values, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_cash_amount between", value1, value2, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositCashAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_cash_amount not between", value1, value2, "predepositCashAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountIsNull() {
            addCriterion("predeposit_consume_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountIsNotNull() {
            addCriterion("predeposit_consume_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_consume_amount =", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_consume_amount <>", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_consume_amount >", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_consume_amount >=", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_consume_amount <", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_consume_amount <=", value, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_consume_amount in", values, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_consume_amount not in", values, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_consume_amount between", value1, value2, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_consume_amount not between", value1, value2, "predepositConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountIsNull() {
            addCriterion("predeposit_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountIsNotNull() {
            addCriterion("predeposit_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_recharge_amount =", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_recharge_amount <>", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_recharge_amount >", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_recharge_amount >=", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_recharge_amount <", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_recharge_amount <=", value, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_recharge_amount in", values, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_recharge_amount not in", values, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_recharge_amount between", value1, value2, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_recharge_amount not between", value1, value2, "predepositRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountIsNull() {
            addCriterion("predeposit_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountIsNotNull() {
            addCriterion("predeposit_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_refund_amount =", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_refund_amount <>", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_refund_amount >", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_refund_amount >=", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_refund_amount <", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_refund_amount <=", value, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_refund_amount in", values, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_refund_amount not in", values, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_refund_amount between", value1, value2, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_refund_amount not between", value1, value2, "predepositRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNull() {
            addCriterion("stat_date is null");
            return (Criteria) this;
        }

        public Criteria andStatDateIsNotNull() {
            addCriterion("stat_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatDateEqualTo(Date value) {
            addCriterion("stat_date =", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotEqualTo(Date value) {
            addCriterion("stat_date <>", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThan(Date value) {
            addCriterion("stat_date >", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stat_date >=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThan(Date value) {
            addCriterion("stat_date <", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateLessThanOrEqualTo(Date value) {
            addCriterion("stat_date <=", value, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateIn(List<Date> values) {
            addCriterion("stat_date in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotIn(List<Date> values) {
            addCriterion("stat_date not in", values, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateBetween(Date value1, Date value2) {
            addCriterion("stat_date between", value1, value2, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatDateNotBetween(Date value1, Date value2) {
            addCriterion("stat_date not between", value1, value2, "statDate");
            return (Criteria) this;
        }

        public Criteria andStatHourIsNull() {
            addCriterion("stat_hour is null");
            return (Criteria) this;
        }

        public Criteria andStatHourIsNotNull() {
            addCriterion("stat_hour is not null");
            return (Criteria) this;
        }

        public Criteria andStatHourEqualTo(Integer value) {
            addCriterion("stat_hour =", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotEqualTo(Integer value) {
            addCriterion("stat_hour <>", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourGreaterThan(Integer value) {
            addCriterion("stat_hour >", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_hour >=", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourLessThan(Integer value) {
            addCriterion("stat_hour <", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourLessThanOrEqualTo(Integer value) {
            addCriterion("stat_hour <=", value, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourIn(List<Integer> values) {
            addCriterion("stat_hour in", values, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotIn(List<Integer> values) {
            addCriterion("stat_hour not in", values, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourBetween(Integer value1, Integer value2) {
            addCriterion("stat_hour between", value1, value2, "statHour");
            return (Criteria) this;
        }

        public Criteria andStatHourNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_hour not between", value1, value2, "statHour");
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