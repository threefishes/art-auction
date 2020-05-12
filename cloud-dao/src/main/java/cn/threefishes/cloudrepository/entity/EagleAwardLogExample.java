package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EagleAwardLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EagleAwardLogExample() {
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

        public Criteria andEagleAwardLogIdIsNull() {
            addCriterion("eagle_award_log_id is null");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdIsNotNull() {
            addCriterion("eagle_award_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdEqualTo(Integer value) {
            addCriterion("eagle_award_log_id =", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdNotEqualTo(Integer value) {
            addCriterion("eagle_award_log_id <>", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdGreaterThan(Integer value) {
            addCriterion("eagle_award_log_id >", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eagle_award_log_id >=", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdLessThan(Integer value) {
            addCriterion("eagle_award_log_id <", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("eagle_award_log_id <=", value, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdIn(List<Integer> values) {
            addCriterion("eagle_award_log_id in", values, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdNotIn(List<Integer> values) {
            addCriterion("eagle_award_log_id not in", values, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdBetween(Integer value1, Integer value2) {
            addCriterion("eagle_award_log_id between", value1, value2, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andEagleAwardLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eagle_award_log_id not between", value1, value2, "eagleAwardLogId");
            return (Criteria) this;
        }

        public Criteria andIsSuperIsNull() {
            addCriterion("is_super is null");
            return (Criteria) this;
        }

        public Criteria andIsSuperIsNotNull() {
            addCriterion("is_super is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuperEqualTo(Integer value) {
            addCriterion("is_super =", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotEqualTo(Integer value) {
            addCriterion("is_super <>", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThan(Integer value) {
            addCriterion("is_super >", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_super >=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThan(Integer value) {
            addCriterion("is_super <", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThanOrEqualTo(Integer value) {
            addCriterion("is_super <=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperIn(List<Integer> values) {
            addCriterion("is_super in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotIn(List<Integer> values) {
            addCriterion("is_super not in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperBetween(Integer value1, Integer value2) {
            addCriterion("is_super between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotBetween(Integer value1, Integer value2) {
            addCriterion("is_super not between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdIsNull() {
            addCriterion("sup_member_id is null");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdIsNotNull() {
            addCriterion("sup_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdEqualTo(Integer value) {
            addCriterion("sup_member_id =", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdNotEqualTo(Integer value) {
            addCriterion("sup_member_id <>", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdGreaterThan(Integer value) {
            addCriterion("sup_member_id >", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_member_id >=", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdLessThan(Integer value) {
            addCriterion("sup_member_id <", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_member_id <=", value, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdIn(List<Integer> values) {
            addCriterion("sup_member_id in", values, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdNotIn(List<Integer> values) {
            addCriterion("sup_member_id not in", values, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_member_id between", value1, value2, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andSupMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_member_id not between", value1, value2, "supMemberId");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNull() {
            addCriterion("do_time is null");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNotNull() {
            addCriterion("do_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoTimeEqualTo(Date value) {
            addCriterion("do_time =", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotEqualTo(Date value) {
            addCriterion("do_time <>", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThan(Date value) {
            addCriterion("do_time >", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("do_time >=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThan(Date value) {
            addCriterion("do_time <", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThanOrEqualTo(Date value) {
            addCriterion("do_time <=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeIn(List<Date> values) {
            addCriterion("do_time in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotIn(List<Date> values) {
            addCriterion("do_time not in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeBetween(Date value1, Date value2) {
            addCriterion("do_time between", value1, value2, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotBetween(Date value1, Date value2) {
            addCriterion("do_time not between", value1, value2, "doTime");
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

        public Criteria andAllAmountIsNull() {
            addCriterion("all_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllAmountIsNotNull() {
            addCriterion("all_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllAmountEqualTo(BigDecimal value) {
            addCriterion("all_amount =", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_amount <>", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountGreaterThan(BigDecimal value) {
            addCriterion("all_amount >", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_amount >=", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountLessThan(BigDecimal value) {
            addCriterion("all_amount <", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_amount <=", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountIn(List<BigDecimal> values) {
            addCriterion("all_amount in", values, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_amount not in", values, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_amount between", value1, value2, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_amount not between", value1, value2, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNull() {
            addCriterion("award_amount is null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNotNull() {
            addCriterion("award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountEqualTo(BigDecimal value) {
            addCriterion("award_amount =", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("award_amount <>", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("award_amount >", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount >=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThan(BigDecimal value) {
            addCriterion("award_amount <", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount <=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIn(List<BigDecimal> values) {
            addCriterion("award_amount in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("award_amount not in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount between", value1, value2, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount not between", value1, value2, "awardAmount");
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