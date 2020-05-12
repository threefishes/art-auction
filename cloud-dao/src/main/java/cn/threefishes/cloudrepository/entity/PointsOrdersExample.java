package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointsOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsOrdersExample() {
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

        public Criteria andPointsOrdersIdIsNull() {
            addCriterion("points_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdIsNotNull() {
            addCriterion("points_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdEqualTo(Integer value) {
            addCriterion("points_orders_id =", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdNotEqualTo(Integer value) {
            addCriterion("points_orders_id <>", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdGreaterThan(Integer value) {
            addCriterion("points_orders_id >", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_orders_id >=", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdLessThan(Integer value) {
            addCriterion("points_orders_id <", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("points_orders_id <=", value, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdIn(List<Integer> values) {
            addCriterion("points_orders_id in", values, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdNotIn(List<Integer> values) {
            addCriterion("points_orders_id not in", values, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("points_orders_id between", value1, value2, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("points_orders_id not between", value1, value2, "pointsOrdersId");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
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

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNull() {
            addCriterion("goods_full_specs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNotNull() {
            addCriterion("goods_full_specs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsEqualTo(String value) {
            addCriterion("goods_full_specs =", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotEqualTo(String value) {
            addCriterion("goods_full_specs <>", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThan(String value) {
            addCriterion("goods_full_specs >", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_full_specs >=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThan(String value) {
            addCriterion("goods_full_specs <", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThanOrEqualTo(String value) {
            addCriterion("goods_full_specs <=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLike(String value) {
            addCriterion("goods_full_specs like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotLike(String value) {
            addCriterion("goods_full_specs not like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIn(List<String> values) {
            addCriterion("goods_full_specs in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotIn(List<String> values) {
            addCriterion("goods_full_specs not in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsBetween(String value1, String value2) {
            addCriterion("goods_full_specs between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotBetween(String value1, String value2) {
            addCriterion("goods_full_specs not between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnIsNull() {
            addCriterion("points_orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnIsNotNull() {
            addCriterion("points_orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnEqualTo(Long value) {
            addCriterion("points_orders_sn =", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnNotEqualTo(Long value) {
            addCriterion("points_orders_sn <>", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnGreaterThan(Long value) {
            addCriterion("points_orders_sn >", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnGreaterThanOrEqualTo(Long value) {
            addCriterion("points_orders_sn >=", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnLessThan(Long value) {
            addCriterion("points_orders_sn <", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnLessThanOrEqualTo(Long value) {
            addCriterion("points_orders_sn <=", value, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnIn(List<Long> values) {
            addCriterion("points_orders_sn in", values, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnNotIn(List<Long> values) {
            addCriterion("points_orders_sn not in", values, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnBetween(Long value1, Long value2) {
            addCriterion("points_orders_sn between", value1, value2, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersSnNotBetween(Long value1, Long value2) {
            addCriterion("points_orders_sn not between", value1, value2, "pointsOrdersSn");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateIsNull() {
            addCriterion("points_orders_state is null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateIsNotNull() {
            addCriterion("points_orders_state is not null");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateEqualTo(Integer value) {
            addCriterion("points_orders_state =", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateNotEqualTo(Integer value) {
            addCriterion("points_orders_state <>", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateGreaterThan(Integer value) {
            addCriterion("points_orders_state >", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_orders_state >=", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateLessThan(Integer value) {
            addCriterion("points_orders_state <", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateLessThanOrEqualTo(Integer value) {
            addCriterion("points_orders_state <=", value, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateIn(List<Integer> values) {
            addCriterion("points_orders_state in", values, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateNotIn(List<Integer> values) {
            addCriterion("points_orders_state not in", values, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateBetween(Integer value1, Integer value2) {
            addCriterion("points_orders_state between", value1, value2, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andPointsOrdersStateNotBetween(Integer value1, Integer value2) {
            addCriterion("points_orders_state not between", value1, value2, "pointsOrdersState");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1IsNull() {
            addCriterion("receiver_area_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1IsNotNull() {
            addCriterion("receiver_area_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1EqualTo(Integer value) {
            addCriterion("receiver_area_id_1 =", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 <>", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1GreaterThan(Integer value) {
            addCriterion("receiver_area_id_1 >", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 >=", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1LessThan(Integer value) {
            addCriterion("receiver_area_id_1 <", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_1 <=", value, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1In(List<Integer> values) {
            addCriterion("receiver_area_id_1 in", values, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_1 not in", values, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_1 between", value1, value2, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_1 not between", value1, value2, "receiverAreaId1");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2IsNull() {
            addCriterion("receiver_area_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2IsNotNull() {
            addCriterion("receiver_area_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2EqualTo(Integer value) {
            addCriterion("receiver_area_id_2 =", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 <>", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2GreaterThan(Integer value) {
            addCriterion("receiver_area_id_2 >", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 >=", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2LessThan(Integer value) {
            addCriterion("receiver_area_id_2 <", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_2 <=", value, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2In(List<Integer> values) {
            addCriterion("receiver_area_id_2 in", values, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_2 not in", values, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_2 between", value1, value2, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_2 not between", value1, value2, "receiverAreaId2");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3IsNull() {
            addCriterion("receiver_area_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3IsNotNull() {
            addCriterion("receiver_area_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3EqualTo(Integer value) {
            addCriterion("receiver_area_id_3 =", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 <>", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3GreaterThan(Integer value) {
            addCriterion("receiver_area_id_3 >", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 >=", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3LessThan(Integer value) {
            addCriterion("receiver_area_id_3 <", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_3 <=", value, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3In(List<Integer> values) {
            addCriterion("receiver_area_id_3 in", values, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_3 not in", values, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_3 between", value1, value2, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId3NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_3 not between", value1, value2, "receiverAreaId3");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4IsNull() {
            addCriterion("receiver_area_id_4 is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4IsNotNull() {
            addCriterion("receiver_area_id_4 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4EqualTo(Integer value) {
            addCriterion("receiver_area_id_4 =", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 <>", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4GreaterThan(Integer value) {
            addCriterion("receiver_area_id_4 >", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 >=", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4LessThan(Integer value) {
            addCriterion("receiver_area_id_4 <", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4LessThanOrEqualTo(Integer value) {
            addCriterion("receiver_area_id_4 <=", value, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4In(List<Integer> values) {
            addCriterion("receiver_area_id_4 in", values, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotIn(List<Integer> values) {
            addCriterion("receiver_area_id_4 not in", values, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4Between(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_4 between", value1, value2, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaId4NotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_area_id_4 not between", value1, value2, "receiverAreaId4");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIsNull() {
            addCriterion("receiver_area_info is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIsNotNull() {
            addCriterion("receiver_area_info is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoEqualTo(String value) {
            addCriterion("receiver_area_info =", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotEqualTo(String value) {
            addCriterion("receiver_area_info <>", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoGreaterThan(String value) {
            addCriterion("receiver_area_info >", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area_info >=", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLessThan(String value) {
            addCriterion("receiver_area_info <", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("receiver_area_info <=", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoLike(String value) {
            addCriterion("receiver_area_info like", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotLike(String value) {
            addCriterion("receiver_area_info not like", value, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoIn(List<String> values) {
            addCriterion("receiver_area_info in", values, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotIn(List<String> values) {
            addCriterion("receiver_area_info not in", values, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoBetween(String value1, String value2) {
            addCriterion("receiver_area_info between", value1, value2, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaInfoNotBetween(String value1, String value2) {
            addCriterion("receiver_area_info not between", value1, value2, "receiverAreaInfo");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIsNull() {
            addCriterion("receiver_message is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIsNotNull() {
            addCriterion("receiver_message is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageEqualTo(String value) {
            addCriterion("receiver_message =", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotEqualTo(String value) {
            addCriterion("receiver_message <>", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageGreaterThan(String value) {
            addCriterion("receiver_message >", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_message >=", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLessThan(String value) {
            addCriterion("receiver_message <", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLessThanOrEqualTo(String value) {
            addCriterion("receiver_message <=", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageLike(String value) {
            addCriterion("receiver_message like", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotLike(String value) {
            addCriterion("receiver_message not like", value, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageIn(List<String> values) {
            addCriterion("receiver_message in", values, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotIn(List<String> values) {
            addCriterion("receiver_message not in", values, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageBetween(String value1, String value2) {
            addCriterion("receiver_message between", value1, value2, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverMessageNotBetween(String value1, String value2) {
            addCriterion("receiver_message not between", value1, value2, "receiverMessage");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNull() {
            addCriterion("ship_code is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("ship_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("ship_code =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("ship_code <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("ship_code >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_code >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("ship_code <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("ship_code <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("ship_code like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("ship_code not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("ship_code in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("ship_code not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("ship_code between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("ship_code not between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNull() {
            addCriterion("ship_note is null");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNotNull() {
            addCriterion("ship_note is not null");
            return (Criteria) this;
        }

        public Criteria andShipNoteEqualTo(String value) {
            addCriterion("ship_note =", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotEqualTo(String value) {
            addCriterion("ship_note <>", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThan(String value) {
            addCriterion("ship_note >", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThanOrEqualTo(String value) {
            addCriterion("ship_note >=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThan(String value) {
            addCriterion("ship_note <", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThanOrEqualTo(String value) {
            addCriterion("ship_note <=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLike(String value) {
            addCriterion("ship_note like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotLike(String value) {
            addCriterion("ship_note not like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteIn(List<String> values) {
            addCriterion("ship_note in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotIn(List<String> values) {
            addCriterion("ship_note not in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteBetween(String value1, String value2) {
            addCriterion("ship_note between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotBetween(String value1, String value2) {
            addCriterion("ship_note not between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNull() {
            addCriterion("ship_sn is null");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNotNull() {
            addCriterion("ship_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShipSnEqualTo(String value) {
            addCriterion("ship_sn =", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotEqualTo(String value) {
            addCriterion("ship_sn <>", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThan(String value) {
            addCriterion("ship_sn >", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThanOrEqualTo(String value) {
            addCriterion("ship_sn >=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThan(String value) {
            addCriterion("ship_sn <", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThanOrEqualTo(String value) {
            addCriterion("ship_sn <=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLike(String value) {
            addCriterion("ship_sn like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotLike(String value) {
            addCriterion("ship_sn not like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnIn(List<String> values) {
            addCriterion("ship_sn in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotIn(List<String> values) {
            addCriterion("ship_sn not in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnBetween(String value1, String value2) {
            addCriterion("ship_sn between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotBetween(String value1, String value2) {
            addCriterion("ship_sn not between", value1, value2, "shipSn");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
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