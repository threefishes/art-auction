package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        public Criteria andBillAmountIsNull() {
            addCriterion("bill_amount is null");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNotNull() {
            addCriterion("bill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBillAmountEqualTo(BigDecimal value) {
            addCriterion("bill_amount =", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotEqualTo(BigDecimal value) {
            addCriterion("bill_amount <>", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThan(BigDecimal value) {
            addCriterion("bill_amount >", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount >=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThan(BigDecimal value) {
            addCriterion("bill_amount <", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount <=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountIn(List<BigDecimal> values) {
            addCriterion("bill_amount in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotIn(List<BigDecimal> values) {
            addCriterion("bill_amount not in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount not between", value1, value2, "billAmount");
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

        public Criteria andBookAmountIsNull() {
            addCriterion("book_amount is null");
            return (Criteria) this;
        }

        public Criteria andBookAmountIsNotNull() {
            addCriterion("book_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBookAmountEqualTo(BigDecimal value) {
            addCriterion("book_amount =", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotEqualTo(BigDecimal value) {
            addCriterion("book_amount <>", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountGreaterThan(BigDecimal value) {
            addCriterion("book_amount >", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_amount >=", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountLessThan(BigDecimal value) {
            addCriterion("book_amount <", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_amount <=", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountIn(List<BigDecimal> values) {
            addCriterion("book_amount in", values, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotIn(List<BigDecimal> values) {
            addCriterion("book_amount not in", values, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_amount between", value1, value2, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_amount not between", value1, value2, "bookAmount");
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

        public Criteria andCoteAmountIsNull() {
            addCriterion("cote_amount is null");
            return (Criteria) this;
        }

        public Criteria andCoteAmountIsNotNull() {
            addCriterion("cote_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCoteAmountEqualTo(BigDecimal value) {
            addCriterion("cote_amount =", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountNotEqualTo(BigDecimal value) {
            addCriterion("cote_amount <>", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountGreaterThan(BigDecimal value) {
            addCriterion("cote_amount >", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cote_amount >=", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountLessThan(BigDecimal value) {
            addCriterion("cote_amount <", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cote_amount <=", value, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountIn(List<BigDecimal> values) {
            addCriterion("cote_amount in", values, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountNotIn(List<BigDecimal> values) {
            addCriterion("cote_amount not in", values, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cote_amount between", value1, value2, "coteAmount");
            return (Criteria) this;
        }

        public Criteria andCoteAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cote_amount not between", value1, value2, "coteAmount");
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

        public Criteria andDistributionAmountIsNull() {
            addCriterion("distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNotNull() {
            addCriterion("distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountEqualTo(BigDecimal value) {
            addCriterion("distribution_amount =", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotEqualTo(BigDecimal value) {
            addCriterion("distribution_amount <>", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThan(BigDecimal value) {
            addCriterion("distribution_amount >", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_amount >=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThan(BigDecimal value) {
            addCriterion("distribution_amount <", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_amount <=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIn(List<BigDecimal> values) {
            addCriterion("distribution_amount in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotIn(List<BigDecimal> values) {
            addCriterion("distribution_amount not in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_amount between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_amount not between", value1, value2, "distributionAmount");
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

        public Criteria andFreightAmountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(BigDecimal value) {
            addCriterion("freight_amount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("freight_amount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("freight_amount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(BigDecimal value) {
            addCriterion("freight_amount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<BigDecimal> values) {
            addCriterion("freight_amount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("freight_amount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount not between", value1, value2, "freightAmount");
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

        public Criteria andRefundCommissionAmountIsNull() {
            addCriterion("refund_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountIsNotNull() {
            addCriterion("refund_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("refund_commission_amount =", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_commission_amount <>", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_commission_amount >", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_commission_amount >=", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountLessThan(BigDecimal value) {
            addCriterion("refund_commission_amount <", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_commission_amount <=", value, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("refund_commission_amount in", values, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_commission_amount not in", values, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_commission_amount between", value1, value2, "refundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_commission_amount not between", value1, value2, "refundCommissionAmount");
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

        public Criteria andAllDistributionAmountIsNull() {
            addCriterion("all_distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountIsNotNull() {
            addCriterion("all_distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountEqualTo(BigDecimal value) {
            addCriterion("all_distribution_amount =", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_distribution_amount <>", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountGreaterThan(BigDecimal value) {
            addCriterion("all_distribution_amount >", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_distribution_amount >=", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountLessThan(BigDecimal value) {
            addCriterion("all_distribution_amount <", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_distribution_amount <=", value, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountIn(List<BigDecimal> values) {
            addCriterion("all_distribution_amount in", values, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_distribution_amount not in", values, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_distribution_amount between", value1, value2, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andAllDistributionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_distribution_amount not between", value1, value2, "allDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountIsNull() {
            addCriterion("refund_distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountIsNotNull() {
            addCriterion("refund_distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountEqualTo(BigDecimal value) {
            addCriterion("refund_distribution_amount =", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_distribution_amount <>", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_distribution_amount >", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_distribution_amount >=", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountLessThan(BigDecimal value) {
            addCriterion("refund_distribution_amount <", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_distribution_amount <=", value, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountIn(List<BigDecimal> values) {
            addCriterion("refund_distribution_amount in", values, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_distribution_amount not in", values, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_distribution_amount between", value1, value2, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andRefundDistributionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_distribution_amount not between", value1, value2, "refundDistributionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountIsNull() {
            addCriterion("store_up_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountIsNotNull() {
            addCriterion("store_up_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_amount =", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_amount <>", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_amount >", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_amount >=", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountLessThan(BigDecimal value) {
            addCriterion("store_up_amount <", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_amount <=", value, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_amount in", values, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_amount not in", values, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_amount between", value1, value2, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_amount not between", value1, value2, "storeUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountIsNull() {
            addCriterion("all_store_up_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountIsNotNull() {
            addCriterion("all_store_up_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountEqualTo(BigDecimal value) {
            addCriterion("all_store_up_amount =", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_store_up_amount <>", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountGreaterThan(BigDecimal value) {
            addCriterion("all_store_up_amount >", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_store_up_amount >=", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountLessThan(BigDecimal value) {
            addCriterion("all_store_up_amount <", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_store_up_amount <=", value, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountIn(List<BigDecimal> values) {
            addCriterion("all_store_up_amount in", values, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_store_up_amount not in", values, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_store_up_amount between", value1, value2, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andAllStoreUpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_store_up_amount not between", value1, value2, "allStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountIsNull() {
            addCriterion("refund_store_up_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountIsNotNull() {
            addCriterion("refund_store_up_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountEqualTo(BigDecimal value) {
            addCriterion("refund_store_up_amount =", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_store_up_amount <>", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_store_up_amount >", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_store_up_amount >=", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountLessThan(BigDecimal value) {
            addCriterion("refund_store_up_amount <", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_store_up_amount <=", value, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountIn(List<BigDecimal> values) {
            addCriterion("refund_store_up_amount in", values, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_store_up_amount not in", values, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_store_up_amount between", value1, value2, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStoreUpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_store_up_amount not between", value1, value2, "refundStoreUpAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountIsNull() {
            addCriterion("store_up_orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountIsNotNull() {
            addCriterion("store_up_orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_orders_amount =", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_orders_amount <>", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_orders_amount >", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_orders_amount >=", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountLessThan(BigDecimal value) {
            addCriterion("store_up_orders_amount <", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_orders_amount <=", value, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_orders_amount in", values, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_orders_amount not in", values, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_orders_amount between", value1, value2, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpOrdersAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_orders_amount not between", value1, value2, "storeUpOrdersAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountIsNull() {
            addCriterion("store_up_freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountIsNotNull() {
            addCriterion("store_up_freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_freight_amount =", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_freight_amount <>", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_freight_amount >", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_freight_amount >=", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountLessThan(BigDecimal value) {
            addCriterion("store_up_freight_amount <", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_freight_amount <=", value, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_freight_amount in", values, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_freight_amount not in", values, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_freight_amount between", value1, value2, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_freight_amount not between", value1, value2, "storeUpFreightAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountIsNull() {
            addCriterion("store_up_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountIsNotNull() {
            addCriterion("store_up_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_commission_amount =", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_commission_amount <>", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_commission_amount >", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_commission_amount >=", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountLessThan(BigDecimal value) {
            addCriterion("store_up_commission_amount <", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_commission_amount <=", value, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_commission_amount in", values, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_commission_amount not in", values, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_commission_amount between", value1, value2, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_commission_amount not between", value1, value2, "storeUpCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountIsNull() {
            addCriterion("store_up_coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountIsNotNull() {
            addCriterion("store_up_coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_coupon_amount =", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_coupon_amount <>", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_coupon_amount >", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_coupon_amount >=", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountLessThan(BigDecimal value) {
            addCriterion("store_up_coupon_amount <", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_coupon_amount <=", value, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_coupon_amount in", values, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_coupon_amount not in", values, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_coupon_amount between", value1, value2, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_coupon_amount not between", value1, value2, "storeUpCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountIsNull() {
            addCriterion("store_up_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountIsNotNull() {
            addCriterion("store_up_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_amount =", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_amount <>", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_refund_amount >", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_amount >=", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountLessThan(BigDecimal value) {
            addCriterion("store_up_refund_amount <", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_amount <=", value, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_amount in", values, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_amount not in", values, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_amount between", value1, value2, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_amount not between", value1, value2, "storeUpRefundAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountIsNull() {
            addCriterion("store_up_refund_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountIsNotNull() {
            addCriterion("store_up_refund_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount =", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount <>", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount >", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount >=", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountLessThan(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount <", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_commission_amount <=", value, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_commission_amount in", values, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_commission_amount not in", values, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_commission_amount between", value1, value2, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_commission_amount not between", value1, value2, "storeUpRefundCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountIsNull() {
            addCriterion("store_up_refund_coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountIsNotNull() {
            addCriterion("store_up_refund_coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount =", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount <>", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount >", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount >=", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountLessThan(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount <", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_refund_coupon_amount <=", value, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_coupon_amount in", values, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_refund_coupon_amount not in", values, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_coupon_amount between", value1, value2, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpRefundCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_refund_coupon_amount not between", value1, value2, "storeUpRefundCouponAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountIsNull() {
            addCriterion("store_up_bill_amount is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountIsNotNull() {
            addCriterion("store_up_bill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountEqualTo(BigDecimal value) {
            addCriterion("store_up_bill_amount =", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountNotEqualTo(BigDecimal value) {
            addCriterion("store_up_bill_amount <>", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountGreaterThan(BigDecimal value) {
            addCriterion("store_up_bill_amount >", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_bill_amount >=", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountLessThan(BigDecimal value) {
            addCriterion("store_up_bill_amount <", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_up_bill_amount <=", value, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountIn(List<BigDecimal> values) {
            addCriterion("store_up_bill_amount in", values, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountNotIn(List<BigDecimal> values) {
            addCriterion("store_up_bill_amount not in", values, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_bill_amount between", value1, value2, "storeUpBillAmount");
            return (Criteria) this;
        }

        public Criteria andStoreUpBillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_up_bill_amount not between", value1, value2, "storeUpBillAmount");
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