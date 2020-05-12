package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointsGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsGoodsExample() {
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

        public Criteria andPointsGoodsIdIsNull() {
            addCriterion("points_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdIsNotNull() {
            addCriterion("points_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdEqualTo(Integer value) {
            addCriterion("points_goods_id =", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdNotEqualTo(Integer value) {
            addCriterion("points_goods_id <>", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdGreaterThan(Integer value) {
            addCriterion("points_goods_id >", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_goods_id >=", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdLessThan(Integer value) {
            addCriterion("points_goods_id <", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("points_goods_id <=", value, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdIn(List<Integer> values) {
            addCriterion("points_goods_id in", values, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdNotIn(List<Integer> values) {
            addCriterion("points_goods_id not in", values, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("points_goods_id between", value1, value2, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointsGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("points_goods_id not between", value1, value2, "pointsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExpendPointsIsNull() {
            addCriterion("expend_points is null");
            return (Criteria) this;
        }

        public Criteria andExpendPointsIsNotNull() {
            addCriterion("expend_points is not null");
            return (Criteria) this;
        }

        public Criteria andExpendPointsEqualTo(Integer value) {
            addCriterion("expend_points =", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotEqualTo(Integer value) {
            addCriterion("expend_points <>", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsGreaterThan(Integer value) {
            addCriterion("expend_points >", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("expend_points >=", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsLessThan(Integer value) {
            addCriterion("expend_points <", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsLessThanOrEqualTo(Integer value) {
            addCriterion("expend_points <=", value, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsIn(List<Integer> values) {
            addCriterion("expend_points in", values, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotIn(List<Integer> values) {
            addCriterion("expend_points not in", values, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsBetween(Integer value1, Integer value2) {
            addCriterion("expend_points between", value1, value2, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andExpendPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("expend_points not between", value1, value2, "expendPoints");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNull() {
            addCriterion("goods_click is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNotNull() {
            addCriterion("goods_click is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickEqualTo(Integer value) {
            addCriterion("goods_click =", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotEqualTo(Integer value) {
            addCriterion("goods_click <>", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThan(Integer value) {
            addCriterion("goods_click >", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click >=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThan(Integer value) {
            addCriterion("goods_click <", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click <=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIn(List<Integer> values) {
            addCriterion("goods_click in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotIn(List<Integer> values) {
            addCriterion("goods_click not in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickBetween(Integer value1, Integer value2) {
            addCriterion("goods_click between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click not between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIsNull() {
            addCriterion("limit_member_grade_level is null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIsNotNull() {
            addCriterion("limit_member_grade_level is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelEqualTo(Integer value) {
            addCriterion("limit_member_grade_level =", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotEqualTo(Integer value) {
            addCriterion("limit_member_grade_level <>", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelGreaterThan(Integer value) {
            addCriterion("limit_member_grade_level >", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_member_grade_level >=", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelLessThan(Integer value) {
            addCriterion("limit_member_grade_level <", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("limit_member_grade_level <=", value, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelIn(List<Integer> values) {
            addCriterion("limit_member_grade_level in", values, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotIn(List<Integer> values) {
            addCriterion("limit_member_grade_level not in", values, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelBetween(Integer value1, Integer value2) {
            addCriterion("limit_member_grade_level between", value1, value2, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_member_grade_level not between", value1, value2, "limitMemberGradeLevel");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIsNull() {
            addCriterion("limit_member_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIsNotNull() {
            addCriterion("limit_member_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameEqualTo(String value) {
            addCriterion("limit_member_grade_name =", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotEqualTo(String value) {
            addCriterion("limit_member_grade_name <>", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameGreaterThan(String value) {
            addCriterion("limit_member_grade_name >", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("limit_member_grade_name >=", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLessThan(String value) {
            addCriterion("limit_member_grade_name <", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLessThanOrEqualTo(String value) {
            addCriterion("limit_member_grade_name <=", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameLike(String value) {
            addCriterion("limit_member_grade_name like", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotLike(String value) {
            addCriterion("limit_member_grade_name not like", value, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameIn(List<String> values) {
            addCriterion("limit_member_grade_name in", values, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotIn(List<String> values) {
            addCriterion("limit_member_grade_name not in", values, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameBetween(String value1, String value2) {
            addCriterion("limit_member_grade_name between", value1, value2, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andLimitMemberGradeNameNotBetween(String value1, String value2) {
            addCriterion("limit_member_grade_name not between", value1, value2, "limitMemberGradeName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
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