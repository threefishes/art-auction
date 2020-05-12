package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ShowOrdersTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowOrdersTemplateExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageIsNull() {
            addCriterion("back_ground_image is null");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageIsNotNull() {
            addCriterion("back_ground_image is not null");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageEqualTo(String value) {
            addCriterion("back_ground_image =", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageNotEqualTo(String value) {
            addCriterion("back_ground_image <>", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageGreaterThan(String value) {
            addCriterion("back_ground_image >", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageGreaterThanOrEqualTo(String value) {
            addCriterion("back_ground_image >=", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageLessThan(String value) {
            addCriterion("back_ground_image <", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageLessThanOrEqualTo(String value) {
            addCriterion("back_ground_image <=", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageLike(String value) {
            addCriterion("back_ground_image like", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageNotLike(String value) {
            addCriterion("back_ground_image not like", value, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageIn(List<String> values) {
            addCriterion("back_ground_image in", values, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageNotIn(List<String> values) {
            addCriterion("back_ground_image not in", values, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageBetween(String value1, String value2) {
            addCriterion("back_ground_image between", value1, value2, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andBackGroundImageNotBetween(String value1, String value2) {
            addCriterion("back_ground_image not between", value1, value2, "backGroundImage");
            return (Criteria) this;
        }

        public Criteria andFontColorIsNull() {
            addCriterion("font_color is null");
            return (Criteria) this;
        }

        public Criteria andFontColorIsNotNull() {
            addCriterion("font_color is not null");
            return (Criteria) this;
        }

        public Criteria andFontColorEqualTo(String value) {
            addCriterion("font_color =", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotEqualTo(String value) {
            addCriterion("font_color <>", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorGreaterThan(String value) {
            addCriterion("font_color >", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorGreaterThanOrEqualTo(String value) {
            addCriterion("font_color >=", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLessThan(String value) {
            addCriterion("font_color <", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLessThanOrEqualTo(String value) {
            addCriterion("font_color <=", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLike(String value) {
            addCriterion("font_color like", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotLike(String value) {
            addCriterion("font_color not like", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorIn(List<String> values) {
            addCriterion("font_color in", values, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotIn(List<String> values) {
            addCriterion("font_color not in", values, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorBetween(String value1, String value2) {
            addCriterion("font_color between", value1, value2, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotBetween(String value1, String value2) {
            addCriterion("font_color not between", value1, value2, "fontColor");
            return (Criteria) this;
        }

        public Criteria andShowImageIsNull() {
            addCriterion("show_image is null");
            return (Criteria) this;
        }

        public Criteria andShowImageIsNotNull() {
            addCriterion("show_image is not null");
            return (Criteria) this;
        }

        public Criteria andShowImageEqualTo(String value) {
            addCriterion("show_image =", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageNotEqualTo(String value) {
            addCriterion("show_image <>", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageGreaterThan(String value) {
            addCriterion("show_image >", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageGreaterThanOrEqualTo(String value) {
            addCriterion("show_image >=", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageLessThan(String value) {
            addCriterion("show_image <", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageLessThanOrEqualTo(String value) {
            addCriterion("show_image <=", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageLike(String value) {
            addCriterion("show_image like", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageNotLike(String value) {
            addCriterion("show_image not like", value, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageIn(List<String> values) {
            addCriterion("show_image in", values, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageNotIn(List<String> values) {
            addCriterion("show_image not in", values, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageBetween(String value1, String value2) {
            addCriterion("show_image between", value1, value2, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowImageNotBetween(String value1, String value2) {
            addCriterion("show_image not between", value1, value2, "showImage");
            return (Criteria) this;
        }

        public Criteria andShowTextIsNull() {
            addCriterion("show_text is null");
            return (Criteria) this;
        }

        public Criteria andShowTextIsNotNull() {
            addCriterion("show_text is not null");
            return (Criteria) this;
        }

        public Criteria andShowTextEqualTo(String value) {
            addCriterion("show_text =", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextNotEqualTo(String value) {
            addCriterion("show_text <>", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextGreaterThan(String value) {
            addCriterion("show_text >", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextGreaterThanOrEqualTo(String value) {
            addCriterion("show_text >=", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextLessThan(String value) {
            addCriterion("show_text <", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextLessThanOrEqualTo(String value) {
            addCriterion("show_text <=", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextLike(String value) {
            addCriterion("show_text like", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextNotLike(String value) {
            addCriterion("show_text not like", value, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextIn(List<String> values) {
            addCriterion("show_text in", values, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextNotIn(List<String> values) {
            addCriterion("show_text not in", values, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextBetween(String value1, String value2) {
            addCriterion("show_text between", value1, value2, "showText");
            return (Criteria) this;
        }

        public Criteria andShowTextNotBetween(String value1, String value2) {
            addCriterion("show_text not between", value1, value2, "showText");
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