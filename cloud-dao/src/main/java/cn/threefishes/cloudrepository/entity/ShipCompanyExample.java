package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ShipCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipCompanyExample() {
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

        public Criteria andShipCodeIsNull() {
            addCriterion("ship_code is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("ship_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("ship_code =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("ship_code <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("ship_code >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_code >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("ship_code <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("ship_code <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("ship_code like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("ship_code not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("ship_code in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("ship_code not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("ship_code between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("ship_code not between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipLetterIsNull() {
            addCriterion("ship_letter is null");
            return (Criteria) this;
        }

        public Criteria andShipLetterIsNotNull() {
            addCriterion("ship_letter is not null");
            return (Criteria) this;
        }

        public Criteria andShipLetterEqualTo(String value) {
            addCriterion("ship_letter =", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterNotEqualTo(String value) {
            addCriterion("ship_letter <>", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterGreaterThan(String value) {
            addCriterion("ship_letter >", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterGreaterThanOrEqualTo(String value) {
            addCriterion("ship_letter >=", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterLessThan(String value) {
            addCriterion("ship_letter <", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterLessThanOrEqualTo(String value) {
            addCriterion("ship_letter <=", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterLike(String value) {
            addCriterion("ship_letter like", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterNotLike(String value) {
            addCriterion("ship_letter not like", value, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterIn(List<String> values) {
            addCriterion("ship_letter in", values, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterNotIn(List<String> values) {
            addCriterion("ship_letter not in", values, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterBetween(String value1, String value2) {
            addCriterion("ship_letter between", value1, value2, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipLetterNotBetween(String value1, String value2) {
            addCriterion("ship_letter not between", value1, value2, "shipLetter");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipStateIsNull() {
            addCriterion("ship_state is null");
            return (Criteria) this;
        }

        public Criteria andShipStateIsNotNull() {
            addCriterion("ship_state is not null");
            return (Criteria) this;
        }

        public Criteria andShipStateEqualTo(Integer value) {
            addCriterion("ship_state =", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateNotEqualTo(Integer value) {
            addCriterion("ship_state <>", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateGreaterThan(Integer value) {
            addCriterion("ship_state >", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_state >=", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateLessThan(Integer value) {
            addCriterion("ship_state <", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateLessThanOrEqualTo(Integer value) {
            addCriterion("ship_state <=", value, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateIn(List<Integer> values) {
            addCriterion("ship_state in", values, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateNotIn(List<Integer> values) {
            addCriterion("ship_state not in", values, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateBetween(Integer value1, Integer value2) {
            addCriterion("ship_state between", value1, value2, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_state not between", value1, value2, "shipState");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNull() {
            addCriterion("ship_type is null");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNotNull() {
            addCriterion("ship_type is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(Integer value) {
            addCriterion("ship_type =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(Integer value) {
            addCriterion("ship_type <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(Integer value) {
            addCriterion("ship_type >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_type >=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(Integer value) {
            addCriterion("ship_type <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ship_type <=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeIn(List<Integer> values) {
            addCriterion("ship_type in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<Integer> values) {
            addCriterion("ship_type not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(Integer value1, Integer value2) {
            addCriterion("ship_type between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_type not between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipUrlIsNull() {
            addCriterion("ship_url is null");
            return (Criteria) this;
        }

        public Criteria andShipUrlIsNotNull() {
            addCriterion("ship_url is not null");
            return (Criteria) this;
        }

        public Criteria andShipUrlEqualTo(String value) {
            addCriterion("ship_url =", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlNotEqualTo(String value) {
            addCriterion("ship_url <>", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlGreaterThan(String value) {
            addCriterion("ship_url >", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ship_url >=", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlLessThan(String value) {
            addCriterion("ship_url <", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlLessThanOrEqualTo(String value) {
            addCriterion("ship_url <=", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlLike(String value) {
            addCriterion("ship_url like", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlNotLike(String value) {
            addCriterion("ship_url not like", value, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlIn(List<String> values) {
            addCriterion("ship_url in", values, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlNotIn(List<String> values) {
            addCriterion("ship_url not in", values, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlBetween(String value1, String value2) {
            addCriterion("ship_url between", value1, value2, "shipUrl");
            return (Criteria) this;
        }

        public Criteria andShipUrlNotBetween(String value1, String value2) {
            addCriterion("ship_url not between", value1, value2, "shipUrl");
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