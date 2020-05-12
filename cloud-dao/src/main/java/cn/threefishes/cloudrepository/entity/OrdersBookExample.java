package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersBookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
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

        public Criteria andBookCancelTimeIsNull() {
            addCriterion("book_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeIsNotNull() {
            addCriterion("book_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeEqualTo(Date value) {
            addCriterion("book_cancel_time =", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeNotEqualTo(Date value) {
            addCriterion("book_cancel_time <>", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeGreaterThan(Date value) {
            addCriterion("book_cancel_time >", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_cancel_time >=", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeLessThan(Date value) {
            addCriterion("book_cancel_time <", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("book_cancel_time <=", value, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeIn(List<Date> values) {
            addCriterion("book_cancel_time in", values, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeNotIn(List<Date> values) {
            addCriterion("book_cancel_time not in", values, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeBetween(Date value1, Date value2) {
            addCriterion("book_cancel_time between", value1, value2, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("book_cancel_time not between", value1, value2, "bookCancelTime");
            return (Criteria) this;
        }

        public Criteria andBookPhoneIsNull() {
            addCriterion("book_phone is null");
            return (Criteria) this;
        }

        public Criteria andBookPhoneIsNotNull() {
            addCriterion("book_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBookPhoneEqualTo(String value) {
            addCriterion("book_phone =", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneNotEqualTo(String value) {
            addCriterion("book_phone <>", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneGreaterThan(String value) {
            addCriterion("book_phone >", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("book_phone >=", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneLessThan(String value) {
            addCriterion("book_phone <", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneLessThanOrEqualTo(String value) {
            addCriterion("book_phone <=", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneLike(String value) {
            addCriterion("book_phone like", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneNotLike(String value) {
            addCriterion("book_phone not like", value, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneIn(List<String> values) {
            addCriterion("book_phone in", values, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneNotIn(List<String> values) {
            addCriterion("book_phone not in", values, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneBetween(String value1, String value2) {
            addCriterion("book_phone between", value1, value2, "bookPhone");
            return (Criteria) this;
        }

        public Criteria andBookPhoneNotBetween(String value1, String value2) {
            addCriterion("book_phone not between", value1, value2, "bookPhone");
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

        public Criteria andBookStepEqualTo(Integer value) {
            addCriterion("book_step =", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotEqualTo(Integer value) {
            addCriterion("book_step <>", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepGreaterThan(Integer value) {
            addCriterion("book_step >", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_step >=", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepLessThan(Integer value) {
            addCriterion("book_step <", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepLessThanOrEqualTo(Integer value) {
            addCriterion("book_step <=", value, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepIn(List<Integer> values) {
            addCriterion("book_step in", values, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotIn(List<Integer> values) {
            addCriterion("book_step not in", values, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepBetween(Integer value1, Integer value2) {
            addCriterion("book_step between", value1, value2, "bookStep");
            return (Criteria) this;
        }

        public Criteria andBookStepNotBetween(Integer value1, Integer value2) {
            addCriterion("book_step not between", value1, value2, "bookStep");
            return (Criteria) this;
        }

        public Criteria andCancelStateIsNull() {
            addCriterion("cancel_state is null");
            return (Criteria) this;
        }

        public Criteria andCancelStateIsNotNull() {
            addCriterion("cancel_state is not null");
            return (Criteria) this;
        }

        public Criteria andCancelStateEqualTo(Integer value) {
            addCriterion("cancel_state =", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotEqualTo(Integer value) {
            addCriterion("cancel_state <>", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateGreaterThan(Integer value) {
            addCriterion("cancel_state >", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_state >=", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateLessThan(Integer value) {
            addCriterion("cancel_state <", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_state <=", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateIn(List<Integer> values) {
            addCriterion("cancel_state in", values, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotIn(List<Integer> values) {
            addCriterion("cancel_state not in", values, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateBetween(Integer value1, Integer value2) {
            addCriterion("cancel_state between", value1, value2, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_state not between", value1, value2, "cancelState");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(BigDecimal value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(BigDecimal value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<BigDecimal> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
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

        public Criteria andNoticeStateIsNull() {
            addCriterion("notice_state is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIsNotNull() {
            addCriterion("notice_state is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateEqualTo(Integer value) {
            addCriterion("notice_state =", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotEqualTo(Integer value) {
            addCriterion("notice_state <>", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThan(Integer value) {
            addCriterion("notice_state >", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_state >=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThan(Integer value) {
            addCriterion("notice_state <", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThanOrEqualTo(Integer value) {
            addCriterion("notice_state <=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIn(List<Integer> values) {
            addCriterion("notice_state in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotIn(List<Integer> values) {
            addCriterion("notice_state not in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateBetween(Integer value1, Integer value2) {
            addCriterion("notice_state between", value1, value2, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_state not between", value1, value2, "noticeState");
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
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

        public Criteria andPredepositAmountIsNull() {
            addCriterion("predeposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountIsNotNull() {
            addCriterion("predeposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount =", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount <>", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountGreaterThan(BigDecimal value) {
            addCriterion("predeposit_amount >", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount >=", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountLessThan(BigDecimal value) {
            addCriterion("predeposit_amount <", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_amount <=", value, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountIn(List<BigDecimal> values) {
            addCriterion("predeposit_amount in", values, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_amount not in", values, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_amount between", value1, value2, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andPredepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_amount not between", value1, value2, "predepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNull() {
            addCriterion("real_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNotNull() {
            addCriterion("real_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount =", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <>", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThan(BigDecimal value) {
            addCriterion("real_pay_amount >", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount >=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThan(BigDecimal value) {
            addCriterion("real_pay_amount <", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount not in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount between", value1, value2, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount not between", value1, value2, "realPayAmount");
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

        public Criteria andHappyGoldAmountIsNull() {
            addCriterion("happy_gold_amount is null");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountIsNotNull() {
            addCriterion("happy_gold_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountEqualTo(BigDecimal value) {
            addCriterion("happy_gold_amount =", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountNotEqualTo(BigDecimal value) {
            addCriterion("happy_gold_amount <>", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountGreaterThan(BigDecimal value) {
            addCriterion("happy_gold_amount >", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("happy_gold_amount >=", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountLessThan(BigDecimal value) {
            addCriterion("happy_gold_amount <", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("happy_gold_amount <=", value, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountIn(List<BigDecimal> values) {
            addCriterion("happy_gold_amount in", values, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountNotIn(List<BigDecimal> values) {
            addCriterion("happy_gold_amount not in", values, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("happy_gold_amount between", value1, value2, "happyGoldAmount");
            return (Criteria) this;
        }

        public Criteria andHappyGoldAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("happy_gold_amount not between", value1, value2, "happyGoldAmount");
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