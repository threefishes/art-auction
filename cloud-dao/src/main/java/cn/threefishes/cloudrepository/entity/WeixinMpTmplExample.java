package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinMpTmplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinMpTmplExample() {
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

        public Criteria andTmplIdIsNull() {
            addCriterion("tmpl_id is null");
            return (Criteria) this;
        }

        public Criteria andTmplIdIsNotNull() {
            addCriterion("tmpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmplIdEqualTo(Integer value) {
            addCriterion("tmpl_id =", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotEqualTo(Integer value) {
            addCriterion("tmpl_id <>", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdGreaterThan(Integer value) {
            addCriterion("tmpl_id >", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmpl_id >=", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdLessThan(Integer value) {
            addCriterion("tmpl_id <", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdLessThanOrEqualTo(Integer value) {
            addCriterion("tmpl_id <=", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdIn(List<Integer> values) {
            addCriterion("tmpl_id in", values, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotIn(List<Integer> values) {
            addCriterion("tmpl_id not in", values, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdBetween(Integer value1, Integer value2) {
            addCriterion("tmpl_id between", value1, value2, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tmpl_id not between", value1, value2, "tmplId");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryIsNull() {
            addCriterion("mp_deputy_industry is null");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryIsNotNull() {
            addCriterion("mp_deputy_industry is not null");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryEqualTo(String value) {
            addCriterion("mp_deputy_industry =", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryNotEqualTo(String value) {
            addCriterion("mp_deputy_industry <>", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryGreaterThan(String value) {
            addCriterion("mp_deputy_industry >", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("mp_deputy_industry >=", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryLessThan(String value) {
            addCriterion("mp_deputy_industry <", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryLessThanOrEqualTo(String value) {
            addCriterion("mp_deputy_industry <=", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryLike(String value) {
            addCriterion("mp_deputy_industry like", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryNotLike(String value) {
            addCriterion("mp_deputy_industry not like", value, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryIn(List<String> values) {
            addCriterion("mp_deputy_industry in", values, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryNotIn(List<String> values) {
            addCriterion("mp_deputy_industry not in", values, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryBetween(String value1, String value2) {
            addCriterion("mp_deputy_industry between", value1, value2, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpDeputyIndustryNotBetween(String value1, String value2) {
            addCriterion("mp_deputy_industry not between", value1, value2, "mpDeputyIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryIsNull() {
            addCriterion("mp_primary_industry is null");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryIsNotNull() {
            addCriterion("mp_primary_industry is not null");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryEqualTo(String value) {
            addCriterion("mp_primary_industry =", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryNotEqualTo(String value) {
            addCriterion("mp_primary_industry <>", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryGreaterThan(String value) {
            addCriterion("mp_primary_industry >", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("mp_primary_industry >=", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryLessThan(String value) {
            addCriterion("mp_primary_industry <", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryLessThanOrEqualTo(String value) {
            addCriterion("mp_primary_industry <=", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryLike(String value) {
            addCriterion("mp_primary_industry like", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryNotLike(String value) {
            addCriterion("mp_primary_industry not like", value, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryIn(List<String> values) {
            addCriterion("mp_primary_industry in", values, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryNotIn(List<String> values) {
            addCriterion("mp_primary_industry not in", values, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryBetween(String value1, String value2) {
            addCriterion("mp_primary_industry between", value1, value2, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpPrimaryIndustryNotBetween(String value1, String value2) {
            addCriterion("mp_primary_industry not between", value1, value2, "mpPrimaryIndustry");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdIsNull() {
            addCriterion("mp_template_id is null");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdIsNotNull() {
            addCriterion("mp_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdEqualTo(String value) {
            addCriterion("mp_template_id =", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdNotEqualTo(String value) {
            addCriterion("mp_template_id <>", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdGreaterThan(String value) {
            addCriterion("mp_template_id >", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("mp_template_id >=", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdLessThan(String value) {
            addCriterion("mp_template_id <", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("mp_template_id <=", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdLike(String value) {
            addCriterion("mp_template_id like", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdNotLike(String value) {
            addCriterion("mp_template_id not like", value, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdIn(List<String> values) {
            addCriterion("mp_template_id in", values, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdNotIn(List<String> values) {
            addCriterion("mp_template_id not in", values, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdBetween(String value1, String value2) {
            addCriterion("mp_template_id between", value1, value2, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateIdNotBetween(String value1, String value2) {
            addCriterion("mp_template_id not between", value1, value2, "mpTemplateId");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleIsNull() {
            addCriterion("mp_template_title is null");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleIsNotNull() {
            addCriterion("mp_template_title is not null");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleEqualTo(String value) {
            addCriterion("mp_template_title =", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleNotEqualTo(String value) {
            addCriterion("mp_template_title <>", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleGreaterThan(String value) {
            addCriterion("mp_template_title >", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mp_template_title >=", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleLessThan(String value) {
            addCriterion("mp_template_title <", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleLessThanOrEqualTo(String value) {
            addCriterion("mp_template_title <=", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleLike(String value) {
            addCriterion("mp_template_title like", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleNotLike(String value) {
            addCriterion("mp_template_title not like", value, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleIn(List<String> values) {
            addCriterion("mp_template_title in", values, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleNotIn(List<String> values) {
            addCriterion("mp_template_title not in", values, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleBetween(String value1, String value2) {
            addCriterion("mp_template_title between", value1, value2, "mpTemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMpTemplateTitleNotBetween(String value1, String value2) {
            addCriterion("mp_template_title not between", value1, value2, "mpTemplateTitle");
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