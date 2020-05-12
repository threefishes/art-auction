package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andAppPrice0IsNull() {
            addCriterion("app_price0 is null");
            return (Criteria) this;
        }

        public Criteria andAppPrice0IsNotNull() {
            addCriterion("app_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andAppPrice0EqualTo(BigDecimal value) {
            addCriterion("app_price0 =", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0NotEqualTo(BigDecimal value) {
            addCriterion("app_price0 <>", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0GreaterThan(BigDecimal value) {
            addCriterion("app_price0 >", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price0 >=", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0LessThan(BigDecimal value) {
            addCriterion("app_price0 <", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price0 <=", value, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0In(List<BigDecimal> values) {
            addCriterion("app_price0 in", values, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0NotIn(List<BigDecimal> values) {
            addCriterion("app_price0 not in", values, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price0 between", value1, value2, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price0 not between", value1, value2, "appPrice0");
            return (Criteria) this;
        }

        public Criteria andAppPrice1IsNull() {
            addCriterion("app_price1 is null");
            return (Criteria) this;
        }

        public Criteria andAppPrice1IsNotNull() {
            addCriterion("app_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andAppPrice1EqualTo(BigDecimal value) {
            addCriterion("app_price1 =", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1NotEqualTo(BigDecimal value) {
            addCriterion("app_price1 <>", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1GreaterThan(BigDecimal value) {
            addCriterion("app_price1 >", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price1 >=", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1LessThan(BigDecimal value) {
            addCriterion("app_price1 <", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price1 <=", value, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1In(List<BigDecimal> values) {
            addCriterion("app_price1 in", values, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1NotIn(List<BigDecimal> values) {
            addCriterion("app_price1 not in", values, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price1 between", value1, value2, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price1 not between", value1, value2, "appPrice1");
            return (Criteria) this;
        }

        public Criteria andAppPrice2IsNull() {
            addCriterion("app_price2 is null");
            return (Criteria) this;
        }

        public Criteria andAppPrice2IsNotNull() {
            addCriterion("app_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andAppPrice2EqualTo(BigDecimal value) {
            addCriterion("app_price2 =", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2NotEqualTo(BigDecimal value) {
            addCriterion("app_price2 <>", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2GreaterThan(BigDecimal value) {
            addCriterion("app_price2 >", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price2 >=", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2LessThan(BigDecimal value) {
            addCriterion("app_price2 <", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("app_price2 <=", value, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2In(List<BigDecimal> values) {
            addCriterion("app_price2 in", values, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2NotIn(List<BigDecimal> values) {
            addCriterion("app_price2 not in", values, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price2 between", value1, value2, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_price2 not between", value1, value2, "appPrice2");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNull() {
            addCriterion("app_usable is null");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNotNull() {
            addCriterion("app_usable is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsableEqualTo(Integer value) {
            addCriterion("app_usable =", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotEqualTo(Integer value) {
            addCriterion("app_usable <>", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThan(Integer value) {
            addCriterion("app_usable >", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_usable >=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThan(Integer value) {
            addCriterion("app_usable <", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThanOrEqualTo(Integer value) {
            addCriterion("app_usable <=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableIn(List<Integer> values) {
            addCriterion("app_usable in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotIn(List<Integer> values) {
            addCriterion("app_usable not in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableBetween(Integer value1, Integer value2) {
            addCriterion("app_usable between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("app_usable not between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Integer value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Integer value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(Integer value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Integer value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Integer> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Integer> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Integer value1, Integer value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
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

        public Criteria andGoodsPrice0IsNull() {
            addCriterion("goods_price0 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0IsNotNull() {
            addCriterion("goods_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0EqualTo(BigDecimal value) {
            addCriterion("goods_price0 =", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0NotEqualTo(BigDecimal value) {
            addCriterion("goods_price0 <>", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0GreaterThan(BigDecimal value) {
            addCriterion("goods_price0 >", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price0 >=", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0LessThan(BigDecimal value) {
            addCriterion("goods_price0 <", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price0 <=", value, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0In(List<BigDecimal> values) {
            addCriterion("goods_price0 in", values, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0NotIn(List<BigDecimal> values) {
            addCriterion("goods_price0 not in", values, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price0 between", value1, value2, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price0 not between", value1, value2, "goodsPrice0");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1IsNull() {
            addCriterion("goods_price1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1IsNotNull() {
            addCriterion("goods_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1EqualTo(BigDecimal value) {
            addCriterion("goods_price1 =", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1NotEqualTo(BigDecimal value) {
            addCriterion("goods_price1 <>", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1GreaterThan(BigDecimal value) {
            addCriterion("goods_price1 >", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price1 >=", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1LessThan(BigDecimal value) {
            addCriterion("goods_price1 <", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price1 <=", value, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1In(List<BigDecimal> values) {
            addCriterion("goods_price1 in", values, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1NotIn(List<BigDecimal> values) {
            addCriterion("goods_price1 not in", values, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price1 between", value1, value2, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price1 not between", value1, value2, "goodsPrice1");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2IsNull() {
            addCriterion("goods_price2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2IsNotNull() {
            addCriterion("goods_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2EqualTo(BigDecimal value) {
            addCriterion("goods_price2 =", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2NotEqualTo(BigDecimal value) {
            addCriterion("goods_price2 <>", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2GreaterThan(BigDecimal value) {
            addCriterion("goods_price2 >", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price2 >=", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2LessThan(BigDecimal value) {
            addCriterion("goods_price2 <", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price2 <=", value, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2In(List<BigDecimal> values) {
            addCriterion("goods_price2 in", values, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2NotIn(List<BigDecimal> values) {
            addCriterion("goods_price2 not in", values, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price2 between", value1, value2, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price2 not between", value1, value2, "goodsPrice2");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNull() {
            addCriterion("goods_serial is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNotNull() {
            addCriterion("goods_serial is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialEqualTo(String value) {
            addCriterion("goods_serial =", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotEqualTo(String value) {
            addCriterion("goods_serial <>", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThan(String value) {
            addCriterion("goods_serial >", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThanOrEqualTo(String value) {
            addCriterion("goods_serial >=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThan(String value) {
            addCriterion("goods_serial <", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThanOrEqualTo(String value) {
            addCriterion("goods_serial <=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLike(String value) {
            addCriterion("goods_serial like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotLike(String value) {
            addCriterion("goods_serial not like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIn(List<String> values) {
            addCriterion("goods_serial in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotIn(List<String> values) {
            addCriterion("goods_serial not in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialBetween(String value1, String value2) {
            addCriterion("goods_serial between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotBetween(String value1, String value2) {
            addCriterion("goods_serial not between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIsNull() {
            addCriterion("goods_specs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIsNotNull() {
            addCriterion("goods_specs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsEqualTo(String value) {
            addCriterion("goods_specs =", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotEqualTo(String value) {
            addCriterion("goods_specs <>", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsGreaterThan(String value) {
            addCriterion("goods_specs >", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specs >=", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLessThan(String value) {
            addCriterion("goods_specs <", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLessThanOrEqualTo(String value) {
            addCriterion("goods_specs <=", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLike(String value) {
            addCriterion("goods_specs like", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotLike(String value) {
            addCriterion("goods_specs not like", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIn(List<String> values) {
            addCriterion("goods_specs in", values, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotIn(List<String> values) {
            addCriterion("goods_specs not in", values, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsBetween(String value1, String value2) {
            addCriterion("goods_specs between", value1, value2, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotBetween(String value1, String value2) {
            addCriterion("goods_specs not between", value1, value2, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNull() {
            addCriterion("goods_storage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIsNotNull() {
            addCriterion("goods_storage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageEqualTo(Integer value) {
            addCriterion("goods_storage =", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotEqualTo(Integer value) {
            addCriterion("goods_storage <>", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThan(Integer value) {
            addCriterion("goods_storage >", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_storage >=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThan(Integer value) {
            addCriterion("goods_storage <", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageLessThanOrEqualTo(Integer value) {
            addCriterion("goods_storage <=", value, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageIn(List<Integer> values) {
            addCriterion("goods_storage in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotIn(List<Integer> values) {
            addCriterion("goods_storage not in", values, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageBetween(Integer value1, Integer value2) {
            addCriterion("goods_storage between", value1, value2, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_storage not between", value1, value2, "goodsStorage");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNull() {
            addCriterion("group_price is null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNotNull() {
            addCriterion("group_price is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceEqualTo(BigDecimal value) {
            addCriterion("group_price =", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotEqualTo(BigDecimal value) {
            addCriterion("group_price <>", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThan(BigDecimal value) {
            addCriterion("group_price >", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price >=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThan(BigDecimal value) {
            addCriterion("group_price <", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price <=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIn(List<BigDecimal> values) {
            addCriterion("group_price in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotIn(List<BigDecimal> values) {
            addCriterion("group_price not in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price not between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Integer value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Integer value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Integer value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Integer value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Integer value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Integer> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Integer> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Integer value1, Integer value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Integer value1, Integer value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNull() {
            addCriterion("is_group is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNotNull() {
            addCriterion("is_group is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupEqualTo(Integer value) {
            addCriterion("is_group =", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotEqualTo(Integer value) {
            addCriterion("is_group <>", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThan(Integer value) {
            addCriterion("is_group >", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_group >=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThan(Integer value) {
            addCriterion("is_group <", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThanOrEqualTo(Integer value) {
            addCriterion("is_group <=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupIn(List<Integer> values) {
            addCriterion("is_group in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotIn(List<Integer> values) {
            addCriterion("is_group not in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupBetween(Integer value1, Integer value2) {
            addCriterion("is_group between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("is_group not between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(Integer value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(Integer value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(Integer value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(Integer value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(Integer value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<Integer> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<Integer> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNull() {
            addCriterion("promotion_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNotNull() {
            addCriterion("promotion_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeEqualTo(Date value) {
            addCriterion("promotion_end_time =", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotEqualTo(Date value) {
            addCriterion("promotion_end_time <>", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThan(Date value) {
            addCriterion("promotion_end_time >", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time >=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThan(Date value) {
            addCriterion("promotion_end_time <", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time <=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIn(List<Date> values) {
            addCriterion("promotion_end_time in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotIn(List<Date> values) {
            addCriterion("promotion_end_time not in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time not between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNull() {
            addCriterion("promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdEqualTo(Integer value) {
            addCriterion("promotion_id =", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotEqualTo(Integer value) {
            addCriterion("promotion_id <>", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThan(Integer value) {
            addCriterion("promotion_id >", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_id >=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThan(Integer value) {
            addCriterion("promotion_id <", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_id <=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIn(List<Integer> values) {
            addCriterion("promotion_id in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotIn(List<Integer> values) {
            addCriterion("promotion_id not in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id not between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNull() {
            addCriterion("promotion_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNotNull() {
            addCriterion("promotion_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeEqualTo(Date value) {
            addCriterion("promotion_start_time =", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotEqualTo(Date value) {
            addCriterion("promotion_start_time <>", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThan(Date value) {
            addCriterion("promotion_start_time >", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time >=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThan(Date value) {
            addCriterion("promotion_start_time <", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time <=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIn(List<Date> values) {
            addCriterion("promotion_start_time in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotIn(List<Date> values) {
            addCriterion("promotion_start_time not in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time not between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIsNull() {
            addCriterion("promotion_state is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIsNotNull() {
            addCriterion("promotion_state is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStateEqualTo(Integer value) {
            addCriterion("promotion_state =", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotEqualTo(Integer value) {
            addCriterion("promotion_state <>", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateGreaterThan(Integer value) {
            addCriterion("promotion_state >", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_state >=", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateLessThan(Integer value) {
            addCriterion("promotion_state <", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_state <=", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIn(List<Integer> values) {
            addCriterion("promotion_state in", values, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotIn(List<Integer> values) {
            addCriterion("promotion_state not in", values, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateBetween(Integer value1, Integer value2) {
            addCriterion("promotion_state between", value1, value2, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_state not between", value1, value2, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNull() {
            addCriterion("promotion_title is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNotNull() {
            addCriterion("promotion_title is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleEqualTo(String value) {
            addCriterion("promotion_title =", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotEqualTo(String value) {
            addCriterion("promotion_title <>", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThan(String value) {
            addCriterion("promotion_title >", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_title >=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThan(String value) {
            addCriterion("promotion_title <", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThanOrEqualTo(String value) {
            addCriterion("promotion_title <=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLike(String value) {
            addCriterion("promotion_title like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotLike(String value) {
            addCriterion("promotion_title not like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIn(List<String> values) {
            addCriterion("promotion_title in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotIn(List<String> values) {
            addCriterion("promotion_title not in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleBetween(String value1, String value2) {
            addCriterion("promotion_title between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotBetween(String value1, String value2) {
            addCriterion("promotion_title not between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Integer value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Integer value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Integer value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Integer value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Integer> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Integer> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsIsNull() {
            addCriterion("spec_value_ids is null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsIsNotNull() {
            addCriterion("spec_value_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsEqualTo(String value) {
            addCriterion("spec_value_ids =", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotEqualTo(String value) {
            addCriterion("spec_value_ids <>", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsGreaterThan(String value) {
            addCriterion("spec_value_ids >", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_value_ids >=", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLessThan(String value) {
            addCriterion("spec_value_ids <", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLessThanOrEqualTo(String value) {
            addCriterion("spec_value_ids <=", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLike(String value) {
            addCriterion("spec_value_ids like", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotLike(String value) {
            addCriterion("spec_value_ids not like", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsIn(List<String> values) {
            addCriterion("spec_value_ids in", values, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotIn(List<String> values) {
            addCriterion("spec_value_ids not in", values, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsBetween(String value1, String value2) {
            addCriterion("spec_value_ids between", value1, value2, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotBetween(String value1, String value2) {
            addCriterion("spec_value_ids not between", value1, value2, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andWebPrice0IsNull() {
            addCriterion("web_price0 is null");
            return (Criteria) this;
        }

        public Criteria andWebPrice0IsNotNull() {
            addCriterion("web_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andWebPrice0EqualTo(BigDecimal value) {
            addCriterion("web_price0 =", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0NotEqualTo(BigDecimal value) {
            addCriterion("web_price0 <>", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0GreaterThan(BigDecimal value) {
            addCriterion("web_price0 >", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price0 >=", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0LessThan(BigDecimal value) {
            addCriterion("web_price0 <", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price0 <=", value, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0In(List<BigDecimal> values) {
            addCriterion("web_price0 in", values, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0NotIn(List<BigDecimal> values) {
            addCriterion("web_price0 not in", values, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price0 between", value1, value2, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price0 not between", value1, value2, "webPrice0");
            return (Criteria) this;
        }

        public Criteria andWebPrice1IsNull() {
            addCriterion("web_price1 is null");
            return (Criteria) this;
        }

        public Criteria andWebPrice1IsNotNull() {
            addCriterion("web_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andWebPrice1EqualTo(BigDecimal value) {
            addCriterion("web_price1 =", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1NotEqualTo(BigDecimal value) {
            addCriterion("web_price1 <>", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1GreaterThan(BigDecimal value) {
            addCriterion("web_price1 >", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price1 >=", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1LessThan(BigDecimal value) {
            addCriterion("web_price1 <", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price1 <=", value, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1In(List<BigDecimal> values) {
            addCriterion("web_price1 in", values, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1NotIn(List<BigDecimal> values) {
            addCriterion("web_price1 not in", values, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price1 between", value1, value2, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price1 not between", value1, value2, "webPrice1");
            return (Criteria) this;
        }

        public Criteria andWebPrice2IsNull() {
            addCriterion("web_price2 is null");
            return (Criteria) this;
        }

        public Criteria andWebPrice2IsNotNull() {
            addCriterion("web_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andWebPrice2EqualTo(BigDecimal value) {
            addCriterion("web_price2 =", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2NotEqualTo(BigDecimal value) {
            addCriterion("web_price2 <>", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2GreaterThan(BigDecimal value) {
            addCriterion("web_price2 >", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price2 >=", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2LessThan(BigDecimal value) {
            addCriterion("web_price2 <", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("web_price2 <=", value, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2In(List<BigDecimal> values) {
            addCriterion("web_price2 in", values, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2NotIn(List<BigDecimal> values) {
            addCriterion("web_price2 not in", values, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price2 between", value1, value2, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("web_price2 not between", value1, value2, "webPrice2");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNull() {
            addCriterion("web_usable is null");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNotNull() {
            addCriterion("web_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWebUsableEqualTo(Integer value) {
            addCriterion("web_usable =", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotEqualTo(Integer value) {
            addCriterion("web_usable <>", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThan(Integer value) {
            addCriterion("web_usable >", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_usable >=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThan(Integer value) {
            addCriterion("web_usable <", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThanOrEqualTo(Integer value) {
            addCriterion("web_usable <=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableIn(List<Integer> values) {
            addCriterion("web_usable in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotIn(List<Integer> values) {
            addCriterion("web_usable not in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableBetween(Integer value1, Integer value2) {
            addCriterion("web_usable between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("web_usable not between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0IsNull() {
            addCriterion("wechat_price0 is null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0IsNotNull() {
            addCriterion("wechat_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0EqualTo(BigDecimal value) {
            addCriterion("wechat_price0 =", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0NotEqualTo(BigDecimal value) {
            addCriterion("wechat_price0 <>", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0GreaterThan(BigDecimal value) {
            addCriterion("wechat_price0 >", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price0 >=", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0LessThan(BigDecimal value) {
            addCriterion("wechat_price0 <", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price0 <=", value, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0In(List<BigDecimal> values) {
            addCriterion("wechat_price0 in", values, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0NotIn(List<BigDecimal> values) {
            addCriterion("wechat_price0 not in", values, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price0 between", value1, value2, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price0 not between", value1, value2, "wechatPrice0");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1IsNull() {
            addCriterion("wechat_price1 is null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1IsNotNull() {
            addCriterion("wechat_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1EqualTo(BigDecimal value) {
            addCriterion("wechat_price1 =", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1NotEqualTo(BigDecimal value) {
            addCriterion("wechat_price1 <>", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1GreaterThan(BigDecimal value) {
            addCriterion("wechat_price1 >", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price1 >=", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1LessThan(BigDecimal value) {
            addCriterion("wechat_price1 <", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price1 <=", value, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1In(List<BigDecimal> values) {
            addCriterion("wechat_price1 in", values, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1NotIn(List<BigDecimal> values) {
            addCriterion("wechat_price1 not in", values, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price1 between", value1, value2, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price1 not between", value1, value2, "wechatPrice1");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2IsNull() {
            addCriterion("wechat_price2 is null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2IsNotNull() {
            addCriterion("wechat_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2EqualTo(BigDecimal value) {
            addCriterion("wechat_price2 =", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2NotEqualTo(BigDecimal value) {
            addCriterion("wechat_price2 <>", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2GreaterThan(BigDecimal value) {
            addCriterion("wechat_price2 >", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price2 >=", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2LessThan(BigDecimal value) {
            addCriterion("wechat_price2 <", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_price2 <=", value, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2In(List<BigDecimal> values) {
            addCriterion("wechat_price2 in", values, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2NotIn(List<BigDecimal> values) {
            addCriterion("wechat_price2 not in", values, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price2 between", value1, value2, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_price2 not between", value1, value2, "wechatPrice2");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNull() {
            addCriterion("wechat_usable is null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNotNull() {
            addCriterion("wechat_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableEqualTo(Integer value) {
            addCriterion("wechat_usable =", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotEqualTo(Integer value) {
            addCriterion("wechat_usable <>", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThan(Integer value) {
            addCriterion("wechat_usable >", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable >=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThan(Integer value) {
            addCriterion("wechat_usable <", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable <=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIn(List<Integer> values) {
            addCriterion("wechat_usable in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotIn(List<Integer> values) {
            addCriterion("wechat_usable not in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable not between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIsNull() {
            addCriterion("online_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIsNotNull() {
            addCriterion("online_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceEqualTo(BigDecimal value) {
            addCriterion("online_pay_price =", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotEqualTo(BigDecimal value) {
            addCriterion("online_pay_price <>", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceGreaterThan(BigDecimal value) {
            addCriterion("online_pay_price >", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_price >=", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceLessThan(BigDecimal value) {
            addCriterion("online_pay_price <", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_pay_price <=", value, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceIn(List<BigDecimal> values) {
            addCriterion("online_pay_price in", values, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotIn(List<BigDecimal> values) {
            addCriterion("online_pay_price not in", values, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_price between", value1, value2, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_pay_price not between", value1, value2, "onlinePayPrice");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdIsNull() {
            addCriterion("video_cos_files_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdIsNotNull() {
            addCriterion("video_cos_files_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdEqualTo(String value) {
            addCriterion("video_cos_files_id =", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdNotEqualTo(String value) {
            addCriterion("video_cos_files_id <>", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdGreaterThan(String value) {
            addCriterion("video_cos_files_id >", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_cos_files_id >=", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdLessThan(String value) {
            addCriterion("video_cos_files_id <", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdLessThanOrEqualTo(String value) {
            addCriterion("video_cos_files_id <=", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdLike(String value) {
            addCriterion("video_cos_files_id like", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdNotLike(String value) {
            addCriterion("video_cos_files_id not like", value, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdIn(List<String> values) {
            addCriterion("video_cos_files_id in", values, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdNotIn(List<String> values) {
            addCriterion("video_cos_files_id not in", values, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdBetween(String value1, String value2) {
            addCriterion("video_cos_files_id between", value1, value2, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andVideoCosFilesIdNotBetween(String value1, String value2) {
            addCriterion("video_cos_files_id not between", value1, value2, "videoCosFilesId");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIsNull() {
            addCriterion("dw_specsid is null");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIsNotNull() {
            addCriterion("dw_specsid is not null");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidEqualTo(Integer value) {
            addCriterion("dw_specsid =", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotEqualTo(Integer value) {
            addCriterion("dw_specsid <>", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidGreaterThan(Integer value) {
            addCriterion("dw_specsid >", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_specsid >=", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidLessThan(Integer value) {
            addCriterion("dw_specsid <", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidLessThanOrEqualTo(Integer value) {
            addCriterion("dw_specsid <=", value, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidIn(List<Integer> values) {
            addCriterion("dw_specsid in", values, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotIn(List<Integer> values) {
            addCriterion("dw_specsid not in", values, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidBetween(Integer value1, Integer value2) {
            addCriterion("dw_specsid between", value1, value2, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwSpecsidNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_specsid not between", value1, value2, "dwSpecsid");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNull() {
            addCriterion("dw_id is null");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNotNull() {
            addCriterion("dw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwIdEqualTo(Integer value) {
            addCriterion("dw_id =", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotEqualTo(Integer value) {
            addCriterion("dw_id <>", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThan(Integer value) {
            addCriterion("dw_id >", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_id >=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThan(Integer value) {
            addCriterion("dw_id <", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThanOrEqualTo(Integer value) {
            addCriterion("dw_id <=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdIn(List<Integer> values) {
            addCriterion("dw_id in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotIn(List<Integer> values) {
            addCriterion("dw_id not in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdBetween(Integer value1, Integer value2) {
            addCriterion("dw_id between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_id not between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andGaveXfIsNull() {
            addCriterion("gave_xf is null");
            return (Criteria) this;
        }

        public Criteria andGaveXfIsNotNull() {
            addCriterion("gave_xf is not null");
            return (Criteria) this;
        }

        public Criteria andGaveXfEqualTo(BigDecimal value) {
            addCriterion("gave_xf =", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfNotEqualTo(BigDecimal value) {
            addCriterion("gave_xf <>", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfGreaterThan(BigDecimal value) {
            addCriterion("gave_xf >", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gave_xf >=", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfLessThan(BigDecimal value) {
            addCriterion("gave_xf <", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gave_xf <=", value, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfIn(List<BigDecimal> values) {
            addCriterion("gave_xf in", values, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfNotIn(List<BigDecimal> values) {
            addCriterion("gave_xf not in", values, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gave_xf between", value1, value2, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andGaveXfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gave_xf not between", value1, value2, "gaveXf");
            return (Criteria) this;
        }

        public Criteria andYgPriceIsNull() {
            addCriterion("yg_price is null");
            return (Criteria) this;
        }

        public Criteria andYgPriceIsNotNull() {
            addCriterion("yg_price is not null");
            return (Criteria) this;
        }

        public Criteria andYgPriceEqualTo(BigDecimal value) {
            addCriterion("yg_price =", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotEqualTo(BigDecimal value) {
            addCriterion("yg_price <>", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceGreaterThan(BigDecimal value) {
            addCriterion("yg_price >", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yg_price >=", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceLessThan(BigDecimal value) {
            addCriterion("yg_price <", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yg_price <=", value, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceIn(List<BigDecimal> values) {
            addCriterion("yg_price in", values, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotIn(List<BigDecimal> values) {
            addCriterion("yg_price not in", values, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yg_price between", value1, value2, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andYgPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yg_price not between", value1, value2, "ygPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceIsNull() {
            addCriterion("staff_price is null");
            return (Criteria) this;
        }

        public Criteria andStaffPriceIsNotNull() {
            addCriterion("staff_price is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPriceEqualTo(BigDecimal value) {
            addCriterion("staff_price =", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceNotEqualTo(BigDecimal value) {
            addCriterion("staff_price <>", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceGreaterThan(BigDecimal value) {
            addCriterion("staff_price >", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_price >=", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceLessThan(BigDecimal value) {
            addCriterion("staff_price <", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_price <=", value, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceIn(List<BigDecimal> values) {
            addCriterion("staff_price in", values, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceNotIn(List<BigDecimal> values) {
            addCriterion("staff_price not in", values, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_price between", value1, value2, "staffPrice");
            return (Criteria) this;
        }

        public Criteria andStaffPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_price not between", value1, value2, "staffPrice");
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