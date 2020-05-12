package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributorFavoritesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributorFavoritesExample() {
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

        public Criteria andDistributorFavoritesIdIsNull() {
            addCriterion("distributor_favorites_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdIsNotNull() {
            addCriterion("distributor_favorites_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdEqualTo(Integer value) {
            addCriterion("distributor_favorites_id =", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdNotEqualTo(Integer value) {
            addCriterion("distributor_favorites_id <>", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdGreaterThan(Integer value) {
            addCriterion("distributor_favorites_id >", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_favorites_id >=", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdLessThan(Integer value) {
            addCriterion("distributor_favorites_id <", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_favorites_id <=", value, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdIn(List<Integer> values) {
            addCriterion("distributor_favorites_id in", values, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdNotIn(List<Integer> values) {
            addCriterion("distributor_favorites_id not in", values, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_favorites_id between", value1, value2, "distributorFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_favorites_id not between", value1, value2, "distributorFavoritesId");
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

        public Criteria andDistributorFavoritesNameIsNull() {
            addCriterion("distributor_favorites_name is null");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameIsNotNull() {
            addCriterion("distributor_favorites_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameEqualTo(String value) {
            addCriterion("distributor_favorites_name =", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameNotEqualTo(String value) {
            addCriterion("distributor_favorites_name <>", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameGreaterThan(String value) {
            addCriterion("distributor_favorites_name >", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameGreaterThanOrEqualTo(String value) {
            addCriterion("distributor_favorites_name >=", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameLessThan(String value) {
            addCriterion("distributor_favorites_name <", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameLessThanOrEqualTo(String value) {
            addCriterion("distributor_favorites_name <=", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameLike(String value) {
            addCriterion("distributor_favorites_name like", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameNotLike(String value) {
            addCriterion("distributor_favorites_name not like", value, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameIn(List<String> values) {
            addCriterion("distributor_favorites_name in", values, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameNotIn(List<String> values) {
            addCriterion("distributor_favorites_name not in", values, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameBetween(String value1, String value2) {
            addCriterion("distributor_favorites_name between", value1, value2, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorFavoritesNameNotBetween(String value1, String value2) {
            addCriterion("distributor_favorites_name not between", value1, value2, "distributorFavoritesName");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNull() {
            addCriterion("distributor_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNotNull() {
            addCriterion("distributor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdEqualTo(Integer value) {
            addCriterion("distributor_id =", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotEqualTo(Integer value) {
            addCriterion("distributor_id <>", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThan(Integer value) {
            addCriterion("distributor_id >", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_id >=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThan(Integer value) {
            addCriterion("distributor_id <", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_id <=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIn(List<Integer> values) {
            addCriterion("distributor_id in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotIn(List<Integer> values) {
            addCriterion("distributor_id not in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id not between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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