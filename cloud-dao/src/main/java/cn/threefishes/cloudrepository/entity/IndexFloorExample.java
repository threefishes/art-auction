package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexFloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexFloorExample() {
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

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameIsNull() {
            addCriterion("floor_color_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameIsNotNull() {
            addCriterion("floor_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameEqualTo(String value) {
            addCriterion("floor_color_name =", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameNotEqualTo(String value) {
            addCriterion("floor_color_name <>", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameGreaterThan(String value) {
            addCriterion("floor_color_name >", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_color_name >=", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameLessThan(String value) {
            addCriterion("floor_color_name <", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_color_name <=", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameLike(String value) {
            addCriterion("floor_color_name like", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameNotLike(String value) {
            addCriterion("floor_color_name not like", value, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameIn(List<String> values) {
            addCriterion("floor_color_name in", values, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameNotIn(List<String> values) {
            addCriterion("floor_color_name not in", values, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameBetween(String value1, String value2) {
            addCriterion("floor_color_name between", value1, value2, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorColorNameNotBetween(String value1, String value2) {
            addCriterion("floor_color_name not between", value1, value2, "floorColorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_name not between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageIsNull() {
            addCriterion("floor_nav_image is null");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageIsNotNull() {
            addCriterion("floor_nav_image is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageEqualTo(String value) {
            addCriterion("floor_nav_image =", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageNotEqualTo(String value) {
            addCriterion("floor_nav_image <>", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageGreaterThan(String value) {
            addCriterion("floor_nav_image >", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageGreaterThanOrEqualTo(String value) {
            addCriterion("floor_nav_image >=", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageLessThan(String value) {
            addCriterion("floor_nav_image <", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageLessThanOrEqualTo(String value) {
            addCriterion("floor_nav_image <=", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageLike(String value) {
            addCriterion("floor_nav_image like", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageNotLike(String value) {
            addCriterion("floor_nav_image not like", value, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageIn(List<String> values) {
            addCriterion("floor_nav_image in", values, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageNotIn(List<String> values) {
            addCriterion("floor_nav_image not in", values, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageBetween(String value1, String value2) {
            addCriterion("floor_nav_image between", value1, value2, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavImageNotBetween(String value1, String value2) {
            addCriterion("floor_nav_image not between", value1, value2, "floorNavImage");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextIsNull() {
            addCriterion("floor_nav_text is null");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextIsNotNull() {
            addCriterion("floor_nav_text is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextEqualTo(String value) {
            addCriterion("floor_nav_text =", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextNotEqualTo(String value) {
            addCriterion("floor_nav_text <>", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextGreaterThan(String value) {
            addCriterion("floor_nav_text >", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextGreaterThanOrEqualTo(String value) {
            addCriterion("floor_nav_text >=", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextLessThan(String value) {
            addCriterion("floor_nav_text <", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextLessThanOrEqualTo(String value) {
            addCriterion("floor_nav_text <=", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextLike(String value) {
            addCriterion("floor_nav_text like", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextNotLike(String value) {
            addCriterion("floor_nav_text not like", value, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextIn(List<String> values) {
            addCriterion("floor_nav_text in", values, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextNotIn(List<String> values) {
            addCriterion("floor_nav_text not in", values, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextBetween(String value1, String value2) {
            addCriterion("floor_nav_text between", value1, value2, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorNavTextNotBetween(String value1, String value2) {
            addCriterion("floor_nav_text not between", value1, value2, "floorNavText");
            return (Criteria) this;
        }

        public Criteria andFloorShowIsNull() {
            addCriterion("floor_show is null");
            return (Criteria) this;
        }

        public Criteria andFloorShowIsNotNull() {
            addCriterion("floor_show is not null");
            return (Criteria) this;
        }

        public Criteria andFloorShowEqualTo(Integer value) {
            addCriterion("floor_show =", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowNotEqualTo(Integer value) {
            addCriterion("floor_show <>", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowGreaterThan(Integer value) {
            addCriterion("floor_show >", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_show >=", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowLessThan(Integer value) {
            addCriterion("floor_show <", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowLessThanOrEqualTo(Integer value) {
            addCriterion("floor_show <=", value, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowIn(List<Integer> values) {
            addCriterion("floor_show in", values, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowNotIn(List<Integer> values) {
            addCriterion("floor_show not in", values, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowBetween(Integer value1, Integer value2) {
            addCriterion("floor_show between", value1, value2, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorShowNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_show not between", value1, value2, "floorShow");
            return (Criteria) this;
        }

        public Criteria andFloorSortIsNull() {
            addCriterion("floor_sort is null");
            return (Criteria) this;
        }

        public Criteria andFloorSortIsNotNull() {
            addCriterion("floor_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFloorSortEqualTo(Integer value) {
            addCriterion("floor_sort =", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortNotEqualTo(Integer value) {
            addCriterion("floor_sort <>", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortGreaterThan(Integer value) {
            addCriterion("floor_sort >", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_sort >=", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortLessThan(Integer value) {
            addCriterion("floor_sort <", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortLessThanOrEqualTo(Integer value) {
            addCriterion("floor_sort <=", value, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortIn(List<Integer> values) {
            addCriterion("floor_sort in", values, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortNotIn(List<Integer> values) {
            addCriterion("floor_sort not in", values, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortBetween(Integer value1, Integer value2) {
            addCriterion("floor_sort between", value1, value2, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorSortNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_sort not between", value1, value2, "floorSort");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameIsNull() {
            addCriterion("floor_template_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameIsNotNull() {
            addCriterion("floor_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameEqualTo(String value) {
            addCriterion("floor_template_name =", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameNotEqualTo(String value) {
            addCriterion("floor_template_name <>", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameGreaterThan(String value) {
            addCriterion("floor_template_name >", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_template_name >=", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameLessThan(String value) {
            addCriterion("floor_template_name <", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("floor_template_name <=", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameLike(String value) {
            addCriterion("floor_template_name like", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameNotLike(String value) {
            addCriterion("floor_template_name not like", value, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameIn(List<String> values) {
            addCriterion("floor_template_name in", values, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameNotIn(List<String> values) {
            addCriterion("floor_template_name not in", values, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameBetween(String value1, String value2) {
            addCriterion("floor_template_name between", value1, value2, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateNameNotBetween(String value1, String value2) {
            addCriterion("floor_template_name not between", value1, value2, "floorTemplateName");
            return (Criteria) this;
        }

        public Criteria andFloorTypeIsNull() {
            addCriterion("floor_type is null");
            return (Criteria) this;
        }

        public Criteria andFloorTypeIsNotNull() {
            addCriterion("floor_type is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTypeEqualTo(String value) {
            addCriterion("floor_type =", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeNotEqualTo(String value) {
            addCriterion("floor_type <>", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeGreaterThan(String value) {
            addCriterion("floor_type >", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("floor_type >=", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeLessThan(String value) {
            addCriterion("floor_type <", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeLessThanOrEqualTo(String value) {
            addCriterion("floor_type <=", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeLike(String value) {
            addCriterion("floor_type like", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeNotLike(String value) {
            addCriterion("floor_type not like", value, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeIn(List<String> values) {
            addCriterion("floor_type in", values, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeNotIn(List<String> values) {
            addCriterion("floor_type not in", values, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeBetween(String value1, String value2) {
            addCriterion("floor_type between", value1, value2, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorTypeNotBetween(String value1, String value2) {
            addCriterion("floor_type not between", value1, value2, "floorType");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeIsNull() {
            addCriterion("floor_update_time is null");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeIsNotNull() {
            addCriterion("floor_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeEqualTo(Date value) {
            addCriterion("floor_update_time =", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeNotEqualTo(Date value) {
            addCriterion("floor_update_time <>", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeGreaterThan(Date value) {
            addCriterion("floor_update_time >", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("floor_update_time >=", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeLessThan(Date value) {
            addCriterion("floor_update_time <", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("floor_update_time <=", value, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeIn(List<Date> values) {
            addCriterion("floor_update_time in", values, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeNotIn(List<Date> values) {
            addCriterion("floor_update_time not in", values, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("floor_update_time between", value1, value2, "floorUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFloorUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("floor_update_time not between", value1, value2, "floorUpdateTime");
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