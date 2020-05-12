package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCommonExample() {
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

        public Criteria andAreaId1IsNull() {
            addCriterion("area_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNotNull() {
            addCriterion("area_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId1EqualTo(Integer value) {
            addCriterion("area_id_1 =", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotEqualTo(Integer value) {
            addCriterion("area_id_1 <>", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThan(Integer value) {
            addCriterion("area_id_1 >", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_1 >=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThan(Integer value) {
            addCriterion("area_id_1 <", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_1 <=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1In(List<Integer> values) {
            addCriterion("area_id_1 in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotIn(List<Integer> values) {
            addCriterion("area_id_1 not in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1Between(Integer value1, Integer value2) {
            addCriterion("area_id_1 between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_1 not between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNull() {
            addCriterion("area_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNotNull() {
            addCriterion("area_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId2EqualTo(Integer value) {
            addCriterion("area_id_2 =", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotEqualTo(Integer value) {
            addCriterion("area_id_2 <>", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThan(Integer value) {
            addCriterion("area_id_2 >", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_2 >=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThan(Integer value) {
            addCriterion("area_id_2 <", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_2 <=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2In(List<Integer> values) {
            addCriterion("area_id_2 in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotIn(List<Integer> values) {
            addCriterion("area_id_2 not in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2Between(Integer value1, Integer value2) {
            addCriterion("area_id_2 between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_2 not between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNull() {
            addCriterion("area_info is null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNotNull() {
            addCriterion("area_info is not null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoEqualTo(String value) {
            addCriterion("area_info =", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotEqualTo(String value) {
            addCriterion("area_info <>", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThan(String value) {
            addCriterion("area_info >", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("area_info >=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThan(String value) {
            addCriterion("area_info <", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("area_info <=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLike(String value) {
            addCriterion("area_info like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotLike(String value) {
            addCriterion("area_info not like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIn(List<String> values) {
            addCriterion("area_info in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotIn(List<String> values) {
            addCriterion("area_info not in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoBetween(String value1, String value2) {
            addCriterion("area_info between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotBetween(String value1, String value2) {
            addCriterion("area_info not between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andBatchNum0IsNull() {
            addCriterion("batch_num0 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNum0IsNotNull() {
            addCriterion("batch_num0 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNum0EqualTo(Integer value) {
            addCriterion("batch_num0 =", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0NotEqualTo(Integer value) {
            addCriterion("batch_num0 <>", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0GreaterThan(Integer value) {
            addCriterion("batch_num0 >", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0GreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_num0 >=", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0LessThan(Integer value) {
            addCriterion("batch_num0 <", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0LessThanOrEqualTo(Integer value) {
            addCriterion("batch_num0 <=", value, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0In(List<Integer> values) {
            addCriterion("batch_num0 in", values, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0NotIn(List<Integer> values) {
            addCriterion("batch_num0 not in", values, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0Between(Integer value1, Integer value2) {
            addCriterion("batch_num0 between", value1, value2, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum0NotBetween(Integer value1, Integer value2) {
            addCriterion("batch_num0 not between", value1, value2, "batchNum0");
            return (Criteria) this;
        }

        public Criteria andBatchNum1IsNull() {
            addCriterion("batch_num1 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNum1IsNotNull() {
            addCriterion("batch_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNum1EqualTo(Integer value) {
            addCriterion("batch_num1 =", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1NotEqualTo(Integer value) {
            addCriterion("batch_num1 <>", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1GreaterThan(Integer value) {
            addCriterion("batch_num1 >", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_num1 >=", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1LessThan(Integer value) {
            addCriterion("batch_num1 <", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1LessThanOrEqualTo(Integer value) {
            addCriterion("batch_num1 <=", value, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1In(List<Integer> values) {
            addCriterion("batch_num1 in", values, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1NotIn(List<Integer> values) {
            addCriterion("batch_num1 not in", values, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1Between(Integer value1, Integer value2) {
            addCriterion("batch_num1 between", value1, value2, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("batch_num1 not between", value1, value2, "batchNum1");
            return (Criteria) this;
        }

        public Criteria andBatchNum2IsNull() {
            addCriterion("batch_num2 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNum2IsNotNull() {
            addCriterion("batch_num2 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNum2EqualTo(Integer value) {
            addCriterion("batch_num2 =", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2NotEqualTo(Integer value) {
            addCriterion("batch_num2 <>", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2GreaterThan(Integer value) {
            addCriterion("batch_num2 >", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_num2 >=", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2LessThan(Integer value) {
            addCriterion("batch_num2 <", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2LessThanOrEqualTo(Integer value) {
            addCriterion("batch_num2 <=", value, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2In(List<Integer> values) {
            addCriterion("batch_num2 in", values, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2NotIn(List<Integer> values) {
            addCriterion("batch_num2 not in", values, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2Between(Integer value1, Integer value2) {
            addCriterion("batch_num2 between", value1, value2, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("batch_num2 not between", value1, value2, "batchNum2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0IsNull() {
            addCriterion("batch_price0 is null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0IsNotNull() {
            addCriterion("batch_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0EqualTo(BigDecimal value) {
            addCriterion("batch_price0 =", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0NotEqualTo(BigDecimal value) {
            addCriterion("batch_price0 <>", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0GreaterThan(BigDecimal value) {
            addCriterion("batch_price0 >", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price0 >=", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0LessThan(BigDecimal value) {
            addCriterion("batch_price0 <", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price0 <=", value, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0In(List<BigDecimal> values) {
            addCriterion("batch_price0 in", values, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0NotIn(List<BigDecimal> values) {
            addCriterion("batch_price0 not in", values, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price0 between", value1, value2, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price0 not between", value1, value2, "batchPrice0");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1IsNull() {
            addCriterion("batch_price1 is null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1IsNotNull() {
            addCriterion("batch_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1EqualTo(BigDecimal value) {
            addCriterion("batch_price1 =", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1NotEqualTo(BigDecimal value) {
            addCriterion("batch_price1 <>", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1GreaterThan(BigDecimal value) {
            addCriterion("batch_price1 >", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price1 >=", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1LessThan(BigDecimal value) {
            addCriterion("batch_price1 <", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price1 <=", value, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1In(List<BigDecimal> values) {
            addCriterion("batch_price1 in", values, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1NotIn(List<BigDecimal> values) {
            addCriterion("batch_price1 not in", values, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price1 between", value1, value2, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price1 not between", value1, value2, "batchPrice1");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2IsNull() {
            addCriterion("batch_price2 is null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2IsNotNull() {
            addCriterion("batch_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2EqualTo(BigDecimal value) {
            addCriterion("batch_price2 =", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2NotEqualTo(BigDecimal value) {
            addCriterion("batch_price2 <>", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2GreaterThan(BigDecimal value) {
            addCriterion("batch_price2 >", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price2 >=", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2LessThan(BigDecimal value) {
            addCriterion("batch_price2 <", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("batch_price2 <=", value, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2In(List<BigDecimal> values) {
            addCriterion("batch_price2 in", values, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2NotIn(List<BigDecimal> values) {
            addCriterion("batch_price2 not in", values, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price2 between", value1, value2, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBatchPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("batch_price2 not between", value1, value2, "batchPrice2");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNull() {
            addCriterion("category_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNotNull() {
            addCriterion("category_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1EqualTo(Integer value) {
            addCriterion("category_id_1 =", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotEqualTo(Integer value) {
            addCriterion("category_id_1 <>", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThan(Integer value) {
            addCriterion("category_id_1 >", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_1 >=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThan(Integer value) {
            addCriterion("category_id_1 <", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_1 <=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1In(List<Integer> values) {
            addCriterion("category_id_1 in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotIn(List<Integer> values) {
            addCriterion("category_id_1 not in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1Between(Integer value1, Integer value2) {
            addCriterion("category_id_1 between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_1 not between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNull() {
            addCriterion("category_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNotNull() {
            addCriterion("category_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2EqualTo(Integer value) {
            addCriterion("category_id_2 =", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotEqualTo(Integer value) {
            addCriterion("category_id_2 <>", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThan(Integer value) {
            addCriterion("category_id_2 >", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_2 >=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThan(Integer value) {
            addCriterion("category_id_2 <", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_2 <=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2In(List<Integer> values) {
            addCriterion("category_id_2 in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotIn(List<Integer> values) {
            addCriterion("category_id_2 not in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2Between(Integer value1, Integer value2) {
            addCriterion("category_id_2 between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_2 not between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNull() {
            addCriterion("category_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3IsNotNull() {
            addCriterion("category_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId3EqualTo(Integer value) {
            addCriterion("category_id_3 =", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotEqualTo(Integer value) {
            addCriterion("category_id_3 <>", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThan(Integer value) {
            addCriterion("category_id_3 >", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_3 >=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThan(Integer value) {
            addCriterion("category_id_3 <", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3LessThanOrEqualTo(Integer value) {
            addCriterion("category_id_3 <=", value, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3In(List<Integer> values) {
            addCriterion("category_id_3 in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotIn(List<Integer> values) {
            addCriterion("category_id_3 not in", values, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3Between(Integer value1, Integer value2) {
            addCriterion("category_id_3 between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andCategoryId3NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_3 not between", value1, value2, "categoryId3");
            return (Criteria) this;
        }

        public Criteria andContractItem1IsNull() {
            addCriterion("contract_item_1 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem1IsNotNull() {
            addCriterion("contract_item_1 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem1EqualTo(Integer value) {
            addCriterion("contract_item_1 =", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1NotEqualTo(Integer value) {
            addCriterion("contract_item_1 <>", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1GreaterThan(Integer value) {
            addCriterion("contract_item_1 >", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_1 >=", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1LessThan(Integer value) {
            addCriterion("contract_item_1 <", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_1 <=", value, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1In(List<Integer> values) {
            addCriterion("contract_item_1 in", values, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1NotIn(List<Integer> values) {
            addCriterion("contract_item_1 not in", values, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1Between(Integer value1, Integer value2) {
            addCriterion("contract_item_1 between", value1, value2, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem1NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_1 not between", value1, value2, "contractItem1");
            return (Criteria) this;
        }

        public Criteria andContractItem10IsNull() {
            addCriterion("contract_item_10 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem10IsNotNull() {
            addCriterion("contract_item_10 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem10EqualTo(Integer value) {
            addCriterion("contract_item_10 =", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10NotEqualTo(Integer value) {
            addCriterion("contract_item_10 <>", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10GreaterThan(Integer value) {
            addCriterion("contract_item_10 >", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_10 >=", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10LessThan(Integer value) {
            addCriterion("contract_item_10 <", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_10 <=", value, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10In(List<Integer> values) {
            addCriterion("contract_item_10 in", values, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10NotIn(List<Integer> values) {
            addCriterion("contract_item_10 not in", values, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10Between(Integer value1, Integer value2) {
            addCriterion("contract_item_10 between", value1, value2, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem10NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_10 not between", value1, value2, "contractItem10");
            return (Criteria) this;
        }

        public Criteria andContractItem2IsNull() {
            addCriterion("contract_item_2 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem2IsNotNull() {
            addCriterion("contract_item_2 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem2EqualTo(Integer value) {
            addCriterion("contract_item_2 =", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2NotEqualTo(Integer value) {
            addCriterion("contract_item_2 <>", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2GreaterThan(Integer value) {
            addCriterion("contract_item_2 >", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_2 >=", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2LessThan(Integer value) {
            addCriterion("contract_item_2 <", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_2 <=", value, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2In(List<Integer> values) {
            addCriterion("contract_item_2 in", values, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2NotIn(List<Integer> values) {
            addCriterion("contract_item_2 not in", values, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2Between(Integer value1, Integer value2) {
            addCriterion("contract_item_2 between", value1, value2, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem2NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_2 not between", value1, value2, "contractItem2");
            return (Criteria) this;
        }

        public Criteria andContractItem3IsNull() {
            addCriterion("contract_item_3 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem3IsNotNull() {
            addCriterion("contract_item_3 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem3EqualTo(Integer value) {
            addCriterion("contract_item_3 =", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3NotEqualTo(Integer value) {
            addCriterion("contract_item_3 <>", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3GreaterThan(Integer value) {
            addCriterion("contract_item_3 >", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_3 >=", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3LessThan(Integer value) {
            addCriterion("contract_item_3 <", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_3 <=", value, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3In(List<Integer> values) {
            addCriterion("contract_item_3 in", values, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3NotIn(List<Integer> values) {
            addCriterion("contract_item_3 not in", values, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3Between(Integer value1, Integer value2) {
            addCriterion("contract_item_3 between", value1, value2, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem3NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_3 not between", value1, value2, "contractItem3");
            return (Criteria) this;
        }

        public Criteria andContractItem4IsNull() {
            addCriterion("contract_item_4 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem4IsNotNull() {
            addCriterion("contract_item_4 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem4EqualTo(Integer value) {
            addCriterion("contract_item_4 =", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4NotEqualTo(Integer value) {
            addCriterion("contract_item_4 <>", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4GreaterThan(Integer value) {
            addCriterion("contract_item_4 >", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_4 >=", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4LessThan(Integer value) {
            addCriterion("contract_item_4 <", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_4 <=", value, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4In(List<Integer> values) {
            addCriterion("contract_item_4 in", values, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4NotIn(List<Integer> values) {
            addCriterion("contract_item_4 not in", values, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4Between(Integer value1, Integer value2) {
            addCriterion("contract_item_4 between", value1, value2, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem4NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_4 not between", value1, value2, "contractItem4");
            return (Criteria) this;
        }

        public Criteria andContractItem5IsNull() {
            addCriterion("contract_item_5 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem5IsNotNull() {
            addCriterion("contract_item_5 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem5EqualTo(Integer value) {
            addCriterion("contract_item_5 =", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5NotEqualTo(Integer value) {
            addCriterion("contract_item_5 <>", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5GreaterThan(Integer value) {
            addCriterion("contract_item_5 >", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_5 >=", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5LessThan(Integer value) {
            addCriterion("contract_item_5 <", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_5 <=", value, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5In(List<Integer> values) {
            addCriterion("contract_item_5 in", values, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5NotIn(List<Integer> values) {
            addCriterion("contract_item_5 not in", values, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5Between(Integer value1, Integer value2) {
            addCriterion("contract_item_5 between", value1, value2, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem5NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_5 not between", value1, value2, "contractItem5");
            return (Criteria) this;
        }

        public Criteria andContractItem6IsNull() {
            addCriterion("contract_item_6 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem6IsNotNull() {
            addCriterion("contract_item_6 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem6EqualTo(Integer value) {
            addCriterion("contract_item_6 =", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6NotEqualTo(Integer value) {
            addCriterion("contract_item_6 <>", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6GreaterThan(Integer value) {
            addCriterion("contract_item_6 >", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_6 >=", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6LessThan(Integer value) {
            addCriterion("contract_item_6 <", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_6 <=", value, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6In(List<Integer> values) {
            addCriterion("contract_item_6 in", values, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6NotIn(List<Integer> values) {
            addCriterion("contract_item_6 not in", values, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6Between(Integer value1, Integer value2) {
            addCriterion("contract_item_6 between", value1, value2, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem6NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_6 not between", value1, value2, "contractItem6");
            return (Criteria) this;
        }

        public Criteria andContractItem7IsNull() {
            addCriterion("contract_item_7 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem7IsNotNull() {
            addCriterion("contract_item_7 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem7EqualTo(Integer value) {
            addCriterion("contract_item_7 =", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7NotEqualTo(Integer value) {
            addCriterion("contract_item_7 <>", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7GreaterThan(Integer value) {
            addCriterion("contract_item_7 >", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_7 >=", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7LessThan(Integer value) {
            addCriterion("contract_item_7 <", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_7 <=", value, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7In(List<Integer> values) {
            addCriterion("contract_item_7 in", values, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7NotIn(List<Integer> values) {
            addCriterion("contract_item_7 not in", values, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7Between(Integer value1, Integer value2) {
            addCriterion("contract_item_7 between", value1, value2, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem7NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_7 not between", value1, value2, "contractItem7");
            return (Criteria) this;
        }

        public Criteria andContractItem8IsNull() {
            addCriterion("contract_item_8 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem8IsNotNull() {
            addCriterion("contract_item_8 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem8EqualTo(Integer value) {
            addCriterion("contract_item_8 =", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8NotEqualTo(Integer value) {
            addCriterion("contract_item_8 <>", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8GreaterThan(Integer value) {
            addCriterion("contract_item_8 >", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_8 >=", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8LessThan(Integer value) {
            addCriterion("contract_item_8 <", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_8 <=", value, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8In(List<Integer> values) {
            addCriterion("contract_item_8 in", values, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8NotIn(List<Integer> values) {
            addCriterion("contract_item_8 not in", values, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8Between(Integer value1, Integer value2) {
            addCriterion("contract_item_8 between", value1, value2, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem8NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_8 not between", value1, value2, "contractItem8");
            return (Criteria) this;
        }

        public Criteria andContractItem9IsNull() {
            addCriterion("contract_item_9 is null");
            return (Criteria) this;
        }

        public Criteria andContractItem9IsNotNull() {
            addCriterion("contract_item_9 is not null");
            return (Criteria) this;
        }

        public Criteria andContractItem9EqualTo(Integer value) {
            addCriterion("contract_item_9 =", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9NotEqualTo(Integer value) {
            addCriterion("contract_item_9 <>", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9GreaterThan(Integer value) {
            addCriterion("contract_item_9 >", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9GreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_item_9 >=", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9LessThan(Integer value) {
            addCriterion("contract_item_9 <", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9LessThanOrEqualTo(Integer value) {
            addCriterion("contract_item_9 <=", value, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9In(List<Integer> values) {
            addCriterion("contract_item_9 in", values, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9NotIn(List<Integer> values) {
            addCriterion("contract_item_9 not in", values, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9Between(Integer value1, Integer value2) {
            addCriterion("contract_item_9 between", value1, value2, "contractItem9");
            return (Criteria) this;
        }

        public Criteria andContractItem9NotBetween(Integer value1, Integer value2) {
            addCriterion("contract_item_9 not between", value1, value2, "contractItem9");
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

        public Criteria andEvaluateNumIsNull() {
            addCriterion("evaluate_num is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNotNull() {
            addCriterion("evaluate_num is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumEqualTo(Integer value) {
            addCriterion("evaluate_num =", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotEqualTo(Integer value) {
            addCriterion("evaluate_num <>", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThan(Integer value) {
            addCriterion("evaluate_num >", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num >=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThan(Integer value) {
            addCriterion("evaluate_num <", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num <=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIn(List<Integer> values) {
            addCriterion("evaluate_num in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotIn(List<Integer> values) {
            addCriterion("evaluate_num not in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num not between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateIsNull() {
            addCriterion("foreign_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateIsNotNull() {
            addCriterion("foreign_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateEqualTo(BigDecimal value) {
            addCriterion("foreign_tax_rate =", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("foreign_tax_rate <>", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateGreaterThan(BigDecimal value) {
            addCriterion("foreign_tax_rate >", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_tax_rate >=", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateLessThan(BigDecimal value) {
            addCriterion("foreign_tax_rate <", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_tax_rate <=", value, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateIn(List<BigDecimal> values) {
            addCriterion("foreign_tax_rate in", values, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("foreign_tax_rate not in", values, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_tax_rate between", value1, value2, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andForeignTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_tax_rate not between", value1, value2, "foreignTaxRate");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIsNull() {
            addCriterion("freight_template_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIsNotNull() {
            addCriterion("freight_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdEqualTo(Integer value) {
            addCriterion("freight_template_id =", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotEqualTo(Integer value) {
            addCriterion("freight_template_id <>", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThan(Integer value) {
            addCriterion("freight_template_id >", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_template_id >=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThan(Integer value) {
            addCriterion("freight_template_id <", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("freight_template_id <=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIn(List<Integer> values) {
            addCriterion("freight_template_id in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotIn(List<Integer> values) {
            addCriterion("freight_template_id not in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_id between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_id not between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeIsNull() {
            addCriterion("freight_volume is null");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeIsNotNull() {
            addCriterion("freight_volume is not null");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeEqualTo(BigDecimal value) {
            addCriterion("freight_volume =", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeNotEqualTo(BigDecimal value) {
            addCriterion("freight_volume <>", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeGreaterThan(BigDecimal value) {
            addCriterion("freight_volume >", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_volume >=", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeLessThan(BigDecimal value) {
            addCriterion("freight_volume <", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_volume <=", value, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeIn(List<BigDecimal> values) {
            addCriterion("freight_volume in", values, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeNotIn(List<BigDecimal> values) {
            addCriterion("freight_volume not in", values, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_volume between", value1, value2, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_volume not between", value1, value2, "freightVolume");
            return (Criteria) this;
        }

        public Criteria andFreightWeightIsNull() {
            addCriterion("freight_weight is null");
            return (Criteria) this;
        }

        public Criteria andFreightWeightIsNotNull() {
            addCriterion("freight_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightWeightEqualTo(BigDecimal value) {
            addCriterion("freight_weight =", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightNotEqualTo(BigDecimal value) {
            addCriterion("freight_weight <>", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightGreaterThan(BigDecimal value) {
            addCriterion("freight_weight >", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_weight >=", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightLessThan(BigDecimal value) {
            addCriterion("freight_weight <", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_weight <=", value, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightIn(List<BigDecimal> values) {
            addCriterion("freight_weight in", values, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightNotIn(List<BigDecimal> values) {
            addCriterion("freight_weight not in", values, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_weight between", value1, value2, "freightWeight");
            return (Criteria) this;
        }

        public Criteria andFreightWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_weight not between", value1, value2, "freightWeight");
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

        public Criteria andGoodsFavoriteIsNull() {
            addCriterion("goods_favorite is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteIsNotNull() {
            addCriterion("goods_favorite is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteEqualTo(Integer value) {
            addCriterion("goods_favorite =", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteNotEqualTo(Integer value) {
            addCriterion("goods_favorite <>", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteGreaterThan(Integer value) {
            addCriterion("goods_favorite >", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_favorite >=", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteLessThan(Integer value) {
            addCriterion("goods_favorite <", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteLessThanOrEqualTo(Integer value) {
            addCriterion("goods_favorite <=", value, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteIn(List<Integer> values) {
            addCriterion("goods_favorite in", values, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteNotIn(List<Integer> values) {
            addCriterion("goods_favorite not in", values, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteBetween(Integer value1, Integer value2) {
            addCriterion("goods_favorite between", value1, value2, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFavoriteNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_favorite not between", value1, value2, "goodsFavorite");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNull() {
            addCriterion("goods_freight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNotNull() {
            addCriterion("goods_freight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightEqualTo(BigDecimal value) {
            addCriterion("goods_freight =", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotEqualTo(BigDecimal value) {
            addCriterion("goods_freight <>", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThan(BigDecimal value) {
            addCriterion("goods_freight >", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight >=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThan(BigDecimal value) {
            addCriterion("goods_freight <", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight <=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIn(List<BigDecimal> values) {
            addCriterion("goods_freight in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotIn(List<BigDecimal> values) {
            addCriterion("goods_freight not in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight not between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsModalIsNull() {
            addCriterion("goods_modal is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModalIsNotNull() {
            addCriterion("goods_modal is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModalEqualTo(Integer value) {
            addCriterion("goods_modal =", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalNotEqualTo(Integer value) {
            addCriterion("goods_modal <>", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalGreaterThan(Integer value) {
            addCriterion("goods_modal >", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_modal >=", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalLessThan(Integer value) {
            addCriterion("goods_modal <", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalLessThanOrEqualTo(Integer value) {
            addCriterion("goods_modal <=", value, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalIn(List<Integer> values) {
            addCriterion("goods_modal in", values, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalNotIn(List<Integer> values) {
            addCriterion("goods_modal not in", values, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalBetween(Integer value1, Integer value2) {
            addCriterion("goods_modal between", value1, value2, "goodsModal");
            return (Criteria) this;
        }

        public Criteria andGoodsModalNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_modal not between", value1, value2, "goodsModal");
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

        public Criteria andGoodsRateIsNull() {
            addCriterion("goods_rate is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRateIsNotNull() {
            addCriterion("goods_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRateEqualTo(Integer value) {
            addCriterion("goods_rate =", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateNotEqualTo(Integer value) {
            addCriterion("goods_rate <>", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateGreaterThan(Integer value) {
            addCriterion("goods_rate >", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_rate >=", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateLessThan(Integer value) {
            addCriterion("goods_rate <", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_rate <=", value, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateIn(List<Integer> values) {
            addCriterion("goods_rate in", values, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateNotIn(List<Integer> values) {
            addCriterion("goods_rate not in", values, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateBetween(Integer value1, Integer value2) {
            addCriterion("goods_rate between", value1, value2, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsRateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_rate not between", value1, value2, "goodsRate");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNull() {
            addCriterion("goods_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNotNull() {
            addCriterion("goods_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumEqualTo(Integer value) {
            addCriterion("goods_sale_num =", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotEqualTo(Integer value) {
            addCriterion("goods_sale_num <>", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThan(Integer value) {
            addCriterion("goods_sale_num >", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num >=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThan(Integer value) {
            addCriterion("goods_sale_num <", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num <=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIn(List<Integer> values) {
            addCriterion("goods_sale_num in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotIn(List<Integer> values) {
            addCriterion("goods_sale_num not in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num not between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesIsNull() {
            addCriterion("goods_spec_names is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesIsNotNull() {
            addCriterion("goods_spec_names is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesEqualTo(String value) {
            addCriterion("goods_spec_names =", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesNotEqualTo(String value) {
            addCriterion("goods_spec_names <>", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesGreaterThan(String value) {
            addCriterion("goods_spec_names >", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec_names >=", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesLessThan(String value) {
            addCriterion("goods_spec_names <", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesLessThanOrEqualTo(String value) {
            addCriterion("goods_spec_names <=", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesLike(String value) {
            addCriterion("goods_spec_names like", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesNotLike(String value) {
            addCriterion("goods_spec_names not like", value, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesIn(List<String> values) {
            addCriterion("goods_spec_names in", values, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesNotIn(List<String> values) {
            addCriterion("goods_spec_names not in", values, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesBetween(String value1, String value2) {
            addCriterion("goods_spec_names between", value1, value2, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNamesNotBetween(String value1, String value2) {
            addCriterion("goods_spec_names not between", value1, value2, "goodsSpecNames");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Integer value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Integer value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Integer value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Integer value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Integer> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Integer> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIsNull() {
            addCriterion("goods_verify is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIsNotNull() {
            addCriterion("goods_verify is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyEqualTo(Integer value) {
            addCriterion("goods_verify =", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotEqualTo(Integer value) {
            addCriterion("goods_verify <>", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThan(Integer value) {
            addCriterion("goods_verify >", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_verify >=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThan(Integer value) {
            addCriterion("goods_verify <", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("goods_verify <=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIn(List<Integer> values) {
            addCriterion("goods_verify in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotIn(List<Integer> values) {
            addCriterion("goods_verify not in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyBetween(Integer value1, Integer value2) {
            addCriterion("goods_verify between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_verify not between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusIsNull() {
            addCriterion("goods_check_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusIsNotNull() {
            addCriterion("goods_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusEqualTo(Integer value) {
            addCriterion("goods_check_status =", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusNotEqualTo(Integer value) {
            addCriterion("goods_check_status <>", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusGreaterThan(Integer value) {
            addCriterion("goods_check_status >", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_check_status >=", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusLessThan(Integer value) {
            addCriterion("goods_check_status <", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_check_status <=", value, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusIn(List<Integer> values) {
            addCriterion("goods_check_status in", values, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusNotIn(List<Integer> values) {
            addCriterion("goods_check_status not in", values, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_check_status between", value1, value2, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_check_status not between", value1, value2, "goodsCheckStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedIsNull() {
            addCriterion("goods_check_refused is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedIsNotNull() {
            addCriterion("goods_check_refused is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedEqualTo(String value) {
            addCriterion("goods_check_refused =", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedNotEqualTo(String value) {
            addCriterion("goods_check_refused <>", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedGreaterThan(String value) {
            addCriterion("goods_check_refused >", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedGreaterThanOrEqualTo(String value) {
            addCriterion("goods_check_refused >=", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedLessThan(String value) {
            addCriterion("goods_check_refused <", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedLessThanOrEqualTo(String value) {
            addCriterion("goods_check_refused <=", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedLike(String value) {
            addCriterion("goods_check_refused like", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedNotLike(String value) {
            addCriterion("goods_check_refused not like", value, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedIn(List<String> values) {
            addCriterion("goods_check_refused in", values, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedNotIn(List<String> values) {
            addCriterion("goods_check_refused not in", values, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedBetween(String value1, String value2) {
            addCriterion("goods_check_refused between", value1, value2, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGoodsCheckRefusedNotBetween(String value1, String value2) {
            addCriterion("goods_check_refused not between", value1, value2, "goodsCheckRefused");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andIsCommendIsNull() {
            addCriterion("is_commend is null");
            return (Criteria) this;
        }

        public Criteria andIsCommendIsNotNull() {
            addCriterion("is_commend is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommendEqualTo(Integer value) {
            addCriterion("is_commend =", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendNotEqualTo(Integer value) {
            addCriterion("is_commend <>", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendGreaterThan(Integer value) {
            addCriterion("is_commend >", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_commend >=", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendLessThan(Integer value) {
            addCriterion("is_commend <", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendLessThanOrEqualTo(Integer value) {
            addCriterion("is_commend <=", value, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendIn(List<Integer> values) {
            addCriterion("is_commend in", values, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendNotIn(List<Integer> values) {
            addCriterion("is_commend not in", values, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendBetween(Integer value1, Integer value2) {
            addCriterion("is_commend between", value1, value2, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsCommendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_commend not between", value1, value2, "isCommend");
            return (Criteria) this;
        }

        public Criteria andIsDistributionIsNull() {
            addCriterion("is_distribution is null");
            return (Criteria) this;
        }

        public Criteria andIsDistributionIsNotNull() {
            addCriterion("is_distribution is not null");
            return (Criteria) this;
        }

        public Criteria andIsDistributionEqualTo(Integer value) {
            addCriterion("is_distribution =", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionNotEqualTo(Integer value) {
            addCriterion("is_distribution <>", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionGreaterThan(Integer value) {
            addCriterion("is_distribution >", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_distribution >=", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionLessThan(Integer value) {
            addCriterion("is_distribution <", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionLessThanOrEqualTo(Integer value) {
            addCriterion("is_distribution <=", value, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionIn(List<Integer> values) {
            addCriterion("is_distribution in", values, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionNotIn(List<Integer> values) {
            addCriterion("is_distribution not in", values, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionBetween(Integer value1, Integer value2) {
            addCriterion("is_distribution between", value1, value2, "isDistribution");
            return (Criteria) this;
        }

        public Criteria andIsDistributionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_distribution not between", value1, value2, "isDistribution");
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

        public Criteria andIsPointsGoodsIsNull() {
            addCriterion("is_points_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsIsNotNull() {
            addCriterion("is_points_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsEqualTo(Integer value) {
            addCriterion("is_points_goods =", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsNotEqualTo(Integer value) {
            addCriterion("is_points_goods <>", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsGreaterThan(Integer value) {
            addCriterion("is_points_goods >", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_points_goods >=", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsLessThan(Integer value) {
            addCriterion("is_points_goods <", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_points_goods <=", value, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsIn(List<Integer> values) {
            addCriterion("is_points_goods in", values, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsNotIn(List<Integer> values) {
            addCriterion("is_points_goods not in", values, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_points_goods between", value1, value2, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andIsPointsGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_points_goods not between", value1, value2, "isPointsGoods");
            return (Criteria) this;
        }

        public Criteria andJingleIsNull() {
            addCriterion("jingle is null");
            return (Criteria) this;
        }

        public Criteria andJingleIsNotNull() {
            addCriterion("jingle is not null");
            return (Criteria) this;
        }

        public Criteria andJingleEqualTo(String value) {
            addCriterion("jingle =", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotEqualTo(String value) {
            addCriterion("jingle <>", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleGreaterThan(String value) {
            addCriterion("jingle >", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleGreaterThanOrEqualTo(String value) {
            addCriterion("jingle >=", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLessThan(String value) {
            addCriterion("jingle <", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLessThanOrEqualTo(String value) {
            addCriterion("jingle <=", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLike(String value) {
            addCriterion("jingle like", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotLike(String value) {
            addCriterion("jingle not like", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleIn(List<String> values) {
            addCriterion("jingle in", values, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotIn(List<String> values) {
            addCriterion("jingle not in", values, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleBetween(String value1, String value2) {
            addCriterion("jingle between", value1, value2, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotBetween(String value1, String value2) {
            addCriterion("jingle not between", value1, value2, "jingle");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIsNull() {
            addCriterion("join_big_sale is null");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIsNotNull() {
            addCriterion("join_big_sale is not null");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleEqualTo(Integer value) {
            addCriterion("join_big_sale =", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotEqualTo(Integer value) {
            addCriterion("join_big_sale <>", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleGreaterThan(Integer value) {
            addCriterion("join_big_sale >", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_big_sale >=", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleLessThan(Integer value) {
            addCriterion("join_big_sale <", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleLessThanOrEqualTo(Integer value) {
            addCriterion("join_big_sale <=", value, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleIn(List<Integer> values) {
            addCriterion("join_big_sale in", values, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotIn(List<Integer> values) {
            addCriterion("join_big_sale not in", values, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleBetween(Integer value1, Integer value2) {
            addCriterion("join_big_sale between", value1, value2, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andJoinBigSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("join_big_sale not between", value1, value2, "joinBigSale");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateIsNull() {
            addCriterion("promotion_discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateIsNotNull() {
            addCriterion("promotion_discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateEqualTo(Double value) {
            addCriterion("promotion_discount_rate =", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateNotEqualTo(Double value) {
            addCriterion("promotion_discount_rate <>", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateGreaterThan(Double value) {
            addCriterion("promotion_discount_rate >", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateGreaterThanOrEqualTo(Double value) {
            addCriterion("promotion_discount_rate >=", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateLessThan(Double value) {
            addCriterion("promotion_discount_rate <", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateLessThanOrEqualTo(Double value) {
            addCriterion("promotion_discount_rate <=", value, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateIn(List<Double> values) {
            addCriterion("promotion_discount_rate in", values, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateNotIn(List<Double> values) {
            addCriterion("promotion_discount_rate not in", values, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateBetween(Double value1, Double value2) {
            addCriterion("promotion_discount_rate between", value1, value2, "promotionDiscountRate");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountRateNotBetween(Double value1, Double value2) {
            addCriterion("promotion_discount_rate not between", value1, value2, "promotionDiscountRate");
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

        public Criteria andSearchBoostIsNull() {
            addCriterion("search_boost is null");
            return (Criteria) this;
        }

        public Criteria andSearchBoostIsNotNull() {
            addCriterion("search_boost is not null");
            return (Criteria) this;
        }

        public Criteria andSearchBoostEqualTo(Integer value) {
            addCriterion("search_boost =", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostNotEqualTo(Integer value) {
            addCriterion("search_boost <>", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostGreaterThan(Integer value) {
            addCriterion("search_boost >", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_boost >=", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostLessThan(Integer value) {
            addCriterion("search_boost <", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostLessThanOrEqualTo(Integer value) {
            addCriterion("search_boost <=", value, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostIn(List<Integer> values) {
            addCriterion("search_boost in", values, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostNotIn(List<Integer> values) {
            addCriterion("search_boost not in", values, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostBetween(Integer value1, Integer value2) {
            addCriterion("search_boost between", value1, value2, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andSearchBoostNotBetween(Integer value1, Integer value2) {
            addCriterion("search_boost not between", value1, value2, "searchBoost");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIsNull() {
            addCriterion("state_remark is null");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIsNotNull() {
            addCriterion("state_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStateRemarkEqualTo(String value) {
            addCriterion("state_remark =", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotEqualTo(String value) {
            addCriterion("state_remark <>", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkGreaterThan(String value) {
            addCriterion("state_remark >", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("state_remark >=", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLessThan(String value) {
            addCriterion("state_remark <", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLessThanOrEqualTo(String value) {
            addCriterion("state_remark <=", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLike(String value) {
            addCriterion("state_remark like", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotLike(String value) {
            addCriterion("state_remark not like", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIn(List<String> values) {
            addCriterion("state_remark in", values, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotIn(List<String> values) {
            addCriterion("state_remark not in", values, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkBetween(String value1, String value2) {
            addCriterion("state_remark between", value1, value2, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotBetween(String value1, String value2) {
            addCriterion("state_remark not between", value1, value2, "stateRemark");
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

        public Criteria andVerifyRemarkIsNull() {
            addCriterion("verify_remark is null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNotNull() {
            addCriterion("verify_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkEqualTo(String value) {
            addCriterion("verify_remark =", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotEqualTo(String value) {
            addCriterion("verify_remark <>", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThan(String value) {
            addCriterion("verify_remark >", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("verify_remark >=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThan(String value) {
            addCriterion("verify_remark <", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThanOrEqualTo(String value) {
            addCriterion("verify_remark <=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLike(String value) {
            addCriterion("verify_remark like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotLike(String value) {
            addCriterion("verify_remark not like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIn(List<String> values) {
            addCriterion("verify_remark in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotIn(List<String> values) {
            addCriterion("verify_remark not in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkBetween(String value1, String value2) {
            addCriterion("verify_remark between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotBetween(String value1, String value2) {
            addCriterion("verify_remark not between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIsNull() {
            addCriterion("virtual_overdue_refund is null");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIsNotNull() {
            addCriterion("virtual_overdue_refund is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund =", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund <>", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundGreaterThan(Integer value) {
            addCriterion("virtual_overdue_refund >", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund >=", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundLessThan(Integer value) {
            addCriterion("virtual_overdue_refund <", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_overdue_refund <=", value, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundIn(List<Integer> values) {
            addCriterion("virtual_overdue_refund in", values, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotIn(List<Integer> values) {
            addCriterion("virtual_overdue_refund not in", values, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundBetween(Integer value1, Integer value2) {
            addCriterion("virtual_overdue_refund between", value1, value2, "virtualOverdueRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualOverdueRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_overdue_refund not between", value1, value2, "virtualOverdueRefund");
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

        public Criteria andBuyLimitIsNull() {
            addCriterion("buy_limit is null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIsNotNull() {
            addCriterion("buy_limit is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitEqualTo(Integer value) {
            addCriterion("buy_limit =", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotEqualTo(Integer value) {
            addCriterion("buy_limit <>", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThan(Integer value) {
            addCriterion("buy_limit >", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_limit >=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThan(Integer value) {
            addCriterion("buy_limit <", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThanOrEqualTo(Integer value) {
            addCriterion("buy_limit <=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIn(List<Integer> values) {
            addCriterion("buy_limit in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotIn(List<Integer> values) {
            addCriterion("buy_limit not in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit between", value1, value2, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit not between", value1, value2, "buyLimit");
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

        public Criteria andDwInvoiceIsNull() {
            addCriterion("dw_invoice is null");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceIsNotNull() {
            addCriterion("dw_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceEqualTo(Integer value) {
            addCriterion("dw_invoice =", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceNotEqualTo(Integer value) {
            addCriterion("dw_invoice <>", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceGreaterThan(Integer value) {
            addCriterion("dw_invoice >", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_invoice >=", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceLessThan(Integer value) {
            addCriterion("dw_invoice <", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("dw_invoice <=", value, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceIn(List<Integer> values) {
            addCriterion("dw_invoice in", values, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceNotIn(List<Integer> values) {
            addCriterion("dw_invoice not in", values, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("dw_invoice between", value1, value2, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andDwInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_invoice not between", value1, value2, "dwInvoice");
            return (Criteria) this;
        }

        public Criteria andSevenRefundIsNull() {
            addCriterion("seven_refund is null");
            return (Criteria) this;
        }

        public Criteria andSevenRefundIsNotNull() {
            addCriterion("seven_refund is not null");
            return (Criteria) this;
        }

        public Criteria andSevenRefundEqualTo(Integer value) {
            addCriterion("seven_refund =", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundNotEqualTo(Integer value) {
            addCriterion("seven_refund <>", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundGreaterThan(Integer value) {
            addCriterion("seven_refund >", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("seven_refund >=", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundLessThan(Integer value) {
            addCriterion("seven_refund <", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundLessThanOrEqualTo(Integer value) {
            addCriterion("seven_refund <=", value, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundIn(List<Integer> values) {
            addCriterion("seven_refund in", values, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundNotIn(List<Integer> values) {
            addCriterion("seven_refund not in", values, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundBetween(Integer value1, Integer value2) {
            addCriterion("seven_refund between", value1, value2, "sevenRefund");
            return (Criteria) this;
        }

        public Criteria andSevenRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("seven_refund not between", value1, value2, "sevenRefund");
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

        public Criteria andIsStoreUpIsNull() {
            addCriterion("is_store_up is null");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpIsNotNull() {
            addCriterion("is_store_up is not null");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpEqualTo(Integer value) {
            addCriterion("is_store_up =", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotEqualTo(Integer value) {
            addCriterion("is_store_up <>", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpGreaterThan(Integer value) {
            addCriterion("is_store_up >", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_store_up >=", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpLessThan(Integer value) {
            addCriterion("is_store_up <", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpLessThanOrEqualTo(Integer value) {
            addCriterion("is_store_up <=", value, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpIn(List<Integer> values) {
            addCriterion("is_store_up in", values, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotIn(List<Integer> values) {
            addCriterion("is_store_up not in", values, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpBetween(Integer value1, Integer value2) {
            addCriterion("is_store_up between", value1, value2, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andIsStoreUpNotBetween(Integer value1, Integer value2) {
            addCriterion("is_store_up not between", value1, value2, "isStoreUp");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Integer value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Integer value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Integer value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Integer value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Integer value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Integer> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Integer> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdIsNull() {
            addCriterion("parent_common_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdIsNotNull() {
            addCriterion("parent_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdEqualTo(Integer value) {
            addCriterion("parent_common_id =", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdNotEqualTo(Integer value) {
            addCriterion("parent_common_id <>", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdGreaterThan(Integer value) {
            addCriterion("parent_common_id >", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_common_id >=", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdLessThan(Integer value) {
            addCriterion("parent_common_id <", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_common_id <=", value, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdIn(List<Integer> values) {
            addCriterion("parent_common_id in", values, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdNotIn(List<Integer> values) {
            addCriterion("parent_common_id not in", values, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_common_id between", value1, value2, "parentCommonId");
            return (Criteria) this;
        }

        public Criteria andParentCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_common_id not between", value1, value2, "parentCommonId");
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