package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PredepositGatherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PredepositGatherExample() {
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

        public Criteria andGatherIdIsNull() {
            addCriterion("gather_id is null");
            return (Criteria) this;
        }

        public Criteria andGatherIdIsNotNull() {
            addCriterion("gather_id is not null");
            return (Criteria) this;
        }

        public Criteria andGatherIdEqualTo(Integer value) {
            addCriterion("gather_id =", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotEqualTo(Integer value) {
            addCriterion("gather_id <>", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdGreaterThan(Integer value) {
            addCriterion("gather_id >", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gather_id >=", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdLessThan(Integer value) {
            addCriterion("gather_id <", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("gather_id <=", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdIn(List<Integer> values) {
            addCriterion("gather_id in", values, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotIn(List<Integer> values) {
            addCriterion("gather_id not in", values, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdBetween(Integer value1, Integer value2) {
            addCriterion("gather_id between", value1, value2, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gather_id not between", value1, value2, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherSnIsNull() {
            addCriterion("gather_sn is null");
            return (Criteria) this;
        }

        public Criteria andGatherSnIsNotNull() {
            addCriterion("gather_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGatherSnEqualTo(String value) {
            addCriterion("gather_sn =", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnNotEqualTo(String value) {
            addCriterion("gather_sn <>", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnGreaterThan(String value) {
            addCriterion("gather_sn >", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnGreaterThanOrEqualTo(String value) {
            addCriterion("gather_sn >=", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnLessThan(String value) {
            addCriterion("gather_sn <", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnLessThanOrEqualTo(String value) {
            addCriterion("gather_sn <=", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnLike(String value) {
            addCriterion("gather_sn like", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnNotLike(String value) {
            addCriterion("gather_sn not like", value, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnIn(List<String> values) {
            addCriterion("gather_sn in", values, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnNotIn(List<String> values) {
            addCriterion("gather_sn not in", values, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnBetween(String value1, String value2) {
            addCriterion("gather_sn between", value1, value2, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andGatherSnNotBetween(String value1, String value2) {
            addCriterion("gather_sn not between", value1, value2, "gatherSn");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNull() {
            addCriterion("available_amount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNotNull() {
            addCriterion("available_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountEqualTo(BigDecimal value) {
            addCriterion("available_amount =", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotEqualTo(BigDecimal value) {
            addCriterion("available_amount <>", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThan(BigDecimal value) {
            addCriterion("available_amount >", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount >=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThan(BigDecimal value) {
            addCriterion("available_amount <", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount <=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIn(List<BigDecimal> values) {
            addCriterion("available_amount in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotIn(List<BigDecimal> values) {
            addCriterion("available_amount not in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount not between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNull() {
            addCriterion("balance_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNotNull() {
            addCriterion("balance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountEqualTo(BigDecimal value) {
            addCriterion("balance_amount =", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotEqualTo(BigDecimal value) {
            addCriterion("balance_amount <>", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThan(BigDecimal value) {
            addCriterion("balance_amount >", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_amount >=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThan(BigDecimal value) {
            addCriterion("balance_amount <", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_amount <=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIn(List<BigDecimal> values) {
            addCriterion("balance_amount in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotIn(List<BigDecimal> values) {
            addCriterion("balance_amount not in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_amount between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_amount not between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andOperationStageIsNull() {
            addCriterion("operation_stage is null");
            return (Criteria) this;
        }

        public Criteria andOperationStageIsNotNull() {
            addCriterion("operation_stage is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStageEqualTo(String value) {
            addCriterion("operation_stage =", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageNotEqualTo(String value) {
            addCriterion("operation_stage <>", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageGreaterThan(String value) {
            addCriterion("operation_stage >", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageGreaterThanOrEqualTo(String value) {
            addCriterion("operation_stage >=", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageLessThan(String value) {
            addCriterion("operation_stage <", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageLessThanOrEqualTo(String value) {
            addCriterion("operation_stage <=", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageLike(String value) {
            addCriterion("operation_stage like", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageNotLike(String value) {
            addCriterion("operation_stage not like", value, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageIn(List<String> values) {
            addCriterion("operation_stage in", values, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageNotIn(List<String> values) {
            addCriterion("operation_stage not in", values, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageBetween(String value1, String value2) {
            addCriterion("operation_stage between", value1, value2, "operationStage");
            return (Criteria) this;
        }

        public Criteria andOperationStageNotBetween(String value1, String value2) {
            addCriterion("operation_stage not between", value1, value2, "operationStage");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIsNull() {
            addCriterion("gather_time is null");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIsNotNull() {
            addCriterion("gather_time is not null");
            return (Criteria) this;
        }

        public Criteria andGatherTimeEqualTo(Date value) {
            addCriterion("gather_time =", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotEqualTo(Date value) {
            addCriterion("gather_time <>", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeGreaterThan(Date value) {
            addCriterion("gather_time >", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gather_time >=", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeLessThan(Date value) {
            addCriterion("gather_time <", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeLessThanOrEqualTo(Date value) {
            addCriterion("gather_time <=", value, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeIn(List<Date> values) {
            addCriterion("gather_time in", values, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotIn(List<Date> values) {
            addCriterion("gather_time not in", values, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeBetween(Date value1, Date value2) {
            addCriterion("gather_time between", value1, value2, "gatherTime");
            return (Criteria) this;
        }

        public Criteria andGatherTimeNotBetween(Date value1, Date value2) {
            addCriterion("gather_time not between", value1, value2, "gatherTime");
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