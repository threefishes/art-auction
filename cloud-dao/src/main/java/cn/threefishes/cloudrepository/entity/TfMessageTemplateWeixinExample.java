package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class TfMessageTemplateWeixinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfMessageTemplateWeixinExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andTplCodeIsNull() {
            addCriterion("tpl_code is null");
            return (Criteria) this;
        }

        public Criteria andTplCodeIsNotNull() {
            addCriterion("tpl_code is not null");
            return (Criteria) this;
        }

        public Criteria andTplCodeEqualTo(String value) {
            addCriterion("tpl_code =", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotEqualTo(String value) {
            addCriterion("tpl_code <>", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeGreaterThan(String value) {
            addCriterion("tpl_code >", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_code >=", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLessThan(String value) {
            addCriterion("tpl_code <", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLessThanOrEqualTo(String value) {
            addCriterion("tpl_code <=", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLike(String value) {
            addCriterion("tpl_code like", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotLike(String value) {
            addCriterion("tpl_code not like", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeIn(List<String> values) {
            addCriterion("tpl_code in", values, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotIn(List<String> values) {
            addCriterion("tpl_code not in", values, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeBetween(String value1, String value2) {
            addCriterion("tpl_code between", value1, value2, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotBetween(String value1, String value2) {
            addCriterion("tpl_code not between", value1, value2, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNull() {
            addCriterion("tpl_name is null");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNotNull() {
            addCriterion("tpl_name is not null");
            return (Criteria) this;
        }

        public Criteria andTplNameEqualTo(String value) {
            addCriterion("tpl_name =", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotEqualTo(String value) {
            addCriterion("tpl_name <>", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThan(String value) {
            addCriterion("tpl_name >", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_name >=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThan(String value) {
            addCriterion("tpl_name <", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThanOrEqualTo(String value) {
            addCriterion("tpl_name <=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLike(String value) {
            addCriterion("tpl_name like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotLike(String value) {
            addCriterion("tpl_name not like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameIn(List<String> values) {
            addCriterion("tpl_name in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotIn(List<String> values) {
            addCriterion("tpl_name not in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameBetween(String value1, String value2) {
            addCriterion("tpl_name between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotBetween(String value1, String value2) {
            addCriterion("tpl_name not between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdIsNull() {
            addCriterion("weixin_template_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdIsNotNull() {
            addCriterion("weixin_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdEqualTo(String value) {
            addCriterion("weixin_template_id =", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdNotEqualTo(String value) {
            addCriterion("weixin_template_id <>", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdGreaterThan(String value) {
            addCriterion("weixin_template_id >", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_template_id >=", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdLessThan(String value) {
            addCriterion("weixin_template_id <", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_template_id <=", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdLike(String value) {
            addCriterion("weixin_template_id like", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdNotLike(String value) {
            addCriterion("weixin_template_id not like", value, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdIn(List<String> values) {
            addCriterion("weixin_template_id in", values, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdNotIn(List<String> values) {
            addCriterion("weixin_template_id not in", values, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdBetween(String value1, String value2) {
            addCriterion("weixin_template_id between", value1, value2, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateIdNotBetween(String value1, String value2) {
            addCriterion("weixin_template_id not between", value1, value2, "weixinTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdIsNull() {
            addCriterion("owner_template_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdIsNotNull() {
            addCriterion("owner_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdEqualTo(String value) {
            addCriterion("owner_template_id =", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdNotEqualTo(String value) {
            addCriterion("owner_template_id <>", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdGreaterThan(String value) {
            addCriterion("owner_template_id >", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("owner_template_id >=", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdLessThan(String value) {
            addCriterion("owner_template_id <", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("owner_template_id <=", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdLike(String value) {
            addCriterion("owner_template_id like", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdNotLike(String value) {
            addCriterion("owner_template_id not like", value, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdIn(List<String> values) {
            addCriterion("owner_template_id in", values, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdNotIn(List<String> values) {
            addCriterion("owner_template_id not in", values, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdBetween(String value1, String value2) {
            addCriterion("owner_template_id between", value1, value2, "ownerTemplateId");
            return (Criteria) this;
        }

        public Criteria andOwnerTemplateIdNotBetween(String value1, String value2) {
            addCriterion("owner_template_id not between", value1, value2, "ownerTemplateId");
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