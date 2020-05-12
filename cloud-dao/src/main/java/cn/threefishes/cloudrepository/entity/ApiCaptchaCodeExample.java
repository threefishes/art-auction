package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiCaptchaCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiCaptchaCodeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
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

        public Criteria andCodeKeyIsNull() {
            addCriterion("code_key is null");
            return (Criteria) this;
        }

        public Criteria andCodeKeyIsNotNull() {
            addCriterion("code_key is not null");
            return (Criteria) this;
        }

        public Criteria andCodeKeyEqualTo(String value) {
            addCriterion("code_key =", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyNotEqualTo(String value) {
            addCriterion("code_key <>", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyGreaterThan(String value) {
            addCriterion("code_key >", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("code_key >=", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyLessThan(String value) {
            addCriterion("code_key <", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyLessThanOrEqualTo(String value) {
            addCriterion("code_key <=", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyLike(String value) {
            addCriterion("code_key like", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyNotLike(String value) {
            addCriterion("code_key not like", value, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyIn(List<String> values) {
            addCriterion("code_key in", values, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyNotIn(List<String> values) {
            addCriterion("code_key not in", values, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyBetween(String value1, String value2) {
            addCriterion("code_key between", value1, value2, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeKeyNotBetween(String value1, String value2) {
            addCriterion("code_key not between", value1, value2, "codeKey");
            return (Criteria) this;
        }

        public Criteria andCodeValIsNull() {
            addCriterion("code_val is null");
            return (Criteria) this;
        }

        public Criteria andCodeValIsNotNull() {
            addCriterion("code_val is not null");
            return (Criteria) this;
        }

        public Criteria andCodeValEqualTo(String value) {
            addCriterion("code_val =", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValNotEqualTo(String value) {
            addCriterion("code_val <>", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValGreaterThan(String value) {
            addCriterion("code_val >", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValGreaterThanOrEqualTo(String value) {
            addCriterion("code_val >=", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValLessThan(String value) {
            addCriterion("code_val <", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValLessThanOrEqualTo(String value) {
            addCriterion("code_val <=", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValLike(String value) {
            addCriterion("code_val like", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValNotLike(String value) {
            addCriterion("code_val not like", value, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValIn(List<String> values) {
            addCriterion("code_val in", values, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValNotIn(List<String> values) {
            addCriterion("code_val not in", values, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValBetween(String value1, String value2) {
            addCriterion("code_val between", value1, value2, "codeVal");
            return (Criteria) this;
        }

        public Criteria andCodeValNotBetween(String value1, String value2) {
            addCriterion("code_val not between", value1, value2, "codeVal");
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