package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelModuleExample() {
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

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleShowIsNull() {
            addCriterion("module_show is null");
            return (Criteria) this;
        }

        public Criteria andModuleShowIsNotNull() {
            addCriterion("module_show is not null");
            return (Criteria) this;
        }

        public Criteria andModuleShowEqualTo(Integer value) {
            addCriterion("module_show =", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowNotEqualTo(Integer value) {
            addCriterion("module_show <>", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowGreaterThan(Integer value) {
            addCriterion("module_show >", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_show >=", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowLessThan(Integer value) {
            addCriterion("module_show <", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowLessThanOrEqualTo(Integer value) {
            addCriterion("module_show <=", value, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowIn(List<Integer> values) {
            addCriterion("module_show in", values, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowNotIn(List<Integer> values) {
            addCriterion("module_show not in", values, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowBetween(Integer value1, Integer value2) {
            addCriterion("module_show between", value1, value2, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleShowNotBetween(Integer value1, Integer value2) {
            addCriterion("module_show not between", value1, value2, "moduleShow");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameIsNull() {
            addCriterion("module_template_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameIsNotNull() {
            addCriterion("module_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameEqualTo(String value) {
            addCriterion("module_template_name =", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameNotEqualTo(String value) {
            addCriterion("module_template_name <>", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameGreaterThan(String value) {
            addCriterion("module_template_name >", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_template_name >=", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameLessThan(String value) {
            addCriterion("module_template_name <", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("module_template_name <=", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameLike(String value) {
            addCriterion("module_template_name like", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameNotLike(String value) {
            addCriterion("module_template_name not like", value, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameIn(List<String> values) {
            addCriterion("module_template_name in", values, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameNotIn(List<String> values) {
            addCriterion("module_template_name not in", values, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameBetween(String value1, String value2) {
            addCriterion("module_template_name between", value1, value2, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTemplateNameNotBetween(String value1, String value2) {
            addCriterion("module_template_name not between", value1, value2, "moduleTemplateName");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNull() {
            addCriterion("module_type is null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNotNull() {
            addCriterion("module_type is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("module_type =", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("module_type <>", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("module_type >", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("module_type >=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("module_type <", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("module_type <=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLike(String value) {
            addCriterion("module_type like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("module_type not like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("module_type in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("module_type not in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("module_type between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("module_type not between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeIsNull() {
            addCriterion("module_update_time is null");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeIsNotNull() {
            addCriterion("module_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeEqualTo(Date value) {
            addCriterion("module_update_time =", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeNotEqualTo(Date value) {
            addCriterion("module_update_time <>", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeGreaterThan(Date value) {
            addCriterion("module_update_time >", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("module_update_time >=", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeLessThan(Date value) {
            addCriterion("module_update_time <", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("module_update_time <=", value, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeIn(List<Date> values) {
            addCriterion("module_update_time in", values, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeNotIn(List<Date> values) {
            addCriterion("module_update_time not in", values, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("module_update_time between", value1, value2, "moduleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andModuleUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("module_update_time not between", value1, value2, "moduleUpdateTime");
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