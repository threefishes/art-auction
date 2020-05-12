package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThemeExample() {
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

        public Criteria andThemeIdIsNull() {
            addCriterion("theme_id is null");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNotNull() {
            addCriterion("theme_id is not null");
            return (Criteria) this;
        }

        public Criteria andThemeIdEqualTo(Integer value) {
            addCriterion("theme_id =", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotEqualTo(Integer value) {
            addCriterion("theme_id <>", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThan(Integer value) {
            addCriterion("theme_id >", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("theme_id >=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThan(Integer value) {
            addCriterion("theme_id <", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("theme_id <=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdIn(List<Integer> values) {
            addCriterion("theme_id in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotIn(List<Integer> values) {
            addCriterion("theme_id not in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdBetween(Integer value1, Integer value2) {
            addCriterion("theme_id between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("theme_id not between", value1, value2, "themeId");
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

        public Criteria andEnrollEndTimeIsNull() {
            addCriterion("enroll_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeIsNotNull() {
            addCriterion("enroll_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeEqualTo(Date value) {
            addCriterion("enroll_end_time =", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeNotEqualTo(Date value) {
            addCriterion("enroll_end_time <>", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeGreaterThan(Date value) {
            addCriterion("enroll_end_time >", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enroll_end_time >=", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeLessThan(Date value) {
            addCriterion("enroll_end_time <", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("enroll_end_time <=", value, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeIn(List<Date> values) {
            addCriterion("enroll_end_time in", values, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeNotIn(List<Date> values) {
            addCriterion("enroll_end_time not in", values, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeBetween(Date value1, Date value2) {
            addCriterion("enroll_end_time between", value1, value2, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("enroll_end_time not between", value1, value2, "enrollEndTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeIsNull() {
            addCriterion("enroll_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeIsNotNull() {
            addCriterion("enroll_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeEqualTo(Date value) {
            addCriterion("enroll_start_time =", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeNotEqualTo(Date value) {
            addCriterion("enroll_start_time <>", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeGreaterThan(Date value) {
            addCriterion("enroll_start_time >", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enroll_start_time >=", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeLessThan(Date value) {
            addCriterion("enroll_start_time <", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("enroll_start_time <=", value, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeIn(List<Date> values) {
            addCriterion("enroll_start_time in", values, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeNotIn(List<Date> values) {
            addCriterion("enroll_start_time not in", values, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeBetween(Date value1, Date value2) {
            addCriterion("enroll_start_time between", value1, value2, "enrollStartTime");
            return (Criteria) this;
        }

        public Criteria andEnrollStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("enroll_start_time not between", value1, value2, "enrollStartTime");
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

        public Criteria andShowEndTimeIsNull() {
            addCriterion("show_end_time is null");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeIsNotNull() {
            addCriterion("show_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeEqualTo(Date value) {
            addCriterion("show_end_time =", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotEqualTo(Date value) {
            addCriterion("show_end_time <>", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeGreaterThan(Date value) {
            addCriterion("show_end_time >", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("show_end_time >=", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeLessThan(Date value) {
            addCriterion("show_end_time <", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("show_end_time <=", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeIn(List<Date> values) {
            addCriterion("show_end_time in", values, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotIn(List<Date> values) {
            addCriterion("show_end_time not in", values, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeBetween(Date value1, Date value2) {
            addCriterion("show_end_time between", value1, value2, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("show_end_time not between", value1, value2, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIsNull() {
            addCriterion("show_start_time is null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIsNotNull() {
            addCriterion("show_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeEqualTo(Date value) {
            addCriterion("show_start_time =", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotEqualTo(Date value) {
            addCriterion("show_start_time <>", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThan(Date value) {
            addCriterion("show_start_time >", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("show_start_time >=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThan(Date value) {
            addCriterion("show_start_time <", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("show_start_time <=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIn(List<Date> values) {
            addCriterion("show_start_time in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotIn(List<Date> values) {
            addCriterion("show_start_time not in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeBetween(Date value1, Date value2) {
            addCriterion("show_start_time between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("show_start_time not between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeIsNull() {
            addCriterion("theme_describe is null");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeIsNotNull() {
            addCriterion("theme_describe is not null");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeEqualTo(String value) {
            addCriterion("theme_describe =", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeNotEqualTo(String value) {
            addCriterion("theme_describe <>", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeGreaterThan(String value) {
            addCriterion("theme_describe >", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("theme_describe >=", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeLessThan(String value) {
            addCriterion("theme_describe <", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeLessThanOrEqualTo(String value) {
            addCriterion("theme_describe <=", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeLike(String value) {
            addCriterion("theme_describe like", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeNotLike(String value) {
            addCriterion("theme_describe not like", value, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeIn(List<String> values) {
            addCriterion("theme_describe in", values, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeNotIn(List<String> values) {
            addCriterion("theme_describe not in", values, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeBetween(String value1, String value2) {
            addCriterion("theme_describe between", value1, value2, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeDescribeNotBetween(String value1, String value2) {
            addCriterion("theme_describe not between", value1, value2, "themeDescribe");
            return (Criteria) this;
        }

        public Criteria andThemeImageIsNull() {
            addCriterion("theme_image is null");
            return (Criteria) this;
        }

        public Criteria andThemeImageIsNotNull() {
            addCriterion("theme_image is not null");
            return (Criteria) this;
        }

        public Criteria andThemeImageEqualTo(String value) {
            addCriterion("theme_image =", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageNotEqualTo(String value) {
            addCriterion("theme_image <>", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageGreaterThan(String value) {
            addCriterion("theme_image >", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageGreaterThanOrEqualTo(String value) {
            addCriterion("theme_image >=", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageLessThan(String value) {
            addCriterion("theme_image <", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageLessThanOrEqualTo(String value) {
            addCriterion("theme_image <=", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageLike(String value) {
            addCriterion("theme_image like", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageNotLike(String value) {
            addCriterion("theme_image not like", value, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageIn(List<String> values) {
            addCriterion("theme_image in", values, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageNotIn(List<String> values) {
            addCriterion("theme_image not in", values, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageBetween(String value1, String value2) {
            addCriterion("theme_image between", value1, value2, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeImageNotBetween(String value1, String value2) {
            addCriterion("theme_image not between", value1, value2, "themeImage");
            return (Criteria) this;
        }

        public Criteria andThemeStateIsNull() {
            addCriterion("theme_state is null");
            return (Criteria) this;
        }

        public Criteria andThemeStateIsNotNull() {
            addCriterion("theme_state is not null");
            return (Criteria) this;
        }

        public Criteria andThemeStateEqualTo(Integer value) {
            addCriterion("theme_state =", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateNotEqualTo(Integer value) {
            addCriterion("theme_state <>", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateGreaterThan(Integer value) {
            addCriterion("theme_state >", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("theme_state >=", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateLessThan(Integer value) {
            addCriterion("theme_state <", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateLessThanOrEqualTo(Integer value) {
            addCriterion("theme_state <=", value, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateIn(List<Integer> values) {
            addCriterion("theme_state in", values, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateNotIn(List<Integer> values) {
            addCriterion("theme_state not in", values, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateBetween(Integer value1, Integer value2) {
            addCriterion("theme_state between", value1, value2, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("theme_state not between", value1, value2, "themeState");
            return (Criteria) this;
        }

        public Criteria andThemeTitleIsNull() {
            addCriterion("theme_title is null");
            return (Criteria) this;
        }

        public Criteria andThemeTitleIsNotNull() {
            addCriterion("theme_title is not null");
            return (Criteria) this;
        }

        public Criteria andThemeTitleEqualTo(String value) {
            addCriterion("theme_title =", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleNotEqualTo(String value) {
            addCriterion("theme_title <>", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleGreaterThan(String value) {
            addCriterion("theme_title >", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("theme_title >=", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleLessThan(String value) {
            addCriterion("theme_title <", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleLessThanOrEqualTo(String value) {
            addCriterion("theme_title <=", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleLike(String value) {
            addCriterion("theme_title like", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleNotLike(String value) {
            addCriterion("theme_title not like", value, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleIn(List<String> values) {
            addCriterion("theme_title in", values, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleNotIn(List<String> values) {
            addCriterion("theme_title not in", values, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleBetween(String value1, String value2) {
            addCriterion("theme_title between", value1, value2, "themeTitle");
            return (Criteria) this;
        }

        public Criteria andThemeTitleNotBetween(String value1, String value2) {
            addCriterion("theme_title not between", value1, value2, "themeTitle");
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