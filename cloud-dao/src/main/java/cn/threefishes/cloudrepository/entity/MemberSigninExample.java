package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberSigninExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberSigninExample() {
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

        public Criteria andSigninIdIsNull() {
            addCriterion("signin_id is null");
            return (Criteria) this;
        }

        public Criteria andSigninIdIsNotNull() {
            addCriterion("signin_id is not null");
            return (Criteria) this;
        }

        public Criteria andSigninIdEqualTo(Integer value) {
            addCriterion("signin_id =", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdNotEqualTo(Integer value) {
            addCriterion("signin_id <>", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdGreaterThan(Integer value) {
            addCriterion("signin_id >", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("signin_id >=", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdLessThan(Integer value) {
            addCriterion("signin_id <", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdLessThanOrEqualTo(Integer value) {
            addCriterion("signin_id <=", value, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdIn(List<Integer> values) {
            addCriterion("signin_id in", values, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdNotIn(List<Integer> values) {
            addCriterion("signin_id not in", values, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdBetween(Integer value1, Integer value2) {
            addCriterion("signin_id between", value1, value2, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninIdNotBetween(Integer value1, Integer value2) {
            addCriterion("signin_id not between", value1, value2, "signinId");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeIsNull() {
            addCriterion("signin_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeIsNotNull() {
            addCriterion("signin_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeEqualTo(Date value) {
            addCriterion("signin_add_time =", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeNotEqualTo(Date value) {
            addCriterion("signin_add_time <>", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeGreaterThan(Date value) {
            addCriterion("signin_add_time >", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signin_add_time >=", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeLessThan(Date value) {
            addCriterion("signin_add_time <", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("signin_add_time <=", value, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeIn(List<Date> values) {
            addCriterion("signin_add_time in", values, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeNotIn(List<Date> values) {
            addCriterion("signin_add_time not in", values, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeBetween(Date value1, Date value2) {
            addCriterion("signin_add_time between", value1, value2, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("signin_add_time not between", value1, value2, "signinAddTime");
            return (Criteria) this;
        }

        public Criteria andSigninDaysIsNull() {
            addCriterion("signin_days is null");
            return (Criteria) this;
        }

        public Criteria andSigninDaysIsNotNull() {
            addCriterion("signin_days is not null");
            return (Criteria) this;
        }

        public Criteria andSigninDaysEqualTo(Integer value) {
            addCriterion("signin_days =", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysNotEqualTo(Integer value) {
            addCriterion("signin_days <>", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysGreaterThan(Integer value) {
            addCriterion("signin_days >", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("signin_days >=", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysLessThan(Integer value) {
            addCriterion("signin_days <", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysLessThanOrEqualTo(Integer value) {
            addCriterion("signin_days <=", value, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysIn(List<Integer> values) {
            addCriterion("signin_days in", values, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysNotIn(List<Integer> values) {
            addCriterion("signin_days not in", values, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysBetween(Integer value1, Integer value2) {
            addCriterion("signin_days between", value1, value2, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("signin_days not between", value1, value2, "signinDays");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarIsNull() {
            addCriterion("signin_member_avatar is null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarIsNotNull() {
            addCriterion("signin_member_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarEqualTo(String value) {
            addCriterion("signin_member_avatar =", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarNotEqualTo(String value) {
            addCriterion("signin_member_avatar <>", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarGreaterThan(String value) {
            addCriterion("signin_member_avatar >", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("signin_member_avatar >=", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarLessThan(String value) {
            addCriterion("signin_member_avatar <", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarLessThanOrEqualTo(String value) {
            addCriterion("signin_member_avatar <=", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarLike(String value) {
            addCriterion("signin_member_avatar like", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarNotLike(String value) {
            addCriterion("signin_member_avatar not like", value, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarIn(List<String> values) {
            addCriterion("signin_member_avatar in", values, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarNotIn(List<String> values) {
            addCriterion("signin_member_avatar not in", values, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarBetween(String value1, String value2) {
            addCriterion("signin_member_avatar between", value1, value2, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberAvatarNotBetween(String value1, String value2) {
            addCriterion("signin_member_avatar not between", value1, value2, "signinMemberAvatar");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdIsNull() {
            addCriterion("signin_member_id is null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdIsNotNull() {
            addCriterion("signin_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdEqualTo(Integer value) {
            addCriterion("signin_member_id =", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdNotEqualTo(Integer value) {
            addCriterion("signin_member_id <>", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdGreaterThan(Integer value) {
            addCriterion("signin_member_id >", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("signin_member_id >=", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdLessThan(Integer value) {
            addCriterion("signin_member_id <", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("signin_member_id <=", value, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdIn(List<Integer> values) {
            addCriterion("signin_member_id in", values, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdNotIn(List<Integer> values) {
            addCriterion("signin_member_id not in", values, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("signin_member_id between", value1, value2, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("signin_member_id not between", value1, value2, "signinMemberId");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameIsNull() {
            addCriterion("signin_member_name is null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameIsNotNull() {
            addCriterion("signin_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameEqualTo(String value) {
            addCriterion("signin_member_name =", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameNotEqualTo(String value) {
            addCriterion("signin_member_name <>", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameGreaterThan(String value) {
            addCriterion("signin_member_name >", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("signin_member_name >=", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameLessThan(String value) {
            addCriterion("signin_member_name <", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameLessThanOrEqualTo(String value) {
            addCriterion("signin_member_name <=", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameLike(String value) {
            addCriterion("signin_member_name like", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameNotLike(String value) {
            addCriterion("signin_member_name not like", value, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameIn(List<String> values) {
            addCriterion("signin_member_name in", values, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameNotIn(List<String> values) {
            addCriterion("signin_member_name not in", values, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameBetween(String value1, String value2) {
            addCriterion("signin_member_name between", value1, value2, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninMemberNameNotBetween(String value1, String value2) {
            addCriterion("signin_member_name not between", value1, value2, "signinMemberName");
            return (Criteria) this;
        }

        public Criteria andSigninPointsIsNull() {
            addCriterion("signin_points is null");
            return (Criteria) this;
        }

        public Criteria andSigninPointsIsNotNull() {
            addCriterion("signin_points is not null");
            return (Criteria) this;
        }

        public Criteria andSigninPointsEqualTo(Integer value) {
            addCriterion("signin_points =", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsNotEqualTo(Integer value) {
            addCriterion("signin_points <>", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsGreaterThan(Integer value) {
            addCriterion("signin_points >", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("signin_points >=", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsLessThan(Integer value) {
            addCriterion("signin_points <", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsLessThanOrEqualTo(Integer value) {
            addCriterion("signin_points <=", value, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsIn(List<Integer> values) {
            addCriterion("signin_points in", values, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsNotIn(List<Integer> values) {
            addCriterion("signin_points not in", values, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsBetween(Integer value1, Integer value2) {
            addCriterion("signin_points between", value1, value2, "signinPoints");
            return (Criteria) this;
        }

        public Criteria andSigninPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("signin_points not between", value1, value2, "signinPoints");
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