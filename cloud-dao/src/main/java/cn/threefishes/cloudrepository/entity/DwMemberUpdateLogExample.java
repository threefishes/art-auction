package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DwMemberUpdateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DwMemberUpdateLogExample() {
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

        public Criteria andUpdateLogIdIsNull() {
            addCriterion("update_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdIsNotNull() {
            addCriterion("update_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdEqualTo(Integer value) {
            addCriterion("update_log_id =", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotEqualTo(Integer value) {
            addCriterion("update_log_id <>", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdGreaterThan(Integer value) {
            addCriterion("update_log_id >", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_log_id >=", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdLessThan(Integer value) {
            addCriterion("update_log_id <", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_log_id <=", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdIn(List<Integer> values) {
            addCriterion("update_log_id in", values, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotIn(List<Integer> values) {
            addCriterion("update_log_id not in", values, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdBetween(Integer value1, Integer value2) {
            addCriterion("update_log_id between", value1, value2, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_log_id not between", value1, value2, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeIsNull() {
            addCriterion("update_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeIsNotNull() {
            addCriterion("update_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeEqualTo(Date value) {
            addCriterion("update_create_time =", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeNotEqualTo(Date value) {
            addCriterion("update_create_time <>", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeGreaterThan(Date value) {
            addCriterion("update_create_time >", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_create_time >=", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeLessThan(Date value) {
            addCriterion("update_create_time <", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_create_time <=", value, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeIn(List<Date> values) {
            addCriterion("update_create_time in", values, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeNotIn(List<Date> values) {
            addCriterion("update_create_time not in", values, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeBetween(Date value1, Date value2) {
            addCriterion("update_create_time between", value1, value2, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_create_time not between", value1, value2, "updateCreateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("update_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(Integer value) {
            addCriterion("update_flag =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(Integer value) {
            addCriterion("update_flag <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(Integer value) {
            addCriterion("update_flag >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_flag >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(Integer value) {
            addCriterion("update_flag <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(Integer value) {
            addCriterion("update_flag <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<Integer> values) {
            addCriterion("update_flag in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<Integer> values) {
            addCriterion("update_flag not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(Integer value1, Integer value2) {
            addCriterion("update_flag between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("update_flag not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNull() {
            addCriterion("update_member_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNotNull() {
            addCriterion("update_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdEqualTo(Integer value) {
            addCriterion("update_member_id =", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotEqualTo(Integer value) {
            addCriterion("update_member_id <>", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThan(Integer value) {
            addCriterion("update_member_id >", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_member_id >=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThan(Integer value) {
            addCriterion("update_member_id <", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_member_id <=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIn(List<Integer> values) {
            addCriterion("update_member_id in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotIn(List<Integer> values) {
            addCriterion("update_member_id not in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("update_member_id between", value1, value2, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_member_id not between", value1, value2, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdIsNull() {
            addCriterion("superior_member_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdIsNotNull() {
            addCriterion("superior_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdEqualTo(Integer value) {
            addCriterion("superior_member_id =", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdNotEqualTo(Integer value) {
            addCriterion("superior_member_id <>", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdGreaterThan(Integer value) {
            addCriterion("superior_member_id >", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("superior_member_id >=", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdLessThan(Integer value) {
            addCriterion("superior_member_id <", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("superior_member_id <=", value, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdIn(List<Integer> values) {
            addCriterion("superior_member_id in", values, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdNotIn(List<Integer> values) {
            addCriterion("superior_member_id not in", values, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("superior_member_id between", value1, value2, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andSuperiorMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("superior_member_id not between", value1, value2, "superiorMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNull() {
            addCriterion("update_type is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNotNull() {
            addCriterion("update_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeEqualTo(Integer value) {
            addCriterion("update_type =", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotEqualTo(Integer value) {
            addCriterion("update_type <>", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThan(Integer value) {
            addCriterion("update_type >", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_type >=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThan(Integer value) {
            addCriterion("update_type <", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("update_type <=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIn(List<Integer> values) {
            addCriterion("update_type in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotIn(List<Integer> values) {
            addCriterion("update_type not in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeBetween(Integer value1, Integer value2) {
            addCriterion("update_type between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_type not between", value1, value2, "updateType");
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