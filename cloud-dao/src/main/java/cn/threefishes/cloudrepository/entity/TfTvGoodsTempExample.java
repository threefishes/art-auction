package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfTvGoodsTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfTvGoodsTempExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNull() {
            addCriterion("dw_id is null");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNotNull() {
            addCriterion("dw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwIdEqualTo(Long value) {
            addCriterion("dw_id =", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotEqualTo(Long value) {
            addCriterion("dw_id <>", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThan(Long value) {
            addCriterion("dw_id >", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dw_id >=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThan(Long value) {
            addCriterion("dw_id <", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThanOrEqualTo(Long value) {
            addCriterion("dw_id <=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdIn(List<Long> values) {
            addCriterion("dw_id in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotIn(List<Long> values) {
            addCriterion("dw_id not in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdBetween(Long value1, Long value2) {
            addCriterion("dw_id between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotBetween(Long value1, Long value2) {
            addCriterion("dw_id not between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Long value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Long value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Long value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Long value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Long value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Long> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Long> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Long value1, Long value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Long value1, Long value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIsNull() {
            addCriterion("bd_btime is null");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIsNotNull() {
            addCriterion("bd_btime is not null");
            return (Criteria) this;
        }

        public Criteria andBdBtimeEqualTo(Date value) {
            addCriterion("bd_btime =", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotEqualTo(Date value) {
            addCriterion("bd_btime <>", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeGreaterThan(Date value) {
            addCriterion("bd_btime >", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bd_btime >=", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeLessThan(Date value) {
            addCriterion("bd_btime <", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeLessThanOrEqualTo(Date value) {
            addCriterion("bd_btime <=", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIn(List<Date> values) {
            addCriterion("bd_btime in", values, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotIn(List<Date> values) {
            addCriterion("bd_btime not in", values, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeBetween(Date value1, Date value2) {
            addCriterion("bd_btime between", value1, value2, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotBetween(Date value1, Date value2) {
            addCriterion("bd_btime not between", value1, value2, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIsNull() {
            addCriterion("bd_etime is null");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIsNotNull() {
            addCriterion("bd_etime is not null");
            return (Criteria) this;
        }

        public Criteria andBdEtimeEqualTo(Date value) {
            addCriterion("bd_etime =", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotEqualTo(Date value) {
            addCriterion("bd_etime <>", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeGreaterThan(Date value) {
            addCriterion("bd_etime >", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bd_etime >=", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeLessThan(Date value) {
            addCriterion("bd_etime <", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeLessThanOrEqualTo(Date value) {
            addCriterion("bd_etime <=", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIn(List<Date> values) {
            addCriterion("bd_etime in", values, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotIn(List<Date> values) {
            addCriterion("bd_etime not in", values, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeBetween(Date value1, Date value2) {
            addCriterion("bd_etime between", value1, value2, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotBetween(Date value1, Date value2) {
            addCriterion("bd_etime not between", value1, value2, "bdEtime");
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