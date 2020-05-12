package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainTalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainTalkExample() {
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

        public Criteria andTalkIdIsNull() {
            addCriterion("talk_id is null");
            return (Criteria) this;
        }

        public Criteria andTalkIdIsNotNull() {
            addCriterion("talk_id is not null");
            return (Criteria) this;
        }

        public Criteria andTalkIdEqualTo(Integer value) {
            addCriterion("talk_id =", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotEqualTo(Integer value) {
            addCriterion("talk_id <>", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThan(Integer value) {
            addCriterion("talk_id >", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("talk_id >=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThan(Integer value) {
            addCriterion("talk_id <", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThanOrEqualTo(Integer value) {
            addCriterion("talk_id <=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdIn(List<Integer> values) {
            addCriterion("talk_id in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotIn(List<Integer> values) {
            addCriterion("talk_id not in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdBetween(Integer value1, Integer value2) {
            addCriterion("talk_id between", value1, value2, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("talk_id not between", value1, value2, "talkId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Integer value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Integer value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Integer value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Integer value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Integer> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Integer> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andDisableStateIsNull() {
            addCriterion("disable_state is null");
            return (Criteria) this;
        }

        public Criteria andDisableStateIsNotNull() {
            addCriterion("disable_state is not null");
            return (Criteria) this;
        }

        public Criteria andDisableStateEqualTo(Integer value) {
            addCriterion("disable_state =", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateNotEqualTo(Integer value) {
            addCriterion("disable_state <>", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateGreaterThan(Integer value) {
            addCriterion("disable_state >", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("disable_state >=", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateLessThan(Integer value) {
            addCriterion("disable_state <", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateLessThanOrEqualTo(Integer value) {
            addCriterion("disable_state <=", value, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateIn(List<Integer> values) {
            addCriterion("disable_state in", values, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateNotIn(List<Integer> values) {
            addCriterion("disable_state not in", values, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateBetween(Integer value1, Integer value2) {
            addCriterion("disable_state between", value1, value2, "disableState");
            return (Criteria) this;
        }

        public Criteria andDisableStateNotBetween(Integer value1, Integer value2) {
            addCriterion("disable_state not between", value1, value2, "disableState");
            return (Criteria) this;
        }

        public Criteria andTalkContentIsNull() {
            addCriterion("talk_content is null");
            return (Criteria) this;
        }

        public Criteria andTalkContentIsNotNull() {
            addCriterion("talk_content is not null");
            return (Criteria) this;
        }

        public Criteria andTalkContentEqualTo(String value) {
            addCriterion("talk_content =", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotEqualTo(String value) {
            addCriterion("talk_content <>", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentGreaterThan(String value) {
            addCriterion("talk_content >", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentGreaterThanOrEqualTo(String value) {
            addCriterion("talk_content >=", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLessThan(String value) {
            addCriterion("talk_content <", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLessThanOrEqualTo(String value) {
            addCriterion("talk_content <=", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLike(String value) {
            addCriterion("talk_content like", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotLike(String value) {
            addCriterion("talk_content not like", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentIn(List<String> values) {
            addCriterion("talk_content in", values, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotIn(List<String> values) {
            addCriterion("talk_content not in", values, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentBetween(String value1, String value2) {
            addCriterion("talk_content between", value1, value2, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotBetween(String value1, String value2) {
            addCriterion("talk_content not between", value1, value2, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkNameIsNull() {
            addCriterion("talk_name is null");
            return (Criteria) this;
        }

        public Criteria andTalkNameIsNotNull() {
            addCriterion("talk_name is not null");
            return (Criteria) this;
        }

        public Criteria andTalkNameEqualTo(Date value) {
            addCriterion("talk_name =", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameNotEqualTo(Date value) {
            addCriterion("talk_name <>", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameGreaterThan(Date value) {
            addCriterion("talk_name >", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameGreaterThanOrEqualTo(Date value) {
            addCriterion("talk_name >=", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameLessThan(Date value) {
            addCriterion("talk_name <", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameLessThanOrEqualTo(Date value) {
            addCriterion("talk_name <=", value, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameIn(List<Date> values) {
            addCriterion("talk_name in", values, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameNotIn(List<Date> values) {
            addCriterion("talk_name not in", values, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameBetween(Date value1, Date value2) {
            addCriterion("talk_name between", value1, value2, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkNameNotBetween(Date value1, Date value2) {
            addCriterion("talk_name not between", value1, value2, "talkName");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIsNull() {
            addCriterion("talk_type is null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIsNotNull() {
            addCriterion("talk_type is not null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeEqualTo(Integer value) {
            addCriterion("talk_type =", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotEqualTo(Integer value) {
            addCriterion("talk_type <>", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThan(Integer value) {
            addCriterion("talk_type >", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("talk_type >=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThan(Integer value) {
            addCriterion("talk_type <", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("talk_type <=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIn(List<Integer> values) {
            addCriterion("talk_type in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotIn(List<Integer> values) {
            addCriterion("talk_type not in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeBetween(Integer value1, Integer value2) {
            addCriterion("talk_type between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("talk_type not between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkUserIsNull() {
            addCriterion("talk_user is null");
            return (Criteria) this;
        }

        public Criteria andTalkUserIsNotNull() {
            addCriterion("talk_user is not null");
            return (Criteria) this;
        }

        public Criteria andTalkUserEqualTo(String value) {
            addCriterion("talk_user =", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserNotEqualTo(String value) {
            addCriterion("talk_user <>", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserGreaterThan(String value) {
            addCriterion("talk_user >", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserGreaterThanOrEqualTo(String value) {
            addCriterion("talk_user >=", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserLessThan(String value) {
            addCriterion("talk_user <", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserLessThanOrEqualTo(String value) {
            addCriterion("talk_user <=", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserLike(String value) {
            addCriterion("talk_user like", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserNotLike(String value) {
            addCriterion("talk_user not like", value, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserIn(List<String> values) {
            addCriterion("talk_user in", values, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserNotIn(List<String> values) {
            addCriterion("talk_user not in", values, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserBetween(String value1, String value2) {
            addCriterion("talk_user between", value1, value2, "talkUser");
            return (Criteria) this;
        }

        public Criteria andTalkUserNotBetween(String value1, String value2) {
            addCriterion("talk_user not between", value1, value2, "talkUser");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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