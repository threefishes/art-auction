package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributorUpLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributorUpLogExample() {
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

        public Criteria andDistributorUpLogIdIsNull() {
            addCriterion("distributor_up_log_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdIsNotNull() {
            addCriterion("distributor_up_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdEqualTo(Integer value) {
            addCriterion("distributor_up_log_id =", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdNotEqualTo(Integer value) {
            addCriterion("distributor_up_log_id <>", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdGreaterThan(Integer value) {
            addCriterion("distributor_up_log_id >", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_up_log_id >=", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdLessThan(Integer value) {
            addCriterion("distributor_up_log_id <", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_up_log_id <=", value, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdIn(List<Integer> values) {
            addCriterion("distributor_up_log_id in", values, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdNotIn(List<Integer> values) {
            addCriterion("distributor_up_log_id not in", values, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_up_log_id between", value1, value2, "distributorUpLogId");
            return (Criteria) this;
        }

        public Criteria andDistributorUpLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_up_log_id not between", value1, value2, "distributorUpLogId");
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

        public Criteria andUpMemberIdIsNull() {
            addCriterion("up_member_id is null");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdIsNotNull() {
            addCriterion("up_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdEqualTo(Integer value) {
            addCriterion("up_member_id =", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdNotEqualTo(Integer value) {
            addCriterion("up_member_id <>", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdGreaterThan(Integer value) {
            addCriterion("up_member_id >", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_member_id >=", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdLessThan(Integer value) {
            addCriterion("up_member_id <", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("up_member_id <=", value, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdIn(List<Integer> values) {
            addCriterion("up_member_id in", values, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdNotIn(List<Integer> values) {
            addCriterion("up_member_id not in", values, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("up_member_id between", value1, value2, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("up_member_id not between", value1, value2, "upMemberId");
            return (Criteria) this;
        }

        public Criteria andUpTypeIsNull() {
            addCriterion("up_type is null");
            return (Criteria) this;
        }

        public Criteria andUpTypeIsNotNull() {
            addCriterion("up_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpTypeEqualTo(Integer value) {
            addCriterion("up_type =", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotEqualTo(Integer value) {
            addCriterion("up_type <>", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeGreaterThan(Integer value) {
            addCriterion("up_type >", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_type >=", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeLessThan(Integer value) {
            addCriterion("up_type <", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("up_type <=", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeIn(List<Integer> values) {
            addCriterion("up_type in", values, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotIn(List<Integer> values) {
            addCriterion("up_type not in", values, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeBetween(Integer value1, Integer value2) {
            addCriterion("up_type between", value1, value2, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("up_type not between", value1, value2, "upType");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpAmountIsNull() {
            addCriterion("up_amount is null");
            return (Criteria) this;
        }

        public Criteria andUpAmountIsNotNull() {
            addCriterion("up_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUpAmountEqualTo(BigDecimal value) {
            addCriterion("up_amount =", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountNotEqualTo(BigDecimal value) {
            addCriterion("up_amount <>", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountGreaterThan(BigDecimal value) {
            addCriterion("up_amount >", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("up_amount >=", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountLessThan(BigDecimal value) {
            addCriterion("up_amount <", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("up_amount <=", value, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountIn(List<BigDecimal> values) {
            addCriterion("up_amount in", values, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountNotIn(List<BigDecimal> values) {
            addCriterion("up_amount not in", values, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_amount between", value1, value2, "upAmount");
            return (Criteria) this;
        }

        public Criteria andUpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_amount not between", value1, value2, "upAmount");
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