package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class MessageTemplateSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageTemplateSystemExample() {
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

        public Criteria andTemplateSystemIdIsNull() {
            addCriterion("template_system_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdIsNotNull() {
            addCriterion("template_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdEqualTo(Integer value) {
            addCriterion("template_system_id =", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdNotEqualTo(Integer value) {
            addCriterion("template_system_id <>", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdGreaterThan(Integer value) {
            addCriterion("template_system_id >", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_system_id >=", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdLessThan(Integer value) {
            addCriterion("template_system_id <", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_system_id <=", value, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdIn(List<Integer> values) {
            addCriterion("template_system_id in", values, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdNotIn(List<Integer> values) {
            addCriterion("template_system_id not in", values, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("template_system_id between", value1, value2, "templateSystemId");
            return (Criteria) this;
        }

        public Criteria andTemplateSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_system_id not between", value1, value2, "templateSystemId");
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

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Integer value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Integer value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Integer value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Integer value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Integer> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Integer> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Integer value1, Integer value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andTplContentIsNull() {
            addCriterion("tpl_content is null");
            return (Criteria) this;
        }

        public Criteria andTplContentIsNotNull() {
            addCriterion("tpl_content is not null");
            return (Criteria) this;
        }

        public Criteria andTplContentEqualTo(String value) {
            addCriterion("tpl_content =", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotEqualTo(String value) {
            addCriterion("tpl_content <>", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentGreaterThan(String value) {
            addCriterion("tpl_content >", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_content >=", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLessThan(String value) {
            addCriterion("tpl_content <", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLessThanOrEqualTo(String value) {
            addCriterion("tpl_content <=", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentLike(String value) {
            addCriterion("tpl_content like", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotLike(String value) {
            addCriterion("tpl_content not like", value, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentIn(List<String> values) {
            addCriterion("tpl_content in", values, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotIn(List<String> values) {
            addCriterion("tpl_content not in", values, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentBetween(String value1, String value2) {
            addCriterion("tpl_content between", value1, value2, "tplContent");
            return (Criteria) this;
        }

        public Criteria andTplContentNotBetween(String value1, String value2) {
            addCriterion("tpl_content not between", value1, value2, "tplContent");
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

        public Criteria andTplTitleIsNull() {
            addCriterion("tpl_title is null");
            return (Criteria) this;
        }

        public Criteria andTplTitleIsNotNull() {
            addCriterion("tpl_title is not null");
            return (Criteria) this;
        }

        public Criteria andTplTitleEqualTo(String value) {
            addCriterion("tpl_title =", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleNotEqualTo(String value) {
            addCriterion("tpl_title <>", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleGreaterThan(String value) {
            addCriterion("tpl_title >", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_title >=", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleLessThan(String value) {
            addCriterion("tpl_title <", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleLessThanOrEqualTo(String value) {
            addCriterion("tpl_title <=", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleLike(String value) {
            addCriterion("tpl_title like", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleNotLike(String value) {
            addCriterion("tpl_title not like", value, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleIn(List<String> values) {
            addCriterion("tpl_title in", values, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleNotIn(List<String> values) {
            addCriterion("tpl_title not in", values, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleBetween(String value1, String value2) {
            addCriterion("tpl_title between", value1, value2, "tplTitle");
            return (Criteria) this;
        }

        public Criteria andTplTitleNotBetween(String value1, String value2) {
            addCriterion("tpl_title not between", value1, value2, "tplTitle");
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