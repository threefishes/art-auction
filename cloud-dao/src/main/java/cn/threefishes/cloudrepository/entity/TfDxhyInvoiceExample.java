package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfDxhyInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfDxhyInvoiceExample() {
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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

        public Criteria andInvoiceJsonIsNull() {
            addCriterion("invoice_json is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonIsNotNull() {
            addCriterion("invoice_json is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonEqualTo(String value) {
            addCriterion("invoice_json =", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonNotEqualTo(String value) {
            addCriterion("invoice_json <>", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonGreaterThan(String value) {
            addCriterion("invoice_json >", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_json >=", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonLessThan(String value) {
            addCriterion("invoice_json <", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonLessThanOrEqualTo(String value) {
            addCriterion("invoice_json <=", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonLike(String value) {
            addCriterion("invoice_json like", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonNotLike(String value) {
            addCriterion("invoice_json not like", value, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonIn(List<String> values) {
            addCriterion("invoice_json in", values, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonNotIn(List<String> values) {
            addCriterion("invoice_json not in", values, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonBetween(String value1, String value2) {
            addCriterion("invoice_json between", value1, value2, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceJsonNotBetween(String value1, String value2) {
            addCriterion("invoice_json not between", value1, value2, "invoiceJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonIsNull() {
            addCriterion("invoice_return_json is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonIsNotNull() {
            addCriterion("invoice_return_json is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonEqualTo(String value) {
            addCriterion("invoice_return_json =", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonNotEqualTo(String value) {
            addCriterion("invoice_return_json <>", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonGreaterThan(String value) {
            addCriterion("invoice_return_json >", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_return_json >=", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonLessThan(String value) {
            addCriterion("invoice_return_json <", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonLessThanOrEqualTo(String value) {
            addCriterion("invoice_return_json <=", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonLike(String value) {
            addCriterion("invoice_return_json like", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonNotLike(String value) {
            addCriterion("invoice_return_json not like", value, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonIn(List<String> values) {
            addCriterion("invoice_return_json in", values, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonNotIn(List<String> values) {
            addCriterion("invoice_return_json not in", values, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonBetween(String value1, String value2) {
            addCriterion("invoice_return_json between", value1, value2, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceReturnJsonNotBetween(String value1, String value2) {
            addCriterion("invoice_return_json not between", value1, value2, "invoiceReturnJson");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNull() {
            addCriterion("invoice_time is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNotNull() {
            addCriterion("invoice_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeEqualTo(Date value) {
            addCriterion("invoice_time =", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotEqualTo(Date value) {
            addCriterion("invoice_time <>", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThan(Date value) {
            addCriterion("invoice_time >", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_time >=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThan(Date value) {
            addCriterion("invoice_time <", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("invoice_time <=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIn(List<Date> values) {
            addCriterion("invoice_time in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotIn(List<Date> values) {
            addCriterion("invoice_time not in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeBetween(Date value1, Date value2) {
            addCriterion("invoice_time between", value1, value2, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("invoice_time not between", value1, value2, "invoiceTime");
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

        public Criteria andRefundIdEqualTo(String value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(String value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(String value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(String value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(String value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLike(String value) {
            addCriterion("refund_id like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotLike(String value) {
            addCriterion("refund_id not like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<String> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<String> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(String value1, String value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(String value1, String value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andPushJsonIsNull() {
            addCriterion("push_json is null");
            return (Criteria) this;
        }

        public Criteria andPushJsonIsNotNull() {
            addCriterion("push_json is not null");
            return (Criteria) this;
        }

        public Criteria andPushJsonEqualTo(String value) {
            addCriterion("push_json =", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotEqualTo(String value) {
            addCriterion("push_json <>", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonGreaterThan(String value) {
            addCriterion("push_json >", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonGreaterThanOrEqualTo(String value) {
            addCriterion("push_json >=", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLessThan(String value) {
            addCriterion("push_json <", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLessThanOrEqualTo(String value) {
            addCriterion("push_json <=", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLike(String value) {
            addCriterion("push_json like", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotLike(String value) {
            addCriterion("push_json not like", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonIn(List<String> values) {
            addCriterion("push_json in", values, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotIn(List<String> values) {
            addCriterion("push_json not in", values, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonBetween(String value1, String value2) {
            addCriterion("push_json between", value1, value2, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotBetween(String value1, String value2) {
            addCriterion("push_json not between", value1, value2, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusIsNull() {
            addCriterion("push_response_status is null");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusIsNotNull() {
            addCriterion("push_response_status is not null");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusEqualTo(String value) {
            addCriterion("push_response_status =", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusNotEqualTo(String value) {
            addCriterion("push_response_status <>", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusGreaterThan(String value) {
            addCriterion("push_response_status >", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("push_response_status >=", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusLessThan(String value) {
            addCriterion("push_response_status <", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusLessThanOrEqualTo(String value) {
            addCriterion("push_response_status <=", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusLike(String value) {
            addCriterion("push_response_status like", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusNotLike(String value) {
            addCriterion("push_response_status not like", value, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusIn(List<String> values) {
            addCriterion("push_response_status in", values, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusNotIn(List<String> values) {
            addCriterion("push_response_status not in", values, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusBetween(String value1, String value2) {
            addCriterion("push_response_status between", value1, value2, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andPushResponseStatusNotBetween(String value1, String value2) {
            addCriterion("push_response_status not between", value1, value2, "pushResponseStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeIsNull() {
            addCriterion("invoice_push_time is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeIsNotNull() {
            addCriterion("invoice_push_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeEqualTo(Date value) {
            addCriterion("invoice_push_time =", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeNotEqualTo(Date value) {
            addCriterion("invoice_push_time <>", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeGreaterThan(Date value) {
            addCriterion("invoice_push_time >", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_push_time >=", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeLessThan(Date value) {
            addCriterion("invoice_push_time <", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeLessThanOrEqualTo(Date value) {
            addCriterion("invoice_push_time <=", value, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeIn(List<Date> values) {
            addCriterion("invoice_push_time in", values, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeNotIn(List<Date> values) {
            addCriterion("invoice_push_time not in", values, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeBetween(Date value1, Date value2) {
            addCriterion("invoice_push_time between", value1, value2, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePushTimeNotBetween(Date value1, Date value2) {
            addCriterion("invoice_push_time not between", value1, value2, "invoicePushTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfIsNull() {
            addCriterion("invoice_pdf is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfIsNotNull() {
            addCriterion("invoice_pdf is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfEqualTo(String value) {
            addCriterion("invoice_pdf =", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfNotEqualTo(String value) {
            addCriterion("invoice_pdf <>", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfGreaterThan(String value) {
            addCriterion("invoice_pdf >", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_pdf >=", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfLessThan(String value) {
            addCriterion("invoice_pdf <", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfLessThanOrEqualTo(String value) {
            addCriterion("invoice_pdf <=", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfLike(String value) {
            addCriterion("invoice_pdf like", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfNotLike(String value) {
            addCriterion("invoice_pdf not like", value, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfIn(List<String> values) {
            addCriterion("invoice_pdf in", values, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfNotIn(List<String> values) {
            addCriterion("invoice_pdf not in", values, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfBetween(String value1, String value2) {
            addCriterion("invoice_pdf between", value1, value2, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andInvoicePdfNotBetween(String value1, String value2) {
            addCriterion("invoice_pdf not between", value1, value2, "invoicePdf");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Integer value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Integer value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Integer value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Integer value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Integer> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Integer> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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