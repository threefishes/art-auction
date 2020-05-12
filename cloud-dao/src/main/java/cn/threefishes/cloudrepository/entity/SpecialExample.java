package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialExample() {
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

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(Integer value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(Integer value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(Integer value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(Integer value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(Integer value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<Integer> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<Integer> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(Integer value1, Integer value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNull() {
            addCriterion("background_color is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNotNull() {
            addCriterion("background_color is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorEqualTo(String value) {
            addCriterion("background_color =", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotEqualTo(String value) {
            addCriterion("background_color <>", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThan(String value) {
            addCriterion("background_color >", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("background_color >=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThan(String value) {
            addCriterion("background_color <", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("background_color <=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLike(String value) {
            addCriterion("background_color like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotLike(String value) {
            addCriterion("background_color not like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIn(List<String> values) {
            addCriterion("background_color in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotIn(List<String> values) {
            addCriterion("background_color not in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorBetween(String value1, String value2) {
            addCriterion("background_color between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("background_color not between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIsNull() {
            addCriterion("background_image is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIsNotNull() {
            addCriterion("background_image is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageEqualTo(String value) {
            addCriterion("background_image =", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotEqualTo(String value) {
            addCriterion("background_image <>", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageGreaterThan(String value) {
            addCriterion("background_image >", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageGreaterThanOrEqualTo(String value) {
            addCriterion("background_image >=", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLessThan(String value) {
            addCriterion("background_image <", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLessThanOrEqualTo(String value) {
            addCriterion("background_image <=", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLike(String value) {
            addCriterion("background_image like", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotLike(String value) {
            addCriterion("background_image not like", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIn(List<String> values) {
            addCriterion("background_image in", values, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotIn(List<String> values) {
            addCriterion("background_image not in", values, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageBetween(String value1, String value2) {
            addCriterion("background_image between", value1, value2, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotBetween(String value1, String value2) {
            addCriterion("background_image not between", value1, value2, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatIsNull() {
            addCriterion("background_repeat is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatIsNotNull() {
            addCriterion("background_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatEqualTo(String value) {
            addCriterion("background_repeat =", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatNotEqualTo(String value) {
            addCriterion("background_repeat <>", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatGreaterThan(String value) {
            addCriterion("background_repeat >", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("background_repeat >=", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatLessThan(String value) {
            addCriterion("background_repeat <", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatLessThanOrEqualTo(String value) {
            addCriterion("background_repeat <=", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatLike(String value) {
            addCriterion("background_repeat like", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatNotLike(String value) {
            addCriterion("background_repeat not like", value, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatIn(List<String> values) {
            addCriterion("background_repeat in", values, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatNotIn(List<String> values) {
            addCriterion("background_repeat not in", values, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatBetween(String value1, String value2) {
            addCriterion("background_repeat between", value1, value2, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andBackgroundRepeatNotBetween(String value1, String value2) {
            addCriterion("background_repeat not between", value1, value2, "backgroundRepeat");
            return (Criteria) this;
        }

        public Criteria andMarginTopIsNull() {
            addCriterion("margin_top is null");
            return (Criteria) this;
        }

        public Criteria andMarginTopIsNotNull() {
            addCriterion("margin_top is not null");
            return (Criteria) this;
        }

        public Criteria andMarginTopEqualTo(Integer value) {
            addCriterion("margin_top =", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopNotEqualTo(Integer value) {
            addCriterion("margin_top <>", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopGreaterThan(Integer value) {
            addCriterion("margin_top >", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("margin_top >=", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopLessThan(Integer value) {
            addCriterion("margin_top <", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopLessThanOrEqualTo(Integer value) {
            addCriterion("margin_top <=", value, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopIn(List<Integer> values) {
            addCriterion("margin_top in", values, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopNotIn(List<Integer> values) {
            addCriterion("margin_top not in", values, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopBetween(Integer value1, Integer value2) {
            addCriterion("margin_top between", value1, value2, "marginTop");
            return (Criteria) this;
        }

        public Criteria andMarginTopNotBetween(Integer value1, Integer value2) {
            addCriterion("margin_top not between", value1, value2, "marginTop");
            return (Criteria) this;
        }

        public Criteria andSpecialImageIsNull() {
            addCriterion("special_image is null");
            return (Criteria) this;
        }

        public Criteria andSpecialImageIsNotNull() {
            addCriterion("special_image is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialImageEqualTo(String value) {
            addCriterion("special_image =", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageNotEqualTo(String value) {
            addCriterion("special_image <>", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageGreaterThan(String value) {
            addCriterion("special_image >", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageGreaterThanOrEqualTo(String value) {
            addCriterion("special_image >=", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageLessThan(String value) {
            addCriterion("special_image <", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageLessThanOrEqualTo(String value) {
            addCriterion("special_image <=", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageLike(String value) {
            addCriterion("special_image like", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageNotLike(String value) {
            addCriterion("special_image not like", value, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageIn(List<String> values) {
            addCriterion("special_image in", values, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageNotIn(List<String> values) {
            addCriterion("special_image not in", values, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageBetween(String value1, String value2) {
            addCriterion("special_image between", value1, value2, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialImageNotBetween(String value1, String value2) {
            addCriterion("special_image not between", value1, value2, "specialImage");
            return (Criteria) this;
        }

        public Criteria andSpecialStateIsNull() {
            addCriterion("special_state is null");
            return (Criteria) this;
        }

        public Criteria andSpecialStateIsNotNull() {
            addCriterion("special_state is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialStateEqualTo(Integer value) {
            addCriterion("special_state =", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateNotEqualTo(Integer value) {
            addCriterion("special_state <>", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateGreaterThan(Integer value) {
            addCriterion("special_state >", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_state >=", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateLessThan(Integer value) {
            addCriterion("special_state <", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateLessThanOrEqualTo(Integer value) {
            addCriterion("special_state <=", value, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateIn(List<Integer> values) {
            addCriterion("special_state in", values, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateNotIn(List<Integer> values) {
            addCriterion("special_state not in", values, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateBetween(Integer value1, Integer value2) {
            addCriterion("special_state between", value1, value2, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialStateNotBetween(Integer value1, Integer value2) {
            addCriterion("special_state not between", value1, value2, "specialState");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleIsNull() {
            addCriterion("special_title is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleIsNotNull() {
            addCriterion("special_title is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleEqualTo(String value) {
            addCriterion("special_title =", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleNotEqualTo(String value) {
            addCriterion("special_title <>", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleGreaterThan(String value) {
            addCriterion("special_title >", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleGreaterThanOrEqualTo(String value) {
            addCriterion("special_title >=", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleLessThan(String value) {
            addCriterion("special_title <", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleLessThanOrEqualTo(String value) {
            addCriterion("special_title <=", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleLike(String value) {
            addCriterion("special_title like", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleNotLike(String value) {
            addCriterion("special_title not like", value, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleIn(List<String> values) {
            addCriterion("special_title in", values, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleNotIn(List<String> values) {
            addCriterion("special_title not in", values, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleBetween(String value1, String value2) {
            addCriterion("special_title between", value1, value2, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andSpecialTitleNotBetween(String value1, String value2) {
            addCriterion("special_title not between", value1, value2, "specialTitle");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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