package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AppStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppStatExample() {
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

        public Criteria andStatIdIsNull() {
            addCriterion("stat_id is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(Integer value) {
            addCriterion("stat_id =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(Integer value) {
            addCriterion("stat_id <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(Integer value) {
            addCriterion("stat_id >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_id >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(Integer value) {
            addCriterion("stat_id <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("stat_id <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<Integer> values) {
            addCriterion("stat_id in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<Integer> values) {
            addCriterion("stat_id not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(Integer value1, Integer value2) {
            addCriterion("stat_id between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_id not between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatCountIsNull() {
            addCriterion("stat_count is null");
            return (Criteria) this;
        }

        public Criteria andStatCountIsNotNull() {
            addCriterion("stat_count is not null");
            return (Criteria) this;
        }

        public Criteria andStatCountEqualTo(Integer value) {
            addCriterion("stat_count =", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountNotEqualTo(Integer value) {
            addCriterion("stat_count <>", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountGreaterThan(Integer value) {
            addCriterion("stat_count >", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_count >=", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountLessThan(Integer value) {
            addCriterion("stat_count <", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountLessThanOrEqualTo(Integer value) {
            addCriterion("stat_count <=", value, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountIn(List<Integer> values) {
            addCriterion("stat_count in", values, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountNotIn(List<Integer> values) {
            addCriterion("stat_count not in", values, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountBetween(Integer value1, Integer value2) {
            addCriterion("stat_count between", value1, value2, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_count not between", value1, value2, "statCount");
            return (Criteria) this;
        }

        public Criteria andStatKeyIsNull() {
            addCriterion("stat_key is null");
            return (Criteria) this;
        }

        public Criteria andStatKeyIsNotNull() {
            addCriterion("stat_key is not null");
            return (Criteria) this;
        }

        public Criteria andStatKeyEqualTo(String value) {
            addCriterion("stat_key =", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyNotEqualTo(String value) {
            addCriterion("stat_key <>", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyGreaterThan(String value) {
            addCriterion("stat_key >", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyGreaterThanOrEqualTo(String value) {
            addCriterion("stat_key >=", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyLessThan(String value) {
            addCriterion("stat_key <", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyLessThanOrEqualTo(String value) {
            addCriterion("stat_key <=", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyLike(String value) {
            addCriterion("stat_key like", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyNotLike(String value) {
            addCriterion("stat_key not like", value, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyIn(List<String> values) {
            addCriterion("stat_key in", values, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyNotIn(List<String> values) {
            addCriterion("stat_key not in", values, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyBetween(String value1, String value2) {
            addCriterion("stat_key between", value1, value2, "statKey");
            return (Criteria) this;
        }

        public Criteria andStatKeyNotBetween(String value1, String value2) {
            addCriterion("stat_key not between", value1, value2, "statKey");
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