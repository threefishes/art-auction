package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractApplyExample() {
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

        public Criteria andCtaIdIsNull() {
            addCriterion("cta_id is null");
            return (Criteria) this;
        }

        public Criteria andCtaIdIsNotNull() {
            addCriterion("cta_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtaIdEqualTo(Integer value) {
            addCriterion("cta_id =", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdNotEqualTo(Integer value) {
            addCriterion("cta_id <>", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdGreaterThan(Integer value) {
            addCriterion("cta_id >", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cta_id >=", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdLessThan(Integer value) {
            addCriterion("cta_id <", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cta_id <=", value, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdIn(List<Integer> values) {
            addCriterion("cta_id in", values, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdNotIn(List<Integer> values) {
            addCriterion("cta_id not in", values, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdBetween(Integer value1, Integer value2) {
            addCriterion("cta_id between", value1, value2, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cta_id not between", value1, value2, "ctaId");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeIsNull() {
            addCriterion("cta_addtime is null");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeIsNotNull() {
            addCriterion("cta_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeEqualTo(Date value) {
            addCriterion("cta_addtime =", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeNotEqualTo(Date value) {
            addCriterion("cta_addtime <>", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeGreaterThan(Date value) {
            addCriterion("cta_addtime >", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cta_addtime >=", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeLessThan(Date value) {
            addCriterion("cta_addtime <", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("cta_addtime <=", value, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeIn(List<Date> values) {
            addCriterion("cta_addtime in", values, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeNotIn(List<Date> values) {
            addCriterion("cta_addtime not in", values, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeBetween(Date value1, Date value2) {
            addCriterion("cta_addtime between", value1, value2, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("cta_addtime not between", value1, value2, "ctaAddtime");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateIsNull() {
            addCriterion("cta_auditstate is null");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateIsNotNull() {
            addCriterion("cta_auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateEqualTo(Integer value) {
            addCriterion("cta_auditstate =", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateNotEqualTo(Integer value) {
            addCriterion("cta_auditstate <>", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateGreaterThan(Integer value) {
            addCriterion("cta_auditstate >", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cta_auditstate >=", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateLessThan(Integer value) {
            addCriterion("cta_auditstate <", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateLessThanOrEqualTo(Integer value) {
            addCriterion("cta_auditstate <=", value, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateIn(List<Integer> values) {
            addCriterion("cta_auditstate in", values, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateNotIn(List<Integer> values) {
            addCriterion("cta_auditstate not in", values, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateBetween(Integer value1, Integer value2) {
            addCriterion("cta_auditstate between", value1, value2, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaAuditstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cta_auditstate not between", value1, value2, "ctaAuditstate");
            return (Criteria) this;
        }

        public Criteria andCtaCostIsNull() {
            addCriterion("cta_cost is null");
            return (Criteria) this;
        }

        public Criteria andCtaCostIsNotNull() {
            addCriterion("cta_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCtaCostEqualTo(BigDecimal value) {
            addCriterion("cta_cost =", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostNotEqualTo(BigDecimal value) {
            addCriterion("cta_cost <>", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostGreaterThan(BigDecimal value) {
            addCriterion("cta_cost >", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cta_cost >=", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostLessThan(BigDecimal value) {
            addCriterion("cta_cost <", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cta_cost <=", value, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostIn(List<BigDecimal> values) {
            addCriterion("cta_cost in", values, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostNotIn(List<BigDecimal> values) {
            addCriterion("cta_cost not in", values, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cta_cost between", value1, value2, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cta_cost not between", value1, value2, "ctaCost");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgIsNull() {
            addCriterion("cta_costimg is null");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgIsNotNull() {
            addCriterion("cta_costimg is not null");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgEqualTo(String value) {
            addCriterion("cta_costimg =", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgNotEqualTo(String value) {
            addCriterion("cta_costimg <>", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgGreaterThan(String value) {
            addCriterion("cta_costimg >", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgGreaterThanOrEqualTo(String value) {
            addCriterion("cta_costimg >=", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgLessThan(String value) {
            addCriterion("cta_costimg <", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgLessThanOrEqualTo(String value) {
            addCriterion("cta_costimg <=", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgLike(String value) {
            addCriterion("cta_costimg like", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgNotLike(String value) {
            addCriterion("cta_costimg not like", value, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgIn(List<String> values) {
            addCriterion("cta_costimg in", values, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgNotIn(List<String> values) {
            addCriterion("cta_costimg not in", values, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgBetween(String value1, String value2) {
            addCriterion("cta_costimg between", value1, value2, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaCostimgNotBetween(String value1, String value2) {
            addCriterion("cta_costimg not between", value1, value2, "ctaCostimg");
            return (Criteria) this;
        }

        public Criteria andCtaItemidIsNull() {
            addCriterion("cta_itemid is null");
            return (Criteria) this;
        }

        public Criteria andCtaItemidIsNotNull() {
            addCriterion("cta_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andCtaItemidEqualTo(Integer value) {
            addCriterion("cta_itemid =", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidNotEqualTo(Integer value) {
            addCriterion("cta_itemid <>", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidGreaterThan(Integer value) {
            addCriterion("cta_itemid >", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cta_itemid >=", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidLessThan(Integer value) {
            addCriterion("cta_itemid <", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidLessThanOrEqualTo(Integer value) {
            addCriterion("cta_itemid <=", value, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidIn(List<Integer> values) {
            addCriterion("cta_itemid in", values, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidNotIn(List<Integer> values) {
            addCriterion("cta_itemid not in", values, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidBetween(Integer value1, Integer value2) {
            addCriterion("cta_itemid between", value1, value2, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("cta_itemid not between", value1, value2, "ctaItemid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidIsNull() {
            addCriterion("cta_storeid is null");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidIsNotNull() {
            addCriterion("cta_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidEqualTo(Integer value) {
            addCriterion("cta_storeid =", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidNotEqualTo(Integer value) {
            addCriterion("cta_storeid <>", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidGreaterThan(Integer value) {
            addCriterion("cta_storeid >", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cta_storeid >=", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidLessThan(Integer value) {
            addCriterion("cta_storeid <", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("cta_storeid <=", value, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidIn(List<Integer> values) {
            addCriterion("cta_storeid in", values, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidNotIn(List<Integer> values) {
            addCriterion("cta_storeid not in", values, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidBetween(Integer value1, Integer value2) {
            addCriterion("cta_storeid between", value1, value2, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("cta_storeid not between", value1, value2, "ctaStoreid");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameIsNull() {
            addCriterion("cta_storename is null");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameIsNotNull() {
            addCriterion("cta_storename is not null");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameEqualTo(String value) {
            addCriterion("cta_storename =", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameNotEqualTo(String value) {
            addCriterion("cta_storename <>", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameGreaterThan(String value) {
            addCriterion("cta_storename >", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("cta_storename >=", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameLessThan(String value) {
            addCriterion("cta_storename <", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameLessThanOrEqualTo(String value) {
            addCriterion("cta_storename <=", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameLike(String value) {
            addCriterion("cta_storename like", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameNotLike(String value) {
            addCriterion("cta_storename not like", value, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameIn(List<String> values) {
            addCriterion("cta_storename in", values, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameNotIn(List<String> values) {
            addCriterion("cta_storename not in", values, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameBetween(String value1, String value2) {
            addCriterion("cta_storename between", value1, value2, "ctaStorename");
            return (Criteria) this;
        }

        public Criteria andCtaStorenameNotBetween(String value1, String value2) {
            addCriterion("cta_storename not between", value1, value2, "ctaStorename");
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