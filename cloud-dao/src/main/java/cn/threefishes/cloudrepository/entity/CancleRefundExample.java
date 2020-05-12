package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CancleRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CancleRefundExample() {
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

        public Criteria andCancleRefundIdIsNull() {
            addCriterion("cancle_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdIsNotNull() {
            addCriterion("cancle_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdEqualTo(Integer value) {
            addCriterion("cancle_refund_id =", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdNotEqualTo(Integer value) {
            addCriterion("cancle_refund_id <>", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdGreaterThan(Integer value) {
            addCriterion("cancle_refund_id >", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancle_refund_id >=", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdLessThan(Integer value) {
            addCriterion("cancle_refund_id <", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("cancle_refund_id <=", value, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdIn(List<Integer> values) {
            addCriterion("cancle_refund_id in", values, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdNotIn(List<Integer> values) {
            addCriterion("cancle_refund_id not in", values, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("cancle_refund_id between", value1, value2, "cancleRefundId");
            return (Criteria) this;
        }

        public Criteria andCancleRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cancle_refund_id not between", value1, value2, "cancleRefundId");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNull() {
            addCriterion("admin_message is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNotNull() {
            addCriterion("admin_message is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageEqualTo(String value) {
            addCriterion("admin_message =", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotEqualTo(String value) {
            addCriterion("admin_message <>", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThan(String value) {
            addCriterion("admin_message >", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_message >=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThan(String value) {
            addCriterion("admin_message <", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThanOrEqualTo(String value) {
            addCriterion("admin_message <=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLike(String value) {
            addCriterion("admin_message like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotLike(String value) {
            addCriterion("admin_message not like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIn(List<String> values) {
            addCriterion("admin_message in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotIn(List<String> values) {
            addCriterion("admin_message not in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageBetween(String value1, String value2) {
            addCriterion("admin_message between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotBetween(String value1, String value2) {
            addCriterion("admin_message not between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNull() {
            addCriterion("admin_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNotNull() {
            addCriterion("admin_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeEqualTo(Date value) {
            addCriterion("admin_time =", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotEqualTo(Date value) {
            addCriterion("admin_time <>", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThan(Date value) {
            addCriterion("admin_time >", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_time >=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThan(Date value) {
            addCriterion("admin_time <", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_time <=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIn(List<Date> values) {
            addCriterion("admin_time in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotIn(List<Date> values) {
            addCriterion("admin_time not in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeBetween(Date value1, Date value2) {
            addCriterion("admin_time between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_time not between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeIsNull() {
            addCriterion("bill_time is null");
            return (Criteria) this;
        }

        public Criteria andBillTimeIsNotNull() {
            addCriterion("bill_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillTimeEqualTo(Date value) {
            addCriterion("bill_time =", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotEqualTo(Date value) {
            addCriterion("bill_time <>", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeGreaterThan(Date value) {
            addCriterion("bill_time >", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_time >=", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeLessThan(Date value) {
            addCriterion("bill_time <", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_time <=", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeIn(List<Date> values) {
            addCriterion("bill_time in", values, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotIn(List<Date> values) {
            addCriterion("bill_time not in", values, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeBetween(Date value1, Date value2) {
            addCriterion("bill_time between", value1, value2, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_time not between", value1, value2, "billTime");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLike(String value) {
            addCriterion("buyer_message like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyerMessage");
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

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(Date value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(Date value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(Date value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(Date value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(Date value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<Date> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<Date> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(Date value1, Date value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(Date value1, Date value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
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

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Integer value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Integer value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Integer value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Integer value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Integer> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Integer> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
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

        public Criteria andOrderGoodsTypeIsNull() {
            addCriterion("order_goods_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeIsNotNull() {
            addCriterion("order_goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeEqualTo(Integer value) {
            addCriterion("order_goods_type =", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotEqualTo(Integer value) {
            addCriterion("order_goods_type <>", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeGreaterThan(Integer value) {
            addCriterion("order_goods_type >", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_type >=", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeLessThan(Integer value) {
            addCriterion("order_goods_type <", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_type <=", value, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeIn(List<Integer> values) {
            addCriterion("order_goods_type in", values, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotIn(List<Integer> values) {
            addCriterion("order_goods_type not in", values, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_type between", value1, value2, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_type not between", value1, value2, "orderGoodsType");
            return (Criteria) this;
        }

        public Criteria andOrderLockIsNull() {
            addCriterion("order_lock is null");
            return (Criteria) this;
        }

        public Criteria andOrderLockIsNotNull() {
            addCriterion("order_lock is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLockEqualTo(Integer value) {
            addCriterion("order_lock =", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotEqualTo(Integer value) {
            addCriterion("order_lock <>", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockGreaterThan(Integer value) {
            addCriterion("order_lock >", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_lock >=", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockLessThan(Integer value) {
            addCriterion("order_lock <", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockLessThanOrEqualTo(Integer value) {
            addCriterion("order_lock <=", value, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockIn(List<Integer> values) {
            addCriterion("order_lock in", values, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotIn(List<Integer> values) {
            addCriterion("order_lock not in", values, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockBetween(Integer value1, Integer value2) {
            addCriterion("order_lock between", value1, value2, "orderLock");
            return (Criteria) this;
        }

        public Criteria andOrderLockNotBetween(Integer value1, Integer value2) {
            addCriterion("order_lock not between", value1, value2, "orderLock");
            return (Criteria) this;
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

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNull() {
            addCriterion("reason_id is null");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNotNull() {
            addCriterion("reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andReasonIdEqualTo(Integer value) {
            addCriterion("reason_id =", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotEqualTo(Integer value) {
            addCriterion("reason_id <>", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThan(Integer value) {
            addCriterion("reason_id >", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reason_id >=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThan(Integer value) {
            addCriterion("reason_id <", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThanOrEqualTo(Integer value) {
            addCriterion("reason_id <=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdIn(List<Integer> values) {
            addCriterion("reason_id in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotIn(List<Integer> values) {
            addCriterion("reason_id not in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdBetween(Integer value1, Integer value2) {
            addCriterion("reason_id between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reason_id not between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIsNull() {
            addCriterion("reason_info is null");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIsNotNull() {
            addCriterion("reason_info is not null");
            return (Criteria) this;
        }

        public Criteria andReasonInfoEqualTo(String value) {
            addCriterion("reason_info =", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotEqualTo(String value) {
            addCriterion("reason_info <>", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoGreaterThan(String value) {
            addCriterion("reason_info >", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reason_info >=", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLessThan(String value) {
            addCriterion("reason_info <", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLessThanOrEqualTo(String value) {
            addCriterion("reason_info <=", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoLike(String value) {
            addCriterion("reason_info like", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotLike(String value) {
            addCriterion("reason_info not like", value, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoIn(List<String> values) {
            addCriterion("reason_info in", values, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotIn(List<String> values) {
            addCriterion("reason_info not in", values, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoBetween(String value1, String value2) {
            addCriterion("reason_info between", value1, value2, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReasonInfoNotBetween(String value1, String value2) {
            addCriterion("reason_info not between", value1, value2, "reasonInfo");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIsNull() {
            addCriterion("receive_message is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIsNotNull() {
            addCriterion("receive_message is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageEqualTo(String value) {
            addCriterion("receive_message =", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotEqualTo(String value) {
            addCriterion("receive_message <>", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageGreaterThan(String value) {
            addCriterion("receive_message >", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageGreaterThanOrEqualTo(String value) {
            addCriterion("receive_message >=", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLessThan(String value) {
            addCriterion("receive_message <", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLessThanOrEqualTo(String value) {
            addCriterion("receive_message <=", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageLike(String value) {
            addCriterion("receive_message like", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotLike(String value) {
            addCriterion("receive_message not like", value, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageIn(List<String> values) {
            addCriterion("receive_message in", values, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotIn(List<String> values) {
            addCriterion("receive_message not in", values, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageBetween(String value1, String value2) {
            addCriterion("receive_message between", value1, value2, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveMessageNotBetween(String value1, String value2) {
            addCriterion("receive_message not between", value1, value2, "receiveMessage");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
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

        public Criteria andRefundStateIsNull() {
            addCriterion("refund_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(Integer value) {
            addCriterion("refund_state =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(Integer value) {
            addCriterion("refund_state <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(Integer value) {
            addCriterion("refund_state >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_state >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(Integer value) {
            addCriterion("refund_state <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(Integer value) {
            addCriterion("refund_state <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<Integer> values) {
            addCriterion("refund_state in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<Integer> values) {
            addCriterion("refund_state not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(Integer value1, Integer value2) {
            addCriterion("refund_state between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_state not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNull() {
            addCriterion("refund_type is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("refund_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Integer value) {
            addCriterion("refund_type =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Integer value) {
            addCriterion("refund_type <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Integer value) {
            addCriterion("refund_type >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_type >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Integer value) {
            addCriterion("refund_type <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_type <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Integer> values) {
            addCriterion("refund_type in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Integer> values) {
            addCriterion("refund_type not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Integer value1, Integer value2) {
            addCriterion("refund_type between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_type not between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(Integer value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(Integer value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(Integer value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(Integer value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<Integer> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<Integer> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(Integer value1, Integer value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIsNull() {
            addCriterion("seller_message is null");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIsNotNull() {
            addCriterion("seller_message is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMessageEqualTo(String value) {
            addCriterion("seller_message =", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotEqualTo(String value) {
            addCriterion("seller_message <>", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageGreaterThan(String value) {
            addCriterion("seller_message >", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("seller_message >=", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLessThan(String value) {
            addCriterion("seller_message <", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLessThanOrEqualTo(String value) {
            addCriterion("seller_message <=", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageLike(String value) {
            addCriterion("seller_message like", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotLike(String value) {
            addCriterion("seller_message not like", value, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageIn(List<String> values) {
            addCriterion("seller_message in", values, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotIn(List<String> values) {
            addCriterion("seller_message not in", values, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageBetween(String value1, String value2) {
            addCriterion("seller_message between", value1, value2, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerMessageNotBetween(String value1, String value2) {
            addCriterion("seller_message not between", value1, value2, "sellerMessage");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNull() {
            addCriterion("seller_state is null");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNotNull() {
            addCriterion("seller_state is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStateEqualTo(Integer value) {
            addCriterion("seller_state =", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotEqualTo(Integer value) {
            addCriterion("seller_state <>", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThan(Integer value) {
            addCriterion("seller_state >", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_state >=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThan(Integer value) {
            addCriterion("seller_state <", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThanOrEqualTo(Integer value) {
            addCriterion("seller_state <=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateIn(List<Integer> values) {
            addCriterion("seller_state in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotIn(List<Integer> values) {
            addCriterion("seller_state not in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateBetween(Integer value1, Integer value2) {
            addCriterion("seller_state between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_state not between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIsNull() {
            addCriterion("seller_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIsNotNull() {
            addCriterion("seller_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeEqualTo(Date value) {
            addCriterion("seller_time =", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotEqualTo(Date value) {
            addCriterion("seller_time <>", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThan(Date value) {
            addCriterion("seller_time >", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_time >=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThan(Date value) {
            addCriterion("seller_time <", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThanOrEqualTo(Date value) {
            addCriterion("seller_time <=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIn(List<Date> values) {
            addCriterion("seller_time in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotIn(List<Date> values) {
            addCriterion("seller_time not in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeBetween(Date value1, Date value2) {
            addCriterion("seller_time between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotBetween(Date value1, Date value2) {
            addCriterion("seller_time not between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNull() {
            addCriterion("ship_sn is null");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNotNull() {
            addCriterion("ship_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShipSnEqualTo(String value) {
            addCriterion("ship_sn =", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotEqualTo(String value) {
            addCriterion("ship_sn <>", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThan(String value) {
            addCriterion("ship_sn >", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThanOrEqualTo(String value) {
            addCriterion("ship_sn >=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThan(String value) {
            addCriterion("ship_sn <", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThanOrEqualTo(String value) {
            addCriterion("ship_sn <=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLike(String value) {
            addCriterion("ship_sn like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotLike(String value) {
            addCriterion("ship_sn not like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnIn(List<String> values) {
            addCriterion("ship_sn in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotIn(List<String> values) {
            addCriterion("ship_sn not in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnBetween(String value1, String value2) {
            addCriterion("ship_sn between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotBetween(String value1, String value2) {
            addCriterion("ship_sn not between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Date value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Date value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Date value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Date value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Date> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Date> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Date value1, Date value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
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

        public Criteria andRefundSourceIsNull() {
            addCriterion("refund_source is null");
            return (Criteria) this;
        }

        public Criteria andRefundSourceIsNotNull() {
            addCriterion("refund_source is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSourceEqualTo(Integer value) {
            addCriterion("refund_source =", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceNotEqualTo(Integer value) {
            addCriterion("refund_source <>", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceGreaterThan(Integer value) {
            addCriterion("refund_source >", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_source >=", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceLessThan(Integer value) {
            addCriterion("refund_source <", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceLessThanOrEqualTo(Integer value) {
            addCriterion("refund_source <=", value, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceIn(List<Integer> values) {
            addCriterion("refund_source in", values, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceNotIn(List<Integer> values) {
            addCriterion("refund_source not in", values, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceBetween(Integer value1, Integer value2) {
            addCriterion("refund_source between", value1, value2, "refundSource");
            return (Criteria) this;
        }

        public Criteria andRefundSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_source not between", value1, value2, "refundSource");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelIsNull() {
            addCriterion("refund_member_cancel is null");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelIsNotNull() {
            addCriterion("refund_member_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelEqualTo(Integer value) {
            addCriterion("refund_member_cancel =", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelNotEqualTo(Integer value) {
            addCriterion("refund_member_cancel <>", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelGreaterThan(Integer value) {
            addCriterion("refund_member_cancel >", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_member_cancel >=", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelLessThan(Integer value) {
            addCriterion("refund_member_cancel <", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelLessThanOrEqualTo(Integer value) {
            addCriterion("refund_member_cancel <=", value, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelIn(List<Integer> values) {
            addCriterion("refund_member_cancel in", values, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelNotIn(List<Integer> values) {
            addCriterion("refund_member_cancel not in", values, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelBetween(Integer value1, Integer value2) {
            addCriterion("refund_member_cancel between", value1, value2, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andRefundMemberCancelNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_member_cancel not between", value1, value2, "refundMemberCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelIsNull() {
            addCriterion("return_member_auto_cancel is null");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelIsNotNull() {
            addCriterion("return_member_auto_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelEqualTo(Integer value) {
            addCriterion("return_member_auto_cancel =", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelNotEqualTo(Integer value) {
            addCriterion("return_member_auto_cancel <>", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelGreaterThan(Integer value) {
            addCriterion("return_member_auto_cancel >", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_member_auto_cancel >=", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelLessThan(Integer value) {
            addCriterion("return_member_auto_cancel <", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelLessThanOrEqualTo(Integer value) {
            addCriterion("return_member_auto_cancel <=", value, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelIn(List<Integer> values) {
            addCriterion("return_member_auto_cancel in", values, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelNotIn(List<Integer> values) {
            addCriterion("return_member_auto_cancel not in", values, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelBetween(Integer value1, Integer value2) {
            addCriterion("return_member_auto_cancel between", value1, value2, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnMemberAutoCancelNotBetween(Integer value1, Integer value2) {
            addCriterion("return_member_auto_cancel not between", value1, value2, "returnMemberAutoCancel");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveIsNull() {
            addCriterion("return_seller_auto_receive is null");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveIsNotNull() {
            addCriterion("return_seller_auto_receive is not null");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveEqualTo(Integer value) {
            addCriterion("return_seller_auto_receive =", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveNotEqualTo(Integer value) {
            addCriterion("return_seller_auto_receive <>", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveGreaterThan(Integer value) {
            addCriterion("return_seller_auto_receive >", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_seller_auto_receive >=", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveLessThan(Integer value) {
            addCriterion("return_seller_auto_receive <", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("return_seller_auto_receive <=", value, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveIn(List<Integer> values) {
            addCriterion("return_seller_auto_receive in", values, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveNotIn(List<Integer> values) {
            addCriterion("return_seller_auto_receive not in", values, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveBetween(Integer value1, Integer value2) {
            addCriterion("return_seller_auto_receive between", value1, value2, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andReturnSellerAutoReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("return_seller_auto_receive not between", value1, value2, "returnSellerAutoReceive");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeIsNull() {
            addCriterion("dw_return_type is null");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeIsNotNull() {
            addCriterion("dw_return_type is not null");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeEqualTo(Integer value) {
            addCriterion("dw_return_type =", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeNotEqualTo(Integer value) {
            addCriterion("dw_return_type <>", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeGreaterThan(Integer value) {
            addCriterion("dw_return_type >", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_return_type >=", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeLessThan(Integer value) {
            addCriterion("dw_return_type <", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dw_return_type <=", value, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeIn(List<Integer> values) {
            addCriterion("dw_return_type in", values, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeNotIn(List<Integer> values) {
            addCriterion("dw_return_type not in", values, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeBetween(Integer value1, Integer value2) {
            addCriterion("dw_return_type between", value1, value2, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andDwReturnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_return_type not between", value1, value2, "dwReturnType");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonIsNull() {
            addCriterion("seller_state_reason is null");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonIsNotNull() {
            addCriterion("seller_state_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonEqualTo(Integer value) {
            addCriterion("seller_state_reason =", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonNotEqualTo(Integer value) {
            addCriterion("seller_state_reason <>", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonGreaterThan(Integer value) {
            addCriterion("seller_state_reason >", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_state_reason >=", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonLessThan(Integer value) {
            addCriterion("seller_state_reason <", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonLessThanOrEqualTo(Integer value) {
            addCriterion("seller_state_reason <=", value, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonIn(List<Integer> values) {
            addCriterion("seller_state_reason in", values, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonNotIn(List<Integer> values) {
            addCriterion("seller_state_reason not in", values, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonBetween(Integer value1, Integer value2) {
            addCriterion("seller_state_reason between", value1, value2, "sellerStateReason");
            return (Criteria) this;
        }

        public Criteria andSellerStateReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_state_reason not between", value1, value2, "sellerStateReason");
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