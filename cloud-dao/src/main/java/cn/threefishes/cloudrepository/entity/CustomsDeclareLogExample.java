package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomsDeclareLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomsDeclareLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andIsSplitIsNull() {
            addCriterion("is_split is null");
            return (Criteria) this;
        }

        public Criteria andIsSplitIsNotNull() {
            addCriterion("is_split is not null");
            return (Criteria) this;
        }

        public Criteria andIsSplitEqualTo(Integer value) {
            addCriterion("is_split =", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotEqualTo(Integer value) {
            addCriterion("is_split <>", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThan(Integer value) {
            addCriterion("is_split >", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_split >=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThan(Integer value) {
            addCriterion("is_split <", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThanOrEqualTo(Integer value) {
            addCriterion("is_split <=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitIn(List<Integer> values) {
            addCriterion("is_split in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotIn(List<Integer> values) {
            addCriterion("is_split not in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitBetween(Integer value1, Integer value2) {
            addCriterion("is_split between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotBetween(Integer value1, Integer value2) {
            addCriterion("is_split not between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andPlateFormIsNull() {
            addCriterion("plate_form is null");
            return (Criteria) this;
        }

        public Criteria andPlateFormIsNotNull() {
            addCriterion("plate_form is not null");
            return (Criteria) this;
        }

        public Criteria andPlateFormEqualTo(String value) {
            addCriterion("plate_form =", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormNotEqualTo(String value) {
            addCriterion("plate_form <>", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormGreaterThan(String value) {
            addCriterion("plate_form >", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormGreaterThanOrEqualTo(String value) {
            addCriterion("plate_form >=", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormLessThan(String value) {
            addCriterion("plate_form <", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormLessThanOrEqualTo(String value) {
            addCriterion("plate_form <=", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormLike(String value) {
            addCriterion("plate_form like", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormNotLike(String value) {
            addCriterion("plate_form not like", value, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormIn(List<String> values) {
            addCriterion("plate_form in", values, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormNotIn(List<String> values) {
            addCriterion("plate_form not in", values, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormBetween(String value1, String value2) {
            addCriterion("plate_form between", value1, value2, "plateForm");
            return (Criteria) this;
        }

        public Criteria andPlateFormNotBetween(String value1, String value2) {
            addCriterion("plate_form not between", value1, value2, "plateForm");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceIsNull() {
            addCriterion("customs_place is null");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceIsNotNull() {
            addCriterion("customs_place is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceEqualTo(String value) {
            addCriterion("customs_place =", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceNotEqualTo(String value) {
            addCriterion("customs_place <>", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceGreaterThan(String value) {
            addCriterion("customs_place >", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("customs_place >=", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceLessThan(String value) {
            addCriterion("customs_place <", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceLessThanOrEqualTo(String value) {
            addCriterion("customs_place <=", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceLike(String value) {
            addCriterion("customs_place like", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceNotLike(String value) {
            addCriterion("customs_place not like", value, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceIn(List<String> values) {
            addCriterion("customs_place in", values, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceNotIn(List<String> values) {
            addCriterion("customs_place not in", values, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceBetween(String value1, String value2) {
            addCriterion("customs_place between", value1, value2, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andCustomsPlaceNotBetween(String value1, String value2) {
            addCriterion("customs_place not between", value1, value2, "customsPlace");
            return (Criteria) this;
        }

        public Criteria andRequestStatusIsNull() {
            addCriterion("request_status is null");
            return (Criteria) this;
        }

        public Criteria andRequestStatusIsNotNull() {
            addCriterion("request_status is not null");
            return (Criteria) this;
        }

        public Criteria andRequestStatusEqualTo(Integer value) {
            addCriterion("request_status =", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusNotEqualTo(Integer value) {
            addCriterion("request_status <>", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusGreaterThan(Integer value) {
            addCriterion("request_status >", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_status >=", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusLessThan(Integer value) {
            addCriterion("request_status <", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusLessThanOrEqualTo(Integer value) {
            addCriterion("request_status <=", value, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusIn(List<Integer> values) {
            addCriterion("request_status in", values, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusNotIn(List<Integer> values) {
            addCriterion("request_status not in", values, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusBetween(Integer value1, Integer value2) {
            addCriterion("request_status between", value1, value2, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andRequestStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("request_status not between", value1, value2, "requestStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNull() {
            addCriterion("result_status is null");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNotNull() {
            addCriterion("result_status is not null");
            return (Criteria) this;
        }

        public Criteria andResultStatusEqualTo(Integer value) {
            addCriterion("result_status =", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotEqualTo(Integer value) {
            addCriterion("result_status <>", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThan(Integer value) {
            addCriterion("result_status >", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_status >=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThan(Integer value) {
            addCriterion("result_status <", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThanOrEqualTo(Integer value) {
            addCriterion("result_status <=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusIn(List<Integer> values) {
            addCriterion("result_status in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotIn(List<Integer> values) {
            addCriterion("result_status not in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusBetween(Integer value1, Integer value2) {
            addCriterion("result_status between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("result_status not between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusIsNull() {
            addCriterion("customs_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusIsNotNull() {
            addCriterion("customs_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusEqualTo(Integer value) {
            addCriterion("customs_status =", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusNotEqualTo(Integer value) {
            addCriterion("customs_status <>", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusGreaterThan(Integer value) {
            addCriterion("customs_status >", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customs_status >=", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusLessThan(Integer value) {
            addCriterion("customs_status <", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customs_status <=", value, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusIn(List<Integer> values) {
            addCriterion("customs_status in", values, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusNotIn(List<Integer> values) {
            addCriterion("customs_status not in", values, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusBetween(Integer value1, Integer value2) {
            addCriterion("customs_status between", value1, value2, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customs_status not between", value1, value2, "customsStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushIsNull() {
            addCriterion("associated_push is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushIsNotNull() {
            addCriterion("associated_push is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushEqualTo(Integer value) {
            addCriterion("associated_push =", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushNotEqualTo(Integer value) {
            addCriterion("associated_push <>", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushGreaterThan(Integer value) {
            addCriterion("associated_push >", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushGreaterThanOrEqualTo(Integer value) {
            addCriterion("associated_push >=", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushLessThan(Integer value) {
            addCriterion("associated_push <", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushLessThanOrEqualTo(Integer value) {
            addCriterion("associated_push <=", value, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushIn(List<Integer> values) {
            addCriterion("associated_push in", values, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushNotIn(List<Integer> values) {
            addCriterion("associated_push not in", values, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushBetween(Integer value1, Integer value2) {
            addCriterion("associated_push between", value1, value2, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushNotBetween(Integer value1, Integer value2) {
            addCriterion("associated_push not between", value1, value2, "associatedPush");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceIsNull() {
            addCriterion("associate_customs_place is null");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceIsNotNull() {
            addCriterion("associate_customs_place is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceEqualTo(String value) {
            addCriterion("associate_customs_place =", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceNotEqualTo(String value) {
            addCriterion("associate_customs_place <>", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceGreaterThan(String value) {
            addCriterion("associate_customs_place >", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("associate_customs_place >=", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceLessThan(String value) {
            addCriterion("associate_customs_place <", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceLessThanOrEqualTo(String value) {
            addCriterion("associate_customs_place <=", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceLike(String value) {
            addCriterion("associate_customs_place like", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceNotLike(String value) {
            addCriterion("associate_customs_place not like", value, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceIn(List<String> values) {
            addCriterion("associate_customs_place in", values, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceNotIn(List<String> values) {
            addCriterion("associate_customs_place not in", values, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceBetween(String value1, String value2) {
            addCriterion("associate_customs_place between", value1, value2, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsPlaceNotBetween(String value1, String value2) {
            addCriterion("associate_customs_place not between", value1, value2, "associateCustomsPlace");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusIsNull() {
            addCriterion("associate_request_Status is null");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusIsNotNull() {
            addCriterion("associate_request_Status is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusEqualTo(Integer value) {
            addCriterion("associate_request_Status =", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusNotEqualTo(Integer value) {
            addCriterion("associate_request_Status <>", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusGreaterThan(Integer value) {
            addCriterion("associate_request_Status >", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("associate_request_Status >=", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusLessThan(Integer value) {
            addCriterion("associate_request_Status <", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusLessThanOrEqualTo(Integer value) {
            addCriterion("associate_request_Status <=", value, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusIn(List<Integer> values) {
            addCriterion("associate_request_Status in", values, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusNotIn(List<Integer> values) {
            addCriterion("associate_request_Status not in", values, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusBetween(Integer value1, Integer value2) {
            addCriterion("associate_request_Status between", value1, value2, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateRequestStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("associate_request_Status not between", value1, value2, "associateRequestStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusIsNull() {
            addCriterion("associate_result_Status is null");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusIsNotNull() {
            addCriterion("associate_result_Status is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusEqualTo(Integer value) {
            addCriterion("associate_result_Status =", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusNotEqualTo(Integer value) {
            addCriterion("associate_result_Status <>", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusGreaterThan(Integer value) {
            addCriterion("associate_result_Status >", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("associate_result_Status >=", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusLessThan(Integer value) {
            addCriterion("associate_result_Status <", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusLessThanOrEqualTo(Integer value) {
            addCriterion("associate_result_Status <=", value, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusIn(List<Integer> values) {
            addCriterion("associate_result_Status in", values, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusNotIn(List<Integer> values) {
            addCriterion("associate_result_Status not in", values, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusBetween(Integer value1, Integer value2) {
            addCriterion("associate_result_Status between", value1, value2, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateResultStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("associate_result_Status not between", value1, value2, "associateResultStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusIsNull() {
            addCriterion("associate_customs_status is null");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusIsNotNull() {
            addCriterion("associate_customs_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusEqualTo(Integer value) {
            addCriterion("associate_customs_status =", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusNotEqualTo(Integer value) {
            addCriterion("associate_customs_status <>", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusGreaterThan(Integer value) {
            addCriterion("associate_customs_status >", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("associate_customs_status >=", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusLessThan(Integer value) {
            addCriterion("associate_customs_status <", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("associate_customs_status <=", value, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusIn(List<Integer> values) {
            addCriterion("associate_customs_status in", values, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusNotIn(List<Integer> values) {
            addCriterion("associate_customs_status not in", values, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusBetween(Integer value1, Integer value2) {
            addCriterion("associate_customs_status between", value1, value2, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociateCustomsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("associate_customs_status not between", value1, value2, "associateCustomsStatus");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkIsNull() {
            addCriterion("associated_push_remark is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkIsNotNull() {
            addCriterion("associated_push_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkEqualTo(String value) {
            addCriterion("associated_push_remark =", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkNotEqualTo(String value) {
            addCriterion("associated_push_remark <>", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkGreaterThan(String value) {
            addCriterion("associated_push_remark >", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("associated_push_remark >=", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkLessThan(String value) {
            addCriterion("associated_push_remark <", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkLessThanOrEqualTo(String value) {
            addCriterion("associated_push_remark <=", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkLike(String value) {
            addCriterion("associated_push_remark like", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkNotLike(String value) {
            addCriterion("associated_push_remark not like", value, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkIn(List<String> values) {
            addCriterion("associated_push_remark in", values, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkNotIn(List<String> values) {
            addCriterion("associated_push_remark not in", values, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkBetween(String value1, String value2) {
            addCriterion("associated_push_remark between", value1, value2, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushRemarkNotBetween(String value1, String value2) {
            addCriterion("associated_push_remark not between", value1, value2, "associatedPushRemark");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeIsNull() {
            addCriterion("associated_push_time is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeIsNotNull() {
            addCriterion("associated_push_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeEqualTo(Date value) {
            addCriterion("associated_push_time =", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeNotEqualTo(Date value) {
            addCriterion("associated_push_time <>", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeGreaterThan(Date value) {
            addCriterion("associated_push_time >", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("associated_push_time >=", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeLessThan(Date value) {
            addCriterion("associated_push_time <", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("associated_push_time <=", value, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeIn(List<Date> values) {
            addCriterion("associated_push_time in", values, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeNotIn(List<Date> values) {
            addCriterion("associated_push_time not in", values, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeBetween(Date value1, Date value2) {
            addCriterion("associated_push_time between", value1, value2, "associatedPushTime");
            return (Criteria) this;
        }

        public Criteria andAssociatedPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("associated_push_time not between", value1, value2, "associatedPushTime");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andVerDeptIsNull() {
            addCriterion("ver_dept is null");
            return (Criteria) this;
        }

        public Criteria andVerDeptIsNotNull() {
            addCriterion("ver_dept is not null");
            return (Criteria) this;
        }

        public Criteria andVerDeptEqualTo(String value) {
            addCriterion("ver_dept =", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptNotEqualTo(String value) {
            addCriterion("ver_dept <>", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptGreaterThan(String value) {
            addCriterion("ver_dept >", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptGreaterThanOrEqualTo(String value) {
            addCriterion("ver_dept >=", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptLessThan(String value) {
            addCriterion("ver_dept <", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptLessThanOrEqualTo(String value) {
            addCriterion("ver_dept <=", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptLike(String value) {
            addCriterion("ver_dept like", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptNotLike(String value) {
            addCriterion("ver_dept not like", value, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptIn(List<String> values) {
            addCriterion("ver_dept in", values, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptNotIn(List<String> values) {
            addCriterion("ver_dept not in", values, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptBetween(String value1, String value2) {
            addCriterion("ver_dept between", value1, value2, "verDept");
            return (Criteria) this;
        }

        public Criteria andVerDeptNotBetween(String value1, String value2) {
            addCriterion("ver_dept not between", value1, value2, "verDept");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIsNull() {
            addCriterion("pay_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIsNotNull() {
            addCriterion("pay_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdEqualTo(String value) {
            addCriterion("pay_transaction_id =", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotEqualTo(String value) {
            addCriterion("pay_transaction_id <>", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdGreaterThan(String value) {
            addCriterion("pay_transaction_id >", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_transaction_id >=", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLessThan(String value) {
            addCriterion("pay_transaction_id <", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("pay_transaction_id <=", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLike(String value) {
            addCriterion("pay_transaction_id like", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotLike(String value) {
            addCriterion("pay_transaction_id not like", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIn(List<String> values) {
            addCriterion("pay_transaction_id in", values, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotIn(List<String> values) {
            addCriterion("pay_transaction_id not in", values, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdBetween(String value1, String value2) {
            addCriterion("pay_transaction_id between", value1, value2, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotBetween(String value1, String value2) {
            addCriterion("pay_transaction_id not between", value1, value2, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoIsNull() {
            addCriterion("customs_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoIsNotNull() {
            addCriterion("customs_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoEqualTo(String value) {
            addCriterion("customs_trade_no =", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoNotEqualTo(String value) {
            addCriterion("customs_trade_no <>", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoGreaterThan(String value) {
            addCriterion("customs_trade_no >", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("customs_trade_no >=", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoLessThan(String value) {
            addCriterion("customs_trade_no <", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoLessThanOrEqualTo(String value) {
            addCriterion("customs_trade_no <=", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoLike(String value) {
            addCriterion("customs_trade_no like", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoNotLike(String value) {
            addCriterion("customs_trade_no not like", value, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoIn(List<String> values) {
            addCriterion("customs_trade_no in", values, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoNotIn(List<String> values) {
            addCriterion("customs_trade_no not in", values, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoBetween(String value1, String value2) {
            addCriterion("customs_trade_no between", value1, value2, "customsTradeNo");
            return (Criteria) this;
        }

        public Criteria andCustomsTradeNoNotBetween(String value1, String value2) {
            addCriterion("customs_trade_no not between", value1, value2, "customsTradeNo");
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