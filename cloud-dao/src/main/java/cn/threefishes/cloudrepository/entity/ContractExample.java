package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateIsNull() {
            addCriterion("ct_auditstate is null");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateIsNotNull() {
            addCriterion("ct_auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateEqualTo(Integer value) {
            addCriterion("ct_auditstate =", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateNotEqualTo(Integer value) {
            addCriterion("ct_auditstate <>", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateGreaterThan(Integer value) {
            addCriterion("ct_auditstate >", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_auditstate >=", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateLessThan(Integer value) {
            addCriterion("ct_auditstate <", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateLessThanOrEqualTo(Integer value) {
            addCriterion("ct_auditstate <=", value, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateIn(List<Integer> values) {
            addCriterion("ct_auditstate in", values, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateNotIn(List<Integer> values) {
            addCriterion("ct_auditstate not in", values, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateBetween(Integer value1, Integer value2) {
            addCriterion("ct_auditstate between", value1, value2, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtAuditstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_auditstate not between", value1, value2, "ctAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateIsNull() {
            addCriterion("ct_closestate is null");
            return (Criteria) this;
        }

        public Criteria andCtClosestateIsNotNull() {
            addCriterion("ct_closestate is not null");
            return (Criteria) this;
        }

        public Criteria andCtClosestateEqualTo(Integer value) {
            addCriterion("ct_closestate =", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateNotEqualTo(Integer value) {
            addCriterion("ct_closestate <>", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateGreaterThan(Integer value) {
            addCriterion("ct_closestate >", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_closestate >=", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateLessThan(Integer value) {
            addCriterion("ct_closestate <", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateLessThanOrEqualTo(Integer value) {
            addCriterion("ct_closestate <=", value, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateIn(List<Integer> values) {
            addCriterion("ct_closestate in", values, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateNotIn(List<Integer> values) {
            addCriterion("ct_closestate not in", values, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateBetween(Integer value1, Integer value2) {
            addCriterion("ct_closestate between", value1, value2, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtClosestateNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_closestate not between", value1, value2, "ctClosestate");
            return (Criteria) this;
        }

        public Criteria andCtCostIsNull() {
            addCriterion("ct_cost is null");
            return (Criteria) this;
        }

        public Criteria andCtCostIsNotNull() {
            addCriterion("ct_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCtCostEqualTo(BigDecimal value) {
            addCriterion("ct_cost =", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostNotEqualTo(BigDecimal value) {
            addCriterion("ct_cost <>", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostGreaterThan(BigDecimal value) {
            addCriterion("ct_cost >", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ct_cost >=", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostLessThan(BigDecimal value) {
            addCriterion("ct_cost <", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ct_cost <=", value, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostIn(List<BigDecimal> values) {
            addCriterion("ct_cost in", values, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostNotIn(List<BigDecimal> values) {
            addCriterion("ct_cost not in", values, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ct_cost between", value1, value2, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ct_cost not between", value1, value2, "ctCost");
            return (Criteria) this;
        }

        public Criteria andCtItemidIsNull() {
            addCriterion("ct_itemid is null");
            return (Criteria) this;
        }

        public Criteria andCtItemidIsNotNull() {
            addCriterion("ct_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andCtItemidEqualTo(Integer value) {
            addCriterion("ct_itemid =", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidNotEqualTo(Integer value) {
            addCriterion("ct_itemid <>", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidGreaterThan(Integer value) {
            addCriterion("ct_itemid >", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_itemid >=", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidLessThan(Integer value) {
            addCriterion("ct_itemid <", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ct_itemid <=", value, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidIn(List<Integer> values) {
            addCriterion("ct_itemid in", values, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidNotIn(List<Integer> values) {
            addCriterion("ct_itemid not in", values, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidBetween(Integer value1, Integer value2) {
            addCriterion("ct_itemid between", value1, value2, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_itemid not between", value1, value2, "ctItemid");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateIsNull() {
            addCriterion("ct_joinstate is null");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateIsNotNull() {
            addCriterion("ct_joinstate is not null");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateEqualTo(Integer value) {
            addCriterion("ct_joinstate =", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateNotEqualTo(Integer value) {
            addCriterion("ct_joinstate <>", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateGreaterThan(Integer value) {
            addCriterion("ct_joinstate >", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_joinstate >=", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateLessThan(Integer value) {
            addCriterion("ct_joinstate <", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateLessThanOrEqualTo(Integer value) {
            addCriterion("ct_joinstate <=", value, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateIn(List<Integer> values) {
            addCriterion("ct_joinstate in", values, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateNotIn(List<Integer> values) {
            addCriterion("ct_joinstate not in", values, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateBetween(Integer value1, Integer value2) {
            addCriterion("ct_joinstate between", value1, value2, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtJoinstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_joinstate not between", value1, value2, "ctJoinstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateIsNull() {
            addCriterion("ct_quitstate is null");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateIsNotNull() {
            addCriterion("ct_quitstate is not null");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateEqualTo(Integer value) {
            addCriterion("ct_quitstate =", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateNotEqualTo(Integer value) {
            addCriterion("ct_quitstate <>", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateGreaterThan(Integer value) {
            addCriterion("ct_quitstate >", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_quitstate >=", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateLessThan(Integer value) {
            addCriterion("ct_quitstate <", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateLessThanOrEqualTo(Integer value) {
            addCriterion("ct_quitstate <=", value, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateIn(List<Integer> values) {
            addCriterion("ct_quitstate in", values, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateNotIn(List<Integer> values) {
            addCriterion("ct_quitstate not in", values, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateBetween(Integer value1, Integer value2) {
            addCriterion("ct_quitstate between", value1, value2, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtQuitstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_quitstate not between", value1, value2, "ctQuitstate");
            return (Criteria) this;
        }

        public Criteria andCtStoreidIsNull() {
            addCriterion("ct_storeid is null");
            return (Criteria) this;
        }

        public Criteria andCtStoreidIsNotNull() {
            addCriterion("ct_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andCtStoreidEqualTo(Integer value) {
            addCriterion("ct_storeid =", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidNotEqualTo(Integer value) {
            addCriterion("ct_storeid <>", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidGreaterThan(Integer value) {
            addCriterion("ct_storeid >", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_storeid >=", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidLessThan(Integer value) {
            addCriterion("ct_storeid <", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("ct_storeid <=", value, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidIn(List<Integer> values) {
            addCriterion("ct_storeid in", values, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidNotIn(List<Integer> values) {
            addCriterion("ct_storeid not in", values, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidBetween(Integer value1, Integer value2) {
            addCriterion("ct_storeid between", value1, value2, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_storeid not between", value1, value2, "ctStoreid");
            return (Criteria) this;
        }

        public Criteria andCtStorenameIsNull() {
            addCriterion("ct_storename is null");
            return (Criteria) this;
        }

        public Criteria andCtStorenameIsNotNull() {
            addCriterion("ct_storename is not null");
            return (Criteria) this;
        }

        public Criteria andCtStorenameEqualTo(String value) {
            addCriterion("ct_storename =", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameNotEqualTo(String value) {
            addCriterion("ct_storename <>", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameGreaterThan(String value) {
            addCriterion("ct_storename >", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("ct_storename >=", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameLessThan(String value) {
            addCriterion("ct_storename <", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameLessThanOrEqualTo(String value) {
            addCriterion("ct_storename <=", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameLike(String value) {
            addCriterion("ct_storename like", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameNotLike(String value) {
            addCriterion("ct_storename not like", value, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameIn(List<String> values) {
            addCriterion("ct_storename in", values, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameNotIn(List<String> values) {
            addCriterion("ct_storename not in", values, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameBetween(String value1, String value2) {
            addCriterion("ct_storename between", value1, value2, "ctStorename");
            return (Criteria) this;
        }

        public Criteria andCtStorenameNotBetween(String value1, String value2) {
            addCriterion("ct_storename not between", value1, value2, "ctStorename");
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