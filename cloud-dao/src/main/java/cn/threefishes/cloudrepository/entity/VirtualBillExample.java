package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VirtualBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualBillExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillSnIsNull() {
            addCriterion("bill_sn is null");
            return (Criteria) this;
        }

        public Criteria andBillSnIsNotNull() {
            addCriterion("bill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBillSnEqualTo(Integer value) {
            addCriterion("bill_sn =", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnNotEqualTo(Integer value) {
            addCriterion("bill_sn <>", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnGreaterThan(Integer value) {
            addCriterion("bill_sn >", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_sn >=", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnLessThan(Integer value) {
            addCriterion("bill_sn <", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnLessThanOrEqualTo(Integer value) {
            addCriterion("bill_sn <=", value, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnIn(List<Integer> values) {
            addCriterion("bill_sn in", values, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnNotIn(List<Integer> values) {
            addCriterion("bill_sn not in", values, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnBetween(Integer value1, Integer value2) {
            addCriterion("bill_sn between", value1, value2, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillSnNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_sn not between", value1, value2, "billSn");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNull() {
            addCriterion("bill_state is null");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNotNull() {
            addCriterion("bill_state is not null");
            return (Criteria) this;
        }

        public Criteria andBillStateEqualTo(Integer value) {
            addCriterion("bill_state =", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotEqualTo(Integer value) {
            addCriterion("bill_state <>", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThan(Integer value) {
            addCriterion("bill_state >", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_state >=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThan(Integer value) {
            addCriterion("bill_state <", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThanOrEqualTo(Integer value) {
            addCriterion("bill_state <=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateIn(List<Integer> values) {
            addCriterion("bill_state in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotIn(List<Integer> values) {
            addCriterion("bill_state not in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateBetween(Integer value1, Integer value2) {
            addCriterion("bill_state between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_state not between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andCode1AmountIsNull() {
            addCriterion("code1_amount is null");
            return (Criteria) this;
        }

        public Criteria andCode1AmountIsNotNull() {
            addCriterion("code1_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCode1AmountEqualTo(BigDecimal value) {
            addCriterion("code1_amount =", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountNotEqualTo(BigDecimal value) {
            addCriterion("code1_amount <>", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountGreaterThan(BigDecimal value) {
            addCriterion("code1_amount >", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("code1_amount >=", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountLessThan(BigDecimal value) {
            addCriterion("code1_amount <", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("code1_amount <=", value, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountIn(List<BigDecimal> values) {
            addCriterion("code1_amount in", values, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountNotIn(List<BigDecimal> values) {
            addCriterion("code1_amount not in", values, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("code1_amount between", value1, value2, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode1AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("code1_amount not between", value1, value2, "code1Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountIsNull() {
            addCriterion("code2_amount is null");
            return (Criteria) this;
        }

        public Criteria andCode2AmountIsNotNull() {
            addCriterion("code2_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCode2AmountEqualTo(BigDecimal value) {
            addCriterion("code2_amount =", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountNotEqualTo(BigDecimal value) {
            addCriterion("code2_amount <>", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountGreaterThan(BigDecimal value) {
            addCriterion("code2_amount >", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("code2_amount >=", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountLessThan(BigDecimal value) {
            addCriterion("code2_amount <", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("code2_amount <=", value, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountIn(List<BigDecimal> values) {
            addCriterion("code2_amount in", values, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountNotIn(List<BigDecimal> values) {
            addCriterion("code2_amount not in", values, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("code2_amount between", value1, value2, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCode2AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("code2_amount not between", value1, value2, "code2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountIsNull() {
            addCriterion("commission1_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountIsNotNull() {
            addCriterion("commission1_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountEqualTo(BigDecimal value) {
            addCriterion("commission1_amount =", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountNotEqualTo(BigDecimal value) {
            addCriterion("commission1_amount <>", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountGreaterThan(BigDecimal value) {
            addCriterion("commission1_amount >", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission1_amount >=", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountLessThan(BigDecimal value) {
            addCriterion("commission1_amount <", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission1_amount <=", value, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountIn(List<BigDecimal> values) {
            addCriterion("commission1_amount in", values, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountNotIn(List<BigDecimal> values) {
            addCriterion("commission1_amount not in", values, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission1_amount between", value1, value2, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission1AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission1_amount not between", value1, value2, "commission1Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountIsNull() {
            addCriterion("commission2_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountIsNotNull() {
            addCriterion("commission2_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountEqualTo(BigDecimal value) {
            addCriterion("commission2_amount =", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountNotEqualTo(BigDecimal value) {
            addCriterion("commission2_amount <>", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountGreaterThan(BigDecimal value) {
            addCriterion("commission2_amount >", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission2_amount >=", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountLessThan(BigDecimal value) {
            addCriterion("commission2_amount <", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission2_amount <=", value, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountIn(List<BigDecimal> values) {
            addCriterion("commission2_amount in", values, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountNotIn(List<BigDecimal> values) {
            addCriterion("commission2_amount not in", values, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission2_amount between", value1, value2, "commission2Amount");
            return (Criteria) this;
        }

        public Criteria andCommission2AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission2_amount not between", value1, value2, "commission2Amount");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteIsNull() {
            addCriterion("payment_note is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteIsNotNull() {
            addCriterion("payment_note is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteEqualTo(String value) {
            addCriterion("payment_note =", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteNotEqualTo(String value) {
            addCriterion("payment_note <>", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteGreaterThan(String value) {
            addCriterion("payment_note >", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteGreaterThanOrEqualTo(String value) {
            addCriterion("payment_note >=", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteLessThan(String value) {
            addCriterion("payment_note <", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteLessThanOrEqualTo(String value) {
            addCriterion("payment_note <=", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteLike(String value) {
            addCriterion("payment_note like", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteNotLike(String value) {
            addCriterion("payment_note not like", value, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteIn(List<String> values) {
            addCriterion("payment_note in", values, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteNotIn(List<String> values) {
            addCriterion("payment_note not in", values, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteBetween(String value1, String value2) {
            addCriterion("payment_note between", value1, value2, "paymentNote");
            return (Criteria) this;
        }

        public Criteria andPaymentNoteNotBetween(String value1, String value2) {
            addCriterion("payment_note not between", value1, value2, "paymentNote");
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

        public Criteria andRefundCouponAmountIsNull() {
            addCriterion("refund_coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountIsNotNull() {
            addCriterion("refund_coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountEqualTo(BigDecimal value) {
            addCriterion("refund_coupon_amount =", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_coupon_amount <>", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_coupon_amount >", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_coupon_amount >=", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountLessThan(BigDecimal value) {
            addCriterion("refund_coupon_amount <", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_coupon_amount <=", value, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountIn(List<BigDecimal> values) {
            addCriterion("refund_coupon_amount in", values, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_coupon_amount not in", values, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_coupon_amount between", value1, value2, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_coupon_amount not between", value1, value2, "refundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNull() {
            addCriterion("state_time is null");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNotNull() {
            addCriterion("state_time is not null");
            return (Criteria) this;
        }

        public Criteria andStateTimeEqualTo(Date value) {
            addCriterion("state_time =", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotEqualTo(Date value) {
            addCriterion("state_time <>", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThan(Date value) {
            addCriterion("state_time >", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("state_time >=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThan(Date value) {
            addCriterion("state_time <", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThanOrEqualTo(Date value) {
            addCriterion("state_time <=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeIn(List<Date> values) {
            addCriterion("state_time in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotIn(List<Date> values) {
            addCriterion("state_time not in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeBetween(Date value1, Date value2) {
            addCriterion("state_time between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotBetween(Date value1, Date value2) {
            addCriterion("state_time not between", value1, value2, "stateTime");
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