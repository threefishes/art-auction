package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundBookExample() {
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

        public Criteria andRefundBookIdIsNull() {
            addCriterion("refund_book_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdIsNotNull() {
            addCriterion("refund_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdEqualTo(Integer value) {
            addCriterion("refund_book_id =", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdNotEqualTo(Integer value) {
            addCriterion("refund_book_id <>", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdGreaterThan(Integer value) {
            addCriterion("refund_book_id >", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_book_id >=", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdLessThan(Integer value) {
            addCriterion("refund_book_id <", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_book_id <=", value, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdIn(List<Integer> values) {
            addCriterion("refund_book_id in", values, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdNotIn(List<Integer> values) {
            addCriterion("refund_book_id not in", values, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_book_id between", value1, value2, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andRefundBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_book_id not between", value1, value2, "refundBookId");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBookStepIsNull() {
            addCriterion("book_step is null");
            return (Criteria) this;
        }

        public Criteria andBookStepIsNotNull() {
            addCriterion("book_step is not null");
            return (Criteria) this;
        }

        public Criteria andBookStepEqualTo(String value) {
            addCriterion("book_step =", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotEqualTo(String value) {
            addCriterion("book_step <>", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepGreaterThan(String value) {
            addCriterion("book_step >", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepGreaterThanOrEqualTo(String value) {
            addCriterion("book_step >=", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepLessThan(String value) {
            addCriterion("book_step <", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepLessThanOrEqualTo(String value) {
            addCriterion("book_step <=", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepLike(String value) {
            addCriterion("book_step like", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotLike(String value) {
            addCriterion("book_step not like", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepIn(List<String> values) {
            addCriterion("book_step in", values, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotIn(List<String> values) {
            addCriterion("book_step not in", values, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepBetween(String value1, String value2) {
            addCriterion("book_step between", value1, value2, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotBetween(String value1, String value2) {
            addCriterion("book_step not between", value1, value2, "bookStep");
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

        public Criteria andOutRefundIdIsNull() {
            addCriterion("out_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdIsNotNull() {
            addCriterion("out_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdEqualTo(String value) {
            addCriterion("out_refund_id =", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdNotEqualTo(String value) {
            addCriterion("out_refund_id <>", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdGreaterThan(String value) {
            addCriterion("out_refund_id >", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_refund_id >=", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdLessThan(String value) {
            addCriterion("out_refund_id <", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdLessThanOrEqualTo(String value) {
            addCriterion("out_refund_id <=", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdLike(String value) {
            addCriterion("out_refund_id like", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdNotLike(String value) {
            addCriterion("out_refund_id not like", value, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdIn(List<String> values) {
            addCriterion("out_refund_id in", values, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdNotIn(List<String> values) {
            addCriterion("out_refund_id not in", values, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdBetween(String value1, String value2) {
            addCriterion("out_refund_id between", value1, value2, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andOutRefundIdNotBetween(String value1, String value2) {
            addCriterion("out_refund_id not between", value1, value2, "outRefundId");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
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

        public Criteria andPaySnEqualTo(Long value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(Long value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(Long value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(Long value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(Long value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<Long> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<Long> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(Long value1, Long value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(Long value1, Long value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIsNull() {
            addCriterion("payment_client_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIsNotNull() {
            addCriterion("payment_client_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeEqualTo(String value) {
            addCriterion("payment_client_type =", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotEqualTo(String value) {
            addCriterion("payment_client_type <>", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeGreaterThan(String value) {
            addCriterion("payment_client_type >", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_client_type >=", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLessThan(String value) {
            addCriterion("payment_client_type <", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_client_type <=", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeLike(String value) {
            addCriterion("payment_client_type like", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotLike(String value) {
            addCriterion("payment_client_type not like", value, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeIn(List<String> values) {
            addCriterion("payment_client_type in", values, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotIn(List<String> values) {
            addCriterion("payment_client_type not in", values, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeBetween(String value1, String value2) {
            addCriterion("payment_client_type between", value1, value2, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentClientTypeNotBetween(String value1, String value2) {
            addCriterion("payment_client_type not between", value1, value2, "paymentClientType");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNull() {
            addCriterion("payment_code is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("payment_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(String value) {
            addCriterion("payment_code =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(String value) {
            addCriterion("payment_code <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(String value) {
            addCriterion("payment_code >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_code >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(String value) {
            addCriterion("payment_code <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(String value) {
            addCriterion("payment_code <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLike(String value) {
            addCriterion("payment_code like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotLike(String value) {
            addCriterion("payment_code not like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<String> values) {
            addCriterion("payment_code in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<String> values) {
            addCriterion("payment_code not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(String value1, String value2) {
            addCriterion("payment_code between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(String value1, String value2) {
            addCriterion("payment_code not between", value1, value2, "paymentCode");
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

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Integer value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Integer value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Integer value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Integer value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Integer> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Integer> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
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

        public Criteria andRefundSnEqualTo(Long value) {
            addCriterion("refund_sn =", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotEqualTo(Long value) {
            addCriterion("refund_sn <>", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThan(Long value) {
            addCriterion("refund_sn >", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_sn >=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThan(Long value) {
            addCriterion("refund_sn <", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThanOrEqualTo(Long value) {
            addCriterion("refund_sn <=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIn(List<Long> values) {
            addCriterion("refund_sn in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotIn(List<Long> values) {
            addCriterion("refund_sn not in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnBetween(Long value1, Long value2) {
            addCriterion("refund_sn between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotBetween(Long value1, Long value2) {
            addCriterion("refund_sn not between", value1, value2, "refundSn");
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