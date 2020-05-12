package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class PaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentExample() {
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextIsNull() {
            addCriterion("client_type_text is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextIsNotNull() {
            addCriterion("client_type_text is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextEqualTo(String value) {
            addCriterion("client_type_text =", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextNotEqualTo(String value) {
            addCriterion("client_type_text <>", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextGreaterThan(String value) {
            addCriterion("client_type_text >", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextGreaterThanOrEqualTo(String value) {
            addCriterion("client_type_text >=", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextLessThan(String value) {
            addCriterion("client_type_text <", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextLessThanOrEqualTo(String value) {
            addCriterion("client_type_text <=", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextLike(String value) {
            addCriterion("client_type_text like", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextNotLike(String value) {
            addCriterion("client_type_text not like", value, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextIn(List<String> values) {
            addCriterion("client_type_text in", values, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextNotIn(List<String> values) {
            addCriterion("client_type_text not in", values, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextBetween(String value1, String value2) {
            addCriterion("client_type_text between", value1, value2, "clientTypeText");
            return (Criteria) this;
        }

        public Criteria andClientTypeTextNotBetween(String value1, String value2) {
            addCriterion("client_type_text not between", value1, value2, "clientTypeText");
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

        public Criteria andPaymentInfoIsNull() {
            addCriterion("payment_info is null");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoIsNotNull() {
            addCriterion("payment_info is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoEqualTo(String value) {
            addCriterion("payment_info =", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoNotEqualTo(String value) {
            addCriterion("payment_info <>", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoGreaterThan(String value) {
            addCriterion("payment_info >", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_info >=", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoLessThan(String value) {
            addCriterion("payment_info <", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoLessThanOrEqualTo(String value) {
            addCriterion("payment_info <=", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoLike(String value) {
            addCriterion("payment_info like", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoNotLike(String value) {
            addCriterion("payment_info not like", value, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoIn(List<String> values) {
            addCriterion("payment_info in", values, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoNotIn(List<String> values) {
            addCriterion("payment_info not in", values, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoBetween(String value1, String value2) {
            addCriterion("payment_info between", value1, value2, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentInfoNotBetween(String value1, String value2) {
            addCriterion("payment_info not between", value1, value2, "paymentInfo");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNull() {
            addCriterion("payment_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNotNull() {
            addCriterion("payment_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameEqualTo(String value) {
            addCriterion("payment_name =", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotEqualTo(String value) {
            addCriterion("payment_name <>", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThan(String value) {
            addCriterion("payment_name >", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_name >=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThan(String value) {
            addCriterion("payment_name <", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThanOrEqualTo(String value) {
            addCriterion("payment_name <=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLike(String value) {
            addCriterion("payment_name like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotLike(String value) {
            addCriterion("payment_name not like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIn(List<String> values) {
            addCriterion("payment_name in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotIn(List<String> values) {
            addCriterion("payment_name not in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameBetween(String value1, String value2) {
            addCriterion("payment_name between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotBetween(String value1, String value2) {
            addCriterion("payment_name not between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("payment_state is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("payment_state is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Integer value) {
            addCriterion("payment_state =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Integer value) {
            addCriterion("payment_state <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Integer value) {
            addCriterion("payment_state >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_state >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Integer value) {
            addCriterion("payment_state <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("payment_state <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Integer> values) {
            addCriterion("payment_state in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Integer> values) {
            addCriterion("payment_state not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Integer value1, Integer value2) {
            addCriterion("payment_state between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_state not between", value1, value2, "paymentState");
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