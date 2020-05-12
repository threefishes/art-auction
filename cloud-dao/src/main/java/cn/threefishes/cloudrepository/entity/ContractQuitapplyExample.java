package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractQuitapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractQuitapplyExample() {
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

        public Criteria andCtqIdIsNull() {
            addCriterion("ctq_id is null");
            return (Criteria) this;
        }

        public Criteria andCtqIdIsNotNull() {
            addCriterion("ctq_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtqIdEqualTo(Integer value) {
            addCriterion("ctq_id =", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdNotEqualTo(Integer value) {
            addCriterion("ctq_id <>", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdGreaterThan(Integer value) {
            addCriterion("ctq_id >", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctq_id >=", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdLessThan(Integer value) {
            addCriterion("ctq_id <", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdLessThanOrEqualTo(Integer value) {
            addCriterion("ctq_id <=", value, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdIn(List<Integer> values) {
            addCriterion("ctq_id in", values, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdNotIn(List<Integer> values) {
            addCriterion("ctq_id not in", values, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdBetween(Integer value1, Integer value2) {
            addCriterion("ctq_id between", value1, value2, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ctq_id not between", value1, value2, "ctqId");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeIsNull() {
            addCriterion("ctq_addtime is null");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeIsNotNull() {
            addCriterion("ctq_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeEqualTo(Date value) {
            addCriterion("ctq_addtime =", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeNotEqualTo(Date value) {
            addCriterion("ctq_addtime <>", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeGreaterThan(Date value) {
            addCriterion("ctq_addtime >", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctq_addtime >=", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeLessThan(Date value) {
            addCriterion("ctq_addtime <", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctq_addtime <=", value, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeIn(List<Date> values) {
            addCriterion("ctq_addtime in", values, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeNotIn(List<Date> values) {
            addCriterion("ctq_addtime not in", values, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeBetween(Date value1, Date value2) {
            addCriterion("ctq_addtime between", value1, value2, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctq_addtime not between", value1, value2, "ctqAddtime");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateIsNull() {
            addCriterion("ctq_auditstate is null");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateIsNotNull() {
            addCriterion("ctq_auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateEqualTo(Integer value) {
            addCriterion("ctq_auditstate =", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateNotEqualTo(Integer value) {
            addCriterion("ctq_auditstate <>", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateGreaterThan(Integer value) {
            addCriterion("ctq_auditstate >", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctq_auditstate >=", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateLessThan(Integer value) {
            addCriterion("ctq_auditstate <", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateLessThanOrEqualTo(Integer value) {
            addCriterion("ctq_auditstate <=", value, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateIn(List<Integer> values) {
            addCriterion("ctq_auditstate in", values, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateNotIn(List<Integer> values) {
            addCriterion("ctq_auditstate not in", values, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateBetween(Integer value1, Integer value2) {
            addCriterion("ctq_auditstate between", value1, value2, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqAuditstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ctq_auditstate not between", value1, value2, "ctqAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtqItemidIsNull() {
            addCriterion("ctq_itemid is null");
            return (Criteria) this;
        }

        public Criteria andCtqItemidIsNotNull() {
            addCriterion("ctq_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andCtqItemidEqualTo(Integer value) {
            addCriterion("ctq_itemid =", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidNotEqualTo(Integer value) {
            addCriterion("ctq_itemid <>", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidGreaterThan(Integer value) {
            addCriterion("ctq_itemid >", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctq_itemid >=", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidLessThan(Integer value) {
            addCriterion("ctq_itemid <", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ctq_itemid <=", value, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidIn(List<Integer> values) {
            addCriterion("ctq_itemid in", values, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidNotIn(List<Integer> values) {
            addCriterion("ctq_itemid not in", values, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidBetween(Integer value1, Integer value2) {
            addCriterion("ctq_itemid between", value1, value2, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ctq_itemid not between", value1, value2, "ctqItemid");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameIsNull() {
            addCriterion("ctq_itemname is null");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameIsNotNull() {
            addCriterion("ctq_itemname is not null");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameEqualTo(String value) {
            addCriterion("ctq_itemname =", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameNotEqualTo(String value) {
            addCriterion("ctq_itemname <>", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameGreaterThan(String value) {
            addCriterion("ctq_itemname >", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ctq_itemname >=", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameLessThan(String value) {
            addCriterion("ctq_itemname <", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameLessThanOrEqualTo(String value) {
            addCriterion("ctq_itemname <=", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameLike(String value) {
            addCriterion("ctq_itemname like", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameNotLike(String value) {
            addCriterion("ctq_itemname not like", value, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameIn(List<String> values) {
            addCriterion("ctq_itemname in", values, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameNotIn(List<String> values) {
            addCriterion("ctq_itemname not in", values, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameBetween(String value1, String value2) {
            addCriterion("ctq_itemname between", value1, value2, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqItemnameNotBetween(String value1, String value2) {
            addCriterion("ctq_itemname not between", value1, value2, "ctqItemname");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidIsNull() {
            addCriterion("ctq_storeid is null");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidIsNotNull() {
            addCriterion("ctq_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidEqualTo(Integer value) {
            addCriterion("ctq_storeid =", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidNotEqualTo(Integer value) {
            addCriterion("ctq_storeid <>", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidGreaterThan(Integer value) {
            addCriterion("ctq_storeid >", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctq_storeid >=", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidLessThan(Integer value) {
            addCriterion("ctq_storeid <", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("ctq_storeid <=", value, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidIn(List<Integer> values) {
            addCriterion("ctq_storeid in", values, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidNotIn(List<Integer> values) {
            addCriterion("ctq_storeid not in", values, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidBetween(Integer value1, Integer value2) {
            addCriterion("ctq_storeid between", value1, value2, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("ctq_storeid not between", value1, value2, "ctqStoreid");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameIsNull() {
            addCriterion("ctq_storename is null");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameIsNotNull() {
            addCriterion("ctq_storename is not null");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameEqualTo(String value) {
            addCriterion("ctq_storename =", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameNotEqualTo(String value) {
            addCriterion("ctq_storename <>", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameGreaterThan(String value) {
            addCriterion("ctq_storename >", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("ctq_storename >=", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameLessThan(String value) {
            addCriterion("ctq_storename <", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameLessThanOrEqualTo(String value) {
            addCriterion("ctq_storename <=", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameLike(String value) {
            addCriterion("ctq_storename like", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameNotLike(String value) {
            addCriterion("ctq_storename not like", value, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameIn(List<String> values) {
            addCriterion("ctq_storename in", values, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameNotIn(List<String> values) {
            addCriterion("ctq_storename not in", values, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameBetween(String value1, String value2) {
            addCriterion("ctq_storename between", value1, value2, "ctqStorename");
            return (Criteria) this;
        }

        public Criteria andCtqStorenameNotBetween(String value1, String value2) {
            addCriterion("ctq_storename not between", value1, value2, "ctqStorename");
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