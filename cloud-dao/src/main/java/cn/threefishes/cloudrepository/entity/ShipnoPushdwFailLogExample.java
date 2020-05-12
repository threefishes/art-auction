package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipnoPushdwFailLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipnoPushdwFailLogExample() {
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

        public Criteria andShipnoLogIdIsNull() {
            addCriterion("shipno_log_id is null");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdIsNotNull() {
            addCriterion("shipno_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdEqualTo(Integer value) {
            addCriterion("shipno_log_id =", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdNotEqualTo(Integer value) {
            addCriterion("shipno_log_id <>", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdGreaterThan(Integer value) {
            addCriterion("shipno_log_id >", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipno_log_id >=", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdLessThan(Integer value) {
            addCriterion("shipno_log_id <", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipno_log_id <=", value, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdIn(List<Integer> values) {
            addCriterion("shipno_log_id in", values, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdNotIn(List<Integer> values) {
            addCriterion("shipno_log_id not in", values, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdBetween(Integer value1, Integer value2) {
            addCriterion("shipno_log_id between", value1, value2, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipnoLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipno_log_id not between", value1, value2, "shipnoLogId");
            return (Criteria) this;
        }

        public Criteria andShipNoIsNull() {
            addCriterion("ship_no is null");
            return (Criteria) this;
        }

        public Criteria andShipNoIsNotNull() {
            addCriterion("ship_no is not null");
            return (Criteria) this;
        }

        public Criteria andShipNoEqualTo(String value) {
            addCriterion("ship_no =", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoNotEqualTo(String value) {
            addCriterion("ship_no <>", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoGreaterThan(String value) {
            addCriterion("ship_no >", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoGreaterThanOrEqualTo(String value) {
            addCriterion("ship_no >=", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoLessThan(String value) {
            addCriterion("ship_no <", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoLessThanOrEqualTo(String value) {
            addCriterion("ship_no <=", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoLike(String value) {
            addCriterion("ship_no like", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoNotLike(String value) {
            addCriterion("ship_no not like", value, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoIn(List<String> values) {
            addCriterion("ship_no in", values, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoNotIn(List<String> values) {
            addCriterion("ship_no not in", values, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoBetween(String value1, String value2) {
            addCriterion("ship_no between", value1, value2, "shipNo");
            return (Criteria) this;
        }

        public Criteria andShipNoNotBetween(String value1, String value2) {
            addCriterion("ship_no not between", value1, value2, "shipNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoIsNull() {
            addCriterion("claim_no is null");
            return (Criteria) this;
        }

        public Criteria andClaimNoIsNotNull() {
            addCriterion("claim_no is not null");
            return (Criteria) this;
        }

        public Criteria andClaimNoEqualTo(String value) {
            addCriterion("claim_no =", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoNotEqualTo(String value) {
            addCriterion("claim_no <>", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoGreaterThan(String value) {
            addCriterion("claim_no >", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoGreaterThanOrEqualTo(String value) {
            addCriterion("claim_no >=", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoLessThan(String value) {
            addCriterion("claim_no <", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoLessThanOrEqualTo(String value) {
            addCriterion("claim_no <=", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoLike(String value) {
            addCriterion("claim_no like", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoNotLike(String value) {
            addCriterion("claim_no not like", value, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoIn(List<String> values) {
            addCriterion("claim_no in", values, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoNotIn(List<String> values) {
            addCriterion("claim_no not in", values, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoBetween(String value1, String value2) {
            addCriterion("claim_no between", value1, value2, "claimNo");
            return (Criteria) this;
        }

        public Criteria andClaimNoNotBetween(String value1, String value2) {
            addCriterion("claim_no not between", value1, value2, "claimNo");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNull() {
            addCriterion("push_type is null");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNotNull() {
            addCriterion("push_type is not null");
            return (Criteria) this;
        }

        public Criteria andPushTypeEqualTo(Integer value) {
            addCriterion("push_type =", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotEqualTo(Integer value) {
            addCriterion("push_type <>", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThan(Integer value) {
            addCriterion("push_type >", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_type >=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThan(Integer value) {
            addCriterion("push_type <", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThanOrEqualTo(Integer value) {
            addCriterion("push_type <=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeIn(List<Integer> values) {
            addCriterion("push_type in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotIn(List<Integer> values) {
            addCriterion("push_type not in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeBetween(Integer value1, Integer value2) {
            addCriterion("push_type between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_type not between", value1, value2, "pushType");
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