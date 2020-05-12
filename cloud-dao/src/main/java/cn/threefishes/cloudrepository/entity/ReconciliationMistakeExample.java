package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReconciliationMistakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReconciliationMistakeExample() {
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

        public Criteria andMistakeIdIsNull() {
            addCriterion("mistake_id is null");
            return (Criteria) this;
        }

        public Criteria andMistakeIdIsNotNull() {
            addCriterion("mistake_id is not null");
            return (Criteria) this;
        }

        public Criteria andMistakeIdEqualTo(Integer value) {
            addCriterion("mistake_id =", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdNotEqualTo(Integer value) {
            addCriterion("mistake_id <>", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdGreaterThan(Integer value) {
            addCriterion("mistake_id >", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mistake_id >=", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdLessThan(Integer value) {
            addCriterion("mistake_id <", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mistake_id <=", value, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdIn(List<Integer> values) {
            addCriterion("mistake_id in", values, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdNotIn(List<Integer> values) {
            addCriterion("mistake_id not in", values, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdBetween(Integer value1, Integer value2) {
            addCriterion("mistake_id between", value1, value2, "mistakeId");
            return (Criteria) this;
        }

        public Criteria andMistakeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mistake_id not between", value1, value2, "mistakeId");
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

        public Criteria andOrdersSnEqualTo(String value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(String value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(String value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(String value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLike(String value) {
            addCriterion("orders_sn like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotLike(String value) {
            addCriterion("orders_sn not like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<String> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<String> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(String value1, String value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(String value1, String value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIsNull() {
            addCriterion("out_orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIsNotNull() {
            addCriterion("out_orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnEqualTo(String value) {
            addCriterion("out_orders_sn =", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotEqualTo(String value) {
            addCriterion("out_orders_sn <>", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnGreaterThan(String value) {
            addCriterion("out_orders_sn >", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("out_orders_sn >=", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLessThan(String value) {
            addCriterion("out_orders_sn <", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("out_orders_sn <=", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnLike(String value) {
            addCriterion("out_orders_sn like", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotLike(String value) {
            addCriterion("out_orders_sn not like", value, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnIn(List<String> values) {
            addCriterion("out_orders_sn in", values, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotIn(List<String> values) {
            addCriterion("out_orders_sn not in", values, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnBetween(String value1, String value2) {
            addCriterion("out_orders_sn between", value1, value2, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andOutOrdersSnNotBetween(String value1, String value2) {
            addCriterion("out_orders_sn not between", value1, value2, "outOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(String value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(String value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(String value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(String value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(String value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(String value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLike(String value) {
            addCriterion("pay_sn like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotLike(String value) {
            addCriterion("pay_sn not like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<String> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<String> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(String value1, String value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(String value1, String value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNull() {
            addCriterion("refund_sn is null");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNotNull() {
            addCriterion("refund_sn is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSnEqualTo(String value) {
            addCriterion("refund_sn =", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotEqualTo(String value) {
            addCriterion("refund_sn <>", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThan(String value) {
            addCriterion("refund_sn >", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThanOrEqualTo(String value) {
            addCriterion("refund_sn >=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThan(String value) {
            addCriterion("refund_sn <", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThanOrEqualTo(String value) {
            addCriterion("refund_sn <=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLike(String value) {
            addCriterion("refund_sn like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotLike(String value) {
            addCriterion("refund_sn not like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIn(List<String> values) {
            addCriterion("refund_sn in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotIn(List<String> values) {
            addCriterion("refund_sn not in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnBetween(String value1, String value2) {
            addCriterion("refund_sn between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotBetween(String value1, String value2) {
            addCriterion("refund_sn not between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
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

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNull() {
            addCriterion("orders_state is null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNotNull() {
            addCriterion("orders_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateEqualTo(Integer value) {
            addCriterion("orders_state =", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotEqualTo(Integer value) {
            addCriterion("orders_state <>", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThan(Integer value) {
            addCriterion("orders_state >", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_state >=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThan(Integer value) {
            addCriterion("orders_state <", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThanOrEqualTo(Integer value) {
            addCriterion("orders_state <=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIn(List<Integer> values) {
            addCriterion("orders_state in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotIn(List<Integer> values) {
            addCriterion("orders_state not in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateBetween(Integer value1, Integer value2) {
            addCriterion("orders_state between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_state not between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeIsNull() {
            addCriterion("out_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeIsNotNull() {
            addCriterion("out_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeEqualTo(Date value) {
            addCriterion("out_payment_time =", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeNotEqualTo(Date value) {
            addCriterion("out_payment_time <>", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeGreaterThan(Date value) {
            addCriterion("out_payment_time >", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("out_payment_time >=", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeLessThan(Date value) {
            addCriterion("out_payment_time <", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("out_payment_time <=", value, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeIn(List<Date> values) {
            addCriterion("out_payment_time in", values, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeNotIn(List<Date> values) {
            addCriterion("out_payment_time not in", values, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("out_payment_time between", value1, value2, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("out_payment_time not between", value1, value2, "outPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountIsNull() {
            addCriterion("out_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountIsNotNull() {
            addCriterion("out_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountEqualTo(BigDecimal value) {
            addCriterion("out_pay_amount =", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("out_pay_amount <>", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountGreaterThan(BigDecimal value) {
            addCriterion("out_pay_amount >", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_pay_amount >=", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountLessThan(BigDecimal value) {
            addCriterion("out_pay_amount <", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_pay_amount <=", value, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountIn(List<BigDecimal> values) {
            addCriterion("out_pay_amount in", values, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("out_pay_amount not in", values, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_pay_amount between", value1, value2, "outPayAmount");
            return (Criteria) this;
        }

        public Criteria andOutPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_pay_amount not between", value1, value2, "outPayAmount");
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