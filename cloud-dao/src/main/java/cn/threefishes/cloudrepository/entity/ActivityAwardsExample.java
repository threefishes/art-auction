package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ActivityAwardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAwardsExample() {
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

        public Criteria andAwardsIdIsNull() {
            addCriterion("awards_id is null");
            return (Criteria) this;
        }

        public Criteria andAwardsIdIsNotNull() {
            addCriterion("awards_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsIdEqualTo(Integer value) {
            addCriterion("awards_id =", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotEqualTo(Integer value) {
            addCriterion("awards_id <>", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdGreaterThan(Integer value) {
            addCriterion("awards_id >", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_id >=", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdLessThan(Integer value) {
            addCriterion("awards_id <", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdLessThanOrEqualTo(Integer value) {
            addCriterion("awards_id <=", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdIn(List<Integer> values) {
            addCriterion("awards_id in", values, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotIn(List<Integer> values) {
            addCriterion("awards_id not in", values, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdBetween(Integer value1, Integer value2) {
            addCriterion("awards_id between", value1, value2, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_id not between", value1, value2, "awardsId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andAwardsContentIsNull() {
            addCriterion("awards_content is null");
            return (Criteria) this;
        }

        public Criteria andAwardsContentIsNotNull() {
            addCriterion("awards_content is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsContentEqualTo(String value) {
            addCriterion("awards_content =", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotEqualTo(String value) {
            addCriterion("awards_content <>", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentGreaterThan(String value) {
            addCriterion("awards_content >", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentGreaterThanOrEqualTo(String value) {
            addCriterion("awards_content >=", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLessThan(String value) {
            addCriterion("awards_content <", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLessThanOrEqualTo(String value) {
            addCriterion("awards_content <=", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLike(String value) {
            addCriterion("awards_content like", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotLike(String value) {
            addCriterion("awards_content not like", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentIn(List<String> values) {
            addCriterion("awards_content in", values, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotIn(List<String> values) {
            addCriterion("awards_content not in", values, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentBetween(String value1, String value2) {
            addCriterion("awards_content between", value1, value2, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotBetween(String value1, String value2) {
            addCriterion("awards_content not between", value1, value2, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsCountIsNull() {
            addCriterion("awards_count is null");
            return (Criteria) this;
        }

        public Criteria andAwardsCountIsNotNull() {
            addCriterion("awards_count is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsCountEqualTo(Integer value) {
            addCriterion("awards_count =", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountNotEqualTo(Integer value) {
            addCriterion("awards_count <>", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountGreaterThan(Integer value) {
            addCriterion("awards_count >", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_count >=", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountLessThan(Integer value) {
            addCriterion("awards_count <", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountLessThanOrEqualTo(Integer value) {
            addCriterion("awards_count <=", value, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountIn(List<Integer> values) {
            addCriterion("awards_count in", values, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountNotIn(List<Integer> values) {
            addCriterion("awards_count not in", values, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountBetween(Integer value1, Integer value2) {
            addCriterion("awards_count between", value1, value2, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_count not between", value1, value2, "awardsCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountIsNull() {
            addCriterion("awards_give_count is null");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountIsNotNull() {
            addCriterion("awards_give_count is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountEqualTo(Integer value) {
            addCriterion("awards_give_count =", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountNotEqualTo(Integer value) {
            addCriterion("awards_give_count <>", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountGreaterThan(Integer value) {
            addCriterion("awards_give_count >", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_give_count >=", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountLessThan(Integer value) {
            addCriterion("awards_give_count <", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountLessThanOrEqualTo(Integer value) {
            addCriterion("awards_give_count <=", value, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountIn(List<Integer> values) {
            addCriterion("awards_give_count in", values, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountNotIn(List<Integer> values) {
            addCriterion("awards_give_count not in", values, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountBetween(Integer value1, Integer value2) {
            addCriterion("awards_give_count between", value1, value2, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsGiveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_give_count not between", value1, value2, "awardsGiveCount");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdIsNull() {
            addCriterion("awards_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdIsNotNull() {
            addCriterion("awards_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdEqualTo(Integer value) {
            addCriterion("awards_info_id =", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdNotEqualTo(Integer value) {
            addCriterion("awards_info_id <>", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdGreaterThan(Integer value) {
            addCriterion("awards_info_id >", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_info_id >=", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdLessThan(Integer value) {
            addCriterion("awards_info_id <", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("awards_info_id <=", value, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdIn(List<Integer> values) {
            addCriterion("awards_info_id in", values, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdNotIn(List<Integer> values) {
            addCriterion("awards_info_id not in", values, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("awards_info_id between", value1, value2, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_info_id not between", value1, value2, "awardsInfoId");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIsNull() {
            addCriterion("awards_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIsNotNull() {
            addCriterion("awards_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsNameEqualTo(String value) {
            addCriterion("awards_name =", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotEqualTo(String value) {
            addCriterion("awards_name <>", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameGreaterThan(String value) {
            addCriterion("awards_name >", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameGreaterThanOrEqualTo(String value) {
            addCriterion("awards_name >=", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLessThan(String value) {
            addCriterion("awards_name <", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLessThanOrEqualTo(String value) {
            addCriterion("awards_name <=", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLike(String value) {
            addCriterion("awards_name like", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotLike(String value) {
            addCriterion("awards_name not like", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIn(List<String> values) {
            addCriterion("awards_name in", values, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotIn(List<String> values) {
            addCriterion("awards_name not in", values, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameBetween(String value1, String value2) {
            addCriterion("awards_name between", value1, value2, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotBetween(String value1, String value2) {
            addCriterion("awards_name not between", value1, value2, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsRateIsNull() {
            addCriterion("awards_rate is null");
            return (Criteria) this;
        }

        public Criteria andAwardsRateIsNotNull() {
            addCriterion("awards_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsRateEqualTo(Float value) {
            addCriterion("awards_rate =", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateNotEqualTo(Float value) {
            addCriterion("awards_rate <>", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateGreaterThan(Float value) {
            addCriterion("awards_rate >", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateGreaterThanOrEqualTo(Float value) {
            addCriterion("awards_rate >=", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateLessThan(Float value) {
            addCriterion("awards_rate <", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateLessThanOrEqualTo(Float value) {
            addCriterion("awards_rate <=", value, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateIn(List<Float> values) {
            addCriterion("awards_rate in", values, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateNotIn(List<Float> values) {
            addCriterion("awards_rate not in", values, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateBetween(Float value1, Float value2) {
            addCriterion("awards_rate between", value1, value2, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsRateNotBetween(Float value1, Float value2) {
            addCriterion("awards_rate not between", value1, value2, "awardsRate");
            return (Criteria) this;
        }

        public Criteria andAwardsStateIsNull() {
            addCriterion("awards_state is null");
            return (Criteria) this;
        }

        public Criteria andAwardsStateIsNotNull() {
            addCriterion("awards_state is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsStateEqualTo(Integer value) {
            addCriterion("awards_state =", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateNotEqualTo(Integer value) {
            addCriterion("awards_state <>", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateGreaterThan(Integer value) {
            addCriterion("awards_state >", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_state >=", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateLessThan(Integer value) {
            addCriterion("awards_state <", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateLessThanOrEqualTo(Integer value) {
            addCriterion("awards_state <=", value, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateIn(List<Integer> values) {
            addCriterion("awards_state in", values, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateNotIn(List<Integer> values) {
            addCriterion("awards_state not in", values, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateBetween(Integer value1, Integer value2) {
            addCriterion("awards_state between", value1, value2, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_state not between", value1, value2, "awardsState");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNull() {
            addCriterion("awards_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNotNull() {
            addCriterion("awards_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeEqualTo(String value) {
            addCriterion("awards_type =", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotEqualTo(String value) {
            addCriterion("awards_type <>", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThan(String value) {
            addCriterion("awards_type >", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("awards_type >=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThan(String value) {
            addCriterion("awards_type <", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThanOrEqualTo(String value) {
            addCriterion("awards_type <=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLike(String value) {
            addCriterion("awards_type like", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotLike(String value) {
            addCriterion("awards_type not like", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIn(List<String> values) {
            addCriterion("awards_type in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotIn(List<String> values) {
            addCriterion("awards_type not in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeBetween(String value1, String value2) {
            addCriterion("awards_type between", value1, value2, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotBetween(String value1, String value2) {
            addCriterion("awards_type not between", value1, value2, "awardsType");
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