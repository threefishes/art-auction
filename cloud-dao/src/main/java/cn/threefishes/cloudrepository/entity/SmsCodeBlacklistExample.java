package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class SmsCodeBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCodeBlacklistExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(Long value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(Long value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(Long value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(Long value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(Long value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<Long> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<Long> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(Long value1, Long value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(Long value1, Long value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRestrictedregIsNull() {
            addCriterion("restrictedreg is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedregIsNotNull() {
            addCriterion("restrictedreg is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedregEqualTo(Short value) {
            addCriterion("restrictedreg =", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregNotEqualTo(Short value) {
            addCriterion("restrictedreg <>", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregGreaterThan(Short value) {
            addCriterion("restrictedreg >", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregGreaterThanOrEqualTo(Short value) {
            addCriterion("restrictedreg >=", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregLessThan(Short value) {
            addCriterion("restrictedreg <", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregLessThanOrEqualTo(Short value) {
            addCriterion("restrictedreg <=", value, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregIn(List<Short> values) {
            addCriterion("restrictedreg in", values, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregNotIn(List<Short> values) {
            addCriterion("restrictedreg not in", values, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregBetween(Short value1, Short value2) {
            addCriterion("restrictedreg between", value1, value2, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedregNotBetween(Short value1, Short value2) {
            addCriterion("restrictedreg not between", value1, value2, "restrictedreg");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogIsNull() {
            addCriterion("restrictedlog is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogIsNotNull() {
            addCriterion("restrictedlog is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogEqualTo(Short value) {
            addCriterion("restrictedlog =", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogNotEqualTo(Short value) {
            addCriterion("restrictedlog <>", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogGreaterThan(Short value) {
            addCriterion("restrictedlog >", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogGreaterThanOrEqualTo(Short value) {
            addCriterion("restrictedlog >=", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogLessThan(Short value) {
            addCriterion("restrictedlog <", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogLessThanOrEqualTo(Short value) {
            addCriterion("restrictedlog <=", value, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogIn(List<Short> values) {
            addCriterion("restrictedlog in", values, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogNotIn(List<Short> values) {
            addCriterion("restrictedlog not in", values, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogBetween(Short value1, Short value2) {
            addCriterion("restrictedlog between", value1, value2, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedlogNotBetween(Short value1, Short value2) {
            addCriterion("restrictedlog not between", value1, value2, "restrictedlog");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdIsNull() {
            addCriterion("restrictedpwd is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdIsNotNull() {
            addCriterion("restrictedpwd is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdEqualTo(Short value) {
            addCriterion("restrictedpwd =", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdNotEqualTo(Short value) {
            addCriterion("restrictedpwd <>", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdGreaterThan(Short value) {
            addCriterion("restrictedpwd >", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdGreaterThanOrEqualTo(Short value) {
            addCriterion("restrictedpwd >=", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdLessThan(Short value) {
            addCriterion("restrictedpwd <", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdLessThanOrEqualTo(Short value) {
            addCriterion("restrictedpwd <=", value, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdIn(List<Short> values) {
            addCriterion("restrictedpwd in", values, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdNotIn(List<Short> values) {
            addCriterion("restrictedpwd not in", values, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdBetween(Short value1, Short value2) {
            addCriterion("restrictedpwd between", value1, value2, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedpwdNotBetween(Short value1, Short value2) {
            addCriterion("restrictedpwd not between", value1, value2, "restrictedpwd");
            return (Criteria) this;
        }

        public Criteria andRestrictedverIsNull() {
            addCriterion("restrictedver is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedverIsNotNull() {
            addCriterion("restrictedver is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedverEqualTo(Short value) {
            addCriterion("restrictedver =", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverNotEqualTo(Short value) {
            addCriterion("restrictedver <>", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverGreaterThan(Short value) {
            addCriterion("restrictedver >", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverGreaterThanOrEqualTo(Short value) {
            addCriterion("restrictedver >=", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverLessThan(Short value) {
            addCriterion("restrictedver <", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverLessThanOrEqualTo(Short value) {
            addCriterion("restrictedver <=", value, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverIn(List<Short> values) {
            addCriterion("restrictedver in", values, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverNotIn(List<Short> values) {
            addCriterion("restrictedver not in", values, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverBetween(Short value1, Short value2) {
            addCriterion("restrictedver between", value1, value2, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedverNotBetween(Short value1, Short value2) {
            addCriterion("restrictedver not between", value1, value2, "restrictedver");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinIsNull() {
            addCriterion("restrictedbin is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinIsNotNull() {
            addCriterion("restrictedbin is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinEqualTo(Short value) {
            addCriterion("restrictedbin =", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinNotEqualTo(Short value) {
            addCriterion("restrictedbin <>", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinGreaterThan(Short value) {
            addCriterion("restrictedbin >", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinGreaterThanOrEqualTo(Short value) {
            addCriterion("restrictedbin >=", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinLessThan(Short value) {
            addCriterion("restrictedbin <", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinLessThanOrEqualTo(Short value) {
            addCriterion("restrictedbin <=", value, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinIn(List<Short> values) {
            addCriterion("restrictedbin in", values, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinNotIn(List<Short> values) {
            addCriterion("restrictedbin not in", values, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinBetween(Short value1, Short value2) {
            addCriterion("restrictedbin between", value1, value2, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andRestrictedbinNotBetween(Short value1, Short value2) {
            addCriterion("restrictedbin not between", value1, value2, "restrictedbin");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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