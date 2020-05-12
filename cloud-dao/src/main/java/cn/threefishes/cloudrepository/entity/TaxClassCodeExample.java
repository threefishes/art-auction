package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class TaxClassCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaxClassCodeExample() {
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

        public Criteria andBmIsNull() {
            addCriterion("bm is null");
            return (Criteria) this;
        }

        public Criteria andBmIsNotNull() {
            addCriterion("bm is not null");
            return (Criteria) this;
        }

        public Criteria andBmEqualTo(String value) {
            addCriterion("bm =", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotEqualTo(String value) {
            addCriterion("bm <>", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThan(String value) {
            addCriterion("bm >", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThanOrEqualTo(String value) {
            addCriterion("bm >=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThan(String value) {
            addCriterion("bm <", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThanOrEqualTo(String value) {
            addCriterion("bm <=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLike(String value) {
            addCriterion("bm like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotLike(String value) {
            addCriterion("bm not like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmIn(List<String> values) {
            addCriterion("bm in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotIn(List<String> values) {
            addCriterion("bm not in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmBetween(String value1, String value2) {
            addCriterion("bm between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotBetween(String value1, String value2) {
            addCriterion("bm not between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andHbbmIsNull() {
            addCriterion("hbbm is null");
            return (Criteria) this;
        }

        public Criteria andHbbmIsNotNull() {
            addCriterion("hbbm is not null");
            return (Criteria) this;
        }

        public Criteria andHbbmEqualTo(String value) {
            addCriterion("hbbm =", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmNotEqualTo(String value) {
            addCriterion("hbbm <>", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmGreaterThan(String value) {
            addCriterion("hbbm >", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmGreaterThanOrEqualTo(String value) {
            addCriterion("hbbm >=", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmLessThan(String value) {
            addCriterion("hbbm <", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmLessThanOrEqualTo(String value) {
            addCriterion("hbbm <=", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmLike(String value) {
            addCriterion("hbbm like", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmNotLike(String value) {
            addCriterion("hbbm not like", value, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmIn(List<String> values) {
            addCriterion("hbbm in", values, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmNotIn(List<String> values) {
            addCriterion("hbbm not in", values, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmBetween(String value1, String value2) {
            addCriterion("hbbm between", value1, value2, "hbbm");
            return (Criteria) this;
        }

        public Criteria andHbbmNotBetween(String value1, String value2) {
            addCriterion("hbbm not between", value1, value2, "hbbm");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andSmIsNull() {
            addCriterion("sm is null");
            return (Criteria) this;
        }

        public Criteria andSmIsNotNull() {
            addCriterion("sm is not null");
            return (Criteria) this;
        }

        public Criteria andSmEqualTo(String value) {
            addCriterion("sm =", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotEqualTo(String value) {
            addCriterion("sm <>", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThan(String value) {
            addCriterion("sm >", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThanOrEqualTo(String value) {
            addCriterion("sm >=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThan(String value) {
            addCriterion("sm <", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThanOrEqualTo(String value) {
            addCriterion("sm <=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLike(String value) {
            addCriterion("sm like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotLike(String value) {
            addCriterion("sm not like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmIn(List<String> values) {
            addCriterion("sm in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotIn(List<String> values) {
            addCriterion("sm not in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmBetween(String value1, String value2) {
            addCriterion("sm between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotBetween(String value1, String value2) {
            addCriterion("sm not between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andSlvIsNull() {
            addCriterion("slv is null");
            return (Criteria) this;
        }

        public Criteria andSlvIsNotNull() {
            addCriterion("slv is not null");
            return (Criteria) this;
        }

        public Criteria andSlvEqualTo(String value) {
            addCriterion("slv =", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvNotEqualTo(String value) {
            addCriterion("slv <>", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvGreaterThan(String value) {
            addCriterion("slv >", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvGreaterThanOrEqualTo(String value) {
            addCriterion("slv >=", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvLessThan(String value) {
            addCriterion("slv <", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvLessThanOrEqualTo(String value) {
            addCriterion("slv <=", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvLike(String value) {
            addCriterion("slv like", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvNotLike(String value) {
            addCriterion("slv not like", value, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvIn(List<String> values) {
            addCriterion("slv in", values, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvNotIn(List<String> values) {
            addCriterion("slv not in", values, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvBetween(String value1, String value2) {
            addCriterion("slv between", value1, value2, "slv");
            return (Criteria) this;
        }

        public Criteria andSlvNotBetween(String value1, String value2) {
            addCriterion("slv not between", value1, value2, "slv");
            return (Criteria) this;
        }

        public Criteria andZzstsglIsNull() {
            addCriterion("zzstsgl is null");
            return (Criteria) this;
        }

        public Criteria andZzstsglIsNotNull() {
            addCriterion("zzstsgl is not null");
            return (Criteria) this;
        }

        public Criteria andZzstsglEqualTo(String value) {
            addCriterion("zzstsgl =", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglNotEqualTo(String value) {
            addCriterion("zzstsgl <>", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglGreaterThan(String value) {
            addCriterion("zzstsgl >", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglGreaterThanOrEqualTo(String value) {
            addCriterion("zzstsgl >=", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglLessThan(String value) {
            addCriterion("zzstsgl <", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglLessThanOrEqualTo(String value) {
            addCriterion("zzstsgl <=", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglLike(String value) {
            addCriterion("zzstsgl like", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglNotLike(String value) {
            addCriterion("zzstsgl not like", value, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglIn(List<String> values) {
            addCriterion("zzstsgl in", values, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglNotIn(List<String> values) {
            addCriterion("zzstsgl not in", values, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglBetween(String value1, String value2) {
            addCriterion("zzstsgl between", value1, value2, "zzstsgl");
            return (Criteria) this;
        }

        public Criteria andZzstsglNotBetween(String value1, String value2) {
            addCriterion("zzstsgl not between", value1, value2, "zzstsgl");
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