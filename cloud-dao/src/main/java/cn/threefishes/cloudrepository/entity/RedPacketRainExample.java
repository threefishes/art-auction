package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketRainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketRainExample() {
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

        public Criteria andRainIdIsNull() {
            addCriterion("rain_id is null");
            return (Criteria) this;
        }

        public Criteria andRainIdIsNotNull() {
            addCriterion("rain_id is not null");
            return (Criteria) this;
        }

        public Criteria andRainIdEqualTo(Integer value) {
            addCriterion("rain_id =", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotEqualTo(Integer value) {
            addCriterion("rain_id <>", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThan(Integer value) {
            addCriterion("rain_id >", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rain_id >=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThan(Integer value) {
            addCriterion("rain_id <", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThanOrEqualTo(Integer value) {
            addCriterion("rain_id <=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdIn(List<Integer> values) {
            addCriterion("rain_id in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotIn(List<Integer> values) {
            addCriterion("rain_id not in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdBetween(Integer value1, Integer value2) {
            addCriterion("rain_id between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rain_id not between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andShowHomeIsNull() {
            addCriterion("show_home is null");
            return (Criteria) this;
        }

        public Criteria andShowHomeIsNotNull() {
            addCriterion("show_home is not null");
            return (Criteria) this;
        }

        public Criteria andShowHomeEqualTo(Integer value) {
            addCriterion("show_home =", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeNotEqualTo(Integer value) {
            addCriterion("show_home <>", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeGreaterThan(Integer value) {
            addCriterion("show_home >", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_home >=", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeLessThan(Integer value) {
            addCriterion("show_home <", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeLessThanOrEqualTo(Integer value) {
            addCriterion("show_home <=", value, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeIn(List<Integer> values) {
            addCriterion("show_home in", values, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeNotIn(List<Integer> values) {
            addCriterion("show_home not in", values, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeBetween(Integer value1, Integer value2) {
            addCriterion("show_home between", value1, value2, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowHomeNotBetween(Integer value1, Integer value2) {
            addCriterion("show_home not between", value1, value2, "showHome");
            return (Criteria) this;
        }

        public Criteria andShowTvIsNull() {
            addCriterion("show_tv is null");
            return (Criteria) this;
        }

        public Criteria andShowTvIsNotNull() {
            addCriterion("show_tv is not null");
            return (Criteria) this;
        }

        public Criteria andShowTvEqualTo(Integer value) {
            addCriterion("show_tv =", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvNotEqualTo(Integer value) {
            addCriterion("show_tv <>", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvGreaterThan(Integer value) {
            addCriterion("show_tv >", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_tv >=", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvLessThan(Integer value) {
            addCriterion("show_tv <", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvLessThanOrEqualTo(Integer value) {
            addCriterion("show_tv <=", value, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvIn(List<Integer> values) {
            addCriterion("show_tv in", values, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvNotIn(List<Integer> values) {
            addCriterion("show_tv not in", values, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvBetween(Integer value1, Integer value2) {
            addCriterion("show_tv between", value1, value2, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowTvNotBetween(Integer value1, Integer value2) {
            addCriterion("show_tv not between", value1, value2, "showTv");
            return (Criteria) this;
        }

        public Criteria andShowSpecailIsNull() {
            addCriterion("show_specail is null");
            return (Criteria) this;
        }

        public Criteria andShowSpecailIsNotNull() {
            addCriterion("show_specail is not null");
            return (Criteria) this;
        }

        public Criteria andShowSpecailEqualTo(Integer value) {
            addCriterion("show_specail =", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailNotEqualTo(Integer value) {
            addCriterion("show_specail <>", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailGreaterThan(Integer value) {
            addCriterion("show_specail >", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_specail >=", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailLessThan(Integer value) {
            addCriterion("show_specail <", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailLessThanOrEqualTo(Integer value) {
            addCriterion("show_specail <=", value, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailIn(List<Integer> values) {
            addCriterion("show_specail in", values, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailNotIn(List<Integer> values) {
            addCriterion("show_specail not in", values, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailBetween(Integer value1, Integer value2) {
            addCriterion("show_specail between", value1, value2, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andShowSpecailNotBetween(Integer value1, Integer value2) {
            addCriterion("show_specail not between", value1, value2, "showSpecail");
            return (Criteria) this;
        }

        public Criteria andRainNameIsNull() {
            addCriterion("rain_name is null");
            return (Criteria) this;
        }

        public Criteria andRainNameIsNotNull() {
            addCriterion("rain_name is not null");
            return (Criteria) this;
        }

        public Criteria andRainNameEqualTo(String value) {
            addCriterion("rain_name =", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotEqualTo(String value) {
            addCriterion("rain_name <>", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameGreaterThan(String value) {
            addCriterion("rain_name >", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameGreaterThanOrEqualTo(String value) {
            addCriterion("rain_name >=", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLessThan(String value) {
            addCriterion("rain_name <", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLessThanOrEqualTo(String value) {
            addCriterion("rain_name <=", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameLike(String value) {
            addCriterion("rain_name like", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotLike(String value) {
            addCriterion("rain_name not like", value, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameIn(List<String> values) {
            addCriterion("rain_name in", values, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotIn(List<String> values) {
            addCriterion("rain_name not in", values, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameBetween(String value1, String value2) {
            addCriterion("rain_name between", value1, value2, "rainName");
            return (Criteria) this;
        }

        public Criteria andRainNameNotBetween(String value1, String value2) {
            addCriterion("rain_name not between", value1, value2, "rainName");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNull() {
            addCriterion("activity_rate is null");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNotNull() {
            addCriterion("activity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andActivityRateEqualTo(Integer value) {
            addCriterion("activity_rate =", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotEqualTo(Integer value) {
            addCriterion("activity_rate <>", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThan(Integer value) {
            addCriterion("activity_rate >", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_rate >=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThan(Integer value) {
            addCriterion("activity_rate <", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_rate <=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateIn(List<Integer> values) {
            addCriterion("activity_rate in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotIn(List<Integer> values) {
            addCriterion("activity_rate not in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateBetween(Integer value1, Integer value2) {
            addCriterion("activity_rate between", value1, value2, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_rate not between", value1, value2, "activityRate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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